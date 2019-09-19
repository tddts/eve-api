package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Summary of victory points gained by the given character for the enlisted faction
 */
@ApiModel(description = "Summary of victory points gained by the given character for the enlisted faction")
@Validated
public class GetCharactersCharacterIdFwStatsVictoryPoints {
  @JsonProperty("last_week")
  private Integer lastWeek = null;

  @JsonProperty("total")
  private Integer total = null;

  @JsonProperty("yesterday")
  private Integer yesterday = null;

  public GetCharactersCharacterIdFwStatsVictoryPoints lastWeek(Integer lastWeek) {
    this.lastWeek = lastWeek;
    return this;
  }

  /**
   * Last week's victory points gained by the given character
   *
   * @return lastWeek
   **/
  @ApiModelProperty(required = true, value = "Last week's victory points gained by the given character")
  @NotNull


  public Integer getLastWeek() {
    return lastWeek;
  }

  public void setLastWeek(Integer lastWeek) {
    this.lastWeek = lastWeek;
  }

  public GetCharactersCharacterIdFwStatsVictoryPoints total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Total victory points gained since the given character enlisted
   *
   * @return total
   **/
  @ApiModelProperty(required = true, value = "Total victory points gained since the given character enlisted")
  @NotNull


  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public GetCharactersCharacterIdFwStatsVictoryPoints yesterday(Integer yesterday) {
    this.yesterday = yesterday;
    return this;
  }

  /**
   * Yesterday's victory points gained by the given character
   *
   * @return yesterday
   **/
  @ApiModelProperty(required = true, value = "Yesterday's victory points gained by the given character")
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
    GetCharactersCharacterIdFwStatsVictoryPoints getCharactersCharacterIdFwStatsVictoryPoints = (GetCharactersCharacterIdFwStatsVictoryPoints) o;
    return Objects.equals(this.lastWeek, getCharactersCharacterIdFwStatsVictoryPoints.lastWeek) &&
        Objects.equals(this.total, getCharactersCharacterIdFwStatsVictoryPoints.total) &&
        Objects.equals(this.yesterday, getCharactersCharacterIdFwStatsVictoryPoints.yesterday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastWeek, total, yesterday);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdFwStatsVictoryPoints {\n");

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

