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
 * link object
 */
@ApiModel(description = "link object")
@Validated
public class GetCharactersCharacterIdPlanetsPlanetIdLink {
  @JsonProperty("destination_pin_id")
  private Long destinationPinId = null;

  @JsonProperty("link_level")
  private Integer linkLevel = null;

  @JsonProperty("source_pin_id")
  private Long sourcePinId = null;

  public GetCharactersCharacterIdPlanetsPlanetIdLink destinationPinId(Long destinationPinId) {
    this.destinationPinId = destinationPinId;
    return this;
  }

  /**
   * destination_pin_id integer
   *
   * @return destinationPinId
   **/
  @ApiModelProperty(required = true, value = "destination_pin_id integer")
  @NotNull


  public Long getDestinationPinId() {
    return destinationPinId;
  }

  public void setDestinationPinId(Long destinationPinId) {
    this.destinationPinId = destinationPinId;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdLink linkLevel(Integer linkLevel) {
    this.linkLevel = linkLevel;
    return this;
  }

  /**
   * link_level integer
   * minimum: 0
   * maximum: 10
   *
   * @return linkLevel
   **/
  @ApiModelProperty(required = true, value = "link_level integer")
  @NotNull

  @Min(0)
  @Max(10)
  public Integer getLinkLevel() {
    return linkLevel;
  }

  public void setLinkLevel(Integer linkLevel) {
    this.linkLevel = linkLevel;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdLink sourcePinId(Long sourcePinId) {
    this.sourcePinId = sourcePinId;
    return this;
  }

  /**
   * source_pin_id integer
   *
   * @return sourcePinId
   **/
  @ApiModelProperty(required = true, value = "source_pin_id integer")
  @NotNull


  public Long getSourcePinId() {
    return sourcePinId;
  }

  public void setSourcePinId(Long sourcePinId) {
    this.sourcePinId = sourcePinId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdPlanetsPlanetIdLink getCharactersCharacterIdPlanetsPlanetIdLink = (GetCharactersCharacterIdPlanetsPlanetIdLink) o;
    return Objects.equals(this.destinationPinId, getCharactersCharacterIdPlanetsPlanetIdLink.destinationPinId) &&
        Objects.equals(this.linkLevel, getCharactersCharacterIdPlanetsPlanetIdLink.linkLevel) &&
        Objects.equals(this.sourcePinId, getCharactersCharacterIdPlanetsPlanetIdLink.sourcePinId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationPinId, linkLevel, sourcePinId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdPlanetsPlanetIdLink {\n");

    sb.append("    destinationPinId: ").append(toIndentedString(destinationPinId)).append("\n");
    sb.append("    linkLevel: ").append(toIndentedString(linkLevel)).append("\n");
    sb.append("    sourcePinId: ").append(toIndentedString(sourcePinId)).append("\n");
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

