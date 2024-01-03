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
// source: google/events/cloud/vmmigration/v1/data.proto

package com.google.events.cloud.vmmigration.v1;

/**
 *
 *
 * <pre>
 * The data within all CutoverJob events.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.vmmigration.v1.CutoverJobEventData}
 */
public final class CutoverJobEventData extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.vmmigration.v1.CutoverJobEventData)
    CutoverJobEventDataOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use CutoverJobEventData.newBuilder() to construct.
  private CutoverJobEventData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CutoverJobEventData() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CutoverJobEventData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.events.cloud.vmmigration.v1.Data
        .internal_static_google_events_cloud_vmmigration_v1_CutoverJobEventData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.vmmigration.v1.Data
        .internal_static_google_events_cloud_vmmigration_v1_CutoverJobEventData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.vmmigration.v1.CutoverJobEventData.class,
            com.google.events.cloud.vmmigration.v1.CutoverJobEventData.Builder.class);
  }

  public static final int PAYLOAD_FIELD_NUMBER = 1;
  private com.google.events.cloud.vmmigration.v1.CutoverJob payload_;

  /**
   *
   *
   * <pre>
   * The CutoverJob event payload.
   * </pre>
   *
   * <code>.google.events.cloud.vmmigration.v1.CutoverJob payload = 1;</code>
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
   * The CutoverJob event payload.
   * </pre>
   *
   * <code>.google.events.cloud.vmmigration.v1.CutoverJob payload = 1;</code>
   *
   * @return The payload.
   */
  @java.lang.Override
  public com.google.events.cloud.vmmigration.v1.CutoverJob getPayload() {
    return payload_ == null
        ? com.google.events.cloud.vmmigration.v1.CutoverJob.getDefaultInstance()
        : payload_;
  }

  /**
   *
   *
   * <pre>
   * The CutoverJob event payload.
   * </pre>
   *
   * <code>.google.events.cloud.vmmigration.v1.CutoverJob payload = 1;</code>
   */
  @java.lang.Override
  public com.google.events.cloud.vmmigration.v1.CutoverJobOrBuilder getPayloadOrBuilder() {
    return payload_ == null
        ? com.google.events.cloud.vmmigration.v1.CutoverJob.getDefaultInstance()
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
    if (!(obj instanceof com.google.events.cloud.vmmigration.v1.CutoverJobEventData)) {
      return super.equals(obj);
    }
    com.google.events.cloud.vmmigration.v1.CutoverJobEventData other =
        (com.google.events.cloud.vmmigration.v1.CutoverJobEventData) obj;

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

  public static com.google.events.cloud.vmmigration.v1.CutoverJobEventData parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.vmmigration.v1.CutoverJobEventData parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.vmmigration.v1.CutoverJobEventData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.vmmigration.v1.CutoverJobEventData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.vmmigration.v1.CutoverJobEventData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.vmmigration.v1.CutoverJobEventData parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.vmmigration.v1.CutoverJobEventData parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.vmmigration.v1.CutoverJobEventData parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.vmmigration.v1.CutoverJobEventData parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.vmmigration.v1.CutoverJobEventData parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.vmmigration.v1.CutoverJobEventData parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.vmmigration.v1.CutoverJobEventData parseFrom(
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
      com.google.events.cloud.vmmigration.v1.CutoverJobEventData prototype) {
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
   * The data within all CutoverJob events.
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.vmmigration.v1.CutoverJobEventData}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.vmmigration.v1.CutoverJobEventData)
      com.google.events.cloud.vmmigration.v1.CutoverJobEventDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.events.cloud.vmmigration.v1.Data
          .internal_static_google_events_cloud_vmmigration_v1_CutoverJobEventData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.vmmigration.v1.Data
          .internal_static_google_events_cloud_vmmigration_v1_CutoverJobEventData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.vmmigration.v1.CutoverJobEventData.class,
              com.google.events.cloud.vmmigration.v1.CutoverJobEventData.Builder.class);
    }

    // Construct using com.google.events.cloud.vmmigration.v1.CutoverJobEventData.newBuilder()
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
      return com.google.events.cloud.vmmigration.v1.Data
          .internal_static_google_events_cloud_vmmigration_v1_CutoverJobEventData_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.vmmigration.v1.CutoverJobEventData getDefaultInstanceForType() {
      return com.google.events.cloud.vmmigration.v1.CutoverJobEventData.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.vmmigration.v1.CutoverJobEventData build() {
      com.google.events.cloud.vmmigration.v1.CutoverJobEventData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.vmmigration.v1.CutoverJobEventData buildPartial() {
      com.google.events.cloud.vmmigration.v1.CutoverJobEventData result =
          new com.google.events.cloud.vmmigration.v1.CutoverJobEventData(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.events.cloud.vmmigration.v1.CutoverJobEventData result) {
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
      if (other instanceof com.google.events.cloud.vmmigration.v1.CutoverJobEventData) {
        return mergeFrom((com.google.events.cloud.vmmigration.v1.CutoverJobEventData) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.events.cloud.vmmigration.v1.CutoverJobEventData other) {
      if (other == com.google.events.cloud.vmmigration.v1.CutoverJobEventData.getDefaultInstance())
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

    private com.google.events.cloud.vmmigration.v1.CutoverJob payload_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.events.cloud.vmmigration.v1.CutoverJob,
            com.google.events.cloud.vmmigration.v1.CutoverJob.Builder,
            com.google.events.cloud.vmmigration.v1.CutoverJobOrBuilder>
        payloadBuilder_;

    /**
     *
     *
     * <pre>
     * The CutoverJob event payload.
     * </pre>
     *
     * <code>.google.events.cloud.vmmigration.v1.CutoverJob payload = 1;</code>
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
     * The CutoverJob event payload.
     * </pre>
     *
     * <code>.google.events.cloud.vmmigration.v1.CutoverJob payload = 1;</code>
     *
     * @return The payload.
     */
    public com.google.events.cloud.vmmigration.v1.CutoverJob getPayload() {
      if (payloadBuilder_ == null) {
        return payload_ == null
            ? com.google.events.cloud.vmmigration.v1.CutoverJob.getDefaultInstance()
            : payload_;
      } else {
        return payloadBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * The CutoverJob event payload.
     * </pre>
     *
     * <code>.google.events.cloud.vmmigration.v1.CutoverJob payload = 1;</code>
     */
    public Builder setPayload(com.google.events.cloud.vmmigration.v1.CutoverJob value) {
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
     * The CutoverJob event payload.
     * </pre>
     *
     * <code>.google.events.cloud.vmmigration.v1.CutoverJob payload = 1;</code>
     */
    public Builder setPayload(
        com.google.events.cloud.vmmigration.v1.CutoverJob.Builder builderForValue) {
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
     * The CutoverJob event payload.
     * </pre>
     *
     * <code>.google.events.cloud.vmmigration.v1.CutoverJob payload = 1;</code>
     */
    public Builder mergePayload(com.google.events.cloud.vmmigration.v1.CutoverJob value) {
      if (payloadBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && payload_ != null
            && payload_ != com.google.events.cloud.vmmigration.v1.CutoverJob.getDefaultInstance()) {
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
     * The CutoverJob event payload.
     * </pre>
     *
     * <code>.google.events.cloud.vmmigration.v1.CutoverJob payload = 1;</code>
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
     * The CutoverJob event payload.
     * </pre>
     *
     * <code>.google.events.cloud.vmmigration.v1.CutoverJob payload = 1;</code>
     */
    public com.google.events.cloud.vmmigration.v1.CutoverJob.Builder getPayloadBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPayloadFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * The CutoverJob event payload.
     * </pre>
     *
     * <code>.google.events.cloud.vmmigration.v1.CutoverJob payload = 1;</code>
     */
    public com.google.events.cloud.vmmigration.v1.CutoverJobOrBuilder getPayloadOrBuilder() {
      if (payloadBuilder_ != null) {
        return payloadBuilder_.getMessageOrBuilder();
      } else {
        return payload_ == null
            ? com.google.events.cloud.vmmigration.v1.CutoverJob.getDefaultInstance()
            : payload_;
      }
    }

    /**
     *
     *
     * <pre>
     * The CutoverJob event payload.
     * </pre>
     *
     * <code>.google.events.cloud.vmmigration.v1.CutoverJob payload = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.events.cloud.vmmigration.v1.CutoverJob,
            com.google.events.cloud.vmmigration.v1.CutoverJob.Builder,
            com.google.events.cloud.vmmigration.v1.CutoverJobOrBuilder>
        getPayloadFieldBuilder() {
      if (payloadBuilder_ == null) {
        payloadBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.events.cloud.vmmigration.v1.CutoverJob,
                com.google.events.cloud.vmmigration.v1.CutoverJob.Builder,
                com.google.events.cloud.vmmigration.v1.CutoverJobOrBuilder>(
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

    // @@protoc_insertion_point(builder_scope:google.events.cloud.vmmigration.v1.CutoverJobEventData)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.vmmigration.v1.CutoverJobEventData)
  private static final com.google.events.cloud.vmmigration.v1.CutoverJobEventData DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.events.cloud.vmmigration.v1.CutoverJobEventData();
  }

  public static com.google.events.cloud.vmmigration.v1.CutoverJobEventData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CutoverJobEventData> PARSER =
      new com.google.protobuf.AbstractParser<CutoverJobEventData>() {
        @java.lang.Override
        public CutoverJobEventData parsePartialFrom(
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

  public static com.google.protobuf.Parser<CutoverJobEventData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CutoverJobEventData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.vmmigration.v1.CutoverJobEventData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
