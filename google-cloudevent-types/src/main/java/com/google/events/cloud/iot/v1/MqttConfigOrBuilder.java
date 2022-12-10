// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/events/cloud/iot/v1/data.proto

package com.google.events.cloud.iot.v1;

public interface MqttConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.iot.v1.MqttConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If enabled, allows connections using the MQTT protocol. Otherwise, MQTT
   * connections to this registry will fail.
   * </pre>
   *
   * <code>.google.events.cloud.iot.v1.MqttState mqtt_enabled_state = 1;</code>
   * @return The enum numeric value on the wire for mqttEnabledState.
   */
  int getMqttEnabledStateValue();
  /**
   * <pre>
   * If enabled, allows connections using the MQTT protocol. Otherwise, MQTT
   * connections to this registry will fail.
   * </pre>
   *
   * <code>.google.events.cloud.iot.v1.MqttState mqtt_enabled_state = 1;</code>
   * @return The mqttEnabledState.
   */
  com.google.events.cloud.iot.v1.MqttState getMqttEnabledState();
}
