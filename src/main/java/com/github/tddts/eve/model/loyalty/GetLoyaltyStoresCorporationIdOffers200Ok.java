package com.github.tddts.eve.model.loyalty;

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
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@Validated
public class GetLoyaltyStoresCorporationIdOffers200Ok {
  @JsonProperty("ak_cost")
  private Integer akCost = null;

  @JsonProperty("isk_cost")
  private Long iskCost = null;

  @JsonProperty("lp_cost")
  private Integer lpCost = null;

  @JsonProperty("offer_id")
  private Integer offerId = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("required_items")
  @Valid
  private List<GetLoyaltyStoresCorporationIdOffersRequiredItem> requiredItems = new ArrayList<GetLoyaltyStoresCorporationIdOffersRequiredItem>();

  @JsonProperty("type_id")
  private Integer typeId = null;

  public GetLoyaltyStoresCorporationIdOffers200Ok akCost(Integer akCost) {
    this.akCost = akCost;
    return this;
  }

  /**
   * Analysis kredit cost
   *
   * @return akCost
   **/
  @ApiModelProperty(value = "Analysis kredit cost")


  public Integer getAkCost() {
    return akCost;
  }

  public void setAkCost(Integer akCost) {
    this.akCost = akCost;
  }

  public GetLoyaltyStoresCorporationIdOffers200Ok iskCost(Long iskCost) {
    this.iskCost = iskCost;
    return this;
  }

  /**
   * isk_cost integer
   *
   * @return iskCost
   **/
  @ApiModelProperty(required = true, value = "isk_cost integer")
  @NotNull


  public Long getIskCost() {
    return iskCost;
  }

  public void setIskCost(Long iskCost) {
    this.iskCost = iskCost;
  }

  public GetLoyaltyStoresCorporationIdOffers200Ok lpCost(Integer lpCost) {
    this.lpCost = lpCost;
    return this;
  }

  /**
   * lp_cost integer
   *
   * @return lpCost
   **/
  @ApiModelProperty(required = true, value = "lp_cost integer")
  @NotNull


  public Integer getLpCost() {
    return lpCost;
  }

  public void setLpCost(Integer lpCost) {
    this.lpCost = lpCost;
  }

  public GetLoyaltyStoresCorporationIdOffers200Ok offerId(Integer offerId) {
    this.offerId = offerId;
    return this;
  }

  /**
   * offer_id integer
   *
   * @return offerId
   **/
  @ApiModelProperty(required = true, value = "offer_id integer")
  @NotNull


  public Integer getOfferId() {
    return offerId;
  }

  public void setOfferId(Integer offerId) {
    this.offerId = offerId;
  }

  public GetLoyaltyStoresCorporationIdOffers200Ok quantity(Integer quantity) {
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

  public GetLoyaltyStoresCorporationIdOffers200Ok requiredItems(List<GetLoyaltyStoresCorporationIdOffersRequiredItem> requiredItems) {
    this.requiredItems = requiredItems;
    return this;
  }

  public GetLoyaltyStoresCorporationIdOffers200Ok addRequiredItemsItem(GetLoyaltyStoresCorporationIdOffersRequiredItem requiredItemsItem) {
    this.requiredItems.add(requiredItemsItem);
    return this;
  }

  /**
   * required_items array
   *
   * @return requiredItems
   **/
  @ApiModelProperty(required = true, value = "required_items array")
  @NotNull

  @Valid
  @Size(max = 100)
  public List<GetLoyaltyStoresCorporationIdOffersRequiredItem> getRequiredItems() {
    return requiredItems;
  }

  public void setRequiredItems(List<GetLoyaltyStoresCorporationIdOffersRequiredItem> requiredItems) {
    this.requiredItems = requiredItems;
  }

  public GetLoyaltyStoresCorporationIdOffers200Ok typeId(Integer typeId) {
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
    GetLoyaltyStoresCorporationIdOffers200Ok getLoyaltyStoresCorporationIdOffers200Ok = (GetLoyaltyStoresCorporationIdOffers200Ok) o;
    return Objects.equals(this.akCost, getLoyaltyStoresCorporationIdOffers200Ok.akCost) &&
        Objects.equals(this.iskCost, getLoyaltyStoresCorporationIdOffers200Ok.iskCost) &&
        Objects.equals(this.lpCost, getLoyaltyStoresCorporationIdOffers200Ok.lpCost) &&
        Objects.equals(this.offerId, getLoyaltyStoresCorporationIdOffers200Ok.offerId) &&
        Objects.equals(this.quantity, getLoyaltyStoresCorporationIdOffers200Ok.quantity) &&
        Objects.equals(this.requiredItems, getLoyaltyStoresCorporationIdOffers200Ok.requiredItems) &&
        Objects.equals(this.typeId, getLoyaltyStoresCorporationIdOffers200Ok.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(akCost, iskCost, lpCost, offerId, quantity, requiredItems, typeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLoyaltyStoresCorporationIdOffers200Ok {\n");

    sb.append("    akCost: ").append(toIndentedString(akCost)).append("\n");
    sb.append("    iskCost: ").append(toIndentedString(iskCost)).append("\n");
    sb.append("    lpCost: ").append(toIndentedString(lpCost)).append("\n");
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    requiredItems: ").append(toIndentedString(requiredItems)).append("\n");
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

