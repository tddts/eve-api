package com.github.tddts.eve.model.wars;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * last_week object
 */
@ApiModel(description = "last_week object")
@Validated
public class GetFwLeaderboardsCorporationsLastWeekLastWeek1 {
  @JsonProperty("amount")
  private Integer amount = null;

  @JsonProperty("corporation_id")
  private Integer corporationId = null;

  public GetFwLeaderboardsCorporationsLastWeekLastWeek1 amount(Integer amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Amount of victory points
   *
   * @return amount
   **/
  @ApiModelProperty(value = "Amount of victory points")


  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public GetFwLeaderboardsCorporationsLastWeekLastWeek1 corporationId(Integer corporationId) {
    this.corporationId = corporationId;
    return this;
  }

  /**
   * corporation_id integer
   *
   * @return corporationId
   **/
  @ApiModelProperty(value = "corporation_id integer")


  public Integer getCorporationId() {
    return corporationId;
  }

  public void setCorporationId(Integer corporationId) {
    this.corporationId = corporationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFwLeaderboardsCorporationsLastWeekLastWeek1 getFwLeaderboardsCorporationsLastWeekLastWeek1 = (GetFwLeaderboardsCorporationsLastWeekLastWeek1) o;
    return Objects.equals(this.amount, getFwLeaderboardsCorporationsLastWeekLastWeek1.amount) &&
        Objects.equals(this.corporationId, getFwLeaderboardsCorporationsLastWeekLastWeek1.corporationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, corporationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFwLeaderboardsCorporationsLastWeekLastWeek1 {\n");

    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
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

