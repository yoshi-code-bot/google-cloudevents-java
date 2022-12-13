// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/firebase/analytics/v1/data.proto

package com.google.events.firebase.analytics.v1;

/**
 * <pre>
 * User's geographic informaiton.
 * </pre>
 *
 * Protobuf type {@code google.events.firebase.analytics.v1.GeoInfo}
 */
public final class GeoInfo extends com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:google.events.firebase.analytics.v1.GeoInfo)
        GeoInfoOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use GeoInfo.newBuilder() to construct.
    private GeoInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private GeoInfo() {
        continent_ = "";
        country_ = "";
        region_ = "";
        city_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({ "unused" })
    protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
        return new GeoInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.google.events.firebase.analytics.v1.Data.internal_static_google_events_firebase_analytics_v1_GeoInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.google.events.firebase.analytics.v1.Data.internal_static_google_events_firebase_analytics_v1_GeoInfo_fieldAccessorTable
                .ensureFieldAccessorsInitialized(com.google.events.firebase.analytics.v1.GeoInfo.class,
                        com.google.events.firebase.analytics.v1.GeoInfo.Builder.class);
    }

    public static final int CONTINENT_FIELD_NUMBER = 1;
    private volatile java.lang.Object continent_;

    /**
     * <pre>
     * The geographic continent.
     * Eg. Americas
     * </pre>
     *
     * <code>string continent = 1;</code>
     *
     * @return The continent.
     */
    @java.lang.Override
    public java.lang.String getContinent() {
        java.lang.Object ref = continent_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            continent_ = s;
            return s;
        }
    }

    /**
     * <pre>
     * The geographic continent.
     * Eg. Americas
     * </pre>
     *
     * <code>string continent = 1;</code>
     *
     * @return The bytes for continent.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getContinentBytes() {
        java.lang.Object ref = continent_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
            continent_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    public static final int COUNTRY_FIELD_NUMBER = 2;
    private volatile java.lang.Object country_;

    /**
     * <pre>
     * The geographic country.
     * Eg. Brazil
     * </pre>
     *
     * <code>string country = 2;</code>
     *
     * @return The country.
     */
    @java.lang.Override
    public java.lang.String getCountry() {
        java.lang.Object ref = country_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            country_ = s;
            return s;
        }
    }

    /**
     * <pre>
     * The geographic country.
     * Eg. Brazil
     * </pre>
     *
     * <code>string country = 2;</code>
     *
     * @return The bytes for country.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getCountryBytes() {
        java.lang.Object ref = country_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
            country_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    public static final int REGION_FIELD_NUMBER = 3;
    private volatile java.lang.Object region_;

    /**
     * <pre>
     * The geographic region.
     * Eg. State of Sao Paulo
     * </pre>
     *
     * <code>string region = 3;</code>
     *
     * @return The region.
     */
    @java.lang.Override
    public java.lang.String getRegion() {
        java.lang.Object ref = region_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            region_ = s;
            return s;
        }
    }

    /**
     * <pre>
     * The geographic region.
     * Eg. State of Sao Paulo
     * </pre>
     *
     * <code>string region = 3;</code>
     *
     * @return The bytes for region.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getRegionBytes() {
        java.lang.Object ref = region_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
            region_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    public static final int CITY_FIELD_NUMBER = 4;
    private volatile java.lang.Object city_;

    /**
     * <pre>
     * The geographic city.
     * Eg. Sao Paulo
     * </pre>
     *
     * <code>string city = 4;</code>
     *
     * @return The city.
     */
    @java.lang.Override
    public java.lang.String getCity() {
        java.lang.Object ref = city_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            city_ = s;
            return s;
        }
    }

    /**
     * <pre>
     * The geographic city.
     * Eg. Sao Paulo
     * </pre>
     *
     * <code>string city = 4;</code>
     *
     * @return The bytes for city.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getCityBytes() {
        java.lang.Object ref = city_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
            city_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1)
            return true;
        if (isInitialized == 0)
            return false;

        memoizedIsInitialized = 1;
        return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(continent_)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 1, continent_);
        }
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(country_)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 2, country_);
        }
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(region_)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 3, region_);
        }
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(city_)) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 4, city_);
        }
        getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1)
            return size;

        size = 0;
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(continent_)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, continent_);
        }
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(country_)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, country_);
        }
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(region_)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, region_);
        }
        if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(city_)) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, city_);
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
        if (!(obj instanceof com.google.events.firebase.analytics.v1.GeoInfo)) {
            return super.equals(obj);
        }
        com.google.events.firebase.analytics.v1.GeoInfo other = (com.google.events.firebase.analytics.v1.GeoInfo) obj;

        if (!getContinent().equals(other.getContinent()))
            return false;
        if (!getCountry().equals(other.getCountry()))
            return false;
        if (!getRegion().equals(other.getRegion()))
            return false;
        if (!getCity().equals(other.getCity()))
            return false;
        if (!getUnknownFields().equals(other.getUnknownFields()))
            return false;
        return true;
    }

    @java.lang.Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        hash = (37 * hash) + CONTINENT_FIELD_NUMBER;
        hash = (53 * hash) + getContinent().hashCode();
        hash = (37 * hash) + COUNTRY_FIELD_NUMBER;
        hash = (53 * hash) + getCountry().hashCode();
        hash = (37 * hash) + REGION_FIELD_NUMBER;
        hash = (53 * hash) + getRegion().hashCode();
        hash = (37 * hash) + CITY_FIELD_NUMBER;
        hash = (53 * hash) + getCity().hashCode();
        hash = (29 * hash) + getUnknownFields().hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static com.google.events.firebase.analytics.v1.GeoInfo parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.google.events.firebase.analytics.v1.GeoInfo parseFrom(java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.events.firebase.analytics.v1.GeoInfo parseFrom(com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.google.events.firebase.analytics.v1.GeoInfo parseFrom(com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.events.firebase.analytics.v1.GeoInfo parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.google.events.firebase.analytics.v1.GeoInfo parseFrom(byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.events.firebase.analytics.v1.GeoInfo parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.google.events.firebase.analytics.v1.GeoInfo parseFrom(java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.google.events.firebase.analytics.v1.GeoInfo parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.google.events.firebase.analytics.v1.GeoInfo parseDelimitedFrom(java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.google.events.firebase.analytics.v1.GeoInfo parseFrom(com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.google.events.firebase.analytics.v1.GeoInfo parseFrom(com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.google.events.firebase.analytics.v1.GeoInfo prototype) {
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
     * <pre>
     * User's geographic informaiton.
     * </pre>
     *
     * Protobuf type {@code google.events.firebase.analytics.v1.GeoInfo}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:google.events.firebase.analytics.v1.GeoInfo)
            com.google.events.firebase.analytics.v1.GeoInfoOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return com.google.events.firebase.analytics.v1.Data.internal_static_google_events_firebase_analytics_v1_GeoInfo_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return com.google.events.firebase.analytics.v1.Data.internal_static_google_events_firebase_analytics_v1_GeoInfo_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(com.google.events.firebase.analytics.v1.GeoInfo.class,
                            com.google.events.firebase.analytics.v1.GeoInfo.Builder.class);
        }

        // Construct using com.google.events.firebase.analytics.v1.GeoInfo.newBuilder()
        private Builder() {

        }

        private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            super(parent);

        }

        @java.lang.Override
        public Builder clear() {
            super.clear();
            continent_ = "";

            country_ = "";

            region_ = "";

            city_ = "";

            return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
            return com.google.events.firebase.analytics.v1.Data.internal_static_google_events_firebase_analytics_v1_GeoInfo_descriptor;
        }

        @java.lang.Override
        public com.google.events.firebase.analytics.v1.GeoInfo getDefaultInstanceForType() {
            return com.google.events.firebase.analytics.v1.GeoInfo.getDefaultInstance();
        }

        @java.lang.Override
        public com.google.events.firebase.analytics.v1.GeoInfo build() {
            com.google.events.firebase.analytics.v1.GeoInfo result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @java.lang.Override
        public com.google.events.firebase.analytics.v1.GeoInfo buildPartial() {
            com.google.events.firebase.analytics.v1.GeoInfo result = new com.google.events.firebase.analytics.v1.GeoInfo(
                    this);
            result.continent_ = continent_;
            result.country_ = country_;
            result.region_ = region_;
            result.city_ = city_;
            onBuilt();
            return result;
        }

        @java.lang.Override
        public Builder clone() {
            return super.clone();
        }

        @java.lang.Override
        public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
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
        public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index,
                java.lang.Object value) {
            return super.setRepeatedField(field, index, value);
        }

        @java.lang.Override
        public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
            return super.addRepeatedField(field, value);
        }

        @java.lang.Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof com.google.events.firebase.analytics.v1.GeoInfo) {
                return mergeFrom((com.google.events.firebase.analytics.v1.GeoInfo) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(com.google.events.firebase.analytics.v1.GeoInfo other) {
            if (other == com.google.events.firebase.analytics.v1.GeoInfo.getDefaultInstance())
                return this;
            if (!other.getContinent().isEmpty()) {
                continent_ = other.continent_;
                onChanged();
            }
            if (!other.getCountry().isEmpty()) {
                country_ = other.country_;
                onChanged();
            }
            if (!other.getRegion().isEmpty()) {
                region_ = other.region_;
                onChanged();
            }
            if (!other.getCity().isEmpty()) {
                city_ = other.city_;
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
        public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
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
                        continent_ = input.readStringRequireUtf8();

                        break;
                    } // case 10
                    case 18: {
                        country_ = input.readStringRequireUtf8();

                        break;
                    } // case 18
                    case 26: {
                        region_ = input.readStringRequireUtf8();

                        break;
                    } // case 26
                    case 34: {
                        city_ = input.readStringRequireUtf8();

                        break;
                    } // case 34
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

        private java.lang.Object continent_ = "";

        /**
         * <pre>
         * The geographic continent.
         * Eg. Americas
         * </pre>
         *
         * <code>string continent = 1;</code>
         *
         * @return The continent.
         */
        public java.lang.String getContinent() {
            java.lang.Object ref = continent_;
            if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                continent_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }

        /**
         * <pre>
         * The geographic continent.
         * Eg. Americas
         * </pre>
         *
         * <code>string continent = 1;</code>
         *
         * @return The bytes for continent.
         */
        public com.google.protobuf.ByteString getContinentBytes() {
            java.lang.Object ref = continent_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
                continent_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <pre>
         * The geographic continent.
         * Eg. Americas
         * </pre>
         *
         * <code>string continent = 1;</code>
         *
         * @param value
         *            The continent to set.
         *
         * @return This builder for chaining.
         */
        public Builder setContinent(java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }

            continent_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * The geographic continent.
         * Eg. Americas
         * </pre>
         *
         * <code>string continent = 1;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearContinent() {

            continent_ = getDefaultInstance().getContinent();
            onChanged();
            return this;
        }

        /**
         * <pre>
         * The geographic continent.
         * Eg. Americas
         * </pre>
         *
         * <code>string continent = 1;</code>
         *
         * @param value
         *            The bytes for continent to set.
         *
         * @return This builder for chaining.
         */
        public Builder setContinentBytes(com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);

            continent_ = value;
            onChanged();
            return this;
        }

        private java.lang.Object country_ = "";

        /**
         * <pre>
         * The geographic country.
         * Eg. Brazil
         * </pre>
         *
         * <code>string country = 2;</code>
         *
         * @return The country.
         */
        public java.lang.String getCountry() {
            java.lang.Object ref = country_;
            if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                country_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }

        /**
         * <pre>
         * The geographic country.
         * Eg. Brazil
         * </pre>
         *
         * <code>string country = 2;</code>
         *
         * @return The bytes for country.
         */
        public com.google.protobuf.ByteString getCountryBytes() {
            java.lang.Object ref = country_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
                country_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <pre>
         * The geographic country.
         * Eg. Brazil
         * </pre>
         *
         * <code>string country = 2;</code>
         *
         * @param value
         *            The country to set.
         *
         * @return This builder for chaining.
         */
        public Builder setCountry(java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }

            country_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * The geographic country.
         * Eg. Brazil
         * </pre>
         *
         * <code>string country = 2;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearCountry() {

            country_ = getDefaultInstance().getCountry();
            onChanged();
            return this;
        }

        /**
         * <pre>
         * The geographic country.
         * Eg. Brazil
         * </pre>
         *
         * <code>string country = 2;</code>
         *
         * @param value
         *            The bytes for country to set.
         *
         * @return This builder for chaining.
         */
        public Builder setCountryBytes(com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);

            country_ = value;
            onChanged();
            return this;
        }

        private java.lang.Object region_ = "";

        /**
         * <pre>
         * The geographic region.
         * Eg. State of Sao Paulo
         * </pre>
         *
         * <code>string region = 3;</code>
         *
         * @return The region.
         */
        public java.lang.String getRegion() {
            java.lang.Object ref = region_;
            if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                region_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }

        /**
         * <pre>
         * The geographic region.
         * Eg. State of Sao Paulo
         * </pre>
         *
         * <code>string region = 3;</code>
         *
         * @return The bytes for region.
         */
        public com.google.protobuf.ByteString getRegionBytes() {
            java.lang.Object ref = region_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
                region_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <pre>
         * The geographic region.
         * Eg. State of Sao Paulo
         * </pre>
         *
         * <code>string region = 3;</code>
         *
         * @param value
         *            The region to set.
         *
         * @return This builder for chaining.
         */
        public Builder setRegion(java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }

            region_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * The geographic region.
         * Eg. State of Sao Paulo
         * </pre>
         *
         * <code>string region = 3;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearRegion() {

            region_ = getDefaultInstance().getRegion();
            onChanged();
            return this;
        }

        /**
         * <pre>
         * The geographic region.
         * Eg. State of Sao Paulo
         * </pre>
         *
         * <code>string region = 3;</code>
         *
         * @param value
         *            The bytes for region to set.
         *
         * @return This builder for chaining.
         */
        public Builder setRegionBytes(com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);

            region_ = value;
            onChanged();
            return this;
        }

        private java.lang.Object city_ = "";

        /**
         * <pre>
         * The geographic city.
         * Eg. Sao Paulo
         * </pre>
         *
         * <code>string city = 4;</code>
         *
         * @return The city.
         */
        public java.lang.String getCity() {
            java.lang.Object ref = city_;
            if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                city_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }

        /**
         * <pre>
         * The geographic city.
         * Eg. Sao Paulo
         * </pre>
         *
         * <code>string city = 4;</code>
         *
         * @return The bytes for city.
         */
        public com.google.protobuf.ByteString getCityBytes() {
            java.lang.Object ref = city_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
                city_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <pre>
         * The geographic city.
         * Eg. Sao Paulo
         * </pre>
         *
         * <code>string city = 4;</code>
         *
         * @param value
         *            The city to set.
         *
         * @return This builder for chaining.
         */
        public Builder setCity(java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }

            city_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * The geographic city.
         * Eg. Sao Paulo
         * </pre>
         *
         * <code>string city = 4;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearCity() {

            city_ = getDefaultInstance().getCity();
            onChanged();
            return this;
        }

        /**
         * <pre>
         * The geographic city.
         * Eg. Sao Paulo
         * </pre>
         *
         * <code>string city = 4;</code>
         *
         * @param value
         *            The bytes for city to set.
         *
         * @return This builder for chaining.
         */
        public Builder setCityBytes(com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);

            city_ = value;
            onChanged();
            return this;
        }

        @java.lang.Override
        public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.setUnknownFields(unknownFields);
        }

        @java.lang.Override
        public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.mergeUnknownFields(unknownFields);
        }

        // @@protoc_insertion_point(builder_scope:google.events.firebase.analytics.v1.GeoInfo)
    }

    // @@protoc_insertion_point(class_scope:google.events.firebase.analytics.v1.GeoInfo)
    private static final com.google.events.firebase.analytics.v1.GeoInfo DEFAULT_INSTANCE;
    static {
        DEFAULT_INSTANCE = new com.google.events.firebase.analytics.v1.GeoInfo();
    }

    public static com.google.events.firebase.analytics.v1.GeoInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GeoInfo> PARSER = new com.google.protobuf.AbstractParser<GeoInfo>() {
        @java.lang.Override
        public GeoInfo parsePartialFrom(com.google.protobuf.CodedInputStream input,
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

    public static com.google.protobuf.Parser<GeoInfo> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GeoInfo> getParserForType() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.events.firebase.analytics.v1.GeoInfo getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}
