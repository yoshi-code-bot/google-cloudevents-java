// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/cloud/audit/v1/data.proto

package com.google.events.cloud.audit.v1;

public interface LogEntryOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.audit.v1.LogEntryOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * An arbitrary operation identifier. Log entries with the same
   * identifier are assumed to be part of the same operation.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * An arbitrary operation identifier. Log entries with the same
   * identifier are assumed to be part of the same operation.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

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
  java.lang.String getProducer();
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
  com.google.protobuf.ByteString
      getProducerBytes();

  /**
   * <pre>
   * True if this is the first log entry in the operation.
   * </pre>
   *
   * <code>bool first = 3;</code>
   * @return The first.
   */
  boolean getFirst();

  /**
   * <pre>
   * True if this is the last log entry in the operation.
   * </pre>
   *
   * <code>bool last = 4;</code>
   * @return The last.
   */
  boolean getLast();
}
