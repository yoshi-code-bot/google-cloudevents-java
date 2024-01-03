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
// source: google/events/cloud/beyondcorp/clientconnectorservices/v1/data.proto

package com.google.events.cloud.beyondcorp.clientconnectorservices.v1;

/**
 *
 *
 * <pre>
 * The data within all ClientConnectorService events.
 * </pre>
 *
 * Protobuf type {@code
 * google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorServiceEventData}
 */
public final class ClientConnectorServiceEventData extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorServiceEventData)
    ClientConnectorServiceEventDataOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ClientConnectorServiceEventData.newBuilder() to construct.
  private ClientConnectorServiceEventData(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ClientConnectorServiceEventData() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ClientConnectorServiceEventData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.events.cloud.beyondcorp.clientconnectorservices.v1.Data
        .internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorServiceEventData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.beyondcorp.clientconnectorservices.v1.Data
        .internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorServiceEventData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.beyondcorp.clientconnectorservices.v1
                .ClientConnectorServiceEventData.class,
            com.google.events.cloud.beyondcorp.clientconnectorservices.v1
                .ClientConnectorServiceEventData.Builder.class);
  }

  private int bitField0_;
  public static final int PAYLOAD_FIELD_NUMBER = 1;
  private com.google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService
      payload_;

  /**
   *
   *
   * <pre>
   * Optional. The ClientConnectorService event payload. Unset for deletion
   * events.
   * </pre>
   *
   * <code>
   * optional .google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService payload = 1;
   * </code>
   *
   * @return Whether the payload field is set.
   */
  @java.lang.Override
  public boolean hasPayload() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Optional. The ClientConnectorService event payload. Unset for deletion
   * events.
   * </pre>
   *
   * <code>
   * optional .google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService payload = 1;
   * </code>
   *
   * @return The payload.
   */
  @java.lang.Override
  public com.google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService
      getPayload() {
    return payload_ == null
        ? com.google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService
            .getDefaultInstance()
        : payload_;
  }

  /**
   *
   *
   * <pre>
   * Optional. The ClientConnectorService event payload. Unset for deletion
   * events.
   * </pre>
   *
   * <code>
   * optional .google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService payload = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.events.cloud.beyondcorp.clientconnectorservices.v1
          .ClientConnectorServiceOrBuilder
      getPayloadOrBuilder() {
    return payload_ == null
        ? com.google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService
            .getDefaultInstance()
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getPayload());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
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
    if (!(obj
        instanceof
        com.google.events.cloud.beyondcorp.clientconnectorservices.v1
            .ClientConnectorServiceEventData)) {
      return super.equals(obj);
    }
    com.google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorServiceEventData
        other =
            (com.google.events.cloud.beyondcorp.clientconnectorservices.v1
                    .ClientConnectorServiceEventData)
                obj;

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

  public static com.google.events.cloud.beyondcorp.clientconnectorservices.v1
          .ClientConnectorServiceEventData
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.beyondcorp.clientconnectorservices.v1
          .ClientConnectorServiceEventData
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.beyondcorp.clientconnectorservices.v1
          .ClientConnectorServiceEventData
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.beyondcorp.clientconnectorservices.v1
          .ClientConnectorServiceEventData
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.beyondcorp.clientconnectorservices.v1
          .ClientConnectorServiceEventData
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.beyondcorp.clientconnectorservices.v1
          .ClientConnectorServiceEventData
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.beyondcorp.clientconnectorservices.v1
          .ClientConnectorServiceEventData
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.beyondcorp.clientconnectorservices.v1
          .ClientConnectorServiceEventData
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.beyondcorp.clientconnectorservices.v1
          .ClientConnectorServiceEventData
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.beyondcorp.clientconnectorservices.v1
          .ClientConnectorServiceEventData
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.beyondcorp.clientconnectorservices.v1
          .ClientConnectorServiceEventData
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.beyondcorp.clientconnectorservices.v1
          .ClientConnectorServiceEventData
      parseFrom(
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
      com.google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorServiceEventData
          prototype) {
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
   * The data within all ClientConnectorService events.
   * </pre>
   *
   * Protobuf type {@code
   * google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorServiceEventData}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorServiceEventData)
      com.google.events.cloud.beyondcorp.clientconnectorservices.v1
          .ClientConnectorServiceEventDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.events.cloud.beyondcorp.clientconnectorservices.v1.Data
          .internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorServiceEventData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.beyondcorp.clientconnectorservices.v1.Data
          .internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorServiceEventData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.beyondcorp.clientconnectorservices.v1
                  .ClientConnectorServiceEventData.class,
              com.google.events.cloud.beyondcorp.clientconnectorservices.v1
                  .ClientConnectorServiceEventData.Builder.class);
    }

    // Construct using
    // com.google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorServiceEventData.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getPayloadFieldBuilder();
      }
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
      return com.google.events.cloud.beyondcorp.clientconnectorservices.v1.Data
          .internal_static_google_events_cloud_beyondcorp_clientconnectorservices_v1_ClientConnectorServiceEventData_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.beyondcorp.clientconnectorservices.v1
            .ClientConnectorServiceEventData
        getDefaultInstanceForType() {
      return com.google.events.cloud.beyondcorp.clientconnectorservices.v1
          .ClientConnectorServiceEventData.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.beyondcorp.clientconnectorservices.v1
            .ClientConnectorServiceEventData
        build() {
      com.google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorServiceEventData
          result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.beyondcorp.clientconnectorservices.v1
            .ClientConnectorServiceEventData
        buildPartial() {
      com.google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorServiceEventData
          result =
              new com.google.events.cloud.beyondcorp.clientconnectorservices.v1
                  .ClientConnectorServiceEventData(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.events.cloud.beyondcorp.clientconnectorservices.v1
                .ClientConnectorServiceEventData
            result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.payload_ = payloadBuilder_ == null ? payload_ : payloadBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other
          instanceof
          com.google.events.cloud.beyondcorp.clientconnectorservices.v1
              .ClientConnectorServiceEventData) {
        return mergeFrom(
            (com.google.events.cloud.beyondcorp.clientconnectorservices.v1
                    .ClientConnectorServiceEventData)
                other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.events.cloud.beyondcorp.clientconnectorservices.v1
                .ClientConnectorServiceEventData
            other) {
      if (other
          == com.google.events.cloud.beyondcorp.clientconnectorservices.v1
              .ClientConnectorServiceEventData.getDefaultInstance()) return this;
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

    private com.google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService
        payload_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService,
            com.google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService
                .Builder,
            com.google.events.cloud.beyondcorp.clientconnectorservices.v1
                .ClientConnectorServiceOrBuilder>
        payloadBuilder_;

    /**
     *
     *
     * <pre>
     * Optional. The ClientConnectorService event payload. Unset for deletion
     * events.
     * </pre>
     *
     * <code>
     * optional .google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService payload = 1;
     * </code>
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
     * Optional. The ClientConnectorService event payload. Unset for deletion
     * events.
     * </pre>
     *
     * <code>
     * optional .google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService payload = 1;
     * </code>
     *
     * @return The payload.
     */
    public com.google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService
        getPayload() {
      if (payloadBuilder_ == null) {
        return payload_ == null
            ? com.google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService
                .getDefaultInstance()
            : payload_;
      } else {
        return payloadBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. The ClientConnectorService event payload. Unset for deletion
     * events.
     * </pre>
     *
     * <code>
     * optional .google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService payload = 1;
     * </code>
     */
    public Builder setPayload(
        com.google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService
            value) {
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
     * Optional. The ClientConnectorService event payload. Unset for deletion
     * events.
     * </pre>
     *
     * <code>
     * optional .google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService payload = 1;
     * </code>
     */
    public Builder setPayload(
        com.google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService.Builder
            builderForValue) {
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
     * Optional. The ClientConnectorService event payload. Unset for deletion
     * events.
     * </pre>
     *
     * <code>
     * optional .google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService payload = 1;
     * </code>
     */
    public Builder mergePayload(
        com.google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService
            value) {
      if (payloadBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && payload_ != null
            && payload_
                != com.google.events.cloud.beyondcorp.clientconnectorservices.v1
                    .ClientConnectorService.getDefaultInstance()) {
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
     * Optional. The ClientConnectorService event payload. Unset for deletion
     * events.
     * </pre>
     *
     * <code>
     * optional .google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService payload = 1;
     * </code>
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
     * Optional. The ClientConnectorService event payload. Unset for deletion
     * events.
     * </pre>
     *
     * <code>
     * optional .google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService payload = 1;
     * </code>
     */
    public com.google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService
            .Builder
        getPayloadBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPayloadFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Optional. The ClientConnectorService event payload. Unset for deletion
     * events.
     * </pre>
     *
     * <code>
     * optional .google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService payload = 1;
     * </code>
     */
    public com.google.events.cloud.beyondcorp.clientconnectorservices.v1
            .ClientConnectorServiceOrBuilder
        getPayloadOrBuilder() {
      if (payloadBuilder_ != null) {
        return payloadBuilder_.getMessageOrBuilder();
      } else {
        return payload_ == null
            ? com.google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService
                .getDefaultInstance()
            : payload_;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. The ClientConnectorService event payload. Unset for deletion
     * events.
     * </pre>
     *
     * <code>
     * optional .google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService payload = 1;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService,
            com.google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService
                .Builder,
            com.google.events.cloud.beyondcorp.clientconnectorservices.v1
                .ClientConnectorServiceOrBuilder>
        getPayloadFieldBuilder() {
      if (payloadBuilder_ == null) {
        payloadBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.events.cloud.beyondcorp.clientconnectorservices.v1
                    .ClientConnectorService,
                com.google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorService
                    .Builder,
                com.google.events.cloud.beyondcorp.clientconnectorservices.v1
                    .ClientConnectorServiceOrBuilder>(
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

    // @@protoc_insertion_point(builder_scope:google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorServiceEventData)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.beyondcorp.clientconnectorservices.v1.ClientConnectorServiceEventData)
  private static final com.google.events.cloud.beyondcorp.clientconnectorservices.v1
          .ClientConnectorServiceEventData
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.events.cloud.beyondcorp.clientconnectorservices.v1
            .ClientConnectorServiceEventData();
  }

  public static com.google.events.cloud.beyondcorp.clientconnectorservices.v1
          .ClientConnectorServiceEventData
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClientConnectorServiceEventData> PARSER =
      new com.google.protobuf.AbstractParser<ClientConnectorServiceEventData>() {
        @java.lang.Override
        public ClientConnectorServiceEventData parsePartialFrom(
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

  public static com.google.protobuf.Parser<ClientConnectorServiceEventData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClientConnectorServiceEventData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.beyondcorp.clientconnectorservices.v1
          .ClientConnectorServiceEventData
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
