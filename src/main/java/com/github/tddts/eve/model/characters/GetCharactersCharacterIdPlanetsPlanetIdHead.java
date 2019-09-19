package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * head object
 */
@ApiModel(description = "head object")
@Validated
public class GetCharactersCharacterIdPlanetsPlanetIdHead {
  @JsonProperty("head_id")
  private Integer headId = null;

  @JsonProperty("latitude")
  private Float latitude = null;

  @JsonProperty("longitude")
  private Float longitude = null;

  public GetCharactersCharacterIdPlanetsPlanetIdHead headId(Integer headId) {
    this.headId = headId;
    return this;
  }

  /**
   * head_id integer
   * minimum: 0
   * maximum: 9
   *
   * @return headId
   **/
  @ApiModelProperty(required = true, value = "head_id integer")
  @NotNull

  @Min(0)
  @Max(9)
  public Integer getHeadId() {
    return headId;
  }

  public void setHeadId(Integer headId) {
    this.headId = headId;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdHead latitude(Float latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * latitude number
   *
   * @return latitude
   **/
  @ApiModelProperty(required = true, value = "latitude number")
  @NotNull


  public Float getLatitude() {
    return latitude;
  }

  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdHead longitude(Float longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * longitude number
   *
   * @return longitude
   **/
  @ApiModelProperty(required = true, value = "longitude number")
  @NotNull


  public Float getLongitude() {
    return longitude;
  }

  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdPlanetsPlanetIdHead getCharactersCharacterIdPlanetsPlanetIdHead = (GetCharactersCharacterIdPlanetsPlanetIdHead) o;
    return Objects.equals(this.headId, getCharactersCharacterIdPlanetsPlanetIdHead.headId) &&
        Objects.equals(this.latitude, getCharactersCharacterIdPlanetsPlanetIdHead.latitude) &&
        Objects.equals(this.longitude, getCharactersCharacterIdPlanetsPlanetIdHead.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headId, latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdPlanetsPlanetIdHead {\n");

    sb.append("    headId: ").append(toIndentedString(headId)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

