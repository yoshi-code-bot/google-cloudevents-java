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
// source: google/events/cloud/eventarc/v1/data.proto

package com.google.events.cloud.eventarc.v1;

/**
 *
 *
 * <pre>
 * The data within all ChannelConnection events.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.eventarc.v1.ChannelConnectionEventData}
 */
public final class ChannelConnectionEventData extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.eventarc.v1.ChannelConnectionEventData)
    ChannelConnectionEventDataOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ChannelConnectionEventData.newBuilder() to construct.
  private ChannelConnectionEventData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ChannelConnectionEventData() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ChannelConnectionEventData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.events.cloud.eventarc.v1.Data
        .internal_static_google_events_cloud_eventarc_v1_ChannelConnectionEventData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.eventarc.v1.Data
        .internal_static_google_events_cloud_eventarc_v1_ChannelConnectionEventData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.eventarc.v1.ChannelConnectionEventData.class,
            com.google.events.cloud.eventarc.v1.ChannelConnectionEventData.Builder.class);
  }

  public static final int PAYLOAD_FIELD_NUMBER = 1;
  private com.google.events.cloud.eventarc.v1.ChannelConnection payload_;

  /**
   *
   *
   * <pre>
   * The ChannelConnection event payload.
   * </pre>
   *
   * <code>.google.events.cloud.eventarc.v1.ChannelConnection payload = 1;</code>
   *
   * @return Whether the payload field is set.
   */
  @java.lang.Override
  public boolean hasPayload() {
    return payload_ != null;
  }

  /**
   *
   *
   * <pre>
   * The ChannelConnection event payload.
   * </pre>
   *
   * <code>.google.events.cloud.eventarc.v1.ChannelConnection payload = 1;</code>
   *
   * @return The payload.
   */
  @java.lang.Override
  public com.google.events.cloud.eventarc.v1.ChannelConnection getPayload() {
    return payload_ == null
        ? com.google.events.cloud.eventarc.v1.ChannelConnection.getDefaultInstance()
        : payload_;
  }

  /**
   *
   *
   * <pre>
   * The ChannelConnection event payload.
   * </pre>
   *
   * <code>.google.events.cloud.eventarc.v1.ChannelConnection payload = 1;</code>
   */
  @java.lang.Override
  public com.google.events.cloud.eventarc.v1.ChannelConnectionOrBuilder getPayloadOrBuilder() {
    return payload_ == null
        ? com.google.events.cloud.eventarc.v1.ChannelConnection.getDefaultInstance()
        : payload_;
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
    if (payload_ != null) {
      output.writeMessage(1, getPayload());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (payload_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getPayload());
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
    if (!(obj instanceof com.google.events.cloud.eventarc.v1.ChannelConnectionEventData)) {
      return super.equals(obj);
    }
    com.google.events.cloud.eventarc.v1.ChannelConnectionEventData other =
        (com.google.events.cloud.eventarc.v1.ChannelConnectionEventData) obj;

    if (hasPayload() != other.hasPayload()) return false;
    if (hasPayload()) {
      if (!getPayload().equals(other.getPayload())) return false;
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
    if (hasPayload()) {
      hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
      hash = (53 * hash) + getPayload().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.cloud.eventarc.v1.ChannelConnectionEventData parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.eventarc.v1.ChannelConnectionEventData parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.eventarc.v1.ChannelConnectionEventData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.eventarc.v1.ChannelConnectionEventData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.eventarc.v1.ChannelConnectionEventData parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.eventarc.v1.ChannelConnectionEventData parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.eventarc.v1.ChannelConnectionEventData parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.eventarc.v1.ChannelConnectionEventData parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.eventarc.v1.ChannelConnectionEventData parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.eventarc.v1.ChannelConnectionEventData parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.eventarc.v1.ChannelConnectionEventData parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.eventarc.v1.ChannelConnectionEventData parseFrom(
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
      com.google.events.cloud.eventarc.v1.ChannelConnectionEventData prototype) {
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
   * The data within all ChannelConnection events.
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.eventarc.v1.ChannelConnectionEventData}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.eventarc.v1.ChannelConnectionEventData)
      com.google.events.cloud.eventarc.v1.ChannelConnectionEventDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.events.cloud.eventarc.v1.Data
          .internal_static_google_events_cloud_eventarc_v1_ChannelConnectionEventData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.eventarc.v1.Data
          .internal_static_google_events_cloud_eventarc_v1_ChannelConnectionEventData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.eventarc.v1.ChannelConnectionEventData.class,
              com.google.events.cloud.eventarc.v1.ChannelConnectionEventData.Builder.class);
    }

    // Construct using com.google.events.cloud.eventarc.v1.ChannelConnectionEventData.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      payload_ = null;
      if (payloadBuilder_ != null) {
        payloadBuilder_.dispose();
        payloadBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.events.cloud.eventarc.v1.Data
          .internal_static_google_events_cloud_eventarc_v1_ChannelConnectionEventData_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.eventarc.v1.ChannelConnectionEventData
        getDefaultInstanceForType() {
      return com.google.events.cloud.eventarc.v1.ChannelConnectionEventData.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.eventarc.v1.ChannelConnectionEventData build() {
      com.google.events.cloud.eventarc.v1.ChannelConnectionEventData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.eventarc.v1.ChannelConnectionEventData buildPartial() {
      com.google.events.cloud.eventarc.v1.ChannelConnectionEventData result =
          new com.google.events.cloud.eventarc.v1.ChannelConnectionEventData(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.events.cloud.eventarc.v1.ChannelConnectionEventData result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.payload_ = payloadBuilder_ == null ? payload_ : payloadBuilder_.build();
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
      if (other instanceof com.google.events.cloud.eventarc.v1.ChannelConnectionEventData) {
        return mergeFrom((com.google.events.cloud.eventarc.v1.ChannelConnectionEventData) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.events.cloud.eventarc.v1.ChannelConnectionEventData other) {
      if (other
          == com.google.events.cloud.eventarc.v1.ChannelConnectionEventData.getDefaultInstance())
        return this;
      if (other.hasPayload()) {
        mergePayload(other.getPayload());
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
                input.readMessage(getPayloadFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

    private com.google.events.cloud.eventarc.v1.ChannelConnection payload_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.events.cloud.eventarc.v1.ChannelConnection,
            com.google.events.cloud.eventarc.v1.ChannelConnection.Builder,
            com.google.events.cloud.eventarc.v1.ChannelConnectionOrBuilder>
        payloadBuilder_;

    /**
     *
     *
     * <pre>
     * The ChannelConnection event payload.
     * </pre>
     *
     * <code>.google.events.cloud.eventarc.v1.ChannelConnection payload = 1;</code>
     *
     * @return Whether the payload field is set.
     */
    public boolean hasPayload() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * The ChannelConnection event payload.
     * </pre>
     *
     * <code>.google.events.cloud.eventarc.v1.ChannelConnection payload = 1;</code>
     *
     * @return The payload.
     */
    public com.google.events.cloud.eventarc.v1.ChannelConnection getPayload() {
      if (payloadBuilder_ == null) {
        return payload_ == null
            ? com.google.events.cloud.eventarc.v1.ChannelConnection.getDefaultInstance()
            : payload_;
      } else {
        return payloadBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * The ChannelConnection event payload.
     * </pre>
     *
     * <code>.google.events.cloud.eventarc.v1.ChannelConnection payload = 1;</code>
     */
    public Builder setPayload(com.google.events.cloud.eventarc.v1.ChannelConnection value) {
      if (payloadBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        payload_ = value;
      } else {
        payloadBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The ChannelConnection event payload.
     * </pre>
     *
     * <code>.google.events.cloud.eventarc.v1.ChannelConnection payload = 1;</code>
     */
    public Builder setPayload(
        com.google.events.cloud.eventarc.v1.ChannelConnection.Builder builderForValue) {
      if (payloadBuilder_ == null) {
        payload_ = builderForValue.build();
      } else {
        payloadBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The ChannelConnection event payload.
     * </pre>
     *
     * <code>.google.events.cloud.eventarc.v1.ChannelConnection payload = 1;</code>
     */
    public Builder mergePayload(com.google.events.cloud.eventarc.v1.ChannelConnection value) {
      if (payloadBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && payload_ != null
            && payload_
                != com.google.events.cloud.eventarc.v1.ChannelConnection.getDefaultInstance()) {
          getPayloadBuilder().mergeFrom(value);
        } else {
          payload_ = value;
        }
      } else {
        payloadBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The ChannelConnection event payload.
     * </pre>
     *
     * <code>.google.events.cloud.eventarc.v1.ChannelConnection payload = 1;</code>
     */
    public Builder clearPayload() {
      bitField0_ = (bitField0_ & ~0x00000001);
      payload_ = null;
      if (payloadBuilder_ != null) {
        payloadBuilder_.dispose();
        payloadBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The ChannelConnection event payload.
     * </pre>
     *
     * <code>.google.events.cloud.eventarc.v1.ChannelConnection payload = 1;</code>
     */
    public com.google.events.cloud.eventarc.v1.ChannelConnection.Builder getPayloadBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPayloadFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * The ChannelConnection event payload.
     * </pre>
     *
     * <code>.google.events.cloud.eventarc.v1.ChannelConnection payload = 1;</code>
     */
    public com.google.events.cloud.eventarc.v1.ChannelConnectionOrBuilder getPayloadOrBuilder() {
      if (payloadBuilder_ != null) {
        return payloadBuilder_.getMessageOrBuilder();
      } else {
        return payload_ == null
            ? com.google.events.cloud.eventarc.v1.ChannelConnection.getDefaultInstance()
            : payload_;
      }
    }

    /**
     *
     *
     * <pre>
     * The ChannelConnection event payload.
     * </pre>
     *
     * <code>.google.events.cloud.eventarc.v1.ChannelConnection payload = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.events.cloud.eventarc.v1.ChannelConnection,
            com.google.events.cloud.eventarc.v1.ChannelConnection.Builder,
            com.google.events.cloud.eventarc.v1.ChannelConnectionOrBuilder>
        getPayloadFieldBuilder() {
      if (payloadBuilder_ == null) {
        payloadBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.events.cloud.eventarc.v1.ChannelConnection,
                com.google.events.cloud.eventarc.v1.ChannelConnection.Builder,
                com.google.events.cloud.eventarc.v1.ChannelConnectionOrBuilder>(
                getPayload(), getParentForChildren(), isClean());
        payload_ = null;
      }
      return payloadBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.events.cloud.eventarc.v1.ChannelConnectionEventData)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.eventarc.v1.ChannelConnectionEventData)
  private static final com.google.events.cloud.eventarc.v1.ChannelConnectionEventData
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.events.cloud.eventarc.v1.ChannelConnectionEventData();
  }

  public static com.google.events.cloud.eventarc.v1.ChannelConnectionEventData
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChannelConnectionEventData> PARSER =
      new com.google.protobuf.AbstractParser<ChannelConnectionEventData>() {
        @java.lang.Override
        public ChannelConnectionEventData parsePartialFrom(
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

  public static com.google.protobuf.Parser<ChannelConnectionEventData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChannelConnectionEventData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.eventarc.v1.ChannelConnectionEventData
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
