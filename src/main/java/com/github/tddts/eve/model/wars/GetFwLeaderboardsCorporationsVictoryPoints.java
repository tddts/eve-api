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
 * Top 10 rankings of corporations by victory points from yesterday, last week and in total
 */
@ApiModel(description = "Top 10 rankings of corporations by victory points from yesterday, last week and in total")
@Validated
public class GetFwLeaderboardsCorporationsVictoryPoints {
  @JsonProperty("active_total")
  @Valid
  private List<GetFwLeaderboardsCorporationsActiveTotalActiveTotal1> activeTotal = new ArrayList<GetFwLeaderboardsCorporationsActiveTotalActiveTotal1>();

  @JsonProperty("last_week")
  @Valid
  private List<GetFwLeaderboardsCorporationsLastWeekLastWeek1> lastWeek = new ArrayList<GetFwLeaderboardsCorporationsLastWeekLastWeek1>();

  @JsonProperty("yesterday")
  @Valid
  private List<GetFwLeaderboardsCorporationsYesterdayYesterday1> yesterday = new ArrayList<GetFwLeaderboardsCorporationsYesterdayYesterday1>();

  public GetFwLeaderboardsCorporationsVictoryPoints activeTotal(List<GetFwLeaderboardsCorporationsActiveTotalActiveTotal1> activeTotal) {
    this.activeTotal = activeTotal;
    return this;
  }

  public GetFwLeaderboardsCorporationsVictoryPoints addActiveTotalItem(GetFwLeaderboardsCorporationsActiveTotalActiveTotal1 activeTotalItem) {
    this.activeTotal.add(activeTotalItem);
    return this;
  }

  /**
   * Top 10 ranking of corporations active in faction warfare by total victory points. A corporation is considered \"active\" if they have participated in faction warfare in the past 14 days
   *
   * @return activeTotal
   **/
  @ApiModelProperty(required = true, value = "Top 10 ranking of corporations active in faction warfare by total victory points. A corporation is considered \"active\" if they have participated in faction warfare in the past 14 days")
  @NotNull

  @Valid
  @Size(max = 10)
  public List<GetFwLeaderboardsCorporationsActiveTotalActiveTotal1> getActiveTotal() {
    return activeTotal;
  }

  public void setActiveTotal(List<GetFwLeaderboardsCorporationsActiveTotalActiveTotal1> activeTotal) {
    this.activeTotal = activeTotal;
  }

  public GetFwLeaderboardsCorporationsVictoryPoints lastWeek(List<GetFwLeaderboardsCorporationsLastWeekLastWeek1> lastWeek) {
    this.lastWeek = lastWeek;
    return this;
  }

  public GetFwLeaderboardsCorporationsVictoryPoints addLastWeekItem(GetFwLeaderboardsCorporationsLastWeekLastWeek1 lastWeekItem) {
    this.lastWeek.add(lastWeekItem);
    return this;
  }

  /**
   * Top 10 ranking of corporations by victory points in the past week
   *
   * @return lastWeek
   **/
  @ApiModelProperty(required = true, value = "Top 10 ranking of corporations by victory points in the past week")
  @NotNull

  @Valid
  @Size(max = 10)
  public List<GetFwLeaderboardsCorporationsLastWeekLastWeek1> getLastWeek() {
    return lastWeek;
  }

  public void setLastWeek(List<GetFwLeaderboardsCorporationsLastWeekLastWeek1> lastWeek) {
    this.lastWeek = lastWeek;
  }

  public GetFwLeaderboardsCorporationsVictoryPoints yesterday(List<GetFwLeaderboardsCorporationsYesterdayYesterday1> yesterday) {
    this.yesterday = yesterday;
    return this;
  }

  public GetFwLeaderboardsCorporationsVictoryPoints addYesterdayItem(GetFwLeaderboardsCorporationsYesterdayYesterday1 yesterdayItem) {
    this.yesterday.add(yesterdayItem);
    return this;
  }

  /**
   * Top 10 ranking of corporations by victory points in the past day
   *
   * @return yesterday
   **/
  @ApiModelProperty(required = true, value = "Top 10 ranking of corporations by victory points in the past day")
  @NotNull

  @Valid
  @Size(max = 10)
  public List<GetFwLeaderboardsCorporationsYesterdayYesterday1> getYesterday() {
    return yesterday;
  }

  public void setYesterday(List<GetFwLeaderboardsCorporationsYesterdayYesterday1> yesterday) {
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
    GetFwLeaderboardsCorporationsVictoryPoints getFwLeaderboardsCorporationsVictoryPoints = (GetFwLeaderboardsCorporationsVictoryPoints) o;
    return Objects.equals(this.activeTotal, getFwLeaderboardsCorporationsVictoryPoints.activeTotal) &&
        Objects.equals(this.lastWeek, getFwLeaderboardsCorporationsVictoryPoints.lastWeek) &&
        Objects.equals(this.yesterday, getFwLeaderboardsCorporationsVictoryPoints.yesterday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeTotal, lastWeek, yesterday);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFwLeaderboardsCorporationsVictoryPoints {\n");

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

