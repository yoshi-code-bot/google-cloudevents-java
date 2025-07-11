/*
 * Copyright 2025 Google LLC
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
// source: google/events/cloud/datastream/v1/data.proto

package com.google.events.cloud.datastream.v1;

/**
 *
 *
 * <pre>
 * Oracle schema.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.datastream.v1.OracleSchema}
 */
public final class OracleSchema extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.datastream.v1.OracleSchema)
    OracleSchemaOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use OracleSchema.newBuilder() to construct.
  private OracleSchema(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private OracleSchema() {
    schema_ = "";
    oracleTables_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new OracleSchema();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.events.cloud.datastream.v1.Data
        .internal_static_google_events_cloud_datastream_v1_OracleSchema_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.datastream.v1.Data
        .internal_static_google_events_cloud_datastream_v1_OracleSchema_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.datastream.v1.OracleSchema.class,
            com.google.events.cloud.datastream.v1.OracleSchema.Builder.class);
  }

  public static final int SCHEMA_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object schema_ = "";

  /**
   *
   *
   * <pre>
   * Schema name.
   * </pre>
   *
   * <code>string schema = 1;</code>
   *
   * @return The schema.
   */
  @java.lang.Override
  public java.lang.String getSchema() {
    java.lang.Object ref = schema_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      schema_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Schema name.
   * </pre>
   *
   * <code>string schema = 1;</code>
   *
   * @return The bytes for schema.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSchemaBytes() {
    java.lang.Object ref = schema_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      schema_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ORACLE_TABLES_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private java.util.List<com.google.events.cloud.datastream.v1.OracleTable> oracleTables_;

  /**
   *
   *
   * <pre>
   * Tables in the schema.
   * </pre>
   *
   * <code>repeated .google.events.cloud.datastream.v1.OracleTable oracle_tables = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.events.cloud.datastream.v1.OracleTable> getOracleTablesList() {
    return oracleTables_;
  }

  /**
   *
   *
   * <pre>
   * Tables in the schema.
   * </pre>
   *
   * <code>repeated .google.events.cloud.datastream.v1.OracleTable oracle_tables = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.events.cloud.datastream.v1.OracleTableOrBuilder>
      getOracleTablesOrBuilderList() {
    return oracleTables_;
  }

  /**
   *
   *
   * <pre>
   * Tables in the schema.
   * </pre>
   *
   * <code>repeated .google.events.cloud.datastream.v1.OracleTable oracle_tables = 2;</code>
   */
  @java.lang.Override
  public int getOracleTablesCount() {
    return oracleTables_.size();
  }

  /**
   *
   *
   * <pre>
   * Tables in the schema.
   * </pre>
   *
   * <code>repeated .google.events.cloud.datastream.v1.OracleTable oracle_tables = 2;</code>
   */
  @java.lang.Override
  public com.google.events.cloud.datastream.v1.OracleTable getOracleTables(int index) {
    return oracleTables_.get(index);
  }

  /**
   *
   *
   * <pre>
   * Tables in the schema.
   * </pre>
   *
   * <code>repeated .google.events.cloud.datastream.v1.OracleTable oracle_tables = 2;</code>
   */
  @java.lang.Override
  public com.google.events.cloud.datastream.v1.OracleTableOrBuilder getOracleTablesOrBuilder(
      int index) {
    return oracleTables_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(schema_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, schema_);
    }
    for (int i = 0; i < oracleTables_.size(); i++) {
      output.writeMessage(2, oracleTables_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(schema_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, schema_);
    }
    for (int i = 0; i < oracleTables_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, oracleTables_.get(i));
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
    if (!(obj instanceof com.google.events.cloud.datastream.v1.OracleSchema)) {
      return super.equals(obj);
    }
    com.google.events.cloud.datastream.v1.OracleSchema other =
        (com.google.events.cloud.datastream.v1.OracleSchema) obj;

    if (!getSchema().equals(other.getSchema())) return false;
    if (!getOracleTablesList().equals(other.getOracleTablesList())) return false;
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
    hash = (37 * hash) + SCHEMA_FIELD_NUMBER;
    hash = (53 * hash) + getSchema().hashCode();
    if (getOracleTablesCount() > 0) {
      hash = (37 * hash) + ORACLE_TABLES_FIELD_NUMBER;
      hash = (53 * hash) + getOracleTablesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.cloud.datastream.v1.OracleSchema parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.datastream.v1.OracleSchema parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.datastream.v1.OracleSchema parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.datastream.v1.OracleSchema parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.datastream.v1.OracleSchema parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.datastream.v1.OracleSchema parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.datastream.v1.OracleSchema parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.datastream.v1.OracleSchema parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.datastream.v1.OracleSchema parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.datastream.v1.OracleSchema parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.datastream.v1.OracleSchema parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.datastream.v1.OracleSchema parseFrom(
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

  public static Builder newBuilder(com.google.events.cloud.datastream.v1.OracleSchema prototype) {
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
   * Oracle schema.
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.datastream.v1.OracleSchema}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.datastream.v1.OracleSchema)
      com.google.events.cloud.datastream.v1.OracleSchemaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.events.cloud.datastream.v1.Data
          .internal_static_google_events_cloud_datastream_v1_OracleSchema_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.datastream.v1.Data
          .internal_static_google_events_cloud_datastream_v1_OracleSchema_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.datastream.v1.OracleSchema.class,
              com.google.events.cloud.datastream.v1.OracleSchema.Builder.class);
    }

    // Construct using com.google.events.cloud.datastream.v1.OracleSchema.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      schema_ = "";
      if (oracleTablesBuilder_ == null) {
        oracleTables_ = java.util.Collections.emptyList();
      } else {
        oracleTables_ = null;
        oracleTablesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.events.cloud.datastream.v1.Data
          .internal_static_google_events_cloud_datastream_v1_OracleSchema_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.datastream.v1.OracleSchema getDefaultInstanceForType() {
      return com.google.events.cloud.datastream.v1.OracleSchema.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.datastream.v1.OracleSchema build() {
      com.google.events.cloud.datastream.v1.OracleSchema result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.datastream.v1.OracleSchema buildPartial() {
      com.google.events.cloud.datastream.v1.OracleSchema result =
          new com.google.events.cloud.datastream.v1.OracleSchema(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.events.cloud.datastream.v1.OracleSchema result) {
      if (oracleTablesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          oracleTables_ = java.util.Collections.unmodifiableList(oracleTables_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.oracleTables_ = oracleTables_;
      } else {
        result.oracleTables_ = oracleTablesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.events.cloud.datastream.v1.OracleSchema result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.schema_ = schema_;
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
      if (other instanceof com.google.events.cloud.datastream.v1.OracleSchema) {
        return mergeFrom((com.google.events.cloud.datastream.v1.OracleSchema) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.events.cloud.datastream.v1.OracleSchema other) {
      if (other == com.google.events.cloud.datastream.v1.OracleSchema.getDefaultInstance())
        return this;
      if (!other.getSchema().isEmpty()) {
        schema_ = other.schema_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (oracleTablesBuilder_ == null) {
        if (!other.oracleTables_.isEmpty()) {
          if (oracleTables_.isEmpty()) {
            oracleTables_ = other.oracleTables_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureOracleTablesIsMutable();
            oracleTables_.addAll(other.oracleTables_);
          }
          onChanged();
        }
      } else {
        if (!other.oracleTables_.isEmpty()) {
          if (oracleTablesBuilder_.isEmpty()) {
            oracleTablesBuilder_.dispose();
            oracleTablesBuilder_ = null;
            oracleTables_ = other.oracleTables_;
            bitField0_ = (bitField0_ & ~0x00000002);
            oracleTablesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getOracleTablesFieldBuilder()
                    : null;
          } else {
            oracleTablesBuilder_.addAllMessages(other.oracleTables_);
          }
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
                schema_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                com.google.events.cloud.datastream.v1.OracleTable m =
                    input.readMessage(
                        com.google.events.cloud.datastream.v1.OracleTable.parser(),
                        extensionRegistry);
                if (oracleTablesBuilder_ == null) {
                  ensureOracleTablesIsMutable();
                  oracleTables_.add(m);
                } else {
                  oracleTablesBuilder_.addMessage(m);
                }
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

    private java.lang.Object schema_ = "";

    /**
     *
     *
     * <pre>
     * Schema name.
     * </pre>
     *
     * <code>string schema = 1;</code>
     *
     * @return The schema.
     */
    public java.lang.String getSchema() {
      java.lang.Object ref = schema_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        schema_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Schema name.
     * </pre>
     *
     * <code>string schema = 1;</code>
     *
     * @return The bytes for schema.
     */
    public com.google.protobuf.ByteString getSchemaBytes() {
      java.lang.Object ref = schema_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        schema_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Schema name.
     * </pre>
     *
     * <code>string schema = 1;</code>
     *
     * @param value The schema to set.
     * @return This builder for chaining.
     */
    public Builder setSchema(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      schema_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Schema name.
     * </pre>
     *
     * <code>string schema = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSchema() {
      schema_ = getDefaultInstance().getSchema();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Schema name.
     * </pre>
     *
     * <code>string schema = 1;</code>
     *
     * @param value The bytes for schema to set.
     * @return This builder for chaining.
     */
    public Builder setSchemaBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      schema_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<com.google.events.cloud.datastream.v1.OracleTable> oracleTables_ =
        java.util.Collections.emptyList();

    private void ensureOracleTablesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        oracleTables_ =
            new java.util.ArrayList<com.google.events.cloud.datastream.v1.OracleTable>(
                oracleTables_);
        bitField0_ |= 0x00000002;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.events.cloud.datastream.v1.OracleTable,
            com.google.events.cloud.datastream.v1.OracleTable.Builder,
            com.google.events.cloud.datastream.v1.OracleTableOrBuilder>
        oracleTablesBuilder_;

    /**
     *
     *
     * <pre>
     * Tables in the schema.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.OracleTable oracle_tables = 2;</code>
     */
    public java.util.List<com.google.events.cloud.datastream.v1.OracleTable> getOracleTablesList() {
      if (oracleTablesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(oracleTables_);
      } else {
        return oracleTablesBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * Tables in the schema.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.OracleTable oracle_tables = 2;</code>
     */
    public int getOracleTablesCount() {
      if (oracleTablesBuilder_ == null) {
        return oracleTables_.size();
      } else {
        return oracleTablesBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * Tables in the schema.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.OracleTable oracle_tables = 2;</code>
     */
    public com.google.events.cloud.datastream.v1.OracleTable getOracleTables(int index) {
      if (oracleTablesBuilder_ == null) {
        return oracleTables_.get(index);
      } else {
        return oracleTablesBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * Tables in the schema.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.OracleTable oracle_tables = 2;</code>
     */
    public Builder setOracleTables(
        int index, com.google.events.cloud.datastream.v1.OracleTable value) {
      if (oracleTablesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOracleTablesIsMutable();
        oracleTables_.set(index, value);
        onChanged();
      } else {
        oracleTablesBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Tables in the schema.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.OracleTable oracle_tables = 2;</code>
     */
    public Builder setOracleTables(
        int index, com.google.events.cloud.datastream.v1.OracleTable.Builder builderForValue) {
      if (oracleTablesBuilder_ == null) {
        ensureOracleTablesIsMutable();
        oracleTables_.set(index, builderForValue.build());
        onChanged();
      } else {
        oracleTablesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Tables in the schema.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.OracleTable oracle_tables = 2;</code>
     */
    public Builder addOracleTables(com.google.events.cloud.datastream.v1.OracleTable value) {
      if (oracleTablesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOracleTablesIsMutable();
        oracleTables_.add(value);
        onChanged();
      } else {
        oracleTablesBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Tables in the schema.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.OracleTable oracle_tables = 2;</code>
     */
    public Builder addOracleTables(
        int index, com.google.events.cloud.datastream.v1.OracleTable value) {
      if (oracleTablesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOracleTablesIsMutable();
        oracleTables_.add(index, value);
        onChanged();
      } else {
        oracleTablesBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Tables in the schema.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.OracleTable oracle_tables = 2;</code>
     */
    public Builder addOracleTables(
        com.google.events.cloud.datastream.v1.OracleTable.Builder builderForValue) {
      if (oracleTablesBuilder_ == null) {
        ensureOracleTablesIsMutable();
        oracleTables_.add(builderForValue.build());
        onChanged();
      } else {
        oracleTablesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Tables in the schema.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.OracleTable oracle_tables = 2;</code>
     */
    public Builder addOracleTables(
        int index, com.google.events.cloud.datastream.v1.OracleTable.Builder builderForValue) {
      if (oracleTablesBuilder_ == null) {
        ensureOracleTablesIsMutable();
        oracleTables_.add(index, builderForValue.build());
        onChanged();
      } else {
        oracleTablesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Tables in the schema.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.OracleTable oracle_tables = 2;</code>
     */
    public Builder addAllOracleTables(
        java.lang.Iterable<? extends com.google.events.cloud.datastream.v1.OracleTable> values) {
      if (oracleTablesBuilder_ == null) {
        ensureOracleTablesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, oracleTables_);
        onChanged();
      } else {
        oracleTablesBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Tables in the schema.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.OracleTable oracle_tables = 2;</code>
     */
    public Builder clearOracleTables() {
      if (oracleTablesBuilder_ == null) {
        oracleTables_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        oracleTablesBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Tables in the schema.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.OracleTable oracle_tables = 2;</code>
     */
    public Builder removeOracleTables(int index) {
      if (oracleTablesBuilder_ == null) {
        ensureOracleTablesIsMutable();
        oracleTables_.remove(index);
        onChanged();
      } else {
        oracleTablesBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Tables in the schema.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.OracleTable oracle_tables = 2;</code>
     */
    public com.google.events.cloud.datastream.v1.OracleTable.Builder getOracleTablesBuilder(
        int index) {
      return getOracleTablesFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * Tables in the schema.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.OracleTable oracle_tables = 2;</code>
     */
    public com.google.events.cloud.datastream.v1.OracleTableOrBuilder getOracleTablesOrBuilder(
        int index) {
      if (oracleTablesBuilder_ == null) {
        return oracleTables_.get(index);
      } else {
        return oracleTablesBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * Tables in the schema.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.OracleTable oracle_tables = 2;</code>
     */
    public java.util.List<? extends com.google.events.cloud.datastream.v1.OracleTableOrBuilder>
        getOracleTablesOrBuilderList() {
      if (oracleTablesBuilder_ != null) {
        return oracleTablesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(oracleTables_);
      }
    }

    /**
     *
     *
     * <pre>
     * Tables in the schema.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.OracleTable oracle_tables = 2;</code>
     */
    public com.google.events.cloud.datastream.v1.OracleTable.Builder addOracleTablesBuilder() {
      return getOracleTablesFieldBuilder()
          .addBuilder(com.google.events.cloud.datastream.v1.OracleTable.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * Tables in the schema.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.OracleTable oracle_tables = 2;</code>
     */
    public com.google.events.cloud.datastream.v1.OracleTable.Builder addOracleTablesBuilder(
        int index) {
      return getOracleTablesFieldBuilder()
          .addBuilder(
              index, com.google.events.cloud.datastream.v1.OracleTable.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * Tables in the schema.
     * </pre>
     *
     * <code>repeated .google.events.cloud.datastream.v1.OracleTable oracle_tables = 2;</code>
     */
    public java.util.List<com.google.events.cloud.datastream.v1.OracleTable.Builder>
        getOracleTablesBuilderList() {
      return getOracleTablesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.events.cloud.datastream.v1.OracleTable,
            com.google.events.cloud.datastream.v1.OracleTable.Builder,
            com.google.events.cloud.datastream.v1.OracleTableOrBuilder>
        getOracleTablesFieldBuilder() {
      if (oracleTablesBuilder_ == null) {
        oracleTablesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.events.cloud.datastream.v1.OracleTable,
                com.google.events.cloud.datastream.v1.OracleTable.Builder,
                com.google.events.cloud.datastream.v1.OracleTableOrBuilder>(
                oracleTables_, ((bitField0_ & 0x00000002) != 0), getParentForChildren(), isClean());
        oracleTables_ = null;
      }
      return oracleTablesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.events.cloud.datastream.v1.OracleSchema)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.datastream.v1.OracleSchema)
  private static final com.google.events.cloud.datastream.v1.OracleSchema DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.events.cloud.datastream.v1.OracleSchema();
  }

  public static com.google.events.cloud.datastream.v1.OracleSchema getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OracleSchema> PARSER =
      new com.google.protobuf.AbstractParser<OracleSchema>() {
        @java.lang.Override
        public OracleSchema parsePartialFrom(
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

  public static com.google.protobuf.Parser<OracleSchema> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OracleSchema> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.datastream.v1.OracleSchema getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
