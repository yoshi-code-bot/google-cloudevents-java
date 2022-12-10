// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/cloud/scheduler/v1/data.proto

package com.google.events.cloud.scheduler.v1;

/**
 * <pre>
 * Scheduler job data.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.scheduler.v1.SchedulerJobData}
 */
public final class SchedulerJobData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.scheduler.v1.SchedulerJobData)
    SchedulerJobDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SchedulerJobData.newBuilder() to construct.
  private SchedulerJobData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SchedulerJobData() {
    customData_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SchedulerJobData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.events.cloud.scheduler.v1.Data.internal_static_google_events_cloud_scheduler_v1_SchedulerJobData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.scheduler.v1.Data.internal_static_google_events_cloud_scheduler_v1_SchedulerJobData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.scheduler.v1.SchedulerJobData.class, com.google.events.cloud.scheduler.v1.SchedulerJobData.Builder.class);
  }

  public static final int CUSTOM_DATA_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString customData_;
  /**
   * <pre>
   * The custom data the user specified when creating the scheduler source.
   * </pre>
   *
   * <code>bytes custom_data = 1;</code>
   * @return The customData.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCustomData() {
    return customData_;
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
    if (!customData_.isEmpty()) {
      output.writeBytes(1, customData_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!customData_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, customData_);
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
    if (!(obj instanceof com.google.events.cloud.scheduler.v1.SchedulerJobData)) {
      return super.equals(obj);
    }
    com.google.events.cloud.scheduler.v1.SchedulerJobData other = (com.google.events.cloud.scheduler.v1.SchedulerJobData) obj;

    if (!getCustomData()
        .equals(other.getCustomData())) return false;
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
    hash = (37 * hash) + CUSTOM_DATA_FIELD_NUMBER;
    hash = (53 * hash) + getCustomData().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.cloud.scheduler.v1.SchedulerJobData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.events.cloud.scheduler.v1.SchedulerJobData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.events.cloud.scheduler.v1.SchedulerJobData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.events.cloud.scheduler.v1.SchedulerJobData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.events.cloud.scheduler.v1.SchedulerJobData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.events.cloud.scheduler.v1.SchedulerJobData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.events.cloud.scheduler.v1.SchedulerJobData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.events.cloud.scheduler.v1.SchedulerJobData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.events.cloud.scheduler.v1.SchedulerJobData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.events.cloud.scheduler.v1.SchedulerJobData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.events.cloud.scheduler.v1.SchedulerJobData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.events.cloud.scheduler.v1.SchedulerJobData parseFrom(
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
  public static Builder newBuilder(com.google.events.cloud.scheduler.v1.SchedulerJobData prototype) {
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
   * Scheduler job data.
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.scheduler.v1.SchedulerJobData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.scheduler.v1.SchedulerJobData)
      com.google.events.cloud.scheduler.v1.SchedulerJobDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.events.cloud.scheduler.v1.Data.internal_static_google_events_cloud_scheduler_v1_SchedulerJobData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.scheduler.v1.Data.internal_static_google_events_cloud_scheduler_v1_SchedulerJobData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.scheduler.v1.SchedulerJobData.class, com.google.events.cloud.scheduler.v1.SchedulerJobData.Builder.class);
    }

    // Construct using com.google.events.cloud.scheduler.v1.SchedulerJobData.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      customData_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.events.cloud.scheduler.v1.Data.internal_static_google_events_cloud_scheduler_v1_SchedulerJobData_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.scheduler.v1.SchedulerJobData getDefaultInstanceForType() {
      return com.google.events.cloud.scheduler.v1.SchedulerJobData.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.scheduler.v1.SchedulerJobData build() {
      com.google.events.cloud.scheduler.v1.SchedulerJobData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.scheduler.v1.SchedulerJobData buildPartial() {
      com.google.events.cloud.scheduler.v1.SchedulerJobData result = new com.google.events.cloud.scheduler.v1.SchedulerJobData(this);
      result.customData_ = customData_;
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
      if (other instanceof com.google.events.cloud.scheduler.v1.SchedulerJobData) {
        return mergeFrom((com.google.events.cloud.scheduler.v1.SchedulerJobData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.events.cloud.scheduler.v1.SchedulerJobData other) {
      if (other == com.google.events.cloud.scheduler.v1.SchedulerJobData.getDefaultInstance()) return this;
      if (other.getCustomData() != com.google.protobuf.ByteString.EMPTY) {
        setCustomData(other.getCustomData());
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
            case 10: {
              customData_ = input.readBytes();

              break;
            } // case 10
            default: {
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

    private com.google.protobuf.ByteString customData_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * The custom data the user specified when creating the scheduler source.
     * </pre>
     *
     * <code>bytes custom_data = 1;</code>
     * @return The customData.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getCustomData() {
      return customData_;
    }
    /**
     * <pre>
     * The custom data the user specified when creating the scheduler source.
     * </pre>
     *
     * <code>bytes custom_data = 1;</code>
     * @param value The customData to set.
     * @return This builder for chaining.
     */
    public Builder setCustomData(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      customData_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The custom data the user specified when creating the scheduler source.
     * </pre>
     *
     * <code>bytes custom_data = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomData() {
      
      customData_ = getDefaultInstance().getCustomData();
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.events.cloud.scheduler.v1.SchedulerJobData)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.scheduler.v1.SchedulerJobData)
  private static final com.google.events.cloud.scheduler.v1.SchedulerJobData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.events.cloud.scheduler.v1.SchedulerJobData();
  }

  public static com.google.events.cloud.scheduler.v1.SchedulerJobData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SchedulerJobData>
      PARSER = new com.google.protobuf.AbstractParser<SchedulerJobData>() {
    @java.lang.Override
    public SchedulerJobData parsePartialFrom(
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

  public static com.google.protobuf.Parser<SchedulerJobData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SchedulerJobData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.scheduler.v1.SchedulerJobData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

