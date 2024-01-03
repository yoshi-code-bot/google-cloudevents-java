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
// source: google/events/cloud/visionai/v1/data.proto

package com.google.events.cloud.visionai.v1;

/**
 *
 *
 * <pre>
 * Message describing Video Stream Input Config.
 * This message should only be used as a placeholder for builtin:stream-input
 * processor, actual stream binding should be specified using corresponding
 * API.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.visionai.v1.VideoStreamInputConfig}
 */
public final class VideoStreamInputConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.visionai.v1.VideoStreamInputConfig)
    VideoStreamInputConfigOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use VideoStreamInputConfig.newBuilder() to construct.
  private VideoStreamInputConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private VideoStreamInputConfig() {
    streams_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    streamsWithAnnotation_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new VideoStreamInputConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.events.cloud.visionai.v1.Data
        .internal_static_google_events_cloud_visionai_v1_VideoStreamInputConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.visionai.v1.Data
        .internal_static_google_events_cloud_visionai_v1_VideoStreamInputConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.visionai.v1.VideoStreamInputConfig.class,
            com.google.events.cloud.visionai.v1.VideoStreamInputConfig.Builder.class);
  }

  public static final int STREAMS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringList streams_;

  /**
   * <code>repeated string streams = 1;</code>
   *
   * @return A list containing the streams.
   */
  public com.google.protobuf.ProtocolStringList getStreamsList() {
    return streams_;
  }

  /**
   * <code>repeated string streams = 1;</code>
   *
   * @return The count of streams.
   */
  public int getStreamsCount() {
    return streams_.size();
  }

  /**
   * <code>repeated string streams = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The streams at the given index.
   */
  public java.lang.String getStreams(int index) {
    return streams_.get(index);
  }

  /**
   * <code>repeated string streams = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the streams at the given index.
   */
  public com.google.protobuf.ByteString getStreamsBytes(int index) {
    return streams_.getByteString(index);
  }

  public static final int STREAMS_WITH_ANNOTATION_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private java.util.List<com.google.events.cloud.visionai.v1.StreamWithAnnotation>
      streamsWithAnnotation_;

  /**
   * <code>
   * repeated .google.events.cloud.visionai.v1.StreamWithAnnotation streams_with_annotation = 2;
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.events.cloud.visionai.v1.StreamWithAnnotation>
      getStreamsWithAnnotationList() {
    return streamsWithAnnotation_;
  }

  /**
   * <code>
   * repeated .google.events.cloud.visionai.v1.StreamWithAnnotation streams_with_annotation = 2;
   * </code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.events.cloud.visionai.v1.StreamWithAnnotationOrBuilder>
      getStreamsWithAnnotationOrBuilderList() {
    return streamsWithAnnotation_;
  }

  /**
   * <code>
   * repeated .google.events.cloud.visionai.v1.StreamWithAnnotation streams_with_annotation = 2;
   * </code>
   */
  @java.lang.Override
  public int getStreamsWithAnnotationCount() {
    return streamsWithAnnotation_.size();
  }

  /**
   * <code>
   * repeated .google.events.cloud.visionai.v1.StreamWithAnnotation streams_with_annotation = 2;
   * </code>
   */
  @java.lang.Override
  public com.google.events.cloud.visionai.v1.StreamWithAnnotation getStreamsWithAnnotation(
      int index) {
    return streamsWithAnnotation_.get(index);
  }

  /**
   * <code>
   * repeated .google.events.cloud.visionai.v1.StreamWithAnnotation streams_with_annotation = 2;
   * </code>
   */
  @java.lang.Override
  public com.google.events.cloud.visionai.v1.StreamWithAnnotationOrBuilder
      getStreamsWithAnnotationOrBuilder(int index) {
    return streamsWithAnnotation_.get(index);
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
    for (int i = 0; i < streams_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, streams_.getRaw(i));
    }
    for (int i = 0; i < streamsWithAnnotation_.size(); i++) {
      output.writeMessage(2, streamsWithAnnotation_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < streams_.size(); i++) {
        dataSize += computeStringSizeNoTag(streams_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getStreamsList().size();
    }
    for (int i = 0; i < streamsWithAnnotation_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, streamsWithAnnotation_.get(i));
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
    if (!(obj instanceof com.google.events.cloud.visionai.v1.VideoStreamInputConfig)) {
      return super.equals(obj);
    }
    com.google.events.cloud.visionai.v1.VideoStreamInputConfig other =
        (com.google.events.cloud.visionai.v1.VideoStreamInputConfig) obj;

    if (!getStreamsList().equals(other.getStreamsList())) return false;
    if (!getStreamsWithAnnotationList().equals(other.getStreamsWithAnnotationList())) return false;
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
    if (getStreamsCount() > 0) {
      hash = (37 * hash) + STREAMS_FIELD_NUMBER;
      hash = (53 * hash) + getStreamsList().hashCode();
    }
    if (getStreamsWithAnnotationCount() > 0) {
      hash = (37 * hash) + STREAMS_WITH_ANNOTATION_FIELD_NUMBER;
      hash = (53 * hash) + getStreamsWithAnnotationList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.cloud.visionai.v1.VideoStreamInputConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.visionai.v1.VideoStreamInputConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.visionai.v1.VideoStreamInputConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.visionai.v1.VideoStreamInputConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.visionai.v1.VideoStreamInputConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.visionai.v1.VideoStreamInputConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.visionai.v1.VideoStreamInputConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.visionai.v1.VideoStreamInputConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.visionai.v1.VideoStreamInputConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.visionai.v1.VideoStreamInputConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.visionai.v1.VideoStreamInputConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.visionai.v1.VideoStreamInputConfig parseFrom(
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
      com.google.events.cloud.visionai.v1.VideoStreamInputConfig prototype) {
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
   * Message describing Video Stream Input Config.
   * This message should only be used as a placeholder for builtin:stream-input
   * processor, actual stream binding should be specified using corresponding
   * API.
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.visionai.v1.VideoStreamInputConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.visionai.v1.VideoStreamInputConfig)
      com.google.events.cloud.visionai.v1.VideoStreamInputConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.events.cloud.visionai.v1.Data
          .internal_static_google_events_cloud_visionai_v1_VideoStreamInputConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.visionai.v1.Data
          .internal_static_google_events_cloud_visionai_v1_VideoStreamInputConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.visionai.v1.VideoStreamInputConfig.class,
              com.google.events.cloud.visionai.v1.VideoStreamInputConfig.Builder.class);
    }

    // Construct using com.google.events.cloud.visionai.v1.VideoStreamInputConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      streams_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      if (streamsWithAnnotationBuilder_ == null) {
        streamsWithAnnotation_ = java.util.Collections.emptyList();
      } else {
        streamsWithAnnotation_ = null;
        streamsWithAnnotationBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.events.cloud.visionai.v1.Data
          .internal_static_google_events_cloud_visionai_v1_VideoStreamInputConfig_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.visionai.v1.VideoStreamInputConfig getDefaultInstanceForType() {
      return com.google.events.cloud.visionai.v1.VideoStreamInputConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.visionai.v1.VideoStreamInputConfig build() {
      com.google.events.cloud.visionai.v1.VideoStreamInputConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.visionai.v1.VideoStreamInputConfig buildPartial() {
      com.google.events.cloud.visionai.v1.VideoStreamInputConfig result =
          new com.google.events.cloud.visionai.v1.VideoStreamInputConfig(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.events.cloud.visionai.v1.VideoStreamInputConfig result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        streams_ = streams_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.streams_ = streams_;
      if (streamsWithAnnotationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          streamsWithAnnotation_ = java.util.Collections.unmodifiableList(streamsWithAnnotation_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.streamsWithAnnotation_ = streamsWithAnnotation_;
      } else {
        result.streamsWithAnnotation_ = streamsWithAnnotationBuilder_.build();
      }
    }

    private void buildPartial0(com.google.events.cloud.visionai.v1.VideoStreamInputConfig result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.events.cloud.visionai.v1.VideoStreamInputConfig) {
        return mergeFrom((com.google.events.cloud.visionai.v1.VideoStreamInputConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.events.cloud.visionai.v1.VideoStreamInputConfig other) {
      if (other == com.google.events.cloud.visionai.v1.VideoStreamInputConfig.getDefaultInstance())
        return this;
      if (!other.streams_.isEmpty()) {
        if (streams_.isEmpty()) {
          streams_ = other.streams_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureStreamsIsMutable();
          streams_.addAll(other.streams_);
        }
        onChanged();
      }
      if (streamsWithAnnotationBuilder_ == null) {
        if (!other.streamsWithAnnotation_.isEmpty()) {
          if (streamsWithAnnotation_.isEmpty()) {
            streamsWithAnnotation_ = other.streamsWithAnnotation_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureStreamsWithAnnotationIsMutable();
            streamsWithAnnotation_.addAll(other.streamsWithAnnotation_);
          }
          onChanged();
        }
      } else {
        if (!other.streamsWithAnnotation_.isEmpty()) {
          if (streamsWithAnnotationBuilder_.isEmpty()) {
            streamsWithAnnotationBuilder_.dispose();
            streamsWithAnnotationBuilder_ = null;
            streamsWithAnnotation_ = other.streamsWithAnnotation_;
            bitField0_ = (bitField0_ & ~0x00000002);
            streamsWithAnnotationBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getStreamsWithAnnotationFieldBuilder()
                    : null;
          } else {
            streamsWithAnnotationBuilder_.addAllMessages(other.streamsWithAnnotation_);
          }
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
            case 10:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureStreamsIsMutable();
                streams_.add(s);
                break;
              } // case 10
            case 18:
              {
                com.google.events.cloud.visionai.v1.StreamWithAnnotation m =
                    input.readMessage(
                        com.google.events.cloud.visionai.v1.StreamWithAnnotation.parser(),
                        extensionRegistry);
                if (streamsWithAnnotationBuilder_ == null) {
                  ensureStreamsWithAnnotationIsMutable();
                  streamsWithAnnotation_.add(m);
                } else {
                  streamsWithAnnotationBuilder_.addMessage(m);
                }
                break;
              } // case 18
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

    private com.google.protobuf.LazyStringList streams_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureStreamsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        streams_ = new com.google.protobuf.LazyStringArrayList(streams_);
        bitField0_ |= 0x00000001;
      }
    }

    /**
     * <code>repeated string streams = 1;</code>
     *
     * @return A list containing the streams.
     */
    public com.google.protobuf.ProtocolStringList getStreamsList() {
      return streams_.getUnmodifiableView();
    }

    /**
     * <code>repeated string streams = 1;</code>
     *
     * @return The count of streams.
     */
    public int getStreamsCount() {
      return streams_.size();
    }

    /**
     * <code>repeated string streams = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The streams at the given index.
     */
    public java.lang.String getStreams(int index) {
      return streams_.get(index);
    }

    /**
     * <code>repeated string streams = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the streams at the given index.
     */
    public com.google.protobuf.ByteString getStreamsBytes(int index) {
      return streams_.getByteString(index);
    }

    /**
     * <code>repeated string streams = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The streams to set.
     * @return This builder for chaining.
     */
    public Builder setStreams(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureStreamsIsMutable();
      streams_.set(index, value);
      onChanged();
      return this;
    }

    /**
     * <code>repeated string streams = 1;</code>
     *
     * @param value The streams to add.
     * @return This builder for chaining.
     */
    public Builder addStreams(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureStreamsIsMutable();
      streams_.add(value);
      onChanged();
      return this;
    }

    /**
     * <code>repeated string streams = 1;</code>
     *
     * @param values The streams to add.
     * @return This builder for chaining.
     */
    public Builder addAllStreams(java.lang.Iterable<java.lang.String> values) {
      ensureStreamsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, streams_);
      onChanged();
      return this;
    }

    /**
     * <code>repeated string streams = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearStreams() {
      streams_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     * <code>repeated string streams = 1;</code>
     *
     * @param value The bytes of the streams to add.
     * @return This builder for chaining.
     */
    public Builder addStreamsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureStreamsIsMutable();
      streams_.add(value);
      onChanged();
      return this;
    }

    private java.util.List<com.google.events.cloud.visionai.v1.StreamWithAnnotation>
        streamsWithAnnotation_ = java.util.Collections.emptyList();

    private void ensureStreamsWithAnnotationIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        streamsWithAnnotation_ =
            new java.util.ArrayList<com.google.events.cloud.visionai.v1.StreamWithAnnotation>(
                streamsWithAnnotation_);
        bitField0_ |= 0x00000002;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.events.cloud.visionai.v1.StreamWithAnnotation,
            com.google.events.cloud.visionai.v1.StreamWithAnnotation.Builder,
            com.google.events.cloud.visionai.v1.StreamWithAnnotationOrBuilder>
        streamsWithAnnotationBuilder_;

    /**
     * <code>
     * repeated .google.events.cloud.visionai.v1.StreamWithAnnotation streams_with_annotation = 2;
     * </code>
     */
    public java.util.List<com.google.events.cloud.visionai.v1.StreamWithAnnotation>
        getStreamsWithAnnotationList() {
      if (streamsWithAnnotationBuilder_ == null) {
        return java.util.Collections.unmodifiableList(streamsWithAnnotation_);
      } else {
        return streamsWithAnnotationBuilder_.getMessageList();
      }
    }

    /**
     * <code>
     * repeated .google.events.cloud.visionai.v1.StreamWithAnnotation streams_with_annotation = 2;
     * </code>
     */
    public int getStreamsWithAnnotationCount() {
      if (streamsWithAnnotationBuilder_ == null) {
        return streamsWithAnnotation_.size();
      } else {
        return streamsWithAnnotationBuilder_.getCount();
      }
    }

    /**
     * <code>
     * repeated .google.events.cloud.visionai.v1.StreamWithAnnotation streams_with_annotation = 2;
     * </code>
     */
    public com.google.events.cloud.visionai.v1.StreamWithAnnotation getStreamsWithAnnotation(
        int index) {
      if (streamsWithAnnotationBuilder_ == null) {
        return streamsWithAnnotation_.get(index);
      } else {
        return streamsWithAnnotationBuilder_.getMessage(index);
      }
    }

    /**
     * <code>
     * repeated .google.events.cloud.visionai.v1.StreamWithAnnotation streams_with_annotation = 2;
     * </code>
     */
    public Builder setStreamsWithAnnotation(
        int index, com.google.events.cloud.visionai.v1.StreamWithAnnotation value) {
      if (streamsWithAnnotationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStreamsWithAnnotationIsMutable();
        streamsWithAnnotation_.set(index, value);
        onChanged();
      } else {
        streamsWithAnnotationBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     * <code>
     * repeated .google.events.cloud.visionai.v1.StreamWithAnnotation streams_with_annotation = 2;
     * </code>
     */
    public Builder setStreamsWithAnnotation(
        int index,
        com.google.events.cloud.visionai.v1.StreamWithAnnotation.Builder builderForValue) {
      if (streamsWithAnnotationBuilder_ == null) {
        ensureStreamsWithAnnotationIsMutable();
        streamsWithAnnotation_.set(index, builderForValue.build());
        onChanged();
      } else {
        streamsWithAnnotationBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     * <code>
     * repeated .google.events.cloud.visionai.v1.StreamWithAnnotation streams_with_annotation = 2;
     * </code>
     */
    public Builder addStreamsWithAnnotation(
        com.google.events.cloud.visionai.v1.StreamWithAnnotation value) {
      if (streamsWithAnnotationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStreamsWithAnnotationIsMutable();
        streamsWithAnnotation_.add(value);
        onChanged();
      } else {
        streamsWithAnnotationBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     * <code>
     * repeated .google.events.cloud.visionai.v1.StreamWithAnnotation streams_with_annotation = 2;
     * </code>
     */
    public Builder addStreamsWithAnnotation(
        int index, com.google.events.cloud.visionai.v1.StreamWithAnnotation value) {
      if (streamsWithAnnotationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStreamsWithAnnotationIsMutable();
        streamsWithAnnotation_.add(index, value);
        onChanged();
      } else {
        streamsWithAnnotationBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     * <code>
     * repeated .google.events.cloud.visionai.v1.StreamWithAnnotation streams_with_annotation = 2;
     * </code>
     */
    public Builder addStreamsWithAnnotation(
        com.google.events.cloud.visionai.v1.StreamWithAnnotation.Builder builderForValue) {
      if (streamsWithAnnotationBuilder_ == null) {
        ensureStreamsWithAnnotationIsMutable();
        streamsWithAnnotation_.add(builderForValue.build());
        onChanged();
      } else {
        streamsWithAnnotationBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     * <code>
     * repeated .google.events.cloud.visionai.v1.StreamWithAnnotation streams_with_annotation = 2;
     * </code>
     */
    public Builder addStreamsWithAnnotation(
        int index,
        com.google.events.cloud.visionai.v1.StreamWithAnnotation.Builder builderForValue) {
      if (streamsWithAnnotationBuilder_ == null) {
        ensureStreamsWithAnnotationIsMutable();
        streamsWithAnnotation_.add(index, builderForValue.build());
        onChanged();
      } else {
        streamsWithAnnotationBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     * <code>
     * repeated .google.events.cloud.visionai.v1.StreamWithAnnotation streams_with_annotation = 2;
     * </code>
     */
    public Builder addAllStreamsWithAnnotation(
        java.lang.Iterable<? extends com.google.events.cloud.visionai.v1.StreamWithAnnotation>
            values) {
      if (streamsWithAnnotationBuilder_ == null) {
        ensureStreamsWithAnnotationIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, streamsWithAnnotation_);
        onChanged();
      } else {
        streamsWithAnnotationBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     * <code>
     * repeated .google.events.cloud.visionai.v1.StreamWithAnnotation streams_with_annotation = 2;
     * </code>
     */
    public Builder clearStreamsWithAnnotation() {
      if (streamsWithAnnotationBuilder_ == null) {
        streamsWithAnnotation_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        streamsWithAnnotationBuilder_.clear();
      }
      return this;
    }

    /**
     * <code>
     * repeated .google.events.cloud.visionai.v1.StreamWithAnnotation streams_with_annotation = 2;
     * </code>
     */
    public Builder removeStreamsWithAnnotation(int index) {
      if (streamsWithAnnotationBuilder_ == null) {
        ensureStreamsWithAnnotationIsMutable();
        streamsWithAnnotation_.remove(index);
        onChanged();
      } else {
        streamsWithAnnotationBuilder_.remove(index);
      }
      return this;
    }

    /**
     * <code>
     * repeated .google.events.cloud.visionai.v1.StreamWithAnnotation streams_with_annotation = 2;
     * </code>
     */
    public com.google.events.cloud.visionai.v1.StreamWithAnnotation.Builder
        getStreamsWithAnnotationBuilder(int index) {
      return getStreamsWithAnnotationFieldBuilder().getBuilder(index);
    }

    /**
     * <code>
     * repeated .google.events.cloud.visionai.v1.StreamWithAnnotation streams_with_annotation = 2;
     * </code>
     */
    public com.google.events.cloud.visionai.v1.StreamWithAnnotationOrBuilder
        getStreamsWithAnnotationOrBuilder(int index) {
      if (streamsWithAnnotationBuilder_ == null) {
        return streamsWithAnnotation_.get(index);
      } else {
        return streamsWithAnnotationBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     * <code>
     * repeated .google.events.cloud.visionai.v1.StreamWithAnnotation streams_with_annotation = 2;
     * </code>
     */
    public java.util.List<
            ? extends com.google.events.cloud.visionai.v1.StreamWithAnnotationOrBuilder>
        getStreamsWithAnnotationOrBuilderList() {
      if (streamsWithAnnotationBuilder_ != null) {
        return streamsWithAnnotationBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(streamsWithAnnotation_);
      }
    }

    /**
     * <code>
     * repeated .google.events.cloud.visionai.v1.StreamWithAnnotation streams_with_annotation = 2;
     * </code>
     */
    public com.google.events.cloud.visionai.v1.StreamWithAnnotation.Builder
        addStreamsWithAnnotationBuilder() {
      return getStreamsWithAnnotationFieldBuilder()
          .addBuilder(
              com.google.events.cloud.visionai.v1.StreamWithAnnotation.getDefaultInstance());
    }

    /**
     * <code>
     * repeated .google.events.cloud.visionai.v1.StreamWithAnnotation streams_with_annotation = 2;
     * </code>
     */
    public com.google.events.cloud.visionai.v1.StreamWithAnnotation.Builder
        addStreamsWithAnnotationBuilder(int index) {
      return getStreamsWithAnnotationFieldBuilder()
          .addBuilder(
              index, com.google.events.cloud.visionai.v1.StreamWithAnnotation.getDefaultInstance());
    }

    /**
     * <code>
     * repeated .google.events.cloud.visionai.v1.StreamWithAnnotation streams_with_annotation = 2;
     * </code>
     */
    public java.util.List<com.google.events.cloud.visionai.v1.StreamWithAnnotation.Builder>
        getStreamsWithAnnotationBuilderList() {
      return getStreamsWithAnnotationFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.events.cloud.visionai.v1.StreamWithAnnotation,
            com.google.events.cloud.visionai.v1.StreamWithAnnotation.Builder,
            com.google.events.cloud.visionai.v1.StreamWithAnnotationOrBuilder>
        getStreamsWithAnnotationFieldBuilder() {
      if (streamsWithAnnotationBuilder_ == null) {
        streamsWithAnnotationBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.events.cloud.visionai.v1.StreamWithAnnotation,
                com.google.events.cloud.visionai.v1.StreamWithAnnotation.Builder,
                com.google.events.cloud.visionai.v1.StreamWithAnnotationOrBuilder>(
                streamsWithAnnotation_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        streamsWithAnnotation_ = null;
      }
      return streamsWithAnnotationBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.events.cloud.visionai.v1.VideoStreamInputConfig)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.visionai.v1.VideoStreamInputConfig)
  private static final com.google.events.cloud.visionai.v1.VideoStreamInputConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.events.cloud.visionai.v1.VideoStreamInputConfig();
  }

  public static com.google.events.cloud.visionai.v1.VideoStreamInputConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VideoStreamInputConfig> PARSER =
      new com.google.protobuf.AbstractParser<VideoStreamInputConfig>() {
        @java.lang.Override
        public VideoStreamInputConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<VideoStreamInputConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VideoStreamInputConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.visionai.v1.VideoStreamInputConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
