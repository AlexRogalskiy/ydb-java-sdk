// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ydb/public/api/grpc/ydb_monitoring_v1.proto

package com.yandex.ydb.monitoring.v1;

public final class YdbMonitoringV1 {
  private YdbMonitoringV1() {}
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
      "\n+ydb/public/api/grpc/ydb_monitoring_v1." +
      "proto\022\021Ydb.Monitoring.V1\032*ydb/public/api" +
      "/protos/ydb_monitoring.proto2e\n\021Monitori" +
      "ngService\022P\n\tSelfCheck\022 .Ydb.Monitoring." +
      "SelfCheckRequest\032!.Ydb.Monitoring.SelfCh" +
      "eckResponseB\036\n\034com.yandex.ydb.monitoring" +
      ".v1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.yandex.ydb.monitoring.MonitoringProtos.getDescriptor(),
        });
    com.yandex.ydb.monitoring.MonitoringProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
