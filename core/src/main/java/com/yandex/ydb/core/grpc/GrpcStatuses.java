package com.yandex.ydb.core.grpc;

import com.yandex.ydb.core.Issue;
import com.yandex.ydb.core.Result;
import com.yandex.ydb.core.StatusCode;
import io.grpc.Status;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Sergey Polovko
 */
public final class GrpcStatuses {

    private static final Logger logger = LoggerFactory.getLogger(GrpcStatuses.class);

    private GrpcStatuses() {}

    public static <T> Result<T> toResult(Status status) {
        assert !status.isOk();
        String message = getMessage(status);

        Throwable cause = status.getCause();
        if (cause != null && status.getCode() == Status.Code.INTERNAL) {
            return Result.error(message, cause);
        }

        StatusCode code = getStatusCode(status.getCode());
        return Result.fail(code, Issue.of(message, Issue.Severity.ERROR));
    }

    public static com.yandex.ydb.core.Status toStatus(Status status) {
        if (status.isOk()) {
            return com.yandex.ydb.core.Status.SUCCESS;
        }
        String message = getMessage(status);
        StatusCode code = getStatusCode(status.getCode());
        return com.yandex.ydb.core.Status.of(code, Issue.of(message, Issue.Severity.ERROR));
    }

    private static String getMessage(Status status) {
        logger.warn("gRPC issue", status.asException());
        String message = "gRPC error: (" + status.getCode() + ')';
        return status.getDescription() == null
            ? message
            : message + ' ' + status.getDescription();
    }

    private static StatusCode getStatusCode(Status.Code code) {
        switch (code) {
            case UNAVAILABLE: return StatusCode.TRANSPORT_UNAVAILABLE;
            case UNAUTHENTICATED: return StatusCode.CLIENT_UNAUTHENTICATED;
            case CANCELLED: return StatusCode.CLIENT_CANCELLED;
            case UNIMPLEMENTED: return StatusCode.CLIENT_CALL_UNIMPLEMENTED;
            case DEADLINE_EXCEEDED: return StatusCode.CLIENT_DEADLINE_EXCEEDED;
            case RESOURCE_EXHAUSTED: return StatusCode.CLIENT_RESOURCE_EXHAUSTED;
            default:
                return StatusCode.CLIENT_INTERNAL_ERROR;
        }
    }
}
