// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/firebase/auth/v1/data.proto

package com.google.events.firebase.auth.v1;

public interface UserMetadataOrBuilder extends
        // @@protoc_insertion_point(interface_extends:google.events.firebase.auth.v1.UserMetadata)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * The date the user was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1;</code>
     *
     * @return Whether the createTime field is set.
     */
    boolean hasCreateTime();

    /**
     * <pre>
     * The date the user was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1;</code>
     *
     * @return The createTime.
     */
    com.google.protobuf.Timestamp getCreateTime();

    /**
     * <pre>
     * The date the user was created.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp create_time = 1;</code>
     */
    com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

    /**
     * <pre>
     * The date the user last signed in.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_sign_in_time = 2;</code>
     *
     * @return Whether the lastSignInTime field is set.
     */
    boolean hasLastSignInTime();

    /**
     * <pre>
     * The date the user last signed in.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_sign_in_time = 2;</code>
     *
     * @return The lastSignInTime.
     */
    com.google.protobuf.Timestamp getLastSignInTime();

    /**
     * <pre>
     * The date the user last signed in.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_sign_in_time = 2;</code>
     */
    com.google.protobuf.TimestampOrBuilder getLastSignInTimeOrBuilder();
}
