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
// source: google/events/cloud/networkconnectivity/v1/data.proto

package com.google.events.cloud.networkconnectivity.v1;

public interface ServiceConnectionMapOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.networkconnectivity.v1.ServiceConnectionMap)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Immutable. The name of a ServiceConnectionMap.
   * Format:
   * projects/{project}/locations/{location}/serviceConnectionMaps/{service_connection_map}
   * See: https://google.aip.dev/122#fields-representing-resource-names
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Immutable. The name of a ServiceConnectionMap.
   * Format:
   * projects/{project}/locations/{location}/serviceConnectionMaps/{service_connection_map}
   * See: https://google.aip.dev/122#fields-representing-resource-names
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Time when the ServiceConnectionMap was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the ServiceConnectionMap was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the ServiceConnectionMap was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when the ServiceConnectionMap was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the ServiceConnectionMap was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the ServiceConnectionMap was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * User-defined labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * User-defined labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * User-defined labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * User-defined labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * User-defined labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * A description of this resource.
   * </pre>
   *
   * <code>string description = 5;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * A description of this resource.
   * </pre>
   *
   * <code>string description = 5;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * The service class identifier this ServiceConnectionMap is for.
   * The user of ServiceConnectionMap create API needs to have
   * networkconnecitivty.serviceclasses.use iam permission for the service
   * class.
   * </pre>
   *
   * <code>string service_class = 7;</code>
   *
   * @return The serviceClass.
   */
  java.lang.String getServiceClass();
  /**
   *
   *
   * <pre>
   * The service class identifier this ServiceConnectionMap is for.
   * The user of ServiceConnectionMap create API needs to have
   * networkconnecitivty.serviceclasses.use iam permission for the service
   * class.
   * </pre>
   *
   * <code>string service_class = 7;</code>
   *
   * @return The bytes for serviceClass.
   */
  com.google.protobuf.ByteString getServiceClassBytes();

  /**
   *
   *
   * <pre>
   * Output only. The service class uri this ServiceConnectionMap is for.
   * </pre>
   *
   * <code>string service_class_uri = 12;</code>
   *
   * @return The serviceClassUri.
   */
  java.lang.String getServiceClassUri();
  /**
   *
   *
   * <pre>
   * Output only. The service class uri this ServiceConnectionMap is for.
   * </pre>
   *
   * <code>string service_class_uri = 12;</code>
   *
   * @return The bytes for serviceClassUri.
   */
  com.google.protobuf.ByteString getServiceClassUriBytes();

  /**
   *
   *
   * <pre>
   * Output only. The infrastructure used for connections between
   * consumers/producers.
   * </pre>
   *
   * <code>.google.events.cloud.networkconnectivity.v1.Infrastructure infrastructure = 8;</code>
   *
   * @return The enum numeric value on the wire for infrastructure.
   */
  int getInfrastructureValue();
  /**
   *
   *
   * <pre>
   * Output only. The infrastructure used for connections between
   * consumers/producers.
   * </pre>
   *
   * <code>.google.events.cloud.networkconnectivity.v1.Infrastructure infrastructure = 8;</code>
   *
   * @return The infrastructure.
   */
  com.google.events.cloud.networkconnectivity.v1.Infrastructure getInfrastructure();

  /**
   *
   *
   * <pre>
   * The PSC configurations on producer side.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.networkconnectivity.v1.ServiceConnectionMap.ProducerPscConfig producer_psc_configs = 9;
   * </code>
   */
  java.util.List<
          com.google.events.cloud.networkconnectivity.v1.ServiceConnectionMap.ProducerPscConfig>
      getProducerPscConfigsList();
  /**
   *
   *
   * <pre>
   * The PSC configurations on producer side.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.networkconnectivity.v1.ServiceConnectionMap.ProducerPscConfig producer_psc_configs = 9;
   * </code>
   */
  com.google.events.cloud.networkconnectivity.v1.ServiceConnectionMap.ProducerPscConfig
      getProducerPscConfigs(int index);
  /**
   *
   *
   * <pre>
   * The PSC configurations on producer side.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.networkconnectivity.v1.ServiceConnectionMap.ProducerPscConfig producer_psc_configs = 9;
   * </code>
   */
  int getProducerPscConfigsCount();
  /**
   *
   *
   * <pre>
   * The PSC configurations on producer side.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.networkconnectivity.v1.ServiceConnectionMap.ProducerPscConfig producer_psc_configs = 9;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.events.cloud.networkconnectivity.v1.ServiceConnectionMap
                  .ProducerPscConfigOrBuilder>
      getProducerPscConfigsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The PSC configurations on producer side.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.networkconnectivity.v1.ServiceConnectionMap.ProducerPscConfig producer_psc_configs = 9;
   * </code>
   */
  com.google.events.cloud.networkconnectivity.v1.ServiceConnectionMap.ProducerPscConfigOrBuilder
      getProducerPscConfigsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The PSC configurations on consumer side.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.networkconnectivity.v1.ServiceConnectionMap.ConsumerPscConfig consumer_psc_configs = 10;
   * </code>
   */
  java.util.List<
          com.google.events.cloud.networkconnectivity.v1.ServiceConnectionMap.ConsumerPscConfig>
      getConsumerPscConfigsList();
  /**
   *
   *
   * <pre>
   * The PSC configurations on consumer side.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.networkconnectivity.v1.ServiceConnectionMap.ConsumerPscConfig consumer_psc_configs = 10;
   * </code>
   */
  com.google.events.cloud.networkconnectivity.v1.ServiceConnectionMap.ConsumerPscConfig
      getConsumerPscConfigs(int index);
  /**
   *
   *
   * <pre>
   * The PSC configurations on consumer side.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.networkconnectivity.v1.ServiceConnectionMap.ConsumerPscConfig consumer_psc_configs = 10;
   * </code>
   */
  int getConsumerPscConfigsCount();
  /**
   *
   *
   * <pre>
   * The PSC configurations on consumer side.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.networkconnectivity.v1.ServiceConnectionMap.ConsumerPscConfig consumer_psc_configs = 10;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.events.cloud.networkconnectivity.v1.ServiceConnectionMap
                  .ConsumerPscConfigOrBuilder>
      getConsumerPscConfigsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The PSC configurations on consumer side.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.networkconnectivity.v1.ServiceConnectionMap.ConsumerPscConfig consumer_psc_configs = 10;
   * </code>
   */
  com.google.events.cloud.networkconnectivity.v1.ServiceConnectionMap.ConsumerPscConfigOrBuilder
      getConsumerPscConfigsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. PSC connection details on consumer side.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.networkconnectivity.v1.ServiceConnectionMap.ConsumerPscConnection consumer_psc_connections = 11;
   * </code>
   */
  java.util.List<
          com.google.events.cloud.networkconnectivity.v1.ServiceConnectionMap.ConsumerPscConnection>
      getConsumerPscConnectionsList();
  /**
   *
   *
   * <pre>
   * Output only. PSC connection details on consumer side.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.networkconnectivity.v1.ServiceConnectionMap.ConsumerPscConnection consumer_psc_connections = 11;
   * </code>
   */
  com.google.events.cloud.networkconnectivity.v1.ServiceConnectionMap.ConsumerPscConnection
      getConsumerPscConnections(int index);
  /**
   *
   *
   * <pre>
   * Output only. PSC connection details on consumer side.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.networkconnectivity.v1.ServiceConnectionMap.ConsumerPscConnection consumer_psc_connections = 11;
   * </code>
   */
  int getConsumerPscConnectionsCount();
  /**
   *
   *
   * <pre>
   * Output only. PSC connection details on consumer side.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.networkconnectivity.v1.ServiceConnectionMap.ConsumerPscConnection consumer_psc_connections = 11;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.events.cloud.networkconnectivity.v1.ServiceConnectionMap
                  .ConsumerPscConnectionOrBuilder>
      getConsumerPscConnectionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. PSC connection details on consumer side.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.networkconnectivity.v1.ServiceConnectionMap.ConsumerPscConnection consumer_psc_connections = 11;
   * </code>
   */
  com.google.events.cloud.networkconnectivity.v1.ServiceConnectionMap.ConsumerPscConnectionOrBuilder
      getConsumerPscConnectionsOrBuilder(int index);
}