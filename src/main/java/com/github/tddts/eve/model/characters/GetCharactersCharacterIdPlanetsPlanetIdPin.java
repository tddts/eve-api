package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * pin object
 */
@ApiModel(description = "pin object")
@Validated
public class GetCharactersCharacterIdPlanetsPlanetIdPin {
  @JsonProperty("contents")
  @Valid
  private List<GetCharactersCharacterIdPlanetsPlanetIdContent> contents = null;

  @JsonProperty("expiry_time")
  private OffsetDateTime expiryTime = null;

  @JsonProperty("extractor_details")
  private GetCharactersCharacterIdPlanetsPlanetIdExtractorDetails extractorDetails = null;

  @JsonProperty("factory_details")
  private GetCharactersCharacterIdPlanetsPlanetIdFactoryDetails factoryDetails = null;

  @JsonProperty("install_time")
  private OffsetDateTime installTime = null;

  @JsonProperty("last_cycle_start")
  private OffsetDateTime lastCycleStart = null;

  @JsonProperty("latitude")
  private Float latitude = null;

  @JsonProperty("longitude")
  private Float longitude = null;

  @JsonProperty("pin_id")
  private Long pinId = null;

  @JsonProperty("schematic_id")
  private Integer schematicId = null;

  @JsonProperty("type_id")
  private Integer typeId = null;

