package com.github.tddts.eve.model.killmail;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * item object
 */
@ApiModel(description = "item object")
@Validated
public class GetKillmailsKillmailIdKillmailHashItemsItem {
  @JsonProperty("flag")
  private Integer flag = null;

  @JsonProperty("item_type_id")
  private Integer itemTypeId = null;

  @JsonProperty("quantity_destroyed")
  private Long quantityDestroyed = null;

  @JsonProperty("quantity_dropped")
  private Long quantityDropped = null;

  @JsonProperty("singleton")
  private Integer singleton = null;

  public GetKillmailsKillmailIdKillmailHashItemsItem flag(Integer flag) {
    this.flag = flag;
    return this;
  }

  /**
   * flag integer
   *
   * @return flag
   **/
  @ApiModelProperty(required = true, value = "flag integer")
  @NotNull


  public Integer getFlag() {
    return flag;
  }

  public void setFlag(Integer flag) {
    this.flag = flag;
  }

  public GetKillmailsKillmailIdKillmailHashItemsItem itemTypeId(Integer itemTypeId) {
    this.itemTypeId = itemTypeId;
    return this;
  }

  /**
   * item_type_id integer
   *
   * @return itemTypeId
   **/
  @ApiModelProperty(required = true, value = "item_type_id integer")
  @NotNull


  public Integer getItemTypeId() {
    return itemTypeId;
  }

  public void setItemTypeId(Integer itemTypeId) {
    this.itemTypeId = itemTypeId;
  }

  public GetKillmailsKillmailIdKillmailHashItemsItem quantityDestroyed(Long quantityDestroyed) {
    this.quantityDestroyed = quantityDestroyed;
    return this;
  }

  /**
   * quantity_destroyed integer
   *
   * @return quantityDestroyed
   **/
  @ApiModelProperty(value = "quantity_destroyed integer")


  public Long getQuantityDestroyed() {
    return quantityDestroyed;
  }

  public void setQuantityDestroyed(Long quantityDestroyed) {
    this.quantityDestroyed = quantityDestroyed;
  }

  public GetKillmailsKillmailIdKillmailHashItemsItem quantityDropped(Long quantityDropped) {
    this.quantityDropped = quantityDropped;
    return this;
  }

  /**
   * quantity_dropped integer
   *
   * @return quantityDropped
   **/
  @ApiModelProperty(value = "quantity_dropped integer")


  public Long getQuantityDropped() {
    return quantityDropped;
  }

  public void setQuantityDropped(Long quantityDropped) {
    this.quantityDropped = quantityDropped;
  }

  public GetKillmailsKillmailIdKillmailHashItemsItem singleton(Integer singleton) {
    this.singleton = singleton;
    return this;
  }

  /**
   * singleton integer
   *
   * @return singleton
   **/
  @ApiModelProperty(required = true, value = "singleton integer")
  @NotNull


  public Integer getSingleton() {
    return singleton;
  }

  public void setSingleton(Integer singleton) {
    this.singleton = singleton;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetKillmailsKillmailIdKillmailHashItemsItem getKillmailsKillmailIdKillmailHashItemsItem = (GetKillmailsKillmailIdKillmailHashItemsItem) o;
    return Objects.equals(this.flag, getKillmailsKillmailIdKillmailHashItemsItem.flag) &&
        Objects.equals(this.itemTypeId, getKillmailsKillmailIdKillmailHashItemsItem.itemTypeId) &&
        Objects.equals(this.quantityDestroyed, getKillmailsKillmailIdKillmailHashItemsItem.quantityDestroyed) &&
        Objects.equals(this.quantityDropped, getKillmailsKillmailIdKillmailHashItemsItem.quantityDropped) &&
        Objects.equals(this.singleton, getKillmailsKillmailIdKillmailHashItemsItem.singleton);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flag, itemTypeId, quantityDestroyed, quantityDropped, singleton);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetKillmailsKillmailIdKillmailHashItemsItem {\n");

    sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
    sb.append("    itemTypeId: ").append(toIndentedString(itemTypeId)).append("\n");
    sb.append("    quantityDestroyed: ").append(toIndentedString(quantityDestroyed)).append("\n");
    sb.append("    quantityDropped: ").append(toIndentedString(quantityDropped)).append("\n");
    sb.append("    singleton: ").append(toIndentedString(singleton)).append("\n");
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

