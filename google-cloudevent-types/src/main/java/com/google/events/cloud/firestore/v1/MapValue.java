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
// source: google/events/cloud/firestore/v1/data.proto

package com.google.events.cloud.firestore.v1;

/**
 *
 *
 * <pre>
 * A map value.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.firestore.v1.MapValue}
 */
public final class MapValue extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.firestore.v1.MapValue)
    MapValueOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use MapValue.newBuilder() to construct.
  private MapValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MapValue() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MapValue();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.events.cloud.firestore.v1.Data
        .internal_static_google_events_cloud_firestore_v1_MapValue_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(int number) {
    switch (number) {
      case 1:
        return internalGetFields();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.firestore.v1.Data
        .internal_static_google_events_cloud_firestore_v1_MapValue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.firestore.v1.MapValue.class,
            com.google.events.cloud.firestore.v1.MapValue.Builder.class);
  }

  public static final int FIELDS_FIELD_NUMBER = 1;

  private static final class FieldsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
            java.lang.String, com.google.events.cloud.firestore.v1.Value>
        defaultEntry =
            com.google.protobuf.MapEntry
                .<java.lang.String, com.google.events.cloud.firestore.v1.Value>newDefaultInstance(
                    com.google.events.cloud.firestore.v1.Data
                        .internal_static_google_events_cloud_firestore_v1_MapValue_FieldsEntry_descriptor,
                    com.google.protobuf.WireFormat.FieldType.STRING,
                    "",
                    com.google.protobuf.WireFormat.FieldType.MESSAGE,
                    com.google.events.cloud.firestore.v1.Value.getDefaultInstance());
  }

  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<java.lang.String, com.google.events.cloud.firestore.v1.Value>
      fields_;

  private com.google.protobuf.MapField<java.lang.String, com.google.events.cloud.firestore.v1.Value>
      internalGetFields() {
    if (fields_ == null) {
      return com.google.protobuf.MapField.emptyMapField(FieldsDefaultEntryHolder.defaultEntry);
    }
    return fields_;
  }

  public int getFieldsCount() {
    return internalGetFields().getMap().size();
  }

  /**
   *
   *
   * <pre>
   * The map's fields.
   * The map keys represent field names. Field names matching the regular
   * expression `__.*__` are reserved. Reserved field names are forbidden except
   * in certain documented contexts. The map keys, represented as UTF-8, must
   * not exceed 1,500 bytes and cannot be empty.
   * </pre>
   *
   * <code>map&lt;string, .google.events.cloud.firestore.v1.Value&gt; fields = 1;</code>
   */
  @java.lang.Override
  public boolean containsFields(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetFields().getMap().containsKey(key);
  }

  /** Use {@link #getFieldsMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.google.events.cloud.firestore.v1.Value> getFields() {
    return getFieldsMap();
  }

  /**
   *
   *
   * <pre>
   * The map's fields.
   * The map keys represent field names. Field names matching the regular
   * expression `__.*__` are reserved. Reserved field names are forbidden except
   * in certain documented contexts. The map keys, represented as UTF-8, must
   * not exceed 1,500 bytes and cannot be empty.
   * </pre>
   *
   * <code>map&lt;string, .google.events.cloud.firestore.v1.Value&gt; fields = 1;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, com.google.events.cloud.firestore.v1.Value>
      getFieldsMap() {
    return internalGetFields().getMap();
  }

  /**
   *
   *
   * <pre>
   * The map's fields.
   * The map keys represent field names. Field names matching the regular
   * expression `__.*__` are reserved. Reserved field names are forbidden except
   * in certain documented contexts. The map keys, represented as UTF-8, must
   * not exceed 1,500 bytes and cannot be empty.
   * </pre>
   *
   * <code>map&lt;string, .google.events.cloud.firestore.v1.Value&gt; fields = 1;</code>
   */
  @java.lang.Override
  public /* nullable */ com.google.events.cloud.firestore.v1.Value getFieldsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.events.cloud.firestore.v1.Value defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, com.google.events.cloud.firestore.v1.Value> map =
        internalGetFields().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }

  /**
   *
   *
   * <pre>
   * The map's fields.
   * The map keys represent field names. Field names matching the regular
   * expression `__.*__` are reserved. Reserved field names are forbidden except
   * in certain documented contexts. The map keys, represented as UTF-8, must
   * not exceed 1,500 bytes and cannot be empty.
   * </pre>
   *
   * <code>map&lt;string, .google.events.cloud.firestore.v1.Value&gt; fields = 1;</code>
   */
  @java.lang.Override
  public com.google.events.cloud.firestore.v1.Value getFieldsOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, com.google.events.cloud.firestore.v1.Value> map =
        internalGetFields().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetFields(), FieldsDefaultEntryHolder.defaultEntry, 1);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, com.google.events.cloud.firestore.v1.Value> entry :
        internalGetFields().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.google.events.cloud.firestore.v1.Value>
          fields__ =
              FieldsDefaultEntryHolder.defaultEntry
                  .newBuilderForType()
                  .setKey(entry.getKey())
                  .setValue(entry.getValue())
                  .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, fields__);
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
    if (!(obj instanceof com.google.events.cloud.firestore.v1.MapValue)) {
      return super.equals(obj);
    }
    com.google.events.cloud.firestore.v1.MapValue other =
        (com.google.events.cloud.firestore.v1.MapValue) obj;

    if (!internalGetFields().equals(other.internalGetFields())) return false;
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
    if (!internalGetFields().getMap().isEmpty()) {
      hash = (37 * hash) + FIELDS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetFields().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.cloud.firestore.v1.MapValue parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.firestore.v1.MapValue parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.firestore.v1.MapValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.firestore.v1.MapValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.firestore.v1.MapValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.firestore.v1.MapValue parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.firestore.v1.MapValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.firestore.v1.MapValue parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.firestore.v1.MapValue parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.firestore.v1.MapValue parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.firestore.v1.MapValue parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.firestore.v1.MapValue parseFrom(
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

  public static Builder newBuilder(com.google.events.cloud.firestore.v1.MapValue prototype) {
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
   * A map value.
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.firestore.v1.MapValue}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.firestore.v1.MapValue)
      com.google.events.cloud.firestore.v1.MapValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.events.cloud.firestore.v1.Data
          .internal_static_google_events_cloud_firestore_v1_MapValue_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 1:
          return internalGetFields();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
      switch (number) {
        case 1:
          return internalGetMutableFields();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.firestore.v1.Data
          .internal_static_google_events_cloud_firestore_v1_MapValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.firestore.v1.MapValue.class,
              com.google.events.cloud.firestore.v1.MapValue.Builder.class);
    }

    // Construct using com.google.events.cloud.firestore.v1.MapValue.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      internalGetMutableFields().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.events.cloud.firestore.v1.Data
          .internal_static_google_events_cloud_firestore_v1_MapValue_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.firestore.v1.MapValue getDefaultInstanceForType() {
      return com.google.events.cloud.firestore.v1.MapValue.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.firestore.v1.MapValue build() {
      com.google.events.cloud.firestore.v1.MapValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.firestore.v1.MapValue buildPartial() {
      com.google.events.cloud.firestore.v1.MapValue result =
          new com.google.events.cloud.firestore.v1.MapValue(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.events.cloud.firestore.v1.MapValue result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.fields_ = internalGetFields();
        result.fields_.makeImmutable();
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
      if (other instanceof com.google.events.cloud.firestore.v1.MapValue) {
        return mergeFrom((com.google.events.cloud.firestore.v1.MapValue) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.events.cloud.firestore.v1.MapValue other) {
      if (other == com.google.events.cloud.firestore.v1.MapValue.getDefaultInstance()) return this;
      internalGetMutableFields().mergeFrom(other.internalGetFields());
      bitField0_ |= 0x00000001;
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
                com.google.protobuf.MapEntry<
                        java.lang.String, com.google.events.cloud.firestore.v1.Value>
                    fields__ =
                        input.readMessage(
                            FieldsDefaultEntryHolder.defaultEntry.getParserForType(),
                            extensionRegistry);
                internalGetMutableFields()
                    .getMutableMap()
                    .put(fields__.getKey(), fields__.getValue());
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

    private com.google.protobuf.MapField<
            java.lang.String, com.google.events.cloud.firestore.v1.Value>
        fields_;

    private com.google.protobuf.MapField<
            java.lang.String, com.google.events.cloud.firestore.v1.Value>
        internalGetFields() {
      if (fields_ == null) {
        return com.google.protobuf.MapField.emptyMapField(FieldsDefaultEntryHolder.defaultEntry);
      }
      return fields_;
    }

    private com.google.protobuf.MapField<
            java.lang.String, com.google.events.cloud.firestore.v1.Value>
        internalGetMutableFields() {
      if (fields_ == null) {
        fields_ = com.google.protobuf.MapField.newMapField(FieldsDefaultEntryHolder.defaultEntry);
      }
      if (!fields_.isMutable()) {
        fields_ = fields_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return fields_;
    }

    public int getFieldsCount() {
      return internalGetFields().getMap().size();
    }

    /**
     *
     *
     * <pre>
     * The map's fields.
     * The map keys represent field names. Field names matching the regular
     * expression `__.*__` are reserved. Reserved field names are forbidden except
     * in certain documented contexts. The map keys, represented as UTF-8, must
     * not exceed 1,500 bytes and cannot be empty.
     * </pre>
     *
     * <code>map&lt;string, .google.events.cloud.firestore.v1.Value&gt; fields = 1;</code>
     */
    @java.lang.Override
    public boolean containsFields(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetFields().getMap().containsKey(key);
    }

    /** Use {@link #getFieldsMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.events.cloud.firestore.v1.Value> getFields() {
      return getFieldsMap();
    }

    /**
     *
     *
     * <pre>
     * The map's fields.
     * The map keys represent field names. Field names matching the regular
     * expression `__.*__` are reserved. Reserved field names are forbidden except
     * in certain documented contexts. The map keys, represented as UTF-8, must
     * not exceed 1,500 bytes and cannot be empty.
     * </pre>
     *
     * <code>map&lt;string, .google.events.cloud.firestore.v1.Value&gt; fields = 1;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, com.google.events.cloud.firestore.v1.Value>
        getFieldsMap() {
      return internalGetFields().getMap();
    }

    /**
     *
     *
     * <pre>
     * The map's fields.
     * The map keys represent field names. Field names matching the regular
     * expression `__.*__` are reserved. Reserved field names are forbidden except
     * in certain documented contexts. The map keys, represented as UTF-8, must
     * not exceed 1,500 bytes and cannot be empty.
     * </pre>
     *
     * <code>map&lt;string, .google.events.cloud.firestore.v1.Value&gt; fields = 1;</code>
     */
    @java.lang.Override
    public /* nullable */ com.google.events.cloud.firestore.v1.Value getFieldsOrDefault(
        java.lang.String key,
        /* nullable */
        com.google.events.cloud.firestore.v1.Value defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, com.google.events.cloud.firestore.v1.Value> map =
          internalGetFields().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }

    /**
     *
     *
     * <pre>
     * The map's fields.
     * The map keys represent field names. Field names matching the regular
     * expression `__.*__` are reserved. Reserved field names are forbidden except
     * in certain documented contexts. The map keys, represented as UTF-8, must
     * not exceed 1,500 bytes and cannot be empty.
     * </pre>
     *
     * <code>map&lt;string, .google.events.cloud.firestore.v1.Value&gt; fields = 1;</code>
     */
    @java.lang.Override
    public com.google.events.cloud.firestore.v1.Value getFieldsOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, com.google.events.cloud.firestore.v1.Value> map =
          internalGetFields().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearFields() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableFields().getMutableMap().clear();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The map's fields.
     * The map keys represent field names. Field names matching the regular
     * expression `__.*__` are reserved. Reserved field names are forbidden except
     * in certain documented contexts. The map keys, represented as UTF-8, must
     * not exceed 1,500 bytes and cannot be empty.
     * </pre>
     *
     * <code>map&lt;string, .google.events.cloud.firestore.v1.Value&gt; fields = 1;</code>
     */
    public Builder removeFields(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableFields().getMutableMap().remove(key);
      return this;
    }

    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.events.cloud.firestore.v1.Value>
        getMutableFields() {
      bitField0_ |= 0x00000001;
      return internalGetMutableFields().getMutableMap();
    }

    /**
     *
     *
     * <pre>
     * The map's fields.
     * The map keys represent field names. Field names matching the regular
     * expression `__.*__` are reserved. Reserved field names are forbidden except
     * in certain documented contexts. The map keys, represented as UTF-8, must
     * not exceed 1,500 bytes and cannot be empty.
     * </pre>
     *
     * <code>map&lt;string, .google.events.cloud.firestore.v1.Value&gt; fields = 1;</code>
     */
    public Builder putFields(
        java.lang.String key, com.google.events.cloud.firestore.v1.Value value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }
      internalGetMutableFields().getMutableMap().put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }

    /**
     *
     *
     * <pre>
     * The map's fields.
     * The map keys represent field names. Field names matching the regular
     * expression `__.*__` are reserved. Reserved field names are forbidden except
     * in certain documented contexts. The map keys, represented as UTF-8, must
     * not exceed 1,500 bytes and cannot be empty.
     * </pre>
     *
     * <code>map&lt;string, .google.events.cloud.firestore.v1.Value&gt; fields = 1;</code>
     */
    public Builder putAllFields(
        java.util.Map<java.lang.String, com.google.events.cloud.firestore.v1.Value> values) {
      internalGetMutableFields().getMutableMap().putAll(values);
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.events.cloud.firestore.v1.MapValue)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.firestore.v1.MapValue)
  private static final com.google.events.cloud.firestore.v1.MapValue DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.events.cloud.firestore.v1.MapValue();
  }

  public static com.google.events.cloud.firestore.v1.MapValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MapValue> PARSER =
      new com.google.protobuf.AbstractParser<MapValue>() {
        @java.lang.Override
        public MapValue parsePartialFrom(
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

  public static com.google.protobuf.Parser<MapValue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MapValue> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.firestore.v1.MapValue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
