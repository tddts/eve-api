package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@Validated
public class GetCharactersCharacterIdLoyaltyPoints200Ok {
  @JsonProperty("corporation_id")
  private Integer corporationId = null;

  @JsonProperty("loyalty_points")
  private Integer loyaltyPoints = null;

  public GetCharactersCharacterIdLoyaltyPoints200Ok corporationId(Integer corporationId) {
    this.corporationId = corporationId;
    return this;
  }

  /**
   * corporation_id integer
   *
   * @return corporationId
   **/
  @ApiModelProperty(required = true, value = "corporation_id integer")
  @NotNull


  public Integer getCorporationId() {
    return corporationId;
  }

  public void setCorporationId(Integer corporationId) {
    this.corporationId = corporationId;
  }

  public GetCharactersCharacterIdLoyaltyPoints200Ok loyaltyPoints(Integer loyaltyPoints) {
    this.loyaltyPoints = loyaltyPoints;
    return this;
  }

  /**
   * loyalty_points integer
   *
   * @return loyaltyPoints
   **/
  @ApiModelProperty(required = true, value = "loyalty_points integer")
  @NotNull


  public Integer getLoyaltyPoints() {
    return loyaltyPoints;
  }

  public void setLoyaltyPoints(Integer loyaltyPoints) {
    this.loyaltyPoints = loyaltyPoints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdLoyaltyPoints200Ok getCharactersCharacterIdLoyaltyPoints200Ok = (GetCharactersCharacterIdLoyaltyPoints200Ok) o;
    return Objects.equals(this.corporationId, getCharactersCharacterIdLoyaltyPoints200Ok.corporationId) &&
        Objects.equals(this.loyaltyPoints, getCharactersCharacterIdLoyaltyPoints200Ok.loyaltyPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corporationId, loyaltyPoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdLoyaltyPoints200Ok {\n");

    sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
    sb.append("    loyaltyPoints: ").append(toIndentedString(loyaltyPoints)).append("\n");
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

