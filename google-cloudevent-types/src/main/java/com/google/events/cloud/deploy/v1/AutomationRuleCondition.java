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
 * `AutomationRuleCondition` contains conditions relevant to an
 * `Automation` rule.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.deploy.v1.AutomationRuleCondition}
 */
public final class AutomationRuleCondition extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.deploy.v1.AutomationRuleCondition)
    AutomationRuleConditionOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use AutomationRuleCondition.newBuilder() to construct.
  private AutomationRuleCondition(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AutomationRuleCondition() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AutomationRuleCondition();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.events.cloud.deploy.v1.Data
        .internal_static_google_events_cloud_deploy_v1_AutomationRuleCondition_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.deploy.v1.Data
        .internal_static_google_events_cloud_deploy_v1_AutomationRuleCondition_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.deploy.v1.AutomationRuleCondition.class,
            com.google.events.cloud.deploy.v1.AutomationRuleCondition.Builder.class);
  }

  public static final int TARGETS_PRESENT_CONDITION_FIELD_NUMBER = 1;
  private com.google.events.cloud.deploy.v1.TargetsPresentCondition targetsPresentCondition_;

  /**
   *
   *
   * <pre>
   * Optional. Details around targets enumerated in the rule.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.TargetsPresentCondition targets_present_condition = 1;
   * </code>
   *
   * @return Whether the targetsPresentCondition field is set.
   */
  @java.lang.Override
  public boolean hasTargetsPresentCondition() {
    return targetsPresentCondition_ != null;
  }

  /**
   *
   *
   * <pre>
   * Optional. Details around targets enumerated in the rule.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.TargetsPresentCondition targets_present_condition = 1;
   * </code>
   *
   * @return The targetsPresentCondition.
   */
  @java.lang.Override
  public com.google.events.cloud.deploy.v1.TargetsPresentCondition getTargetsPresentCondition() {
    return targetsPresentCondition_ == null
        ? com.google.events.cloud.deploy.v1.TargetsPresentCondition.getDefaultInstance()
        : targetsPresentCondition_;
  }

  /**
   *
   *
   * <pre>
   * Optional. Details around targets enumerated in the rule.
   * </pre>
   *
   * <code>.google.events.cloud.deploy.v1.TargetsPresentCondition targets_present_condition = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.events.cloud.deploy.v1.TargetsPresentConditionOrBuilder
      getTargetsPresentConditionOrBuilder() {
    return targetsPresentCondition_ == null
        ? com.google.events.cloud.deploy.v1.TargetsPresentCondition.getDefaultInstance()
        : targetsPresentCondition_;
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
    if (targetsPresentCondition_ != null) {
      output.writeMessage(1, getTargetsPresentCondition());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (targetsPresentCondition_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, getTargetsPresentCondition());
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
    if (!(obj instanceof com.google.events.cloud.deploy.v1.AutomationRuleCondition)) {
      return super.equals(obj);
    }
    com.google.events.cloud.deploy.v1.AutomationRuleCondition other =
        (com.google.events.cloud.deploy.v1.AutomationRuleCondition) obj;

    if (hasTargetsPresentCondition() != other.hasTargetsPresentCondition()) return false;
    if (hasTargetsPresentCondition()) {
      if (!getTargetsPresentCondition().equals(other.getTargetsPresentCondition())) return false;
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
    if (hasTargetsPresentCondition()) {
      hash = (37 * hash) + TARGETS_PRESENT_CONDITION_FIELD_NUMBER;
      hash = (53 * hash) + getTargetsPresentCondition().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.cloud.deploy.v1.AutomationRuleCondition parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.deploy.v1.AutomationRuleCondition parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.deploy.v1.AutomationRuleCondition parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.deploy.v1.AutomationRuleCondition parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.deploy.v1.AutomationRuleCondition parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.deploy.v1.AutomationRuleCondition parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.deploy.v1.AutomationRuleCondition parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.deploy.v1.AutomationRuleCondition parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.deploy.v1.AutomationRuleCondition parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.deploy.v1.AutomationRuleCondition parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.deploy.v1.AutomationRuleCondition parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.deploy.v1.AutomationRuleCondition parseFrom(
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
      com.google.events.cloud.deploy.v1.AutomationRuleCondition prototype) {
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
   * `AutomationRuleCondition` contains conditions relevant to an
   * `Automation` rule.
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.deploy.v1.AutomationRuleCondition}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.deploy.v1.AutomationRuleCondition)
      com.google.events.cloud.deploy.v1.AutomationRuleConditionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.events.cloud.deploy.v1.Data
          .internal_static_google_events_cloud_deploy_v1_AutomationRuleCondition_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.deploy.v1.Data
          .internal_static_google_events_cloud_deploy_v1_AutomationRuleCondition_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.deploy.v1.AutomationRuleCondition.class,
              com.google.events.cloud.deploy.v1.AutomationRuleCondition.Builder.class);
    }

    // Construct using com.google.events.cloud.deploy.v1.AutomationRuleCondition.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      targetsPresentCondition_ = null;
      if (targetsPresentConditionBuilder_ != null) {
        targetsPresentConditionBuilder_.dispose();
        targetsPresentConditionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.events.cloud.deploy.v1.Data
          .internal_static_google_events_cloud_deploy_v1_AutomationRuleCondition_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.deploy.v1.AutomationRuleCondition getDefaultInstanceForType() {
      return com.google.events.cloud.deploy.v1.AutomationRuleCondition.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.deploy.v1.AutomationRuleCondition build() {
      com.google.events.cloud.deploy.v1.AutomationRuleCondition result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.deploy.v1.AutomationRuleCondition buildPartial() {
      com.google.events.cloud.deploy.v1.AutomationRuleCondition result =
          new com.google.events.cloud.deploy.v1.AutomationRuleCondition(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.events.cloud.deploy.v1.AutomationRuleCondition result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.targetsPresentCondition_ =
            targetsPresentConditionBuilder_ == null
                ? targetsPresentCondition_
                : targetsPresentConditionBuilder_.build();
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
      if (other instanceof com.google.events.cloud.deploy.v1.AutomationRuleCondition) {
        return mergeFrom((com.google.events.cloud.deploy.v1.AutomationRuleCondition) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.events.cloud.deploy.v1.AutomationRuleCondition other) {
      if (other == com.google.events.cloud.deploy.v1.AutomationRuleCondition.getDefaultInstance())
        return this;
      if (other.hasTargetsPresentCondition()) {
        mergeTargetsPresentCondition(other.getTargetsPresentCondition());
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
                input.readMessage(
                    getTargetsPresentConditionFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.events.cloud.deploy.v1.TargetsPresentCondition targetsPresentCondition_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.events.cloud.deploy.v1.TargetsPresentCondition,
            com.google.events.cloud.deploy.v1.TargetsPresentCondition.Builder,
            com.google.events.cloud.deploy.v1.TargetsPresentConditionOrBuilder>
        targetsPresentConditionBuilder_;

    /**
     *
     *
     * <pre>
     * Optional. Details around targets enumerated in the rule.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.TargetsPresentCondition targets_present_condition = 1;
     * </code>
     *
     * @return Whether the targetsPresentCondition field is set.
     */
    public boolean hasTargetsPresentCondition() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * Optional. Details around targets enumerated in the rule.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.TargetsPresentCondition targets_present_condition = 1;
     * </code>
     *
     * @return The targetsPresentCondition.
     */
    public com.google.events.cloud.deploy.v1.TargetsPresentCondition getTargetsPresentCondition() {
      if (targetsPresentConditionBuilder_ == null) {
        return targetsPresentCondition_ == null
            ? com.google.events.cloud.deploy.v1.TargetsPresentCondition.getDefaultInstance()
            : targetsPresentCondition_;
      } else {
        return targetsPresentConditionBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Details around targets enumerated in the rule.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.TargetsPresentCondition targets_present_condition = 1;
     * </code>
     */
    public Builder setTargetsPresentCondition(
        com.google.events.cloud.deploy.v1.TargetsPresentCondition value) {
      if (targetsPresentConditionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        targetsPresentCondition_ = value;
      } else {
        targetsPresentConditionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Details around targets enumerated in the rule.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.TargetsPresentCondition targets_present_condition = 1;
     * </code>
     */
    public Builder setTargetsPresentCondition(
        com.google.events.cloud.deploy.v1.TargetsPresentCondition.Builder builderForValue) {
      if (targetsPresentConditionBuilder_ == null) {
        targetsPresentCondition_ = builderForValue.build();
      } else {
        targetsPresentConditionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Details around targets enumerated in the rule.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.TargetsPresentCondition targets_present_condition = 1;
     * </code>
     */
    public Builder mergeTargetsPresentCondition(
        com.google.events.cloud.deploy.v1.TargetsPresentCondition value) {
      if (targetsPresentConditionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && targetsPresentCondition_ != null
            && targetsPresentCondition_
                != com.google.events.cloud.deploy.v1.TargetsPresentCondition.getDefaultInstance()) {
          getTargetsPresentConditionBuilder().mergeFrom(value);
        } else {
          targetsPresentCondition_ = value;
        }
      } else {
        targetsPresentConditionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Details around targets enumerated in the rule.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.TargetsPresentCondition targets_present_condition = 1;
     * </code>
     */
    public Builder clearTargetsPresentCondition() {
      bitField0_ = (bitField0_ & ~0x00000001);
      targetsPresentCondition_ = null;
      if (targetsPresentConditionBuilder_ != null) {
        targetsPresentConditionBuilder_.dispose();
        targetsPresentConditionBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Details around targets enumerated in the rule.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.TargetsPresentCondition targets_present_condition = 1;
     * </code>
     */
    public com.google.events.cloud.deploy.v1.TargetsPresentCondition.Builder
        getTargetsPresentConditionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTargetsPresentConditionFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Optional. Details around targets enumerated in the rule.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.TargetsPresentCondition targets_present_condition = 1;
     * </code>
     */
    public com.google.events.cloud.deploy.v1.TargetsPresentConditionOrBuilder
        getTargetsPresentConditionOrBuilder() {
      if (targetsPresentConditionBuilder_ != null) {
        return targetsPresentConditionBuilder_.getMessageOrBuilder();
      } else {
        return targetsPresentCondition_ == null
            ? com.google.events.cloud.deploy.v1.TargetsPresentCondition.getDefaultInstance()
            : targetsPresentCondition_;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Details around targets enumerated in the rule.
     * </pre>
     *
     * <code>.google.events.cloud.deploy.v1.TargetsPresentCondition targets_present_condition = 1;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.events.cloud.deploy.v1.TargetsPresentCondition,
            com.google.events.cloud.deploy.v1.TargetsPresentCondition.Builder,
            com.google.events.cloud.deploy.v1.TargetsPresentConditionOrBuilder>
        getTargetsPresentConditionFieldBuilder() {
      if (targetsPresentConditionBuilder_ == null) {
        targetsPresentConditionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.events.cloud.deploy.v1.TargetsPresentCondition,
                com.google.events.cloud.deploy.v1.TargetsPresentCondition.Builder,
                com.google.events.cloud.deploy.v1.TargetsPresentConditionOrBuilder>(
                getTargetsPresentCondition(), getParentForChildren(), isClean());
        targetsPresentCondition_ = null;
      }
      return targetsPresentConditionBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.events.cloud.deploy.v1.AutomationRuleCondition)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.deploy.v1.AutomationRuleCondition)
  private static final com.google.events.cloud.deploy.v1.AutomationRuleCondition DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.events.cloud.deploy.v1.AutomationRuleCondition();
  }

  public static com.google.events.cloud.deploy.v1.AutomationRuleCondition getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AutomationRuleCondition> PARSER =
      new com.google.protobuf.AbstractParser<AutomationRuleCondition>() {
        @java.lang.Override
        public AutomationRuleCondition parsePartialFrom(
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

  public static com.google.protobuf.Parser<AutomationRuleCondition> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AutomationRuleCondition> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.deploy.v1.AutomationRuleCondition getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
