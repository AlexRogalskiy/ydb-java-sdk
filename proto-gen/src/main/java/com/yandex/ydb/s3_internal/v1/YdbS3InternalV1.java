// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kikimr/public/api/grpc/draft/ydb_s3_internal_v1.proto

package com.yandex.ydb.s3_internal.v1;

public final class YdbS3InternalV1 {
  private YdbS3InternalV1() {}
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
      "\n5kikimr/public/api/grpc/draft/ydb_s3_in" +
      "ternal_v1.proto\022\021Ydb.S3Internal.V1\032.kiki" +
      "mr/public/api/protos/ydb_s3_internal.pro" +
      "to2e\n\021S3InternalService\022P\n\tS3Listing\022 .Y" +
      "db.S3Internal.S3ListingRequest\032!.Ydb.S3I" +
      "nternal.S3ListingResponseB\037\n\035com.yandex." +
      "ydb.s3_internal.v1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.yandex.ydb.s3_internal.S3InternalProtos.getDescriptor(),
        });
    com.yandex.ydb.s3_internal.S3InternalProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
