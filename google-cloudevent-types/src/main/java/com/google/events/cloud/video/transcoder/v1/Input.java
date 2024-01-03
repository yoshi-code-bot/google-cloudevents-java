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
// source: google/events/cloud/video/transcoder/v1/data.proto

package com.google.events.cloud.video.transcoder.v1;

/**
 *
 *
 * <pre>
 * Input asset.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.video.transcoder.v1.Input}
 */
public final class Input extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.video.transcoder.v1.Input)
    InputOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use Input.newBuilder() to construct.
  private Input(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Input() {
    key_ = "";
    uri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Input();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.events.cloud.video.transcoder.v1.Data
        .internal_static_google_events_cloud_video_transcoder_v1_Input_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.video.transcoder.v1.Data
        .internal_static_google_events_cloud_video_transcoder_v1_Input_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.video.transcoder.v1.Input.class,
            com.google.events.cloud.video.transcoder.v1.Input.Builder.class);
  }

  public static final int KEY_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object key_ = "";

  /**
   *
   *
   * <pre>
   * A unique key for this input. Must be specified when using advanced
   * mapping and edit lists.
   * </pre>
   *
   * <code>string key = 1;</code>
   *
   * @return The key.
   */
  @java.lang.Override
  public java.lang.String getKey() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      key_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * A unique key for this input. Must be specified when using advanced
   * mapping and edit lists.
   * </pre>
   *
   * <code>string key = 1;</code>
   *
   * @return The bytes for key.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKeyBytes() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      key_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int URI_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object uri_ = "";

  /**
   *
   *
   * <pre>
   * URI of the media. Input files must be at least 5 seconds in duration and
   * stored in Cloud Storage (for example, `gs://bucket/inputs/file.mp4`).
   * If empty, the value is populated from `Job.input_uri`. See
   * [Supported input and output
   * formats](https://cloud.google.com/transcoder/docs/concepts/supported-input-and-output-formats).
   * </pre>
   *
   * <code>string uri = 2;</code>
   *
   * @return The uri.
   */
  @java.lang.Override
  public java.lang.String getUri() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uri_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * URI of the media. Input files must be at least 5 seconds in duration and
   * stored in Cloud Storage (for example, `gs://bucket/inputs/file.mp4`).
   * If empty, the value is populated from `Job.input_uri`. See
   * [Supported input and output
   * formats](https://cloud.google.com/transcoder/docs/concepts/supported-input-and-output-formats).
   * </pre>
   *
   * <code>string uri = 2;</code>
   *
   * @return The bytes for uri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getUriBytes() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      uri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PREPROCESSING_CONFIG_FIELD_NUMBER = 3;
  private com.google.events.cloud.video.transcoder.v1.PreprocessingConfig preprocessingConfig_;

  /**
   *
   *
   * <pre>
   * Preprocessing configurations.
   * </pre>
   *
   * <code>.google.events.cloud.video.transcoder.v1.PreprocessingConfig preprocessing_config = 3;
   * </code>
   *
   * @return Whether the preprocessingConfig field is set.
   */
  @java.lang.Override
  public boolean hasPreprocessingConfig() {
    return preprocessingConfig_ != null;
  }

  /**
   *
   *
   * <pre>
   * Preprocessing configurations.
   * </pre>
   *
   * <code>.google.events.cloud.video.transcoder.v1.PreprocessingConfig preprocessing_config = 3;
   * </code>
   *
   * @return The preprocessingConfig.
   */
  @java.lang.Override
  public com.google.events.cloud.video.transcoder.v1.PreprocessingConfig getPreprocessingConfig() {
    return preprocessingConfig_ == null
        ? com.google.events.cloud.video.transcoder.v1.PreprocessingConfig.getDefaultInstance()
        : preprocessingConfig_;
  }

  /**
   *
   *
   * <pre>
   * Preprocessing configurations.
   * </pre>
   *
   * <code>.google.events.cloud.video.transcoder.v1.PreprocessingConfig preprocessing_config = 3;
   * </code>
   */
  @java.lang.Override
  public com.google.events.cloud.video.transcoder.v1.PreprocessingConfigOrBuilder
      getPreprocessingConfigOrBuilder() {
    return preprocessingConfig_ == null
        ? com.google.events.cloud.video.transcoder.v1.PreprocessingConfig.getDefaultInstance()
        : preprocessingConfig_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, key_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, uri_);
    }
    if (preprocessingConfig_ != null) {
      output.writeMessage(3, getPreprocessingConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, key_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, uri_);
    }
    if (preprocessingConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getPreprocessingConfig());
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
    if (!(obj instanceof com.google.events.cloud.video.transcoder.v1.Input)) {
      return super.equals(obj);
    }
    com.google.events.cloud.video.transcoder.v1.Input other =
        (com.google.events.cloud.video.transcoder.v1.Input) obj;

    if (!getKey().equals(other.getKey())) return false;
    if (!getUri().equals(other.getUri())) return false;
    if (hasPreprocessingConfig() != other.hasPreprocessingConfig()) return false;
    if (hasPreprocessingConfig()) {
      if (!getPreprocessingConfig().equals(other.getPreprocessingConfig())) return false;
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
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    hash = (37 * hash) + URI_FIELD_NUMBER;
    hash = (53 * hash) + getUri().hashCode();
    if (hasPreprocessingConfig()) {
      hash = (37 * hash) + PREPROCESSING_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getPreprocessingConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.cloud.video.transcoder.v1.Input parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.video.transcoder.v1.Input parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.video.transcoder.v1.Input parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.video.transcoder.v1.Input parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.video.transcoder.v1.Input parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.video.transcoder.v1.Input parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.video.transcoder.v1.Input parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.video.transcoder.v1.Input parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.video.transcoder.v1.Input parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.video.transcoder.v1.Input parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.video.transcoder.v1.Input parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.video.transcoder.v1.Input parseFrom(
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

  public static Builder newBuilder(com.google.events.cloud.video.transcoder.v1.Input prototype) {
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
   * Input asset.
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.video.transcoder.v1.Input}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.video.transcoder.v1.Input)
      com.google.events.cloud.video.transcoder.v1.InputOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.events.cloud.video.transcoder.v1.Data
          .internal_static_google_events_cloud_video_transcoder_v1_Input_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.video.transcoder.v1.Data
          .internal_static_google_events_cloud_video_transcoder_v1_Input_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.video.transcoder.v1.Input.class,
              com.google.events.cloud.video.transcoder.v1.Input.Builder.class);
    }

    // Construct using com.google.events.cloud.video.transcoder.v1.Input.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      key_ = "";
      uri_ = "";
      preprocessingConfig_ = null;
      if (preprocessingConfigBuilder_ != null) {
        preprocessingConfigBuilder_.dispose();
        preprocessingConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.events.cloud.video.transcoder.v1.Data
          .internal_static_google_events_cloud_video_transcoder_v1_Input_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.video.transcoder.v1.Input getDefaultInstanceForType() {
      return com.google.events.cloud.video.transcoder.v1.Input.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.video.transcoder.v1.Input build() {
      com.google.events.cloud.video.transcoder.v1.Input result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.video.transcoder.v1.Input buildPartial() {
      com.google.events.cloud.video.transcoder.v1.Input result =
          new com.google.events.cloud.video.transcoder.v1.Input(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.events.cloud.video.transcoder.v1.Input result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.key_ = key_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.uri_ = uri_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.preprocessingConfig_ =
            preprocessingConfigBuilder_ == null
                ? preprocessingConfig_
                : preprocessingConfigBuilder_.build();
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
      if (other instanceof com.google.events.cloud.video.transcoder.v1.Input) {
        return mergeFrom((com.google.events.cloud.video.transcoder.v1.Input) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.events.cloud.video.transcoder.v1.Input other) {
      if (other == com.google.events.cloud.video.transcoder.v1.Input.getDefaultInstance())
        return this;
      if (!other.getKey().isEmpty()) {
        key_ = other.key_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getUri().isEmpty()) {
        uri_ = other.uri_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasPreprocessingConfig()) {
        mergePreprocessingConfig(other.getPreprocessingConfig());
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
                key_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                uri_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(
                    getPreprocessingConfigFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private java.lang.Object key_ = "";

    /**
     *
     *
     * <pre>
     * A unique key for this input. Must be specified when using advanced
     * mapping and edit lists.
     * </pre>
     *
     * <code>string key = 1;</code>
     *
     * @return The key.
     */
    public java.lang.String getKey() {
      java.lang.Object ref = key_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        key_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * A unique key for this input. Must be specified when using advanced
     * mapping and edit lists.
     * </pre>
     *
     * <code>string key = 1;</code>
     *
     * @return The bytes for key.
     */
    public com.google.protobuf.ByteString getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * A unique key for this input. Must be specified when using advanced
     * mapping and edit lists.
     * </pre>
     *
     * <code>string key = 1;</code>
     *
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      key_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * A unique key for this input. Must be specified when using advanced
     * mapping and edit lists.
     * </pre>
     *
     * <code>string key = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      key_ = getDefaultInstance().getKey();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * A unique key for this input. Must be specified when using advanced
     * mapping and edit lists.
     * </pre>
     *
     * <code>string key = 1;</code>
     *
     * @param value The bytes for key to set.
     * @return This builder for chaining.
     */
    public Builder setKeyBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      key_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object uri_ = "";

    /**
     *
     *
     * <pre>
     * URI of the media. Input files must be at least 5 seconds in duration and
     * stored in Cloud Storage (for example, `gs://bucket/inputs/file.mp4`).
     * If empty, the value is populated from `Job.input_uri`. See
     * [Supported input and output
     * formats](https://cloud.google.com/transcoder/docs/concepts/supported-input-and-output-formats).
     * </pre>
     *
     * <code>string uri = 2;</code>
     *
     * @return The uri.
     */
    public java.lang.String getUri() {
      java.lang.Object ref = uri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * URI of the media. Input files must be at least 5 seconds in duration and
     * stored in Cloud Storage (for example, `gs://bucket/inputs/file.mp4`).
     * If empty, the value is populated from `Job.input_uri`. See
     * [Supported input and output
     * formats](https://cloud.google.com/transcoder/docs/concepts/supported-input-and-output-formats).
     * </pre>
     *
     * <code>string uri = 2;</code>
     *
     * @return The bytes for uri.
     */
    public com.google.protobuf.ByteString getUriBytes() {
      java.lang.Object ref = uri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        uri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * URI of the media. Input files must be at least 5 seconds in duration and
     * stored in Cloud Storage (for example, `gs://bucket/inputs/file.mp4`).
     * If empty, the value is populated from `Job.input_uri`. See
     * [Supported input and output
     * formats](https://cloud.google.com/transcoder/docs/concepts/supported-input-and-output-formats).
     * </pre>
     *
     * <code>string uri = 2;</code>
     *
     * @param value The uri to set.
     * @return This builder for chaining.
     */
    public Builder setUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      uri_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * URI of the media. Input files must be at least 5 seconds in duration and
     * stored in Cloud Storage (for example, `gs://bucket/inputs/file.mp4`).
     * If empty, the value is populated from `Job.input_uri`. See
     * [Supported input and output
     * formats](https://cloud.google.com/transcoder/docs/concepts/supported-input-and-output-formats).
     * </pre>
     *
     * <code>string uri = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUri() {
      uri_ = getDefaultInstance().getUri();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * URI of the media. Input files must be at least 5 seconds in duration and
     * stored in Cloud Storage (for example, `gs://bucket/inputs/file.mp4`).
     * If empty, the value is populated from `Job.input_uri`. See
     * [Supported input and output
     * formats](https://cloud.google.com/transcoder/docs/concepts/supported-input-and-output-formats).
     * </pre>
     *
     * <code>string uri = 2;</code>
     *
     * @param value The bytes for uri to set.
     * @return This builder for chaining.
     */
    public Builder setUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      uri_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.events.cloud.video.transcoder.v1.PreprocessingConfig preprocessingConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.events.cloud.video.transcoder.v1.PreprocessingConfig,
            com.google.events.cloud.video.transcoder.v1.PreprocessingConfig.Builder,
            com.google.events.cloud.video.transcoder.v1.PreprocessingConfigOrBuilder>
        preprocessingConfigBuilder_;

    /**
     *
     *
     * <pre>
     * Preprocessing configurations.
     * </pre>
     *
     * <code>.google.events.cloud.video.transcoder.v1.PreprocessingConfig preprocessing_config = 3;
     * </code>
     *
     * @return Whether the preprocessingConfig field is set.
     */
    public boolean hasPreprocessingConfig() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     *
     *
     * <pre>
     * Preprocessing configurations.
     * </pre>
     *
     * <code>.google.events.cloud.video.transcoder.v1.PreprocessingConfig preprocessing_config = 3;
     * </code>
     *
     * @return The preprocessingConfig.
     */
    public com.google.events.cloud.video.transcoder.v1.PreprocessingConfig
        getPreprocessingConfig() {
      if (preprocessingConfigBuilder_ == null) {
        return preprocessingConfig_ == null
            ? com.google.events.cloud.video.transcoder.v1.PreprocessingConfig.getDefaultInstance()
            : preprocessingConfig_;
      } else {
        return preprocessingConfigBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Preprocessing configurations.
     * </pre>
     *
     * <code>.google.events.cloud.video.transcoder.v1.PreprocessingConfig preprocessing_config = 3;
     * </code>
     */
    public Builder setPreprocessingConfig(
        com.google.events.cloud.video.transcoder.v1.PreprocessingConfig value) {
      if (preprocessingConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        preprocessingConfig_ = value;
      } else {
        preprocessingConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Preprocessing configurations.
     * </pre>
     *
     * <code>.google.events.cloud.video.transcoder.v1.PreprocessingConfig preprocessing_config = 3;
     * </code>
     */
    public Builder setPreprocessingConfig(
        com.google.events.cloud.video.transcoder.v1.PreprocessingConfig.Builder builderForValue) {
      if (preprocessingConfigBuilder_ == null) {
        preprocessingConfig_ = builderForValue.build();
      } else {
        preprocessingConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Preprocessing configurations.
     * </pre>
     *
     * <code>.google.events.cloud.video.transcoder.v1.PreprocessingConfig preprocessing_config = 3;
     * </code>
     */
    public Builder mergePreprocessingConfig(
        com.google.events.cloud.video.transcoder.v1.PreprocessingConfig value) {
      if (preprocessingConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && preprocessingConfig_ != null
            && preprocessingConfig_
                != com.google.events.cloud.video.transcoder.v1.PreprocessingConfig
                    .getDefaultInstance()) {
          getPreprocessingConfigBuilder().mergeFrom(value);
        } else {
          preprocessingConfig_ = value;
        }
      } else {
        preprocessingConfigBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Preprocessing configurations.
     * </pre>
     *
     * <code>.google.events.cloud.video.transcoder.v1.PreprocessingConfig preprocessing_config = 3;
     * </code>
     */
    public Builder clearPreprocessingConfig() {
      bitField0_ = (bitField0_ & ~0x00000004);
      preprocessingConfig_ = null;
      if (preprocessingConfigBuilder_ != null) {
        preprocessingConfigBuilder_.dispose();
        preprocessingConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Preprocessing configurations.
     * </pre>
     *
     * <code>.google.events.cloud.video.transcoder.v1.PreprocessingConfig preprocessing_config = 3;
     * </code>
     */
    public com.google.events.cloud.video.transcoder.v1.PreprocessingConfig.Builder
        getPreprocessingConfigBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getPreprocessingConfigFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Preprocessing configurations.
     * </pre>
     *
     * <code>.google.events.cloud.video.transcoder.v1.PreprocessingConfig preprocessing_config = 3;
     * </code>
     */
    public com.google.events.cloud.video.transcoder.v1.PreprocessingConfigOrBuilder
        getPreprocessingConfigOrBuilder() {
      if (preprocessingConfigBuilder_ != null) {
        return preprocessingConfigBuilder_.getMessageOrBuilder();
      } else {
        return preprocessingConfig_ == null
            ? com.google.events.cloud.video.transcoder.v1.PreprocessingConfig.getDefaultInstance()
            : preprocessingConfig_;
      }
    }

    /**
     *
     *
     * <pre>
     * Preprocessing configurations.
     * </pre>
     *
     * <code>.google.events.cloud.video.transcoder.v1.PreprocessingConfig preprocessing_config = 3;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.events.cloud.video.transcoder.v1.PreprocessingConfig,
            com.google.events.cloud.video.transcoder.v1.PreprocessingConfig.Builder,
            com.google.events.cloud.video.transcoder.v1.PreprocessingConfigOrBuilder>
        getPreprocessingConfigFieldBuilder() {
      if (preprocessingConfigBuilder_ == null) {
        preprocessingConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.events.cloud.video.transcoder.v1.PreprocessingConfig,
                com.google.events.cloud.video.transcoder.v1.PreprocessingConfig.Builder,
                com.google.events.cloud.video.transcoder.v1.PreprocessingConfigOrBuilder>(
                getPreprocessingConfig(), getParentForChildren(), isClean());
        preprocessingConfig_ = null;
      }
      return preprocessingConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.events.cloud.video.transcoder.v1.Input)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.video.transcoder.v1.Input)
  private static final com.google.events.cloud.video.transcoder.v1.Input DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.events.cloud.video.transcoder.v1.Input();
  }

  public static com.google.events.cloud.video.transcoder.v1.Input getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Input> PARSER =
      new com.google.protobuf.AbstractParser<Input>() {
        @java.lang.Override
        public Input parsePartialFrom(
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

  public static com.google.protobuf.Parser<Input> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Input> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.video.transcoder.v1.Input getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
