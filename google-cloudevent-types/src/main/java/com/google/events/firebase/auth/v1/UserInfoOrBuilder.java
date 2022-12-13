// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/firebase/auth/v1/data.proto

package com.google.events.firebase.auth.v1;

public interface UserInfoOrBuilder extends
        // @@protoc_insertion_point(interface_extends:google.events.firebase.auth.v1.UserInfo)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * The user identifier for the linked provider.
     * </pre>
     *
     * <code>string uid = 1;</code>
     *
     * @return The uid.
     */
    java.lang.String getUid();

    /**
     * <pre>
     * The user identifier for the linked provider.
     * </pre>
     *
     * <code>string uid = 1;</code>
     *
     * @return The bytes for uid.
     */
    com.google.protobuf.ByteString getUidBytes();

    /**
     * <pre>
     * The email for the linked provider.
     * </pre>
     *
     * <code>string email = 2;</code>
     *
     * @return The email.
     */
    java.lang.String getEmail();

    /**
     * <pre>
     * The email for the linked provider.
     * </pre>
     *
     * <code>string email = 2;</code>
     *
     * @return The bytes for email.
     */
    com.google.protobuf.ByteString getEmailBytes();

    /**
     * <pre>
     * The display name for the linked provider.
     * </pre>
     *
     * <code>string display_name = 3;</code>
     *
     * @return The displayName.
     */
    java.lang.String getDisplayName();

    /**
     * <pre>
     * The display name for the linked provider.
     * </pre>
     *
     * <code>string display_name = 3;</code>
     *
     * @return The bytes for displayName.
     */
    com.google.protobuf.ByteString getDisplayNameBytes();

    /**
     * <pre>
     * The photo URL for the linked provider.
     * </pre>
     *
     * <code>string photo_URL = 4;</code>
     *
     * @return The photoURL.
     */
    java.lang.String getPhotoURL();

    /**
     * <pre>
     * The photo URL for the linked provider.
     * </pre>
     *
     * <code>string photo_URL = 4;</code>
     *
     * @return The bytes for photoURL.
     */
    com.google.protobuf.ByteString getPhotoURLBytes();

    /**
     * <pre>
     * The linked provider ID (e.g. "google.com" for the Google provider).
     * </pre>
     *
     * <code>string provider_id = 5;</code>
     *
     * @return The providerId.
     */
    java.lang.String getProviderId();

    /**
     * <pre>
     * The linked provider ID (e.g. "google.com" for the Google provider).
     * </pre>
     *
     * <code>string provider_id = 5;</code>
     *
     * @return The bytes for providerId.
     */
    com.google.protobuf.ByteString getProviderIdBytes();
}
