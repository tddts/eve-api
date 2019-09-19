package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * jump_clone object
 */
@ApiModel(description = "jump_clone object")
@Validated
public class GetCharactersCharacterIdClonesJumpClone {
  @JsonProperty("implants")
  @Valid
  private List<Integer> implants = new ArrayList<Integer>();

  @JsonProperty("jump_clone_id")
  private Integer jumpCloneId = null;

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

  @JsonProperty("name")
  private String name = null;

  public GetCharactersCharacterIdClonesJumpClone implants(List<Integer> implants) {
    this.implants = implants;
    return this;
  }

  public GetCharactersCharacterIdClonesJumpClone addImplantsItem(Integer implantsItem) {
    this.implants.add(implantsItem);
    return this;
  }

  /**
   * implants array
   *
   * @return implants
   **/
  @ApiModelProperty(required = true, value = "implants array")
  @NotNull

  @Size(max = 11)
  public List<Integer> getImplants() {
    return implants;
  }

  public void setImplants(List<Integer> implants) {
    this.implants = implants;
  }

  public GetCharactersCharacterIdClonesJumpClone jumpCloneId(Integer jumpCloneId) {
    this.jumpCloneId = jumpCloneId;
    return this;
  }

  /**
   * jump_clone_id integer
   *
   * @return jumpCloneId
   **/
  @ApiModelProperty(required = true, value = "jump_clone_id integer")
  @NotNull


  public Integer getJumpCloneId() {
    return jumpCloneId;
  }

  public void setJumpCloneId(Integer jumpCloneId) {
    this.jumpCloneId = jumpCloneId;
  }

  public GetCharactersCharacterIdClonesJumpClone locationId(Long locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * location_id integer
   *
   * @return locationId
   **/
  @ApiModelProperty(required = true, value = "location_id integer")
  @NotNull


  public Long getLocationId() {
    return locationId;
  }

  public void setLocationId(Long locationId) {
    this.locationId = locationId;
  }

  public GetCharactersCharacterIdClonesJumpClone locationType(LocationTypeEnum locationType) {
    this.locationType = locationType;
    return this;
  }

  /**
   * location_type string
   *
   * @return locationType
   **/
  @ApiModelProperty(required = true, value = "location_type string")
  @NotNull


  public LocationTypeEnum getLocationType() {
    return locationType;
  }

  public void setLocationType(LocationTypeEnum locationType) {
    this.locationType = locationType;
  }

  public GetCharactersCharacterIdClonesJumpClone name(String name) {
    this.name = name;
    return this;
  }

  /**
   * name string
   *
   * @return name
   **/
  @ApiModelProperty(value = "name string")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdClonesJumpClone getCharactersCharacterIdClonesJumpClone = (GetCharactersCharacterIdClonesJumpClone) o;
    return Objects.equals(this.implants, getCharactersCharacterIdClonesJumpClone.implants) &&
        Objects.equals(this.jumpCloneId, getCharactersCharacterIdClonesJumpClone.jumpCloneId) &&
        Objects.equals(this.locationId, getCharactersCharacterIdClonesJumpClone.locationId) &&
        Objects.equals(this.locationType, getCharactersCharacterIdClonesJumpClone.locationType) &&
        Objects.equals(this.name, getCharactersCharacterIdClonesJumpClone.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(implants, jumpCloneId, locationId, locationType, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdClonesJumpClone {\n");

    sb.append("    implants: ").append(toIndentedString(implants)).append("\n");
    sb.append("    jumpCloneId: ").append(toIndentedString(jumpCloneId)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

