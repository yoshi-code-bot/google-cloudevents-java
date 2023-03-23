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
 * Settings for WorkerPool autoscaling.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.dataflow.v1beta3.AutoscalingSettings}
 */
public final class AutoscalingSettings extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.dataflow.v1beta3.AutoscalingSettings)
    AutoscalingSettingsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AutoscalingSettings.newBuilder() to construct.
  private AutoscalingSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AutoscalingSettings() {
    algorithm_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AutoscalingSettings();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.events.cloud.dataflow.v1beta3.Data
        .internal_static_google_events_cloud_dataflow_v1beta3_AutoscalingSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.dataflow.v1beta3.Data
        .internal_static_google_events_cloud_dataflow_v1beta3_AutoscalingSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.dataflow.v1beta3.AutoscalingSettings.class,
            com.google.events.cloud.dataflow.v1beta3.AutoscalingSettings.Builder.class);
  }

  public static final int ALGORITHM_FIELD_NUMBER = 1;
  private int algorithm_ = 0;
  /**
   *
   *
   * <pre>
   * The algorithm to use for autoscaling.
   * </pre>
   *
   * <code>.google.events.cloud.dataflow.v1beta3.AutoscalingAlgorithm algorithm = 1;</code>
   *
   * @return The enum numeric value on the wire for algorithm.
   */
  @java.lang.Override
  public int getAlgorithmValue() {
    return algorithm_;
  }
  /**
   *
   *
   * <pre>
   * The algorithm to use for autoscaling.
   * </pre>
   *
   * <code>.google.events.cloud.dataflow.v1beta3.AutoscalingAlgorithm algorithm = 1;</code>
   *
   * @return The algorithm.
   */
  @java.lang.Override
  public com.google.events.cloud.dataflow.v1beta3.AutoscalingAlgorithm getAlgorithm() {
    com.google.events.cloud.dataflow.v1beta3.AutoscalingAlgorithm result =
        com.google.events.cloud.dataflow.v1beta3.AutoscalingAlgorithm.forNumber(algorithm_);
    return result == null
        ? com.google.events.cloud.dataflow.v1beta3.AutoscalingAlgorithm.UNRECOGNIZED
        : result;
  }

  public static final int MAX_NUM_WORKERS_FIELD_NUMBER = 2;
  private int maxNumWorkers_ = 0;
  /**
   *
   *
   * <pre>
   * The maximum number of workers to cap scaling at.
   * </pre>
   *
   * <code>int32 max_num_workers = 2;</code>
   *
   * @return The maxNumWorkers.
   */
  @java.lang.Override
  public int getMaxNumWorkers() {
    return maxNumWorkers_;
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
    if (algorithm_
        != com.google.events.cloud.dataflow.v1beta3.AutoscalingAlgorithm
            .AUTOSCALING_ALGORITHM_UNKNOWN
            .getNumber()) {
      output.writeEnum(1, algorithm_);
    }
    if (maxNumWorkers_ != 0) {
      output.writeInt32(2, maxNumWorkers_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (algorithm_
        != com.google.events.cloud.dataflow.v1beta3.AutoscalingAlgorithm
            .AUTOSCALING_ALGORITHM_UNKNOWN
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, algorithm_);
    }
    if (maxNumWorkers_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, maxNumWorkers_);
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
    if (!(obj instanceof com.google.events.cloud.dataflow.v1beta3.AutoscalingSettings)) {
      return super.equals(obj);
    }
    com.google.events.cloud.dataflow.v1beta3.AutoscalingSettings other =
        (com.google.events.cloud.dataflow.v1beta3.AutoscalingSettings) obj;

    if (algorithm_ != other.algorithm_) return false;
    if (getMaxNumWorkers() != other.getMaxNumWorkers()) return false;
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
    hash = (37 * hash) + ALGORITHM_FIELD_NUMBER;
    hash = (53 * hash) + algorithm_;
    hash = (37 * hash) + MAX_NUM_WORKERS_FIELD_NUMBER;
    hash = (53 * hash) + getMaxNumWorkers();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.cloud.dataflow.v1beta3.AutoscalingSettings parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.dataflow.v1beta3.AutoscalingSettings parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.dataflow.v1beta3.AutoscalingSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.dataflow.v1beta3.AutoscalingSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.dataflow.v1beta3.AutoscalingSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.dataflow.v1beta3.AutoscalingSettings parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.dataflow.v1beta3.AutoscalingSettings parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.dataflow.v1beta3.AutoscalingSettings parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.dataflow.v1beta3.AutoscalingSettings parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.dataflow.v1beta3.AutoscalingSettings parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.dataflow.v1beta3.AutoscalingSettings parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.dataflow.v1beta3.AutoscalingSettings parseFrom(
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
      com.google.events.cloud.dataflow.v1beta3.AutoscalingSettings prototype) {
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
   * Settings for WorkerPool autoscaling.
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.dataflow.v1beta3.AutoscalingSettings}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.dataflow.v1beta3.AutoscalingSettings)
      com.google.events.cloud.dataflow.v1beta3.AutoscalingSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.events.cloud.dataflow.v1beta3.Data
          .internal_static_google_events_cloud_dataflow_v1beta3_AutoscalingSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.dataflow.v1beta3.Data
          .internal_static_google_events_cloud_dataflow_v1beta3_AutoscalingSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.dataflow.v1beta3.AutoscalingSettings.class,
              com.google.events.cloud.dataflow.v1beta3.AutoscalingSettings.Builder.class);
    }

    // Construct using com.google.events.cloud.dataflow.v1beta3.AutoscalingSettings.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      algorithm_ = 0;
      maxNumWorkers_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.events.cloud.dataflow.v1beta3.Data
          .internal_static_google_events_cloud_dataflow_v1beta3_AutoscalingSettings_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.dataflow.v1beta3.AutoscalingSettings
        getDefaultInstanceForType() {
      return com.google.events.cloud.dataflow.v1beta3.AutoscalingSettings.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.dataflow.v1beta3.AutoscalingSettings build() {
      com.google.events.cloud.dataflow.v1beta3.AutoscalingSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.dataflow.v1beta3.AutoscalingSettings buildPartial() {
      com.google.events.cloud.dataflow.v1beta3.AutoscalingSettings result =
          new com.google.events.cloud.dataflow.v1beta3.AutoscalingSettings(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.events.cloud.dataflow.v1beta3.AutoscalingSettings result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.algorithm_ = algorithm_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.maxNumWorkers_ = maxNumWorkers_;
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
      if (other instanceof com.google.events.cloud.dataflow.v1beta3.AutoscalingSettings) {
        return mergeFrom((com.google.events.cloud.dataflow.v1beta3.AutoscalingSettings) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.events.cloud.dataflow.v1beta3.AutoscalingSettings other) {
      if (other
          == com.google.events.cloud.dataflow.v1beta3.AutoscalingSettings.getDefaultInstance())
        return this;
      if (other.algorithm_ != 0) {
        setAlgorithmValue(other.getAlgorithmValue());
      }
      if (other.getMaxNumWorkers() != 0) {
        setMaxNumWorkers(other.getMaxNumWorkers());
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
                algorithm_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                maxNumWorkers_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private int algorithm_ = 0;
    /**
     *
     *
     * <pre>
     * The algorithm to use for autoscaling.
     * </pre>
     *
     * <code>.google.events.cloud.dataflow.v1beta3.AutoscalingAlgorithm algorithm = 1;</code>
     *
     * @return The enum numeric value on the wire for algorithm.
     */
    @java.lang.Override
    public int getAlgorithmValue() {
      return algorithm_;
    }
    /**
     *
     *
     * <pre>
     * The algorithm to use for autoscaling.
     * </pre>
     *
     * <code>.google.events.cloud.dataflow.v1beta3.AutoscalingAlgorithm algorithm = 1;</code>
     *
     * @param value The enum numeric value on the wire for algorithm to set.
     * @return This builder for chaining.
     */
    public Builder setAlgorithmValue(int value) {
      algorithm_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The algorithm to use for autoscaling.
     * </pre>
     *
     * <code>.google.events.cloud.dataflow.v1beta3.AutoscalingAlgorithm algorithm = 1;</code>
     *
     * @return The algorithm.
     */
    @java.lang.Override
    public com.google.events.cloud.dataflow.v1beta3.AutoscalingAlgorithm getAlgorithm() {
      com.google.events.cloud.dataflow.v1beta3.AutoscalingAlgorithm result =
          com.google.events.cloud.dataflow.v1beta3.AutoscalingAlgorithm.forNumber(algorithm_);
      return result == null
          ? com.google.events.cloud.dataflow.v1beta3.AutoscalingAlgorithm.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The algorithm to use for autoscaling.
     * </pre>
     *
     * <code>.google.events.cloud.dataflow.v1beta3.AutoscalingAlgorithm algorithm = 1;</code>
     *
     * @param value The algorithm to set.
     * @return This builder for chaining.
     */
    public Builder setAlgorithm(
        com.google.events.cloud.dataflow.v1beta3.AutoscalingAlgorithm value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      algorithm_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The algorithm to use for autoscaling.
     * </pre>
     *
     * <code>.google.events.cloud.dataflow.v1beta3.AutoscalingAlgorithm algorithm = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAlgorithm() {
      bitField0_ = (bitField0_ & ~0x00000001);
      algorithm_ = 0;
      onChanged();
      return this;
    }

    private int maxNumWorkers_;
    /**
     *
     *
     * <pre>
     * The maximum number of workers to cap scaling at.
     * </pre>
     *
     * <code>int32 max_num_workers = 2;</code>
     *
     * @return The maxNumWorkers.
     */
    @java.lang.Override
    public int getMaxNumWorkers() {
      return maxNumWorkers_;
    }
    /**
     *
     *
     * <pre>
     * The maximum number of workers to cap scaling at.
     * </pre>
     *
     * <code>int32 max_num_workers = 2;</code>
     *
     * @param value The maxNumWorkers to set.
     * @return This builder for chaining.
     */
    public Builder setMaxNumWorkers(int value) {

      maxNumWorkers_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The maximum number of workers to cap scaling at.
     * </pre>
     *
     * <code>int32 max_num_workers = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMaxNumWorkers() {
      bitField0_ = (bitField0_ & ~0x00000002);
      maxNumWorkers_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.events.cloud.dataflow.v1beta3.AutoscalingSettings)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.dataflow.v1beta3.AutoscalingSettings)
  private static final com.google.events.cloud.dataflow.v1beta3.AutoscalingSettings
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.events.cloud.dataflow.v1beta3.AutoscalingSettings();
  }

  public static com.google.events.cloud.dataflow.v1beta3.AutoscalingSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AutoscalingSettings> PARSER =
      new com.google.protobuf.AbstractParser<AutoscalingSettings>() {
        @java.lang.Override
        public AutoscalingSettings parsePartialFrom(
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

  public static com.google.protobuf.Parser<AutoscalingSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AutoscalingSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.dataflow.v1beta3.AutoscalingSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
