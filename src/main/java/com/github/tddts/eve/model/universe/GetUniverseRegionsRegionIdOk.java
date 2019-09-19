package com.github.tddts.eve.model.universe;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@Validated
public class GetUniverseRegionsRegionIdOk {
  @JsonProperty("constellations")
  @Valid
  private List<Integer> constellations = new ArrayList<Integer>();

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("region_id")
  private Integer regionId = null;

  public GetUniverseRegionsRegionIdOk constellations(List<Integer> constellations) {
    this.constellations = constellations;
    return this;
  }

  public GetUniverseRegionsRegionIdOk addConstellationsItem(Integer constellationsItem) {
    this.constellations.add(constellationsItem);
    return this;
  }

  /**
   * constellations array
   *
   * @return constellations
   **/
  @ApiModelProperty(required = true, value = "constellations array")
  @NotNull

  @Size(max = 1000)
  public List<Integer> getConstellations() {
    return constellations;
  }

  public void setConstellations(List<Integer> constellations) {
    this.constellations = constellations;
  }

  public GetUniverseRegionsRegionIdOk description(String description) {
    this.description = description;
    return this;
  }

  /**
   * description string
   *
   * @return description
   **/
  @ApiModelProperty(value = "description string")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GetUniverseRegionsRegionIdOk name(String name) {
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

  public GetUniverseRegionsRegionIdOk regionId(Integer regionId) {
    this.regionId = regionId;
    return this;
  }

  /**
   * region_id integer
   *
   * @return regionId
   **/
  @ApiModelProperty(required = true, value = "region_id integer")
  @NotNull


  public Integer getRegionId() {
    return regionId;
  }

  public void setRegionId(Integer regionId) {
    this.regionId = regionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseRegionsRegionIdOk getUniverseRegionsRegionIdOk = (GetUniverseRegionsRegionIdOk) o;
    return Objects.equals(this.constellations, getUniverseRegionsRegionIdOk.constellations) &&
        Objects.equals(this.description, getUniverseRegionsRegionIdOk.description) &&
        Objects.equals(this.name, getUniverseRegionsRegionIdOk.name) &&
        Objects.equals(this.regionId, getUniverseRegionsRegionIdOk.regionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constellations, description, name, regionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseRegionsRegionIdOk {\n");

    sb.append("    constellations: ").append(toIndentedString(constellations)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
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

