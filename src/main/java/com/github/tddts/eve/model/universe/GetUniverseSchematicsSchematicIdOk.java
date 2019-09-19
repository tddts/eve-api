package com.github.tddts.eve.model.universe;

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
public class GetUniverseSchematicsSchematicIdOk {
  @JsonProperty("cycle_time")
  private Integer cycleTime = null;

  @JsonProperty("schematic_name")
  private String schematicName = null;

  public GetUniverseSchematicsSchematicIdOk cycleTime(Integer cycleTime) {
    this.cycleTime = cycleTime;
    return this;
  }

  /**
   * Time in seconds to process a run
   *
   * @return cycleTime
   **/
  @ApiModelProperty(required = true, value = "Time in seconds to process a run")
  @NotNull


  public Integer getCycleTime() {
    return cycleTime;
  }

  public void setCycleTime(Integer cycleTime) {
    this.cycleTime = cycleTime;
  }

  public GetUniverseSchematicsSchematicIdOk schematicName(String schematicName) {
    this.schematicName = schematicName;
    return this;
  }

  /**
   * schematic_name string
   *
   * @return schematicName
   **/
  @ApiModelProperty(required = true, value = "schematic_name string")
  @NotNull


  public String getSchematicName() {
    return schematicName;
  }

  public void setSchematicName(String schematicName) {
    this.schematicName = schematicName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseSchematicsSchematicIdOk getUniverseSchematicsSchematicIdOk = (GetUniverseSchematicsSchematicIdOk) o;
    return Objects.equals(this.cycleTime, getUniverseSchematicsSchematicIdOk.cycleTime) &&
        Objects.equals(this.schematicName, getUniverseSchematicsSchematicIdOk.schematicName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cycleTime, schematicName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseSchematicsSchematicIdOk {\n");

    sb.append("    cycleTime: ").append(toIndentedString(cycleTime)).append("\n");
    sb.append("    schematicName: ").append(toIndentedString(schematicName)).append("\n");
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

