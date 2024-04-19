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
// source: google/events/cloud/deploy/v1/data.proto

package com.google.events.cloud.deploy.v1;

/**
 *
 *
 * <pre>
 * Configuration of the repair action.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.deploy.v1.RepairMode}
 */
public final class RepairMode extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.deploy.v1.RepairMode)
    RepairModeOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use RepairMode.newBuilder() to construct.
  private RepairMode(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RepairMode() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RepairMode();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.events.cloud.deploy.v1.Data
        .internal_static_google_events_cloud_deploy_v1_RepairMode_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.deploy.v1.Data
        .internal_static_google_events_cloud_deploy_v1_RepairMode_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.deploy.v1.RepairMode.class,
            com.google.events.cloud.deploy.v1.RepairMode.Builder.class);
  }

  private int modeCase_ = 0;
  private java.lang.Object mode_;

  public enum ModeCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    RETRY(1),
    ROLLBACK(2),
    MODE_NOT_SET(0);
    private final int value;

    private ModeCase(int value) {
      this.value = value;
    }

    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ModeCase valueOf(int value) {
      return forNumber(value);
    }

    public static ModeCase forNumber(int value) {
      switch (value) {
        case 1:
          return RETRY;
        case 2:
          return ROLLBACK;
        case 0:
          return MODE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public ModeCase getModeCase() {
    return ModeCase.forNumber(modeCase_);
  }

  public static final int RETRY_FIELD_NUMBER = 1;

  /**
   *
   *
   * <pre>
   * Optional. Retries a failed job.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.Retry retry = 1;</code>
   *
   * @return Whether the retry field is set.
   */
  @java.lang.Override
  public boolean hasRetry() {
    return modeCase_ == 1;
  }

  /**
   *
   *
   * <pre>
   * Optional. Retries a failed job.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.Retry retry = 1;</code>
   *
   * @return The retry.
   */
  @java.lang.Override
  public com.google.events.cloud.deploy.v1.Retry getRetry() {
    if (modeCase_ == 1) {
      return (com.google.events.cloud.deploy.v1.Retry) mode_;
    }
    return com.google.events.cloud.deploy.v1.Retry.getDefaultInstance();
  }

  /**
   *
   *
   * <pre>
   * Optional. Retries a failed job.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.Retry retry = 1;</code>
   */
  @java.lang.Override
  public com.google.events.cloud.deploy.v1.RetryOrBuilder getRetryOrBuilder() {
    if (modeCase_ == 1) {
      return (com.google.events.cloud.deploy.v1.Retry) mode_;
    }
    return com.google.events.cloud.deploy.v1.Retry.getDefaultInstance();
  }

  public static final int ROLLBACK_FIELD_NUMBER = 2;

  /**
   *
   *
   * <pre>
   * Optional. Rolls back a `Rollout`.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.Rollback rollback = 2;</code>
   *
   * @return Whether the rollback field is set.
   */
  @java.lang.Override
  public boolean hasRollback() {
    return modeCase_ == 2;
  }

  /**
   *
   *
   * <pre>
   * Optional. Rolls back a `Rollout`.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.Rollback rollback = 2;</code>
   *
   * @return The rollback.
   */
  @java.lang.Override
  public com.google.events.cloud.deploy.v1.Rollback getRollback() {
    if (modeCase_ == 2) {
      return (com.google.events.cloud.deploy.v1.Rollback) mode_;
    }
    return com.google.events.cloud.deploy.v1.Rollback.getDefaultInstance();
  }

  /**
   *
   *
   * <pre>
   * Optional. Rolls back a `Rollout`.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.Rollback rollback = 2;</code>
   */
  @java.lang.Override
  public com.google.events.cloud.deploy.v1.RollbackOrBuilder getRollbackOrBuilder() {
    if (modeCase_ == 2) {
      return (com.google.events.cloud.deploy.v1.Rollback) mode_;
    }
    return com.google.events.cloud.deploy.v1.Rollback.getDefaultInstance();
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
    if (modeCase_ == 1) {
      output.writeMessage(1, (com.google.events.cloud.deploy.v1.Retry) mode_);
    }
    if (modeCase_ == 2) {
      output.writeMessage(2, (com.google.events.cloud.deploy.v1.Rollback) mode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (modeCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.events.cloud.deploy.v1.Retry) mode_);
    }
    if (modeCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.events.cloud.deploy.v1.Rollback) mode_);
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
    if (!(obj instanceof com.google.events.cloud.deploy.v1.RepairMode)) {
      return super.equals(obj);
    }
    com.google.events.cloud.deploy.v1.RepairMode other =
        (com.google.events.cloud.deploy.v1.RepairMode) obj;

    if (!getModeCase().equals(other.getModeCase())) return false;
    switch (modeCase_) {
      case 1:
        if (!getRetry().equals(other.getRetry())) return false;
        break;
      case 2:
        if (!getRollback().equals(other.getRollback())) return false;
        break;
      case 0:
      default:
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
    switch (modeCase_) {
      case 1:
        hash = (37 * hash) + RETRY_FIELD_NUMBER;
        hash = (53 * hash) + getRetry().hashCode();
        break;
      case 2:
        hash = (37 * hash) + ROLLBACK_FIELD_NUMBER;
        hash = (53 * hash) + getRollback().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.cloud.deploy.v1.RepairMode parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.deploy.v1.RepairMode parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.deploy.v1.RepairMode parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.deploy.v1.RepairMode parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.deploy.v1.RepairMode parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.deploy.v1.RepairMode parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.deploy.v1.RepairMode parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.deploy.v1.RepairMode parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.deploy.v1.RepairMode parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.deploy.v1.RepairMode parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.deploy.v1.RepairMode parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.deploy.v1.RepairMode parseFrom(
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

  public static Builder newBuilder(com.google.events.cloud.deploy.v1.RepairMode prototype) {
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
   * Configuration of the repair action.
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.deploy.v1.RepairMode}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.deploy.v1.RepairMode)
      com.google.events.cloud.deploy.v1.RepairModeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.events.cloud.deploy.v1.Data
          .internal_static_google_events_cloud_deploy_v1_RepairMode_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.deploy.v1.Data
          .internal_static_google_events_cloud_deploy_v1_RepairMode_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.deploy.v1.RepairMode.class,
              com.google.events.cloud.deploy.v1.RepairMode.Builder.class);
    }

    // Construct using com.google.events.cloud.deploy.v1.RepairMode.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (retryBuilder_ != null) {
        retryBuilder_.clear();
      }
      if (rollbackBuilder_ != null) {
        rollbackBuilder_.clear();
      }
      modeCase_ = 0;
      mode_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.events.cloud.deploy.v1.Data
          .internal_static_google_events_cloud_deploy_v1_RepairMode_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.deploy.v1.RepairMode getDefaultInstanceForType() {
      return com.google.events.cloud.deploy.v1.RepairMode.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.deploy.v1.RepairMode build() {
      com.google.events.cloud.deploy.v1.RepairMode result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.deploy.v1.RepairMode buildPartial() {
      com.google.events.cloud.deploy.v1.RepairMode result =
          new com.google.events.cloud.deploy.v1.RepairMode(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.events.cloud.deploy.v1.RepairMode result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.events.cloud.deploy.v1.RepairMode result) {
      result.modeCase_ = modeCase_;
      result.mode_ = this.mode_;
      if (modeCase_ == 1 && retryBuilder_ != null) {
        result.mode_ = retryBuilder_.build();
      }
      if (modeCase_ == 2 && rollbackBuilder_ != null) {
        result.mode_ = rollbackBuilder_.build();
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
      if (other instanceof com.google.events.cloud.deploy.v1.RepairMode) {
        return mergeFrom((com.google.events.cloud.deploy.v1.RepairMode) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.events.cloud.deploy.v1.RepairMode other) {
      if (other == com.google.events.cloud.deploy.v1.RepairMode.getDefaultInstance()) return this;
      switch (other.getModeCase()) {
        case RETRY:
          {
            mergeRetry(other.getRetry());
            break;
          }
        case ROLLBACK:
          {
            mergeRollback(other.getRollback());
            break;
          }
        case MODE_NOT_SET:
          {
            break;
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
                input.readMessage(getRetryFieldBuilder().getBuilder(), extensionRegistry);
                modeCase_ = 1;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getRollbackFieldBuilder().getBuilder(), extensionRegistry);
                modeCase_ = 2;
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

    private int modeCase_ = 0;
    private java.lang.Object mode_;

    public ModeCase getModeCase() {
      return ModeCase.forNumber(modeCase_);
    }

    public Builder clearMode() {
      modeCase_ = 0;
      mode_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.events.cloud.deploy.v1.Retry,
            com.google.events.cloud.deploy.v1.Retry.Builder,
            com.google.events.cloud.deploy.v1.RetryOrBuilder>
        retryBuilder_;

    /**
     *
     *
     * <pre>
     * Optional. Retries a failed job.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.Retry retry = 1;</code>
     *
     * @return Whether the retry field is set.
     */
    @java.lang.Override
    public boolean hasRetry() {
      return modeCase_ == 1;
    }

    /**
     *
     *
     * <pre>
     * Optional. Retries a failed job.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.Retry retry = 1;</code>
     *
     * @return The retry.
     */
    @java.lang.Override
    public com.google.events.cloud.deploy.v1.Retry getRetry() {
      if (retryBuilder_ == null) {
        if (modeCase_ == 1) {
          return (com.google.events.cloud.deploy.v1.Retry) mode_;
        }
        return com.google.events.cloud.deploy.v1.Retry.getDefaultInstance();
      } else {
        if (modeCase_ == 1) {
          return retryBuilder_.getMessage();
        }
        return com.google.events.cloud.deploy.v1.Retry.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Retries a failed job.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.Retry retry = 1;</code>
     */
    public Builder setRetry(com.google.events.cloud.deploy.v1.Retry value) {
      if (retryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        mode_ = value;
        onChanged();
      } else {
        retryBuilder_.setMessage(value);
      }
      modeCase_ = 1;
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Retries a failed job.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.Retry retry = 1;</code>
     */
    public Builder setRetry(com.google.events.cloud.deploy.v1.Retry.Builder builderForValue) {
      if (retryBuilder_ == null) {
        mode_ = builderForValue.build();
        onChanged();
      } else {
        retryBuilder_.setMessage(builderForValue.build());
      }
      modeCase_ = 1;
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Retries a failed job.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.Retry retry = 1;</code>
     */
    public Builder mergeRetry(com.google.events.cloud.deploy.v1.Retry value) {
      if (retryBuilder_ == null) {
        if (modeCase_ == 1
            && mode_ != com.google.events.cloud.deploy.v1.Retry.getDefaultInstance()) {
          mode_ =
              com.google.events.cloud.deploy.v1.Retry.newBuilder(
                      (com.google.events.cloud.deploy.v1.Retry) mode_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          mode_ = value;
        }
        onChanged();
      } else {
        if (modeCase_ == 1) {
          retryBuilder_.mergeFrom(value);
        } else {
          retryBuilder_.setMessage(value);
        }
      }
      modeCase_ = 1;
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Retries a failed job.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.Retry retry = 1;</code>
     */
    public Builder clearRetry() {
      if (retryBuilder_ == null) {
        if (modeCase_ == 1) {
          modeCase_ = 0;
          mode_ = null;
          onChanged();
        }
      } else {
        if (modeCase_ == 1) {
          modeCase_ = 0;
          mode_ = null;
        }
        retryBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Retries a failed job.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.Retry retry = 1;</code>
     */
    public com.google.events.cloud.deploy.v1.Retry.Builder getRetryBuilder() {
      return getRetryFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Optional. Retries a failed job.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.Retry retry = 1;</code>
     */
    @java.lang.Override
    public com.google.events.cloud.deploy.v1.RetryOrBuilder getRetryOrBuilder() {
      if ((modeCase_ == 1) && (retryBuilder_ != null)) {
        return retryBuilder_.getMessageOrBuilder();
      } else {
        if (modeCase_ == 1) {
          return (com.google.events.cloud.deploy.v1.Retry) mode_;
        }
        return com.google.events.cloud.deploy.v1.Retry.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Retries a failed job.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.Retry retry = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.events.cloud.deploy.v1.Retry,
            com.google.events.cloud.deploy.v1.Retry.Builder,
            com.google.events.cloud.deploy.v1.RetryOrBuilder>
        getRetryFieldBuilder() {
      if (retryBuilder_ == null) {
        if (!(modeCase_ == 1)) {
          mode_ = com.google.events.cloud.deploy.v1.Retry.getDefaultInstance();
        }
        retryBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.events.cloud.deploy.v1.Retry,
                com.google.events.cloud.deploy.v1.Retry.Builder,
                com.google.events.cloud.deploy.v1.RetryOrBuilder>(
                (com.google.events.cloud.deploy.v1.Retry) mode_, getParentForChildren(), isClean());
        mode_ = null;
      }
      modeCase_ = 1;
      onChanged();
      return retryBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.events.cloud.deploy.v1.Rollback,
            com.google.events.cloud.deploy.v1.Rollback.Builder,
            com.google.events.cloud.deploy.v1.RollbackOrBuilder>
        rollbackBuilder_;

    /**
     *
     *
     * <pre>
     * Optional. Rolls back a `Rollout`.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.Rollback rollback = 2;</code>
     *
     * @return Whether the rollback field is set.
     */
    @java.lang.Override
    public boolean hasRollback() {
      return modeCase_ == 2;
    }

    /**
     *
     *
     * <pre>
     * Optional. Rolls back a `Rollout`.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.Rollback rollback = 2;</code>
     *
     * @return The rollback.
     */
    @java.lang.Override
    public com.google.events.cloud.deploy.v1.Rollback getRollback() {
      if (rollbackBuilder_ == null) {
        if (modeCase_ == 2) {
          return (com.google.events.cloud.deploy.v1.Rollback) mode_;
        }
        return com.google.events.cloud.deploy.v1.Rollback.getDefaultInstance();
      } else {
        if (modeCase_ == 2) {
          return rollbackBuilder_.getMessage();
        }
        return com.google.events.cloud.deploy.v1.Rollback.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Rolls back a `Rollout`.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.Rollback rollback = 2;</code>
     */
    public Builder setRollback(com.google.events.cloud.deploy.v1.Rollback value) {
      if (rollbackBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        mode_ = value;
        onChanged();
      } else {
        rollbackBuilder_.setMessage(value);
      }
      modeCase_ = 2;
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Rolls back a `Rollout`.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.Rollback rollback = 2;</code>
     */
    public Builder setRollback(com.google.events.cloud.deploy.v1.Rollback.Builder builderForValue) {
      if (rollbackBuilder_ == null) {
        mode_ = builderForValue.build();
        onChanged();
      } else {
        rollbackBuilder_.setMessage(builderForValue.build());
      }
      modeCase_ = 2;
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Rolls back a `Rollout`.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.Rollback rollback = 2;</code>
     */
    public Builder mergeRollback(com.google.events.cloud.deploy.v1.Rollback value) {
      if (rollbackBuilder_ == null) {
        if (modeCase_ == 2
            && mode_ != com.google.events.cloud.deploy.v1.Rollback.getDefaultInstance()) {
          mode_ =
              com.google.events.cloud.deploy.v1.Rollback.newBuilder(
                      (com.google.events.cloud.deploy.v1.Rollback) mode_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          mode_ = value;
        }
        onChanged();
      } else {
        if (modeCase_ == 2) {
          rollbackBuilder_.mergeFrom(value);
        } else {
          rollbackBuilder_.setMessage(value);
        }
      }
      modeCase_ = 2;
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Rolls back a `Rollout`.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.Rollback rollback = 2;</code>
     */
    public Builder clearRollback() {
      if (rollbackBuilder_ == null) {
        if (modeCase_ == 2) {
          modeCase_ = 0;
          mode_ = null;
          onChanged();
        }
      } else {
        if (modeCase_ == 2) {
          modeCase_ = 0;
          mode_ = null;
        }
        rollbackBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Rolls back a `Rollout`.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.Rollback rollback = 2;</code>
     */
    public com.google.events.cloud.deploy.v1.Rollback.Builder getRollbackBuilder() {
      return getRollbackFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Optional. Rolls back a `Rollout`.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.Rollback rollback = 2;</code>
     */
    @java.lang.Override
    public com.google.events.cloud.deploy.v1.RollbackOrBuilder getRollbackOrBuilder() {
      if ((modeCase_ == 2) && (rollbackBuilder_ != null)) {
        return rollbackBuilder_.getMessageOrBuilder();
      } else {
        if (modeCase_ == 2) {
          return (com.google.events.cloud.deploy.v1.Rollback) mode_;
        }
        return com.google.events.cloud.deploy.v1.Rollback.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Rolls back a `Rollout`.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.Rollback rollback = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.events.cloud.deploy.v1.Rollback,
            com.google.events.cloud.deploy.v1.Rollback.Builder,
            com.google.events.cloud.deploy.v1.RollbackOrBuilder>
        getRollbackFieldBuilder() {
      if (rollbackBuilder_ == null) {
        if (!(modeCase_ == 2)) {
          mode_ = com.google.events.cloud.deploy.v1.Rollback.getDefaultInstance();
        }
        rollbackBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.events.cloud.deploy.v1.Rollback,
                com.google.events.cloud.deploy.v1.Rollback.Builder,
                com.google.events.cloud.deploy.v1.RollbackOrBuilder>(
                (com.google.events.cloud.deploy.v1.Rollback) mode_,
                getParentForChildren(),
                isClean());
        mode_ = null;
      }
      modeCase_ = 2;
      onChanged();
      return rollbackBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.events.cloud.deploy.v1.RepairMode)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.deploy.v1.RepairMode)
  private static final com.google.events.cloud.deploy.v1.RepairMode DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.events.cloud.deploy.v1.RepairMode();
  }

  public static com.google.events.cloud.deploy.v1.RepairMode getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RepairMode> PARSER =
      new com.google.protobuf.AbstractParser<RepairMode>() {
        @java.lang.Override
        public RepairMode parsePartialFrom(
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

  public static com.google.protobuf.Parser<RepairMode> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RepairMode> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.deploy.v1.RepairMode getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
