package com.github.tddts.eve.model.wars;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Summary of kills against an enemy faction for the given faction
 */
@ApiModel(description = "Summary of kills against an enemy faction for the given faction")
@Validated
public class GetFwStatsKills {
  @JsonProperty("last_week")
  private Integer lastWeek = null;

  @JsonProperty("total")
  private Integer total = null;

  @JsonProperty("yesterday")
  private Integer yesterday = null;

  public GetFwStatsKills lastWeek(Integer lastWeek) {
    this.lastWeek = lastWeek;
    return this;
  }

  /**
   * Last week's total number of kills against enemy factions
   *
   * @return lastWeek
   **/
  @ApiModelProperty(required = true, value = "Last week's total number of kills against enemy factions")
  @NotNull


  public Integer getLastWeek() {
    return lastWeek;
  }

  public void setLastWeek(Integer lastWeek) {
    this.lastWeek = lastWeek;
  }

  public GetFwStatsKills total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Total number of kills against enemy factions since faction warfare began
   *
   * @return total
   **/
  @ApiModelProperty(required = true, value = "Total number of kills against enemy factions since faction warfare began")
  @NotNull


  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public GetFwStatsKills yesterday(Integer yesterday) {
    this.yesterday = yesterday;
    return this;
  }

  /**
   * Yesterday's total number of kills against enemy factions
   *
   * @return yesterday
   **/
  @ApiModelProperty(required = true, value = "Yesterday's total number of kills against enemy factions")
  @NotNull


  public Integer getYesterday() {
    return yesterday;
  }

  public void setYesterday(Integer yesterday) {
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
    GetFwStatsKills getFwStatsKills = (GetFwStatsKills) o;
    return Objects.equals(this.lastWeek, getFwStatsKills.lastWeek) &&
        Objects.equals(this.total, getFwStatsKills.total) &&
        Objects.equals(this.yesterday, getFwStatsKills.yesterday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastWeek, total, yesterday);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFwStatsKills {\n");

    sb.append("    lastWeek: ").append(toIndentedString(lastWeek)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

