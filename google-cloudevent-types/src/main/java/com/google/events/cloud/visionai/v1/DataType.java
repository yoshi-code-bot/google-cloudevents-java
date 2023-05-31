/*
 * Copyright 2023 Google LLC
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
// source: google/events/cloud/visionai/v1/data.proto

package com.google.events.cloud.visionai.v1;

/**
 *
 *
 * <pre>
 * All supported data types.
 * </pre>
 *
 * Protobuf enum {@code google.events.cloud.visionai.v1.DataType}
 */
public enum DataType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * The default value of DataType.
   * </pre>
   *
   * <code>DATA_TYPE_UNSPECIFIED = 0;</code>
   */
  DATA_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Video data type like H264.
   * </pre>
   *
   * <code>VIDEO = 1;</code>
   */
  VIDEO(1),
  /**
   *
   *
   * <pre>
   * Image data type.
   * </pre>
   *
   * <code>IMAGE = 3;</code>
   */
  IMAGE(3),
  /**
   *
   *
   * <pre>
   * Protobuf data type, usually used for general data blob.
   * </pre>
   *
   * <code>PROTO = 2;</code>
   */
  PROTO(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * The default value of DataType.
   * </pre>
   *
   * <code>DATA_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int DATA_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Video data type like H264.
   * </pre>
   *
   * <code>VIDEO = 1;</code>
   */
  public static final int VIDEO_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Image data type.
   * </pre>
   *
   * <code>IMAGE = 3;</code>
   */
  public static final int IMAGE_VALUE = 3;
  /**
   *
   *
   * <pre>
   * Protobuf data type, usually used for general data blob.
   * </pre>
   *
   * <code>PROTO = 2;</code>
   */
  public static final int PROTO_VALUE = 2;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static DataType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DataType forNumber(int value) {
    switch (value) {
      case 0:
        return DATA_TYPE_UNSPECIFIED;
      case 1:
        return VIDEO;
      case 3:
        return IMAGE;
      case 2:
        return PROTO;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DataType> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<DataType> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<DataType>() {
        public DataType findValueByNumber(int number) {
          return DataType.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.events.cloud.visionai.v1.Data.getDescriptor().getEnumTypes().get(4);
  }

  private static final DataType[] VALUES = values();

  public static DataType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private DataType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.events.cloud.visionai.v1.DataType)
}
