
package io.cloudio.util;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import io.cloudio.messages.OracleSettings;
import io.cloudio.messages.OracleTaskRequest;
import io.cloudio.messages.Settings;
import io.cloudio.messages.TaskRequest;
import io.cloudio.task.TransformSettings;

public class GsonUtil {

  static Gson gson = new Gson();

  public static TaskRequest<Settings> getEventObject(String json) {

    Type settingsType = new TypeToken<TaskRequest<Settings>>() {
    }.getType();

    TaskRequest<Settings> event = gson.fromJson(json, settingsType);
    return event;
  }

  public static TaskRequest<Settings> getTransformTaskRequest(String json) {

    Type settingsType = new TypeToken<TaskRequest<TransformSettings>>() {
    }.getType();

    TaskRequest<Settings> event = gson.fromJson(json, settingsType);
    return event;
  }

  public static OracleTaskRequest<OracleSettings> getOralceTaskRequestEvent(String json) {
    Type dbSettingsType = new TypeToken<OracleTaskRequest<OracleSettings>>() {
    }.getType();

    OracleTaskRequest<OracleSettings> event = gson.fromJson(json, dbSettingsType);
    return event;
  }
}
