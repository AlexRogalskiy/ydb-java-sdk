// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ydb/public/api/protos/ydb_rate_limiter.proto

package com.yandex.ydb.rate_limiter;

public interface DescribeResourceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ydb.RateLimiter.DescribeResourceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Ydb.Operations.OperationParams operation_params = 1;</code>
   * @return Whether the operationParams field is set.
   */
  boolean hasOperationParams();
  /**
   * <code>.Ydb.Operations.OperationParams operation_params = 1;</code>
   * @return The operationParams.
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
   * @return The coordinationNodePath.
   */
  java.lang.String getCoordinationNodePath();
  /**
   * <pre>
   * Path of a coordination node.
   * </pre>
   *
   * <code>string coordination_node_path = 2;</code>
   * @return The bytes for coordinationNodePath.
   */
  com.google.protobuf.ByteString
      getCoordinationNodePathBytes();

  /**
   * <pre>
   * Path of resource inside a coordination node.
   * </pre>
   *
   * <code>string resource_path = 3;</code>
   * @return The resourcePath.
   */
  java.lang.String getResourcePath();
  /**
   * <pre>
   * Path of resource inside a coordination node.
   * </pre>
   *
   * <code>string resource_path = 3;</code>
   * @return The bytes for resourcePath.
   */
  com.google.protobuf.ByteString
      getResourcePathBytes();
}
