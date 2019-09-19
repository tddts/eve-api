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
 * Top 100 rankings of pilots by victory points from yesterday, last week and in total
 */
@ApiModel(description = "Top 100 rankings of pilots by victory points from yesterday, last week and in total")
@Validated
public class GetFwLeaderboardsCharactersVictoryPoints {
  @JsonProperty("active_total")
  @Valid
  private List<GetFwLeaderboardsCharactersActiveTotalActiveTotal1> activeTotal = new ArrayList<GetFwLeaderboardsCharactersActiveTotalActiveTotal1>();

  @JsonProperty("last_week")
  @Valid
  private List<GetFwLeaderboardsCharactersLastWeekLastWeek1> lastWeek = new ArrayList<GetFwLeaderboardsCharactersLastWeekLastWeek1>();

  @JsonProperty("yesterday")
  @Valid
  private List<GetFwLeaderboardsCharactersYesterdayYesterday1> yesterday = new ArrayList<GetFwLeaderboardsCharactersYesterdayYesterday1>();

  public GetFwLeaderboardsCharactersVictoryPoints activeTotal(List<GetFwLeaderboardsCharactersActiveTotalActiveTotal1> activeTotal) {
    this.activeTotal = activeTotal;
    return this;
  }

  public GetFwLeaderboardsCharactersVictoryPoints addActiveTotalItem(GetFwLeaderboardsCharactersActiveTotalActiveTotal1 activeTotalItem) {
    this.activeTotal.add(activeTotalItem);
    return this;
  }

  /**
   * Top 100 ranking of pilots active in faction warfare by total victory points. A pilot is considered \"active\" if they have participated in faction warfare in the past 14 days
   *
   * @return activeTotal
   **/
  @ApiModelProperty(required = true, value = "Top 100 ranking of pilots active in faction warfare by total victory points. A pilot is considered \"active\" if they have participated in faction warfare in the past 14 days")
  @NotNull

  @Valid
  @Size(max = 100)
  public List<GetFwLeaderboardsCharactersActiveTotalActiveTotal1> getActiveTotal() {
    return activeTotal;
  }

  public void setActiveTotal(List<GetFwLeaderboardsCharactersActiveTotalActiveTotal1> activeTotal) {
    this.activeTotal = activeTotal;
  }

  public GetFwLeaderboardsCharactersVictoryPoints lastWeek(List<GetFwLeaderboardsCharactersLastWeekLastWeek1> lastWeek) {
    this.lastWeek = lastWeek;
    return this;
  }

  public GetFwLeaderboardsCharactersVictoryPoints addLastWeekItem(GetFwLeaderboardsCharactersLastWeekLastWeek1 lastWeekItem) {
    this.lastWeek.add(lastWeekItem);
    return this;
  }

  /**
   * Top 100 ranking of pilots by victory points in the past week
   *
   * @return lastWeek
   **/
  @ApiModelProperty(required = true, value = "Top 100 ranking of pilots by victory points in the past week")
  @NotNull

  @Valid
  @Size(max = 100)
  public List<GetFwLeaderboardsCharactersLastWeekLastWeek1> getLastWeek() {
    return lastWeek;
  }

  public void setLastWeek(List<GetFwLeaderboardsCharactersLastWeekLastWeek1> lastWeek) {
    this.lastWeek = lastWeek;
  }

  public GetFwLeaderboardsCharactersVictoryPoints yesterday(List<GetFwLeaderboardsCharactersYesterdayYesterday1> yesterday) {
    this.yesterday = yesterday;
    return this;
  }

  public GetFwLeaderboardsCharactersVictoryPoints addYesterdayItem(GetFwLeaderboardsCharactersYesterdayYesterday1 yesterdayItem) {
    this.yesterday.add(yesterdayItem);
    return this;
  }

  /**
   * Top 100 ranking of pilots by victory points in the past day
   *
   * @return yesterday
   **/
  @ApiModelProperty(required = true, value = "Top 100 ranking of pilots by victory points in the past day")
  @NotNull

  @Valid
  @Size(max = 100)
  public List<GetFwLeaderboardsCharactersYesterdayYesterday1> getYesterday() {
    return yesterday;
  }

  public void setYesterday(List<GetFwLeaderboardsCharactersYesterdayYesterday1> yesterday) {
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
    GetFwLeaderboardsCharactersVictoryPoints getFwLeaderboardsCharactersVictoryPoints = (GetFwLeaderboardsCharactersVictoryPoints) o;
    return Objects.equals(this.activeTotal, getFwLeaderboardsCharactersVictoryPoints.activeTotal) &&
        Objects.equals(this.lastWeek, getFwLeaderboardsCharactersVictoryPoints.lastWeek) &&
        Objects.equals(this.yesterday, getFwLeaderboardsCharactersVictoryPoints.yesterday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeTotal, lastWeek, yesterday);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFwLeaderboardsCharactersVictoryPoints {\n");

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

