// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/cloud/audit/v1/data.proto

package com.google.events.cloud.audit.v1;

/**
 * <pre>
 * Location information about a resource.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.audit.v1.ResourceLocation}
 */
public final class ResourceLocation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.audit.v1.ResourceLocation)
    ResourceLocationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResourceLocation.newBuilder() to construct.
  private ResourceLocation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResourceLocation() {
    currentLocations_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    originalLocations_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ResourceLocation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.events.cloud.audit.v1.Data.internal_static_google_events_cloud_audit_v1_ResourceLocation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.audit.v1.Data.internal_static_google_events_cloud_audit_v1_ResourceLocation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.audit.v1.ResourceLocation.class, com.google.events.cloud.audit.v1.ResourceLocation.Builder.class);
  }

  public static final int CURRENT_LOCATIONS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList currentLocations_;
  /**
   * <pre>
   * The locations of a resource after the execution of the operation.
   * Requests to create or delete a location based resource must populate
   * the 'current_locations' field and not the 'original_locations' field.
   * For example:
   *     "europe-west1-a"
   *     "us-east1"
   *     "nam3"
   * </pre>
   *
   * <code>repeated string current_locations = 1;</code>
   * @return A list containing the currentLocations.
   */
  public com.google.protobuf.ProtocolStringList
      getCurrentLocationsList() {
    return currentLocations_;
  }
  /**
   * <pre>
   * The locations of a resource after the execution of the operation.
   * Requests to create or delete a location based resource must populate
   * the 'current_locations' field and not the 'original_locations' field.
   * For example:
   *     "europe-west1-a"
   *     "us-east1"
   *     "nam3"
   * </pre>
   *
   * <code>repeated string current_locations = 1;</code>
   * @return The count of currentLocations.
   */
  public int getCurrentLocationsCount() {
    return currentLocations_.size();
  }
  /**
   * <pre>
   * The locations of a resource after the execution of the operation.
   * Requests to create or delete a location based resource must populate
   * the 'current_locations' field and not the 'original_locations' field.
   * For example:
   *     "europe-west1-a"
   *     "us-east1"
   *     "nam3"
   * </pre>
   *
   * <code>repeated string current_locations = 1;</code>
   * @param index The index of the element to return.
   * @return The currentLocations at the given index.
   */
  public java.lang.String getCurrentLocations(int index) {
    return currentLocations_.get(index);
  }
  /**
   * <pre>
   * The locations of a resource after the execution of the operation.
   * Requests to create or delete a location based resource must populate
   * the 'current_locations' field and not the 'original_locations' field.
   * For example:
   *     "europe-west1-a"
   *     "us-east1"
   *     "nam3"
   * </pre>
   *
   * <code>repeated string current_locations = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the currentLocations at the given index.
   */
  public com.google.protobuf.ByteString
      getCurrentLocationsBytes(int index) {
    return currentLocations_.getByteString(index);
  }

  public static final int ORIGINAL_LOCATIONS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList originalLocations_;
  /**
   * <pre>
   * The locations of a resource prior to the execution of the operation.
   * Requests that mutate the resource's location must populate both the
   * 'original_locations' as well as the 'current_locations' fields.
   * For example:
   *     "europe-west1-a"
   *     "us-east1"
   *     "nam3"
   * </pre>
   *
   * <code>repeated string original_locations = 2;</code>
   * @return A list containing the originalLocations.
   */
  public com.google.protobuf.ProtocolStringList
      getOriginalLocationsList() {
    return originalLocations_;
  }
  /**
   * <pre>
   * The locations of a resource prior to the execution of the operation.
   * Requests that mutate the resource's location must populate both the
   * 'original_locations' as well as the 'current_locations' fields.
   * For example:
   *     "europe-west1-a"
   *     "us-east1"
   *     "nam3"
   * </pre>
   *
   * <code>repeated string original_locations = 2;</code>
   * @return The count of originalLocations.
   */
  public int getOriginalLocationsCount() {
    return originalLocations_.size();
  }
  /**
   * <pre>
   * The locations of a resource prior to the execution of the operation.
   * Requests that mutate the resource's location must populate both the
   * 'original_locations' as well as the 'current_locations' fields.
   * For example:
   *     "europe-west1-a"
   *     "us-east1"
   *     "nam3"
   * </pre>
   *
   * <code>repeated string original_locations = 2;</code>
   * @param index The index of the element to return.
   * @return The originalLocations at the given index.
   */
  public java.lang.String getOriginalLocations(int index) {
    return originalLocations_.get(index);
  }
  /**
   * <pre>
   * The locations of a resource prior to the execution of the operation.
   * Requests that mutate the resource's location must populate both the
   * 'original_locations' as well as the 'current_locations' fields.
   * For example:
   *     "europe-west1-a"
   *     "us-east1"
   *     "nam3"
   * </pre>
   *
   * <code>repeated string original_locations = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the originalLocations at the given index.
   */
  public com.google.protobuf.ByteString
      getOriginalLocationsBytes(int index) {
    return originalLocations_.getByteString(index);
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
    for (int i = 0; i < currentLocations_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, currentLocations_.getRaw(i));
    }
    for (int i = 0; i < originalLocations_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, originalLocations_.getRaw(i));
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
      for (int i = 0; i < currentLocations_.size(); i++) {
        dataSize += computeStringSizeNoTag(currentLocations_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getCurrentLocationsList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < originalLocations_.size(); i++) {
        dataSize += computeStringSizeNoTag(originalLocations_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getOriginalLocationsList().size();
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
    if (!(obj instanceof com.google.events.cloud.audit.v1.ResourceLocation)) {
      return super.equals(obj);
    }
    com.google.events.cloud.audit.v1.ResourceLocation other = (com.google.events.cloud.audit.v1.ResourceLocation) obj;

    if (!getCurrentLocationsList()
        .equals(other.getCurrentLocationsList())) return false;
    if (!getOriginalLocationsList()
        .equals(other.getOriginalLocationsList())) return false;
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
    if (getCurrentLocationsCount() > 0) {
      hash = (37 * hash) + CURRENT_LOCATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getCurrentLocationsList().hashCode();
    }
    if (getOriginalLocationsCount() > 0) {
      hash = (37 * hash) + ORIGINAL_LOCATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getOriginalLocationsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.cloud.audit.v1.ResourceLocation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.events.cloud.audit.v1.ResourceLocation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.events.cloud.audit.v1.ResourceLocation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.events.cloud.audit.v1.ResourceLocation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.events.cloud.audit.v1.ResourceLocation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.events.cloud.audit.v1.ResourceLocation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.events.cloud.audit.v1.ResourceLocation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.events.cloud.audit.v1.ResourceLocation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.events.cloud.audit.v1.ResourceLocation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.events.cloud.audit.v1.ResourceLocation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.events.cloud.audit.v1.ResourceLocation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.events.cloud.audit.v1.ResourceLocation parseFrom(
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
  public static Builder newBuilder(com.google.events.cloud.audit.v1.ResourceLocation prototype) {
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
   * Location information about a resource.
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.audit.v1.ResourceLocation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.audit.v1.ResourceLocation)
      com.google.events.cloud.audit.v1.ResourceLocationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.events.cloud.audit.v1.Data.internal_static_google_events_cloud_audit_v1_ResourceLocation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.audit.v1.Data.internal_static_google_events_cloud_audit_v1_ResourceLocation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.audit.v1.ResourceLocation.class, com.google.events.cloud.audit.v1.ResourceLocation.Builder.class);
    }

    // Construct using com.google.events.cloud.audit.v1.ResourceLocation.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      currentLocations_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      originalLocations_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.events.cloud.audit.v1.Data.internal_static_google_events_cloud_audit_v1_ResourceLocation_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.audit.v1.ResourceLocation getDefaultInstanceForType() {
      return com.google.events.cloud.audit.v1.ResourceLocation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.audit.v1.ResourceLocation build() {
      com.google.events.cloud.audit.v1.ResourceLocation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.audit.v1.ResourceLocation buildPartial() {
      com.google.events.cloud.audit.v1.ResourceLocation result = new com.google.events.cloud.audit.v1.ResourceLocation(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        currentLocations_ = currentLocations_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.currentLocations_ = currentLocations_;
      if (((bitField0_ & 0x00000002) != 0)) {
        originalLocations_ = originalLocations_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.originalLocations_ = originalLocations_;
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
      if (other instanceof com.google.events.cloud.audit.v1.ResourceLocation) {
        return mergeFrom((com.google.events.cloud.audit.v1.ResourceLocation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.events.cloud.audit.v1.ResourceLocation other) {
      if (other == com.google.events.cloud.audit.v1.ResourceLocation.getDefaultInstance()) return this;
      if (!other.currentLocations_.isEmpty()) {
        if (currentLocations_.isEmpty()) {
          currentLocations_ = other.currentLocations_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureCurrentLocationsIsMutable();
          currentLocations_.addAll(other.currentLocations_);
        }
        onChanged();
      }
      if (!other.originalLocations_.isEmpty()) {
        if (originalLocations_.isEmpty()) {
          originalLocations_ = other.originalLocations_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureOriginalLocationsIsMutable();
          originalLocations_.addAll(other.originalLocations_);
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureCurrentLocationsIsMutable();
              currentLocations_.add(s);
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureOriginalLocationsIsMutable();
              originalLocations_.add(s);
              break;
            } // case 18
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
    private int bitField0_;

    private com.google.protobuf.LazyStringList currentLocations_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureCurrentLocationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        currentLocations_ = new com.google.protobuf.LazyStringArrayList(currentLocations_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * The locations of a resource after the execution of the operation.
     * Requests to create or delete a location based resource must populate
     * the 'current_locations' field and not the 'original_locations' field.
     * For example:
     *     "europe-west1-a"
     *     "us-east1"
     *     "nam3"
     * </pre>
     *
     * <code>repeated string current_locations = 1;</code>
     * @return A list containing the currentLocations.
     */
    public com.google.protobuf.ProtocolStringList
        getCurrentLocationsList() {
      return currentLocations_.getUnmodifiableView();
    }
    /**
     * <pre>
     * The locations of a resource after the execution of the operation.
     * Requests to create or delete a location based resource must populate
     * the 'current_locations' field and not the 'original_locations' field.
     * For example:
     *     "europe-west1-a"
     *     "us-east1"
     *     "nam3"
     * </pre>
     *
     * <code>repeated string current_locations = 1;</code>
     * @return The count of currentLocations.
     */
    public int getCurrentLocationsCount() {
      return currentLocations_.size();
    }
    /**
     * <pre>
     * The locations of a resource after the execution of the operation.
     * Requests to create or delete a location based resource must populate
     * the 'current_locations' field and not the 'original_locations' field.
     * For example:
     *     "europe-west1-a"
     *     "us-east1"
     *     "nam3"
     * </pre>
     *
     * <code>repeated string current_locations = 1;</code>
     * @param index The index of the element to return.
     * @return The currentLocations at the given index.
     */
    public java.lang.String getCurrentLocations(int index) {
      return currentLocations_.get(index);
    }
    /**
     * <pre>
     * The locations of a resource after the execution of the operation.
     * Requests to create or delete a location based resource must populate
     * the 'current_locations' field and not the 'original_locations' field.
     * For example:
     *     "europe-west1-a"
     *     "us-east1"
     *     "nam3"
     * </pre>
     *
     * <code>repeated string current_locations = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the currentLocations at the given index.
     */
    public com.google.protobuf.ByteString
        getCurrentLocationsBytes(int index) {
      return currentLocations_.getByteString(index);
    }
    /**
     * <pre>
     * The locations of a resource after the execution of the operation.
     * Requests to create or delete a location based resource must populate
     * the 'current_locations' field and not the 'original_locations' field.
     * For example:
     *     "europe-west1-a"
     *     "us-east1"
     *     "nam3"
     * </pre>
     *
     * <code>repeated string current_locations = 1;</code>
     * @param index The index to set the value at.
     * @param value The currentLocations to set.
     * @return This builder for chaining.
     */
    public Builder setCurrentLocations(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureCurrentLocationsIsMutable();
      currentLocations_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The locations of a resource after the execution of the operation.
     * Requests to create or delete a location based resource must populate
     * the 'current_locations' field and not the 'original_locations' field.
     * For example:
     *     "europe-west1-a"
     *     "us-east1"
     *     "nam3"
     * </pre>
     *
     * <code>repeated string current_locations = 1;</code>
     * @param value The currentLocations to add.
     * @return This builder for chaining.
     */
    public Builder addCurrentLocations(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureCurrentLocationsIsMutable();
      currentLocations_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The locations of a resource after the execution of the operation.
     * Requests to create or delete a location based resource must populate
     * the 'current_locations' field and not the 'original_locations' field.
     * For example:
     *     "europe-west1-a"
     *     "us-east1"
     *     "nam3"
     * </pre>
     *
     * <code>repeated string current_locations = 1;</code>
     * @param values The currentLocations to add.
     * @return This builder for chaining.
     */
    public Builder addAllCurrentLocations(
        java.lang.Iterable<java.lang.String> values) {
      ensureCurrentLocationsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, currentLocations_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The locations of a resource after the execution of the operation.
     * Requests to create or delete a location based resource must populate
     * the 'current_locations' field and not the 'original_locations' field.
     * For example:
     *     "europe-west1-a"
     *     "us-east1"
     *     "nam3"
     * </pre>
     *
     * <code>repeated string current_locations = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCurrentLocations() {
      currentLocations_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The locations of a resource after the execution of the operation.
     * Requests to create or delete a location based resource must populate
     * the 'current_locations' field and not the 'original_locations' field.
     * For example:
     *     "europe-west1-a"
     *     "us-east1"
     *     "nam3"
     * </pre>
     *
     * <code>repeated string current_locations = 1;</code>
     * @param value The bytes of the currentLocations to add.
     * @return This builder for chaining.
     */
    public Builder addCurrentLocationsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureCurrentLocationsIsMutable();
      currentLocations_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList originalLocations_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureOriginalLocationsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        originalLocations_ = new com.google.protobuf.LazyStringArrayList(originalLocations_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * The locations of a resource prior to the execution of the operation.
     * Requests that mutate the resource's location must populate both the
     * 'original_locations' as well as the 'current_locations' fields.
     * For example:
     *     "europe-west1-a"
     *     "us-east1"
     *     "nam3"
     * </pre>
     *
     * <code>repeated string original_locations = 2;</code>
     * @return A list containing the originalLocations.
     */
    public com.google.protobuf.ProtocolStringList
        getOriginalLocationsList() {
      return originalLocations_.getUnmodifiableView();
    }
    /**
     * <pre>
     * The locations of a resource prior to the execution of the operation.
     * Requests that mutate the resource's location must populate both the
     * 'original_locations' as well as the 'current_locations' fields.
     * For example:
     *     "europe-west1-a"
     *     "us-east1"
     *     "nam3"
     * </pre>
     *
     * <code>repeated string original_locations = 2;</code>
     * @return The count of originalLocations.
     */
    public int getOriginalLocationsCount() {
      return originalLocations_.size();
    }
    /**
     * <pre>
     * The locations of a resource prior to the execution of the operation.
     * Requests that mutate the resource's location must populate both the
     * 'original_locations' as well as the 'current_locations' fields.
     * For example:
     *     "europe-west1-a"
     *     "us-east1"
     *     "nam3"
     * </pre>
     *
     * <code>repeated string original_locations = 2;</code>
     * @param index The index of the element to return.
     * @return The originalLocations at the given index.
     */
    public java.lang.String getOriginalLocations(int index) {
      return originalLocations_.get(index);
    }
    /**
     * <pre>
     * The locations of a resource prior to the execution of the operation.
     * Requests that mutate the resource's location must populate both the
     * 'original_locations' as well as the 'current_locations' fields.
     * For example:
     *     "europe-west1-a"
     *     "us-east1"
     *     "nam3"
     * </pre>
     *
     * <code>repeated string original_locations = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the originalLocations at the given index.
     */
    public com.google.protobuf.ByteString
        getOriginalLocationsBytes(int index) {
      return originalLocations_.getByteString(index);
    }
    /**
     * <pre>
     * The locations of a resource prior to the execution of the operation.
     * Requests that mutate the resource's location must populate both the
     * 'original_locations' as well as the 'current_locations' fields.
     * For example:
     *     "europe-west1-a"
     *     "us-east1"
     *     "nam3"
     * </pre>
     *
     * <code>repeated string original_locations = 2;</code>
     * @param index The index to set the value at.
     * @param value The originalLocations to set.
     * @return This builder for chaining.
     */
    public Builder setOriginalLocations(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureOriginalLocationsIsMutable();
      originalLocations_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The locations of a resource prior to the execution of the operation.
     * Requests that mutate the resource's location must populate both the
     * 'original_locations' as well as the 'current_locations' fields.
     * For example:
     *     "europe-west1-a"
     *     "us-east1"
     *     "nam3"
     * </pre>
     *
     * <code>repeated string original_locations = 2;</code>
     * @param value The originalLocations to add.
     * @return This builder for chaining.
     */
    public Builder addOriginalLocations(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureOriginalLocationsIsMutable();
      originalLocations_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The locations of a resource prior to the execution of the operation.
     * Requests that mutate the resource's location must populate both the
     * 'original_locations' as well as the 'current_locations' fields.
     * For example:
     *     "europe-west1-a"
     *     "us-east1"
     *     "nam3"
     * </pre>
     *
     * <code>repeated string original_locations = 2;</code>
     * @param values The originalLocations to add.
     * @return This builder for chaining.
     */
    public Builder addAllOriginalLocations(
        java.lang.Iterable<java.lang.String> values) {
      ensureOriginalLocationsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, originalLocations_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The locations of a resource prior to the execution of the operation.
     * Requests that mutate the resource's location must populate both the
     * 'original_locations' as well as the 'current_locations' fields.
     * For example:
     *     "europe-west1-a"
     *     "us-east1"
     *     "nam3"
     * </pre>
     *
     * <code>repeated string original_locations = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOriginalLocations() {
      originalLocations_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The locations of a resource prior to the execution of the operation.
     * Requests that mutate the resource's location must populate both the
     * 'original_locations' as well as the 'current_locations' fields.
     * For example:
     *     "europe-west1-a"
     *     "us-east1"
     *     "nam3"
     * </pre>
     *
     * <code>repeated string original_locations = 2;</code>
     * @param value The bytes of the originalLocations to add.
     * @return This builder for chaining.
     */
    public Builder addOriginalLocationsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureOriginalLocationsIsMutable();
      originalLocations_.add(value);
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


    // @@protoc_insertion_point(builder_scope:google.events.cloud.audit.v1.ResourceLocation)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.audit.v1.ResourceLocation)
  private static final com.google.events.cloud.audit.v1.ResourceLocation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.events.cloud.audit.v1.ResourceLocation();
  }

  public static com.google.events.cloud.audit.v1.ResourceLocation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResourceLocation>
      PARSER = new com.google.protobuf.AbstractParser<ResourceLocation>() {
    @java.lang.Override
    public ResourceLocation parsePartialFrom(
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

  public static com.google.protobuf.Parser<ResourceLocation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResourceLocation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.audit.v1.ResourceLocation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

