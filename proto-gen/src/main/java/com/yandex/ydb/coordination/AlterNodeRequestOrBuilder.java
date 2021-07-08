// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kikimr/public/api/protos/ydb_coordination.proto

package com.yandex.ydb.coordination;

public interface AlterNodeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ydb.Coordination.AlterNodeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string path = 1;</code>
   * @return The path.
   */
  java.lang.String getPath();
  /**
   * <code>string path = 1;</code>
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString
      getPathBytes();

  /**
   * <code>.Ydb.Coordination.Config config = 2;</code>
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   * <code>.Ydb.Coordination.Config config = 2;</code>
   * @return The config.
   */
  com.yandex.ydb.coordination.Config getConfig();
  /**
   * <code>.Ydb.Coordination.Config config = 2;</code>
   */
  com.yandex.ydb.coordination.ConfigOrBuilder getConfigOrBuilder();

  /**
   * <code>.Ydb.Operations.OperationParams operation_params = 3;</code>
   * @return Whether the operationParams field is set.
   */
  boolean hasOperationParams();
  /**
   * <code>.Ydb.Operations.OperationParams operation_params = 3;</code>
   * @return The operationParams.
   */
  com.yandex.ydb.OperationProtos.OperationParams getOperationParams();
  /**
   * <code>.Ydb.Operations.OperationParams operation_params = 3;</code>
   */
  com.yandex.ydb.OperationProtos.OperationParamsOrBuilder getOperationParamsOrBuilder();
}
