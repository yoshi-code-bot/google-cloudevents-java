/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/cloud/metastore/v1/data.proto

package com.google.events.cloud.metastore.v1;

/**
 *
 *
 * <pre>
 * Represents the scaling configuration of a metastore service.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.metastore.v1.ScalingConfig}
 */
public final class ScalingConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.metastore.v1.ScalingConfig)
    ScalingConfigOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ScalingConfig.newBuilder() to construct.
  private ScalingConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ScalingConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ScalingConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.events.cloud.metastore.v1.Data
        .internal_static_google_events_cloud_metastore_v1_ScalingConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.metastore.v1.Data
        .internal_static_google_events_cloud_metastore_v1_ScalingConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.metastore.v1.ScalingConfig.class,
            com.google.events.cloud.metastore.v1.ScalingConfig.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Metastore instance sizes.
   * </pre>
   *
   * Protobuf enum {@code google.events.cloud.metastore.v1.ScalingConfig.InstanceSize}
   */
  public enum InstanceSize implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Unspecified instance size
     * </pre>
     *
     * <code>INSTANCE_SIZE_UNSPECIFIED = 0;</code>
     */
    INSTANCE_SIZE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Extra small instance size, maps to a scaling factor of 0.1.
     * </pre>
     *
     * <code>EXTRA_SMALL = 1;</code>
     */
    EXTRA_SMALL(1),
    /**
     *
     *
     * <pre>
     * Small instance size, maps to a scaling factor of 0.5.
     * </pre>
     *
     * <code>SMALL = 2;</code>
     */
    SMALL(2),
    /**
     *
     *
     * <pre>
     * Medium instance size, maps to a scaling factor of 1.0.
     * </pre>
     *
     * <code>MEDIUM = 3;</code>
     */
    MEDIUM(3),
    /**
     *
     *
     * <pre>
     * Large instance size, maps to a scaling factor of 3.0.
     * </pre>
     *
     * <code>LARGE = 4;</code>
     */
    LARGE(4),
    /**
     *
     *
     * <pre>
     * Extra large instance size, maps to a scaling factor of 6.0.
     * </pre>
     *
     * <code>EXTRA_LARGE = 5;</code>
     */
    EXTRA_LARGE(5),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Unspecified instance size
     * </pre>
     *
     * <code>INSTANCE_SIZE_UNSPECIFIED = 0;</code>
     */
    public static final int INSTANCE_SIZE_UNSPECIFIED_VALUE = 0;

    /**
     *
     *
     * <pre>
     * Extra small instance size, maps to a scaling factor of 0.1.
     * </pre>
     *
     * <code>EXTRA_SMALL = 1;</code>
     */
    public static final int EXTRA_SMALL_VALUE = 1;

    /**
     *
     *
     * <pre>
     * Small instance size, maps to a scaling factor of 0.5.
     * </pre>
     *
     * <code>SMALL = 2;</code>
     */
    public static final int SMALL_VALUE = 2;

    /**
     *
     *
     * <pre>
     * Medium instance size, maps to a scaling factor of 1.0.
     * </pre>
     *
     * <code>MEDIUM = 3;</code>
     */
    public static final int MEDIUM_VALUE = 3;

    /**
     *
     *
     * <pre>
     * Large instance size, maps to a scaling factor of 3.0.
     * </pre>
     *
     * <code>LARGE = 4;</code>
     */
    public static final int LARGE_VALUE = 4;

    /**
     *
     *
     * <pre>
     * Extra large instance size, maps to a scaling factor of 6.0.
     * </pre>
     *
     * <code>EXTRA_LARGE = 5;</code>
     */
    public static final int EXTRA_LARGE_VALUE = 5;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static InstanceSize valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static InstanceSize forNumber(int value) {
      switch (value) {
        case 0:
          return INSTANCE_SIZE_UNSPECIFIED;
        case 1:
          return EXTRA_SMALL;
        case 2:
          return SMALL;
        case 3:
          return MEDIUM;
        case 4:
          return LARGE;
        case 5:
          return EXTRA_LARGE;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<InstanceSize> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<InstanceSize> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<InstanceSize>() {
          public InstanceSize findValueByNumber(int number) {
            return InstanceSize.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.events.cloud.metastore.v1.ScalingConfig.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final InstanceSize[] VALUES = values();

    public static InstanceSize valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private InstanceSize(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.events.cloud.metastore.v1.ScalingConfig.InstanceSize)
  }

  private int scalingModelCase_ = 0;
  private java.lang.Object scalingModel_;

  public enum ScalingModelCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    INSTANCE_SIZE(1),
    SCALING_FACTOR(2),
    SCALINGMODEL_NOT_SET(0);
    private final int value;

    private ScalingModelCase(int value) {
      this.value = value;
    }

    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ScalingModelCase valueOf(int value) {
      return forNumber(value);
    }

    public static ScalingModelCase forNumber(int value) {
      switch (value) {
        case 1:
          return INSTANCE_SIZE;
        case 2:
          return SCALING_FACTOR;
        case 0:
          return SCALINGMODEL_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public ScalingModelCase getScalingModelCase() {
    return ScalingModelCase.forNumber(scalingModelCase_);
  }

  public static final int INSTANCE_SIZE_FIELD_NUMBER = 1;

  /**
   *
   *
   * <pre>
   * An enum of readable instance sizes, with each instance size mapping to a
   * float value (e.g. InstanceSize.EXTRA_SMALL = scaling_factor(0.1))
   * </pre>
   *
   * <code>.google.events.cloud.metastore.v1.ScalingConfig.InstanceSize instance_size = 1;</code>
   *
   * @return Whether the instanceSize field is set.
   */
  public boolean hasInstanceSize() {
    return scalingModelCase_ == 1;
  }

  /**
   *
   *
   * <pre>
   * An enum of readable instance sizes, with each instance size mapping to a
   * float value (e.g. InstanceSize.EXTRA_SMALL = scaling_factor(0.1))
   * </pre>
   *
   * <code>.google.events.cloud.metastore.v1.ScalingConfig.InstanceSize instance_size = 1;</code>
   *
   * @return The enum numeric value on the wire for instanceSize.
   */
  public int getInstanceSizeValue() {
    if (scalingModelCase_ == 1) {
      return (java.lang.Integer) scalingModel_;
    }
    return 0;
  }

  /**
   *
   *
   * <pre>
   * An enum of readable instance sizes, with each instance size mapping to a
   * float value (e.g. InstanceSize.EXTRA_SMALL = scaling_factor(0.1))
   * </pre>
   *
   * <code>.google.events.cloud.metastore.v1.ScalingConfig.InstanceSize instance_size = 1;</code>
   *
   * @return The instanceSize.
   */
  public com.google.events.cloud.metastore.v1.ScalingConfig.InstanceSize getInstanceSize() {
    if (scalingModelCase_ == 1) {
      com.google.events.cloud.metastore.v1.ScalingConfig.InstanceSize result =
          com.google.events.cloud.metastore.v1.ScalingConfig.InstanceSize.forNumber(
              (java.lang.Integer) scalingModel_);
      return result == null
          ? com.google.events.cloud.metastore.v1.ScalingConfig.InstanceSize.UNRECOGNIZED
          : result;
    }
    return com.google.events.cloud.metastore.v1.ScalingConfig.InstanceSize
        .INSTANCE_SIZE_UNSPECIFIED;
  }

  public static final int SCALING_FACTOR_FIELD_NUMBER = 2;

  /**
   *
   *
   * <pre>
   * Scaling factor, increments of 0.1 for values less than 1.0, and
   * increments of 1.0 for values greater than 1.0.
   * </pre>
   *
   * <code>float scaling_factor = 2;</code>
   *
   * @return Whether the scalingFactor field is set.
   */
  @java.lang.Override
  public boolean hasScalingFactor() {
    return scalingModelCase_ == 2;
  }

  /**
   *
   *
   * <pre>
   * Scaling factor, increments of 0.1 for values less than 1.0, and
   * increments of 1.0 for values greater than 1.0.
   * </pre>
   *
   * <code>float scaling_factor = 2;</code>
   *
   * @return The scalingFactor.
   */
  @java.lang.Override
  public float getScalingFactor() {
    if (scalingModelCase_ == 2) {
      return (java.lang.Float) scalingModel_;
    }
    return 0F;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (scalingModelCase_ == 1) {
      output.writeEnum(1, ((java.lang.Integer) scalingModel_));
    }
    if (scalingModelCase_ == 2) {
      output.writeFloat(2, (float) ((java.lang.Float) scalingModel_));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (scalingModelCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeEnumSize(
              1, ((java.lang.Integer) scalingModel_));
    }
    if (scalingModelCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeFloatSize(
              2, (float) ((java.lang.Float) scalingModel_));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.events.cloud.metastore.v1.ScalingConfig)) {
      return super.equals(obj);
    }
    com.google.events.cloud.metastore.v1.ScalingConfig other =
        (com.google.events.cloud.metastore.v1.ScalingConfig) obj;

    if (!getScalingModelCase().equals(other.getScalingModelCase())) return false;
    switch (scalingModelCase_) {
      case 1:
        if (getInstanceSizeValue() != other.getInstanceSizeValue()) return false;
        break;
      case 2:
        if (java.lang.Float.floatToIntBits(getScalingFactor())
            != java.lang.Float.floatToIntBits(other.getScalingFactor())) return false;
        break;
      case 0:
      default:
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (scalingModelCase_) {
      case 1:
        hash = (37 * hash) + INSTANCE_SIZE_FIELD_NUMBER;
        hash = (53 * hash) + getInstanceSizeValue();
        break;
      case 2:
        hash = (37 * hash) + SCALING_FACTOR_FIELD_NUMBER;
        hash = (53 * hash) + java.lang.Float.floatToIntBits(getScalingFactor());
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.cloud.metastore.v1.ScalingConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.metastore.v1.ScalingConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.metastore.v1.ScalingConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.metastore.v1.ScalingConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.metastore.v1.ScalingConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.metastore.v1.ScalingConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.metastore.v1.ScalingConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.metastore.v1.ScalingConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.metastore.v1.ScalingConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.metastore.v1.ScalingConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.metastore.v1.ScalingConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.metastore.v1.ScalingConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.events.cloud.metastore.v1.ScalingConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }

  /**
   *
   *
   * <pre>
   * Represents the scaling configuration of a metastore service.
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.metastore.v1.ScalingConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.metastore.v1.ScalingConfig)
      com.google.events.cloud.metastore.v1.ScalingConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.events.cloud.metastore.v1.Data
          .internal_static_google_events_cloud_metastore_v1_ScalingConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.metastore.v1.Data
          .internal_static_google_events_cloud_metastore_v1_ScalingConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.metastore.v1.ScalingConfig.class,
              com.google.events.cloud.metastore.v1.ScalingConfig.Builder.class);
    }

    // Construct using com.google.events.cloud.metastore.v1.ScalingConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      scalingModelCase_ = 0;
      scalingModel_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.events.cloud.metastore.v1.Data
          .internal_static_google_events_cloud_metastore_v1_ScalingConfig_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.metastore.v1.ScalingConfig getDefaultInstanceForType() {
      return com.google.events.cloud.metastore.v1.ScalingConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.metastore.v1.ScalingConfig build() {
      com.google.events.cloud.metastore.v1.ScalingConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.metastore.v1.ScalingConfig buildPartial() {
      com.google.events.cloud.metastore.v1.ScalingConfig result =
          new com.google.events.cloud.metastore.v1.ScalingConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.events.cloud.metastore.v1.ScalingConfig result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.events.cloud.metastore.v1.ScalingConfig result) {
      result.scalingModelCase_ = scalingModelCase_;
      result.scalingModel_ = this.scalingModel_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.events.cloud.metastore.v1.ScalingConfig) {
        return mergeFrom((com.google.events.cloud.metastore.v1.ScalingConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.events.cloud.metastore.v1.ScalingConfig other) {
      if (other == com.google.events.cloud.metastore.v1.ScalingConfig.getDefaultInstance())
        return this;
      switch (other.getScalingModelCase()) {
        case INSTANCE_SIZE:
          {
            setInstanceSizeValue(other.getInstanceSizeValue());
            break;
          }
        case SCALING_FACTOR:
          {
            setScalingFactor(other.getScalingFactor());
            break;
          }
        case SCALINGMODEL_NOT_SET:
          {
            break;
          }
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8:
              {
                int rawValue = input.readEnum();
                scalingModelCase_ = 1;
                scalingModel_ = rawValue;
                break;
              } // case 8
            case 21:
              {
                scalingModel_ = input.readFloat();
                scalingModelCase_ = 2;
                break;
              } // case 21
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int scalingModelCase_ = 0;
    private java.lang.Object scalingModel_;

    public ScalingModelCase getScalingModelCase() {
      return ScalingModelCase.forNumber(scalingModelCase_);
    }

    public Builder clearScalingModel() {
      scalingModelCase_ = 0;
      scalingModel_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     *
     *
     * <pre>
     * An enum of readable instance sizes, with each instance size mapping to a
     * float value (e.g. InstanceSize.EXTRA_SMALL = scaling_factor(0.1))
     * </pre>
     *
     * <code>.google.events.cloud.metastore.v1.ScalingConfig.InstanceSize instance_size = 1;</code>
     *
     * @return Whether the instanceSize field is set.
     */
    @java.lang.Override
    public boolean hasInstanceSize() {
      return scalingModelCase_ == 1;
    }

    /**
     *
     *
     * <pre>
     * An enum of readable instance sizes, with each instance size mapping to a
     * float value (e.g. InstanceSize.EXTRA_SMALL = scaling_factor(0.1))
     * </pre>
     *
     * <code>.google.events.cloud.metastore.v1.ScalingConfig.InstanceSize instance_size = 1;</code>
     *
     * @return The enum numeric value on the wire for instanceSize.
     */
    @java.lang.Override
    public int getInstanceSizeValue() {
      if (scalingModelCase_ == 1) {
        return ((java.lang.Integer) scalingModel_).intValue();
      }
      return 0;
    }

    /**
     *
     *
     * <pre>
     * An enum of readable instance sizes, with each instance size mapping to a
     * float value (e.g. InstanceSize.EXTRA_SMALL = scaling_factor(0.1))
     * </pre>
     *
     * <code>.google.events.cloud.metastore.v1.ScalingConfig.InstanceSize instance_size = 1;</code>
     *
     * @param value The enum numeric value on the wire for instanceSize to set.
     * @return This builder for chaining.
     */
    public Builder setInstanceSizeValue(int value) {
      scalingModelCase_ = 1;
      scalingModel_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * An enum of readable instance sizes, with each instance size mapping to a
     * float value (e.g. InstanceSize.EXTRA_SMALL = scaling_factor(0.1))
     * </pre>
     *
     * <code>.google.events.cloud.metastore.v1.ScalingConfig.InstanceSize instance_size = 1;</code>
     *
     * @return The instanceSize.
     */
    @java.lang.Override
    public com.google.events.cloud.metastore.v1.ScalingConfig.InstanceSize getInstanceSize() {
      if (scalingModelCase_ == 1) {
        com.google.events.cloud.metastore.v1.ScalingConfig.InstanceSize result =
            com.google.events.cloud.metastore.v1.ScalingConfig.InstanceSize.forNumber(
                (java.lang.Integer) scalingModel_);
        return result == null
            ? com.google.events.cloud.metastore.v1.ScalingConfig.InstanceSize.UNRECOGNIZED
            : result;
      }
      return com.google.events.cloud.metastore.v1.ScalingConfig.InstanceSize
          .INSTANCE_SIZE_UNSPECIFIED;
    }

    /**
     *
     *
     * <pre>
     * An enum of readable instance sizes, with each instance size mapping to a
     * float value (e.g. InstanceSize.EXTRA_SMALL = scaling_factor(0.1))
     * </pre>
     *
     * <code>.google.events.cloud.metastore.v1.ScalingConfig.InstanceSize instance_size = 1;</code>
     *
     * @param value The instanceSize to set.
     * @return This builder for chaining.
     */
    public Builder setInstanceSize(
        com.google.events.cloud.metastore.v1.ScalingConfig.InstanceSize value) {
      if (value == null) {
        throw new NullPointerException();
      }
      scalingModelCase_ = 1;
      scalingModel_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * An enum of readable instance sizes, with each instance size mapping to a
     * float value (e.g. InstanceSize.EXTRA_SMALL = scaling_factor(0.1))
     * </pre>
     *
     * <code>.google.events.cloud.metastore.v1.ScalingConfig.InstanceSize instance_size = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInstanceSize() {
      if (scalingModelCase_ == 1) {
        scalingModelCase_ = 0;
        scalingModel_ = null;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Scaling factor, increments of 0.1 for values less than 1.0, and
     * increments of 1.0 for values greater than 1.0.
     * </pre>
     *
     * <code>float scaling_factor = 2;</code>
     *
     * @return Whether the scalingFactor field is set.
     */
    public boolean hasScalingFactor() {
      return scalingModelCase_ == 2;
    }

    /**
     *
     *
     * <pre>
     * Scaling factor, increments of 0.1 for values less than 1.0, and
     * increments of 1.0 for values greater than 1.0.
     * </pre>
     *
     * <code>float scaling_factor = 2;</code>
     *
     * @return The scalingFactor.
     */
    public float getScalingFactor() {
      if (scalingModelCase_ == 2) {
        return (java.lang.Float) scalingModel_;
      }
      return 0F;
    }

    /**
     *
     *
     * <pre>
     * Scaling factor, increments of 0.1 for values less than 1.0, and
     * increments of 1.0 for values greater than 1.0.
     * </pre>
     *
     * <code>float scaling_factor = 2;</code>
     *
     * @param value The scalingFactor to set.
     * @return This builder for chaining.
     */
    public Builder setScalingFactor(float value) {

      scalingModelCase_ = 2;
      scalingModel_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Scaling factor, increments of 0.1 for values less than 1.0, and
     * increments of 1.0 for values greater than 1.0.
     * </pre>
     *
     * <code>float scaling_factor = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearScalingFactor() {
      if (scalingModelCase_ == 2) {
        scalingModelCase_ = 0;
        scalingModel_ = null;
        onChanged();
      }
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.events.cloud.metastore.v1.ScalingConfig)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.metastore.v1.ScalingConfig)
  private static final com.google.events.cloud.metastore.v1.ScalingConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.events.cloud.metastore.v1.ScalingConfig();
  }

  public static com.google.events.cloud.metastore.v1.ScalingConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ScalingConfig> PARSER =
      new com.google.protobuf.AbstractParser<ScalingConfig>() {
        @java.lang.Override
        public ScalingConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<ScalingConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ScalingConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.metastore.v1.ScalingConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
