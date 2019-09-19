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
public class GetFwLeaderboardsCharactersOk {
  @JsonProperty("kills")
  private GetFwLeaderboardsCharactersKills kills = null;

  @JsonProperty("victory_points")
  private GetFwLeaderboardsCharactersVictoryPoints victoryPoints = null;

  public GetFwLeaderboardsCharactersOk kills(GetFwLeaderboardsCharactersKills kills) {
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

  public GetFwLeaderboardsCharactersKills getKills() {
    return kills;
  }

  public void setKills(GetFwLeaderboardsCharactersKills kills) {
    this.kills = kills;
  }

  public GetFwLeaderboardsCharactersOk victoryPoints(GetFwLeaderboardsCharactersVictoryPoints victoryPoints) {
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

  public GetFwLeaderboardsCharactersVictoryPoints getVictoryPoints() {
    return victoryPoints;
  }

  public void setVictoryPoints(GetFwLeaderboardsCharactersVictoryPoints victoryPoints) {
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
    GetFwLeaderboardsCharactersOk getFwLeaderboardsCharactersOk = (GetFwLeaderboardsCharactersOk) o;
    return Objects.equals(this.kills, getFwLeaderboardsCharactersOk.kills) &&
        Objects.equals(this.victoryPoints, getFwLeaderboardsCharactersOk.victoryPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kills, victoryPoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFwLeaderboardsCharactersOk {\n");

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

