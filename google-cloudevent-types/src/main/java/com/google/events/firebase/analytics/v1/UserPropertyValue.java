// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/firebase/analytics/v1/data.proto

package com.google.events.firebase.analytics.v1;

/**
 * <pre>
 * Predefined (eg: LTV) or custom properties (eg: birthday) stored on client
 * side and associated with subsequent HitBundles.
 * </pre>
 *
 * Protobuf type {@code google.events.firebase.analytics.v1.UserPropertyValue}
 */
public final class UserPropertyValue extends com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:google.events.firebase.analytics.v1.UserPropertyValue)
        UserPropertyValueOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use UserPropertyValue.newBuilder() to construct.
    private UserPropertyValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private UserPropertyValue() {
    }

    @java.lang.Override
    @SuppressWarnings({ "unused" })
    protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
        return new UserPropertyValue();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.google.events.firebase.analytics.v1.Data.internal_static_google_events_firebase_analytics_v1_UserPropertyValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.google.events.firebase.analytics.v1.Data.internal_static_google_events_firebase_analytics_v1_UserPropertyValue_fieldAccessorTable
                .ensureFieldAccessorsInitialized(com.google.events.firebase.analytics.v1.UserPropertyValue.class,
                        com.google.events.firebase.analytics.v1.UserPropertyValue.Builder.class);
    }

    public static final int VALUE_FIELD_NUMBER = 1;
    private com.google.events.firebase.analytics.v1.AnalyticsValue value_;

    /**
     * <pre>
     * Last set value of user property.
     * </pre>
     *
     * <code>.google.events.firebase.analytics.v1.AnalyticsValue value = 1;</code>
     *
     * @return Whether the value field is set.
     */
    @java.lang.Override
    public boolean hasValue() {
        return value_ != null;
    }

    /**
     * <pre>
     * Last set value of user property.
     * </pre>
     *
     * <code>.google.events.firebase.analytics.v1.AnalyticsValue value = 1;</code>
     *
     * @return The value.
     */
    @java.lang.Override
    public com.google.events.firebase.analytics.v1.AnalyticsValue getValue() {
        return value_ == null ? com.google.events.firebase.analytics.v1.AnalyticsValue.getDefaultInstance() : value_;
    }

    /**
     * <pre>
     * Last set value of user property.
     * </pre>
     *
     * <code>.google.events.firebase.analytics.v1.AnalyticsValue value = 1;</code>
     */
    @java.lang.Override
    public com.google.events.firebase.analytics.v1.AnalyticsValueOrBuilder getValueOrBuilder() {
        return getValue();
    }

    public static final int SET_TIMESTAMP_USEC_FIELD_NUMBER = 2;
    private long setTimestampUsec_;

    /**
     * <pre>
     * UTC client time when user property was last set.
     * </pre>
     *
     * <code>int64 set_timestamp_usec = 2;</code>
     *
     * @return The setTimestampUsec.
     */
    @java.lang.Override
    public long getSetTimestampUsec() {
        return setTimestampUsec_;
    }

    public static final int INDEX_FIELD_NUMBER = 3;
    private int index_;

    /**
     * <pre>
     * Index for user property (one-based).
     * </pre>
     *
     * <code>int32 index = 3;</code>
     *
     * @return The index.
     */
    @java.lang.Override
    public int getIndex() {
        return index_;
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
        if (value_ != null) {
            output.writeMessage(1, getValue());
        }
        if (setTimestampUsec_ != 0L) {
            output.writeInt64(2, setTimestampUsec_);
        }
        if (index_ != 0) {
            output.writeInt32(3, index_);
        }
        getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1)
            return size;

        size = 0;
        if (value_ != null) {
            size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getValue());
        }
        if (setTimestampUsec_ != 0L) {
            size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, setTimestampUsec_);
        }
        if (index_ != 0) {
            size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, index_);
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
        if (!(obj instanceof com.google.events.firebase.analytics.v1.UserPropertyValue)) {
            return super.equals(obj);
        }
        com.google.events.firebase.analytics.v1.UserPropertyValue other = (com.google.events.firebase.analytics.v1.UserPropertyValue) obj;

        if (hasValue() != other.hasValue())
            return false;
        if (hasValue()) {
            if (!getValue().equals(other.getValue()))
                return false;
        }
        if (getSetTimestampUsec() != other.getSetTimestampUsec())
            return false;
        if (getIndex() != other.getIndex())
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
        if (hasValue()) {
            hash = (37 * hash) + VALUE_FIELD_NUMBER;
            hash = (53 * hash) + getValue().hashCode();
        }
        hash = (37 * hash) + SET_TIMESTAMP_USEC_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getSetTimestampUsec());
        hash = (37 * hash) + INDEX_FIELD_NUMBER;
        hash = (53 * hash) + getIndex();
        hash = (29 * hash) + getUnknownFields().hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static com.google.events.firebase.analytics.v1.UserPropertyValue parseFrom(java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.google.events.firebase.analytics.v1.UserPropertyValue parseFrom(java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.events.firebase.analytics.v1.UserPropertyValue parseFrom(
            com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.google.events.firebase.analytics.v1.UserPropertyValue parseFrom(
            com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.events.firebase.analytics.v1.UserPropertyValue parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.google.events.firebase.analytics.v1.UserPropertyValue parseFrom(byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.events.firebase.analytics.v1.UserPropertyValue parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.google.events.firebase.analytics.v1.UserPropertyValue parseFrom(java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.google.events.firebase.analytics.v1.UserPropertyValue parseDelimitedFrom(
            java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.google.events.firebase.analytics.v1.UserPropertyValue parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.google.events.firebase.analytics.v1.UserPropertyValue parseFrom(
            com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.google.events.firebase.analytics.v1.UserPropertyValue parseFrom(
            com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.google.events.firebase.analytics.v1.UserPropertyValue prototype) {
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
     * Predefined (eg: LTV) or custom properties (eg: birthday) stored on client
     * side and associated with subsequent HitBundles.
     * </pre>
     *
     * Protobuf type {@code google.events.firebase.analytics.v1.UserPropertyValue}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:google.events.firebase.analytics.v1.UserPropertyValue)
            com.google.events.firebase.analytics.v1.UserPropertyValueOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return com.google.events.firebase.analytics.v1.Data.internal_static_google_events_firebase_analytics_v1_UserPropertyValue_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return com.google.events.firebase.analytics.v1.Data.internal_static_google_events_firebase_analytics_v1_UserPropertyValue_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(com.google.events.firebase.analytics.v1.UserPropertyValue.class,
                            com.google.events.firebase.analytics.v1.UserPropertyValue.Builder.class);
        }

        // Construct using com.google.events.firebase.analytics.v1.UserPropertyValue.newBuilder()
        private Builder() {

        }

        private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            super(parent);

        }

        @java.lang.Override
        public Builder clear() {
            super.clear();
            if (valueBuilder_ == null) {
                value_ = null;
            } else {
                value_ = null;
                valueBuilder_ = null;
            }
            setTimestampUsec_ = 0L;

            index_ = 0;

            return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
            return com.google.events.firebase.analytics.v1.Data.internal_static_google_events_firebase_analytics_v1_UserPropertyValue_descriptor;
        }

        @java.lang.Override
        public com.google.events.firebase.analytics.v1.UserPropertyValue getDefaultInstanceForType() {
            return com.google.events.firebase.analytics.v1.UserPropertyValue.getDefaultInstance();
        }

        @java.lang.Override
        public com.google.events.firebase.analytics.v1.UserPropertyValue build() {
            com.google.events.firebase.analytics.v1.UserPropertyValue result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @java.lang.Override
        public com.google.events.firebase.analytics.v1.UserPropertyValue buildPartial() {
            com.google.events.firebase.analytics.v1.UserPropertyValue result = new com.google.events.firebase.analytics.v1.UserPropertyValue(
                    this);
            if (valueBuilder_ == null) {
                result.value_ = value_;
            } else {
                result.value_ = valueBuilder_.build();
            }
            result.setTimestampUsec_ = setTimestampUsec_;
            result.index_ = index_;
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
            if (other instanceof com.google.events.firebase.analytics.v1.UserPropertyValue) {
                return mergeFrom((com.google.events.firebase.analytics.v1.UserPropertyValue) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(com.google.events.firebase.analytics.v1.UserPropertyValue other) {
            if (other == com.google.events.firebase.analytics.v1.UserPropertyValue.getDefaultInstance())
                return this;
            if (other.hasValue()) {
                mergeValue(other.getValue());
            }
            if (other.getSetTimestampUsec() != 0L) {
                setSetTimestampUsec(other.getSetTimestampUsec());
            }
            if (other.getIndex() != 0) {
                setIndex(other.getIndex());
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
                        input.readMessage(getValueFieldBuilder().getBuilder(), extensionRegistry);

                        break;
                    } // case 10
                    case 16: {
                        setTimestampUsec_ = input.readInt64();

                        break;
                    } // case 16
                    case 24: {
                        index_ = input.readInt32();

                        break;
                    } // case 24
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

        private com.google.events.firebase.analytics.v1.AnalyticsValue value_;
        private com.google.protobuf.SingleFieldBuilderV3<com.google.events.firebase.analytics.v1.AnalyticsValue, com.google.events.firebase.analytics.v1.AnalyticsValue.Builder, com.google.events.firebase.analytics.v1.AnalyticsValueOrBuilder> valueBuilder_;

        /**
         * <pre>
         * Last set value of user property.
         * </pre>
         *
         * <code>.google.events.firebase.analytics.v1.AnalyticsValue value = 1;</code>
         *
         * @return Whether the value field is set.
         */
        public boolean hasValue() {
            return valueBuilder_ != null || value_ != null;
        }

        /**
         * <pre>
         * Last set value of user property.
         * </pre>
         *
         * <code>.google.events.firebase.analytics.v1.AnalyticsValue value = 1;</code>
         *
         * @return The value.
         */
        public com.google.events.firebase.analytics.v1.AnalyticsValue getValue() {
            if (valueBuilder_ == null) {
                return value_ == null ? com.google.events.firebase.analytics.v1.AnalyticsValue.getDefaultInstance()
                        : value_;
            } else {
                return valueBuilder_.getMessage();
            }
        }

        /**
         * <pre>
         * Last set value of user property.
         * </pre>
         *
         * <code>.google.events.firebase.analytics.v1.AnalyticsValue value = 1;</code>
         */
        public Builder setValue(com.google.events.firebase.analytics.v1.AnalyticsValue value) {
            if (valueBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                value_ = value;
                onChanged();
            } else {
                valueBuilder_.setMessage(value);
            }

            return this;
        }

        /**
         * <pre>
         * Last set value of user property.
         * </pre>
         *
         * <code>.google.events.firebase.analytics.v1.AnalyticsValue value = 1;</code>
         */
        public Builder setValue(com.google.events.firebase.analytics.v1.AnalyticsValue.Builder builderForValue) {
            if (valueBuilder_ == null) {
                value_ = builderForValue.build();
                onChanged();
            } else {
                valueBuilder_.setMessage(builderForValue.build());
            }

            return this;
        }

        /**
         * <pre>
         * Last set value of user property.
         * </pre>
         *
         * <code>.google.events.firebase.analytics.v1.AnalyticsValue value = 1;</code>
         */
        public Builder mergeValue(com.google.events.firebase.analytics.v1.AnalyticsValue value) {
            if (valueBuilder_ == null) {
                if (value_ != null) {
                    value_ = com.google.events.firebase.analytics.v1.AnalyticsValue.newBuilder(value_).mergeFrom(value)
                            .buildPartial();
                } else {
                    value_ = value;
                }
                onChanged();
            } else {
                valueBuilder_.mergeFrom(value);
            }

            return this;
        }

        /**
         * <pre>
         * Last set value of user property.
         * </pre>
         *
         * <code>.google.events.firebase.analytics.v1.AnalyticsValue value = 1;</code>
         */
        public Builder clearValue() {
            if (valueBuilder_ == null) {
                value_ = null;
                onChanged();
            } else {
                value_ = null;
                valueBuilder_ = null;
            }

            return this;
        }

        /**
         * <pre>
         * Last set value of user property.
         * </pre>
         *
         * <code>.google.events.firebase.analytics.v1.AnalyticsValue value = 1;</code>
         */
        public com.google.events.firebase.analytics.v1.AnalyticsValue.Builder getValueBuilder() {

            onChanged();
            return getValueFieldBuilder().getBuilder();
        }

        /**
         * <pre>
         * Last set value of user property.
         * </pre>
         *
         * <code>.google.events.firebase.analytics.v1.AnalyticsValue value = 1;</code>
         */
        public com.google.events.firebase.analytics.v1.AnalyticsValueOrBuilder getValueOrBuilder() {
            if (valueBuilder_ != null) {
                return valueBuilder_.getMessageOrBuilder();
            } else {
                return value_ == null ? com.google.events.firebase.analytics.v1.AnalyticsValue.getDefaultInstance()
                        : value_;
            }
        }

        /**
         * <pre>
         * Last set value of user property.
         * </pre>
         *
         * <code>.google.events.firebase.analytics.v1.AnalyticsValue value = 1;</code>
         */
        private com.google.protobuf.SingleFieldBuilderV3<com.google.events.firebase.analytics.v1.AnalyticsValue, com.google.events.firebase.analytics.v1.AnalyticsValue.Builder, com.google.events.firebase.analytics.v1.AnalyticsValueOrBuilder> getValueFieldBuilder() {
            if (valueBuilder_ == null) {
                valueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<com.google.events.firebase.analytics.v1.AnalyticsValue, com.google.events.firebase.analytics.v1.AnalyticsValue.Builder, com.google.events.firebase.analytics.v1.AnalyticsValueOrBuilder>(
                        getValue(), getParentForChildren(), isClean());
                value_ = null;
            }
            return valueBuilder_;
        }

        private long setTimestampUsec_;

        /**
         * <pre>
         * UTC client time when user property was last set.
         * </pre>
         *
         * <code>int64 set_timestamp_usec = 2;</code>
         *
         * @return The setTimestampUsec.
         */
        @java.lang.Override
        public long getSetTimestampUsec() {
            return setTimestampUsec_;
        }

        /**
         * <pre>
         * UTC client time when user property was last set.
         * </pre>
         *
         * <code>int64 set_timestamp_usec = 2;</code>
         *
         * @param value
         *            The setTimestampUsec to set.
         *
         * @return This builder for chaining.
         */
        public Builder setSetTimestampUsec(long value) {

            setTimestampUsec_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * UTC client time when user property was last set.
         * </pre>
         *
         * <code>int64 set_timestamp_usec = 2;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearSetTimestampUsec() {

            setTimestampUsec_ = 0L;
            onChanged();
            return this;
        }

        private int index_;

        /**
         * <pre>
         * Index for user property (one-based).
         * </pre>
         *
         * <code>int32 index = 3;</code>
         *
         * @return The index.
         */
        @java.lang.Override
        public int getIndex() {
            return index_;
        }

        /**
         * <pre>
         * Index for user property (one-based).
         * </pre>
         *
         * <code>int32 index = 3;</code>
         *
         * @param value
         *            The index to set.
         *
         * @return This builder for chaining.
         */
        public Builder setIndex(int value) {

            index_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * Index for user property (one-based).
         * </pre>
         *
         * <code>int32 index = 3;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearIndex() {

            index_ = 0;
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

        // @@protoc_insertion_point(builder_scope:google.events.firebase.analytics.v1.UserPropertyValue)
    }

    // @@protoc_insertion_point(class_scope:google.events.firebase.analytics.v1.UserPropertyValue)
    private static final com.google.events.firebase.analytics.v1.UserPropertyValue DEFAULT_INSTANCE;
    static {
        DEFAULT_INSTANCE = new com.google.events.firebase.analytics.v1.UserPropertyValue();
    }

    public static com.google.events.firebase.analytics.v1.UserPropertyValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UserPropertyValue> PARSER = new com.google.protobuf.AbstractParser<UserPropertyValue>() {
        @java.lang.Override
        public UserPropertyValue parsePartialFrom(com.google.protobuf.CodedInputStream input,
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

    public static com.google.protobuf.Parser<UserPropertyValue> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UserPropertyValue> getParserForType() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.events.firebase.analytics.v1.UserPropertyValue getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}
