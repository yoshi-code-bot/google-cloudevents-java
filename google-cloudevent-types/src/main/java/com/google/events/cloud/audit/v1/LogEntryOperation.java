// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/cloud/audit/v1/data.proto

package com.google.events.cloud.audit.v1;

/**
 * <pre>
 * Additional information about a potentially long-running operation with which
 * a log entry is associated.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.audit.v1.LogEntryOperation}
 */
public final class LogEntryOperation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.audit.v1.LogEntryOperation)
    LogEntryOperationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LogEntryOperation.newBuilder() to construct.
  private LogEntryOperation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LogEntryOperation() {
    id_ = "";
    producer_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LogEntryOperation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.events.cloud.audit.v1.Data.internal_static_google_events_cloud_audit_v1_LogEntryOperation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.audit.v1.Data.internal_static_google_events_cloud_audit_v1_LogEntryOperation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.audit.v1.LogEntryOperation.class, com.google.events.cloud.audit.v1.LogEntryOperation.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <pre>
   * An arbitrary operation identifier. Log entries with the same
   * identifier are assumed to be part of the same operation.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * An arbitrary operation identifier. Log entries with the same
   * identifier are assumed to be part of the same operation.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRODUCER_FIELD_NUMBER = 2;
  private volatile java.lang.Object producer_;
  /**
   * <pre>
   * An arbitrary producer identifier. The combination of `id` and
   * `producer` must be globally unique. Examples for `producer`:
   * `"MyDivision.MyBigCompany.com"`, `"github.com/MyProject/MyApplication"`.
   * </pre>
   *
   * <code>string producer = 2;</code>
   * @return The producer.
   */
  @java.lang.Override
  public java.lang.String getProducer() {
    java.lang.Object ref = producer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      producer_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * An arbitrary producer identifier. The combination of `id` and
   * `producer` must be globally unique. Examples for `producer`:
   * `"MyDivision.MyBigCompany.com"`, `"github.com/MyProject/MyApplication"`.
   * </pre>
   *
   * <code>string producer = 2;</code>
   * @return The bytes for producer.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProducerBytes() {
    java.lang.Object ref = producer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      producer_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FIRST_FIELD_NUMBER = 3;
  private boolean first_;
  /**
   * <pre>
   * True if this is the first log entry in the operation.
   * </pre>
   *
   * <code>bool first = 3;</code>
   * @return The first.
   */
  @java.lang.Override
  public boolean getFirst() {
    return first_;
  }

  public static final int LAST_FIELD_NUMBER = 4;
  private boolean last_;
  /**
   * <pre>
   * True if this is the last log entry in the operation.
   * </pre>
   *
   * <code>bool last = 4;</code>
   * @return The last.
   */
  @java.lang.Override
  public boolean getLast() {
    return last_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(producer_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, producer_);
    }
    if (first_ != false) {
      output.writeBool(3, first_);
    }
    if (last_ != false) {
      output.writeBool(4, last_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(producer_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, producer_);
    }
    if (first_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, first_);
    }
    if (last_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, last_);
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
    if (!(obj instanceof com.google.events.cloud.audit.v1.LogEntryOperation)) {
      return super.equals(obj);
    }
    com.google.events.cloud.audit.v1.LogEntryOperation other = (com.google.events.cloud.audit.v1.LogEntryOperation) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!getProducer()
        .equals(other.getProducer())) return false;
    if (getFirst()
        != other.getFirst()) return false;
    if (getLast()
        != other.getLast()) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + PRODUCER_FIELD_NUMBER;
    hash = (53 * hash) + getProducer().hashCode();
    hash = (37 * hash) + FIRST_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFirst());
    hash = (37 * hash) + LAST_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getLast());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.cloud.audit.v1.LogEntryOperation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.events.cloud.audit.v1.LogEntryOperation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.events.cloud.audit.v1.LogEntryOperation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.events.cloud.audit.v1.LogEntryOperation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.events.cloud.audit.v1.LogEntryOperation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.events.cloud.audit.v1.LogEntryOperation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.events.cloud.audit.v1.LogEntryOperation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.events.cloud.audit.v1.LogEntryOperation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.events.cloud.audit.v1.LogEntryOperation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.events.cloud.audit.v1.LogEntryOperation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.events.cloud.audit.v1.LogEntryOperation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.events.cloud.audit.v1.LogEntryOperation parseFrom(
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
  public static Builder newBuilder(com.google.events.cloud.audit.v1.LogEntryOperation prototype) {
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
   * Additional information about a potentially long-running operation with which
   * a log entry is associated.
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.audit.v1.LogEntryOperation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.audit.v1.LogEntryOperation)
      com.google.events.cloud.audit.v1.LogEntryOperationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.events.cloud.audit.v1.Data.internal_static_google_events_cloud_audit_v1_LogEntryOperation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.audit.v1.Data.internal_static_google_events_cloud_audit_v1_LogEntryOperation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.audit.v1.LogEntryOperation.class, com.google.events.cloud.audit.v1.LogEntryOperation.Builder.class);
    }

    // Construct using com.google.events.cloud.audit.v1.LogEntryOperation.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = "";

      producer_ = "";

      first_ = false;

      last_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.events.cloud.audit.v1.Data.internal_static_google_events_cloud_audit_v1_LogEntryOperation_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.audit.v1.LogEntryOperation getDefaultInstanceForType() {
      return com.google.events.cloud.audit.v1.LogEntryOperation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.audit.v1.LogEntryOperation build() {
      com.google.events.cloud.audit.v1.LogEntryOperation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.audit.v1.LogEntryOperation buildPartial() {
      com.google.events.cloud.audit.v1.LogEntryOperation result = new com.google.events.cloud.audit.v1.LogEntryOperation(this);
      result.id_ = id_;
      result.producer_ = producer_;
      result.first_ = first_;
      result.last_ = last_;
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
      if (other instanceof com.google.events.cloud.audit.v1.LogEntryOperation) {
        return mergeFrom((com.google.events.cloud.audit.v1.LogEntryOperation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.events.cloud.audit.v1.LogEntryOperation other) {
      if (other == com.google.events.cloud.audit.v1.LogEntryOperation.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getProducer().isEmpty()) {
        producer_ = other.producer_;
        onChanged();
      }
      if (other.getFirst() != false) {
        setFirst(other.getFirst());
      }
      if (other.getLast() != false) {
        setLast(other.getLast());
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
              id_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              producer_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 24: {
              first_ = input.readBool();

              break;
            } // case 24
            case 32: {
              last_ = input.readBool();

              break;
            } // case 32
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

    private java.lang.Object id_ = "";
    /**
     * <pre>
     * An arbitrary operation identifier. Log entries with the same
     * identifier are assumed to be part of the same operation.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * An arbitrary operation identifier. Log entries with the same
     * identifier are assumed to be part of the same operation.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * An arbitrary operation identifier. Log entries with the same
     * identifier are assumed to be part of the same operation.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An arbitrary operation identifier. Log entries with the same
     * identifier are assumed to be part of the same operation.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An arbitrary operation identifier. Log entries with the same
     * identifier are assumed to be part of the same operation.
     * </pre>
     *
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object producer_ = "";
    /**
     * <pre>
     * An arbitrary producer identifier. The combination of `id` and
     * `producer` must be globally unique. Examples for `producer`:
     * `"MyDivision.MyBigCompany.com"`, `"github.com/MyProject/MyApplication"`.
     * </pre>
     *
     * <code>string producer = 2;</code>
     * @return The producer.
     */
    public java.lang.String getProducer() {
      java.lang.Object ref = producer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        producer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * An arbitrary producer identifier. The combination of `id` and
     * `producer` must be globally unique. Examples for `producer`:
     * `"MyDivision.MyBigCompany.com"`, `"github.com/MyProject/MyApplication"`.
     * </pre>
     *
     * <code>string producer = 2;</code>
     * @return The bytes for producer.
     */
    public com.google.protobuf.ByteString
        getProducerBytes() {
      java.lang.Object ref = producer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        producer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * An arbitrary producer identifier. The combination of `id` and
     * `producer` must be globally unique. Examples for `producer`:
     * `"MyDivision.MyBigCompany.com"`, `"github.com/MyProject/MyApplication"`.
     * </pre>
     *
     * <code>string producer = 2;</code>
     * @param value The producer to set.
     * @return This builder for chaining.
     */
    public Builder setProducer(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      producer_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An arbitrary producer identifier. The combination of `id` and
     * `producer` must be globally unique. Examples for `producer`:
     * `"MyDivision.MyBigCompany.com"`, `"github.com/MyProject/MyApplication"`.
     * </pre>
     *
     * <code>string producer = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearProducer() {
      
      producer_ = getDefaultInstance().getProducer();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An arbitrary producer identifier. The combination of `id` and
     * `producer` must be globally unique. Examples for `producer`:
     * `"MyDivision.MyBigCompany.com"`, `"github.com/MyProject/MyApplication"`.
     * </pre>
     *
     * <code>string producer = 2;</code>
     * @param value The bytes for producer to set.
     * @return This builder for chaining.
     */
    public Builder setProducerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      producer_ = value;
      onChanged();
      return this;
    }

    private boolean first_ ;
    /**
     * <pre>
     * True if this is the first log entry in the operation.
     * </pre>
     *
     * <code>bool first = 3;</code>
     * @return The first.
     */
    @java.lang.Override
    public boolean getFirst() {
      return first_;
    }
    /**
     * <pre>
     * True if this is the first log entry in the operation.
     * </pre>
     *
     * <code>bool first = 3;</code>
     * @param value The first to set.
     * @return This builder for chaining.
     */
    public Builder setFirst(boolean value) {
      
      first_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * True if this is the first log entry in the operation.
     * </pre>
     *
     * <code>bool first = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFirst() {
      
      first_ = false;
      onChanged();
      return this;
    }

    private boolean last_ ;
    /**
     * <pre>
     * True if this is the last log entry in the operation.
     * </pre>
     *
     * <code>bool last = 4;</code>
     * @return The last.
     */
    @java.lang.Override
    public boolean getLast() {
      return last_;
    }
    /**
     * <pre>
     * True if this is the last log entry in the operation.
     * </pre>
     *
     * <code>bool last = 4;</code>
     * @param value The last to set.
     * @return This builder for chaining.
     */
    public Builder setLast(boolean value) {
      
      last_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * True if this is the last log entry in the operation.
     * </pre>
     *
     * <code>bool last = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLast() {
      
      last_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.events.cloud.audit.v1.LogEntryOperation)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.audit.v1.LogEntryOperation)
  private static final com.google.events.cloud.audit.v1.LogEntryOperation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.events.cloud.audit.v1.LogEntryOperation();
  }

  public static com.google.events.cloud.audit.v1.LogEntryOperation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LogEntryOperation>
      PARSER = new com.google.protobuf.AbstractParser<LogEntryOperation>() {
    @java.lang.Override
    public LogEntryOperation parsePartialFrom(
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

  public static com.google.protobuf.Parser<LogEntryOperation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LogEntryOperation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.audit.v1.LogEntryOperation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

