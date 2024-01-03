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
// source: google/events/cloud/dataplex/v1/data.proto

package com.google.events.cloud.dataplex.v1;

public interface DataAccessSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.dataplex.v1.DataAccessSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The format of strings follows the pattern followed by IAM in the
   * bindings. user:{email}, serviceAccount:{email} group:{email}.
   * The set of principals to be granted reader role on data
   * stored within resources.
   * </pre>
   *
   * <code>repeated string readers = 1;</code>
   *
   * @return A list containing the readers.
   */
  java.util.List<java.lang.String> getReadersList();

  /**
   *
   *
   * <pre>
   * Optional. The format of strings follows the pattern followed by IAM in the
   * bindings. user:{email}, serviceAccount:{email} group:{email}.
   * The set of principals to be granted reader role on data
   * stored within resources.
   * </pre>
   *
   * <code>repeated string readers = 1;</code>
   *
   * @return The count of readers.
   */
  int getReadersCount();

  /**
   *
   *
   * <pre>
   * Optional. The format of strings follows the pattern followed by IAM in the
   * bindings. user:{email}, serviceAccount:{email} group:{email}.
   * The set of principals to be granted reader role on data
   * stored within resources.
   * </pre>
   *
   * <code>repeated string readers = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The readers at the given index.
   */
  java.lang.String getReaders(int index);

  /**
   *
   *
   * <pre>
   * Optional. The format of strings follows the pattern followed by IAM in the
   * bindings. user:{email}, serviceAccount:{email} group:{email}.
   * The set of principals to be granted reader role on data
   * stored within resources.
   * </pre>
   *
   * <code>repeated string readers = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the readers at the given index.
   */
  com.google.protobuf.ByteString getReadersBytes(int index);
}
