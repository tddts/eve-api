package com.github.tddts.eve.model.wars;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * active_total object
 */
@ApiModel(description = "active_total object")
@Validated
public class GetFwLeaderboardsCorporationsActiveTotalActiveTotal {
  @JsonProperty("amount")
  private Integer amount = null;

  @JsonProperty("corporation_id")
  private Integer corporationId = null;

  public GetFwLeaderboardsCorporationsActiveTotalActiveTotal amount(Integer amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Amount of kills
   *
   * @return amount
   **/
  @ApiModelProperty(value = "Amount of kills")


  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public GetFwLeaderboardsCorporationsActiveTotalActiveTotal corporationId(Integer corporationId) {
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
    GetFwLeaderboardsCorporationsActiveTotalActiveTotal getFwLeaderboardsCorporationsActiveTotalActiveTotal = (GetFwLeaderboardsCorporationsActiveTotalActiveTotal) o;
    return Objects.equals(this.amount, getFwLeaderboardsCorporationsActiveTotalActiveTotal.amount) &&
        Objects.equals(this.corporationId, getFwLeaderboardsCorporationsActiveTotalActiveTotal.corporationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, corporationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFwLeaderboardsCorporationsActiveTotalActiveTotal {\n");

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

