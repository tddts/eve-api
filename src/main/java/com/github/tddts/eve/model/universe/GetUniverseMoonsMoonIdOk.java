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
public class GetUniverseMoonsMoonIdOk {
  @JsonProperty("moon_id")
  private Integer moonId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("position")
  private GetUniverseMoonsMoonIdPosition position = null;

  @JsonProperty("system_id")
  private Integer systemId = null;

  public GetUniverseMoonsMoonIdOk moonId(Integer moonId) {
    this.moonId = moonId;
    return this;
  }

  /**
   * moon_id integer
   *
   * @return moonId
   **/
  @ApiModelProperty(required = true, value = "moon_id integer")
  @NotNull


  public Integer getMoonId() {
    return moonId;
  }

  public void setMoonId(Integer moonId) {
    this.moonId = moonId;
  }

  public GetUniverseMoonsMoonIdOk name(String name) {
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

  public GetUniverseMoonsMoonIdOk position(GetUniverseMoonsMoonIdPosition position) {
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

  public GetUniverseMoonsMoonIdPosition getPosition() {
    return position;
  }

  public void setPosition(GetUniverseMoonsMoonIdPosition position) {
    this.position = position;
  }

  public GetUniverseMoonsMoonIdOk systemId(Integer systemId) {
    this.systemId = systemId;
    return this;
  }

  /**
   * The solar system this moon is in
   *
   * @return systemId
   **/
  @ApiModelProperty(required = true, value = "The solar system this moon is in")
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
    GetUniverseMoonsMoonIdOk getUniverseMoonsMoonIdOk = (GetUniverseMoonsMoonIdOk) o;
    return Objects.equals(this.moonId, getUniverseMoonsMoonIdOk.moonId) &&
        Objects.equals(this.name, getUniverseMoonsMoonIdOk.name) &&
        Objects.equals(this.position, getUniverseMoonsMoonIdOk.position) &&
        Objects.equals(this.systemId, getUniverseMoonsMoonIdOk.systemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(moonId, name, position, systemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseMoonsMoonIdOk {\n");

    sb.append("    moonId: ").append(toIndentedString(moonId)).append("\n");
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

