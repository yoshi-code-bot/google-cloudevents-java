/*
 * Copyright 2025 Google LLC
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
// source: google/events/cloud/apigateway/v1/data.proto

package com.google.events.cloud.apigateway.v1;

public interface ApiConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.apigateway.v1.ApiConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Resource name of the API Config.
   * Format: projects/{project}/locations/global/apis/{api}/configs/{api_config}
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
   * Output only. Resource name of the API Config.
   * Format: projects/{project}/locations/global/apis/{api}/configs/{api_config}
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
   * Output only. Created time.
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
   * Output only. Created time.
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
   * Output only. Created time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Updated time.
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
   * Output only. Updated time.
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
   * Output only. Updated time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Resource labels to represent user-provided metadata.
   * Refer to cloud documentation on labels for more details.
   * https://cloud.google.com/compute/docs/labeling-resources
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();

  /**
   *
   *
   * <pre>
   * Optional. Resource labels to represent user-provided metadata.
   * Refer to cloud documentation on labels for more details.
   * https://cloud.google.com/compute/docs/labeling-resources
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
   * Optional. Resource labels to represent user-provided metadata.
   * Refer to cloud documentation on labels for more details.
   * https://cloud.google.com/compute/docs/labeling-resources
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();

  /**
   *
   *
   * <pre>
   * Optional. Resource labels to represent user-provided metadata.
   * Refer to cloud documentation on labels for more details.
   * https://cloud.google.com/compute/docs/labeling-resources
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
   * Optional. Resource labels to represent user-provided metadata.
   * Refer to cloud documentation on labels for more details.
   * https://cloud.google.com/compute/docs/labeling-resources
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. Display name.
   * </pre>
   *
   * <code>string display_name = 5;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();

  /**
   *
   *
   * <pre>
   * Optional. Display name.
   * </pre>
   *
   * <code>string display_name = 5;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Immutable. The Google Cloud IAM Service Account that Gateways serving this
   * config should use to authenticate to other services. This may either be the
   * Service Account's email
   * (`{ACCOUNT_ID}&#64;{PROJECT}.iam.gserviceaccount.com`) or its full resource
   * name (`projects/{PROJECT}/accounts/{UNIQUE_ID}`). This is most often used
   * when the service is a GCP resource such as a Cloud Run Service or an
   * IAP-secured service.
   * </pre>
   *
   * <code>string gateway_service_account = 14;</code>
   *
   * @return The gatewayServiceAccount.
   */
  java.lang.String getGatewayServiceAccount();

  /**
   *
   *
   * <pre>
   * Immutable. The Google Cloud IAM Service Account that Gateways serving this
   * config should use to authenticate to other services. This may either be the
   * Service Account's email
   * (`{ACCOUNT_ID}&#64;{PROJECT}.iam.gserviceaccount.com`) or its full resource
   * name (`projects/{PROJECT}/accounts/{UNIQUE_ID}`). This is most often used
   * when the service is a GCP resource such as a Cloud Run Service or an
   * IAP-secured service.
   * </pre>
   *
   * <code>string gateway_service_account = 14;</code>
   *
   * @return The bytes for gatewayServiceAccount.
   */
  com.google.protobuf.ByteString getGatewayServiceAccountBytes();

  /**
   *
   *
   * <pre>
   * Output only. The ID of the associated Service Config (
   * https://cloud.google.com/service-infrastructure/docs/glossary#config).
   * </pre>
   *
   * <code>string service_config_id = 12;</code>
   *
   * @return The serviceConfigId.
   */
  java.lang.String getServiceConfigId();

  /**
   *
   *
   * <pre>
   * Output only. The ID of the associated Service Config (
   * https://cloud.google.com/service-infrastructure/docs/glossary#config).
   * </pre>
   *
   * <code>string service_config_id = 12;</code>
   *
   * @return The bytes for serviceConfigId.
   */
  com.google.protobuf.ByteString getServiceConfigIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. State of the API Config.
   * </pre>
   *
   * <code>.google.events.cloud.apigateway.v1.ApiConfig.State state = 8;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * Output only. State of the API Config.
   * </pre>
   *
   * <code>.google.events.cloud.apigateway.v1.ApiConfig.State state = 8;</code>
   *
   * @return The state.
   */
  com.google.events.cloud.apigateway.v1.ApiConfig.State getState();

  /**
   *
   *
   * <pre>
   * Optional. OpenAPI specification documents. If specified, grpc_services and
   * managed_service_configs must not be included.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.apigateway.v1.ApiConfig.OpenApiDocument openapi_documents = 9;
   * </code>
   */
  java.util.List<com.google.events.cloud.apigateway.v1.ApiConfig.OpenApiDocument>
      getOpenapiDocumentsList();

  /**
   *
   *
   * <pre>
   * Optional. OpenAPI specification documents. If specified, grpc_services and
   * managed_service_configs must not be included.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.apigateway.v1.ApiConfig.OpenApiDocument openapi_documents = 9;
   * </code>
   */
  com.google.events.cloud.apigateway.v1.ApiConfig.OpenApiDocument getOpenapiDocuments(int index);

  /**
   *
   *
   * <pre>
   * Optional. OpenAPI specification documents. If specified, grpc_services and
   * managed_service_configs must not be included.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.apigateway.v1.ApiConfig.OpenApiDocument openapi_documents = 9;
   * </code>
   */
  int getOpenapiDocumentsCount();

  /**
   *
   *
   * <pre>
   * Optional. OpenAPI specification documents. If specified, grpc_services and
   * managed_service_configs must not be included.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.apigateway.v1.ApiConfig.OpenApiDocument openapi_documents = 9;
   * </code>
   */
  java.util.List<? extends com.google.events.cloud.apigateway.v1.ApiConfig.OpenApiDocumentOrBuilder>
      getOpenapiDocumentsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Optional. OpenAPI specification documents. If specified, grpc_services and
   * managed_service_configs must not be included.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.apigateway.v1.ApiConfig.OpenApiDocument openapi_documents = 9;
   * </code>
   */
  com.google.events.cloud.apigateway.v1.ApiConfig.OpenApiDocumentOrBuilder
      getOpenapiDocumentsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. gRPC service definition files. If specified, openapi_documents
   * must not be included.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.apigateway.v1.ApiConfig.GrpcServiceDefinition grpc_services = 10;
   * </code>
   */
  java.util.List<com.google.events.cloud.apigateway.v1.ApiConfig.GrpcServiceDefinition>
      getGrpcServicesList();

  /**
   *
   *
   * <pre>
   * Optional. gRPC service definition files. If specified, openapi_documents
   * must not be included.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.apigateway.v1.ApiConfig.GrpcServiceDefinition grpc_services = 10;
   * </code>
   */
  com.google.events.cloud.apigateway.v1.ApiConfig.GrpcServiceDefinition getGrpcServices(int index);

  /**
   *
   *
   * <pre>
   * Optional. gRPC service definition files. If specified, openapi_documents
   * must not be included.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.apigateway.v1.ApiConfig.GrpcServiceDefinition grpc_services = 10;
   * </code>
   */
  int getGrpcServicesCount();

  /**
   *
   *
   * <pre>
   * Optional. gRPC service definition files. If specified, openapi_documents
   * must not be included.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.apigateway.v1.ApiConfig.GrpcServiceDefinition grpc_services = 10;
   * </code>
   */
  java.util.List<
          ? extends com.google.events.cloud.apigateway.v1.ApiConfig.GrpcServiceDefinitionOrBuilder>
      getGrpcServicesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Optional. gRPC service definition files. If specified, openapi_documents
   * must not be included.
   * </pre>
   *
   * <code>
   * repeated .google.events.cloud.apigateway.v1.ApiConfig.GrpcServiceDefinition grpc_services = 10;
   * </code>
   */
  com.google.events.cloud.apigateway.v1.ApiConfig.GrpcServiceDefinitionOrBuilder
      getGrpcServicesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Service Configuration files. At least one must be included when
   * using gRPC service definitions. See
   * https://cloud.google.com/endpoints/docs/grpc/grpc-service-config#service_configuration_overview
   * for the expected file contents.
   * If multiple files are specified, the files are merged with the following
   * rules:
   * * All singular scalar fields are merged using "last one wins" semantics in
   * the order of the files uploaded.
   * * Repeated fields are concatenated.
   * * Singular embedded messages are merged using these rules for nested
   * fields.
   * </pre>
   *
   * <code>repeated .google.events.cloud.apigateway.v1.ApiConfig.File managed_service_configs = 11;
   * </code>
   */
  java.util.List<com.google.events.cloud.apigateway.v1.ApiConfig.File>
      getManagedServiceConfigsList();

  /**
   *
   *
   * <pre>
   * Optional. Service Configuration files. At least one must be included when
   * using gRPC service definitions. See
   * https://cloud.google.com/endpoints/docs/grpc/grpc-service-config#service_configuration_overview
   * for the expected file contents.
   * If multiple files are specified, the files are merged with the following
   * rules:
   * * All singular scalar fields are merged using "last one wins" semantics in
   * the order of the files uploaded.
   * * Repeated fields are concatenated.
   * * Singular embedded messages are merged using these rules for nested
   * fields.
   * </pre>
   *
   * <code>repeated .google.events.cloud.apigateway.v1.ApiConfig.File managed_service_configs = 11;
   * </code>
   */
  com.google.events.cloud.apigateway.v1.ApiConfig.File getManagedServiceConfigs(int index);

  /**
   *
   *
   * <pre>
   * Optional. Service Configuration files. At least one must be included when
   * using gRPC service definitions. See
   * https://cloud.google.com/endpoints/docs/grpc/grpc-service-config#service_configuration_overview
   * for the expected file contents.
   * If multiple files are specified, the files are merged with the following
   * rules:
   * * All singular scalar fields are merged using "last one wins" semantics in
   * the order of the files uploaded.
   * * Repeated fields are concatenated.
   * * Singular embedded messages are merged using these rules for nested
   * fields.
   * </pre>
   *
   * <code>repeated .google.events.cloud.apigateway.v1.ApiConfig.File managed_service_configs = 11;
   * </code>
   */
  int getManagedServiceConfigsCount();

  /**
   *
   *
   * <pre>
   * Optional. Service Configuration files. At least one must be included when
   * using gRPC service definitions. See
   * https://cloud.google.com/endpoints/docs/grpc/grpc-service-config#service_configuration_overview
   * for the expected file contents.
   * If multiple files are specified, the files are merged with the following
   * rules:
   * * All singular scalar fields are merged using "last one wins" semantics in
   * the order of the files uploaded.
   * * Repeated fields are concatenated.
   * * Singular embedded messages are merged using these rules for nested
   * fields.
   * </pre>
   *
   * <code>repeated .google.events.cloud.apigateway.v1.ApiConfig.File managed_service_configs = 11;
   * </code>
   */
  java.util.List<? extends com.google.events.cloud.apigateway.v1.ApiConfig.FileOrBuilder>
      getManagedServiceConfigsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Optional. Service Configuration files. At least one must be included when
   * using gRPC service definitions. See
   * https://cloud.google.com/endpoints/docs/grpc/grpc-service-config#service_configuration_overview
   * for the expected file contents.
   * If multiple files are specified, the files are merged with the following
   * rules:
   * * All singular scalar fields are merged using "last one wins" semantics in
   * the order of the files uploaded.
   * * Repeated fields are concatenated.
   * * Singular embedded messages are merged using these rules for nested
   * fields.
   * </pre>
   *
   * <code>repeated .google.events.cloud.apigateway.v1.ApiConfig.File managed_service_configs = 11;
   * </code>
   */
  com.google.events.cloud.apigateway.v1.ApiConfig.FileOrBuilder getManagedServiceConfigsOrBuilder(
      int index);
}
