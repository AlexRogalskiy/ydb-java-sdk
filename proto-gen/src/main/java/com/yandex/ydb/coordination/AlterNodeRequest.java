// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kikimr/public/api/protos/ydb_coordination.proto

package com.yandex.ydb.coordination;

/**
 * Protobuf type {@code Ydb.Coordination.AlterNodeRequest}
 */
public final class AlterNodeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Ydb.Coordination.AlterNodeRequest)
    AlterNodeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AlterNodeRequest.newBuilder() to construct.
  private AlterNodeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AlterNodeRequest() {
    path_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AlterNodeRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AlterNodeRequest(
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
            com.yandex.ydb.coordination.Config.Builder subBuilder = null;
            if (config_ != null) {
              subBuilder = config_.toBuilder();
            }
            config_ = input.readMessage(com.yandex.ydb.coordination.Config.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(config_);
              config_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
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
    return com.yandex.ydb.coordination.CoordinationProtos.internal_static_Ydb_Coordination_AlterNodeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.yandex.ydb.coordination.CoordinationProtos.internal_static_Ydb_Coordination_AlterNodeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.yandex.ydb.coordination.AlterNodeRequest.class, com.yandex.ydb.coordination.AlterNodeRequest.Builder.class);
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

  public static final int CONFIG_FIELD_NUMBER = 2;
  private com.yandex.ydb.coordination.Config config_;
  /**
   * <code>.Ydb.Coordination.Config config = 2;</code>
   * @return Whether the config field is set.
   */
  @java.lang.Override
  public boolean hasConfig() {
    return config_ != null;
  }
  /**
   * <code>.Ydb.Coordination.Config config = 2;</code>
   * @return The config.
   */
  @java.lang.Override
  public com.yandex.ydb.coordination.Config getConfig() {
    return config_ == null ? com.yandex.ydb.coordination.Config.getDefaultInstance() : config_;
  }
  /**
   * <code>.Ydb.Coordination.Config config = 2;</code>
   */
  @java.lang.Override
  public com.yandex.ydb.coordination.ConfigOrBuilder getConfigOrBuilder() {
    return getConfig();
  }

  public static final int OPERATION_PARAMS_FIELD_NUMBER = 3;
  private com.yandex.ydb.OperationProtos.OperationParams operationParams_;
  /**
   * <code>.Ydb.Operations.OperationParams operation_params = 3;</code>
   * @return Whether the operationParams field is set.
   */
  @java.lang.Override
  public boolean hasOperationParams() {
    return operationParams_ != null;
  }
  /**
   * <code>.Ydb.Operations.OperationParams operation_params = 3;</code>
   * @return The operationParams.
   */
  @java.lang.Override
  public com.yandex.ydb.OperationProtos.OperationParams getOperationParams() {
    return operationParams_ == null ? com.yandex.ydb.OperationProtos.OperationParams.getDefaultInstance() : operationParams_;
  }
  /**
   * <code>.Ydb.Operations.OperationParams operation_params = 3;</code>
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
    if (config_ != null) {
      output.writeMessage(2, getConfig());
    }
    if (operationParams_ != null) {
      output.writeMessage(3, getOperationParams());
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
    if (config_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getConfig());
    }
    if (operationParams_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getOperationParams());
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
    if (!(obj instanceof com.yandex.ydb.coordination.AlterNodeRequest)) {
      return super.equals(obj);
    }
    com.yandex.ydb.coordination.AlterNodeRequest other = (com.yandex.ydb.coordination.AlterNodeRequest) obj;

    if (!getPath()
        .equals(other.getPath())) return false;
    if (hasConfig() != other.hasConfig()) return false;
    if (hasConfig()) {
      if (!getConfig()
          .equals(other.getConfig())) return false;
    }
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
    if (hasConfig()) {
      hash = (37 * hash) + CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getConfig().hashCode();
    }
    if (hasOperationParams()) {
      hash = (37 * hash) + OPERATION_PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getOperationParams().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.yandex.ydb.coordination.AlterNodeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.yandex.ydb.coordination.AlterNodeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.yandex.ydb.coordination.AlterNodeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.yandex.ydb.coordination.AlterNodeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.yandex.ydb.coordination.AlterNodeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.yandex.ydb.coordination.AlterNodeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.yandex.ydb.coordination.AlterNodeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.yandex.ydb.coordination.AlterNodeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.yandex.ydb.coordination.AlterNodeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.yandex.ydb.coordination.AlterNodeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.yandex.ydb.coordination.AlterNodeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.yandex.ydb.coordination.AlterNodeRequest parseFrom(
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
  public static Builder newBuilder(com.yandex.ydb.coordination.AlterNodeRequest prototype) {
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
   * Protobuf type {@code Ydb.Coordination.AlterNodeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Ydb.Coordination.AlterNodeRequest)
      com.yandex.ydb.coordination.AlterNodeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.yandex.ydb.coordination.CoordinationProtos.internal_static_Ydb_Coordination_AlterNodeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.yandex.ydb.coordination.CoordinationProtos.internal_static_Ydb_Coordination_AlterNodeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.yandex.ydb.coordination.AlterNodeRequest.class, com.yandex.ydb.coordination.AlterNodeRequest.Builder.class);
    }

    // Construct using com.yandex.ydb.coordination.AlterNodeRequest.newBuilder()
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

      if (configBuilder_ == null) {
        config_ = null;
      } else {
        config_ = null;
        configBuilder_ = null;
      }
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
      return com.yandex.ydb.coordination.CoordinationProtos.internal_static_Ydb_Coordination_AlterNodeRequest_descriptor;
    }

    @java.lang.Override
    public com.yandex.ydb.coordination.AlterNodeRequest getDefaultInstanceForType() {
      return com.yandex.ydb.coordination.AlterNodeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.yandex.ydb.coordination.AlterNodeRequest build() {
      com.yandex.ydb.coordination.AlterNodeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.yandex.ydb.coordination.AlterNodeRequest buildPartial() {
      com.yandex.ydb.coordination.AlterNodeRequest result = new com.yandex.ydb.coordination.AlterNodeRequest(this);
      result.path_ = path_;
      if (configBuilder_ == null) {
        result.config_ = config_;
      } else {
        result.config_ = configBuilder_.build();
      }
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
      if (other instanceof com.yandex.ydb.coordination.AlterNodeRequest) {
        return mergeFrom((com.yandex.ydb.coordination.AlterNodeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.yandex.ydb.coordination.AlterNodeRequest other) {
      if (other == com.yandex.ydb.coordination.AlterNodeRequest.getDefaultInstance()) return this;
      if (!other.getPath().isEmpty()) {
        path_ = other.path_;
        onChanged();
      }
      if (other.hasConfig()) {
        mergeConfig(other.getConfig());
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
      com.yandex.ydb.coordination.AlterNodeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.yandex.ydb.coordination.AlterNodeRequest) e.getUnfinishedMessage();
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

    private com.yandex.ydb.coordination.Config config_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.yandex.ydb.coordination.Config, com.yandex.ydb.coordination.Config.Builder, com.yandex.ydb.coordination.ConfigOrBuilder> configBuilder_;
    /**
     * <code>.Ydb.Coordination.Config config = 2;</code>
     * @return Whether the config field is set.
     */
    public boolean hasConfig() {
      return configBuilder_ != null || config_ != null;
    }
    /**
     * <code>.Ydb.Coordination.Config config = 2;</code>
     * @return The config.
     */
    public com.yandex.ydb.coordination.Config getConfig() {
      if (configBuilder_ == null) {
        return config_ == null ? com.yandex.ydb.coordination.Config.getDefaultInstance() : config_;
      } else {
        return configBuilder_.getMessage();
      }
    }
    /**
     * <code>.Ydb.Coordination.Config config = 2;</code>
     */
    public Builder setConfig(com.yandex.ydb.coordination.Config value) {
      if (configBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        config_ = value;
        onChanged();
      } else {
        configBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Ydb.Coordination.Config config = 2;</code>
     */
    public Builder setConfig(
        com.yandex.ydb.coordination.Config.Builder builderForValue) {
      if (configBuilder_ == null) {
        config_ = builderForValue.build();
        onChanged();
      } else {
        configBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Ydb.Coordination.Config config = 2;</code>
     */
    public Builder mergeConfig(com.yandex.ydb.coordination.Config value) {
      if (configBuilder_ == null) {
        if (config_ != null) {
          config_ =
            com.yandex.ydb.coordination.Config.newBuilder(config_).mergeFrom(value).buildPartial();
        } else {
          config_ = value;
        }
        onChanged();
      } else {
        configBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Ydb.Coordination.Config config = 2;</code>
     */
    public Builder clearConfig() {
      if (configBuilder_ == null) {
        config_ = null;
        onChanged();
      } else {
        config_ = null;
        configBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Ydb.Coordination.Config config = 2;</code>
     */
    public com.yandex.ydb.coordination.Config.Builder getConfigBuilder() {
      
      onChanged();
      return getConfigFieldBuilder().getBuilder();
    }
    /**
     * <code>.Ydb.Coordination.Config config = 2;</code>
     */
    public com.yandex.ydb.coordination.ConfigOrBuilder getConfigOrBuilder() {
      if (configBuilder_ != null) {
        return configBuilder_.getMessageOrBuilder();
      } else {
        return config_ == null ?
            com.yandex.ydb.coordination.Config.getDefaultInstance() : config_;
      }
    }
    /**
     * <code>.Ydb.Coordination.Config config = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.yandex.ydb.coordination.Config, com.yandex.ydb.coordination.Config.Builder, com.yandex.ydb.coordination.ConfigOrBuilder> 
        getConfigFieldBuilder() {
      if (configBuilder_ == null) {
        configBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.yandex.ydb.coordination.Config, com.yandex.ydb.coordination.Config.Builder, com.yandex.ydb.coordination.ConfigOrBuilder>(
                getConfig(),
                getParentForChildren(),
                isClean());
        config_ = null;
      }
      return configBuilder_;
    }

    private com.yandex.ydb.OperationProtos.OperationParams operationParams_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.yandex.ydb.OperationProtos.OperationParams, com.yandex.ydb.OperationProtos.OperationParams.Builder, com.yandex.ydb.OperationProtos.OperationParamsOrBuilder> operationParamsBuilder_;
    /**
     * <code>.Ydb.Operations.OperationParams operation_params = 3;</code>
     * @return Whether the operationParams field is set.
     */
    public boolean hasOperationParams() {
      return operationParamsBuilder_ != null || operationParams_ != null;
    }
    /**
     * <code>.Ydb.Operations.OperationParams operation_params = 3;</code>
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
     * <code>.Ydb.Operations.OperationParams operation_params = 3;</code>
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
     * <code>.Ydb.Operations.OperationParams operation_params = 3;</code>
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
     * <code>.Ydb.Operations.OperationParams operation_params = 3;</code>
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
     * <code>.Ydb.Operations.OperationParams operation_params = 3;</code>
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
     * <code>.Ydb.Operations.OperationParams operation_params = 3;</code>
     */
    public com.yandex.ydb.OperationProtos.OperationParams.Builder getOperationParamsBuilder() {
      
      onChanged();
      return getOperationParamsFieldBuilder().getBuilder();
    }
    /**
     * <code>.Ydb.Operations.OperationParams operation_params = 3;</code>
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
     * <code>.Ydb.Operations.OperationParams operation_params = 3;</code>
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


    // @@protoc_insertion_point(builder_scope:Ydb.Coordination.AlterNodeRequest)
  }

  // @@protoc_insertion_point(class_scope:Ydb.Coordination.AlterNodeRequest)
  private static final com.yandex.ydb.coordination.AlterNodeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.yandex.ydb.coordination.AlterNodeRequest();
  }

  public static com.yandex.ydb.coordination.AlterNodeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AlterNodeRequest>
      PARSER = new com.google.protobuf.AbstractParser<AlterNodeRequest>() {
    @java.lang.Override
    public AlterNodeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AlterNodeRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AlterNodeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AlterNodeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.yandex.ydb.coordination.AlterNodeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

