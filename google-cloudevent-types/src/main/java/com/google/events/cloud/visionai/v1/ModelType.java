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
 * All the supported model types in Vision AI App Platform.
 * </pre>
 *
 * Protobuf enum {@code google.events.cloud.visionai.v1.ModelType}
 */
public enum ModelType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Processor Type UNSPECIFIED.
   * </pre>
   *
   * <code>MODEL_TYPE_UNSPECIFIED = 0;</code>
   */
  MODEL_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Model Type Image Classification.
   * </pre>
   *
   * <code>IMAGE_CLASSIFICATION = 1;</code>
   */
  IMAGE_CLASSIFICATION(1),
  /**
   *
   *
   * <pre>
   * Model Type Object Detection.
   * </pre>
   *
   * <code>OBJECT_DETECTION = 2;</code>
   */
  OBJECT_DETECTION(2),
  /**
   *
   *
   * <pre>
   * Model Type Video Classification.
   * </pre>
   *
   * <code>VIDEO_CLASSIFICATION = 3;</code>
   */
  VIDEO_CLASSIFICATION(3),
  /**
   *
   *
   * <pre>
   * Model Type Object Tracking.
   * </pre>
   *
   * <code>VIDEO_OBJECT_TRACKING = 4;</code>
   */
  VIDEO_OBJECT_TRACKING(4),
  /**
   *
   *
   * <pre>
   * Model Type Action Recognition.
   * </pre>
   *
   * <code>VIDEO_ACTION_RECOGNITION = 5;</code>
   */
  VIDEO_ACTION_RECOGNITION(5),
  /**
   *
   *
   * <pre>
   * Model Type Occupancy Counting.
   * </pre>
   *
   * <code>OCCUPANCY_COUNTING = 6;</code>
   */
  OCCUPANCY_COUNTING(6),
  /**
   *
   *
   * <pre>
   * Model Type Person Blur.
   * </pre>
   *
   * <code>PERSON_BLUR = 7;</code>
   */
  PERSON_BLUR(7),
  /**
   *
   *
   * <pre>
   * Model Type Vertex Custom.
   * </pre>
   *
   * <code>VERTEX_CUSTOM = 8;</code>
   */
  VERTEX_CUSTOM(8),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Processor Type UNSPECIFIED.
   * </pre>
   *
   * <code>MODEL_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int MODEL_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Model Type Image Classification.
   * </pre>
   *
   * <code>IMAGE_CLASSIFICATION = 1;</code>
   */
  public static final int IMAGE_CLASSIFICATION_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Model Type Object Detection.
   * </pre>
   *
   * <code>OBJECT_DETECTION = 2;</code>
   */
  public static final int OBJECT_DETECTION_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Model Type Video Classification.
   * </pre>
   *
   * <code>VIDEO_CLASSIFICATION = 3;</code>
   */
  public static final int VIDEO_CLASSIFICATION_VALUE = 3;
  /**
   *
   *
   * <pre>
   * Model Type Object Tracking.
   * </pre>
   *
   * <code>VIDEO_OBJECT_TRACKING = 4;</code>
   */
  public static final int VIDEO_OBJECT_TRACKING_VALUE = 4;
  /**
   *
   *
   * <pre>
   * Model Type Action Recognition.
   * </pre>
   *
   * <code>VIDEO_ACTION_RECOGNITION = 5;</code>
   */
  public static final int VIDEO_ACTION_RECOGNITION_VALUE = 5;
  /**
   *
   *
   * <pre>
   * Model Type Occupancy Counting.
   * </pre>
   *
   * <code>OCCUPANCY_COUNTING = 6;</code>
   */
  public static final int OCCUPANCY_COUNTING_VALUE = 6;
  /**
   *
   *
   * <pre>
   * Model Type Person Blur.
   * </pre>
   *
   * <code>PERSON_BLUR = 7;</code>
   */
  public static final int PERSON_BLUR_VALUE = 7;
  /**
   *
   *
   * <pre>
   * Model Type Vertex Custom.
   * </pre>
   *
   * <code>VERTEX_CUSTOM = 8;</code>
   */
  public static final int VERTEX_CUSTOM_VALUE = 8;

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
  public static ModelType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ModelType forNumber(int value) {
    switch (value) {
      case 0:
        return MODEL_TYPE_UNSPECIFIED;
      case 1:
        return IMAGE_CLASSIFICATION;
      case 2:
        return OBJECT_DETECTION;
      case 3:
        return VIDEO_CLASSIFICATION;
      case 4:
        return VIDEO_OBJECT_TRACKING;
      case 5:
        return VIDEO_ACTION_RECOGNITION;
      case 6:
        return OCCUPANCY_COUNTING;
      case 7:
        return PERSON_BLUR;
      case 8:
        return VERTEX_CUSTOM;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ModelType> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ModelType> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<ModelType>() {
        public ModelType findValueByNumber(int number) {
          return ModelType.forNumber(number);
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
    return com.google.events.cloud.visionai.v1.Data.getDescriptor().getEnumTypes().get(2);
  }

  private static final ModelType[] VALUES = values();

  public static ModelType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ModelType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.events.cloud.visionai.v1.ModelType)
}
