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
// source: google/events/cloud/datastream/v1/data.proto

package com.google.events.cloud.datastream.v1;

/**
 *
 *
 * <pre>
 * MySQL database profile.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.datastream.v1.MysqlProfile}
 */
public final class MysqlProfile extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.datastream.v1.MysqlProfile)
    MysqlProfileOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use MysqlProfile.newBuilder() to construct.
  private MysqlProfile(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MysqlProfile() {
    hostname_ = "";
    username_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MysqlProfile();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.events.cloud.datastream.v1.Data
        .internal_static_google_events_cloud_datastream_v1_MysqlProfile_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.datastream.v1.Data
        .internal_static_google_events_cloud_datastream_v1_MysqlProfile_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.datastream.v1.MysqlProfile.class,
            com.google.events.cloud.datastream.v1.MysqlProfile.Builder.class);
  }

  public static final int HOSTNAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object hostname_ = "";

  /**
   *
   *
   * <pre>
   * Required. Hostname for the MySQL connection.
   * </pre>
   *
   * <code>string hostname = 1;</code>
   *
   * @return The hostname.
   */
  @java.lang.Override
  public java.lang.String getHostname() {
    java.lang.Object ref = hostname_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hostname_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. Hostname for the MySQL connection.
   * </pre>
   *
   * <code>string hostname = 1;</code>
   *
   * @return The bytes for hostname.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getHostnameBytes() {
    java.lang.Object ref = hostname_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      hostname_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PORT_FIELD_NUMBER = 2;
  private int port_ = 0;

  /**
   *
   *
   * <pre>
   * Port for the MySQL connection, default value is 3306.
   * </pre>
   *
   * <code>int32 port = 2;</code>
   *
   * @return The port.
   */
  @java.lang.Override
  public int getPort() {
    return port_;
  }

  public static final int USERNAME_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object username_ = "";

  /**
   *
   *
   * <pre>
   * Required. Username for the MySQL connection.
   * </pre>
   *
   * <code>string username = 3;</code>
   *
   * @return The username.
   */
  @java.lang.Override
  public java.lang.String getUsername() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      username_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. Username for the MySQL connection.
   * </pre>
   *
   * <code>string username = 3;</code>
   *
   * @return The bytes for username.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getUsernameBytes() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      username_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SSL_CONFIG_FIELD_NUMBER = 5;
  private com.google.events.cloud.datastream.v1.MysqlSslConfig sslConfig_;

  /**
   *
   *
   * <pre>
   * SSL configuration for the MySQL connection.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.MysqlSslConfig ssl_config = 5;</code>
   *
   * @return Whether the sslConfig field is set.
   */
  @java.lang.Override
  public boolean hasSslConfig() {
    return sslConfig_ != null;
  }

  /**
   *
   *
   * <pre>
   * SSL configuration for the MySQL connection.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.MysqlSslConfig ssl_config = 5;</code>
   *
   * @return The sslConfig.
   */
  @java.lang.Override
  public com.google.events.cloud.datastream.v1.MysqlSslConfig getSslConfig() {
    return sslConfig_ == null
        ? com.google.events.cloud.datastream.v1.MysqlSslConfig.getDefaultInstance()
        : sslConfig_;
  }

  /**
   *
   *
   * <pre>
   * SSL configuration for the MySQL connection.
   * </pre>
   *
   * <code>.google.events.cloud.datastream.v1.MysqlSslConfig ssl_config = 5;</code>
   */
  @java.lang.Override
  public com.google.events.cloud.datastream.v1.MysqlSslConfigOrBuilder getSslConfigOrBuilder() {
    return sslConfig_ == null
        ? com.google.events.cloud.datastream.v1.MysqlSslConfig.getDefaultInstance()
        : sslConfig_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hostname_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, hostname_);
    }
    if (port_ != 0) {
      output.writeInt32(2, port_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(username_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, username_);
    }
    if (sslConfig_ != null) {
      output.writeMessage(5, getSslConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hostname_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, hostname_);
    }
    if (port_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, port_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(username_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, username_);
    }
    if (sslConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(5, getSslConfig());
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
    if (!(obj instanceof com.google.events.cloud.datastream.v1.MysqlProfile)) {
      return super.equals(obj);
    }
    com.google.events.cloud.datastream.v1.MysqlProfile other =
        (com.google.events.cloud.datastream.v1.MysqlProfile) obj;

    if (!getHostname().equals(other.getHostname())) return false;
    if (getPort() != other.getPort()) return false;
    if (!getUsername().equals(other.getUsername())) return false;
    if (hasSslConfig() != other.hasSslConfig()) return false;
    if (hasSslConfig()) {
      if (!getSslConfig().equals(other.getSslConfig())) return false;
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
    hash = (37 * hash) + HOSTNAME_FIELD_NUMBER;
    hash = (53 * hash) + getHostname().hashCode();
    hash = (37 * hash) + PORT_FIELD_NUMBER;
    hash = (53 * hash) + getPort();
    hash = (37 * hash) + USERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getUsername().hashCode();
    if (hasSslConfig()) {
      hash = (37 * hash) + SSL_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getSslConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.cloud.datastream.v1.MysqlProfile parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.datastream.v1.MysqlProfile parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.datastream.v1.MysqlProfile parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.datastream.v1.MysqlProfile parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.datastream.v1.MysqlProfile parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.datastream.v1.MysqlProfile parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.datastream.v1.MysqlProfile parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.datastream.v1.MysqlProfile parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.datastream.v1.MysqlProfile parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.datastream.v1.MysqlProfile parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.datastream.v1.MysqlProfile parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.datastream.v1.MysqlProfile parseFrom(
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

  public static Builder newBuilder(com.google.events.cloud.datastream.v1.MysqlProfile prototype) {
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
   * MySQL database profile.
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.datastream.v1.MysqlProfile}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.datastream.v1.MysqlProfile)
      com.google.events.cloud.datastream.v1.MysqlProfileOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.events.cloud.datastream.v1.Data
          .internal_static_google_events_cloud_datastream_v1_MysqlProfile_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.datastream.v1.Data
          .internal_static_google_events_cloud_datastream_v1_MysqlProfile_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.datastream.v1.MysqlProfile.class,
              com.google.events.cloud.datastream.v1.MysqlProfile.Builder.class);
    }

    // Construct using com.google.events.cloud.datastream.v1.MysqlProfile.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      hostname_ = "";
      port_ = 0;
      username_ = "";
      sslConfig_ = null;
      if (sslConfigBuilder_ != null) {
        sslConfigBuilder_.dispose();
        sslConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.events.cloud.datastream.v1.Data
          .internal_static_google_events_cloud_datastream_v1_MysqlProfile_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.datastream.v1.MysqlProfile getDefaultInstanceForType() {
      return com.google.events.cloud.datastream.v1.MysqlProfile.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.datastream.v1.MysqlProfile build() {
      com.google.events.cloud.datastream.v1.MysqlProfile result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.datastream.v1.MysqlProfile buildPartial() {
      com.google.events.cloud.datastream.v1.MysqlProfile result =
          new com.google.events.cloud.datastream.v1.MysqlProfile(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.events.cloud.datastream.v1.MysqlProfile result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.hostname_ = hostname_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.port_ = port_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.username_ = username_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.sslConfig_ = sslConfigBuilder_ == null ? sslConfig_ : sslConfigBuilder_.build();
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
      if (other instanceof com.google.events.cloud.datastream.v1.MysqlProfile) {
        return mergeFrom((com.google.events.cloud.datastream.v1.MysqlProfile) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.events.cloud.datastream.v1.MysqlProfile other) {
      if (other == com.google.events.cloud.datastream.v1.MysqlProfile.getDefaultInstance())
        return this;
      if (!other.getHostname().isEmpty()) {
        hostname_ = other.hostname_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getPort() != 0) {
        setPort(other.getPort());
      }
      if (!other.getUsername().isEmpty()) {
        username_ = other.username_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.hasSslConfig()) {
        mergeSslConfig(other.getSslConfig());
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
                hostname_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                port_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 26:
              {
                username_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            case 42:
              {
                input.readMessage(getSslConfigFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000008;
                break;
              } // case 42
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

    private java.lang.Object hostname_ = "";

    /**
     *
     *
     * <pre>
     * Required. Hostname for the MySQL connection.
     * </pre>
     *
     * <code>string hostname = 1;</code>
     *
     * @return The hostname.
     */
    public java.lang.String getHostname() {
      java.lang.Object ref = hostname_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hostname_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Hostname for the MySQL connection.
     * </pre>
     *
     * <code>string hostname = 1;</code>
     *
     * @return The bytes for hostname.
     */
    public com.google.protobuf.ByteString getHostnameBytes() {
      java.lang.Object ref = hostname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        hostname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Hostname for the MySQL connection.
     * </pre>
     *
     * <code>string hostname = 1;</code>
     *
     * @param value The hostname to set.
     * @return This builder for chaining.
     */
    public Builder setHostname(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      hostname_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Hostname for the MySQL connection.
     * </pre>
     *
     * <code>string hostname = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearHostname() {
      hostname_ = getDefaultInstance().getHostname();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Hostname for the MySQL connection.
     * </pre>
     *
     * <code>string hostname = 1;</code>
     *
     * @param value The bytes for hostname to set.
     * @return This builder for chaining.
     */
    public Builder setHostnameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      hostname_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int port_;

    /**
     *
     *
     * <pre>
     * Port for the MySQL connection, default value is 3306.
     * </pre>
     *
     * <code>int32 port = 2;</code>
     *
     * @return The port.
     */
    @java.lang.Override
    public int getPort() {
      return port_;
    }

    /**
     *
     *
     * <pre>
     * Port for the MySQL connection, default value is 3306.
     * </pre>
     *
     * <code>int32 port = 2;</code>
     *
     * @param value The port to set.
     * @return This builder for chaining.
     */
    public Builder setPort(int value) {

      port_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Port for the MySQL connection, default value is 3306.
     * </pre>
     *
     * <code>int32 port = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPort() {
      bitField0_ = (bitField0_ & ~0x00000002);
      port_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object username_ = "";

    /**
     *
     *
     * <pre>
     * Required. Username for the MySQL connection.
     * </pre>
     *
     * <code>string username = 3;</code>
     *
     * @return The username.
     */
    public java.lang.String getUsername() {
      java.lang.Object ref = username_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        username_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Username for the MySQL connection.
     * </pre>
     *
     * <code>string username = 3;</code>
     *
     * @return The bytes for username.
     */
    public com.google.protobuf.ByteString getUsernameBytes() {
      java.lang.Object ref = username_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Username for the MySQL connection.
     * </pre>
     *
     * <code>string username = 3;</code>
     *
     * @param value The username to set.
     * @return This builder for chaining.
     */
    public Builder setUsername(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      username_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Username for the MySQL connection.
     * </pre>
     *
     * <code>string username = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUsername() {
      username_ = getDefaultInstance().getUsername();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Username for the MySQL connection.
     * </pre>
     *
     * <code>string username = 3;</code>
     *
     * @param value The bytes for username to set.
     * @return This builder for chaining.
     */
    public Builder setUsernameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      username_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private com.google.events.cloud.datastream.v1.MysqlSslConfig sslConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.events.cloud.datastream.v1.MysqlSslConfig,
            com.google.events.cloud.datastream.v1.MysqlSslConfig.Builder,
            com.google.events.cloud.datastream.v1.MysqlSslConfigOrBuilder>
        sslConfigBuilder_;

    /**
     *
     *
     * <pre>
     * SSL configuration for the MySQL connection.
     * </pre>
     *
     * <code>.google.events.cloud.datastream.v1.MysqlSslConfig ssl_config = 5;</code>
     *
     * @return Whether the sslConfig field is set.
     */
    public boolean hasSslConfig() {
      return ((bitField0_ & 0x00000008) != 0);
    }

    /**
     *
     *
     * <pre>
     * SSL configuration for the MySQL connection.
     * </pre>
     *
     * <code>.google.events.cloud.datastream.v1.MysqlSslConfig ssl_config = 5;</code>
     *
     * @return The sslConfig.
     */
    public com.google.events.cloud.datastream.v1.MysqlSslConfig getSslConfig() {
      if (sslConfigBuilder_ == null) {
        return sslConfig_ == null
            ? com.google.events.cloud.datastream.v1.MysqlSslConfig.getDefaultInstance()
            : sslConfig_;
      } else {
        return sslConfigBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * SSL configuration for the MySQL connection.
     * </pre>
     *
     * <code>.google.events.cloud.datastream.v1.MysqlSslConfig ssl_config = 5;</code>
     */
    public Builder setSslConfig(com.google.events.cloud.datastream.v1.MysqlSslConfig value) {
      if (sslConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sslConfig_ = value;
      } else {
        sslConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * SSL configuration for the MySQL connection.
     * </pre>
     *
     * <code>.google.events.cloud.datastream.v1.MysqlSslConfig ssl_config = 5;</code>
     */
    public Builder setSslConfig(
        com.google.events.cloud.datastream.v1.MysqlSslConfig.Builder builderForValue) {
      if (sslConfigBuilder_ == null) {
        sslConfig_ = builderForValue.build();
      } else {
        sslConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * SSL configuration for the MySQL connection.
     * </pre>
     *
     * <code>.google.events.cloud.datastream.v1.MysqlSslConfig ssl_config = 5;</code>
     */
    public Builder mergeSslConfig(com.google.events.cloud.datastream.v1.MysqlSslConfig value) {
      if (sslConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0)
            && sslConfig_ != null
            && sslConfig_
                != com.google.events.cloud.datastream.v1.MysqlSslConfig.getDefaultInstance()) {
          getSslConfigBuilder().mergeFrom(value);
        } else {
          sslConfig_ = value;
        }
      } else {
        sslConfigBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * SSL configuration for the MySQL connection.
     * </pre>
     *
     * <code>.google.events.cloud.datastream.v1.MysqlSslConfig ssl_config = 5;</code>
     */
    public Builder clearSslConfig() {
      bitField0_ = (bitField0_ & ~0x00000008);
      sslConfig_ = null;
      if (sslConfigBuilder_ != null) {
        sslConfigBuilder_.dispose();
        sslConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * SSL configuration for the MySQL connection.
     * </pre>
     *
     * <code>.google.events.cloud.datastream.v1.MysqlSslConfig ssl_config = 5;</code>
     */
    public com.google.events.cloud.datastream.v1.MysqlSslConfig.Builder getSslConfigBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getSslConfigFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * SSL configuration for the MySQL connection.
     * </pre>
     *
     * <code>.google.events.cloud.datastream.v1.MysqlSslConfig ssl_config = 5;</code>
     */
    public com.google.events.cloud.datastream.v1.MysqlSslConfigOrBuilder getSslConfigOrBuilder() {
      if (sslConfigBuilder_ != null) {
        return sslConfigBuilder_.getMessageOrBuilder();
      } else {
        return sslConfig_ == null
            ? com.google.events.cloud.datastream.v1.MysqlSslConfig.getDefaultInstance()
            : sslConfig_;
      }
    }

    /**
     *
     *
     * <pre>
     * SSL configuration for the MySQL connection.
     * </pre>
     *
     * <code>.google.events.cloud.datastream.v1.MysqlSslConfig ssl_config = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.events.cloud.datastream.v1.MysqlSslConfig,
            com.google.events.cloud.datastream.v1.MysqlSslConfig.Builder,
            com.google.events.cloud.datastream.v1.MysqlSslConfigOrBuilder>
        getSslConfigFieldBuilder() {
      if (sslConfigBuilder_ == null) {
        sslConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.events.cloud.datastream.v1.MysqlSslConfig,
                com.google.events.cloud.datastream.v1.MysqlSslConfig.Builder,
                com.google.events.cloud.datastream.v1.MysqlSslConfigOrBuilder>(
                getSslConfig(), getParentForChildren(), isClean());
        sslConfig_ = null;
      }
      return sslConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.events.cloud.datastream.v1.MysqlProfile)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.datastream.v1.MysqlProfile)
  private static final com.google.events.cloud.datastream.v1.MysqlProfile DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.events.cloud.datastream.v1.MysqlProfile();
  }

  public static com.google.events.cloud.datastream.v1.MysqlProfile getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MysqlProfile> PARSER =
      new com.google.protobuf.AbstractParser<MysqlProfile>() {
        @java.lang.Override
        public MysqlProfile parsePartialFrom(
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

  public static com.google.protobuf.Parser<MysqlProfile> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MysqlProfile> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.datastream.v1.MysqlProfile getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
