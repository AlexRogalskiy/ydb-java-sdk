// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kikimr/public/api/grpc/ydb_scripting_v1.proto

package com.yandex.ydb.scripting.v1;

public final class YdbScriptingV1 {
  private YdbScriptingV1() {}
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
      "\n-kikimr/public/api/grpc/ydb_scripting_v" +
      "1.proto\022\020Ydb.Scripting.V1\032,kikimr/public" +
      "/api/protos/ydb_scripting.proto2\232\002\n\020Scri" +
      "ptingService\022Q\n\nExecuteYql\022 .Ydb.Scripti" +
      "ng.ExecuteYqlRequest\032!.Ydb.Scripting.Exe" +
      "cuteYqlResponse\022`\n\020StreamExecuteYql\022 .Yd" +
      "b.Scripting.ExecuteYqlRequest\032(.Ydb.Scri" +
      "pting.ExecuteYqlPartialResponse0\001\022Q\n\nExp" +
      "lainYql\022 .Ydb.Scripting.ExplainYqlReques" +
      "t\032!.Ydb.Scripting.ExplainYqlResponseB\035\n\033" +
      "com.yandex.ydb.scripting.v1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.yandex.ydb.scripting.ScriptingProtos.getDescriptor(),
        });
    com.yandex.ydb.scripting.ScriptingProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
