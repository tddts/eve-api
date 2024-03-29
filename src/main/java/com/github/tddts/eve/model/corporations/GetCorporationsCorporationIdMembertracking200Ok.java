package com.github.tddts.eve.model.corporations;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@Validated
public class GetCorporationsCorporationIdMembertracking200Ok {
  @JsonProperty("base_id")
  private Integer baseId = null;

  @JsonProperty("character_id")
  private Integer characterId = null;

  @JsonProperty("location_id")
  private Long locationId = null;

  @JsonProperty("logoff_date")
  private OffsetDateTime logoffDate = null;

  @JsonProperty("logon_date")
  private OffsetDateTime logonDate = null;

  @JsonProperty("ship_type_id")
  private Integer shipTypeId = null;

  @JsonProperty("start_date")
  private OffsetDateTime startDate = null;

  public GetCorporationsCorporationIdMembertracking200Ok baseId(Integer baseId) {
    this.baseId = baseId;
    return this;
  }

  /**
   * base_id integer
   *
   * @return baseId
   **/
  @ApiModelProperty(value = "base_id integer")


  public Integer getBaseId() {
    return baseId;
  }

  public void setBaseId(Integer baseId) {
    this.baseId = baseId;
  }

  public GetCorporationsCorporationIdMembertracking200Ok characterId(Integer characterId) {
    this.characterId = characterId;
    return this;
  }

  /**
   * character_id integer
   *
   * @return characterId
   **/
  @ApiModelProperty(required = true, value = "character_id integer")
  @NotNull


  public Integer getCharacterId() {
    return characterId;
  }

  public void setCharacterId(Integer characterId) {
    this.characterId = characterId;
  }

  public GetCorporationsCorporationIdMembertracking200Ok locationId(Long locationId) {
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

  public GetCorporationsCorporationIdMembertracking200Ok logoffDate(OffsetDateTime logoffDate) {
    this.logoffDate = logoffDate;
    return this;
  }

  /**
   * logoff_date string
   *
   * @return logoffDate
   **/
  @ApiModelProperty(value = "logoff_date string")

  @Valid

  public OffsetDateTime getLogoffDate() {
    return logoffDate;
  }

  public void setLogoffDate(OffsetDateTime logoffDate) {
    this.logoffDate = logoffDate;
  }

  public GetCorporationsCorporationIdMembertracking200Ok logonDate(OffsetDateTime logonDate) {
    this.logonDate = logonDate;
    return this;
  }

  /**
   * logon_date string
   *
   * @return logonDate
   **/
  @ApiModelProperty(value = "logon_date string")

  @Valid

  public OffsetDateTime getLogonDate() {
    return logonDate;
  }

  public void setLogonDate(OffsetDateTime logonDate) {
    this.logonDate = logonDate;
  }

  public GetCorporationsCorporationIdMembertracking200Ok shipTypeId(Integer shipTypeId) {
    this.shipTypeId = shipTypeId;
    return this;
  }

  /**
   * ship_type_id integer
   *
   * @return shipTypeId
   **/
  @ApiModelProperty(value = "ship_type_id integer")


  public Integer getShipTypeId() {
    return shipTypeId;
  }

  public void setShipTypeId(Integer shipTypeId) {
    this.shipTypeId = shipTypeId;
  }

  public GetCorporationsCorporationIdMembertracking200Ok startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * start_date string
   *
   * @return startDate
   **/
  @ApiModelProperty(value = "start_date string")

  @Valid

  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdMembertracking200Ok getCorporationsCorporationIdMembertracking200Ok = (GetCorporationsCorporationIdMembertracking200Ok) o;
    return Objects.equals(this.baseId, getCorporationsCorporationIdMembertracking200Ok.baseId) &&
        Objects.equals(this.characterId, getCorporationsCorporationIdMembertracking200Ok.characterId) &&
        Objects.equals(this.locationId, getCorporationsCorporationIdMembertracking200Ok.locationId) &&
        Objects.equals(this.logoffDate, getCorporationsCorporationIdMembertracking200Ok.logoffDate) &&
        Objects.equals(this.logonDate, getCorporationsCorporationIdMembertracking200Ok.logonDate) &&
        Objects.equals(this.shipTypeId, getCorporationsCorporationIdMembertracking200Ok.shipTypeId) &&
        Objects.equals(this.startDate, getCorporationsCorporationIdMembertracking200Ok.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseId, characterId, locationId, logoffDate, logonDate, shipTypeId, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdMembertracking200Ok {\n");

    sb.append("    baseId: ").append(toIndentedString(baseId)).append("\n");
    sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    logoffDate: ").append(toIndentedString(logoffDate)).append("\n");
    sb.append("    logonDate: ").append(toIndentedString(logonDate)).append("\n");
    sb.append("    shipTypeId: ").append(toIndentedString(shipTypeId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