  public GetCharactersCharacterIdPlanetsPlanetIdPin contents(List<GetCharactersCharacterIdPlanetsPlanetIdContent> contents) {
    this.contents = contents;
    return this;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdPin addContentsItem(GetCharactersCharacterIdPlanetsPlanetIdContent contentsItem) {
    if (this.contents == null) {
      this.contents = new ArrayList<GetCharactersCharacterIdPlanetsPlanetIdContent>();
    }
    this.contents.add(contentsItem);
    return this;
  }

  /**
   * contents array
   *
   * @return contents
   **/
  @ApiModelProperty(value = "contents array")

  @Valid
  @Size(max = 90)
  public List<GetCharactersCharacterIdPlanetsPlanetIdContent> getContents() {
    return contents;
  }

  public void setContents(List<GetCharactersCharacterIdPlanetsPlanetIdContent> contents) {
    this.contents = contents;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdPin expiryTime(OffsetDateTime expiryTime) {
    this.expiryTime = expiryTime;
    return this;
  }

  /**
   * expiry_time string
   *
   * @return expiryTime
   **/
  @ApiModelProperty(value = "expiry_time string")

  @Valid

  public OffsetDateTime getExpiryTime() {
    return expiryTime;
  }

  public void setExpiryTime(OffsetDateTime expiryTime) {
    this.expiryTime = expiryTime;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdPin extractorDetails(GetCharactersCharacterIdPlanetsPlanetIdExtractorDetails extractorDetails) {
    this.extractorDetails = extractorDetails;
    return this;
  }

  /**
   * Get extractorDetails
   *
   * @return extractorDetails
   **/
  @ApiModelProperty(value = "")

  @Valid

  public GetCharactersCharacterIdPlanetsPlanetIdExtractorDetails getExtractorDetails() {
    return extractorDetails;
  }

  public void setExtractorDetails(GetCharactersCharacterIdPlanetsPlanetIdExtractorDetails extractorDetails) {
    this.extractorDetails = extractorDetails;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdPin factoryDetails(GetCharactersCharacterIdPlanetsPlanetIdFactoryDetails factoryDetails) {
    this.factoryDetails = factoryDetails;
    return this;
  }

  /**
   * Get factoryDetails
   *
   * @return factoryDetails
   **/
  @ApiModelProperty(value = "")

  @Valid

  public GetCharactersCharacterIdPlanetsPlanetIdFactoryDetails getFactoryDetails() {
    return factoryDetails;
  }

  public void setFactoryDetails(GetCharactersCharacterIdPlanetsPlanetIdFactoryDetails factoryDetails) {
    this.factoryDetails = factoryDetails;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdPin installTime(OffsetDateTime installTime) {
    this.installTime = installTime;
    return this;
  }

  /**
   * install_time string
   *
   * @return installTime
   **/
  @ApiModelProperty(value = "install_time string")

  @Valid

  public OffsetDateTime getInstallTime() {
    return installTime;
  }

  public void setInstallTime(OffsetDateTime installTime) {
    this.installTime = installTime;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdPin lastCycleStart(OffsetDateTime lastCycleStart) {
    this.lastCycleStart = lastCycleStart;
    return this;
  }

  /**
   * last_cycle_start string
   *
   * @return lastCycleStart
   **/
  @ApiModelProperty(value = "last_cycle_start string")

  @Valid

  public OffsetDateTime getLastCycleStart() {
    return lastCycleStart;
  }

  public void setLastCycleStart(OffsetDateTime lastCycleStart) {
    this.lastCycleStart = lastCycleStart;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdPin latitude(Float latitude) {
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

  public GetCharactersCharacterIdPlanetsPlanetIdPin longitude(Float longitude) {
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

  public GetCharactersCharacterIdPlanetsPlanetIdPin pinId(Long pinId) {
    this.pinId = pinId;
    return this;
  }

  /**
   * pin_id integer
   *
   * @return pinId
   **/
  @ApiModelProperty(required = true, value = "pin_id integer")
  @NotNull


  public Long getPinId() {
    return pinId;
  }

  public void setPinId(Long pinId) {
    this.pinId = pinId;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdPin schematicId(Integer schematicId) {
    this.schematicId = schematicId;
    return this;
  }

  /**
   * schematic_id integer
   *
   * @return schematicId
   **/
  @ApiModelProperty(value = "schematic_id integer")


  public Integer getSchematicId() {
    return schematicId;
  }

  public void setSchematicId(Integer schematicId) {
    this.schematicId = schematicId;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdPin typeId(Integer typeId) {
    this.typeId = typeId;
    return this;
  }

  /**
   * type_id integer
   *
   * @return typeId
   **/
  @ApiModelProperty(required = true, value = "type_id integer")
  @NotNull


  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdPlanetsPlanetIdPin getCharactersCharacterIdPlanetsPlanetIdPin = (GetCharactersCharacterIdPlanetsPlanetIdPin) o;
    return Objects.equals(this.contents, getCharactersCharacterIdPlanetsPlanetIdPin.contents) &&
        Objects.equals(this.expiryTime, getCharactersCharacterIdPlanetsPlanetIdPin.expiryTime) &&
        Objects.equals(this.extractorDetails, getCharactersCharacterIdPlanetsPlanetIdPin.extractorDetails) &&
        Objects.equals(this.factoryDetails, getCharactersCharacterIdPlanetsPlanetIdPin.factoryDetails) &&
        Objects.equals(this.installTime, getCharactersCharacterIdPlanetsPlanetIdPin.installTime) &&
        Objects.equals(this.lastCycleStart, getCharactersCharacterIdPlanetsPlanetIdPin.lastCycleStart) &&
        Objects.equals(this.latitude, getCharactersCharacterIdPlanetsPlanetIdPin.latitude) &&
        Objects.equals(this.longitude, getCharactersCharacterIdPlanetsPlanetIdPin.longitude) &&
        Objects.equals(this.pinId, getCharactersCharacterIdPlanetsPlanetIdPin.pinId) &&
        Objects.equals(this.schematicId, getCharactersCharacterIdPlanetsPlanetIdPin.schematicId) &&
        Objects.equals(this.typeId, getCharactersCharacterIdPlanetsPlanetIdPin.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contents, expiryTime, extractorDetails, factoryDetails, installTime, lastCycleStart, latitude, longitude, pinId, schematicId, typeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdPlanetsPlanetIdPin {\n");

    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    expiryTime: ").append(toIndentedString(expiryTime)).append("\n");
    sb.append("    extractorDetails: ").append(toIndentedString(extractorDetails)).append("\n");
    sb.append("    factoryDetails: ").append(toIndentedString(factoryDetails)).append("\n");
    sb.append("    installTime: ").append(toIndentedString(installTime)).append("\n");
    sb.append("    lastCycleStart: ").append(toIndentedString(lastCycleStart)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    pinId: ").append(toIndentedString(pinId)).append("\n");
    sb.append("    schematicId: ").append(toIndentedString(schematicId)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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

