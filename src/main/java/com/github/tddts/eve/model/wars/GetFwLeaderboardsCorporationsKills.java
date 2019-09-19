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
 * Top 10 rankings of corporations by number of kills from yesterday, last week and in total
 */
@ApiModel(description = "Top 10 rankings of corporations by number of kills from yesterday, last week and in total")
@Validated
public class GetFwLeaderboardsCorporationsKills {
  @JsonProperty("active_total")
  @Valid
  private List<GetFwLeaderboardsCorporationsActiveTotalActiveTotal> activeTotal = new ArrayList<GetFwLeaderboardsCorporationsActiveTotalActiveTotal>();

  @JsonProperty("last_week")
  @Valid
  private List<GetFwLeaderboardsCorporationsLastWeekLastWeek> lastWeek = new ArrayList<GetFwLeaderboardsCorporationsLastWeekLastWeek>();

  @JsonProperty("yesterday")
  @Valid
  private List<GetFwLeaderboardsCorporationsYesterdayYesterday> yesterday = new ArrayList<GetFwLeaderboardsCorporationsYesterdayYesterday>();

  public GetFwLeaderboardsCorporationsKills activeTotal(List<GetFwLeaderboardsCorporationsActiveTotalActiveTotal> activeTotal) {
    this.activeTotal = activeTotal;
    return this;
  }

  public GetFwLeaderboardsCorporationsKills addActiveTotalItem(GetFwLeaderboardsCorporationsActiveTotalActiveTotal activeTotalItem) {
    this.activeTotal.add(activeTotalItem);
    return this;
  }

  /**
   * Top 10 ranking of corporations active in faction warfare by total kills. A corporation is considered \"active\" if they have participated in faction warfare in the past 14 days
   *
   * @return activeTotal
   **/
  @ApiModelProperty(required = true, value = "Top 10 ranking of corporations active in faction warfare by total kills. A corporation is considered \"active\" if they have participated in faction warfare in the past 14 days")
  @NotNull

  @Valid
  @Size(max = 10)
  public List<GetFwLeaderboardsCorporationsActiveTotalActiveTotal> getActiveTotal() {
    return activeTotal;
  }

  public void setActiveTotal(List<GetFwLeaderboardsCorporationsActiveTotalActiveTotal> activeTotal) {
    this.activeTotal = activeTotal;
  }

  public GetFwLeaderboardsCorporationsKills lastWeek(List<GetFwLeaderboardsCorporationsLastWeekLastWeek> lastWeek) {
    this.lastWeek = lastWeek;
    return this;
  }

  public GetFwLeaderboardsCorporationsKills addLastWeekItem(GetFwLeaderboardsCorporationsLastWeekLastWeek lastWeekItem) {
    this.lastWeek.add(lastWeekItem);
    return this;
  }

  /**
   * Top 10 ranking of corporations by kills in the past week
   *
   * @return lastWeek
   **/
  @ApiModelProperty(required = true, value = "Top 10 ranking of corporations by kills in the past week")
  @NotNull

  @Valid
  @Size(max = 10)
  public List<GetFwLeaderboardsCorporationsLastWeekLastWeek> getLastWeek() {
    return lastWeek;
  }

  public void setLastWeek(List<GetFwLeaderboardsCorporationsLastWeekLastWeek> lastWeek) {
    this.lastWeek = lastWeek;
  }

  public GetFwLeaderboardsCorporationsKills yesterday(List<GetFwLeaderboardsCorporationsYesterdayYesterday> yesterday) {
    this.yesterday = yesterday;
    return this;
  }

  public GetFwLeaderboardsCorporationsKills addYesterdayItem(GetFwLeaderboardsCorporationsYesterdayYesterday yesterdayItem) {
    this.yesterday.add(yesterdayItem);
    return this;
  }

  /**
   * Top 10 ranking of corporations by kills in the past day
   *
   * @return yesterday
   **/
  @ApiModelProperty(required = true, value = "Top 10 ranking of corporations by kills in the past day")
  @NotNull

  @Valid
  @Size(max = 10)
  public List<GetFwLeaderboardsCorporationsYesterdayYesterday> getYesterday() {
    return yesterday;
  }

  public void setYesterday(List<GetFwLeaderboardsCorporationsYesterdayYesterday> yesterday) {
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
    GetFwLeaderboardsCorporationsKills getFwLeaderboardsCorporationsKills = (GetFwLeaderboardsCorporationsKills) o;
    return Objects.equals(this.activeTotal, getFwLeaderboardsCorporationsKills.activeTotal) &&
        Objects.equals(this.lastWeek, getFwLeaderboardsCorporationsKills.lastWeek) &&
        Objects.equals(this.yesterday, getFwLeaderboardsCorporationsKills.yesterday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeTotal, lastWeek, yesterday);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFwLeaderboardsCorporationsKills {\n");

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

