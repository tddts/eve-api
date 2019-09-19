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
public class GetCorporationsCorporationIdAlliancehistory200Ok {
  @JsonProperty("alliance_id")
  private Integer allianceId = null;

  @JsonProperty("is_deleted")
  private Boolean isDeleted = null;

  @JsonProperty("record_id")
  private Integer recordId = null;

  @JsonProperty("start_date")
  private OffsetDateTime startDate = null;

  public GetCorporationsCorporationIdAlliancehistory200Ok allianceId(Integer allianceId) {
    this.allianceId = allianceId;
    return this;
  }

  /**
   * alliance_id integer
   *
   * @return allianceId
   **/
  @ApiModelProperty(value = "alliance_id integer")


  public Integer getAllianceId() {
    return allianceId;
  }

  public void setAllianceId(Integer allianceId) {
    this.allianceId = allianceId;
  }

  public GetCorporationsCorporationIdAlliancehistory200Ok isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * True if the alliance has been closed
   *
   * @return isDeleted
   **/
  @ApiModelProperty(value = "True if the alliance has been closed")


  public Boolean isIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public GetCorporationsCorporationIdAlliancehistory200Ok recordId(Integer recordId) {
    this.recordId = recordId;
    return this;
  }

  /**
   * An incrementing ID that can be used to canonically establish order of records in cases where dates may be ambiguous
   *
   * @return recordId
   **/
  @ApiModelProperty(required = true, value = "An incrementing ID that can be used to canonically establish order of records in cases where dates may be ambiguous")
  @NotNull


  public Integer getRecordId() {
    return recordId;
  }

  public void setRecordId(Integer recordId) {
    this.recordId = recordId;
  }

  public GetCorporationsCorporationIdAlliancehistory200Ok startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * start_date string
   *
   * @return startDate
   **/
  @ApiModelProperty(required = true, value = "start_date string")
  @NotNull

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
    GetCorporationsCorporationIdAlliancehistory200Ok getCorporationsCorporationIdAlliancehistory200Ok = (GetCorporationsCorporationIdAlliancehistory200Ok) o;
    return Objects.equals(this.allianceId, getCorporationsCorporationIdAlliancehistory200Ok.allianceId) &&
        Objects.equals(this.isDeleted, getCorporationsCorporationIdAlliancehistory200Ok.isDeleted) &&
        Objects.equals(this.recordId, getCorporationsCorporationIdAlliancehistory200Ok.recordId) &&
        Objects.equals(this.startDate, getCorporationsCorporationIdAlliancehistory200Ok.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allianceId, isDeleted, recordId, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdAlliancehistory200Ok {\n");

    sb.append("    allianceId: ").append(toIndentedString(allianceId)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
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

