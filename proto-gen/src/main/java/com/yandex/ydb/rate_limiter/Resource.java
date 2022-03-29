// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ydb/public/api/protos/ydb_rate_limiter.proto

package com.yandex.ydb.rate_limiter;

/**
 * <pre>
 * Rate limiter resource description.
 * </pre>
 *
 * Protobuf type {@code Ydb.RateLimiter.Resource}
 */
public final class Resource extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Ydb.RateLimiter.Resource)
    ResourceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Resource.newBuilder() to construct.
  private Resource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Resource() {
    resourcePath_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Resource();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Resource(
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

            resourcePath_ = s;
            break;
          }
          case 18: {
            com.yandex.ydb.rate_limiter.HierarchicalDrrSettings.Builder subBuilder = null;
            if (typeCase_ == 2) {
              subBuilder = ((com.yandex.ydb.rate_limiter.HierarchicalDrrSettings) type_).toBuilder();
            }
            type_ =
                input.readMessage(com.yandex.ydb.rate_limiter.HierarchicalDrrSettings.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.yandex.ydb.rate_limiter.HierarchicalDrrSettings) type_);
              type_ = subBuilder.buildPartial();
            }
            typeCase_ = 2;
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
    return com.yandex.ydb.rate_limiter.RateLimiterProtos.internal_static_Ydb_RateLimiter_Resource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.yandex.ydb.rate_limiter.RateLimiterProtos.internal_static_Ydb_RateLimiter_Resource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.yandex.ydb.rate_limiter.Resource.class, com.yandex.ydb.rate_limiter.Resource.Builder.class);
  }

  private int typeCase_ = 0;
  private java.lang.Object type_;
  public enum TypeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    HIERARCHICAL_DRR(2),
    TYPE_NOT_SET(0);
    private final int value;
    private TypeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static TypeCase forNumber(int value) {
      switch (value) {
        case 2: return HIERARCHICAL_DRR;
        case 0: return TYPE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public TypeCase
  getTypeCase() {
    return TypeCase.forNumber(
        typeCase_);
  }

  public static final int RESOURCE_PATH_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourcePath_;
  /**
   * <pre>
   * Resource path. Elements are separated by slash.
   * The first symbol is not slash.
   * The first element is root resource name.
   * Resource path is the path of resource inside coordination node.
   * </pre>
   *
   * <code>string resource_path = 1;</code>
   * @return The resourcePath.
   */
  @java.lang.Override
  public java.lang.String getResourcePath() {
    java.lang.Object ref = resourcePath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourcePath_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Resource path. Elements are separated by slash.
   * The first symbol is not slash.
   * The first element is root resource name.
   * Resource path is the path of resource inside coordination node.
   * </pre>
   *
   * <code>string resource_path = 1;</code>
   * @return The bytes for resourcePath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourcePathBytes() {
    java.lang.Object ref = resourcePath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourcePath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HIERARCHICAL_DRR_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Settings for Hierarchical DRR algorithm.
   * </pre>
   *
   * <code>.Ydb.RateLimiter.HierarchicalDrrSettings hierarchical_drr = 2;</code>
   * @return Whether the hierarchicalDrr field is set.
   */
  @java.lang.Override
  public boolean hasHierarchicalDrr() {
    return typeCase_ == 2;
  }
  /**
   * <pre>
   * Settings for Hierarchical DRR algorithm.
   * </pre>
   *
   * <code>.Ydb.RateLimiter.HierarchicalDrrSettings hierarchical_drr = 2;</code>
   * @return The hierarchicalDrr.
   */
  @java.lang.Override
  public com.yandex.ydb.rate_limiter.HierarchicalDrrSettings getHierarchicalDrr() {
    if (typeCase_ == 2) {
       return (com.yandex.ydb.rate_limiter.HierarchicalDrrSettings) type_;
    }
    return com.yandex.ydb.rate_limiter.HierarchicalDrrSettings.getDefaultInstance();
  }
  /**
   * <pre>
   * Settings for Hierarchical DRR algorithm.
   * </pre>
   *
   * <code>.Ydb.RateLimiter.HierarchicalDrrSettings hierarchical_drr = 2;</code>
   */
  @java.lang.Override
  public com.yandex.ydb.rate_limiter.HierarchicalDrrSettingsOrBuilder getHierarchicalDrrOrBuilder() {
    if (typeCase_ == 2) {
       return (com.yandex.ydb.rate_limiter.HierarchicalDrrSettings) type_;
    }
    return com.yandex.ydb.rate_limiter.HierarchicalDrrSettings.getDefaultInstance();
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
    if (!getResourcePathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourcePath_);
    }
    if (typeCase_ == 2) {
      output.writeMessage(2, (com.yandex.ydb.rate_limiter.HierarchicalDrrSettings) type_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getResourcePathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourcePath_);
    }
    if (typeCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.yandex.ydb.rate_limiter.HierarchicalDrrSettings) type_);
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
    if (!(obj instanceof com.yandex.ydb.rate_limiter.Resource)) {
      return super.equals(obj);
    }
    com.yandex.ydb.rate_limiter.Resource other = (com.yandex.ydb.rate_limiter.Resource) obj;

    if (!getResourcePath()
        .equals(other.getResourcePath())) return false;
    if (!getTypeCase().equals(other.getTypeCase())) return false;
    switch (typeCase_) {
      case 2:
        if (!getHierarchicalDrr()
            .equals(other.getHierarchicalDrr())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + RESOURCE_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getResourcePath().hashCode();
    switch (typeCase_) {
      case 2:
        hash = (37 * hash) + HIERARCHICAL_DRR_FIELD_NUMBER;
        hash = (53 * hash) + getHierarchicalDrr().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.yandex.ydb.rate_limiter.Resource parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.yandex.ydb.rate_limiter.Resource parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.yandex.ydb.rate_limiter.Resource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.yandex.ydb.rate_limiter.Resource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.yandex.ydb.rate_limiter.Resource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.yandex.ydb.rate_limiter.Resource parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.yandex.ydb.rate_limiter.Resource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.yandex.ydb.rate_limiter.Resource parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.yandex.ydb.rate_limiter.Resource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.yandex.ydb.rate_limiter.Resource parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.yandex.ydb.rate_limiter.Resource parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.yandex.ydb.rate_limiter.Resource parseFrom(
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
  public static Builder newBuilder(com.yandex.ydb.rate_limiter.Resource prototype) {
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
   * <pre>
   * Rate limiter resource description.
   * </pre>
   *
   * Protobuf type {@code Ydb.RateLimiter.Resource}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Ydb.RateLimiter.Resource)
      com.yandex.ydb.rate_limiter.ResourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.yandex.ydb.rate_limiter.RateLimiterProtos.internal_static_Ydb_RateLimiter_Resource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.yandex.ydb.rate_limiter.RateLimiterProtos.internal_static_Ydb_RateLimiter_Resource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.yandex.ydb.rate_limiter.Resource.class, com.yandex.ydb.rate_limiter.Resource.Builder.class);
    }

    // Construct using com.yandex.ydb.rate_limiter.Resource.newBuilder()
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
      resourcePath_ = "";

      typeCase_ = 0;
      type_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.yandex.ydb.rate_limiter.RateLimiterProtos.internal_static_Ydb_RateLimiter_Resource_descriptor;
    }

    @java.lang.Override
    public com.yandex.ydb.rate_limiter.Resource getDefaultInstanceForType() {
      return com.yandex.ydb.rate_limiter.Resource.getDefaultInstance();
    }

    @java.lang.Override
    public com.yandex.ydb.rate_limiter.Resource build() {
      com.yandex.ydb.rate_limiter.Resource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.yandex.ydb.rate_limiter.Resource buildPartial() {
      com.yandex.ydb.rate_limiter.Resource result = new com.yandex.ydb.rate_limiter.Resource(this);
      result.resourcePath_ = resourcePath_;
      if (typeCase_ == 2) {
        if (hierarchicalDrrBuilder_ == null) {
          result.type_ = type_;
        } else {
          result.type_ = hierarchicalDrrBuilder_.build();
        }
      }
      result.typeCase_ = typeCase_;
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
      if (other instanceof com.yandex.ydb.rate_limiter.Resource) {
        return mergeFrom((com.yandex.ydb.rate_limiter.Resource)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.yandex.ydb.rate_limiter.Resource other) {
      if (other == com.yandex.ydb.rate_limiter.Resource.getDefaultInstance()) return this;
      if (!other.getResourcePath().isEmpty()) {
        resourcePath_ = other.resourcePath_;
        onChanged();
      }
      switch (other.getTypeCase()) {
        case HIERARCHICAL_DRR: {
          mergeHierarchicalDrr(other.getHierarchicalDrr());
          break;
        }
        case TYPE_NOT_SET: {
          break;
        }
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
      com.yandex.ydb.rate_limiter.Resource parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.yandex.ydb.rate_limiter.Resource) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int typeCase_ = 0;
    private java.lang.Object type_;
    public TypeCase
        getTypeCase() {
      return TypeCase.forNumber(
          typeCase_);
    }

    public Builder clearType() {
      typeCase_ = 0;
      type_ = null;
      onChanged();
      return this;
    }


    private java.lang.Object resourcePath_ = "";
    /**
     * <pre>
     * Resource path. Elements are separated by slash.
     * The first symbol is not slash.
     * The first element is root resource name.
     * Resource path is the path of resource inside coordination node.
     * </pre>
     *
     * <code>string resource_path = 1;</code>
     * @return The resourcePath.
     */
    public java.lang.String getResourcePath() {
      java.lang.Object ref = resourcePath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourcePath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Resource path. Elements are separated by slash.
     * The first symbol is not slash.
     * The first element is root resource name.
     * Resource path is the path of resource inside coordination node.
     * </pre>
     *
     * <code>string resource_path = 1;</code>
     * @return The bytes for resourcePath.
     */
    public com.google.protobuf.ByteString
        getResourcePathBytes() {
      java.lang.Object ref = resourcePath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourcePath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Resource path. Elements are separated by slash.
     * The first symbol is not slash.
     * The first element is root resource name.
     * Resource path is the path of resource inside coordination node.
     * </pre>
     *
     * <code>string resource_path = 1;</code>
     * @param value The resourcePath to set.
     * @return This builder for chaining.
     */
    public Builder setResourcePath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourcePath_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource path. Elements are separated by slash.
     * The first symbol is not slash.
     * The first element is root resource name.
     * Resource path is the path of resource inside coordination node.
     * </pre>
     *
     * <code>string resource_path = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearResourcePath() {
      
      resourcePath_ = getDefaultInstance().getResourcePath();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource path. Elements are separated by slash.
     * The first symbol is not slash.
     * The first element is root resource name.
     * Resource path is the path of resource inside coordination node.
     * </pre>
     *
     * <code>string resource_path = 1;</code>
     * @param value The bytes for resourcePath to set.
     * @return This builder for chaining.
     */
    public Builder setResourcePathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourcePath_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.yandex.ydb.rate_limiter.HierarchicalDrrSettings, com.yandex.ydb.rate_limiter.HierarchicalDrrSettings.Builder, com.yandex.ydb.rate_limiter.HierarchicalDrrSettingsOrBuilder> hierarchicalDrrBuilder_;
    /**
     * <pre>
     * Settings for Hierarchical DRR algorithm.
     * </pre>
     *
     * <code>.Ydb.RateLimiter.HierarchicalDrrSettings hierarchical_drr = 2;</code>
     * @return Whether the hierarchicalDrr field is set.
     */
    @java.lang.Override
    public boolean hasHierarchicalDrr() {
      return typeCase_ == 2;
    }
    /**
     * <pre>
     * Settings for Hierarchical DRR algorithm.
     * </pre>
     *
     * <code>.Ydb.RateLimiter.HierarchicalDrrSettings hierarchical_drr = 2;</code>
     * @return The hierarchicalDrr.
     */
    @java.lang.Override
    public com.yandex.ydb.rate_limiter.HierarchicalDrrSettings getHierarchicalDrr() {
      if (hierarchicalDrrBuilder_ == null) {
        if (typeCase_ == 2) {
          return (com.yandex.ydb.rate_limiter.HierarchicalDrrSettings) type_;
        }
        return com.yandex.ydb.rate_limiter.HierarchicalDrrSettings.getDefaultInstance();
      } else {
        if (typeCase_ == 2) {
          return hierarchicalDrrBuilder_.getMessage();
        }
        return com.yandex.ydb.rate_limiter.HierarchicalDrrSettings.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Settings for Hierarchical DRR algorithm.
     * </pre>
     *
     * <code>.Ydb.RateLimiter.HierarchicalDrrSettings hierarchical_drr = 2;</code>
     */
    public Builder setHierarchicalDrr(com.yandex.ydb.rate_limiter.HierarchicalDrrSettings value) {
      if (hierarchicalDrrBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
        onChanged();
      } else {
        hierarchicalDrrBuilder_.setMessage(value);
      }
      typeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Settings for Hierarchical DRR algorithm.
     * </pre>
     *
     * <code>.Ydb.RateLimiter.HierarchicalDrrSettings hierarchical_drr = 2;</code>
     */
    public Builder setHierarchicalDrr(
        com.yandex.ydb.rate_limiter.HierarchicalDrrSettings.Builder builderForValue) {
      if (hierarchicalDrrBuilder_ == null) {
        type_ = builderForValue.build();
        onChanged();
      } else {
        hierarchicalDrrBuilder_.setMessage(builderForValue.build());
      }
      typeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Settings for Hierarchical DRR algorithm.
     * </pre>
     *
     * <code>.Ydb.RateLimiter.HierarchicalDrrSettings hierarchical_drr = 2;</code>
     */
    public Builder mergeHierarchicalDrr(com.yandex.ydb.rate_limiter.HierarchicalDrrSettings value) {
      if (hierarchicalDrrBuilder_ == null) {
        if (typeCase_ == 2 &&
            type_ != com.yandex.ydb.rate_limiter.HierarchicalDrrSettings.getDefaultInstance()) {
          type_ = com.yandex.ydb.rate_limiter.HierarchicalDrrSettings.newBuilder((com.yandex.ydb.rate_limiter.HierarchicalDrrSettings) type_)
              .mergeFrom(value).buildPartial();
        } else {
          type_ = value;
        }
        onChanged();
      } else {
        if (typeCase_ == 2) {
          hierarchicalDrrBuilder_.mergeFrom(value);
        }
        hierarchicalDrrBuilder_.setMessage(value);
      }
      typeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Settings for Hierarchical DRR algorithm.
     * </pre>
     *
     * <code>.Ydb.RateLimiter.HierarchicalDrrSettings hierarchical_drr = 2;</code>
     */
    public Builder clearHierarchicalDrr() {
      if (hierarchicalDrrBuilder_ == null) {
        if (typeCase_ == 2) {
          typeCase_ = 0;
          type_ = null;
          onChanged();
        }
      } else {
        if (typeCase_ == 2) {
          typeCase_ = 0;
          type_ = null;
        }
        hierarchicalDrrBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Settings for Hierarchical DRR algorithm.
     * </pre>
     *
     * <code>.Ydb.RateLimiter.HierarchicalDrrSettings hierarchical_drr = 2;</code>
     */
    public com.yandex.ydb.rate_limiter.HierarchicalDrrSettings.Builder getHierarchicalDrrBuilder() {
      return getHierarchicalDrrFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Settings for Hierarchical DRR algorithm.
     * </pre>
     *
     * <code>.Ydb.RateLimiter.HierarchicalDrrSettings hierarchical_drr = 2;</code>
     */
    @java.lang.Override
    public com.yandex.ydb.rate_limiter.HierarchicalDrrSettingsOrBuilder getHierarchicalDrrOrBuilder() {
      if ((typeCase_ == 2) && (hierarchicalDrrBuilder_ != null)) {
        return hierarchicalDrrBuilder_.getMessageOrBuilder();
      } else {
        if (typeCase_ == 2) {
          return (com.yandex.ydb.rate_limiter.HierarchicalDrrSettings) type_;
        }
        return com.yandex.ydb.rate_limiter.HierarchicalDrrSettings.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Settings for Hierarchical DRR algorithm.
     * </pre>
     *
     * <code>.Ydb.RateLimiter.HierarchicalDrrSettings hierarchical_drr = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.yandex.ydb.rate_limiter.HierarchicalDrrSettings, com.yandex.ydb.rate_limiter.HierarchicalDrrSettings.Builder, com.yandex.ydb.rate_limiter.HierarchicalDrrSettingsOrBuilder> 
        getHierarchicalDrrFieldBuilder() {
      if (hierarchicalDrrBuilder_ == null) {
        if (!(typeCase_ == 2)) {
          type_ = com.yandex.ydb.rate_limiter.HierarchicalDrrSettings.getDefaultInstance();
        }
        hierarchicalDrrBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.yandex.ydb.rate_limiter.HierarchicalDrrSettings, com.yandex.ydb.rate_limiter.HierarchicalDrrSettings.Builder, com.yandex.ydb.rate_limiter.HierarchicalDrrSettingsOrBuilder>(
                (com.yandex.ydb.rate_limiter.HierarchicalDrrSettings) type_,
                getParentForChildren(),
                isClean());
        type_ = null;
      }
      typeCase_ = 2;
      onChanged();;
      return hierarchicalDrrBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Ydb.RateLimiter.Resource)
  }

  // @@protoc_insertion_point(class_scope:Ydb.RateLimiter.Resource)
  private static final com.yandex.ydb.rate_limiter.Resource DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.yandex.ydb.rate_limiter.Resource();
  }

  public static com.yandex.ydb.rate_limiter.Resource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Resource>
      PARSER = new com.google.protobuf.AbstractParser<Resource>() {
    @java.lang.Override
    public Resource parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Resource(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Resource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Resource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.yandex.ydb.rate_limiter.Resource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

