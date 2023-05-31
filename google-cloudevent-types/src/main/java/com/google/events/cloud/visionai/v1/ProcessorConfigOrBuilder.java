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

public interface ProcessorConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.visionai.v1.ProcessorConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Configs of stream input processor.
   * </pre>
   *
   * <code>.google.events.cloud.visionai.v1.VideoStreamInputConfig video_stream_input_config = 9;
   * </code>
   *
   * @return Whether the videoStreamInputConfig field is set.
   */
  boolean hasVideoStreamInputConfig();
  /**
   *
   *
   * <pre>
   * Configs of stream input processor.
   * </pre>
   *
   * <code>.google.events.cloud.visionai.v1.VideoStreamInputConfig video_stream_input_config = 9;
   * </code>
   *
   * @return The videoStreamInputConfig.
   */
  com.google.events.cloud.visionai.v1.VideoStreamInputConfig getVideoStreamInputConfig();
  /**
   *
   *
   * <pre>
   * Configs of stream input processor.
   * </pre>
   *
   * <code>.google.events.cloud.visionai.v1.VideoStreamInputConfig video_stream_input_config = 9;
   * </code>
   */
  com.google.events.cloud.visionai.v1.VideoStreamInputConfigOrBuilder
      getVideoStreamInputConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Config of AI-enabled input devices.
   * </pre>
   *
   * <code>
   * .google.events.cloud.visionai.v1.AIEnabledDevicesInputConfig ai_enabled_devices_input_config = 20;
   * </code>
   *
   * @return Whether the aiEnabledDevicesInputConfig field is set.
   */
  boolean hasAiEnabledDevicesInputConfig();
  /**
   *
   *
   * <pre>
   * Config of AI-enabled input devices.
   * </pre>
   *
   * <code>
   * .google.events.cloud.visionai.v1.AIEnabledDevicesInputConfig ai_enabled_devices_input_config = 20;
   * </code>
   *
   * @return The aiEnabledDevicesInputConfig.
   */
  com.google.events.cloud.visionai.v1.AIEnabledDevicesInputConfig getAiEnabledDevicesInputConfig();
  /**
   *
   *
   * <pre>
   * Config of AI-enabled input devices.
   * </pre>
   *
   * <code>
   * .google.events.cloud.visionai.v1.AIEnabledDevicesInputConfig ai_enabled_devices_input_config = 20;
   * </code>
   */
  com.google.events.cloud.visionai.v1.AIEnabledDevicesInputConfigOrBuilder
      getAiEnabledDevicesInputConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configs of media warehouse processor.
   * </pre>
   *
   * <code>.google.events.cloud.visionai.v1.MediaWarehouseConfig media_warehouse_config = 10;</code>
   *
   * @return Whether the mediaWarehouseConfig field is set.
   */
  boolean hasMediaWarehouseConfig();
  /**
   *
   *
   * <pre>
   * Configs of media warehouse processor.
   * </pre>
   *
   * <code>.google.events.cloud.visionai.v1.MediaWarehouseConfig media_warehouse_config = 10;</code>
   *
   * @return The mediaWarehouseConfig.
   */
  com.google.events.cloud.visionai.v1.MediaWarehouseConfig getMediaWarehouseConfig();
  /**
   *
   *
   * <pre>
   * Configs of media warehouse processor.
   * </pre>
   *
   * <code>.google.events.cloud.visionai.v1.MediaWarehouseConfig media_warehouse_config = 10;</code>
   */
  com.google.events.cloud.visionai.v1.MediaWarehouseConfigOrBuilder
      getMediaWarehouseConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configs of person blur processor.
   * </pre>
   *
   * <code>.google.events.cloud.visionai.v1.PersonBlurConfig person_blur_config = 11;</code>
   *
   * @return Whether the personBlurConfig field is set.
   */
  boolean hasPersonBlurConfig();
  /**
   *
   *
   * <pre>
   * Configs of person blur processor.
   * </pre>
   *
   * <code>.google.events.cloud.visionai.v1.PersonBlurConfig person_blur_config = 11;</code>
   *
   * @return The personBlurConfig.
   */
  com.google.events.cloud.visionai.v1.PersonBlurConfig getPersonBlurConfig();
  /**
   *
   *
   * <pre>
   * Configs of person blur processor.
   * </pre>
   *
   * <code>.google.events.cloud.visionai.v1.PersonBlurConfig person_blur_config = 11;</code>
   */
  com.google.events.cloud.visionai.v1.PersonBlurConfigOrBuilder getPersonBlurConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configs of occupancy count processor.
   * </pre>
   *
   * <code>.google.events.cloud.visionai.v1.OccupancyCountConfig occupancy_count_config = 12;</code>
   *
   * @return Whether the occupancyCountConfig field is set.
   */
  boolean hasOccupancyCountConfig();
  /**
   *
   *
   * <pre>
   * Configs of occupancy count processor.
   * </pre>
   *
   * <code>.google.events.cloud.visionai.v1.OccupancyCountConfig occupancy_count_config = 12;</code>
   *
   * @return The occupancyCountConfig.
   */
  com.google.events.cloud.visionai.v1.OccupancyCountConfig getOccupancyCountConfig();
  /**
   *
   *
   * <pre>
   * Configs of occupancy count processor.
   * </pre>
   *
   * <code>.google.events.cloud.visionai.v1.OccupancyCountConfig occupancy_count_config = 12;</code>
   */
  com.google.events.cloud.visionai.v1.OccupancyCountConfigOrBuilder
      getOccupancyCountConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configs of Person Vehicle Detection processor.
   * </pre>
   *
   * <code>
   * .google.events.cloud.visionai.v1.PersonVehicleDetectionConfig person_vehicle_detection_config = 15;
   * </code>
   *
   * @return Whether the personVehicleDetectionConfig field is set.
   */
  boolean hasPersonVehicleDetectionConfig();
  /**
   *
   *
   * <pre>
   * Configs of Person Vehicle Detection processor.
   * </pre>
   *
   * <code>
   * .google.events.cloud.visionai.v1.PersonVehicleDetectionConfig person_vehicle_detection_config = 15;
   * </code>
   *
   * @return The personVehicleDetectionConfig.
   */
  com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfig
      getPersonVehicleDetectionConfig();
  /**
   *
   *
   * <pre>
   * Configs of Person Vehicle Detection processor.
   * </pre>
   *
   * <code>
   * .google.events.cloud.visionai.v1.PersonVehicleDetectionConfig person_vehicle_detection_config = 15;
   * </code>
   */
  com.google.events.cloud.visionai.v1.PersonVehicleDetectionConfigOrBuilder
      getPersonVehicleDetectionConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configs of Vertex AutoML vision processor.
   * </pre>
   *
   * <code>
   * .google.events.cloud.visionai.v1.VertexAutoMLVisionConfig vertex_automl_vision_config = 13;
   * </code>
   *
   * @return Whether the vertexAutomlVisionConfig field is set.
   */
  boolean hasVertexAutomlVisionConfig();
  /**
   *
   *
   * <pre>
   * Configs of Vertex AutoML vision processor.
   * </pre>
   *
   * <code>
   * .google.events.cloud.visionai.v1.VertexAutoMLVisionConfig vertex_automl_vision_config = 13;
   * </code>
   *
   * @return The vertexAutomlVisionConfig.
   */
  com.google.events.cloud.visionai.v1.VertexAutoMLVisionConfig getVertexAutomlVisionConfig();
  /**
   *
   *
   * <pre>
   * Configs of Vertex AutoML vision processor.
   * </pre>
   *
   * <code>
   * .google.events.cloud.visionai.v1.VertexAutoMLVisionConfig vertex_automl_vision_config = 13;
   * </code>
   */
  com.google.events.cloud.visionai.v1.VertexAutoMLVisionConfigOrBuilder
      getVertexAutomlVisionConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configs of Vertex AutoML video processor.
   * </pre>
   *
   * <code>.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig vertex_automl_video_config = 14;
   * </code>
   *
   * @return Whether the vertexAutomlVideoConfig field is set.
   */
  boolean hasVertexAutomlVideoConfig();
  /**
   *
   *
   * <pre>
   * Configs of Vertex AutoML video processor.
   * </pre>
   *
   * <code>.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig vertex_automl_video_config = 14;
   * </code>
   *
   * @return The vertexAutomlVideoConfig.
   */
  com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig getVertexAutomlVideoConfig();
  /**
   *
   *
   * <pre>
   * Configs of Vertex AutoML video processor.
   * </pre>
   *
   * <code>.google.events.cloud.visionai.v1.VertexAutoMLVideoConfig vertex_automl_video_config = 14;
   * </code>
   */
  com.google.events.cloud.visionai.v1.VertexAutoMLVideoConfigOrBuilder
      getVertexAutomlVideoConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configs of Vertex Custom processor.
   * </pre>
   *
   * <code>.google.events.cloud.visionai.v1.VertexCustomConfig vertex_custom_config = 17;</code>
   *
   * @return Whether the vertexCustomConfig field is set.
   */
  boolean hasVertexCustomConfig();
  /**
   *
   *
   * <pre>
   * Configs of Vertex Custom processor.
   * </pre>
   *
   * <code>.google.events.cloud.visionai.v1.VertexCustomConfig vertex_custom_config = 17;</code>
   *
   * @return The vertexCustomConfig.
   */
  com.google.events.cloud.visionai.v1.VertexCustomConfig getVertexCustomConfig();
  /**
   *
   *
   * <pre>
   * Configs of Vertex Custom processor.
   * </pre>
   *
   * <code>.google.events.cloud.visionai.v1.VertexCustomConfig vertex_custom_config = 17;</code>
   */
  com.google.events.cloud.visionai.v1.VertexCustomConfigOrBuilder getVertexCustomConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configs of General Object Detection processor.
   * </pre>
   *
   * <code>
   * .google.events.cloud.visionai.v1.GeneralObjectDetectionConfig general_object_detection_config = 18;
   * </code>
   *
   * @return Whether the generalObjectDetectionConfig field is set.
   */
  boolean hasGeneralObjectDetectionConfig();
  /**
   *
   *
   * <pre>
   * Configs of General Object Detection processor.
   * </pre>
   *
   * <code>
   * .google.events.cloud.visionai.v1.GeneralObjectDetectionConfig general_object_detection_config = 18;
   * </code>
   *
   * @return The generalObjectDetectionConfig.
   */
  com.google.events.cloud.visionai.v1.GeneralObjectDetectionConfig
      getGeneralObjectDetectionConfig();
  /**
   *
   *
   * <pre>
   * Configs of General Object Detection processor.
   * </pre>
   *
   * <code>
   * .google.events.cloud.visionai.v1.GeneralObjectDetectionConfig general_object_detection_config = 18;
   * </code>
   */
  com.google.events.cloud.visionai.v1.GeneralObjectDetectionConfigOrBuilder
      getGeneralObjectDetectionConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configs of BigQuery processor.
   * </pre>
   *
   * <code>.google.events.cloud.visionai.v1.BigQueryConfig big_query_config = 19;</code>
   *
   * @return Whether the bigQueryConfig field is set.
   */
  boolean hasBigQueryConfig();
  /**
   *
   *
   * <pre>
   * Configs of BigQuery processor.
   * </pre>
   *
   * <code>.google.events.cloud.visionai.v1.BigQueryConfig big_query_config = 19;</code>
   *
   * @return The bigQueryConfig.
   */
  com.google.events.cloud.visionai.v1.BigQueryConfig getBigQueryConfig();
  /**
   *
   *
   * <pre>
   * Configs of BigQuery processor.
   * </pre>
   *
   * <code>.google.events.cloud.visionai.v1.BigQueryConfig big_query_config = 19;</code>
   */
  com.google.events.cloud.visionai.v1.BigQueryConfigOrBuilder getBigQueryConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configs of personal_protective_equipment_detection_config
   * </pre>
   *
   * <code>
   * .google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig personal_protective_equipment_detection_config = 22;
   * </code>
   *
   * @return Whether the personalProtectiveEquipmentDetectionConfig field is set.
   */
  boolean hasPersonalProtectiveEquipmentDetectionConfig();
  /**
   *
   *
   * <pre>
   * Configs of personal_protective_equipment_detection_config
   * </pre>
   *
   * <code>
   * .google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig personal_protective_equipment_detection_config = 22;
   * </code>
   *
   * @return The personalProtectiveEquipmentDetectionConfig.
   */
  com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig
      getPersonalProtectiveEquipmentDetectionConfig();
  /**
   *
   *
   * <pre>
   * Configs of personal_protective_equipment_detection_config
   * </pre>
   *
   * <code>
   * .google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfig personal_protective_equipment_detection_config = 22;
   * </code>
   */
  com.google.events.cloud.visionai.v1.PersonalProtectiveEquipmentDetectionConfigOrBuilder
      getPersonalProtectiveEquipmentDetectionConfigOrBuilder();

  public com.google.events.cloud.visionai.v1.ProcessorConfig.ProcessorConfigCase
      getProcessorConfigCase();
}
