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
// source: google/events/cloud/dataflow/v1beta3/data.proto

package com.google.events.cloud.dataflow.v1beta3;

/**
 *
 *
 * <pre>
 * Contains information about how a particular
 * [google.dataflow.v1beta3.Step][google.dataflow.v1beta3.Step] will be
 * executed.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo}
 */
public final class JobExecutionStageInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo)
    JobExecutionStageInfoOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use JobExecutionStageInfo.newBuilder() to construct.
  private JobExecutionStageInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private JobExecutionStageInfo() {
    stepName_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new JobExecutionStageInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.events.cloud.dataflow.v1beta3.Data
        .internal_static_google_events_cloud_dataflow_v1beta3_JobExecutionStageInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.dataflow.v1beta3.Data
        .internal_static_google_events_cloud_dataflow_v1beta3_JobExecutionStageInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo.class,
            com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo.Builder.class);
  }

  public static final int STEP_NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringList stepName_;

  /**
   *
   *
   * <pre>
   * The steps associated with the execution stage.
   * Note that stages may have several steps, and that a given step
   * might be run by more than one stage.
   * </pre>
   *
   * <code>repeated string step_name = 1;</code>
   *
   * @return A list containing the stepName.
   */
  public com.google.protobuf.ProtocolStringList getStepNameList() {
    return stepName_;
  }

  /**
   *
   *
   * <pre>
   * The steps associated with the execution stage.
   * Note that stages may have several steps, and that a given step
   * might be run by more than one stage.
   * </pre>
   *
   * <code>repeated string step_name = 1;</code>
   *
   * @return The count of stepName.
   */
  public int getStepNameCount() {
    return stepName_.size();
  }

  /**
   *
   *
   * <pre>
   * The steps associated with the execution stage.
   * Note that stages may have several steps, and that a given step
   * might be run by more than one stage.
   * </pre>
   *
   * <code>repeated string step_name = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The stepName at the given index.
   */
  public java.lang.String getStepName(int index) {
    return stepName_.get(index);
  }

  /**
   *
   *
   * <pre>
   * The steps associated with the execution stage.
   * Note that stages may have several steps, and that a given step
   * might be run by more than one stage.
   * </pre>
   *
   * <code>repeated string step_name = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the stepName at the given index.
   */
  public com.google.protobuf.ByteString getStepNameBytes(int index) {
    return stepName_.getByteString(index);
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
    for (int i = 0; i < stepName_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, stepName_.getRaw(i));
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
      for (int i = 0; i < stepName_.size(); i++) {
        dataSize += computeStringSizeNoTag(stepName_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getStepNameList().size();
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
    if (!(obj instanceof com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo)) {
      return super.equals(obj);
    }
    com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo other =
        (com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo) obj;

    if (!getStepNameList().equals(other.getStepNameList())) return false;
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
    if (getStepNameCount() > 0) {
      hash = (37 * hash) + STEP_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getStepNameList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo parseFrom(
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
      com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo prototype) {
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
   * Contains information about how a particular
   * [google.dataflow.v1beta3.Step][google.dataflow.v1beta3.Step] will be
   * executed.
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo)
      com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.events.cloud.dataflow.v1beta3.Data
          .internal_static_google_events_cloud_dataflow_v1beta3_JobExecutionStageInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.dataflow.v1beta3.Data
          .internal_static_google_events_cloud_dataflow_v1beta3_JobExecutionStageInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo.class,
              com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo.Builder.class);
    }

    // Construct using com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      stepName_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.events.cloud.dataflow.v1beta3.Data
          .internal_static_google_events_cloud_dataflow_v1beta3_JobExecutionStageInfo_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo
        getDefaultInstanceForType() {
      return com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo build() {
      com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo buildPartial() {
      com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo result =
          new com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        stepName_ = stepName_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.stepName_ = stepName_;
    }

    private void buildPartial0(
        com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo result) {
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
      if (other instanceof com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo) {
        return mergeFrom((com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo other) {
      if (other
          == com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo.getDefaultInstance())
        return this;
      if (!other.stepName_.isEmpty()) {
        if (stepName_.isEmpty()) {
          stepName_ = other.stepName_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureStepNameIsMutable();
          stepName_.addAll(other.stepName_);
        }
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
                java.lang.String s = input.readStringRequireUtf8();
                ensureStepNameIsMutable();
                stepName_.add(s);
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

    private com.google.protobuf.LazyStringList stepName_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureStepNameIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        stepName_ = new com.google.protobuf.LazyStringArrayList(stepName_);
        bitField0_ |= 0x00000001;
      }
    }

    /**
     *
     *
     * <pre>
     * The steps associated with the execution stage.
     * Note that stages may have several steps, and that a given step
     * might be run by more than one stage.
     * </pre>
     *
     * <code>repeated string step_name = 1;</code>
     *
     * @return A list containing the stepName.
     */
    public com.google.protobuf.ProtocolStringList getStepNameList() {
      return stepName_.getUnmodifiableView();
    }

    /**
     *
     *
     * <pre>
     * The steps associated with the execution stage.
     * Note that stages may have several steps, and that a given step
     * might be run by more than one stage.
     * </pre>
     *
     * <code>repeated string step_name = 1;</code>
     *
     * @return The count of stepName.
     */
    public int getStepNameCount() {
      return stepName_.size();
    }

    /**
     *
     *
     * <pre>
     * The steps associated with the execution stage.
     * Note that stages may have several steps, and that a given step
     * might be run by more than one stage.
     * </pre>
     *
     * <code>repeated string step_name = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The stepName at the given index.
     */
    public java.lang.String getStepName(int index) {
      return stepName_.get(index);
    }

    /**
     *
     *
     * <pre>
     * The steps associated with the execution stage.
     * Note that stages may have several steps, and that a given step
     * might be run by more than one stage.
     * </pre>
     *
     * <code>repeated string step_name = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the stepName at the given index.
     */
    public com.google.protobuf.ByteString getStepNameBytes(int index) {
      return stepName_.getByteString(index);
    }

    /**
     *
     *
     * <pre>
     * The steps associated with the execution stage.
     * Note that stages may have several steps, and that a given step
     * might be run by more than one stage.
     * </pre>
     *
     * <code>repeated string step_name = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The stepName to set.
     * @return This builder for chaining.
     */
    public Builder setStepName(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureStepNameIsMutable();
      stepName_.set(index, value);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The steps associated with the execution stage.
     * Note that stages may have several steps, and that a given step
     * might be run by more than one stage.
     * </pre>
     *
     * <code>repeated string step_name = 1;</code>
     *
     * @param value The stepName to add.
     * @return This builder for chaining.
     */
    public Builder addStepName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureStepNameIsMutable();
      stepName_.add(value);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The steps associated with the execution stage.
     * Note that stages may have several steps, and that a given step
     * might be run by more than one stage.
     * </pre>
     *
     * <code>repeated string step_name = 1;</code>
     *
     * @param values The stepName to add.
     * @return This builder for chaining.
     */
    public Builder addAllStepName(java.lang.Iterable<java.lang.String> values) {
      ensureStepNameIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, stepName_);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The steps associated with the execution stage.
     * Note that stages may have several steps, and that a given step
     * might be run by more than one stage.
     * </pre>
     *
     * <code>repeated string step_name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearStepName() {
      stepName_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The steps associated with the execution stage.
     * Note that stages may have several steps, and that a given step
     * might be run by more than one stage.
     * </pre>
     *
     * <code>repeated string step_name = 1;</code>
     *
     * @param value The bytes of the stepName to add.
     * @return This builder for chaining.
     */
    public Builder addStepNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureStepNameIsMutable();
      stepName_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo)
  private static final com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo();
  }

  public static com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JobExecutionStageInfo> PARSER =
      new com.google.protobuf.AbstractParser<JobExecutionStageInfo>() {
        @java.lang.Override
        public JobExecutionStageInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<JobExecutionStageInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JobExecutionStageInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.dataflow.v1beta3.JobExecutionStageInfo
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
