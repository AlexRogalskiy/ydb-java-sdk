// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ydb/public/api/grpc/draft/ydb_experimental_v1.proto

package com.yandex.ydb.experimental.v1;

public final class YdbExperimentalV1 {
  private YdbExperimentalV1() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3ydb/public/api/grpc/draft/ydb_experime" +
      "ntal_v1.proto\022\023Ydb.Experimental.V1\032,ydb/" +
      "public/api/protos/ydb_experimental.proto" +
      "2\210\001\n\023ExperimentalService\022q\n\022ExecuteStrea" +
      "mQuery\022+.Ydb.Experimental.ExecuteStreamQ" +
      "ueryRequest\032,.Ydb.Experimental.ExecuteSt" +
      "reamQueryResponse0\001B \n\036com.yandex.ydb.ex" +
      "perimental.v1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.yandex.ydb.experimental.ExperimentalProtos.getDescriptor(),
        });
    com.yandex.ydb.experimental.ExperimentalProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
