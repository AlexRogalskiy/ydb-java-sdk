// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ydb/public/api/protos/ydb_coordination.proto

package com.yandex.ydb.coordination;

public interface DescribeNodeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ydb.Coordination.DescribeNodeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Ydb.Operations.Operation operation = 1;</code>
   * @return Whether the operation field is set.
   */
  boolean hasOperation();
  /**
   * <code>.Ydb.Operations.Operation operation = 1;</code>
   * @return The operation.
   */
  com.yandex.ydb.OperationProtos.Operation getOperation();
  /**
   * <code>.Ydb.Operations.Operation operation = 1;</code>
   */
  com.yandex.ydb.OperationProtos.OperationOrBuilder getOperationOrBuilder();
}
