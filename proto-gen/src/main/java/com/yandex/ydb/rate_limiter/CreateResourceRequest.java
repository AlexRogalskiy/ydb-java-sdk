// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kikimr/public/api/protos/ydb_rate_limiter.proto

package com.yandex.ydb.rate_limiter;

/**
 * Protobuf type {@code Ydb.RateLimiter.CreateResourceRequest}
 */
public final class CreateResourceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Ydb.RateLimiter.CreateResourceRequest)
    CreateResourceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateResourceRequest.newBuilder() to construct.
  private CreateResourceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateResourceRequest() {
    coordinationNodePath_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateResourceRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateResourceRequest(
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
            com.yandex.ydb.OperationProtos.OperationParams.Builder subBuilder = null;
            if (operationParams_ != null) {
              subBuilder = operationParams_.toBuilder();
            }
            operationParams_ = input.readMessage(com.yandex.ydb.OperationProtos.OperationParams.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(operationParams_);
              operationParams_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            coordinationNodePath_ = s;
            break;
          }
          case 26: {
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
    return com.yandex.ydb.rate_limiter.RateLimiterProtos.internal_static_Ydb_RateLimiter_CreateResourceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.yandex.ydb.rate_limiter.RateLimiterProtos.internal_static_Ydb_RateLimiter_CreateResourceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.yandex.ydb.rate_limiter.CreateResourceRequest.class, com.yandex.ydb.rate_limiter.CreateResourceRequest.Builder.class);
  }

  public static final int OPERATION_PARAMS_FIELD_NUMBER = 1;
  private com.yandex.ydb.OperationProtos.OperationParams operationParams_;
  /**
   * <code>.Ydb.Operations.OperationParams operation_params = 1;</code>
   * @return Whether the operationParams field is set.
   */
  @java.lang.Override
  public boolean hasOperationParams() {
    return operationParams_ != null;
  }
  /**
   * <code>.Ydb.Operations.OperationParams operation_params = 1;</code>
   * @return The operationParams.
   */
  @java.lang.Override
  public com.yandex.ydb.OperationProtos.OperationParams getOperationParams() {
    return operationParams_ == null ? com.yandex.ydb.OperationProtos.OperationParams.getDefaultInstance() : operationParams_;
  }
  /**
   * <code>.Ydb.Operations.OperationParams operation_params = 1;</code>
   */
  @java.lang.Override
  public com.yandex.ydb.OperationProtos.OperationParamsOrBuilder getOperationParamsOrBuilder() {
    return getOperationParams();
  }

  public static final int COORDINATION_NODE_PATH_FIELD_NUMBER = 2;
  private volatile java.lang.Object coordinationNodePath_;
  /**
   * <pre>
   * Path of a coordination node.
   * </pre>
   *
   * <code>string coordination_node_path = 2;</code>
   * @return The coordinationNodePath.
   */
  @java.lang.Override
  public java.lang.String getCoordinationNodePath() {
    java.lang.Object ref = coordinationNodePath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      coordinationNodePath_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Path of a coordination node.
   * </pre>
   *
   * <code>string coordination_node_path = 2;</code>
   * @return The bytes for coordinationNodePath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCoordinationNodePathBytes() {
    java.lang.Object ref = coordinationNodePath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      coordinationNodePath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESOURCE_FIELD_NUMBER = 3;
  private com.yandex.ydb.rate_limiter.Resource resource_;
  /**
   * <pre>
   * Resource properties.
   * </pre>
   *
   * <code>.Ydb.RateLimiter.Resource resource = 3;</code>
   * @return Whether the resource field is set.
   */
  @java.lang.Override
  public boolean hasResource() {
    return resource_ != null;
  }
  /**
   * <pre>
   * Resource properties.
   * </pre>
   *
   * <code>.Ydb.RateLimiter.Resource resource = 3;</code>
   * @return The resource.
   */
  @java.lang.Override
  public com.yandex.ydb.rate_limiter.Resource getResource() {
    return resource_ == null ? com.yandex.ydb.rate_limiter.Resource.getDefaultInstance() : resource_;
  }
  /**
   * <pre>
   * Resource properties.
   * </pre>
   *
   * <code>.Ydb.RateLimiter.Resource resource = 3;</code>
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
    if (operationParams_ != null) {
      output.writeMessage(1, getOperationParams());
    }
    if (!getCoordinationNodePathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, coordinationNodePath_);
    }
    if (resource_ != null) {
      output.writeMessage(3, getResource());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (operationParams_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getOperationParams());
    }
    if (!getCoordinationNodePathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, coordinationNodePath_);
    }
    if (resource_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getResource());
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
    if (!(obj instanceof com.yandex.ydb.rate_limiter.CreateResourceRequest)) {
      return super.equals(obj);
    }
    com.yandex.ydb.rate_limiter.CreateResourceRequest other = (com.yandex.ydb.rate_limiter.CreateResourceRequest) obj;

    if (hasOperationParams() != other.hasOperationParams()) return false;
    if (hasOperationParams()) {
      if (!getOperationParams()
          .equals(other.getOperationParams())) return false;
    }
    if (!getCoordinationNodePath()
        .equals(other.getCoordinationNodePath())) return false;
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
    if (hasOperationParams()) {
      hash = (37 * hash) + OPERATION_PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getOperationParams().hashCode();
    }
    hash = (37 * hash) + COORDINATION_NODE_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getCoordinationNodePath().hashCode();
    if (hasResource()) {
      hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getResource().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.yandex.ydb.rate_limiter.CreateResourceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.yandex.ydb.rate_limiter.CreateResourceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.yandex.ydb.rate_limiter.CreateResourceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.yandex.ydb.rate_limiter.CreateResourceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.yandex.ydb.rate_limiter.CreateResourceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.yandex.ydb.rate_limiter.CreateResourceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.yandex.ydb.rate_limiter.CreateResourceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.yandex.ydb.rate_limiter.CreateResourceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.yandex.ydb.rate_limiter.CreateResourceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.yandex.ydb.rate_limiter.CreateResourceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.yandex.ydb.rate_limiter.CreateResourceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.yandex.ydb.rate_limiter.CreateResourceRequest parseFrom(
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
  public static Builder newBuilder(com.yandex.ydb.rate_limiter.CreateResourceRequest prototype) {
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
   * Protobuf type {@code Ydb.RateLimiter.CreateResourceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Ydb.RateLimiter.CreateResourceRequest)
      com.yandex.ydb.rate_limiter.CreateResourceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.yandex.ydb.rate_limiter.RateLimiterProtos.internal_static_Ydb_RateLimiter_CreateResourceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.yandex.ydb.rate_limiter.RateLimiterProtos.internal_static_Ydb_RateLimiter_CreateResourceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.yandex.ydb.rate_limiter.CreateResourceRequest.class, com.yandex.ydb.rate_limiter.CreateResourceRequest.Builder.class);
    }

    // Construct using com.yandex.ydb.rate_limiter.CreateResourceRequest.newBuilder()
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
      if (operationParamsBuilder_ == null) {
        operationParams_ = null;
      } else {
        operationParams_ = null;
        operationParamsBuilder_ = null;
      }
      coordinationNodePath_ = "";

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
      return com.yandex.ydb.rate_limiter.RateLimiterProtos.internal_static_Ydb_RateLimiter_CreateResourceRequest_descriptor;
    }

    @java.lang.Override
    public com.yandex.ydb.rate_limiter.CreateResourceRequest getDefaultInstanceForType() {
      return com.yandex.ydb.rate_limiter.CreateResourceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.yandex.ydb.rate_limiter.CreateResourceRequest build() {
      com.yandex.ydb.rate_limiter.CreateResourceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.yandex.ydb.rate_limiter.CreateResourceRequest buildPartial() {
      com.yandex.ydb.rate_limiter.CreateResourceRequest result = new com.yandex.ydb.rate_limiter.CreateResourceRequest(this);
      if (operationParamsBuilder_ == null) {
        result.operationParams_ = operationParams_;
      } else {
        result.operationParams_ = operationParamsBuilder_.build();
      }
      result.coordinationNodePath_ = coordinationNodePath_;
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
      if (other instanceof com.yandex.ydb.rate_limiter.CreateResourceRequest) {
        return mergeFrom((com.yandex.ydb.rate_limiter.CreateResourceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.yandex.ydb.rate_limiter.CreateResourceRequest other) {
      if (other == com.yandex.ydb.rate_limiter.CreateResourceRequest.getDefaultInstance()) return this;
      if (other.hasOperationParams()) {
        mergeOperationParams(other.getOperationParams());
      }
      if (!other.getCoordinationNodePath().isEmpty()) {
        coordinationNodePath_ = other.coordinationNodePath_;
        onChanged();
      }
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
      com.yandex.ydb.rate_limiter.CreateResourceRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.yandex.ydb.rate_limiter.CreateResourceRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.yandex.ydb.OperationProtos.OperationParams operationParams_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.yandex.ydb.OperationProtos.OperationParams, com.yandex.ydb.OperationProtos.OperationParams.Builder, com.yandex.ydb.OperationProtos.OperationParamsOrBuilder> operationParamsBuilder_;
    /**
     * <code>.Ydb.Operations.OperationParams operation_params = 1;</code>
     * @return Whether the operationParams field is set.
     */
    public boolean hasOperationParams() {
      return operationParamsBuilder_ != null || operationParams_ != null;
    }
    /**
     * <code>.Ydb.Operations.OperationParams operation_params = 1;</code>
     * @return The operationParams.
     */
    public com.yandex.ydb.OperationProtos.OperationParams getOperationParams() {
      if (operationParamsBuilder_ == null) {
        return operationParams_ == null ? com.yandex.ydb.OperationProtos.OperationParams.getDefaultInstance() : operationParams_;
      } else {
        return operationParamsBuilder_.getMessage();
      }
    }
    /**
     * <code>.Ydb.Operations.OperationParams operation_params = 1;</code>
     */
    public Builder setOperationParams(com.yandex.ydb.OperationProtos.OperationParams value) {
      if (operationParamsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        operationParams_ = value;
        onChanged();
      } else {
        operationParamsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Ydb.Operations.OperationParams operation_params = 1;</code>
     */
    public Builder setOperationParams(
        com.yandex.ydb.OperationProtos.OperationParams.Builder builderForValue) {
      if (operationParamsBuilder_ == null) {
        operationParams_ = builderForValue.build();
        onChanged();
      } else {
        operationParamsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Ydb.Operations.OperationParams operation_params = 1;</code>
     */
    public Builder mergeOperationParams(com.yandex.ydb.OperationProtos.OperationParams value) {
      if (operationParamsBuilder_ == null) {
        if (operationParams_ != null) {
          operationParams_ =
            com.yandex.ydb.OperationProtos.OperationParams.newBuilder(operationParams_).mergeFrom(value).buildPartial();
        } else {
          operationParams_ = value;
        }
        onChanged();
      } else {
        operationParamsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Ydb.Operations.OperationParams operation_params = 1;</code>
     */
    public Builder clearOperationParams() {
      if (operationParamsBuilder_ == null) {
        operationParams_ = null;
        onChanged();
      } else {
        operationParams_ = null;
        operationParamsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Ydb.Operations.OperationParams operation_params = 1;</code>
     */
    public com.yandex.ydb.OperationProtos.OperationParams.Builder getOperationParamsBuilder() {
      
      onChanged();
      return getOperationParamsFieldBuilder().getBuilder();
    }
    /**
     * <code>.Ydb.Operations.OperationParams operation_params = 1;</code>
     */
    public com.yandex.ydb.OperationProtos.OperationParamsOrBuilder getOperationParamsOrBuilder() {
      if (operationParamsBuilder_ != null) {
        return operationParamsBuilder_.getMessageOrBuilder();
      } else {
        return operationParams_ == null ?
            com.yandex.ydb.OperationProtos.OperationParams.getDefaultInstance() : operationParams_;
      }
    }
    /**
     * <code>.Ydb.Operations.OperationParams operation_params = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.yandex.ydb.OperationProtos.OperationParams, com.yandex.ydb.OperationProtos.OperationParams.Builder, com.yandex.ydb.OperationProtos.OperationParamsOrBuilder> 
        getOperationParamsFieldBuilder() {
      if (operationParamsBuilder_ == null) {
        operationParamsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.yandex.ydb.OperationProtos.OperationParams, com.yandex.ydb.OperationProtos.OperationParams.Builder, com.yandex.ydb.OperationProtos.OperationParamsOrBuilder>(
                getOperationParams(),
                getParentForChildren(),
                isClean());
        operationParams_ = null;
      }
      return operationParamsBuilder_;
    }

    private java.lang.Object coordinationNodePath_ = "";
    /**
     * <pre>
     * Path of a coordination node.
     * </pre>
     *
     * <code>string coordination_node_path = 2;</code>
     * @return The coordinationNodePath.
     */
    public java.lang.String getCoordinationNodePath() {
      java.lang.Object ref = coordinationNodePath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        coordinationNodePath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Path of a coordination node.
     * </pre>
     *
     * <code>string coordination_node_path = 2;</code>
     * @return The bytes for coordinationNodePath.
     */
    public com.google.protobuf.ByteString
        getCoordinationNodePathBytes() {
      java.lang.Object ref = coordinationNodePath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        coordinationNodePath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Path of a coordination node.
     * </pre>
     *
     * <code>string coordination_node_path = 2;</code>
     * @param value The coordinationNodePath to set.
     * @return This builder for chaining.
     */
    public Builder setCoordinationNodePath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      coordinationNodePath_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Path of a coordination node.
     * </pre>
     *
     * <code>string coordination_node_path = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCoordinationNodePath() {
      
      coordinationNodePath_ = getDefaultInstance().getCoordinationNodePath();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Path of a coordination node.
     * </pre>
     *
     * <code>string coordination_node_path = 2;</code>
     * @param value The bytes for coordinationNodePath to set.
     * @return This builder for chaining.
     */
    public Builder setCoordinationNodePathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      coordinationNodePath_ = value;
      onChanged();
      return this;
    }

    private com.yandex.ydb.rate_limiter.Resource resource_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.yandex.ydb.rate_limiter.Resource, com.yandex.ydb.rate_limiter.Resource.Builder, com.yandex.ydb.rate_limiter.ResourceOrBuilder> resourceBuilder_;
    /**
     * <pre>
     * Resource properties.
     * </pre>
     *
     * <code>.Ydb.RateLimiter.Resource resource = 3;</code>
     * @return Whether the resource field is set.
     */
    public boolean hasResource() {
      return resourceBuilder_ != null || resource_ != null;
    }
    /**
     * <pre>
     * Resource properties.
     * </pre>
     *
     * <code>.Ydb.RateLimiter.Resource resource = 3;</code>
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
     * <pre>
     * Resource properties.
     * </pre>
     *
     * <code>.Ydb.RateLimiter.Resource resource = 3;</code>
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
     * <pre>
     * Resource properties.
     * </pre>
     *
     * <code>.Ydb.RateLimiter.Resource resource = 3;</code>
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
     * <pre>
     * Resource properties.
     * </pre>
     *
     * <code>.Ydb.RateLimiter.Resource resource = 3;</code>
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
     * <pre>
     * Resource properties.
     * </pre>
     *
     * <code>.Ydb.RateLimiter.Resource resource = 3;</code>
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
     * <pre>
     * Resource properties.
     * </pre>
     *
     * <code>.Ydb.RateLimiter.Resource resource = 3;</code>
     */
    public com.yandex.ydb.rate_limiter.Resource.Builder getResourceBuilder() {
      
      onChanged();
      return getResourceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Resource properties.
     * </pre>
     *
     * <code>.Ydb.RateLimiter.Resource resource = 3;</code>
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
     * <pre>
     * Resource properties.
     * </pre>
     *
     * <code>.Ydb.RateLimiter.Resource resource = 3;</code>
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


    // @@protoc_insertion_point(builder_scope:Ydb.RateLimiter.CreateResourceRequest)
  }

  // @@protoc_insertion_point(class_scope:Ydb.RateLimiter.CreateResourceRequest)
  private static final com.yandex.ydb.rate_limiter.CreateResourceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.yandex.ydb.rate_limiter.CreateResourceRequest();
  }

  public static com.yandex.ydb.rate_limiter.CreateResourceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateResourceRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateResourceRequest>() {
    @java.lang.Override
    public CreateResourceRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateResourceRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateResourceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateResourceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.yandex.ydb.rate_limiter.CreateResourceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

