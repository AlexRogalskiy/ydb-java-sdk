// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ydb/public/api/grpc/ydb_scripting_v1.proto

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
      "\n*ydb/public/api/grpc/ydb_scripting_v1.p" +
      "roto\022\020Ydb.Scripting.V1\032)ydb/public/api/p" +
      "rotos/ydb_scripting.proto2\232\002\n\020ScriptingS" +
      "ervice\022Q\n\nExecuteYql\022 .Ydb.Scripting.Exe" +
      "cuteYqlRequest\032!.Ydb.Scripting.ExecuteYq" +
      "lResponse\022`\n\020StreamExecuteYql\022 .Ydb.Scri" +
      "pting.ExecuteYqlRequest\032(.Ydb.Scripting." +
      "ExecuteYqlPartialResponse0\001\022Q\n\nExplainYq" +
      "l\022 .Ydb.Scripting.ExplainYqlRequest\032!.Yd" +
      "b.Scripting.ExplainYqlResponseB\035\n\033com.ya" +
      "ndex.ydb.scripting.v1b\006proto3"
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
