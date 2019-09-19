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
 * Top 100 rankings of pilots by number of kills from yesterday, last week and in total
 */
@ApiModel(description = "Top 100 rankings of pilots by number of kills from yesterday, last week and in total")
@Validated
public class GetFwLeaderboardsCharactersKills {
  @JsonProperty("active_total")
  @Valid
  private List<GetFwLeaderboardsCharactersActiveTotalActiveTotal> activeTotal = new ArrayList<GetFwLeaderboardsCharactersActiveTotalActiveTotal>();

  @JsonProperty("last_week")
  @Valid
  private List<GetFwLeaderboardsCharactersLastWeekLastWeek> lastWeek = new ArrayList<GetFwLeaderboardsCharactersLastWeekLastWeek>();

  @JsonProperty("yesterday")
  @Valid
  private List<GetFwLeaderboardsCharactersYesterdayYesterday> yesterday = new ArrayList<GetFwLeaderboardsCharactersYesterdayYesterday>();

  public GetFwLeaderboardsCharactersKills activeTotal(List<GetFwLeaderboardsCharactersActiveTotalActiveTotal> activeTotal) {
    this.activeTotal = activeTotal;
    return this;
  }

  public GetFwLeaderboardsCharactersKills addActiveTotalItem(GetFwLeaderboardsCharactersActiveTotalActiveTotal activeTotalItem) {
    this.activeTotal.add(activeTotalItem);
    return this;
  }

  /**
   * Top 100 ranking of pilots active in faction warfare by total kills. A pilot is considered \"active\" if they have participated in faction warfare in the past 14 days
   *
   * @return activeTotal
   **/
  @ApiModelProperty(required = true, value = "Top 100 ranking of pilots active in faction warfare by total kills. A pilot is considered \"active\" if they have participated in faction warfare in the past 14 days")
  @NotNull

  @Valid
  @Size(max = 100)
  public List<GetFwLeaderboardsCharactersActiveTotalActiveTotal> getActiveTotal() {
    return activeTotal;
  }

  public void setActiveTotal(List<GetFwLeaderboardsCharactersActiveTotalActiveTotal> activeTotal) {
    this.activeTotal = activeTotal;
  }

  public GetFwLeaderboardsCharactersKills lastWeek(List<GetFwLeaderboardsCharactersLastWeekLastWeek> lastWeek) {
    this.lastWeek = lastWeek;
    return this;
  }

  public GetFwLeaderboardsCharactersKills addLastWeekItem(GetFwLeaderboardsCharactersLastWeekLastWeek lastWeekItem) {
    this.lastWeek.add(lastWeekItem);
    return this;
  }

  /**
   * Top 100 ranking of pilots by kills in the past week
   *
   * @return lastWeek
   **/
  @ApiModelProperty(required = true, value = "Top 100 ranking of pilots by kills in the past week")
  @NotNull

  @Valid
  @Size(max = 100)
  public List<GetFwLeaderboardsCharactersLastWeekLastWeek> getLastWeek() {
    return lastWeek;
  }

  public void setLastWeek(List<GetFwLeaderboardsCharactersLastWeekLastWeek> lastWeek) {
    this.lastWeek = lastWeek;
  }

  public GetFwLeaderboardsCharactersKills yesterday(List<GetFwLeaderboardsCharactersYesterdayYesterday> yesterday) {
    this.yesterday = yesterday;
    return this;
  }

  public GetFwLeaderboardsCharactersKills addYesterdayItem(GetFwLeaderboardsCharactersYesterdayYesterday yesterdayItem) {
    this.yesterday.add(yesterdayItem);
    return this;
  }

  /**
   * Top 100 ranking of pilots by kills in the past day
   *
   * @return yesterday
   **/
  @ApiModelProperty(required = true, value = "Top 100 ranking of pilots by kills in the past day")
  @NotNull

  @Valid
  @Size(max = 100)
  public List<GetFwLeaderboardsCharactersYesterdayYesterday> getYesterday() {
    return yesterday;
  }

  public void setYesterday(List<GetFwLeaderboardsCharactersYesterdayYesterday> yesterday) {
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
    GetFwLeaderboardsCharactersKills getFwLeaderboardsCharactersKills = (GetFwLeaderboardsCharactersKills) o;
    return Objects.equals(this.activeTotal, getFwLeaderboardsCharactersKills.activeTotal) &&
        Objects.equals(this.lastWeek, getFwLeaderboardsCharactersKills.lastWeek) &&
        Objects.equals(this.yesterday, getFwLeaderboardsCharactersKills.yesterday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeTotal, lastWeek, yesterday);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFwLeaderboardsCharactersKills {\n");

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

