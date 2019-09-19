package com.github.tddts.eve.model.corporations;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Summary of victory points gained by the given corporation for the enlisted faction
 */
@ApiModel(description = "Summary of victory points gained by the given corporation for the enlisted faction")
@Validated
public class GetCorporationsCorporationIdFwStatsVictoryPoints {
  @JsonProperty("last_week")
  private Integer lastWeek = null;

  @JsonProperty("total")
  private Integer total = null;

  @JsonProperty("yesterday")
  private Integer yesterday = null;

  public GetCorporationsCorporationIdFwStatsVictoryPoints lastWeek(Integer lastWeek) {
    this.lastWeek = lastWeek;
    return this;
  }

  /**
   * Last week's victory points gained by members of the given corporation
   *
   * @return lastWeek
   **/
  @ApiModelProperty(required = true, value = "Last week's victory points gained by members of the given corporation")
  @NotNull


  public Integer getLastWeek() {
    return lastWeek;
  }

  public void setLastWeek(Integer lastWeek) {
    this.lastWeek = lastWeek;
  }

  public GetCorporationsCorporationIdFwStatsVictoryPoints total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Total victory points gained since the given corporation enlisted
   *
   * @return total
   **/
  @ApiModelProperty(required = true, value = "Total victory points gained since the given corporation enlisted")
  @NotNull


  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public GetCorporationsCorporationIdFwStatsVictoryPoints yesterday(Integer yesterday) {
    this.yesterday = yesterday;
    return this;
  }

  /**
   * Yesterday's victory points gained by members of the given corporation
   *
   * @return yesterday
   **/
  @ApiModelProperty(required = true, value = "Yesterday's victory points gained by members of the given corporation")
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
    GetCorporationsCorporationIdFwStatsVictoryPoints getCorporationsCorporationIdFwStatsVictoryPoints = (GetCorporationsCorporationIdFwStatsVictoryPoints) o;
    return Objects.equals(this.lastWeek, getCorporationsCorporationIdFwStatsVictoryPoints.lastWeek) &&
        Objects.equals(this.total, getCorporationsCorporationIdFwStatsVictoryPoints.total) &&
        Objects.equals(this.yesterday, getCorporationsCorporationIdFwStatsVictoryPoints.yesterday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastWeek, total, yesterday);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdFwStatsVictoryPoints {\n");

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

