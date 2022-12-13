// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/cloud/firestore/v1/data.proto

package com.google.events.cloud.firestore.v1;

public interface ArrayValueOrBuilder extends
        // @@protoc_insertion_point(interface_extends:google.events.cloud.firestore.v1.ArrayValue)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Values in the array.
     * </pre>
     *
     * <code>repeated .google.events.cloud.firestore.v1.Value values = 1;</code>
     */
    java.util.List<com.google.events.cloud.firestore.v1.Value> getValuesList();

    /**
     * <pre>
     * Values in the array.
     * </pre>
     *
     * <code>repeated .google.events.cloud.firestore.v1.Value values = 1;</code>
     */
    com.google.events.cloud.firestore.v1.Value getValues(int index);

    /**
     * <pre>
     * Values in the array.
     * </pre>
     *
     * <code>repeated .google.events.cloud.firestore.v1.Value values = 1;</code>
     */
    int getValuesCount();

    /**
     * <pre>
     * Values in the array.
     * </pre>
     *
     * <code>repeated .google.events.cloud.firestore.v1.Value values = 1;</code>
     */
    java.util.List<? extends com.google.events.cloud.firestore.v1.ValueOrBuilder> getValuesOrBuilderList();

    /**
     * <pre>
     * Values in the array.
     * </pre>
     *
     * <code>repeated .google.events.cloud.firestore.v1.Value values = 1;</code>
     */
    com.google.events.cloud.firestore.v1.ValueOrBuilder getValuesOrBuilder(int index);
}
