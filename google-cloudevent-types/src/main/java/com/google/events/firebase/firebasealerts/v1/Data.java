// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/firebase/firebasealerts/v1/data.proto

package com.google.events.firebase.firebasealerts.v1;

public final class Data {
    private Data() {
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    static final com.google.protobuf.Descriptors.Descriptor internal_static_google_events_firebase_firebasealerts_v1_AlertData_descriptor;
    static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internal_static_google_events_firebase_firebasealerts_v1_AlertData_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;
    static {
        java.lang.String[] descriptorData = { "\n3google/events/firebase/firebasealerts/"
                + "v1/data.proto\022(google.events.firebase.fi" + "rebasealerts.v1\032\034google/protobuf/struct."
                + "proto\032\037google/protobuf/timestamp.proto\"\224"
                + "\001\n\tAlertData\022/\n\013create_time\030\001 \001(\0132\032.goog"
                + "le.protobuf.Timestamp\022,\n\010end_time\030\002 \001(\0132"
                + "\032.google.protobuf.Timestamp\022(\n\007payload\030\003"
                + " \001(\0132\027.google.protobuf.StructBd\n,com.goo"
                + "gle.events.firebase.firebasealerts.v1P\001\252" + "\0021Google.Events.Protobuf.Firebase.Fireba"
                + "seAlerts.V1b\006proto3" };
        descriptor = com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData,
                new com.google.protobuf.Descriptors.FileDescriptor[] { com.google.protobuf.StructProto.getDescriptor(),
                        com.google.protobuf.TimestampProto.getDescriptor(), });
        internal_static_google_events_firebase_firebasealerts_v1_AlertData_descriptor = getDescriptor()
                .getMessageTypes().get(0);
        internal_static_google_events_firebase_firebasealerts_v1_AlertData_fieldAccessorTable = new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_google_events_firebase_firebasealerts_v1_AlertData_descriptor,
                new java.lang.String[] { "CreateTime", "EndTime", "Payload", });
        com.google.protobuf.StructProto.getDescriptor();
        com.google.protobuf.TimestampProto.getDescriptor();
    }

    // @@protoc_insertion_point(outer_class_scope)
}
