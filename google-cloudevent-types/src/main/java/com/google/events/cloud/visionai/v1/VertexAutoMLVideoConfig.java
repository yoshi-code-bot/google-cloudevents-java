/*
 * Copyright 2023 Google LLC
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
// source: google/events/cloud/visionai/v1/data.proto

package com.google.events.cloud.visionai.v1;

/**
 *
 *
 * <pre>
 * Message describing VertexAutoMLVideoConfig.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.visionai.v1.VertexAutoMLVideoConfig}
 */
public final class VertexAutoMLVideoConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.visionai.v1.VertexAutoMLVideoConfig)
    VertexAutoMLVideoConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use VertexAutoMLVideoConfig.newBuilder() to construct.
  private VertexAutoMLVideoConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private VertexAutoMLVideoConfig() {
    blockedLabels_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new VertexAutoMLVideoConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.events.cloud.visionai.v1.Data
        .internal_static_google_events_cloud_visionai_v1_VertexAutoMLVideoConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.visionai.v1.Data
        .internal_static_google_events_cloud_visionai_v1_VertexAutoMLVideoConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig.class,
            com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig.Builder.class);
  }

  public static final int CONFIDENCE_THRESHOLD_FIELD_NUMBER = 1;
  private float confidenceThreshold_ = 0F;
  /**
   *
   *
   * <pre>
   * Only entities with higher score than the threshold will be returned.
   * Value 0.0 means returns all the detected entities.
   * </pre>
   *
   * <code>float confidence_threshold = 1;</code>
   *
   * @return The confidenceThreshold.
   */
  @java.lang.Override
  public float getConfidenceThreshold() {
    return confidenceThreshold_;
  }

  public static final int BLOCKED_LABELS_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringList blockedLabels_;
  /**
   *
   *
   * <pre>
   * Labels specified in this field won't be returned.
   * </pre>
   *
   * <code>repeated string blocked_labels = 2;</code>
   *
   * @return A list containing the blockedLabels.
   */
  public com.google.protobuf.ProtocolStringList getBlockedLabelsList() {
    return blockedLabels_;
  }
  /**
   *
   *
   * <pre>
   * Labels specified in this field won't be returned.
   * </pre>
   *
   * <code>repeated string blocked_labels = 2;</code>
   *
   * @return The count of blockedLabels.
   */
  public int getBlockedLabelsCount() {
    return blockedLabels_.size();
  }
  /**
   *
   *
   * <pre>
   * Labels specified in this field won't be returned.
   * </pre>
   *
   * <code>repeated string blocked_labels = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The blockedLabels at the given index.
   */
  public java.lang.String getBlockedLabels(int index) {
    return blockedLabels_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Labels specified in this field won't be returned.
   * </pre>
   *
   * <code>repeated string blocked_labels = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the blockedLabels at the given index.
   */
  public com.google.protobuf.ByteString getBlockedLabelsBytes(int index) {
    return blockedLabels_.getByteString(index);
  }

  public static final int MAX_PREDICTIONS_FIELD_NUMBER = 3;
  private int maxPredictions_ = 0;
  /**
   *
   *
   * <pre>
   * At most this many predictions will be returned per output frame.
   * Value 0 means to return all the detected entities.
   * </pre>
   *
   * <code>int32 max_predictions = 3;</code>
   *
   * @return The maxPredictions.
   */
  @java.lang.Override
  public int getMaxPredictions() {
    return maxPredictions_;
  }

  public static final int BOUNDING_BOX_SIZE_LIMIT_FIELD_NUMBER = 4;
  private float boundingBoxSizeLimit_ = 0F;
  /**
   *
   *
   * <pre>
   * Only Bounding Box whose size is larger than this limit will be returned.
   * Object Tracking only.
   * Value 0.0 means to return all the detected entities.
   * </pre>
   *
   * <code>float bounding_box_size_limit = 4;</code>
   *
   * @return The boundingBoxSizeLimit.
   */
  @java.lang.Override
  public float getBoundingBoxSizeLimit() {
    return boundingBoxSizeLimit_;
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
    if (java.lang.Float.floatToRawIntBits(confidenceThreshold_) != 0) {
      output.writeFloat(1, confidenceThreshold_);
    }
    for (int i = 0; i < blockedLabels_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, blockedLabels_.getRaw(i));
    }
    if (maxPredictions_ != 0) {
      output.writeInt32(3, maxPredictions_);
    }
    if (java.lang.Float.floatToRawIntBits(boundingBoxSizeLimit_) != 0) {
      output.writeFloat(4, boundingBoxSizeLimit_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Float.floatToRawIntBits(confidenceThreshold_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(1, confidenceThreshold_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < blockedLabels_.size(); i++) {
        dataSize += computeStringSizeNoTag(blockedLabels_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getBlockedLabelsList().size();
    }
    if (maxPredictions_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, maxPredictions_);
    }
    if (java.lang.Float.floatToRawIntBits(boundingBoxSizeLimit_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(4, boundingBoxSizeLimit_);
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
    if (!(obj instanceof com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig)) {
      return super.equals(obj);
    }
    com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig other =
        (com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig) obj;

    if (java.lang.Float.floatToIntBits(getConfidenceThreshold())
        != java.lang.Float.floatToIntBits(other.getConfidenceThreshold())) return false;
    if (!getBlockedLabelsList().equals(other.getBlockedLabelsList())) return false;
    if (getMaxPredictions() != other.getMaxPredictions()) return false;
    if (java.lang.Float.floatToIntBits(getBoundingBoxSizeLimit())
        != java.lang.Float.floatToIntBits(other.getBoundingBoxSizeLimit())) return false;
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
    hash = (37 * hash) + CONFIDENCE_THRESHOLD_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getConfidenceThreshold());
    if (getBlockedLabelsCount() > 0) {
      hash = (37 * hash) + BLOCKED_LABELS_FIELD_NUMBER;
      hash = (53 * hash) + getBlockedLabelsList().hashCode();
    }
    hash = (37 * hash) + MAX_PREDICTIONS_FIELD_NUMBER;
    hash = (53 * hash) + getMaxPredictions();
    hash = (37 * hash) + BOUNDING_BOX_SIZE_LIMIT_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getBoundingBoxSizeLimit());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig parseFrom(
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

  public static Builder newBuilder(
      com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig prototype) {
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
   * Message describing VertexAutoMLVideoConfig.
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.visionai.v1.VertexAutoMLVideoConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.visionai.v1.VertexAutoMLVideoConfig)
      com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.events.cloud.visionai.v1.Data
          .internal_static_google_events_cloud_visionai_v1_VertexAutoMLVideoConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.visionai.v1.Data
          .internal_static_google_events_cloud_visionai_v1_VertexAutoMLVideoConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig.class,
              com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig.Builder.class);
    }

    // Construct using com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      confidenceThreshold_ = 0F;
      blockedLabels_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      maxPredictions_ = 0;
      boundingBoxSizeLimit_ = 0F;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.events.cloud.visionai.v1.Data
          .internal_static_google_events_cloud_visionai_v1_VertexAutoMLVideoConfig_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig getDefaultInstanceForType() {
      return com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig build() {
      com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig buildPartial() {
      com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig result =
          new com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig result) {
      if (((bitField0_ & 0x00000002) != 0)) {
        blockedLabels_ = blockedLabels_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.blockedLabels_ = blockedLabels_;
    }

    private void buildPartial0(com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.confidenceThreshold_ = confidenceThreshold_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.maxPredictions_ = maxPredictions_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.boundingBoxSizeLimit_ = boundingBoxSizeLimit_;
      }
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
      if (other instanceof com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig) {
        return mergeFrom((com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig other) {
      if (other == com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig.getDefaultInstance())
        return this;
      if (other.getConfidenceThreshold() != 0F) {
        setConfidenceThreshold(other.getConfidenceThreshold());
      }
      if (!other.blockedLabels_.isEmpty()) {
        if (blockedLabels_.isEmpty()) {
          blockedLabels_ = other.blockedLabels_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureBlockedLabelsIsMutable();
          blockedLabels_.addAll(other.blockedLabels_);
        }
        onChanged();
      }
      if (other.getMaxPredictions() != 0) {
        setMaxPredictions(other.getMaxPredictions());
      }
      if (other.getBoundingBoxSizeLimit() != 0F) {
        setBoundingBoxSizeLimit(other.getBoundingBoxSizeLimit());
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
            case 13:
              {
                confidenceThreshold_ = input.readFloat();
                bitField0_ |= 0x00000001;
                break;
              } // case 13
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureBlockedLabelsIsMutable();
                blockedLabels_.add(s);
                break;
              } // case 18
            case 24:
              {
                maxPredictions_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            case 37:
              {
                boundingBoxSizeLimit_ = input.readFloat();
                bitField0_ |= 0x00000008;
                break;
              } // case 37
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

    private int bitField0_;

    private float confidenceThreshold_;
    /**
     *
     *
     * <pre>
     * Only entities with higher score than the threshold will be returned.
     * Value 0.0 means returns all the detected entities.
     * </pre>
     *
     * <code>float confidence_threshold = 1;</code>
     *
     * @return The confidenceThreshold.
     */
    @java.lang.Override
    public float getConfidenceThreshold() {
      return confidenceThreshold_;
    }
    /**
     *
     *
     * <pre>
     * Only entities with higher score than the threshold will be returned.
     * Value 0.0 means returns all the detected entities.
     * </pre>
     *
     * <code>float confidence_threshold = 1;</code>
     *
     * @param value The confidenceThreshold to set.
     * @return This builder for chaining.
     */
    public Builder setConfidenceThreshold(float value) {

      confidenceThreshold_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Only entities with higher score than the threshold will be returned.
     * Value 0.0 means returns all the detected entities.
     * </pre>
     *
     * <code>float confidence_threshold = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearConfidenceThreshold() {
      bitField0_ = (bitField0_ & ~0x00000001);
      confidenceThreshold_ = 0F;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList blockedLabels_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureBlockedLabelsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        blockedLabels_ = new com.google.protobuf.LazyStringArrayList(blockedLabels_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     *
     *
     * <pre>
     * Labels specified in this field won't be returned.
     * </pre>
     *
     * <code>repeated string blocked_labels = 2;</code>
     *
     * @return A list containing the blockedLabels.
     */
    public com.google.protobuf.ProtocolStringList getBlockedLabelsList() {
      return blockedLabels_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * Labels specified in this field won't be returned.
     * </pre>
     *
     * <code>repeated string blocked_labels = 2;</code>
     *
     * @return The count of blockedLabels.
     */
    public int getBlockedLabelsCount() {
      return blockedLabels_.size();
    }
    /**
     *
     *
     * <pre>
     * Labels specified in this field won't be returned.
     * </pre>
     *
     * <code>repeated string blocked_labels = 2;</code>
     *
     * @param index The index of the element to return.
     * @return The blockedLabels at the given index.
     */
    public java.lang.String getBlockedLabels(int index) {
      return blockedLabels_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Labels specified in this field won't be returned.
     * </pre>
     *
     * <code>repeated string blocked_labels = 2;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the blockedLabels at the given index.
     */
    public com.google.protobuf.ByteString getBlockedLabelsBytes(int index) {
      return blockedLabels_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Labels specified in this field won't be returned.
     * </pre>
     *
     * <code>repeated string blocked_labels = 2;</code>
     *
     * @param index The index to set the value at.
     * @param value The blockedLabels to set.
     * @return This builder for chaining.
     */
    public Builder setBlockedLabels(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureBlockedLabelsIsMutable();
      blockedLabels_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Labels specified in this field won't be returned.
     * </pre>
     *
     * <code>repeated string blocked_labels = 2;</code>
     *
     * @param value The blockedLabels to add.
     * @return This builder for chaining.
     */
    public Builder addBlockedLabels(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureBlockedLabelsIsMutable();
      blockedLabels_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Labels specified in this field won't be returned.
     * </pre>
     *
     * <code>repeated string blocked_labels = 2;</code>
     *
     * @param values The blockedLabels to add.
     * @return This builder for chaining.
     */
    public Builder addAllBlockedLabels(java.lang.Iterable<java.lang.String> values) {
      ensureBlockedLabelsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, blockedLabels_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Labels specified in this field won't be returned.
     * </pre>
     *
     * <code>repeated string blocked_labels = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBlockedLabels() {
      blockedLabels_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Labels specified in this field won't be returned.
     * </pre>
     *
     * <code>repeated string blocked_labels = 2;</code>
     *
     * @param value The bytes of the blockedLabels to add.
     * @return This builder for chaining.
     */
    public Builder addBlockedLabelsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureBlockedLabelsIsMutable();
      blockedLabels_.add(value);
      onChanged();
      return this;
    }

    private int maxPredictions_;
    /**
     *
     *
     * <pre>
     * At most this many predictions will be returned per output frame.
     * Value 0 means to return all the detected entities.
     * </pre>
     *
     * <code>int32 max_predictions = 3;</code>
     *
     * @return The maxPredictions.
     */
    @java.lang.Override
    public int getMaxPredictions() {
      return maxPredictions_;
    }
    /**
     *
     *
     * <pre>
     * At most this many predictions will be returned per output frame.
     * Value 0 means to return all the detected entities.
     * </pre>
     *
     * <code>int32 max_predictions = 3;</code>
     *
     * @param value The maxPredictions to set.
     * @return This builder for chaining.
     */
    public Builder setMaxPredictions(int value) {

      maxPredictions_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * At most this many predictions will be returned per output frame.
     * Value 0 means to return all the detected entities.
     * </pre>
     *
     * <code>int32 max_predictions = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMaxPredictions() {
      bitField0_ = (bitField0_ & ~0x00000004);
      maxPredictions_ = 0;
      onChanged();
      return this;
    }

    private float boundingBoxSizeLimit_;
    /**
     *
     *
     * <pre>
     * Only Bounding Box whose size is larger than this limit will be returned.
     * Object Tracking only.
     * Value 0.0 means to return all the detected entities.
     * </pre>
     *
     * <code>float bounding_box_size_limit = 4;</code>
     *
     * @return The boundingBoxSizeLimit.
     */
    @java.lang.Override
    public float getBoundingBoxSizeLimit() {
      return boundingBoxSizeLimit_;
    }
    /**
     *
     *
     * <pre>
     * Only Bounding Box whose size is larger than this limit will be returned.
     * Object Tracking only.
     * Value 0.0 means to return all the detected entities.
     * </pre>
     *
     * <code>float bounding_box_size_limit = 4;</code>
     *
     * @param value The boundingBoxSizeLimit to set.
     * @return This builder for chaining.
     */
    public Builder setBoundingBoxSizeLimit(float value) {

      boundingBoxSizeLimit_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Only Bounding Box whose size is larger than this limit will be returned.
     * Object Tracking only.
     * Value 0.0 means to return all the detected entities.
     * </pre>
     *
     * <code>float bounding_box_size_limit = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBoundingBoxSizeLimit() {
      bitField0_ = (bitField0_ & ~0x00000008);
      boundingBoxSizeLimit_ = 0F;
      onChanged();
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

    // @@protoc_insertion_point(builder_scope:google.events.cloud.visionai.v1.VertexAutoMLVideoConfig)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.visionai.v1.VertexAutoMLVideoConfig)
  private static final com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig();
  }

  public static com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VertexAutoMLVideoConfig> PARSER =
      new com.google.protobuf.AbstractParser<VertexAutoMLVideoConfig>() {
        @java.lang.Override
        public VertexAutoMLVideoConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<VertexAutoMLVideoConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VertexAutoMLVideoConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
