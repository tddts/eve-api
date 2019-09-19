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
public class GetFwLeaderboardsActiveTotalActiveTotal1 {
  @JsonProperty("amount")
  private Integer amount = null;

  @JsonProperty("faction_id")
  private Integer factionId = null;

  public GetFwLeaderboardsActiveTotalActiveTotal1 amount(Integer amount) {
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

  public GetFwLeaderboardsActiveTotalActiveTotal1 factionId(Integer factionId) {
    this.factionId = factionId;
    return this;
  }

  /**
   * faction_id integer
   *
   * @return factionId
   **/
  @ApiModelProperty(value = "faction_id integer")


  public Integer getFactionId() {
    return factionId;
  }

  public void setFactionId(Integer factionId) {
    this.factionId = factionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFwLeaderboardsActiveTotalActiveTotal1 getFwLeaderboardsActiveTotalActiveTotal1 = (GetFwLeaderboardsActiveTotalActiveTotal1) o;
    return Objects.equals(this.amount, getFwLeaderboardsActiveTotalActiveTotal1.amount) &&
        Objects.equals(this.factionId, getFwLeaderboardsActiveTotalActiveTotal1.factionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, factionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFwLeaderboardsActiveTotalActiveTotal1 {\n");

    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    factionId: ").append(toIndentedString(factionId)).append("\n");
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

