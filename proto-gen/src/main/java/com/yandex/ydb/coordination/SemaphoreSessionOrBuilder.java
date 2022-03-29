// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ydb/public/api/protos/ydb_coordination.proto

package com.yandex.ydb.coordination;

public interface SemaphoreSessionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ydb.Coordination.SemaphoreSession)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A monotonically increasing id which determines locking order
   * </pre>
   *
   * <code>uint64 order_id = 5;</code>
   * @return The orderId.
   */
  long getOrderId();

  /**
   * <pre>
   * An id of the session which tried to acquire the semaphore
   * </pre>
   *
   * <code>uint64 session_id = 1;</code>
   * @return The sessionId.
   */
  long getSessionId();

  /**
   * <pre>
   * A timeout in milliseconds for operation in waiters queue
   * </pre>
   *
   * <code>uint64 timeout_millis = 2;</code>
   * @return The timeoutMillis.
   */
  long getTimeoutMillis();

  /**
   * <pre>
   * Number of tokens for an acquire operation
   * </pre>
   *
   * <code>uint64 count = 3;</code>
   * @return The count.
   */
  long getCount();

  /**
   * <pre>
   * User-defined data attached to the acquire operation
   * </pre>
   *
   * <code>bytes data = 4;</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();
}
