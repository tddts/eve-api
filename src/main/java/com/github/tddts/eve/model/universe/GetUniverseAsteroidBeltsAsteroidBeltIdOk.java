package com.github.tddts.eve.model.universe;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@Validated
public class GetUniverseAsteroidBeltsAsteroidBeltIdOk {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("position")
  private GetUniverseAsteroidBeltsAsteroidBeltIdPosition position = null;

  @JsonProperty("system_id")
  private Integer systemId = null;

  public GetUniverseAsteroidBeltsAsteroidBeltIdOk name(String name) {
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

  public GetUniverseAsteroidBeltsAsteroidBeltIdOk position(GetUniverseAsteroidBeltsAsteroidBeltIdPosition position) {
    this.position = position;
    return this;
  }

  /**
   * Get position
   *
   * @return position
   **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public GetUniverseAsteroidBeltsAsteroidBeltIdPosition getPosition() {
    return position;
  }

  public void setPosition(GetUniverseAsteroidBeltsAsteroidBeltIdPosition position) {
    this.position = position;
  }

  public GetUniverseAsteroidBeltsAsteroidBeltIdOk systemId(Integer systemId) {
    this.systemId = systemId;
    return this;
  }

  /**
   * The solar system this asteroid belt is in
   *
   * @return systemId
   **/
  @ApiModelProperty(required = true, value = "The solar system this asteroid belt is in")
  @NotNull


  public Integer getSystemId() {
    return systemId;
  }

  public void setSystemId(Integer systemId) {
    this.systemId = systemId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseAsteroidBeltsAsteroidBeltIdOk getUniverseAsteroidBeltsAsteroidBeltIdOk = (GetUniverseAsteroidBeltsAsteroidBeltIdOk) o;
    return Objects.equals(this.name, getUniverseAsteroidBeltsAsteroidBeltIdOk.name) &&
        Objects.equals(this.position, getUniverseAsteroidBeltsAsteroidBeltIdOk.position) &&
        Objects.equals(this.systemId, getUniverseAsteroidBeltsAsteroidBeltIdOk.systemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, position, systemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseAsteroidBeltsAsteroidBeltIdOk {\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
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

