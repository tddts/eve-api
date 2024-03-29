package com.github.tddts.eve.model.loyalty;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * required_item object
 */
@ApiModel(description = "required_item object")
@Validated
public class GetLoyaltyStoresCorporationIdOffersRequiredItem {
  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("type_id")
  private Integer typeId = null;

  public GetLoyaltyStoresCorporationIdOffersRequiredItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * quantity integer
   *
   * @return quantity
   **/
  @ApiModelProperty(required = true, value = "quantity integer")
  @NotNull


  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public GetLoyaltyStoresCorporationIdOffersRequiredItem typeId(Integer typeId) {
    this.typeId = typeId;
    return this;
  }

  /**
   * type_id integer
   *
   * @return typeId
   **/
  @ApiModelProperty(required = true, value = "type_id integer")
  @NotNull


  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLoyaltyStoresCorporationIdOffersRequiredItem getLoyaltyStoresCorporationIdOffersRequiredItem = (GetLoyaltyStoresCorporationIdOffersRequiredItem) o;
    return Objects.equals(this.quantity, getLoyaltyStoresCorporationIdOffersRequiredItem.quantity) &&
        Objects.equals(this.typeId, getLoyaltyStoresCorporationIdOffersRequiredItem.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, typeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLoyaltyStoresCorporationIdOffersRequiredItem {\n");

    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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

