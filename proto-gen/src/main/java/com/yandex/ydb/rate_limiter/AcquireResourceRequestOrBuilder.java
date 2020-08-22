// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kikimr/public/api/protos/ydb_rate_limiter.proto

package com.yandex.ydb.rate_limiter;

public interface AcquireResourceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ydb.RateLimiter.AcquireResourceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Ydb.Operations.OperationParams operation_params = 1;</code>
   */
  boolean hasOperationParams();
  /**
   * <code>.Ydb.Operations.OperationParams operation_params = 1;</code>
   */
  com.yandex.ydb.OperationProtos.OperationParams getOperationParams();
  /**
   * <code>.Ydb.Operations.OperationParams operation_params = 1;</code>
   */
  com.yandex.ydb.OperationProtos.OperationParamsOrBuilder getOperationParamsOrBuilder();

  /**
   * <pre>
   * Path of a coordination node.
   * </pre>
   *
   * <code>string coordination_node_path = 2;</code>
   */
  java.lang.String getCoordinationNodePath();
  /**
   * <pre>
   * Path of a coordination node.
   * </pre>
   *
   * <code>string coordination_node_path = 2;</code>
   */
  com.google.protobuf.ByteString
      getCoordinationNodePathBytes();

  /**
   * <pre>
   * Path of resource inside a coordination node.
   * </pre>
   *
   * <code>string resource_path = 3;</code>
   */
  java.lang.String getResourcePath();
  /**
   * <pre>
   * Path of resource inside a coordination node.
   * </pre>
   *
   * <code>string resource_path = 3;</code>
   */
  com.google.protobuf.ByteString
      getResourcePathBytes();

  /**
   * <pre>
   * Request resource's units for usage.
   * </pre>
   *
   * <code>uint64 required = 4;</code>
   */
  long getRequired();

  /**
   * <pre>
   * Actually used resource's units by client.
   * </pre>
   *
   * <code>uint64 used = 5;</code>
   */
  long getUsed();

  public com.yandex.ydb.rate_limiter.AcquireResourceRequest.UnitsCase getUnitsCase();
}
