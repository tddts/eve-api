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
 * planet object
 */
@ApiModel(description = "planet object")
@Validated
public class GetUniverseSystemsSystemIdPlanet {
  @JsonProperty("asteroid_belts")
  @Valid
  private List<Integer> asteroidBelts = null;

  @JsonProperty("moons")
  @Valid
  private List<Integer> moons = null;

  @JsonProperty("planet_id")
  private Integer planetId = null;

  public GetUniverseSystemsSystemIdPlanet asteroidBelts(List<Integer> asteroidBelts) {
    this.asteroidBelts = asteroidBelts;
    return this;
  }

  public GetUniverseSystemsSystemIdPlanet addAsteroidBeltsItem(Integer asteroidBeltsItem) {
    if (this.asteroidBelts == null) {
      this.asteroidBelts = new ArrayList<Integer>();
    }
    this.asteroidBelts.add(asteroidBeltsItem);
    return this;
  }

  /**
   * asteroid_belts array
   *
   * @return asteroidBelts
   **/
  @ApiModelProperty(value = "asteroid_belts array")

  @Size(max = 100)
  public List<Integer> getAsteroidBelts() {
    return asteroidBelts;
  }

  public void setAsteroidBelts(List<Integer> asteroidBelts) {
    this.asteroidBelts = asteroidBelts;
  }

  public GetUniverseSystemsSystemIdPlanet moons(List<Integer> moons) {
    this.moons = moons;
    return this;
  }

  public GetUniverseSystemsSystemIdPlanet addMoonsItem(Integer moonsItem) {
    if (this.moons == null) {
      this.moons = new ArrayList<Integer>();
    }
    this.moons.add(moonsItem);
    return this;
  }

  /**
   * moons array
   *
   * @return moons
   **/
  @ApiModelProperty(value = "moons array")

  @Size(max = 1000)
  public List<Integer> getMoons() {
    return moons;
  }

  public void setMoons(List<Integer> moons) {
    this.moons = moons;
  }

  public GetUniverseSystemsSystemIdPlanet planetId(Integer planetId) {
    this.planetId = planetId;
    return this;
  }

  /**
   * planet_id integer
   *
   * @return planetId
   **/
  @ApiModelProperty(required = true, value = "planet_id integer")
  @NotNull


  public Integer getPlanetId() {
    return planetId;
  }

  public void setPlanetId(Integer planetId) {
    this.planetId = planetId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseSystemsSystemIdPlanet getUniverseSystemsSystemIdPlanet = (GetUniverseSystemsSystemIdPlanet) o;
    return Objects.equals(this.asteroidBelts, getUniverseSystemsSystemIdPlanet.asteroidBelts) &&
        Objects.equals(this.moons, getUniverseSystemsSystemIdPlanet.moons) &&
        Objects.equals(this.planetId, getUniverseSystemsSystemIdPlanet.planetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asteroidBelts, moons, planetId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseSystemsSystemIdPlanet {\n");

    sb.append("    asteroidBelts: ").append(toIndentedString(asteroidBelts)).append("\n");
    sb.append("    moons: ").append(toIndentedString(moons)).append("\n");
    sb.append("    planetId: ").append(toIndentedString(planetId)).append("\n");
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

