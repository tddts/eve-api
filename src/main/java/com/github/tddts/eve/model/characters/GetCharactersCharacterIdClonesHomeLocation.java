package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * home_location object
 */
@ApiModel(description = "home_location object")
@Validated
public class GetCharactersCharacterIdClonesHomeLocation {
  @JsonProperty("location_id")
  private Long locationId = null;

  /**
   * location_type string
   */
  public enum LocationTypeEnum {
    STATION("station"),

    STRUCTURE("structure");

    private String value;

    LocationTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LocationTypeEnum fromValue(String text) {
      for (LocationTypeEnum b : LocationTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("location_type")
  private LocationTypeEnum locationType = null;

  public GetCharactersCharacterIdClonesHomeLocation locationId(Long locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * location_id integer
   *
   * @return locationId
   **/
  @ApiModelProperty(value = "location_id integer")


  public Long getLocationId() {
    return locationId;
  }

  public void setLocationId(Long locationId) {
    this.locationId = locationId;
  }

  public GetCharactersCharacterIdClonesHomeLocation locationType(LocationTypeEnum locationType) {
    this.locationType = locationType;
    return this;
  }

  /**
   * location_type string
   *
   * @return locationType
   **/
  @ApiModelProperty(value = "location_type string")


  public LocationTypeEnum getLocationType() {
    return locationType;
  }

  public void setLocationType(LocationTypeEnum locationType) {
    this.locationType = locationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdClonesHomeLocation getCharactersCharacterIdClonesHomeLocation = (GetCharactersCharacterIdClonesHomeLocation) o;
    return Objects.equals(this.locationId, getCharactersCharacterIdClonesHomeLocation.locationId) &&
        Objects.equals(this.locationType, getCharactersCharacterIdClonesHomeLocation.locationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, locationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdClonesHomeLocation {\n");

    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
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

