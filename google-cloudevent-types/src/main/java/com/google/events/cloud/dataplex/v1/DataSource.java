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
// source: google/events/cloud/dataplex/v1/data.proto

package com.google.events.cloud.dataplex.v1;

/**
 *
 *
 * <pre>
 * The data source for DataScan.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.dataplex.v1.DataSource}
 */
public final class DataSource extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.dataplex.v1.DataSource)
    DataSourceOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use DataSource.newBuilder() to construct.
  private DataSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DataSource() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DataSource();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.events.cloud.dataplex.v1.Data
        .internal_static_google_events_cloud_dataplex_v1_DataSource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.dataplex.v1.Data
        .internal_static_google_events_cloud_dataplex_v1_DataSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.dataplex.v1.DataSource.class,
            com.google.events.cloud.dataplex.v1.DataSource.Builder.class);
  }

  private int sourceCase_ = 0;
  private java.lang.Object source_;

  public enum SourceCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    ENTITY(100),
    SOURCE_NOT_SET(0);
    private final int value;

    private SourceCase(int value) {
      this.value = value;
    }

    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SourceCase valueOf(int value) {
      return forNumber(value);
    }

    public static SourceCase forNumber(int value) {
      switch (value) {
        case 100:
          return ENTITY;
        case 0:
          return SOURCE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public SourceCase getSourceCase() {
    return SourceCase.forNumber(sourceCase_);
  }

  public static final int ENTITY_FIELD_NUMBER = 100;

  /**
   *
   *
   * <pre>
   * Immutable. The Dataplex entity that represents the data source (e.g.
   * BigQuery table) for DataScan, of the form:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}/entities/{entity_id}`.
   * </pre>
   *
   * <code>string entity = 100;</code>
   *
   * @return Whether the entity field is set.
   */
  public boolean hasEntity() {
    return sourceCase_ == 100;
  }

  /**
   *
   *
   * <pre>
   * Immutable. The Dataplex entity that represents the data source (e.g.
   * BigQuery table) for DataScan, of the form:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}/entities/{entity_id}`.
   * </pre>
   *
   * <code>string entity = 100;</code>
   *
   * @return The entity.
   */
  public java.lang.String getEntity() {
    java.lang.Object ref = "";
    if (sourceCase_ == 100) {
      ref = source_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (sourceCase_ == 100) {
        source_ = s;
      }
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Immutable. The Dataplex entity that represents the data source (e.g.
   * BigQuery table) for DataScan, of the form:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}/entities/{entity_id}`.
   * </pre>
   *
   * <code>string entity = 100;</code>
   *
   * @return The bytes for entity.
   */
  public com.google.protobuf.ByteString getEntityBytes() {
    java.lang.Object ref = "";
    if (sourceCase_ == 100) {
      ref = source_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (sourceCase_ == 100) {
        source_ = b;
      }
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
    if (sourceCase_ == 100) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 100, source_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sourceCase_ == 100) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(100, source_);
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
    if (!(obj instanceof com.google.events.cloud.dataplex.v1.DataSource)) {
      return super.equals(obj);
    }
    com.google.events.cloud.dataplex.v1.DataSource other =
        (com.google.events.cloud.dataplex.v1.DataSource) obj;

    if (!getSourceCase().equals(other.getSourceCase())) return false;
    switch (sourceCase_) {
      case 100:
        if (!getEntity().equals(other.getEntity())) return false;
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
    switch (sourceCase_) {
      case 100:
        hash = (37 * hash) + ENTITY_FIELD_NUMBER;
        hash = (53 * hash) + getEntity().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.cloud.dataplex.v1.DataSource parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.dataplex.v1.DataSource parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.dataplex.v1.DataSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.dataplex.v1.DataSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.dataplex.v1.DataSource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.dataplex.v1.DataSource parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.dataplex.v1.DataSource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.dataplex.v1.DataSource parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.dataplex.v1.DataSource parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.dataplex.v1.DataSource parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.dataplex.v1.DataSource parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.dataplex.v1.DataSource parseFrom(
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

  public static Builder newBuilder(com.google.events.cloud.dataplex.v1.DataSource prototype) {
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
   * The data source for DataScan.
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.dataplex.v1.DataSource}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.dataplex.v1.DataSource)
      com.google.events.cloud.dataplex.v1.DataSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.events.cloud.dataplex.v1.Data
          .internal_static_google_events_cloud_dataplex_v1_DataSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.dataplex.v1.Data
          .internal_static_google_events_cloud_dataplex_v1_DataSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.dataplex.v1.DataSource.class,
              com.google.events.cloud.dataplex.v1.DataSource.Builder.class);
    }

    // Construct using com.google.events.cloud.dataplex.v1.DataSource.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      sourceCase_ = 0;
      source_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.events.cloud.dataplex.v1.Data
          .internal_static_google_events_cloud_dataplex_v1_DataSource_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.dataplex.v1.DataSource getDefaultInstanceForType() {
      return com.google.events.cloud.dataplex.v1.DataSource.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.dataplex.v1.DataSource build() {
      com.google.events.cloud.dataplex.v1.DataSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.dataplex.v1.DataSource buildPartial() {
      com.google.events.cloud.dataplex.v1.DataSource result =
          new com.google.events.cloud.dataplex.v1.DataSource(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.events.cloud.dataplex.v1.DataSource result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.events.cloud.dataplex.v1.DataSource result) {
      result.sourceCase_ = sourceCase_;
      result.source_ = this.source_;
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
      if (other instanceof com.google.events.cloud.dataplex.v1.DataSource) {
        return mergeFrom((com.google.events.cloud.dataplex.v1.DataSource) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.events.cloud.dataplex.v1.DataSource other) {
      if (other == com.google.events.cloud.dataplex.v1.DataSource.getDefaultInstance()) return this;
      switch (other.getSourceCase()) {
        case ENTITY:
          {
            sourceCase_ = 100;
            source_ = other.source_;
            onChanged();
            break;
          }
        case SOURCE_NOT_SET:
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
            case 802:
              {
                java.lang.String s = input.readStringRequireUtf8();
                sourceCase_ = 100;
                source_ = s;
                break;
              } // case 802
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

    private int sourceCase_ = 0;
    private java.lang.Object source_;

    public SourceCase getSourceCase() {
      return SourceCase.forNumber(sourceCase_);
    }

    public Builder clearSource() {
      sourceCase_ = 0;
      source_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     *
     *
     * <pre>
     * Immutable. The Dataplex entity that represents the data source (e.g.
     * BigQuery table) for DataScan, of the form:
     * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}/entities/{entity_id}`.
     * </pre>
     *
     * <code>string entity = 100;</code>
     *
     * @return Whether the entity field is set.
     */
    @java.lang.Override
    public boolean hasEntity() {
      return sourceCase_ == 100;
    }

    /**
     *
     *
     * <pre>
     * Immutable. The Dataplex entity that represents the data source (e.g.
     * BigQuery table) for DataScan, of the form:
     * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}/entities/{entity_id}`.
     * </pre>
     *
     * <code>string entity = 100;</code>
     *
     * @return The entity.
     */
    @java.lang.Override
    public java.lang.String getEntity() {
      java.lang.Object ref = "";
      if (sourceCase_ == 100) {
        ref = source_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (sourceCase_ == 100) {
          source_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Immutable. The Dataplex entity that represents the data source (e.g.
     * BigQuery table) for DataScan, of the form:
     * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}/entities/{entity_id}`.
     * </pre>
     *
     * <code>string entity = 100;</code>
     *
     * @return The bytes for entity.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getEntityBytes() {
      java.lang.Object ref = "";
      if (sourceCase_ == 100) {
        ref = source_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (sourceCase_ == 100) {
          source_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Immutable. The Dataplex entity that represents the data source (e.g.
     * BigQuery table) for DataScan, of the form:
     * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}/entities/{entity_id}`.
     * </pre>
     *
     * <code>string entity = 100;</code>
     *
     * @param value The entity to set.
     * @return This builder for chaining.
     */
    public Builder setEntity(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      sourceCase_ = 100;
      source_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Immutable. The Dataplex entity that represents the data source (e.g.
     * BigQuery table) for DataScan, of the form:
     * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}/entities/{entity_id}`.
     * </pre>
     *
     * <code>string entity = 100;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEntity() {
      if (sourceCase_ == 100) {
        sourceCase_ = 0;
        source_ = null;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Immutable. The Dataplex entity that represents the data source (e.g.
     * BigQuery table) for DataScan, of the form:
     * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}/entities/{entity_id}`.
     * </pre>
     *
     * <code>string entity = 100;</code>
     *
     * @param value The bytes for entity to set.
     * @return This builder for chaining.
     */
    public Builder setEntityBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      sourceCase_ = 100;
      source_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.events.cloud.dataplex.v1.DataSource)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.dataplex.v1.DataSource)
  private static final com.google.events.cloud.dataplex.v1.DataSource DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.events.cloud.dataplex.v1.DataSource();
  }

  public static com.google.events.cloud.dataplex.v1.DataSource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DataSource> PARSER =
      new com.google.protobuf.AbstractParser<DataSource>() {
        @java.lang.Override
        public DataSource parsePartialFrom(
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

  public static com.google.protobuf.Parser<DataSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DataSource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.dataplex.v1.DataSource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
