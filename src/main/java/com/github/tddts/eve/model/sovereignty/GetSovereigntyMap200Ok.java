package com.github.tddts.eve.model.sovereignty;

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
public class GetSovereigntyMap200Ok {
  @JsonProperty("alliance_id")
  private Integer allianceId = null;

  @JsonProperty("corporation_id")
  private Integer corporationId = null;

  @JsonProperty("faction_id")
  private Integer factionId = null;

  @JsonProperty("system_id")
  private Integer systemId = null;

  public GetSovereigntyMap200Ok allianceId(Integer allianceId) {
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

  public GetSovereigntyMap200Ok corporationId(Integer corporationId) {
    this.corporationId = corporationId;
    return this;
  }

  /**
   * corporation_id integer
   *
   * @return corporationId
   **/
  @ApiModelProperty(value = "corporation_id integer")


  public Integer getCorporationId() {
    return corporationId;
  }

  public void setCorporationId(Integer corporationId) {
    this.corporationId = corporationId;
  }

  public GetSovereigntyMap200Ok factionId(Integer factionId) {
    this.factionId = factionId;
    return this;
  }

  /**
   * faction_id integer
   *
   * @return factionId
   **/
  @ApiModelProperty(value = "faction_id integer")


  public Integer getFactionId() {
    return factionId;
  }

  public void setFactionId(Integer factionId) {
    this.factionId = factionId;
  }

  public GetSovereigntyMap200Ok systemId(Integer systemId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSovereigntyMap200Ok getSovereigntyMap200Ok = (GetSovereigntyMap200Ok) o;
    return Objects.equals(this.allianceId, getSovereigntyMap200Ok.allianceId) &&
        Objects.equals(this.corporationId, getSovereigntyMap200Ok.corporationId) &&
        Objects.equals(this.factionId, getSovereigntyMap200Ok.factionId) &&
        Objects.equals(this.systemId, getSovereigntyMap200Ok.systemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allianceId, corporationId, factionId, systemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSovereigntyMap200Ok {\n");

    sb.append("    allianceId: ").append(toIndentedString(allianceId)).append("\n");
    sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
    sb.append("    factionId: ").append(toIndentedString(factionId)).append("\n");
    sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
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

