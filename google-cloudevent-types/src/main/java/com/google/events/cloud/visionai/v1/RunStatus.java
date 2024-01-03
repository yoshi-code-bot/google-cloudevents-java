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
 * Message describing the status of the Process.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.visionai.v1.RunStatus}
 */
public final class RunStatus extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.visionai.v1.RunStatus)
    RunStatusOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use RunStatus.newBuilder() to construct.
  private RunStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RunStatus() {
    state_ = 0;
    reason_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RunStatus();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.events.cloud.visionai.v1.Data
        .internal_static_google_events_cloud_visionai_v1_RunStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.visionai.v1.Data
        .internal_static_google_events_cloud_visionai_v1_RunStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.visionai.v1.RunStatus.class,
            com.google.events.cloud.visionai.v1.RunStatus.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * State represents the running status of the Process.
   * </pre>
   *
   * Protobuf enum {@code google.events.cloud.visionai.v1.RunStatus.State}
   */
  public enum State implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * State is unspecified.
     * </pre>
     *
     * <code>STATE_UNSPECIFIED = 0;</code>
     */
    STATE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * INITIALIZING means the Process is scheduled but yet ready to handle
     * real traffic.
     * </pre>
     *
     * <code>INITIALIZING = 1;</code>
     */
    INITIALIZING(1),
    /**
     *
     *
     * <pre>
     * RUNNING means the Process is up running and handling traffic.
     * </pre>
     *
     * <code>RUNNING = 2;</code>
     */
    RUNNING(2),
    /**
     *
     *
     * <pre>
     * COMPLETED means the Process has completed the processing, especially
     * for non-streaming use case.
     * </pre>
     *
     * <code>COMPLETED = 3;</code>
     */
    COMPLETED(3),
    /**
     *
     *
     * <pre>
     * FAILED means the Process failed to complete the processing.
     * </pre>
     *
     * <code>FAILED = 4;</code>
     */
    FAILED(4),
    /**
     *
     *
     * <pre>
     * PENDING means the Process is created but yet to be scheduled.
     * </pre>
     *
     * <code>PENDING = 5;</code>
     */
    PENDING(5),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * State is unspecified.
     * </pre>
     *
     * <code>STATE_UNSPECIFIED = 0;</code>
     */
    public static final int STATE_UNSPECIFIED_VALUE = 0;

    /**
     *
     *
     * <pre>
     * INITIALIZING means the Process is scheduled but yet ready to handle
     * real traffic.
     * </pre>
     *
     * <code>INITIALIZING = 1;</code>
     */
    public static final int INITIALIZING_VALUE = 1;

    /**
     *
     *
     * <pre>
     * RUNNING means the Process is up running and handling traffic.
     * </pre>
     *
     * <code>RUNNING = 2;</code>
     */
    public static final int RUNNING_VALUE = 2;

    /**
     *
     *
     * <pre>
     * COMPLETED means the Process has completed the processing, especially
     * for non-streaming use case.
     * </pre>
     *
     * <code>COMPLETED = 3;</code>
     */
    public static final int COMPLETED_VALUE = 3;

    /**
     *
     *
     * <pre>
     * FAILED means the Process failed to complete the processing.
     * </pre>
     *
     * <code>FAILED = 4;</code>
     */
    public static final int FAILED_VALUE = 4;

    /**
     *
     *
     * <pre>
     * PENDING means the Process is created but yet to be scheduled.
     * </pre>
     *
     * <code>PENDING = 5;</code>
     */
    public static final int PENDING_VALUE = 5;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static State valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static State forNumber(int value) {
      switch (value) {
        case 0:
          return STATE_UNSPECIFIED;
        case 1:
          return INITIALIZING;
        case 2:
          return RUNNING;
        case 3:
          return COMPLETED;
        case 4:
          return FAILED;
        case 5:
          return PENDING;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<State> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<State> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<State>() {
          public State findValueByNumber(int number) {
            return State.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.events.cloud.visionai.v1.RunStatus.getDescriptor().getEnumTypes().get(0);
    }

    private static final State[] VALUES = values();

    public static State valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private State(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.events.cloud.visionai.v1.RunStatus.State)
  }

  public static final int STATE_FIELD_NUMBER = 1;
  private int state_ = 0;

  /**
   *
   *
   * <pre>
   * The state of the Process.
   * </pre>
   *
   * <code>.google.events.cloud.visionai.v1.RunStatus.State state = 1;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  @java.lang.Override
  public int getStateValue() {
    return state_;
  }

  /**
   *
   *
   * <pre>
   * The state of the Process.
   * </pre>
   *
   * <code>.google.events.cloud.visionai.v1.RunStatus.State state = 1;</code>
   *
   * @return The state.
   */
  @java.lang.Override
  public com.google.events.cloud.visionai.v1.RunStatus.State getState() {
    com.google.events.cloud.visionai.v1.RunStatus.State result =
        com.google.events.cloud.visionai.v1.RunStatus.State.forNumber(state_);
    return result == null
        ? com.google.events.cloud.visionai.v1.RunStatus.State.UNRECOGNIZED
        : result;
  }

  public static final int REASON_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object reason_ = "";

  /**
   *
   *
   * <pre>
   * The reason of becoming the state.
   * </pre>
   *
   * <code>string reason = 2;</code>
   *
   * @return The reason.
   */
  @java.lang.Override
  public java.lang.String getReason() {
    java.lang.Object ref = reason_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      reason_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The reason of becoming the state.
   * </pre>
   *
   * <code>string reason = 2;</code>
   *
   * @return The bytes for reason.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getReasonBytes() {
    java.lang.Object ref = reason_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      reason_ = b;
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
    if (state_
        != com.google.events.cloud.visionai.v1.RunStatus.State.STATE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, state_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reason_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, reason_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (state_
        != com.google.events.cloud.visionai.v1.RunStatus.State.STATE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, state_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reason_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, reason_);
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
    if (!(obj instanceof com.google.events.cloud.visionai.v1.RunStatus)) {
      return super.equals(obj);
    }
    com.google.events.cloud.visionai.v1.RunStatus other =
        (com.google.events.cloud.visionai.v1.RunStatus) obj;

    if (state_ != other.state_) return false;
    if (!getReason().equals(other.getReason())) return false;
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
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    hash = (37 * hash) + REASON_FIELD_NUMBER;
    hash = (53 * hash) + getReason().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.cloud.visionai.v1.RunStatus parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.visionai.v1.RunStatus parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.visionai.v1.RunStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.visionai.v1.RunStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.visionai.v1.RunStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.visionai.v1.RunStatus parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.visionai.v1.RunStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.visionai.v1.RunStatus parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.visionai.v1.RunStatus parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.visionai.v1.RunStatus parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.visionai.v1.RunStatus parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.visionai.v1.RunStatus parseFrom(
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

  public static Builder newBuilder(com.google.events.cloud.visionai.v1.RunStatus prototype) {
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
   * Message describing the status of the Process.
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.visionai.v1.RunStatus}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.visionai.v1.RunStatus)
      com.google.events.cloud.visionai.v1.RunStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.events.cloud.visionai.v1.Data
          .internal_static_google_events_cloud_visionai_v1_RunStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.visionai.v1.Data
          .internal_static_google_events_cloud_visionai_v1_RunStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.visionai.v1.RunStatus.class,
              com.google.events.cloud.visionai.v1.RunStatus.Builder.class);
    }

    // Construct using com.google.events.cloud.visionai.v1.RunStatus.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      state_ = 0;
      reason_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.events.cloud.visionai.v1.Data
          .internal_static_google_events_cloud_visionai_v1_RunStatus_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.visionai.v1.RunStatus getDefaultInstanceForType() {
      return com.google.events.cloud.visionai.v1.RunStatus.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.visionai.v1.RunStatus build() {
      com.google.events.cloud.visionai.v1.RunStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.visionai.v1.RunStatus buildPartial() {
      com.google.events.cloud.visionai.v1.RunStatus result =
          new com.google.events.cloud.visionai.v1.RunStatus(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.events.cloud.visionai.v1.RunStatus result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.state_ = state_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.reason_ = reason_;
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
      if (other instanceof com.google.events.cloud.visionai.v1.RunStatus) {
        return mergeFrom((com.google.events.cloud.visionai.v1.RunStatus) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.events.cloud.visionai.v1.RunStatus other) {
      if (other == com.google.events.cloud.visionai.v1.RunStatus.getDefaultInstance()) return this;
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
      }
      if (!other.getReason().isEmpty()) {
        reason_ = other.reason_;
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
            case 8:
              {
                state_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                reason_ = input.readStringRequireUtf8();
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

    private int state_ = 0;

    /**
     *
     *
     * <pre>
     * The state of the Process.
     * </pre>
     *
     * <code>.google.events.cloud.visionai.v1.RunStatus.State state = 1;</code>
     *
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override
    public int getStateValue() {
      return state_;
    }

    /**
     *
     *
     * <pre>
     * The state of the Process.
     * </pre>
     *
     * <code>.google.events.cloud.visionai.v1.RunStatus.State state = 1;</code>
     *
     * @param value The enum numeric value on the wire for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateValue(int value) {
      state_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The state of the Process.
     * </pre>
     *
     * <code>.google.events.cloud.visionai.v1.RunStatus.State state = 1;</code>
     *
     * @return The state.
     */
    @java.lang.Override
    public com.google.events.cloud.visionai.v1.RunStatus.State getState() {
      com.google.events.cloud.visionai.v1.RunStatus.State result =
          com.google.events.cloud.visionai.v1.RunStatus.State.forNumber(state_);
      return result == null
          ? com.google.events.cloud.visionai.v1.RunStatus.State.UNRECOGNIZED
          : result;
    }

    /**
     *
     *
     * <pre>
     * The state of the Process.
     * </pre>
     *
     * <code>.google.events.cloud.visionai.v1.RunStatus.State state = 1;</code>
     *
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(com.google.events.cloud.visionai.v1.RunStatus.State value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      state_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The state of the Process.
     * </pre>
     *
     * <code>.google.events.cloud.visionai.v1.RunStatus.State state = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearState() {
      bitField0_ = (bitField0_ & ~0x00000001);
      state_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object reason_ = "";

    /**
     *
     *
     * <pre>
     * The reason of becoming the state.
     * </pre>
     *
     * <code>string reason = 2;</code>
     *
     * @return The reason.
     */
    public java.lang.String getReason() {
      java.lang.Object ref = reason_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        reason_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The reason of becoming the state.
     * </pre>
     *
     * <code>string reason = 2;</code>
     *
     * @return The bytes for reason.
     */
    public com.google.protobuf.ByteString getReasonBytes() {
      java.lang.Object ref = reason_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        reason_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The reason of becoming the state.
     * </pre>
     *
     * <code>string reason = 2;</code>
     *
     * @param value The reason to set.
     * @return This builder for chaining.
     */
    public Builder setReason(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      reason_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The reason of becoming the state.
     * </pre>
     *
     * <code>string reason = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearReason() {
      reason_ = getDefaultInstance().getReason();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The reason of becoming the state.
     * </pre>
     *
     * <code>string reason = 2;</code>
     *
     * @param value The bytes for reason to set.
     * @return This builder for chaining.
     */
    public Builder setReasonBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      reason_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.events.cloud.visionai.v1.RunStatus)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.visionai.v1.RunStatus)
  private static final com.google.events.cloud.visionai.v1.RunStatus DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.events.cloud.visionai.v1.RunStatus();
  }

  public static com.google.events.cloud.visionai.v1.RunStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RunStatus> PARSER =
      new com.google.protobuf.AbstractParser<RunStatus>() {
        @java.lang.Override
        public RunStatus parsePartialFrom(
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

  public static com.google.protobuf.Parser<RunStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RunStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.visionai.v1.RunStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
