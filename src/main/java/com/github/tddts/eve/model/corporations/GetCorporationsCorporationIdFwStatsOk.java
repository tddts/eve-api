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
public class GetCorporationsCorporationIdFwStatsOk {
  @JsonProperty("enlisted_on")
  private OffsetDateTime enlistedOn = null;

  @JsonProperty("faction_id")
  private Integer factionId = null;

  @JsonProperty("kills")
  private GetCorporationsCorporationIdFwStatsKills kills = null;

  @JsonProperty("pilots")
  private Integer pilots = null;

  @JsonProperty("victory_points")
  private GetCorporationsCorporationIdFwStatsVictoryPoints victoryPoints = null;

  public GetCorporationsCorporationIdFwStatsOk enlistedOn(OffsetDateTime enlistedOn) {
    this.enlistedOn = enlistedOn;
    return this;
  }

  /**
   * The enlistment date of the given corporation into faction warfare. Will not be included if corporation is not enlisted in faction warfare
   *
   * @return enlistedOn
   **/
  @ApiModelProperty(value = "The enlistment date of the given corporation into faction warfare. Will not be included if corporation is not enlisted in faction warfare")

  @Valid

  public OffsetDateTime getEnlistedOn() {
    return enlistedOn;
  }

  public void setEnlistedOn(OffsetDateTime enlistedOn) {
    this.enlistedOn = enlistedOn;
  }

  public GetCorporationsCorporationIdFwStatsOk factionId(Integer factionId) {
    this.factionId = factionId;
    return this;
  }

  /**
   * The faction the given corporation is enlisted to fight for. Will not be included if corporation is not enlisted in faction warfare
   *
   * @return factionId
   **/
  @ApiModelProperty(value = "The faction the given corporation is enlisted to fight for. Will not be included if corporation is not enlisted in faction warfare")


  public Integer getFactionId() {
    return factionId;
  }

  public void setFactionId(Integer factionId) {
    this.factionId = factionId;
  }

  public GetCorporationsCorporationIdFwStatsOk kills(GetCorporationsCorporationIdFwStatsKills kills) {
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

  public GetCorporationsCorporationIdFwStatsKills getKills() {
    return kills;
  }

  public void setKills(GetCorporationsCorporationIdFwStatsKills kills) {
    this.kills = kills;
  }

  public GetCorporationsCorporationIdFwStatsOk pilots(Integer pilots) {
    this.pilots = pilots;
    return this;
  }

  /**
   * How many pilots the enlisted corporation has. Will not be included if corporation is not enlisted in faction warfare
   *
   * @return pilots
   **/
  @ApiModelProperty(value = "How many pilots the enlisted corporation has. Will not be included if corporation is not enlisted in faction warfare")


  public Integer getPilots() {
    return pilots;
  }

  public void setPilots(Integer pilots) {
    this.pilots = pilots;
  }

  public GetCorporationsCorporationIdFwStatsOk victoryPoints(GetCorporationsCorporationIdFwStatsVictoryPoints victoryPoints) {
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

  public GetCorporationsCorporationIdFwStatsVictoryPoints getVictoryPoints() {
    return victoryPoints;
  }

  public void setVictoryPoints(GetCorporationsCorporationIdFwStatsVictoryPoints victoryPoints) {
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
    GetCorporationsCorporationIdFwStatsOk getCorporationsCorporationIdFwStatsOk = (GetCorporationsCorporationIdFwStatsOk) o;
    return Objects.equals(this.enlistedOn, getCorporationsCorporationIdFwStatsOk.enlistedOn) &&
        Objects.equals(this.factionId, getCorporationsCorporationIdFwStatsOk.factionId) &&
        Objects.equals(this.kills, getCorporationsCorporationIdFwStatsOk.kills) &&
        Objects.equals(this.pilots, getCorporationsCorporationIdFwStatsOk.pilots) &&
        Objects.equals(this.victoryPoints, getCorporationsCorporationIdFwStatsOk.victoryPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enlistedOn, factionId, kills, pilots, victoryPoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdFwStatsOk {\n");

    sb.append("    enlistedOn: ").append(toIndentedString(enlistedOn)).append("\n");
    sb.append("    factionId: ").append(toIndentedString(factionId)).append("\n");
    sb.append("    kills: ").append(toIndentedString(kills)).append("\n");
    sb.append("    pilots: ").append(toIndentedString(pilots)).append("\n");
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

