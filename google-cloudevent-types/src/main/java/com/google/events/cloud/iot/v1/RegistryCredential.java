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
// source: google/events/cloud/iot/v1/data.proto

package com.google.events.cloud.iot.v1;

/**
 *
 *
 * <pre>
 * A server-stored registry credential used to validate device credentials.
 * </pre>
 *
 * Protobuf type {@code google.events.cloud.iot.v1.RegistryCredential}
 */
public final class RegistryCredential extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.events.cloud.iot.v1.RegistryCredential)
    RegistryCredentialOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use RegistryCredential.newBuilder() to construct.
  private RegistryCredential(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RegistryCredential() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RegistryCredential();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.events.cloud.iot.v1.Data
        .internal_static_google_events_cloud_iot_v1_RegistryCredential_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.events.cloud.iot.v1.Data
        .internal_static_google_events_cloud_iot_v1_RegistryCredential_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.events.cloud.iot.v1.RegistryCredential.class,
            com.google.events.cloud.iot.v1.RegistryCredential.Builder.class);
  }

  private int credentialCase_ = 0;
  private java.lang.Object credential_;

  public enum CredentialCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    PUBLIC_KEY_CERTIFICATE(1),
    CREDENTIAL_NOT_SET(0);
    private final int value;

    private CredentialCase(int value) {
      this.value = value;
    }

    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static CredentialCase valueOf(int value) {
      return forNumber(value);
    }

    public static CredentialCase forNumber(int value) {
      switch (value) {
        case 1:
          return PUBLIC_KEY_CERTIFICATE;
        case 0:
          return CREDENTIAL_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public CredentialCase getCredentialCase() {
    return CredentialCase.forNumber(credentialCase_);
  }

  public static final int PUBLIC_KEY_CERTIFICATE_FIELD_NUMBER = 1;

  /**
   *
   *
   * <pre>
   * A public key certificate used to verify the device credentials.
   * </pre>
   *
   * <code>.google.events.cloud.iot.v1.PublicKeyCertificate public_key_certificate = 1;</code>
   *
   * @return Whether the publicKeyCertificate field is set.
   */
  @java.lang.Override
  public boolean hasPublicKeyCertificate() {
    return credentialCase_ == 1;
  }

  /**
   *
   *
   * <pre>
   * A public key certificate used to verify the device credentials.
   * </pre>
   *
   * <code>.google.events.cloud.iot.v1.PublicKeyCertificate public_key_certificate = 1;</code>
   *
   * @return The publicKeyCertificate.
   */
  @java.lang.Override
  public com.google.events.cloud.iot.v1.PublicKeyCertificate getPublicKeyCertificate() {
    if (credentialCase_ == 1) {
      return (com.google.events.cloud.iot.v1.PublicKeyCertificate) credential_;
    }
    return com.google.events.cloud.iot.v1.PublicKeyCertificate.getDefaultInstance();
  }

  /**
   *
   *
   * <pre>
   * A public key certificate used to verify the device credentials.
   * </pre>
   *
   * <code>.google.events.cloud.iot.v1.PublicKeyCertificate public_key_certificate = 1;</code>
   */
  @java.lang.Override
  public com.google.events.cloud.iot.v1.PublicKeyCertificateOrBuilder
      getPublicKeyCertificateOrBuilder() {
    if (credentialCase_ == 1) {
      return (com.google.events.cloud.iot.v1.PublicKeyCertificate) credential_;
    }
    return com.google.events.cloud.iot.v1.PublicKeyCertificate.getDefaultInstance();
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
    if (credentialCase_ == 1) {
      output.writeMessage(1, (com.google.events.cloud.iot.v1.PublicKeyCertificate) credential_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (credentialCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.events.cloud.iot.v1.PublicKeyCertificate) credential_);
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
    if (!(obj instanceof com.google.events.cloud.iot.v1.RegistryCredential)) {
      return super.equals(obj);
    }
    com.google.events.cloud.iot.v1.RegistryCredential other =
        (com.google.events.cloud.iot.v1.RegistryCredential) obj;

    if (!getCredentialCase().equals(other.getCredentialCase())) return false;
    switch (credentialCase_) {
      case 1:
        if (!getPublicKeyCertificate().equals(other.getPublicKeyCertificate())) return false;
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
    switch (credentialCase_) {
      case 1:
        hash = (37 * hash) + PUBLIC_KEY_CERTIFICATE_FIELD_NUMBER;
        hash = (53 * hash) + getPublicKeyCertificate().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.events.cloud.iot.v1.RegistryCredential parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.iot.v1.RegistryCredential parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.iot.v1.RegistryCredential parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.iot.v1.RegistryCredential parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.iot.v1.RegistryCredential parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.events.cloud.iot.v1.RegistryCredential parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.events.cloud.iot.v1.RegistryCredential parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.iot.v1.RegistryCredential parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.iot.v1.RegistryCredential parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.iot.v1.RegistryCredential parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.events.cloud.iot.v1.RegistryCredential parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.events.cloud.iot.v1.RegistryCredential parseFrom(
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

  public static Builder newBuilder(com.google.events.cloud.iot.v1.RegistryCredential prototype) {
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
   * A server-stored registry credential used to validate device credentials.
   * </pre>
   *
   * Protobuf type {@code google.events.cloud.iot.v1.RegistryCredential}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.events.cloud.iot.v1.RegistryCredential)
      com.google.events.cloud.iot.v1.RegistryCredentialOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.events.cloud.iot.v1.Data
          .internal_static_google_events_cloud_iot_v1_RegistryCredential_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.events.cloud.iot.v1.Data
          .internal_static_google_events_cloud_iot_v1_RegistryCredential_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.events.cloud.iot.v1.RegistryCredential.class,
              com.google.events.cloud.iot.v1.RegistryCredential.Builder.class);
    }

    // Construct using com.google.events.cloud.iot.v1.RegistryCredential.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (publicKeyCertificateBuilder_ != null) {
        publicKeyCertificateBuilder_.clear();
      }
      credentialCase_ = 0;
      credential_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.events.cloud.iot.v1.Data
          .internal_static_google_events_cloud_iot_v1_RegistryCredential_descriptor;
    }

    @java.lang.Override
    public com.google.events.cloud.iot.v1.RegistryCredential getDefaultInstanceForType() {
      return com.google.events.cloud.iot.v1.RegistryCredential.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.events.cloud.iot.v1.RegistryCredential build() {
      com.google.events.cloud.iot.v1.RegistryCredential result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.events.cloud.iot.v1.RegistryCredential buildPartial() {
      com.google.events.cloud.iot.v1.RegistryCredential result =
          new com.google.events.cloud.iot.v1.RegistryCredential(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.events.cloud.iot.v1.RegistryCredential result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.events.cloud.iot.v1.RegistryCredential result) {
      result.credentialCase_ = credentialCase_;
      result.credential_ = this.credential_;
      if (credentialCase_ == 1 && publicKeyCertificateBuilder_ != null) {
        result.credential_ = publicKeyCertificateBuilder_.build();
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
      if (other instanceof com.google.events.cloud.iot.v1.RegistryCredential) {
        return mergeFrom((com.google.events.cloud.iot.v1.RegistryCredential) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.events.cloud.iot.v1.RegistryCredential other) {
      if (other == com.google.events.cloud.iot.v1.RegistryCredential.getDefaultInstance())
        return this;
      switch (other.getCredentialCase()) {
        case PUBLIC_KEY_CERTIFICATE:
          {
            mergePublicKeyCertificate(other.getPublicKeyCertificate());
            break;
          }
        case CREDENTIAL_NOT_SET:
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
                input.readMessage(
                    getPublicKeyCertificateFieldBuilder().getBuilder(), extensionRegistry);
                credentialCase_ = 1;
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

    private int credentialCase_ = 0;
    private java.lang.Object credential_;

    public CredentialCase getCredentialCase() {
      return CredentialCase.forNumber(credentialCase_);
    }

    public Builder clearCredential() {
      credentialCase_ = 0;
      credential_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.events.cloud.iot.v1.PublicKeyCertificate,
            com.google.events.cloud.iot.v1.PublicKeyCertificate.Builder,
            com.google.events.cloud.iot.v1.PublicKeyCertificateOrBuilder>
        publicKeyCertificateBuilder_;

    /**
     *
     *
     * <pre>
     * A public key certificate used to verify the device credentials.
     * </pre>
     *
     * <code>.google.events.cloud.iot.v1.PublicKeyCertificate public_key_certificate = 1;</code>
     *
     * @return Whether the publicKeyCertificate field is set.
     */
    @java.lang.Override
    public boolean hasPublicKeyCertificate() {
      return credentialCase_ == 1;
    }

    /**
     *
     *
     * <pre>
     * A public key certificate used to verify the device credentials.
     * </pre>
     *
     * <code>.google.events.cloud.iot.v1.PublicKeyCertificate public_key_certificate = 1;</code>
     *
     * @return The publicKeyCertificate.
     */
    @java.lang.Override
    public com.google.events.cloud.iot.v1.PublicKeyCertificate getPublicKeyCertificate() {
      if (publicKeyCertificateBuilder_ == null) {
        if (credentialCase_ == 1) {
          return (com.google.events.cloud.iot.v1.PublicKeyCertificate) credential_;
        }
        return com.google.events.cloud.iot.v1.PublicKeyCertificate.getDefaultInstance();
      } else {
        if (credentialCase_ == 1) {
          return publicKeyCertificateBuilder_.getMessage();
        }
        return com.google.events.cloud.iot.v1.PublicKeyCertificate.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * A public key certificate used to verify the device credentials.
     * </pre>
     *
     * <code>.google.events.cloud.iot.v1.PublicKeyCertificate public_key_certificate = 1;</code>
     */
    public Builder setPublicKeyCertificate(
        com.google.events.cloud.iot.v1.PublicKeyCertificate value) {
      if (publicKeyCertificateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        credential_ = value;
        onChanged();
      } else {
        publicKeyCertificateBuilder_.setMessage(value);
      }
      credentialCase_ = 1;
      return this;
    }

    /**
     *
     *
     * <pre>
     * A public key certificate used to verify the device credentials.
     * </pre>
     *
     * <code>.google.events.cloud.iot.v1.PublicKeyCertificate public_key_certificate = 1;</code>
     */
    public Builder setPublicKeyCertificate(
        com.google.events.cloud.iot.v1.PublicKeyCertificate.Builder builderForValue) {
      if (publicKeyCertificateBuilder_ == null) {
        credential_ = builderForValue.build();
        onChanged();
      } else {
        publicKeyCertificateBuilder_.setMessage(builderForValue.build());
      }
      credentialCase_ = 1;
      return this;
    }

    /**
     *
     *
     * <pre>
     * A public key certificate used to verify the device credentials.
     * </pre>
     *
     * <code>.google.events.cloud.iot.v1.PublicKeyCertificate public_key_certificate = 1;</code>
     */
    public Builder mergePublicKeyCertificate(
        com.google.events.cloud.iot.v1.PublicKeyCertificate value) {
      if (publicKeyCertificateBuilder_ == null) {
        if (credentialCase_ == 1
            && credential_
                != com.google.events.cloud.iot.v1.PublicKeyCertificate.getDefaultInstance()) {
          credential_ =
              com.google.events.cloud.iot.v1.PublicKeyCertificate.newBuilder(
                      (com.google.events.cloud.iot.v1.PublicKeyCertificate) credential_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          credential_ = value;
        }
        onChanged();
      } else {
        if (credentialCase_ == 1) {
          publicKeyCertificateBuilder_.mergeFrom(value);
        } else {
          publicKeyCertificateBuilder_.setMessage(value);
        }
      }
      credentialCase_ = 1;
      return this;
    }

    /**
     *
     *
     * <pre>
     * A public key certificate used to verify the device credentials.
     * </pre>
     *
     * <code>.google.events.cloud.iot.v1.PublicKeyCertificate public_key_certificate = 1;</code>
     */
    public Builder clearPublicKeyCertificate() {
      if (publicKeyCertificateBuilder_ == null) {
        if (credentialCase_ == 1) {
          credentialCase_ = 0;
          credential_ = null;
          onChanged();
        }
      } else {
        if (credentialCase_ == 1) {
          credentialCase_ = 0;
          credential_ = null;
        }
        publicKeyCertificateBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A public key certificate used to verify the device credentials.
     * </pre>
     *
     * <code>.google.events.cloud.iot.v1.PublicKeyCertificate public_key_certificate = 1;</code>
     */
    public com.google.events.cloud.iot.v1.PublicKeyCertificate.Builder
        getPublicKeyCertificateBuilder() {
      return getPublicKeyCertificateFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * A public key certificate used to verify the device credentials.
     * </pre>
     *
     * <code>.google.events.cloud.iot.v1.PublicKeyCertificate public_key_certificate = 1;</code>
     */
    @java.lang.Override
    public com.google.events.cloud.iot.v1.PublicKeyCertificateOrBuilder
        getPublicKeyCertificateOrBuilder() {
      if ((credentialCase_ == 1) && (publicKeyCertificateBuilder_ != null)) {
        return publicKeyCertificateBuilder_.getMessageOrBuilder();
      } else {
        if (credentialCase_ == 1) {
          return (com.google.events.cloud.iot.v1.PublicKeyCertificate) credential_;
        }
        return com.google.events.cloud.iot.v1.PublicKeyCertificate.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * A public key certificate used to verify the device credentials.
     * </pre>
     *
     * <code>.google.events.cloud.iot.v1.PublicKeyCertificate public_key_certificate = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.events.cloud.iot.v1.PublicKeyCertificate,
            com.google.events.cloud.iot.v1.PublicKeyCertificate.Builder,
            com.google.events.cloud.iot.v1.PublicKeyCertificateOrBuilder>
        getPublicKeyCertificateFieldBuilder() {
      if (publicKeyCertificateBuilder_ == null) {
        if (!(credentialCase_ == 1)) {
          credential_ = com.google.events.cloud.iot.v1.PublicKeyCertificate.getDefaultInstance();
        }
        publicKeyCertificateBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.events.cloud.iot.v1.PublicKeyCertificate,
                com.google.events.cloud.iot.v1.PublicKeyCertificate.Builder,
                com.google.events.cloud.iot.v1.PublicKeyCertificateOrBuilder>(
                (com.google.events.cloud.iot.v1.PublicKeyCertificate) credential_,
                getParentForChildren(),
                isClean());
        credential_ = null;
      }
      credentialCase_ = 1;
      onChanged();
      return publicKeyCertificateBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.events.cloud.iot.v1.RegistryCredential)
  }

  // @@protoc_insertion_point(class_scope:google.events.cloud.iot.v1.RegistryCredential)
  private static final com.google.events.cloud.iot.v1.RegistryCredential DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.events.cloud.iot.v1.RegistryCredential();
  }

  public static com.google.events.cloud.iot.v1.RegistryCredential getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RegistryCredential> PARSER =
      new com.google.protobuf.AbstractParser<RegistryCredential>() {
        @java.lang.Override
        public RegistryCredential parsePartialFrom(
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

  public static com.google.protobuf.Parser<RegistryCredential> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RegistryCredential> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.events.cloud.iot.v1.RegistryCredential getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
