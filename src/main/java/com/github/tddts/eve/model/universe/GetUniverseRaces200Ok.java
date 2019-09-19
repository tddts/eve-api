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
public class GetUniverseRaces200Ok {
  @JsonProperty("alliance_id")
  private Integer allianceId = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("race_id")
  private Integer raceId = null;

  public GetUniverseRaces200Ok allianceId(Integer allianceId) {
    this.allianceId = allianceId;
    return this;
  }

  /**
   * The alliance generally associated with this race
   *
   * @return allianceId
   **/
  @ApiModelProperty(required = true, value = "The alliance generally associated with this race")
  @NotNull


  public Integer getAllianceId() {
    return allianceId;
  }

  public void setAllianceId(Integer allianceId) {
    this.allianceId = allianceId;
  }

  public GetUniverseRaces200Ok description(String description) {
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

  public GetUniverseRaces200Ok name(String name) {
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

  public GetUniverseRaces200Ok raceId(Integer raceId) {
    this.raceId = raceId;
    return this;
  }

  /**
   * race_id integer
   *
   * @return raceId
   **/
  @ApiModelProperty(required = true, value = "race_id integer")
  @NotNull


  public Integer getRaceId() {
    return raceId;
  }

  public void setRaceId(Integer raceId) {
    this.raceId = raceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseRaces200Ok getUniverseRaces200Ok = (GetUniverseRaces200Ok) o;
    return Objects.equals(this.allianceId, getUniverseRaces200Ok.allianceId) &&
        Objects.equals(this.description, getUniverseRaces200Ok.description) &&
        Objects.equals(this.name, getUniverseRaces200Ok.name) &&
        Objects.equals(this.raceId, getUniverseRaces200Ok.raceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allianceId, description, name, raceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseRaces200Ok {\n");

    sb.append("    allianceId: ").append(toIndentedString(allianceId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    raceId: ").append(toIndentedString(raceId)).append("\n");
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

