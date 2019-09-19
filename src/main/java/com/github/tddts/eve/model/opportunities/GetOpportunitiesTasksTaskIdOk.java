package com.github.tddts.eve.model.opportunities;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@Validated
public class GetOpportunitiesTasksTaskIdOk {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("notification")
  private String notification = null;

  @JsonProperty("task_id")
  private Integer taskId = null;

  public GetOpportunitiesTasksTaskIdOk description(String description) {
    this.description = description;
    return this;
  }

  /**
   * description string
   *
   * @return description
   **/
  @ApiModelProperty(required = true, value = "description string")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GetOpportunitiesTasksTaskIdOk name(String name) {
    this.name = name;
    return this;
  }

  /**
   * name string
   *
   * @return name
   **/
  @ApiModelProperty(required = true, value = "name string")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetOpportunitiesTasksTaskIdOk notification(String notification) {
    this.notification = notification;
    return this;
  }

  /**
   * notification string
   *
   * @return notification
   **/
  @ApiModelProperty(required = true, value = "notification string")
  @NotNull


  public String getNotification() {
    return notification;
  }

  public void setNotification(String notification) {
    this.notification = notification;
  }

  public GetOpportunitiesTasksTaskIdOk taskId(Integer taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * task_id integer
   *
   * @return taskId
   **/
  @ApiModelProperty(required = true, value = "task_id integer")
  @NotNull


  public Integer getTaskId() {
    return taskId;
  }

  public void setTaskId(Integer taskId) {
    this.taskId = taskId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOpportunitiesTasksTaskIdOk getOpportunitiesTasksTaskIdOk = (GetOpportunitiesTasksTaskIdOk) o;
    return Objects.equals(this.description, getOpportunitiesTasksTaskIdOk.description) &&
        Objects.equals(this.name, getOpportunitiesTasksTaskIdOk.name) &&
        Objects.equals(this.notification, getOpportunitiesTasksTaskIdOk.notification) &&
        Objects.equals(this.taskId, getOpportunitiesTasksTaskIdOk.taskId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, notification, taskId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOpportunitiesTasksTaskIdOk {\n");

    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

