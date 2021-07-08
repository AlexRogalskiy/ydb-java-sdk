// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kikimr/public/api/protos/ydb_rate_limiter.proto

package com.yandex.ydb.rate_limiter;

/**
 * Protobuf type {@code Ydb.RateLimiter.DescribeResourceResult}
 */
public final class DescribeResourceResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Ydb.RateLimiter.DescribeResourceResult)
    DescribeResourceResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DescribeResourceResult.newBuilder() to construct.
  private DescribeResourceResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DescribeResourceResult() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DescribeResourceResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DescribeResourceResult(
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
            com.yandex.ydb.rate_limiter.Resource.Builder subBuilder = null;
            if (resource_ != null) {
              subBuilder = resource_.toBuilder();
            }
            resource_ = input.readMessage(com.yandex.ydb.rate_limiter.Resource.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(resource_);
              resource_ = subBuilder.buildPartial();
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
    return com.yandex.ydb.rate_limiter.RateLimiterProtos.internal_static_Ydb_RateLimiter_DescribeResourceResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.yandex.ydb.rate_limiter.RateLimiterProtos.internal_static_Ydb_RateLimiter_DescribeResourceResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.yandex.ydb.rate_limiter.DescribeResourceResult.class, com.yandex.ydb.rate_limiter.DescribeResourceResult.Builder.class);
  }

  public static final int RESOURCE_FIELD_NUMBER = 1;
  private com.yandex.ydb.rate_limiter.Resource resource_;
  /**
   * <code>.Ydb.RateLimiter.Resource resource = 1;</code>
   * @return Whether the resource field is set.
   */
  @java.lang.Override
  public boolean hasResource() {
    return resource_ != null;
  }
  /**
   * <code>.Ydb.RateLimiter.Resource resource = 1;</code>
   * @return The resource.
   */
  @java.lang.Override
  public com.yandex.ydb.rate_limiter.Resource getResource() {
    return resource_ == null ? com.yandex.ydb.rate_limiter.Resource.getDefaultInstance() : resource_;
  }
  /**
   * <code>.Ydb.RateLimiter.Resource resource = 1;</code>
   */
  @java.lang.Override
  public com.yandex.ydb.rate_limiter.ResourceOrBuilder getResourceOrBuilder() {
    return getResource();
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
    if (resource_ != null) {
      output.writeMessage(1, getResource());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (resource_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getResource());
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
    if (!(obj instanceof com.yandex.ydb.rate_limiter.DescribeResourceResult)) {
      return super.equals(obj);
    }
    com.yandex.ydb.rate_limiter.DescribeResourceResult other = (com.yandex.ydb.rate_limiter.DescribeResourceResult) obj;

    if (hasResource() != other.hasResource()) return false;
    if (hasResource()) {
      if (!getResource()
          .equals(other.getResource())) return false;
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
    if (hasResource()) {
      hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getResource().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.yandex.ydb.rate_limiter.DescribeResourceResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.yandex.ydb.rate_limiter.DescribeResourceResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.yandex.ydb.rate_limiter.DescribeResourceResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.yandex.ydb.rate_limiter.DescribeResourceResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.yandex.ydb.rate_limiter.DescribeResourceResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.yandex.ydb.rate_limiter.DescribeResourceResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.yandex.ydb.rate_limiter.DescribeResourceResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.yandex.ydb.rate_limiter.DescribeResourceResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.yandex.ydb.rate_limiter.DescribeResourceResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.yandex.ydb.rate_limiter.DescribeResourceResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.yandex.ydb.rate_limiter.DescribeResourceResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.yandex.ydb.rate_limiter.DescribeResourceResult parseFrom(
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
  public static Builder newBuilder(com.yandex.ydb.rate_limiter.DescribeResourceResult prototype) {
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
   * Protobuf type {@code Ydb.RateLimiter.DescribeResourceResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Ydb.RateLimiter.DescribeResourceResult)
      com.yandex.ydb.rate_limiter.DescribeResourceResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.yandex.ydb.rate_limiter.RateLimiterProtos.internal_static_Ydb_RateLimiter_DescribeResourceResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.yandex.ydb.rate_limiter.RateLimiterProtos.internal_static_Ydb_RateLimiter_DescribeResourceResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.yandex.ydb.rate_limiter.DescribeResourceResult.class, com.yandex.ydb.rate_limiter.DescribeResourceResult.Builder.class);
    }

    // Construct using com.yandex.ydb.rate_limiter.DescribeResourceResult.newBuilder()
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
      if (resourceBuilder_ == null) {
        resource_ = null;
      } else {
        resource_ = null;
        resourceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.yandex.ydb.rate_limiter.RateLimiterProtos.internal_static_Ydb_RateLimiter_DescribeResourceResult_descriptor;
    }

    @java.lang.Override
    public com.yandex.ydb.rate_limiter.DescribeResourceResult getDefaultInstanceForType() {
      return com.yandex.ydb.rate_limiter.DescribeResourceResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.yandex.ydb.rate_limiter.DescribeResourceResult build() {
      com.yandex.ydb.rate_limiter.DescribeResourceResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.yandex.ydb.rate_limiter.DescribeResourceResult buildPartial() {
      com.yandex.ydb.rate_limiter.DescribeResourceResult result = new com.yandex.ydb.rate_limiter.DescribeResourceResult(this);
      if (resourceBuilder_ == null) {
        result.resource_ = resource_;
      } else {
        result.resource_ = resourceBuilder_.build();
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
      if (other instanceof com.yandex.ydb.rate_limiter.DescribeResourceResult) {
        return mergeFrom((com.yandex.ydb.rate_limiter.DescribeResourceResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.yandex.ydb.rate_limiter.DescribeResourceResult other) {
      if (other == com.yandex.ydb.rate_limiter.DescribeResourceResult.getDefaultInstance()) return this;
      if (other.hasResource()) {
        mergeResource(other.getResource());
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
      com.yandex.ydb.rate_limiter.DescribeResourceResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.yandex.ydb.rate_limiter.DescribeResourceResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.yandex.ydb.rate_limiter.Resource resource_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.yandex.ydb.rate_limiter.Resource, com.yandex.ydb.rate_limiter.Resource.Builder, com.yandex.ydb.rate_limiter.ResourceOrBuilder> resourceBuilder_;
    /**
     * <code>.Ydb.RateLimiter.Resource resource = 1;</code>
     * @return Whether the resource field is set.
     */
    public boolean hasResource() {
      return resourceBuilder_ != null || resource_ != null;
    }
    /**
     * <code>.Ydb.RateLimiter.Resource resource = 1;</code>
     * @return The resource.
     */
    public com.yandex.ydb.rate_limiter.Resource getResource() {
      if (resourceBuilder_ == null) {
        return resource_ == null ? com.yandex.ydb.rate_limiter.Resource.getDefaultInstance() : resource_;
      } else {
        return resourceBuilder_.getMessage();
      }
    }
    /**
     * <code>.Ydb.RateLimiter.Resource resource = 1;</code>
     */
    public Builder setResource(com.yandex.ydb.rate_limiter.Resource value) {
      if (resourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        resource_ = value;
        onChanged();
      } else {
        resourceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Ydb.RateLimiter.Resource resource = 1;</code>
     */
    public Builder setResource(
        com.yandex.ydb.rate_limiter.Resource.Builder builderForValue) {
      if (resourceBuilder_ == null) {
        resource_ = builderForValue.build();
        onChanged();
      } else {
        resourceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Ydb.RateLimiter.Resource resource = 1;</code>
     */
    public Builder mergeResource(com.yandex.ydb.rate_limiter.Resource value) {
      if (resourceBuilder_ == null) {
        if (resource_ != null) {
          resource_ =
            com.yandex.ydb.rate_limiter.Resource.newBuilder(resource_).mergeFrom(value).buildPartial();
        } else {
          resource_ = value;
        }
        onChanged();
      } else {
        resourceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Ydb.RateLimiter.Resource resource = 1;</code>
     */
    public Builder clearResource() {
      if (resourceBuilder_ == null) {
        resource_ = null;
        onChanged();
      } else {
        resource_ = null;
        resourceBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Ydb.RateLimiter.Resource resource = 1;</code>
     */
    public com.yandex.ydb.rate_limiter.Resource.Builder getResourceBuilder() {
      
      onChanged();
      return getResourceFieldBuilder().getBuilder();
    }
    /**
     * <code>.Ydb.RateLimiter.Resource resource = 1;</code>
     */
    public com.yandex.ydb.rate_limiter.ResourceOrBuilder getResourceOrBuilder() {
      if (resourceBuilder_ != null) {
        return resourceBuilder_.getMessageOrBuilder();
      } else {
        return resource_ == null ?
            com.yandex.ydb.rate_limiter.Resource.getDefaultInstance() : resource_;
      }
    }
    /**
     * <code>.Ydb.RateLimiter.Resource resource = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.yandex.ydb.rate_limiter.Resource, com.yandex.ydb.rate_limiter.Resource.Builder, com.yandex.ydb.rate_limiter.ResourceOrBuilder> 
        getResourceFieldBuilder() {
      if (resourceBuilder_ == null) {
        resourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.yandex.ydb.rate_limiter.Resource, com.yandex.ydb.rate_limiter.Resource.Builder, com.yandex.ydb.rate_limiter.ResourceOrBuilder>(
                getResource(),
                getParentForChildren(),
                isClean());
        resource_ = null;
      }
      return resourceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Ydb.RateLimiter.DescribeResourceResult)
  }

  // @@protoc_insertion_point(class_scope:Ydb.RateLimiter.DescribeResourceResult)
  private static final com.yandex.ydb.rate_limiter.DescribeResourceResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.yandex.ydb.rate_limiter.DescribeResourceResult();
  }

  public static com.yandex.ydb.rate_limiter.DescribeResourceResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DescribeResourceResult>
      PARSER = new com.google.protobuf.AbstractParser<DescribeResourceResult>() {
    @java.lang.Override
    public DescribeResourceResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DescribeResourceResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DescribeResourceResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DescribeResourceResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.yandex.ydb.rate_limiter.DescribeResourceResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

