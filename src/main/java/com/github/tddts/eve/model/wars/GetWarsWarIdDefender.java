package com.github.tddts.eve.model.wars;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * The defending corporation or alliance that declared this war, only contains either corporation_id or alliance_id
 */
@ApiModel(description = "The defending corporation or alliance that declared this war, only contains either corporation_id or alliance_id")
@Validated
public class GetWarsWarIdDefender {
  @JsonProperty("alliance_id")
  private Integer allianceId = null;

  @JsonProperty("corporation_id")
  private Integer corporationId = null;

  @JsonProperty("isk_destroyed")
  private Float iskDestroyed = null;

  @JsonProperty("ships_killed")
  private Integer shipsKilled = null;

  public GetWarsWarIdDefender allianceId(Integer allianceId) {
    this.allianceId = allianceId;
    return this;
  }

  /**
   * Alliance ID if and only if the defender is an alliance
   *
   * @return allianceId
   **/
  @ApiModelProperty(value = "Alliance ID if and only if the defender is an alliance")


  public Integer getAllianceId() {
    return allianceId;
  }

  public void setAllianceId(Integer allianceId) {
    this.allianceId = allianceId;
  }

  public GetWarsWarIdDefender corporationId(Integer corporationId) {
    this.corporationId = corporationId;
    return this;
  }

  /**
   * Corporation ID if and only if the defender is a corporation
   *
   * @return corporationId
   **/
  @ApiModelProperty(value = "Corporation ID if and only if the defender is a corporation")


  public Integer getCorporationId() {
    return corporationId;
  }

  public void setCorporationId(Integer corporationId) {
    this.corporationId = corporationId;
  }

  public GetWarsWarIdDefender iskDestroyed(Float iskDestroyed) {
    this.iskDestroyed = iskDestroyed;
    return this;
  }

  /**
   * ISK value of ships the defender has killed
   *
   * @return iskDestroyed
   **/
  @ApiModelProperty(required = true, value = "ISK value of ships the defender has killed")
  @NotNull


  public Float getIskDestroyed() {
    return iskDestroyed;
  }

  public void setIskDestroyed(Float iskDestroyed) {
    this.iskDestroyed = iskDestroyed;
  }

  public GetWarsWarIdDefender shipsKilled(Integer shipsKilled) {
    this.shipsKilled = shipsKilled;
    return this;
  }

  /**
   * The number of ships the defender has killed
   *
   * @return shipsKilled
   **/
  @ApiModelProperty(required = true, value = "The number of ships the defender has killed")
  @NotNull


  public Integer getShipsKilled() {
    return shipsKilled;
  }

  public void setShipsKilled(Integer shipsKilled) {
    this.shipsKilled = shipsKilled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetWarsWarIdDefender getWarsWarIdDefender = (GetWarsWarIdDefender) o;
    return Objects.equals(this.allianceId, getWarsWarIdDefender.allianceId) &&
        Objects.equals(this.corporationId, getWarsWarIdDefender.corporationId) &&
        Objects.equals(this.iskDestroyed, getWarsWarIdDefender.iskDestroyed) &&
        Objects.equals(this.shipsKilled, getWarsWarIdDefender.shipsKilled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allianceId, corporationId, iskDestroyed, shipsKilled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetWarsWarIdDefender {\n");

    sb.append("    allianceId: ").append(toIndentedString(allianceId)).append("\n");
    sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
    sb.append("    iskDestroyed: ").append(toIndentedString(iskDestroyed)).append("\n");
    sb.append("    shipsKilled: ").append(toIndentedString(shipsKilled)).append("\n");
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

