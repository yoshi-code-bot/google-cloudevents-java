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
// source: google/events/cloud/dataflow/v1beta3/data.proto

package com.google.events.cloud.dataflow.v1beta3;

public interface JobOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.events.cloud.dataflow.v1beta3.Job)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The unique ID of this job.
   * This field is set by the Cloud Dataflow service when the Job is
   * created, and is immutable for the life of the job.
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The id.
   */
  java.lang.String getId();

  /**
   *
   *
   * <pre>
   * The unique ID of this job.
   * This field is set by the Cloud Dataflow service when the Job is
   * created, and is immutable for the life of the job.
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * The ID of the Cloud Platform project that the job belongs to.
   * </pre>
   *
   * <code>string project_id = 2;</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();

  /**
   *
   *
   * <pre>
   * The ID of the Cloud Platform project that the job belongs to.
   * </pre>
   *
   * <code>string project_id = 2;</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * The user-specified Cloud Dataflow job name.
   * Only one Job with a given name can exist in a project within one region at
   * any given time. Jobs in different regions can have the same name.
   * If a caller attempts to create a Job with the same
   * name as an already-existing Job, the attempt returns the
   * existing Job.
   * The name must match the regular expression
   * `[a-z]([-a-z0-9]{0,1022}[a-z0-9])?`
   * </pre>
   *
   * <code>string name = 3;</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * The user-specified Cloud Dataflow job name.
   * Only one Job with a given name can exist in a project within one region at
   * any given time. Jobs in different regions can have the same name.
   * If a caller attempts to create a Job with the same
   * name as an already-existing Job, the attempt returns the
   * existing Job.
   * The name must match the regular expression
   * `[a-z]([-a-z0-9]{0,1022}[a-z0-9])?`
   * </pre>
   *
   * <code>string name = 3;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The type of Cloud Dataflow job.
   * </pre>
   *
   * <code>.google.events.cloud.dataflow.v1beta3.JobType type = 4;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();

  /**
   *
   *
   * <pre>
   * The type of Cloud Dataflow job.
   * </pre>
   *
   * <code>.google.events.cloud.dataflow.v1beta3.JobType type = 4;</code>
   *
   * @return The type.
   */
  com.google.events.cloud.dataflow.v1beta3.JobType getType();

  /**
   *
   *
   * <pre>
   * The environment for the job.
   * </pre>
   *
   * <code>.google.events.cloud.dataflow.v1beta3.Environment environment = 5;</code>
   *
   * @return Whether the environment field is set.
   */
  boolean hasEnvironment();

  /**
   *
   *
   * <pre>
   * The environment for the job.
   * </pre>
   *
   * <code>.google.events.cloud.dataflow.v1beta3.Environment environment = 5;</code>
   *
   * @return The environment.
   */
  com.google.events.cloud.dataflow.v1beta3.Environment getEnvironment();

  /**
   *
   *
   * <pre>
   * The environment for the job.
   * </pre>
   *
   * <code>.google.events.cloud.dataflow.v1beta3.Environment environment = 5;</code>
   */
  com.google.events.cloud.dataflow.v1beta3.EnvironmentOrBuilder getEnvironmentOrBuilder();

  /**
   *
   *
   * <pre>
   * The Cloud Storage location where the steps are stored.
   * </pre>
   *
   * <code>string steps_location = 24;</code>
   *
   * @return The stepsLocation.
   */
  java.lang.String getStepsLocation();

  /**
   *
   *
   * <pre>
   * The Cloud Storage location where the steps are stored.
   * </pre>
   *
   * <code>string steps_location = 24;</code>
   *
   * @return The bytes for stepsLocation.
   */
  com.google.protobuf.ByteString getStepsLocationBytes();

  /**
   *
   *
   * <pre>
   * The current state of the job.
   * Jobs are created in the `JOB_STATE_STOPPED` state unless otherwise
   * specified.
   * A job in the `JOB_STATE_RUNNING` state may asynchronously enter a
   * terminal state. After a job has reached a terminal state, no
   * further state updates may be made.
   * This field may be mutated by the Cloud Dataflow service;
   * callers cannot mutate it.
   * </pre>
   *
   * <code>.google.events.cloud.dataflow.v1beta3.JobState current_state = 7;</code>
   *
   * @return The enum numeric value on the wire for currentState.
   */
  int getCurrentStateValue();

  /**
   *
   *
   * <pre>
   * The current state of the job.
   * Jobs are created in the `JOB_STATE_STOPPED` state unless otherwise
   * specified.
   * A job in the `JOB_STATE_RUNNING` state may asynchronously enter a
   * terminal state. After a job has reached a terminal state, no
   * further state updates may be made.
   * This field may be mutated by the Cloud Dataflow service;
   * callers cannot mutate it.
   * </pre>
   *
   * <code>.google.events.cloud.dataflow.v1beta3.JobState current_state = 7;</code>
   *
   * @return The currentState.
   */
  com.google.events.cloud.dataflow.v1beta3.JobState getCurrentState();

  /**
   *
   *
   * <pre>
   * The timestamp associated with the current state.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp current_state_time = 8;</code>
   *
   * @return Whether the currentStateTime field is set.
   */
  boolean hasCurrentStateTime();

  /**
   *
   *
   * <pre>
   * The timestamp associated with the current state.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp current_state_time = 8;</code>
   *
   * @return The currentStateTime.
   */
  com.google.protobuf.Timestamp getCurrentStateTime();

  /**
   *
   *
   * <pre>
   * The timestamp associated with the current state.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp current_state_time = 8;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCurrentStateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The job's requested state.
   * `UpdateJob` may be used to switch between the `JOB_STATE_STOPPED` and
   * `JOB_STATE_RUNNING` states, by setting requested_state.  `UpdateJob` may
   * also be used to directly set a job's requested state to
   * `JOB_STATE_CANCELLED` or `JOB_STATE_DONE`, irrevocably terminating the
   * job if it has not already reached a terminal state.
   * </pre>
   *
   * <code>.google.events.cloud.dataflow.v1beta3.JobState requested_state = 9;</code>
   *
   * @return The enum numeric value on the wire for requestedState.
   */
  int getRequestedStateValue();

  /**
   *
   *
   * <pre>
   * The job's requested state.
   * `UpdateJob` may be used to switch between the `JOB_STATE_STOPPED` and
   * `JOB_STATE_RUNNING` states, by setting requested_state.  `UpdateJob` may
   * also be used to directly set a job's requested state to
   * `JOB_STATE_CANCELLED` or `JOB_STATE_DONE`, irrevocably terminating the
   * job if it has not already reached a terminal state.
   * </pre>
   *
   * <code>.google.events.cloud.dataflow.v1beta3.JobState requested_state = 9;</code>
   *
   * @return The requestedState.
   */
  com.google.events.cloud.dataflow.v1beta3.JobState getRequestedState();

  /**
   *
   *
   * <pre>
   * Deprecated.
   * </pre>
   *
   * <code>.google.events.cloud.dataflow.v1beta3.JobExecutionInfo execution_info = 10;</code>
   *
   * @return Whether the executionInfo field is set.
   */
  boolean hasExecutionInfo();

  /**
   *
   *
   * <pre>
   * Deprecated.
   * </pre>
   *
   * <code>.google.events.cloud.dataflow.v1beta3.JobExecutionInfo execution_info = 10;</code>
   *
   * @return The executionInfo.
   */
  com.google.events.cloud.dataflow.v1beta3.JobExecutionInfo getExecutionInfo();

  /**
   *
   *
   * <pre>
   * Deprecated.
   * </pre>
   *
   * <code>.google.events.cloud.dataflow.v1beta3.JobExecutionInfo execution_info = 10;</code>
   */
  com.google.events.cloud.dataflow.v1beta3.JobExecutionInfoOrBuilder getExecutionInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * The timestamp when the job was initially created. Immutable and set by the
   * Cloud Dataflow service.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 11;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * The timestamp when the job was initially created. Immutable and set by the
   * Cloud Dataflow service.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 11;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * The timestamp when the job was initially created. Immutable and set by the
   * Cloud Dataflow service.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 11;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * If this job is an update of an existing job, this field is the job ID
   * of the job it replaced.
   * When sending a `CreateJobRequest`, you can update a job by specifying it
   * here. The job named here is stopped, and its intermediate state is
   * transferred to this job.
   * </pre>
   *
   * <code>string replace_job_id = 12;</code>
   *
   * @return The replaceJobId.
   */
  java.lang.String getReplaceJobId();

  /**
   *
   *
   * <pre>
   * If this job is an update of an existing job, this field is the job ID
   * of the job it replaced.
   * When sending a `CreateJobRequest`, you can update a job by specifying it
   * here. The job named here is stopped, and its intermediate state is
   * transferred to this job.
   * </pre>
   *
   * <code>string replace_job_id = 12;</code>
   *
   * @return The bytes for replaceJobId.
   */
  com.google.protobuf.ByteString getReplaceJobIdBytes();

  /**
   *
   *
   * <pre>
   * The client's unique identifier of the job, re-used across retried attempts.
   * If this field is set, the service will ensure its uniqueness.
   * The request to create a job will fail if the service has knowledge of a
   * previously submitted job with the same client's ID and job name.
   * The caller may use this field to ensure idempotence of job
   * creation across retried attempts to create a job.
   * By default, the field is empty and, in that case, the service ignores it.
   * </pre>
   *
   * <code>string client_request_id = 14;</code>
   *
   * @return The clientRequestId.
   */
  java.lang.String getClientRequestId();

  /**
   *
   *
   * <pre>
   * The client's unique identifier of the job, re-used across retried attempts.
   * If this field is set, the service will ensure its uniqueness.
   * The request to create a job will fail if the service has knowledge of a
   * previously submitted job with the same client's ID and job name.
   * The caller may use this field to ensure idempotence of job
   * creation across retried attempts to create a job.
   * By default, the field is empty and, in that case, the service ignores it.
   * </pre>
   *
   * <code>string client_request_id = 14;</code>
   *
   * @return The bytes for clientRequestId.
   */
  com.google.protobuf.ByteString getClientRequestIdBytes();

  /**
   *
   *
   * <pre>
   * If another job is an update of this job (and thus, this job is in
   * `JOB_STATE_UPDATED`), this field contains the ID of that job.
   * </pre>
   *
   * <code>string replaced_by_job_id = 15;</code>
   *
   * @return The replacedByJobId.
   */
  java.lang.String getReplacedByJobId();

  /**
   *
   *
   * <pre>
   * If another job is an update of this job (and thus, this job is in
   * `JOB_STATE_UPDATED`), this field contains the ID of that job.
   * </pre>
   *
   * <code>string replaced_by_job_id = 15;</code>
   *
   * @return The bytes for replacedByJobId.
   */
  com.google.protobuf.ByteString getReplacedByJobIdBytes();

  /**
   *
   *
   * <pre>
   * A set of files the system should be aware of that are used
   * for temporary storage. These temporary files will be
   * removed on job completion.
   * No duplicates are allowed.
   * No file patterns are supported.
   * The supported files are:
   * Google Cloud Storage:
   *    storage.googleapis.com/{bucket}/{object}
   *    bucket.storage.googleapis.com/{object}
   * </pre>
   *
   * <code>repeated string temp_files = 16;</code>
   *
   * @return A list containing the tempFiles.
   */
  java.util.List<java.lang.String> getTempFilesList();

  /**
   *
   *
   * <pre>
   * A set of files the system should be aware of that are used
   * for temporary storage. These temporary files will be
   * removed on job completion.
   * No duplicates are allowed.
   * No file patterns are supported.
   * The supported files are:
   * Google Cloud Storage:
   *    storage.googleapis.com/{bucket}/{object}
   *    bucket.storage.googleapis.com/{object}
   * </pre>
   *
   * <code>repeated string temp_files = 16;</code>
   *
   * @return The count of tempFiles.
   */
  int getTempFilesCount();

  /**
   *
   *
   * <pre>
   * A set of files the system should be aware of that are used
   * for temporary storage. These temporary files will be
   * removed on job completion.
   * No duplicates are allowed.
   * No file patterns are supported.
   * The supported files are:
   * Google Cloud Storage:
   *    storage.googleapis.com/{bucket}/{object}
   *    bucket.storage.googleapis.com/{object}
   * </pre>
   *
   * <code>repeated string temp_files = 16;</code>
   *
   * @param index The index of the element to return.
   * @return The tempFiles at the given index.
   */
  java.lang.String getTempFiles(int index);

  /**
   *
   *
   * <pre>
   * A set of files the system should be aware of that are used
   * for temporary storage. These temporary files will be
   * removed on job completion.
   * No duplicates are allowed.
   * No file patterns are supported.
   * The supported files are:
   * Google Cloud Storage:
   *    storage.googleapis.com/{bucket}/{object}
   *    bucket.storage.googleapis.com/{object}
   * </pre>
   *
   * <code>repeated string temp_files = 16;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the tempFiles at the given index.
   */
  com.google.protobuf.ByteString getTempFilesBytes(int index);

  /**
   *
   *
   * <pre>
   * User-defined labels for this job.
   * The labels map can contain no more than 64 entries.  Entries of the labels
   * map are UTF8 strings that comply with the following restrictions:
   * * Keys must conform to regexp:  [&#92;p{Ll}&#92;p{Lo}][&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,62}
   * * Values must conform to regexp:  [&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,63}
   * * Both keys and values are additionally constrained to be &lt;= 128 bytes in
   * size.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 17;</code>
   */
  int getLabelsCount();

  /**
   *
   *
   * <pre>
   * User-defined labels for this job.
   * The labels map can contain no more than 64 entries.  Entries of the labels
   * map are UTF8 strings that comply with the following restrictions:
   * * Keys must conform to regexp:  [&#92;p{Ll}&#92;p{Lo}][&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,62}
   * * Values must conform to regexp:  [&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,63}
   * * Both keys and values are additionally constrained to be &lt;= 128 bytes in
   * size.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 17;</code>
   */
  boolean containsLabels(java.lang.String key);

  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();

  /**
   *
   *
   * <pre>
   * User-defined labels for this job.
   * The labels map can contain no more than 64 entries.  Entries of the labels
   * map are UTF8 strings that comply with the following restrictions:
   * * Keys must conform to regexp:  [&#92;p{Ll}&#92;p{Lo}][&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,62}
   * * Values must conform to regexp:  [&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,63}
   * * Both keys and values are additionally constrained to be &lt;= 128 bytes in
   * size.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 17;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();

  /**
   *
   *
   * <pre>
   * User-defined labels for this job.
   * The labels map can contain no more than 64 entries.  Entries of the labels
   * map are UTF8 strings that comply with the following restrictions:
   * * Keys must conform to regexp:  [&#92;p{Ll}&#92;p{Lo}][&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,62}
   * * Values must conform to regexp:  [&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,63}
   * * Both keys and values are additionally constrained to be &lt;= 128 bytes in
   * size.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 17;</code>
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
   * User-defined labels for this job.
   * The labels map can contain no more than 64 entries.  Entries of the labels
   * map are UTF8 strings that comply with the following restrictions:
   * * Keys must conform to regexp:  [&#92;p{Ll}&#92;p{Lo}][&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,62}
   * * Values must conform to regexp:  [&#92;p{Ll}&#92;p{Lo}&#92;p{N}_-]{0,63}
   * * Both keys and values are additionally constrained to be &lt;= 128 bytes in
   * size.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 17;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The [regional endpoint]
   * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
   * contains this job.
   * </pre>
   *
   * <code>string location = 18;</code>
   *
   * @return The location.
   */
  java.lang.String getLocation();

  /**
   *
   *
   * <pre>
   * The [regional endpoint]
   * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
   * contains this job.
   * </pre>
   *
   * <code>string location = 18;</code>
   *
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString getLocationBytes();

  /**
   *
   *
   * <pre>
   * This field may be mutated by the Cloud Dataflow service;
   * callers cannot mutate it.
   * </pre>
   *
   * <code>repeated .google.events.cloud.dataflow.v1beta3.ExecutionStageState stage_states = 20;
   * </code>
   */
  java.util.List<com.google.events.cloud.dataflow.v1beta3.ExecutionStageState> getStageStatesList();

  /**
   *
   *
   * <pre>
   * This field may be mutated by the Cloud Dataflow service;
   * callers cannot mutate it.
   * </pre>
   *
   * <code>repeated .google.events.cloud.dataflow.v1beta3.ExecutionStageState stage_states = 20;
   * </code>
   */
  com.google.events.cloud.dataflow.v1beta3.ExecutionStageState getStageStates(int index);

  /**
   *
   *
   * <pre>
   * This field may be mutated by the Cloud Dataflow service;
   * callers cannot mutate it.
   * </pre>
   *
   * <code>repeated .google.events.cloud.dataflow.v1beta3.ExecutionStageState stage_states = 20;
   * </code>
   */
  int getStageStatesCount();

  /**
   *
   *
   * <pre>
   * This field may be mutated by the Cloud Dataflow service;
   * callers cannot mutate it.
   * </pre>
   *
   * <code>repeated .google.events.cloud.dataflow.v1beta3.ExecutionStageState stage_states = 20;
   * </code>
   */
  java.util.List<? extends com.google.events.cloud.dataflow.v1beta3.ExecutionStageStateOrBuilder>
      getStageStatesOrBuilderList();

  /**
   *
   *
   * <pre>
   * This field may be mutated by the Cloud Dataflow service;
   * callers cannot mutate it.
   * </pre>
   *
   * <code>repeated .google.events.cloud.dataflow.v1beta3.ExecutionStageState stage_states = 20;
   * </code>
   */
  com.google.events.cloud.dataflow.v1beta3.ExecutionStageStateOrBuilder getStageStatesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * This field is populated by the Dataflow service to support filtering jobs
   * by the metadata values provided here. Populated for ListJobs and all GetJob
   * views SUMMARY and higher.
   * </pre>
   *
   * <code>.google.events.cloud.dataflow.v1beta3.JobMetadata job_metadata = 21;</code>
   *
   * @return Whether the jobMetadata field is set.
   */
  boolean hasJobMetadata();

  /**
   *
   *
   * <pre>
   * This field is populated by the Dataflow service to support filtering jobs
   * by the metadata values provided here. Populated for ListJobs and all GetJob
   * views SUMMARY and higher.
   * </pre>
   *
   * <code>.google.events.cloud.dataflow.v1beta3.JobMetadata job_metadata = 21;</code>
   *
   * @return The jobMetadata.
   */
  com.google.events.cloud.dataflow.v1beta3.JobMetadata getJobMetadata();

  /**
   *
   *
   * <pre>
   * This field is populated by the Dataflow service to support filtering jobs
   * by the metadata values provided here. Populated for ListJobs and all GetJob
   * views SUMMARY and higher.
   * </pre>
   *
   * <code>.google.events.cloud.dataflow.v1beta3.JobMetadata job_metadata = 21;</code>
   */
  com.google.events.cloud.dataflow.v1beta3.JobMetadataOrBuilder getJobMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * The timestamp when the job was started (transitioned to JOB_STATE_PENDING).
   * Flexible resource scheduling jobs are started with some delay after job
   * creation, so start_time is unset before start and is updated when the
   * job is started by the Cloud Dataflow service. For other jobs, start_time
   * always equals to create_time and is immutable and set by the Cloud Dataflow
   * service.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 22;</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();

  /**
   *
   *
   * <pre>
   * The timestamp when the job was started (transitioned to JOB_STATE_PENDING).
   * Flexible resource scheduling jobs are started with some delay after job
   * creation, so start_time is unset before start and is updated when the
   * job is started by the Cloud Dataflow service. For other jobs, start_time
   * always equals to create_time and is immutable and set by the Cloud Dataflow
   * service.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 22;</code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();

  /**
   *
   *
   * <pre>
   * The timestamp when the job was started (transitioned to JOB_STATE_PENDING).
   * Flexible resource scheduling jobs are started with some delay after job
   * creation, so start_time is unset before start and is updated when the
   * job is started by the Cloud Dataflow service. For other jobs, start_time
   * always equals to create_time and is immutable and set by the Cloud Dataflow
   * service.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 22;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * If this is specified, the job's initial state is populated from the given
   * snapshot.
   * </pre>
   *
   * <code>string created_from_snapshot_id = 23;</code>
   *
   * @return The createdFromSnapshotId.
   */
  java.lang.String getCreatedFromSnapshotId();

  /**
   *
   *
   * <pre>
   * If this is specified, the job's initial state is populated from the given
   * snapshot.
   * </pre>
   *
   * <code>string created_from_snapshot_id = 23;</code>
   *
   * @return The bytes for createdFromSnapshotId.
   */
  com.google.protobuf.ByteString getCreatedFromSnapshotIdBytes();

  /**
   *
   *
   * <pre>
   * Reserved for future use. This field is set only in responses from the
   * server; it is ignored if it is set in any requests.
   * </pre>
   *
   * <code>bool satisfies_pzs = 25;</code>
   *
   * @return The satisfiesPzs.
   */
  boolean getSatisfiesPzs();
}
