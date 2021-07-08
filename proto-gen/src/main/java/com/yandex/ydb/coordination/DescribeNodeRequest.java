// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kikimr/public/api/protos/ydb_coordination.proto

package com.yandex.ydb.coordination;

/**
 * Protobuf type {@code Ydb.Coordination.DescribeNodeRequest}
 */
public final class DescribeNodeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Ydb.Coordination.DescribeNodeRequest)
    DescribeNodeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DescribeNodeRequest.newBuilder() to construct.
  private DescribeNodeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DescribeNodeRequest() {
    path_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DescribeNodeRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DescribeNodeRequest(
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
            java.lang.String s = input.readStringRequireUtf8();

            path_ = s;
            break;
          }
          case 18: {
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
    return com.yandex.ydb.coordination.CoordinationProtos.internal_static_Ydb_Coordination_DescribeNodeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.yandex.ydb.coordination.CoordinationProtos.internal_static_Ydb_Coordination_DescribeNodeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.yandex.ydb.coordination.DescribeNodeRequest.class, com.yandex.ydb.coordination.DescribeNodeRequest.Builder.class);
  }

  public static final int PATH_FIELD_NUMBER = 1;
  private volatile java.lang.Object path_;
  /**
   * <code>string path = 1;</code>
   * @return The path.
   */
  @java.lang.Override
  public java.lang.String getPath() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      path_ = s;
      return s;
    }
  }
  /**
   * <code>string path = 1;</code>
   * @return The bytes for path.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPathBytes() {
    java.lang.Object ref = path_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      path_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OPERATION_PARAMS_FIELD_NUMBER = 2;
  private com.yandex.ydb.OperationProtos.OperationParams operationParams_;
  /**
   * <code>.Ydb.Operations.OperationParams operation_params = 2;</code>
   * @return Whether the operationParams field is set.
   */
  @java.lang.Override
  public boolean hasOperationParams() {
    return operationParams_ != null;
  }
  /**
   * <code>.Ydb.Operations.OperationParams operation_params = 2;</code>
   * @return The operationParams.
   */
  @java.lang.Override
  public com.yandex.ydb.OperationProtos.OperationParams getOperationParams() {
    return operationParams_ == null ? com.yandex.ydb.OperationProtos.OperationParams.getDefaultInstance() : operationParams_;
  }
  /**
   * <code>.Ydb.Operations.OperationParams operation_params = 2;</code>
   */
  @java.lang.Override
  public com.yandex.ydb.OperationProtos.OperationParamsOrBuilder getOperationParamsOrBuilder() {
    return getOperationParams();
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
    if (!getPathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, path_);
    }
    if (operationParams_ != null) {
      output.writeMessage(2, getOperationParams());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, path_);
    }
    if (operationParams_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getOperationParams());
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
    if (!(obj instanceof com.yandex.ydb.coordination.DescribeNodeRequest)) {
      return super.equals(obj);
    }
    com.yandex.ydb.coordination.DescribeNodeRequest other = (com.yandex.ydb.coordination.DescribeNodeRequest) obj;

    if (!getPath()
        .equals(other.getPath())) return false;
    if (hasOperationParams() != other.hasOperationParams()) return false;
    if (hasOperationParams()) {
      if (!getOperationParams()
          .equals(other.getOperationParams())) return false;
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
    hash = (37 * hash) + PATH_FIELD_NUMBER;
    hash = (53 * hash) + getPath().hashCode();
    if (hasOperationParams()) {
      hash = (37 * hash) + OPERATION_PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getOperationParams().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.yandex.ydb.coordination.DescribeNodeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.yandex.ydb.coordination.DescribeNodeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.yandex.ydb.coordination.DescribeNodeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.yandex.ydb.coordination.DescribeNodeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.yandex.ydb.coordination.DescribeNodeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.yandex.ydb.coordination.DescribeNodeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.yandex.ydb.coordination.DescribeNodeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.yandex.ydb.coordination.DescribeNodeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.yandex.ydb.coordination.DescribeNodeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.yandex.ydb.coordination.DescribeNodeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.yandex.ydb.coordination.DescribeNodeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.yandex.ydb.coordination.DescribeNodeRequest parseFrom(
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
  public static Builder newBuilder(com.yandex.ydb.coordination.DescribeNodeRequest prototype) {
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
   * Protobuf type {@code Ydb.Coordination.DescribeNodeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Ydb.Coordination.DescribeNodeRequest)
      com.yandex.ydb.coordination.DescribeNodeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.yandex.ydb.coordination.CoordinationProtos.internal_static_Ydb_Coordination_DescribeNodeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.yandex.ydb.coordination.CoordinationProtos.internal_static_Ydb_Coordination_DescribeNodeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.yandex.ydb.coordination.DescribeNodeRequest.class, com.yandex.ydb.coordination.DescribeNodeRequest.Builder.class);
    }

    // Construct using com.yandex.ydb.coordination.DescribeNodeRequest.newBuilder()
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
      path_ = "";

      if (operationParamsBuilder_ == null) {
        operationParams_ = null;
      } else {
        operationParams_ = null;
        operationParamsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.yandex.ydb.coordination.CoordinationProtos.internal_static_Ydb_Coordination_DescribeNodeRequest_descriptor;
    }

    @java.lang.Override
    public com.yandex.ydb.coordination.DescribeNodeRequest getDefaultInstanceForType() {
      return com.yandex.ydb.coordination.DescribeNodeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.yandex.ydb.coordination.DescribeNodeRequest build() {
      com.yandex.ydb.coordination.DescribeNodeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.yandex.ydb.coordination.DescribeNodeRequest buildPartial() {
      com.yandex.ydb.coordination.DescribeNodeRequest result = new com.yandex.ydb.coordination.DescribeNodeRequest(this);
      result.path_ = path_;
      if (operationParamsBuilder_ == null) {
        result.operationParams_ = operationParams_;
      } else {
        result.operationParams_ = operationParamsBuilder_.build();
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
      if (other instanceof com.yandex.ydb.coordination.DescribeNodeRequest) {
        return mergeFrom((com.yandex.ydb.coordination.DescribeNodeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.yandex.ydb.coordination.DescribeNodeRequest other) {
      if (other == com.yandex.ydb.coordination.DescribeNodeRequest.getDefaultInstance()) return this;
      if (!other.getPath().isEmpty()) {
        path_ = other.path_;
        onChanged();
      }
      if (other.hasOperationParams()) {
        mergeOperationParams(other.getOperationParams());
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
      com.yandex.ydb.coordination.DescribeNodeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.yandex.ydb.coordination.DescribeNodeRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object path_ = "";
    /**
     * <code>string path = 1;</code>
     * @return The path.
     */
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        path_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string path = 1;</code>
     * @return The bytes for path.
     */
    public com.google.protobuf.ByteString
        getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string path = 1;</code>
     * @param value The path to set.
     * @return This builder for chaining.
     */
    public Builder setPath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      path_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string path = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPath() {
      
      path_ = getDefaultInstance().getPath();
      onChanged();
      return this;
    }
    /**
     * <code>string path = 1;</code>
     * @param value The bytes for path to set.
     * @return This builder for chaining.
     */
    public Builder setPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      path_ = value;
      onChanged();
      return this;
    }

    private com.yandex.ydb.OperationProtos.OperationParams operationParams_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.yandex.ydb.OperationProtos.OperationParams, com.yandex.ydb.OperationProtos.OperationParams.Builder, com.yandex.ydb.OperationProtos.OperationParamsOrBuilder> operationParamsBuilder_;
    /**
     * <code>.Ydb.Operations.OperationParams operation_params = 2;</code>
     * @return Whether the operationParams field is set.
     */
    public boolean hasOperationParams() {
      return operationParamsBuilder_ != null || operationParams_ != null;
    }
    /**
     * <code>.Ydb.Operations.OperationParams operation_params = 2;</code>
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
     * <code>.Ydb.Operations.OperationParams operation_params = 2;</code>
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
     * <code>.Ydb.Operations.OperationParams operation_params = 2;</code>
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
     * <code>.Ydb.Operations.OperationParams operation_params = 2;</code>
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
     * <code>.Ydb.Operations.OperationParams operation_params = 2;</code>
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
     * <code>.Ydb.Operations.OperationParams operation_params = 2;</code>
     */
    public com.yandex.ydb.OperationProtos.OperationParams.Builder getOperationParamsBuilder() {
      
      onChanged();
      return getOperationParamsFieldBuilder().getBuilder();
    }
    /**
     * <code>.Ydb.Operations.OperationParams operation_params = 2;</code>
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
     * <code>.Ydb.Operations.OperationParams operation_params = 2;</code>
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


    // @@protoc_insertion_point(builder_scope:Ydb.Coordination.DescribeNodeRequest)
  }

  // @@protoc_insertion_point(class_scope:Ydb.Coordination.DescribeNodeRequest)
  private static final com.yandex.ydb.coordination.DescribeNodeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.yandex.ydb.coordination.DescribeNodeRequest();
  }

  public static com.yandex.ydb.coordination.DescribeNodeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DescribeNodeRequest>
      PARSER = new com.google.protobuf.AbstractParser<DescribeNodeRequest>() {
    @java.lang.Override
    public DescribeNodeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DescribeNodeRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DescribeNodeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DescribeNodeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.yandex.ydb.coordination.DescribeNodeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

