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
// source: google/events/cloud/networkconnectivity/v1/data.proto

package com.google.events.cloud.networkconnectivity.v1;

/**
 *
 *
 * <pre>
 * The error type indicates whether a connection error is consumer facing,
 * producer facing or system internal.
 * </pre>
 *
 * Protobuf enum {@code google.events.cloud.networkconnectivity.v1.ConnectionErrorType}
 */
public enum ConnectionErrorType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * An invalid error type as the default case.
   * </pre>
   *
   * <code>CONNECTION_ERROR_TYPE_UNSPECIFIED = 0;</code>
   */
  CONNECTION_ERROR_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * The error is due to Service Automation system internal.
   * </pre>
   *
   * <code>ERROR_INTERNAL = 1;</code>
   */
  ERROR_INTERNAL(1),
  /**
   *
   *
   * <pre>
   * The error is due to the setup on consumer side.
   * </pre>
   *
   * <code>ERROR_CONSUMER_SIDE = 2;</code>
   */
  ERROR_CONSUMER_SIDE(2),
  /**
   *
   *
   * <pre>
   * The error is due to the setup on producer side.
   * </pre>
   *
   * <code>ERROR_PRODUCER_SIDE = 3;</code>
   */
  ERROR_PRODUCER_SIDE(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * An invalid error type as the default case.
   * </pre>
   *
   * <code>CONNECTION_ERROR_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int CONNECTION_ERROR_TYPE_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * The error is due to Service Automation system internal.
   * </pre>
   *
   * <code>ERROR_INTERNAL = 1;</code>
   */
  public static final int ERROR_INTERNAL_VALUE = 1;

  /**
   *
   *
   * <pre>
   * The error is due to the setup on consumer side.
   * </pre>
   *
   * <code>ERROR_CONSUMER_SIDE = 2;</code>
   */
  public static final int ERROR_CONSUMER_SIDE_VALUE = 2;

  /**
   *
   *
   * <pre>
   * The error is due to the setup on producer side.
   * </pre>
   *
   * <code>ERROR_PRODUCER_SIDE = 3;</code>
   */
  public static final int ERROR_PRODUCER_SIDE_VALUE = 3;

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
  public static ConnectionErrorType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ConnectionErrorType forNumber(int value) {
    switch (value) {
      case 0:
        return CONNECTION_ERROR_TYPE_UNSPECIFIED;
      case 1:
        return ERROR_INTERNAL;
      case 2:
        return ERROR_CONSUMER_SIDE;
      case 3:
        return ERROR_PRODUCER_SIDE;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ConnectionErrorType>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ConnectionErrorType>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ConnectionErrorType>() {
            public ConnectionErrorType findValueByNumber(int number) {
              return ConnectionErrorType.forNumber(number);
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
    return com.google.events.cloud.networkconnectivity.v1.Data.getDescriptor()
        .getEnumTypes()
        .get(1);
  }

  private static final ConnectionErrorType[] VALUES = values();

  public static ConnectionErrorType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ConnectionErrorType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.events.cloud.networkconnectivity.v1.ConnectionErrorType)
}
