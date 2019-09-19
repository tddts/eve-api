package com.github.tddts.eve.model.wars;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@Validated
public class GetFwStats200Ok {
  @JsonProperty("faction_id")
  private Integer factionId = null;

  @JsonProperty("kills")
  private GetFwStatsKills kills = null;

  @JsonProperty("pilots")
  private Integer pilots = null;

  @JsonProperty("systems_controlled")
  private Integer systemsControlled = null;

  @JsonProperty("victory_points")
  private GetFwStatsVictoryPoints victoryPoints = null;

  public GetFwStats200Ok factionId(Integer factionId) {
    this.factionId = factionId;
    return this;
  }

  /**
   * faction_id integer
   *
   * @return factionId
   **/
  @ApiModelProperty(required = true, value = "faction_id integer")
  @NotNull


  public Integer getFactionId() {
    return factionId;
  }

  public void setFactionId(Integer factionId) {
    this.factionId = factionId;
  }

  public GetFwStats200Ok kills(GetFwStatsKills kills) {
    this.kills = kills;
    return this;
  }

  /**
   * Get kills
   *
   * @return kills
   **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public GetFwStatsKills getKills() {
    return kills;
  }

  public void setKills(GetFwStatsKills kills) {
    this.kills = kills;
  }

  public GetFwStats200Ok pilots(Integer pilots) {
    this.pilots = pilots;
    return this;
  }

  /**
   * How many pilots fight for the given faction
   *
   * @return pilots
   **/
  @ApiModelProperty(required = true, value = "How many pilots fight for the given faction")
  @NotNull


  public Integer getPilots() {
    return pilots;
  }

  public void setPilots(Integer pilots) {
    this.pilots = pilots;
  }

  public GetFwStats200Ok systemsControlled(Integer systemsControlled) {
    this.systemsControlled = systemsControlled;
    return this;
  }

  /**
   * The number of solar systems controlled by the given faction
   *
   * @return systemsControlled
   **/
  @ApiModelProperty(required = true, value = "The number of solar systems controlled by the given faction")
  @NotNull


  public Integer getSystemsControlled() {
    return systemsControlled;
  }

  public void setSystemsControlled(Integer systemsControlled) {
    this.systemsControlled = systemsControlled;
  }

  public GetFwStats200Ok victoryPoints(GetFwStatsVictoryPoints victoryPoints) {
    this.victoryPoints = victoryPoints;
    return this;
  }

  /**
   * Get victoryPoints
   *
   * @return victoryPoints
   **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public GetFwStatsVictoryPoints getVictoryPoints() {
    return victoryPoints;
  }

  public void setVictoryPoints(GetFwStatsVictoryPoints victoryPoints) {
    this.victoryPoints = victoryPoints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFwStats200Ok getFwStats200Ok = (GetFwStats200Ok) o;
    return Objects.equals(this.factionId, getFwStats200Ok.factionId) &&
        Objects.equals(this.kills, getFwStats200Ok.kills) &&
        Objects.equals(this.pilots, getFwStats200Ok.pilots) &&
        Objects.equals(this.systemsControlled, getFwStats200Ok.systemsControlled) &&
        Objects.equals(this.victoryPoints, getFwStats200Ok.victoryPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(factionId, kills, pilots, systemsControlled, victoryPoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFwStats200Ok {\n");

    sb.append("    factionId: ").append(toIndentedString(factionId)).append("\n");
    sb.append("    kills: ").append(toIndentedString(kills)).append("\n");
    sb.append("    pilots: ").append(toIndentedString(pilots)).append("\n");
    sb.append("    systemsControlled: ").append(toIndentedString(systemsControlled)).append("\n");
    sb.append("    victoryPoints: ").append(toIndentedString(victoryPoints)).append("\n");
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

