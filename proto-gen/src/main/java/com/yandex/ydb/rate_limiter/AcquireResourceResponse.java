// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ydb/public/api/protos/ydb_rate_limiter.proto

package com.yandex.ydb.rate_limiter;

/**
 * Protobuf type {@code Ydb.RateLimiter.AcquireResourceResponse}
 */
public final class AcquireResourceResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Ydb.RateLimiter.AcquireResourceResponse)
    AcquireResourceResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AcquireResourceResponse.newBuilder() to construct.
  private AcquireResourceResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AcquireResourceResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AcquireResourceResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AcquireResourceResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.yandex.ydb.OperationProtos.Operation.Builder subBuilder = null;
            if (operation_ != null) {
              subBuilder = operation_.toBuilder();
            }
            operation_ = input.readMessage(com.yandex.ydb.OperationProtos.Operation.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(operation_);
              operation_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.yandex.ydb.rate_limiter.RateLimiterProtos.internal_static_Ydb_RateLimiter_AcquireResourceResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.yandex.ydb.rate_limiter.RateLimiterProtos.internal_static_Ydb_RateLimiter_AcquireResourceResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.yandex.ydb.rate_limiter.AcquireResourceResponse.class, com.yandex.ydb.rate_limiter.AcquireResourceResponse.Builder.class);
  }

  public static final int OPERATION_FIELD_NUMBER = 1;
  private com.yandex.ydb.OperationProtos.Operation operation_;
  /**
   * <pre>
   * Holds AcquireResourceResult in case of successful call.
   * </pre>
   *
   * <code>.Ydb.Operations.Operation operation = 1;</code>
   * @return Whether the operation field is set.
   */
  @java.lang.Override
  public boolean hasOperation() {
    return operation_ != null;
  }
  /**
   * <pre>
   * Holds AcquireResourceResult in case of successful call.
   * </pre>
   *
   * <code>.Ydb.Operations.Operation operation = 1;</code>
   * @return The operation.
   */
  @java.lang.Override
  public com.yandex.ydb.OperationProtos.Operation getOperation() {
    return operation_ == null ? com.yandex.ydb.OperationProtos.Operation.getDefaultInstance() : operation_;
  }
  /**
   * <pre>
   * Holds AcquireResourceResult in case of successful call.
   * </pre>
   *
   * <code>.Ydb.Operations.Operation operation = 1;</code>
   */
  @java.lang.Override
  public com.yandex.ydb.OperationProtos.OperationOrBuilder getOperationOrBuilder() {
    return getOperation();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (operation_ != null) {
      output.writeMessage(1, getOperation());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (operation_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getOperation());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.yandex.ydb.rate_limiter.AcquireResourceResponse)) {
      return super.equals(obj);
    }
    com.yandex.ydb.rate_limiter.AcquireResourceResponse other = (com.yandex.ydb.rate_limiter.AcquireResourceResponse) obj;

    if (hasOperation() != other.hasOperation()) return false;
    if (hasOperation()) {
      if (!getOperation()
          .equals(other.getOperation())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasOperation()) {
      hash = (37 * hash) + OPERATION_FIELD_NUMBER;
      hash = (53 * hash) + getOperation().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.yandex.ydb.rate_limiter.AcquireResourceResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.yandex.ydb.rate_limiter.AcquireResourceResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.yandex.ydb.rate_limiter.AcquireResourceResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.yandex.ydb.rate_limiter.AcquireResourceResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.yandex.ydb.rate_limiter.AcquireResourceResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.yandex.ydb.rate_limiter.AcquireResourceResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.yandex.ydb.rate_limiter.AcquireResourceResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.yandex.ydb.rate_limiter.AcquireResourceResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.yandex.ydb.rate_limiter.AcquireResourceResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.yandex.ydb.rate_limiter.AcquireResourceResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.yandex.ydb.rate_limiter.AcquireResourceResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.yandex.ydb.rate_limiter.AcquireResourceResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.yandex.ydb.rate_limiter.AcquireResourceResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Ydb.RateLimiter.AcquireResourceResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Ydb.RateLimiter.AcquireResourceResponse)
      com.yandex.ydb.rate_limiter.AcquireResourceResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.yandex.ydb.rate_limiter.RateLimiterProtos.internal_static_Ydb_RateLimiter_AcquireResourceResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.yandex.ydb.rate_limiter.RateLimiterProtos.internal_static_Ydb_RateLimiter_AcquireResourceResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.yandex.ydb.rate_limiter.AcquireResourceResponse.class, com.yandex.ydb.rate_limiter.AcquireResourceResponse.Builder.class);
    }

    // Construct using com.yandex.ydb.rate_limiter.AcquireResourceResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (operationBuilder_ == null) {
        operation_ = null;
      } else {
        operation_ = null;
        operationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.yandex.ydb.rate_limiter.RateLimiterProtos.internal_static_Ydb_RateLimiter_AcquireResourceResponse_descriptor;
    }

    @java.lang.Override
    public com.yandex.ydb.rate_limiter.AcquireResourceResponse getDefaultInstanceForType() {
      return com.yandex.ydb.rate_limiter.AcquireResourceResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.yandex.ydb.rate_limiter.AcquireResourceResponse build() {
      com.yandex.ydb.rate_limiter.AcquireResourceResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.yandex.ydb.rate_limiter.AcquireResourceResponse buildPartial() {
      com.yandex.ydb.rate_limiter.AcquireResourceResponse result = new com.yandex.ydb.rate_limiter.AcquireResourceResponse(this);
      if (operationBuilder_ == null) {
        result.operation_ = operation_;
      } else {
        result.operation_ = operationBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.yandex.ydb.rate_limiter.AcquireResourceResponse) {
        return mergeFrom((com.yandex.ydb.rate_limiter.AcquireResourceResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.yandex.ydb.rate_limiter.AcquireResourceResponse other) {
      if (other == com.yandex.ydb.rate_limiter.AcquireResourceResponse.getDefaultInstance()) return this;
      if (other.hasOperation()) {
        mergeOperation(other.getOperation());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.yandex.ydb.rate_limiter.AcquireResourceResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.yandex.ydb.rate_limiter.AcquireResourceResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.yandex.ydb.OperationProtos.Operation operation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.yandex.ydb.OperationProtos.Operation, com.yandex.ydb.OperationProtos.Operation.Builder, com.yandex.ydb.OperationProtos.OperationOrBuilder> operationBuilder_;
    /**
     * <pre>
     * Holds AcquireResourceResult in case of successful call.
     * </pre>
     *
     * <code>.Ydb.Operations.Operation operation = 1;</code>
     * @return Whether the operation field is set.
     */
    public boolean hasOperation() {
      return operationBuilder_ != null || operation_ != null;
    }
    /**
     * <pre>
     * Holds AcquireResourceResult in case of successful call.
     * </pre>
     *
     * <code>.Ydb.Operations.Operation operation = 1;</code>
     * @return The operation.
     */
    public com.yandex.ydb.OperationProtos.Operation getOperation() {
      if (operationBuilder_ == null) {
        return operation_ == null ? com.yandex.ydb.OperationProtos.Operation.getDefaultInstance() : operation_;
      } else {
        return operationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Holds AcquireResourceResult in case of successful call.
     * </pre>
     *
     * <code>.Ydb.Operations.Operation operation = 1;</code>
     */
    public Builder setOperation(com.yandex.ydb.OperationProtos.Operation value) {
      if (operationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        operation_ = value;
        onChanged();
      } else {
        operationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Holds AcquireResourceResult in case of successful call.
     * </pre>
     *
     * <code>.Ydb.Operations.Operation operation = 1;</code>
     */
    public Builder setOperation(
        com.yandex.ydb.OperationProtos.Operation.Builder builderForValue) {
      if (operationBuilder_ == null) {
        operation_ = builderForValue.build();
        onChanged();
      } else {
        operationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Holds AcquireResourceResult in case of successful call.
     * </pre>
     *
     * <code>.Ydb.Operations.Operation operation = 1;</code>
     */
    public Builder mergeOperation(com.yandex.ydb.OperationProtos.Operation value) {
      if (operationBuilder_ == null) {
        if (operation_ != null) {
          operation_ =
            com.yandex.ydb.OperationProtos.Operation.newBuilder(operation_).mergeFrom(value).buildPartial();
        } else {
          operation_ = value;
        }
        onChanged();
      } else {
        operationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Holds AcquireResourceResult in case of successful call.
     * </pre>
     *
     * <code>.Ydb.Operations.Operation operation = 1;</code>
     */
    public Builder clearOperation() {
      if (operationBuilder_ == null) {
        operation_ = null;
        onChanged();
      } else {
        operation_ = null;
        operationBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Holds AcquireResourceResult in case of successful call.
     * </pre>
     *
     * <code>.Ydb.Operations.Operation operation = 1;</code>
     */
    public com.yandex.ydb.OperationProtos.Operation.Builder getOperationBuilder() {
      
      onChanged();
      return getOperationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Holds AcquireResourceResult in case of successful call.
     * </pre>
     *
     * <code>.Ydb.Operations.Operation operation = 1;</code>
     */
    public com.yandex.ydb.OperationProtos.OperationOrBuilder getOperationOrBuilder() {
      if (operationBuilder_ != null) {
        return operationBuilder_.getMessageOrBuilder();
      } else {
        return operation_ == null ?
            com.yandex.ydb.OperationProtos.Operation.getDefaultInstance() : operation_;
      }
    }
    /**
     * <pre>
     * Holds AcquireResourceResult in case of successful call.
     * </pre>
     *
     * <code>.Ydb.Operations.Operation operation = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.yandex.ydb.OperationProtos.Operation, com.yandex.ydb.OperationProtos.Operation.Builder, com.yandex.ydb.OperationProtos.OperationOrBuilder> 
        getOperationFieldBuilder() {
      if (operationBuilder_ == null) {
        operationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.yandex.ydb.OperationProtos.Operation, com.yandex.ydb.OperationProtos.Operation.Builder, com.yandex.ydb.OperationProtos.OperationOrBuilder>(
                getOperation(),
                getParentForChildren(),
                isClean());
        operation_ = null;
      }
      return operationBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Ydb.RateLimiter.AcquireResourceResponse)
  }

  // @@protoc_insertion_point(class_scope:Ydb.RateLimiter.AcquireResourceResponse)
  private static final com.yandex.ydb.rate_limiter.AcquireResourceResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.yandex.ydb.rate_limiter.AcquireResourceResponse();
  }

  public static com.yandex.ydb.rate_limiter.AcquireResourceResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AcquireResourceResponse>
      PARSER = new com.google.protobuf.AbstractParser<AcquireResourceResponse>() {
    @java.lang.Override
    public AcquireResourceResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AcquireResourceResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AcquireResourceResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AcquireResourceResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.yandex.ydb.rate_limiter.AcquireResourceResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

