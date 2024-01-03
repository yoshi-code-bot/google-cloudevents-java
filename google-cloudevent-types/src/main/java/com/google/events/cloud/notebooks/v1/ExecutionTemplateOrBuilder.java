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
// source: google/events/cloud/notebooks/v1/data.proto

package com.google.events.cloud.notebooks.v1;

public interface ExecutionTemplateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.notebooks.v1.ExecutionTemplate)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Scale tier of the hardware used for notebook execution.
   * DEPRECATED Will be discontinued. As right now only CUSTOM is supported.
   * </pre>
   *
   * <code>.google.events.cloud.notebooks.v1.ExecutionTemplate.ScaleTier scale_tier = 1;</code>
   *
   * @return The enum numeric value on the wire for scaleTier.
   */
  int getScaleTierValue();

  /**
   *
   *
   * <pre>
   * Required. Scale tier of the hardware used for notebook execution.
   * DEPRECATED Will be discontinued. As right now only CUSTOM is supported.
   * </pre>
   *
   * <code>.google.events.cloud.notebooks.v1.ExecutionTemplate.ScaleTier scale_tier = 1;</code>
   *
   * @return The scaleTier.
   */
  com.google.events.cloud.notebooks.v1.ExecutionTemplate.ScaleTier getScaleTier();

  /**
   *
   *
   * <pre>
   * Specifies the type of virtual machine to use for your training
   * job's master worker. You must specify this field when `scaleTier` is set to
   * `CUSTOM`.
   * You can use certain Compute Engine machine types directly in this field.
   * The following types are supported:
   * - `n1-standard-4`
   * - `n1-standard-8`
   * - `n1-standard-16`
   * - `n1-standard-32`
   * - `n1-standard-64`
   * - `n1-standard-96`
   * - `n1-highmem-2`
   * - `n1-highmem-4`
   * - `n1-highmem-8`
   * - `n1-highmem-16`
   * - `n1-highmem-32`
   * - `n1-highmem-64`
   * - `n1-highmem-96`
   * - `n1-highcpu-16`
   * - `n1-highcpu-32`
   * - `n1-highcpu-64`
   * - `n1-highcpu-96`
   * Alternatively, you can use the following legacy machine types:
   * - `standard`
   * - `large_model`
   * - `complex_model_s`
   * - `complex_model_m`
   * - `complex_model_l`
   * - `standard_gpu`
   * - `complex_model_m_gpu`
   * - `complex_model_l_gpu`
   * - `standard_p100`
   * - `complex_model_m_p100`
   * - `standard_v100`
   * - `large_model_v100`
   * - `complex_model_m_v100`
   * - `complex_model_l_v100`
   * Finally, if you want to use a TPU for training, specify `cloud_tpu` in this
   * field. Learn more about the [special configuration options for training
   * with
   * TPU](https://cloud.google.com/ai-platform/training/docs/using-tpus#configuring_a_custom_tpu_machine).
   * </pre>
   *
   * <code>string master_type = 2;</code>
   *
   * @return The masterType.
   */
  java.lang.String getMasterType();

  /**
   *
   *
   * <pre>
   * Specifies the type of virtual machine to use for your training
   * job's master worker. You must specify this field when `scaleTier` is set to
   * `CUSTOM`.
   * You can use certain Compute Engine machine types directly in this field.
   * The following types are supported:
   * - `n1-standard-4`
   * - `n1-standard-8`
   * - `n1-standard-16`
   * - `n1-standard-32`
   * - `n1-standard-64`
   * - `n1-standard-96`
   * - `n1-highmem-2`
   * - `n1-highmem-4`
   * - `n1-highmem-8`
   * - `n1-highmem-16`
   * - `n1-highmem-32`
   * - `n1-highmem-64`
   * - `n1-highmem-96`
   * - `n1-highcpu-16`
   * - `n1-highcpu-32`
   * - `n1-highcpu-64`
   * - `n1-highcpu-96`
   * Alternatively, you can use the following legacy machine types:
   * - `standard`
   * - `large_model`
   * - `complex_model_s`
   * - `complex_model_m`
   * - `complex_model_l`
   * - `standard_gpu`
   * - `complex_model_m_gpu`
   * - `complex_model_l_gpu`
   * - `standard_p100`
   * - `complex_model_m_p100`
   * - `standard_v100`
   * - `large_model_v100`
   * - `complex_model_m_v100`
   * - `complex_model_l_v100`
   * Finally, if you want to use a TPU for training, specify `cloud_tpu` in this
   * field. Learn more about the [special configuration options for training
   * with
   * TPU](https://cloud.google.com/ai-platform/training/docs/using-tpus#configuring_a_custom_tpu_machine).
   * </pre>
   *
   * <code>string master_type = 2;</code>
   *
   * @return The bytes for masterType.
   */
  com.google.protobuf.ByteString getMasterTypeBytes();

  /**
   *
   *
   * <pre>
   * Configuration (count and accelerator type) for hardware running notebook
   * execution.
   * </pre>
   *
   * <code>
   * .google.events.cloud.notebooks.v1.ExecutionTemplate.SchedulerAcceleratorConfig accelerator_config = 3;
   * </code>
   *
   * @return Whether the acceleratorConfig field is set.
   */
  boolean hasAcceleratorConfig();

  /**
   *
   *
   * <pre>
   * Configuration (count and accelerator type) for hardware running notebook
   * execution.
   * </pre>
   *
   * <code>
   * .google.events.cloud.notebooks.v1.ExecutionTemplate.SchedulerAcceleratorConfig accelerator_config = 3;
   * </code>
   *
   * @return The acceleratorConfig.
   */
  com.google.events.cloud.notebooks.v1.ExecutionTemplate.SchedulerAcceleratorConfig
      getAcceleratorConfig();

  /**
   *
   *
   * <pre>
   * Configuration (count and accelerator type) for hardware running notebook
   * execution.
   * </pre>
   *
   * <code>
   * .google.events.cloud.notebooks.v1.ExecutionTemplate.SchedulerAcceleratorConfig accelerator_config = 3;
   * </code>
   */
  com.google.events.cloud.notebooks.v1.ExecutionTemplate.SchedulerAcceleratorConfigOrBuilder
      getAcceleratorConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Labels for execution.
   * If execution is scheduled, a field included will be 'nbs-scheduled'.
   * Otherwise, it is an immediate execution, and an included field will be
   * 'nbs-immediate'. Use fields to efficiently index between various types of
   * executions.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();

  /**
   *
   *
   * <pre>
   * Labels for execution.
   * If execution is scheduled, a field included will be 'nbs-scheduled'.
   * Otherwise, it is an immediate execution, and an included field will be
   * 'nbs-immediate'. Use fields to efficiently index between various types of
   * executions.
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
   * Labels for execution.
   * If execution is scheduled, a field included will be 'nbs-scheduled'.
   * Otherwise, it is an immediate execution, and an included field will be
   * 'nbs-immediate'. Use fields to efficiently index between various types of
   * executions.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();

  /**
   *
   *
   * <pre>
   * Labels for execution.
   * If execution is scheduled, a field included will be 'nbs-scheduled'.
   * Otherwise, it is an immediate execution, and an included field will be
   * 'nbs-immediate'. Use fields to efficiently index between various types of
   * executions.
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
   * Labels for execution.
   * If execution is scheduled, a field included will be 'nbs-scheduled'.
   * Otherwise, it is an immediate execution, and an included field will be
   * 'nbs-immediate'. Use fields to efficiently index between various types of
   * executions.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Path to the notebook file to execute.
   * Must be in a Google Cloud Storage bucket.
   * Format: `gs://{bucket_name}/{folder}/{notebook_file_name}`
   * Ex: `gs://notebook_user/scheduled_notebooks/sentiment_notebook.ipynb`
   * </pre>
   *
   * <code>string input_notebook_file = 5;</code>
   *
   * @return The inputNotebookFile.
   */
  java.lang.String getInputNotebookFile();

  /**
   *
   *
   * <pre>
   * Path to the notebook file to execute.
   * Must be in a Google Cloud Storage bucket.
   * Format: `gs://{bucket_name}/{folder}/{notebook_file_name}`
   * Ex: `gs://notebook_user/scheduled_notebooks/sentiment_notebook.ipynb`
   * </pre>
   *
   * <code>string input_notebook_file = 5;</code>
   *
   * @return The bytes for inputNotebookFile.
   */
  com.google.protobuf.ByteString getInputNotebookFileBytes();

  /**
   *
   *
   * <pre>
   * Container Image URI to a DLVM
   * Example: 'gcr.io/deeplearning-platform-release/base-cu100'
   * More examples can be found at:
   * https://cloud.google.com/ai-platform/deep-learning-containers/docs/choosing-container
   * </pre>
   *
   * <code>string container_image_uri = 6;</code>
   *
   * @return The containerImageUri.
   */
  java.lang.String getContainerImageUri();

  /**
   *
   *
   * <pre>
   * Container Image URI to a DLVM
   * Example: 'gcr.io/deeplearning-platform-release/base-cu100'
   * More examples can be found at:
   * https://cloud.google.com/ai-platform/deep-learning-containers/docs/choosing-container
   * </pre>
   *
   * <code>string container_image_uri = 6;</code>
   *
   * @return The bytes for containerImageUri.
   */
  com.google.protobuf.ByteString getContainerImageUriBytes();

  /**
   *
   *
   * <pre>
   * Path to the notebook folder to write to.
   * Must be in a Google Cloud Storage bucket path.
   * Format: `gs://{bucket_name}/{folder}`
   * Ex: `gs://notebook_user/scheduled_notebooks`
   * </pre>
   *
   * <code>string output_notebook_folder = 7;</code>
   *
   * @return The outputNotebookFolder.
   */
  java.lang.String getOutputNotebookFolder();

  /**
   *
   *
   * <pre>
   * Path to the notebook folder to write to.
   * Must be in a Google Cloud Storage bucket path.
   * Format: `gs://{bucket_name}/{folder}`
   * Ex: `gs://notebook_user/scheduled_notebooks`
   * </pre>
   *
   * <code>string output_notebook_folder = 7;</code>
   *
   * @return The bytes for outputNotebookFolder.
   */
  com.google.protobuf.ByteString getOutputNotebookFolderBytes();

  /**
   *
   *
   * <pre>
   * Parameters to be overridden in the notebook during execution.
   * Ref https://papermill.readthedocs.io/en/latest/usage-parameterize.html on
   * how to specifying parameters in the input notebook and pass them here
   * in an YAML file.
   * Ex: `gs://notebook_user/scheduled_notebooks/sentiment_notebook_params.yaml`
   * </pre>
   *
   * <code>string params_yaml_file = 8;</code>
   *
   * @return The paramsYamlFile.
   */
  java.lang.String getParamsYamlFile();

  /**
   *
   *
   * <pre>
   * Parameters to be overridden in the notebook during execution.
   * Ref https://papermill.readthedocs.io/en/latest/usage-parameterize.html on
   * how to specifying parameters in the input notebook and pass them here
   * in an YAML file.
   * Ex: `gs://notebook_user/scheduled_notebooks/sentiment_notebook_params.yaml`
   * </pre>
   *
   * <code>string params_yaml_file = 8;</code>
   *
   * @return The bytes for paramsYamlFile.
   */
  com.google.protobuf.ByteString getParamsYamlFileBytes();

  /**
   *
   *
   * <pre>
   * Parameters used within the 'input_notebook_file' notebook.
   * </pre>
   *
   * <code>string parameters = 9;</code>
   *
   * @return The parameters.
   */
  java.lang.String getParameters();

  /**
   *
   *
   * <pre>
   * Parameters used within the 'input_notebook_file' notebook.
   * </pre>
   *
   * <code>string parameters = 9;</code>
   *
   * @return The bytes for parameters.
   */
  com.google.protobuf.ByteString getParametersBytes();

  /**
   *
   *
   * <pre>
   * The email address of a service account to use when running the execution.
   * You must have the `iam.serviceAccounts.actAs` permission for the specified
   * service account.
   * </pre>
   *
   * <code>string service_account = 10;</code>
   *
   * @return The serviceAccount.
   */
  java.lang.String getServiceAccount();

  /**
   *
   *
   * <pre>
   * The email address of a service account to use when running the execution.
   * You must have the `iam.serviceAccounts.actAs` permission for the specified
   * service account.
   * </pre>
   *
   * <code>string service_account = 10;</code>
   *
   * @return The bytes for serviceAccount.
   */
  com.google.protobuf.ByteString getServiceAccountBytes();

  /**
   *
   *
   * <pre>
   * The type of Job to be used on this execution.
   * </pre>
   *
   * <code>.google.events.cloud.notebooks.v1.ExecutionTemplate.JobType job_type = 11;</code>
   *
   * @return The enum numeric value on the wire for jobType.
   */
  int getJobTypeValue();

  /**
   *
   *
   * <pre>
   * The type of Job to be used on this execution.
   * </pre>
   *
   * <code>.google.events.cloud.notebooks.v1.ExecutionTemplate.JobType job_type = 11;</code>
   *
   * @return The jobType.
   */
  com.google.events.cloud.notebooks.v1.ExecutionTemplate.JobType getJobType();

  /**
   *
   *
   * <pre>
   * Parameters used in Dataproc JobType executions.
   * </pre>
   *
   * <code>
   * .google.events.cloud.notebooks.v1.ExecutionTemplate.DataprocParameters dataproc_parameters = 12;
   * </code>
   *
   * @return Whether the dataprocParameters field is set.
   */
  boolean hasDataprocParameters();

  /**
   *
   *
   * <pre>
   * Parameters used in Dataproc JobType executions.
   * </pre>
   *
   * <code>
   * .google.events.cloud.notebooks.v1.ExecutionTemplate.DataprocParameters dataproc_parameters = 12;
   * </code>
   *
   * @return The dataprocParameters.
   */
  com.google.events.cloud.notebooks.v1.ExecutionTemplate.DataprocParameters getDataprocParameters();

  /**
   *
   *
   * <pre>
   * Parameters used in Dataproc JobType executions.
   * </pre>
   *
   * <code>
   * .google.events.cloud.notebooks.v1.ExecutionTemplate.DataprocParameters dataproc_parameters = 12;
   * </code>
   */
  com.google.events.cloud.notebooks.v1.ExecutionTemplate.DataprocParametersOrBuilder
      getDataprocParametersOrBuilder();

  /**
   *
   *
   * <pre>
   * Parameters used in Vertex AI JobType executions.
   * </pre>
   *
   * <code>
   * .google.events.cloud.notebooks.v1.ExecutionTemplate.VertexAIParameters vertex_ai_parameters = 13;
   * </code>
   *
   * @return Whether the vertexAiParameters field is set.
   */
  boolean hasVertexAiParameters();

  /**
   *
   *
   * <pre>
   * Parameters used in Vertex AI JobType executions.
   * </pre>
   *
   * <code>
   * .google.events.cloud.notebooks.v1.ExecutionTemplate.VertexAIParameters vertex_ai_parameters = 13;
   * </code>
   *
   * @return The vertexAiParameters.
   */
  com.google.events.cloud.notebooks.v1.ExecutionTemplate.VertexAIParameters getVertexAiParameters();

  /**
   *
   *
   * <pre>
   * Parameters used in Vertex AI JobType executions.
   * </pre>
   *
   * <code>
   * .google.events.cloud.notebooks.v1.ExecutionTemplate.VertexAIParameters vertex_ai_parameters = 13;
   * </code>
   */
  com.google.events.cloud.notebooks.v1.ExecutionTemplate.VertexAIParametersOrBuilder
      getVertexAiParametersOrBuilder();

  /**
   *
   *
   * <pre>
   * Name of the kernel spec to use. This must be specified if the
   * kernel spec name on the execution target does not match the name in the
   * input notebook file.
   * </pre>
   *
   * <code>string kernel_spec = 14;</code>
   *
   * @return The kernelSpec.
   */
  java.lang.String getKernelSpec();

  /**
   *
   *
   * <pre>
   * Name of the kernel spec to use. This must be specified if the
   * kernel spec name on the execution target does not match the name in the
   * input notebook file.
   * </pre>
   *
   * <code>string kernel_spec = 14;</code>
   *
   * @return The bytes for kernelSpec.
   */
  com.google.protobuf.ByteString getKernelSpecBytes();

  /**
   *
   *
   * <pre>
   * The name of a Vertex AI [Tensorboard] resource to which this execution
   * will upload Tensorboard logs.
   * Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}`
   * </pre>
   *
   * <code>string tensorboard = 15;</code>
   *
   * @return The tensorboard.
   */
  java.lang.String getTensorboard();

  /**
   *
   *
   * <pre>
   * The name of a Vertex AI [Tensorboard] resource to which this execution
   * will upload Tensorboard logs.
   * Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}`
   * </pre>
   *
   * <code>string tensorboard = 15;</code>
   *
   * @return The bytes for tensorboard.
   */
  com.google.protobuf.ByteString getTensorboardBytes();

  public com.google.events.cloud.notebooks.v1.ExecutionTemplate.JobParametersCase
      getJobParametersCase();
}
