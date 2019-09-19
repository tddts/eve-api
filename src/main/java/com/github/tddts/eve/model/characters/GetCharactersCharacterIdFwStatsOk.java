package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@Validated
public class GetCharactersCharacterIdFwStatsOk {
  @JsonProperty("current_rank")
  private Integer currentRank = null;

  @JsonProperty("enlisted_on")
  private OffsetDateTime enlistedOn = null;

  @JsonProperty("faction_id")
  private Integer factionId = null;

  @JsonProperty("highest_rank")
  private Integer highestRank = null;

  @JsonProperty("kills")
  private GetCharactersCharacterIdFwStatsKills kills = null;

  @JsonProperty("victory_points")
  private GetCharactersCharacterIdFwStatsVictoryPoints victoryPoints = null;

  public GetCharactersCharacterIdFwStatsOk currentRank(Integer currentRank) {
    this.currentRank = currentRank;
    return this;
  }

  /**
   * The given character's current faction rank
   * minimum: 0
   * maximum: 9
   *
   * @return currentRank
   **/
  @ApiModelProperty(value = "The given character's current faction rank")

  @Min(0)
  @Max(9)
  public Integer getCurrentRank() {
    return currentRank;
  }

  public void setCurrentRank(Integer currentRank) {
    this.currentRank = currentRank;
  }

  public GetCharactersCharacterIdFwStatsOk enlistedOn(OffsetDateTime enlistedOn) {
    this.enlistedOn = enlistedOn;
    return this;
  }

  /**
   * The enlistment date of the given character into faction warfare. Will not be included if character is not enlisted in faction warfare
   *
   * @return enlistedOn
   **/
  @ApiModelProperty(value = "The enlistment date of the given character into faction warfare. Will not be included if character is not enlisted in faction warfare")

  @Valid

  public OffsetDateTime getEnlistedOn() {
    return enlistedOn;
  }

  public void setEnlistedOn(OffsetDateTime enlistedOn) {
    this.enlistedOn = enlistedOn;
  }

  public GetCharactersCharacterIdFwStatsOk factionId(Integer factionId) {
    this.factionId = factionId;
    return this;
  }

  /**
   * The faction the given character is enlisted to fight for. Will not be included if character is not enlisted in faction warfare
   *
   * @return factionId
   **/
  @ApiModelProperty(value = "The faction the given character is enlisted to fight for. Will not be included if character is not enlisted in faction warfare")


  public Integer getFactionId() {
    return factionId;
  }

  public void setFactionId(Integer factionId) {
    this.factionId = factionId;
  }

  public GetCharactersCharacterIdFwStatsOk highestRank(Integer highestRank) {
    this.highestRank = highestRank;
    return this;
  }

  /**
   * The given character's highest faction rank achieved
   * minimum: 0
   * maximum: 9
   *
   * @return highestRank
   **/
  @ApiModelProperty(value = "The given character's highest faction rank achieved")

  @Min(0)
  @Max(9)
  public Integer getHighestRank() {
    return highestRank;
  }

  public void setHighestRank(Integer highestRank) {
    this.highestRank = highestRank;
  }

  public GetCharactersCharacterIdFwStatsOk kills(GetCharactersCharacterIdFwStatsKills kills) {
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

  public GetCharactersCharacterIdFwStatsKills getKills() {
    return kills;
  }

  public void setKills(GetCharactersCharacterIdFwStatsKills kills) {
    this.kills = kills;
  }

  public GetCharactersCharacterIdFwStatsOk victoryPoints(GetCharactersCharacterIdFwStatsVictoryPoints victoryPoints) {
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

  public GetCharactersCharacterIdFwStatsVictoryPoints getVictoryPoints() {
    return victoryPoints;
  }

  public void setVictoryPoints(GetCharactersCharacterIdFwStatsVictoryPoints victoryPoints) {
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
    GetCharactersCharacterIdFwStatsOk getCharactersCharacterIdFwStatsOk = (GetCharactersCharacterIdFwStatsOk) o;
    return Objects.equals(this.currentRank, getCharactersCharacterIdFwStatsOk.currentRank) &&
        Objects.equals(this.enlistedOn, getCharactersCharacterIdFwStatsOk.enlistedOn) &&
        Objects.equals(this.factionId, getCharactersCharacterIdFwStatsOk.factionId) &&
        Objects.equals(this.highestRank, getCharactersCharacterIdFwStatsOk.highestRank) &&
        Objects.equals(this.kills, getCharactersCharacterIdFwStatsOk.kills) &&
        Objects.equals(this.victoryPoints, getCharactersCharacterIdFwStatsOk.victoryPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentRank, enlistedOn, factionId, highestRank, kills, victoryPoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdFwStatsOk {\n");

    sb.append("    currentRank: ").append(toIndentedString(currentRank)).append("\n");
    sb.append("    enlistedOn: ").append(toIndentedString(enlistedOn)).append("\n");
    sb.append("    factionId: ").append(toIndentedString(factionId)).append("\n");
    sb.append("    highestRank: ").append(toIndentedString(highestRank)).append("\n");
    sb.append("    kills: ").append(toIndentedString(kills)).append("\n");
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

