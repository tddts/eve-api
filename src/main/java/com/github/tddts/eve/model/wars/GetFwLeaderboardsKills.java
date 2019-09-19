package com.github.tddts.eve.model.wars;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Top 4 rankings of factions by number of kills from yesterday, last week and in total
 */
@ApiModel(description = "Top 4 rankings of factions by number of kills from yesterday, last week and in total")
@Validated
public class GetFwLeaderboardsKills {
  @JsonProperty("active_total")
  @Valid
  private List<GetFwLeaderboardsActiveTotalActiveTotal> activeTotal = new ArrayList<GetFwLeaderboardsActiveTotalActiveTotal>();

  @JsonProperty("last_week")
  @Valid
  private List<GetFwLeaderboardsLastWeekLastWeek> lastWeek = new ArrayList<GetFwLeaderboardsLastWeekLastWeek>();

  @JsonProperty("yesterday")
  @Valid
  private List<GetFwLeaderboardsYesterdayYesterday> yesterday = new ArrayList<GetFwLeaderboardsYesterdayYesterday>();

  public GetFwLeaderboardsKills activeTotal(List<GetFwLeaderboardsActiveTotalActiveTotal> activeTotal) {
    this.activeTotal = activeTotal;
    return this;
  }

  public GetFwLeaderboardsKills addActiveTotalItem(GetFwLeaderboardsActiveTotalActiveTotal activeTotalItem) {
    this.activeTotal.add(activeTotalItem);
    return this;
  }

  /**
   * Top 4 ranking of factions active in faction warfare by total kills. A faction is considered \"active\" if they have participated in faction warfare in the past 14 days
   *
   * @return activeTotal
   **/
  @ApiModelProperty(required = true, value = "Top 4 ranking of factions active in faction warfare by total kills. A faction is considered \"active\" if they have participated in faction warfare in the past 14 days")
  @NotNull

  @Valid
  @Size(max = 4)
  public List<GetFwLeaderboardsActiveTotalActiveTotal> getActiveTotal() {
    return activeTotal;
  }

  public void setActiveTotal(List<GetFwLeaderboardsActiveTotalActiveTotal> activeTotal) {
    this.activeTotal = activeTotal;
  }

  public GetFwLeaderboardsKills lastWeek(List<GetFwLeaderboardsLastWeekLastWeek> lastWeek) {
    this.lastWeek = lastWeek;
    return this;
  }

  public GetFwLeaderboardsKills addLastWeekItem(GetFwLeaderboardsLastWeekLastWeek lastWeekItem) {
    this.lastWeek.add(lastWeekItem);
    return this;
  }

  /**
   * Top 4 ranking of factions by kills in the past week
   *
   * @return lastWeek
   **/
  @ApiModelProperty(required = true, value = "Top 4 ranking of factions by kills in the past week")
  @NotNull

  @Valid
  @Size(max = 4)
  public List<GetFwLeaderboardsLastWeekLastWeek> getLastWeek() {
    return lastWeek;
  }

  public void setLastWeek(List<GetFwLeaderboardsLastWeekLastWeek> lastWeek) {
    this.lastWeek = lastWeek;
  }

  public GetFwLeaderboardsKills yesterday(List<GetFwLeaderboardsYesterdayYesterday> yesterday) {
    this.yesterday = yesterday;
    return this;
  }

  public GetFwLeaderboardsKills addYesterdayItem(GetFwLeaderboardsYesterdayYesterday yesterdayItem) {
    this.yesterday.add(yesterdayItem);
    return this;
  }

  /**
   * Top 4 ranking of factions by kills in the past day
   *
   * @return yesterday
   **/
  @ApiModelProperty(required = true, value = "Top 4 ranking of factions by kills in the past day")
  @NotNull

  @Valid
  @Size(max = 4)
  public List<GetFwLeaderboardsYesterdayYesterday> getYesterday() {
    return yesterday;
  }

  public void setYesterday(List<GetFwLeaderboardsYesterdayYesterday> yesterday) {
    this.yesterday = yesterday;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFwLeaderboardsKills getFwLeaderboardsKills = (GetFwLeaderboardsKills) o;
    return Objects.equals(this.activeTotal, getFwLeaderboardsKills.activeTotal) &&
        Objects.equals(this.lastWeek, getFwLeaderboardsKills.lastWeek) &&
        Objects.equals(this.yesterday, getFwLeaderboardsKills.yesterday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeTotal, lastWeek, yesterday);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFwLeaderboardsKills {\n");

    sb.append("    activeTotal: ").append(toIndentedString(activeTotal)).append("\n");
    sb.append("    lastWeek: ").append(toIndentedString(lastWeek)).append("\n");
    sb.append("    yesterday: ").append(toIndentedString(yesterday)).append("\n");
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

