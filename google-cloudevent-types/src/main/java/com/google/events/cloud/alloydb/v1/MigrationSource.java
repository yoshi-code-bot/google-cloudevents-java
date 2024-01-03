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
// source: google/events/cloud/alloydb/v1/data.proto

package com.google.events.cloud.alloydb.v1;

/**
 *
 *
 * <pre>
 * Subset of the source instance configuration that is available when reading
 * the cluster resource.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.alloydb.v1.MigrationSource}
 */
public final class MigrationSource extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.alloydb.v1.MigrationSource)
    MigrationSourceOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use MigrationSource.newBuilder() to construct.
  private MigrationSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MigrationSource() {
    hostPort_ = "";
    referenceId_ = "";
    sourceType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MigrationSource();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.events.cloud.alloydb.v1.Data
        .internal_static_google_events_cloud_alloydb_v1_MigrationSource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.alloydb.v1.Data
        .internal_static_google_events_cloud_alloydb_v1_MigrationSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.alloydb.v1.MigrationSource.class,
            com.google.events.cloud.alloydb.v1.MigrationSource.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Denote the type of migration source that created this cluster.
   * </pre>
   *
   * Protobuf enum {@code google.events.cloud.alloydb.v1.MigrationSource.MigrationSourceType}
   */
  public enum MigrationSourceType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Migration source is unknown.
     * </pre>
     *
     * <code>MIGRATION_SOURCE_TYPE_UNSPECIFIED = 0;</code>
     */
    MIGRATION_SOURCE_TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * DMS source means the cluster was created via DMS migration job.
     * </pre>
     *
     * <code>DMS = 1;</code>
     */
    DMS(1),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Migration source is unknown.
     * </pre>
     *
     * <code>MIGRATION_SOURCE_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int MIGRATION_SOURCE_TYPE_UNSPECIFIED_VALUE = 0;

    /**
     *
     *
     * <pre>
     * DMS source means the cluster was created via DMS migration job.
     * </pre>
     *
     * <code>DMS = 1;</code>
     */
    public static final int DMS_VALUE = 1;

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
    public static MigrationSourceType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MigrationSourceType forNumber(int value) {
      switch (value) {
        case 0:
          return MIGRATION_SOURCE_TYPE_UNSPECIFIED;
        case 1:
          return DMS;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MigrationSourceType>
        internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<MigrationSourceType>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<MigrationSourceType>() {
              public MigrationSourceType findValueByNumber(int number) {
                return MigrationSourceType.forNumber(number);
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
      return com.google.events.cloud.alloydb.v1.MigrationSource.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final MigrationSourceType[] VALUES = values();

    public static MigrationSourceType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private MigrationSourceType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.events.cloud.alloydb.v1.MigrationSource.MigrationSourceType)
  }

  public static final int HOST_PORT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object hostPort_ = "";

  /**
   *
   *
   * <pre>
   * Output only. The host and port of the on-premises instance in host:port
   * format
   * </pre>
   *
   * <code>string host_port = 1;</code>
   *
   * @return The hostPort.
   */
  @java.lang.Override
  public java.lang.String getHostPort() {
    java.lang.Object ref = hostPort_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hostPort_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Output only. The host and port of the on-premises instance in host:port
   * format
   * </pre>
   *
   * <code>string host_port = 1;</code>
   *
   * @return The bytes for hostPort.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getHostPortBytes() {
    java.lang.Object ref = hostPort_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      hostPort_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REFERENCE_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object referenceId_ = "";

  /**
   *
   *
   * <pre>
   * Output only. Place holder for the external source identifier(e.g DMS job
   * name) that created the cluster.
   * </pre>
   *
   * <code>string reference_id = 2;</code>
   *
   * @return The referenceId.
   */
  @java.lang.Override
  public java.lang.String getReferenceId() {
    java.lang.Object ref = referenceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      referenceId_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Output only. Place holder for the external source identifier(e.g DMS job
   * name) that created the cluster.
   * </pre>
   *
   * <code>string reference_id = 2;</code>
   *
   * @return The bytes for referenceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getReferenceIdBytes() {
    java.lang.Object ref = referenceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      referenceId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SOURCE_TYPE_FIELD_NUMBER = 3;
  private int sourceType_ = 0;

  /**
   *
   *
   * <pre>
   * Output only. Type of migration source.
   * </pre>
   *
   * <code>.google.events.cloud.alloydb.v1.MigrationSource.MigrationSourceType source_type = 3;
   * </code>
   *
   * @return The enum numeric value on the wire for sourceType.
   */
  @java.lang.Override
  public int getSourceTypeValue() {
    return sourceType_;
  }

  /**
   *
   *
   * <pre>
   * Output only. Type of migration source.
   * </pre>
   *
   * <code>.google.events.cloud.alloydb.v1.MigrationSource.MigrationSourceType source_type = 3;
   * </code>
   *
   * @return The sourceType.
   */
  @java.lang.Override
  public com.google.events.cloud.alloydb.v1.MigrationSource.MigrationSourceType getSourceType() {
    com.google.events.cloud.alloydb.v1.MigrationSource.MigrationSourceType result =
        com.google.events.cloud.alloydb.v1.MigrationSource.MigrationSourceType.forNumber(
            sourceType_);
    return result == null
        ? com.google.events.cloud.alloydb.v1.MigrationSource.MigrationSourceType.UNRECOGNIZED
        : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hostPort_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, hostPort_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(referenceId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, referenceId_);
    }
    if (sourceType_
        != com.google.events.cloud.alloydb.v1.MigrationSource.MigrationSourceType
            .MIGRATION_SOURCE_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(3, sourceType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hostPort_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, hostPort_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(referenceId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, referenceId_);
    }
    if (sourceType_
        != com.google.events.cloud.alloydb.v1.MigrationSource.MigrationSourceType
            .MIGRATION_SOURCE_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, sourceType_);
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
    if (!(obj instanceof com.google.events.cloud.alloydb.v1.MigrationSource)) {
      return super.equals(obj);
    }
    com.google.events.cloud.alloydb.v1.MigrationSource other =
        (com.google.events.cloud.alloydb.v1.MigrationSource) obj;

    if (!getHostPort().equals(other.getHostPort())) return false;
    if (!getReferenceId().equals(other.getReferenceId())) return false;
    if (sourceType_ != other.sourceType_) return false;
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
    hash = (37 * hash) + HOST_PORT_FIELD_NUMBER;
    hash = (53 * hash) + getHostPort().hashCode();
    hash = (37 * hash) + REFERENCE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getReferenceId().hashCode();
    hash = (37 * hash) + SOURCE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + sourceType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.cloud.alloydb.v1.MigrationSource parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.alloydb.v1.MigrationSource parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.alloydb.v1.MigrationSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.alloydb.v1.MigrationSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.alloydb.v1.MigrationSource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.alloydb.v1.MigrationSource parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.alloydb.v1.MigrationSource parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.alloydb.v1.MigrationSource parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.alloydb.v1.MigrationSource parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.alloydb.v1.MigrationSource parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.alloydb.v1.MigrationSource parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.alloydb.v1.MigrationSource parseFrom(
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

  public static Builder newBuilder(com.google.events.cloud.alloydb.v1.MigrationSource prototype) {
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
   * Subset of the source instance configuration that is available when reading
   * the cluster resource.
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.alloydb.v1.MigrationSource}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.alloydb.v1.MigrationSource)
      com.google.events.cloud.alloydb.v1.MigrationSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.events.cloud.alloydb.v1.Data
          .internal_static_google_events_cloud_alloydb_v1_MigrationSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.alloydb.v1.Data
          .internal_static_google_events_cloud_alloydb_v1_MigrationSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.alloydb.v1.MigrationSource.class,
              com.google.events.cloud.alloydb.v1.MigrationSource.Builder.class);
    }

    // Construct using com.google.events.cloud.alloydb.v1.MigrationSource.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      hostPort_ = "";
      referenceId_ = "";
      sourceType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.events.cloud.alloydb.v1.Data
          .internal_static_google_events_cloud_alloydb_v1_MigrationSource_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.alloydb.v1.MigrationSource getDefaultInstanceForType() {
      return com.google.events.cloud.alloydb.v1.MigrationSource.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.alloydb.v1.MigrationSource build() {
      com.google.events.cloud.alloydb.v1.MigrationSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.alloydb.v1.MigrationSource buildPartial() {
      com.google.events.cloud.alloydb.v1.MigrationSource result =
          new com.google.events.cloud.alloydb.v1.MigrationSource(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.events.cloud.alloydb.v1.MigrationSource result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.hostPort_ = hostPort_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.referenceId_ = referenceId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.sourceType_ = sourceType_;
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
      if (other instanceof com.google.events.cloud.alloydb.v1.MigrationSource) {
        return mergeFrom((com.google.events.cloud.alloydb.v1.MigrationSource) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.events.cloud.alloydb.v1.MigrationSource other) {
      if (other == com.google.events.cloud.alloydb.v1.MigrationSource.getDefaultInstance())
        return this;
      if (!other.getHostPort().isEmpty()) {
        hostPort_ = other.hostPort_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getReferenceId().isEmpty()) {
        referenceId_ = other.referenceId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.sourceType_ != 0) {
        setSourceTypeValue(other.getSourceTypeValue());
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
                hostPort_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                referenceId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                sourceType_ = input.readEnum();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

    private java.lang.Object hostPort_ = "";

    /**
     *
     *
     * <pre>
     * Output only. The host and port of the on-premises instance in host:port
     * format
     * </pre>
     *
     * <code>string host_port = 1;</code>
     *
     * @return The hostPort.
     */
    public java.lang.String getHostPort() {
      java.lang.Object ref = hostPort_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hostPort_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. The host and port of the on-premises instance in host:port
     * format
     * </pre>
     *
     * <code>string host_port = 1;</code>
     *
     * @return The bytes for hostPort.
     */
    public com.google.protobuf.ByteString getHostPortBytes() {
      java.lang.Object ref = hostPort_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        hostPort_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. The host and port of the on-premises instance in host:port
     * format
     * </pre>
     *
     * <code>string host_port = 1;</code>
     *
     * @param value The hostPort to set.
     * @return This builder for chaining.
     */
    public Builder setHostPort(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      hostPort_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. The host and port of the on-premises instance in host:port
     * format
     * </pre>
     *
     * <code>string host_port = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearHostPort() {
      hostPort_ = getDefaultInstance().getHostPort();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. The host and port of the on-premises instance in host:port
     * format
     * </pre>
     *
     * <code>string host_port = 1;</code>
     *
     * @param value The bytes for hostPort to set.
     * @return This builder for chaining.
     */
    public Builder setHostPortBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      hostPort_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object referenceId_ = "";

    /**
     *
     *
     * <pre>
     * Output only. Place holder for the external source identifier(e.g DMS job
     * name) that created the cluster.
     * </pre>
     *
     * <code>string reference_id = 2;</code>
     *
     * @return The referenceId.
     */
    public java.lang.String getReferenceId() {
      java.lang.Object ref = referenceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        referenceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. Place holder for the external source identifier(e.g DMS job
     * name) that created the cluster.
     * </pre>
     *
     * <code>string reference_id = 2;</code>
     *
     * @return The bytes for referenceId.
     */
    public com.google.protobuf.ByteString getReferenceIdBytes() {
      java.lang.Object ref = referenceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        referenceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. Place holder for the external source identifier(e.g DMS job
     * name) that created the cluster.
     * </pre>
     *
     * <code>string reference_id = 2;</code>
     *
     * @param value The referenceId to set.
     * @return This builder for chaining.
     */
    public Builder setReferenceId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      referenceId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Place holder for the external source identifier(e.g DMS job
     * name) that created the cluster.
     * </pre>
     *
     * <code>string reference_id = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearReferenceId() {
      referenceId_ = getDefaultInstance().getReferenceId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Place holder for the external source identifier(e.g DMS job
     * name) that created the cluster.
     * </pre>
     *
     * <code>string reference_id = 2;</code>
     *
     * @param value The bytes for referenceId to set.
     * @return This builder for chaining.
     */
    public Builder setReferenceIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      referenceId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int sourceType_ = 0;

    /**
     *
     *
     * <pre>
     * Output only. Type of migration source.
     * </pre>
     *
     * <code>.google.events.cloud.alloydb.v1.MigrationSource.MigrationSourceType source_type = 3;
     * </code>
     *
     * @return The enum numeric value on the wire for sourceType.
     */
    @java.lang.Override
    public int getSourceTypeValue() {
      return sourceType_;
    }

    /**
     *
     *
     * <pre>
     * Output only. Type of migration source.
     * </pre>
     *
     * <code>.google.events.cloud.alloydb.v1.MigrationSource.MigrationSourceType source_type = 3;
     * </code>
     *
     * @param value The enum numeric value on the wire for sourceType to set.
     * @return This builder for chaining.
     */
    public Builder setSourceTypeValue(int value) {
      sourceType_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Type of migration source.
     * </pre>
     *
     * <code>.google.events.cloud.alloydb.v1.MigrationSource.MigrationSourceType source_type = 3;
     * </code>
     *
     * @return The sourceType.
     */
    @java.lang.Override
    public com.google.events.cloud.alloydb.v1.MigrationSource.MigrationSourceType getSourceType() {
      com.google.events.cloud.alloydb.v1.MigrationSource.MigrationSourceType result =
          com.google.events.cloud.alloydb.v1.MigrationSource.MigrationSourceType.forNumber(
              sourceType_);
      return result == null
          ? com.google.events.cloud.alloydb.v1.MigrationSource.MigrationSourceType.UNRECOGNIZED
          : result;
    }

    /**
     *
     *
     * <pre>
     * Output only. Type of migration source.
     * </pre>
     *
     * <code>.google.events.cloud.alloydb.v1.MigrationSource.MigrationSourceType source_type = 3;
     * </code>
     *
     * @param value The sourceType to set.
     * @return This builder for chaining.
     */
    public Builder setSourceType(
        com.google.events.cloud.alloydb.v1.MigrationSource.MigrationSourceType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      sourceType_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Type of migration source.
     * </pre>
     *
     * <code>.google.events.cloud.alloydb.v1.MigrationSource.MigrationSourceType source_type = 3;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSourceType() {
      bitField0_ = (bitField0_ & ~0x00000004);
      sourceType_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.events.cloud.alloydb.v1.MigrationSource)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.alloydb.v1.MigrationSource)
  private static final com.google.events.cloud.alloydb.v1.MigrationSource DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.events.cloud.alloydb.v1.MigrationSource();
  }

  public static com.google.events.cloud.alloydb.v1.MigrationSource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MigrationSource> PARSER =
      new com.google.protobuf.AbstractParser<MigrationSource>() {
        @java.lang.Override
        public MigrationSource parsePartialFrom(
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

  public static com.google.protobuf.Parser<MigrationSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MigrationSource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.alloydb.v1.MigrationSource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
