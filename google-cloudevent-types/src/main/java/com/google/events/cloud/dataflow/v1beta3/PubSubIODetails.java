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
// source: google/events/cloud/dataflow/v1beta3/data.proto

package com.google.events.cloud.dataflow.v1beta3;

/**
 *
 *
 * <pre>
 * Metadata for a Pub/Sub connector used by the job.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.dataflow.v1beta3.PubSubIODetails}
 */
public final class PubSubIODetails extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.dataflow.v1beta3.PubSubIODetails)
    PubSubIODetailsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PubSubIODetails.newBuilder() to construct.
  private PubSubIODetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PubSubIODetails() {
    topic_ = "";
    subscription_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PubSubIODetails();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.events.cloud.dataflow.v1beta3.Data
        .internal_static_google_events_cloud_dataflow_v1beta3_PubSubIODetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.dataflow.v1beta3.Data
        .internal_static_google_events_cloud_dataflow_v1beta3_PubSubIODetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.dataflow.v1beta3.PubSubIODetails.class,
            com.google.events.cloud.dataflow.v1beta3.PubSubIODetails.Builder.class);
  }

  public static final int TOPIC_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object topic_ = "";
  /**
   *
   *
   * <pre>
   * Topic accessed in the connection.
   * </pre>
   *
   * <code>string topic = 1;</code>
   *
   * @return The topic.
   */
  @java.lang.Override
  public java.lang.String getTopic() {
    java.lang.Object ref = topic_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      topic_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Topic accessed in the connection.
   * </pre>
   *
   * <code>string topic = 1;</code>
   *
   * @return The bytes for topic.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTopicBytes() {
    java.lang.Object ref = topic_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      topic_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBSCRIPTION_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object subscription_ = "";
  /**
   *
   *
   * <pre>
   * Subscription used in the connection.
   * </pre>
   *
   * <code>string subscription = 2;</code>
   *
   * @return The subscription.
   */
  @java.lang.Override
  public java.lang.String getSubscription() {
    java.lang.Object ref = subscription_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subscription_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Subscription used in the connection.
   * </pre>
   *
   * <code>string subscription = 2;</code>
   *
   * @return The bytes for subscription.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSubscriptionBytes() {
    java.lang.Object ref = subscription_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      subscription_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(topic_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, topic_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subscription_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, subscription_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(topic_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, topic_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subscription_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, subscription_);
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
    if (!(obj instanceof com.google.events.cloud.dataflow.v1beta3.PubSubIODetails)) {
      return super.equals(obj);
    }
    com.google.events.cloud.dataflow.v1beta3.PubSubIODetails other =
        (com.google.events.cloud.dataflow.v1beta3.PubSubIODetails) obj;

    if (!getTopic().equals(other.getTopic())) return false;
    if (!getSubscription().equals(other.getSubscription())) return false;
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
    hash = (37 * hash) + TOPIC_FIELD_NUMBER;
    hash = (53 * hash) + getTopic().hashCode();
    hash = (37 * hash) + SUBSCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getSubscription().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.cloud.dataflow.v1beta3.PubSubIODetails parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.dataflow.v1beta3.PubSubIODetails parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.dataflow.v1beta3.PubSubIODetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.dataflow.v1beta3.PubSubIODetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.dataflow.v1beta3.PubSubIODetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.dataflow.v1beta3.PubSubIODetails parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.dataflow.v1beta3.PubSubIODetails parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.dataflow.v1beta3.PubSubIODetails parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.dataflow.v1beta3.PubSubIODetails parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.dataflow.v1beta3.PubSubIODetails parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.dataflow.v1beta3.PubSubIODetails parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.dataflow.v1beta3.PubSubIODetails parseFrom(
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
      com.google.events.cloud.dataflow.v1beta3.PubSubIODetails prototype) {
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
   * Metadata for a Pub/Sub connector used by the job.
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.dataflow.v1beta3.PubSubIODetails}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.dataflow.v1beta3.PubSubIODetails)
      com.google.events.cloud.dataflow.v1beta3.PubSubIODetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.events.cloud.dataflow.v1beta3.Data
          .internal_static_google_events_cloud_dataflow_v1beta3_PubSubIODetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.dataflow.v1beta3.Data
          .internal_static_google_events_cloud_dataflow_v1beta3_PubSubIODetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.dataflow.v1beta3.PubSubIODetails.class,
              com.google.events.cloud.dataflow.v1beta3.PubSubIODetails.Builder.class);
    }

    // Construct using com.google.events.cloud.dataflow.v1beta3.PubSubIODetails.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      topic_ = "";
      subscription_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.events.cloud.dataflow.v1beta3.Data
          .internal_static_google_events_cloud_dataflow_v1beta3_PubSubIODetails_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.dataflow.v1beta3.PubSubIODetails getDefaultInstanceForType() {
      return com.google.events.cloud.dataflow.v1beta3.PubSubIODetails.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.dataflow.v1beta3.PubSubIODetails build() {
      com.google.events.cloud.dataflow.v1beta3.PubSubIODetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.dataflow.v1beta3.PubSubIODetails buildPartial() {
      com.google.events.cloud.dataflow.v1beta3.PubSubIODetails result =
          new com.google.events.cloud.dataflow.v1beta3.PubSubIODetails(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.events.cloud.dataflow.v1beta3.PubSubIODetails result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.topic_ = topic_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.subscription_ = subscription_;
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
      if (other instanceof com.google.events.cloud.dataflow.v1beta3.PubSubIODetails) {
        return mergeFrom((com.google.events.cloud.dataflow.v1beta3.PubSubIODetails) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.events.cloud.dataflow.v1beta3.PubSubIODetails other) {
      if (other == com.google.events.cloud.dataflow.v1beta3.PubSubIODetails.getDefaultInstance())
        return this;
      if (!other.getTopic().isEmpty()) {
        topic_ = other.topic_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSubscription().isEmpty()) {
        subscription_ = other.subscription_;
        bitField0_ |= 0x00000002;
        onChanged();
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
                topic_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                subscription_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
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

    private java.lang.Object topic_ = "";
    /**
     *
     *
     * <pre>
     * Topic accessed in the connection.
     * </pre>
     *
     * <code>string topic = 1;</code>
     *
     * @return The topic.
     */
    public java.lang.String getTopic() {
      java.lang.Object ref = topic_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        topic_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Topic accessed in the connection.
     * </pre>
     *
     * <code>string topic = 1;</code>
     *
     * @return The bytes for topic.
     */
    public com.google.protobuf.ByteString getTopicBytes() {
      java.lang.Object ref = topic_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        topic_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Topic accessed in the connection.
     * </pre>
     *
     * <code>string topic = 1;</code>
     *
     * @param value The topic to set.
     * @return This builder for chaining.
     */
    public Builder setTopic(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      topic_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Topic accessed in the connection.
     * </pre>
     *
     * <code>string topic = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTopic() {
      topic_ = getDefaultInstance().getTopic();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Topic accessed in the connection.
     * </pre>
     *
     * <code>string topic = 1;</code>
     *
     * @param value The bytes for topic to set.
     * @return This builder for chaining.
     */
    public Builder setTopicBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      topic_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object subscription_ = "";
    /**
     *
     *
     * <pre>
     * Subscription used in the connection.
     * </pre>
     *
     * <code>string subscription = 2;</code>
     *
     * @return The subscription.
     */
    public java.lang.String getSubscription() {
      java.lang.Object ref = subscription_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subscription_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Subscription used in the connection.
     * </pre>
     *
     * <code>string subscription = 2;</code>
     *
     * @return The bytes for subscription.
     */
    public com.google.protobuf.ByteString getSubscriptionBytes() {
      java.lang.Object ref = subscription_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        subscription_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Subscription used in the connection.
     * </pre>
     *
     * <code>string subscription = 2;</code>
     *
     * @param value The subscription to set.
     * @return This builder for chaining.
     */
    public Builder setSubscription(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      subscription_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Subscription used in the connection.
     * </pre>
     *
     * <code>string subscription = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSubscription() {
      subscription_ = getDefaultInstance().getSubscription();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Subscription used in the connection.
     * </pre>
     *
     * <code>string subscription = 2;</code>
     *
     * @param value The bytes for subscription to set.
     * @return This builder for chaining.
     */
    public Builder setSubscriptionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      subscription_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.events.cloud.dataflow.v1beta3.PubSubIODetails)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.dataflow.v1beta3.PubSubIODetails)
  private static final com.google.events.cloud.dataflow.v1beta3.PubSubIODetails DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.events.cloud.dataflow.v1beta3.PubSubIODetails();
  }

  public static com.google.events.cloud.dataflow.v1beta3.PubSubIODetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PubSubIODetails> PARSER =
      new com.google.protobuf.AbstractParser<PubSubIODetails>() {
        @java.lang.Override
        public PubSubIODetails parsePartialFrom(
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

  public static com.google.protobuf.Parser<PubSubIODetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PubSubIODetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.dataflow.v1beta3.PubSubIODetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
