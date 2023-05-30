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

// Code generated by protoc-gen-java-snowpea. DO NOT EDIT.

package com.google.events.cloud.video.transcoder.v1;

import static org.junit.Assert.assertTrue;

import com.google.protobuf.util.JsonFormat;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.Test;

public class JobTemplateEventDataTest {
  @Test
  public void testStrictUnmarshal() throws Exception {
    for (String file : getDataFiles("JobTemplateEventData")) {
      System.out.println(file);
      String json = readFileAsString(file);
      JobTemplateEventData.Builder builder = JobTemplateEventData.newBuilder();
      JsonFormat.parser().merge(json, builder);
      JobTemplateEventData data = builder.build();
      assertTrue(data != null);
    }
  }

  @Test
  public void testUnmarshal() throws Exception {
    for (String file : getDataFiles("JobTemplateEventData")) {
      System.out.println(file);
      String json = readFileAsString(file);
      JobTemplateEventData.Builder builder = JobTemplateEventData.newBuilder();
      JsonFormat.parser().ignoringUnknownFields().merge(json, builder);
      JobTemplateEventData data = builder.build();
      assertTrue(data != null);
    }
  }

  String testDataPath =
      System.getenv().getOrDefault("TEST_DATA_PATH", "../../google-cloudevents/testdata/");

  public static String readFileAsString(String file) throws Exception {
    return new String(Files.readAllBytes(Paths.get(file)));
  }

  public List<String> getDataFiles(String eventType) throws IOException {
    try (Stream<Path> walk = Files.walk(Paths.get(testDataPath)); ) {
      List<String> result =
          walk.filter(Files::isRegularFile).map(x -> x.toString()).collect(Collectors.toList());
      return result.stream().filter(file -> file.contains(eventType)).collect(Collectors.toList());
    }
  }
}
