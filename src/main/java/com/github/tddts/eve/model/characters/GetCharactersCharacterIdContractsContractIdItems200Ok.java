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
public class GetCharactersCharacterIdContractsContractIdItems200Ok {
  @JsonProperty("is_included")
  private Boolean isIncluded = null;

  @JsonProperty("is_singleton")
  private Boolean isSingleton = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("raw_quantity")
  private Integer rawQuantity = null;

  @JsonProperty("record_id")
  private Long recordId = null;

  @JsonProperty("type_id")
  private Integer typeId = null;

  public GetCharactersCharacterIdContractsContractIdItems200Ok isIncluded(Boolean isIncluded) {
    this.isIncluded = isIncluded;
    return this;
  }

  /**
   * true if the contract issuer has submitted this item with the contract, false if the isser is asking for this item in the contract
   *
   * @return isIncluded
   **/
  @ApiModelProperty(required = true, value = "true if the contract issuer has submitted this item with the contract, false if the isser is asking for this item in the contract")
  @NotNull


  public Boolean isIsIncluded() {
    return isIncluded;
  }

  public void setIsIncluded(Boolean isIncluded) {
    this.isIncluded = isIncluded;
  }

  public GetCharactersCharacterIdContractsContractIdItems200Ok isSingleton(Boolean isSingleton) {
    this.isSingleton = isSingleton;
    return this;
  }

  /**
   * is_singleton boolean
   *
   * @return isSingleton
   **/
  @ApiModelProperty(required = true, value = "is_singleton boolean")
  @NotNull


  public Boolean isIsSingleton() {
    return isSingleton;
  }

  public void setIsSingleton(Boolean isSingleton) {
    this.isSingleton = isSingleton;
  }

  public GetCharactersCharacterIdContractsContractIdItems200Ok quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Number of items in the stack
   *
   * @return quantity
   **/
  @ApiModelProperty(required = true, value = "Number of items in the stack")
  @NotNull


  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public GetCharactersCharacterIdContractsContractIdItems200Ok rawQuantity(Integer rawQuantity) {
    this.rawQuantity = rawQuantity;
    return this;
  }

  /**
   * -1 indicates that the item is a singleton (non-stackable). If the item happens to be a Blueprint, -1 is an Original and -2 is a Blueprint Copy
   *
   * @return rawQuantity
   **/
  @ApiModelProperty(value = "-1 indicates that the item is a singleton (non-stackable). If the item happens to be a Blueprint, -1 is an Original and -2 is a Blueprint Copy")


  public Integer getRawQuantity() {
    return rawQuantity;
  }

  public void setRawQuantity(Integer rawQuantity) {
    this.rawQuantity = rawQuantity;
  }

  public GetCharactersCharacterIdContractsContractIdItems200Ok recordId(Long recordId) {
    this.recordId = recordId;
    return this;
  }

  /**
   * Unique ID for the item
   *
   * @return recordId
   **/
  @ApiModelProperty(required = true, value = "Unique ID for the item")
  @NotNull


  public Long getRecordId() {
    return recordId;
  }

  public void setRecordId(Long recordId) {
    this.recordId = recordId;
  }

  public GetCharactersCharacterIdContractsContractIdItems200Ok typeId(Integer typeId) {
    this.typeId = typeId;
    return this;
  }

  /**
   * Type ID for item
   *
   * @return typeId
   **/
  @ApiModelProperty(required = true, value = "Type ID for item")
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
    GetCharactersCharacterIdContractsContractIdItems200Ok getCharactersCharacterIdContractsContractIdItems200Ok = (GetCharactersCharacterIdContractsContractIdItems200Ok) o;
    return Objects.equals(this.isIncluded, getCharactersCharacterIdContractsContractIdItems200Ok.isIncluded) &&
        Objects.equals(this.isSingleton, getCharactersCharacterIdContractsContractIdItems200Ok.isSingleton) &&
        Objects.equals(this.quantity, getCharactersCharacterIdContractsContractIdItems200Ok.quantity) &&
        Objects.equals(this.rawQuantity, getCharactersCharacterIdContractsContractIdItems200Ok.rawQuantity) &&
        Objects.equals(this.recordId, getCharactersCharacterIdContractsContractIdItems200Ok.recordId) &&
        Objects.equals(this.typeId, getCharactersCharacterIdContractsContractIdItems200Ok.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isIncluded, isSingleton, quantity, rawQuantity, recordId, typeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdContractsContractIdItems200Ok {\n");

    sb.append("    isIncluded: ").append(toIndentedString(isIncluded)).append("\n");
    sb.append("    isSingleton: ").append(toIndentedString(isSingleton)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    rawQuantity: ").append(toIndentedString(rawQuantity)).append("\n");
    sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
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

