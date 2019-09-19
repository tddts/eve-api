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
 * Top 4 rankings of factions by victory points from yesterday, last week and in total
 */
@ApiModel(description = "Top 4 rankings of factions by victory points from yesterday, last week and in total")
@Validated
public class GetFwLeaderboardsVictoryPoints {
  @JsonProperty("active_total")
  @Valid
  private List<GetFwLeaderboardsActiveTotalActiveTotal1> activeTotal = new ArrayList<GetFwLeaderboardsActiveTotalActiveTotal1>();

  @JsonProperty("last_week")
  @Valid
  private List<GetFwLeaderboardsLastWeekLastWeek1> lastWeek = new ArrayList<GetFwLeaderboardsLastWeekLastWeek1>();

  @JsonProperty("yesterday")
  @Valid
  private List<GetFwLeaderboardsYesterdayYesterday1> yesterday = new ArrayList<GetFwLeaderboardsYesterdayYesterday1>();

  public GetFwLeaderboardsVictoryPoints activeTotal(List<GetFwLeaderboardsActiveTotalActiveTotal1> activeTotal) {
    this.activeTotal = activeTotal;
    return this;
  }

  public GetFwLeaderboardsVictoryPoints addActiveTotalItem(GetFwLeaderboardsActiveTotalActiveTotal1 activeTotalItem) {
    this.activeTotal.add(activeTotalItem);
    return this;
  }

  /**
   * Top 4 ranking of factions active in faction warfare by total victory points. A faction is considered \"active\" if they have participated in faction warfare in the past 14 days
   *
   * @return activeTotal
   **/
  @ApiModelProperty(required = true, value = "Top 4 ranking of factions active in faction warfare by total victory points. A faction is considered \"active\" if they have participated in faction warfare in the past 14 days")
  @NotNull

  @Valid
  @Size(max = 4)
  public List<GetFwLeaderboardsActiveTotalActiveTotal1> getActiveTotal() {
    return activeTotal;
  }

  public void setActiveTotal(List<GetFwLeaderboardsActiveTotalActiveTotal1> activeTotal) {
    this.activeTotal = activeTotal;
  }

  public GetFwLeaderboardsVictoryPoints lastWeek(List<GetFwLeaderboardsLastWeekLastWeek1> lastWeek) {
    this.lastWeek = lastWeek;
    return this;
  }

  public GetFwLeaderboardsVictoryPoints addLastWeekItem(GetFwLeaderboardsLastWeekLastWeek1 lastWeekItem) {
    this.lastWeek.add(lastWeekItem);
    return this;
  }

  /**
   * Top 4 ranking of factions by victory points in the past week
   *
   * @return lastWeek
   **/
  @ApiModelProperty(required = true, value = "Top 4 ranking of factions by victory points in the past week")
  @NotNull

  @Valid
  @Size(max = 4)
  public List<GetFwLeaderboardsLastWeekLastWeek1> getLastWeek() {
    return lastWeek;
  }

  public void setLastWeek(List<GetFwLeaderboardsLastWeekLastWeek1> lastWeek) {
    this.lastWeek = lastWeek;
  }

  public GetFwLeaderboardsVictoryPoints yesterday(List<GetFwLeaderboardsYesterdayYesterday1> yesterday) {
    this.yesterday = yesterday;
    return this;
  }

  public GetFwLeaderboardsVictoryPoints addYesterdayItem(GetFwLeaderboardsYesterdayYesterday1 yesterdayItem) {
    this.yesterday.add(yesterdayItem);
    return this;
  }

  /**
   * Top 4 ranking of factions by victory points in the past day
   *
   * @return yesterday
   **/
  @ApiModelProperty(required = true, value = "Top 4 ranking of factions by victory points in the past day")
  @NotNull

  @Valid
  @Size(max = 4)
  public List<GetFwLeaderboardsYesterdayYesterday1> getYesterday() {
    return yesterday;
  }

  public void setYesterday(List<GetFwLeaderboardsYesterdayYesterday1> yesterday) {
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
    GetFwLeaderboardsVictoryPoints getFwLeaderboardsVictoryPoints = (GetFwLeaderboardsVictoryPoints) o;
    return Objects.equals(this.activeTotal, getFwLeaderboardsVictoryPoints.activeTotal) &&
        Objects.equals(this.lastWeek, getFwLeaderboardsVictoryPoints.lastWeek) &&
        Objects.equals(this.yesterday, getFwLeaderboardsVictoryPoints.yesterday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeTotal, lastWeek, yesterday);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFwLeaderboardsVictoryPoints {\n");

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

