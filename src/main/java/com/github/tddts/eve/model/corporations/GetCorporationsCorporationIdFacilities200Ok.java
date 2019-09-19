package com.github.tddts.eve.model.corporations;

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
public class GetCorporationsCorporationIdFacilities200Ok {
  @JsonProperty("facility_id")
  private Long facilityId = null;

  @JsonProperty("system_id")
  private Integer systemId = null;

  @JsonProperty("type_id")
  private Integer typeId = null;

  public GetCorporationsCorporationIdFacilities200Ok facilityId(Long facilityId) {
    this.facilityId = facilityId;
    return this;
  }

  /**
   * facility_id integer
   *
   * @return facilityId
   **/
  @ApiModelProperty(required = true, value = "facility_id integer")
  @NotNull


  public Long getFacilityId() {
    return facilityId;
  }

  public void setFacilityId(Long facilityId) {
    this.facilityId = facilityId;
  }

  public GetCorporationsCorporationIdFacilities200Ok systemId(Integer systemId) {
    this.systemId = systemId;
    return this;
  }

  /**
   * system_id integer
   *
   * @return systemId
   **/
  @ApiModelProperty(required = true, value = "system_id integer")
  @NotNull


  public Integer getSystemId() {
    return systemId;
  }

  public void setSystemId(Integer systemId) {
    this.systemId = systemId;
  }

  public GetCorporationsCorporationIdFacilities200Ok typeId(Integer typeId) {
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
    GetCorporationsCorporationIdFacilities200Ok getCorporationsCorporationIdFacilities200Ok = (GetCorporationsCorporationIdFacilities200Ok) o;
    return Objects.equals(this.facilityId, getCorporationsCorporationIdFacilities200Ok.facilityId) &&
        Objects.equals(this.systemId, getCorporationsCorporationIdFacilities200Ok.systemId) &&
        Objects.equals(this.typeId, getCorporationsCorporationIdFacilities200Ok.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facilityId, systemId, typeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdFacilities200Ok {\n");

    sb.append("    facilityId: ").append(toIndentedString(facilityId)).append("\n");
    sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
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

