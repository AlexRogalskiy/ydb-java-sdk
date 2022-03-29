// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ydb/public/api/protos/ydb_coordination.proto

package com.yandex.ydb.coordination;

public interface SemaphoreDescriptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ydb.Coordination.SemaphoreDescription)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the semaphore
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the semaphore
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * User-defined data attached to the semaphore
   * </pre>
   *
   * <code>bytes data = 2;</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();

  /**
   * <pre>
   * Number of tokens currently acquired by owners
   * </pre>
   *
   * <code>uint64 count = 7;</code>
   * @return The count.
   */
  long getCount();

  /**
   * <pre>
   * Maximum number of tokens that may acquired
   * </pre>
   *
   * <code>uint64 limit = 3;</code>
   * @return The limit.
   */
  long getLimit();

  /**
   * <pre>
   * Ephemeral semaphores are deleted when released by all owners and waiters
   * </pre>
   *
   * <code>bool ephemeral = 4;</code>
   * @return The ephemeral.
   */
  boolean getEphemeral();

  /**
   * <pre>
   * A list of current owners of the semaphore
   * </pre>
   *
   * <code>repeated .Ydb.Coordination.SemaphoreSession owners = 5;</code>
   */
  java.util.List<com.yandex.ydb.coordination.SemaphoreSession> 
      getOwnersList();
  /**
   * <pre>
   * A list of current owners of the semaphore
   * </pre>
   *
   * <code>repeated .Ydb.Coordination.SemaphoreSession owners = 5;</code>
   */
  com.yandex.ydb.coordination.SemaphoreSession getOwners(int index);
  /**
   * <pre>
   * A list of current owners of the semaphore
   * </pre>
   *
   * <code>repeated .Ydb.Coordination.SemaphoreSession owners = 5;</code>
   */
  int getOwnersCount();
  /**
   * <pre>
   * A list of current owners of the semaphore
   * </pre>
   *
   * <code>repeated .Ydb.Coordination.SemaphoreSession owners = 5;</code>
   */
  java.util.List<? extends com.yandex.ydb.coordination.SemaphoreSessionOrBuilder> 
      getOwnersOrBuilderList();
  /**
   * <pre>
   * A list of current owners of the semaphore
   * </pre>
   *
   * <code>repeated .Ydb.Coordination.SemaphoreSession owners = 5;</code>
   */
  com.yandex.ydb.coordination.SemaphoreSessionOrBuilder getOwnersOrBuilder(
      int index);

  /**
   * <pre>
   * A list of current waiters on the semaphore
   * </pre>
   *
   * <code>repeated .Ydb.Coordination.SemaphoreSession waiters = 6;</code>
   */
  java.util.List<com.yandex.ydb.coordination.SemaphoreSession> 
      getWaitersList();
  /**
   * <pre>
   * A list of current waiters on the semaphore
   * </pre>
   *
   * <code>repeated .Ydb.Coordination.SemaphoreSession waiters = 6;</code>
   */
  com.yandex.ydb.coordination.SemaphoreSession getWaiters(int index);
  /**
   * <pre>
   * A list of current waiters on the semaphore
   * </pre>
   *
   * <code>repeated .Ydb.Coordination.SemaphoreSession waiters = 6;</code>
   */
  int getWaitersCount();
  /**
   * <pre>
   * A list of current waiters on the semaphore
   * </pre>
   *
   * <code>repeated .Ydb.Coordination.SemaphoreSession waiters = 6;</code>
   */
  java.util.List<? extends com.yandex.ydb.coordination.SemaphoreSessionOrBuilder> 
      getWaitersOrBuilderList();
  /**
   * <pre>
   * A list of current waiters on the semaphore
   * </pre>
   *
   * <code>repeated .Ydb.Coordination.SemaphoreSession waiters = 6;</code>
   */
  com.yandex.ydb.coordination.SemaphoreSessionOrBuilder getWaitersOrBuilder(
      int index);
}
