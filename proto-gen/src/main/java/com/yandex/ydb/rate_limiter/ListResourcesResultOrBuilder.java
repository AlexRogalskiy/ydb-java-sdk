// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ydb/public/api/protos/ydb_rate_limiter.proto

package com.yandex.ydb.rate_limiter;

public interface ListResourcesResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ydb.RateLimiter.ListResourcesResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string resource_paths = 1;</code>
   * @return A list containing the resourcePaths.
   */
  java.util.List<java.lang.String>
      getResourcePathsList();
  /**
   * <code>repeated string resource_paths = 1;</code>
   * @return The count of resourcePaths.
   */
  int getResourcePathsCount();
  /**
   * <code>repeated string resource_paths = 1;</code>
   * @param index The index of the element to return.
   * @return The resourcePaths at the given index.
   */
  java.lang.String getResourcePaths(int index);
  /**
   * <code>repeated string resource_paths = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the resourcePaths at the given index.
   */
  com.google.protobuf.ByteString
      getResourcePathsBytes(int index);
}
