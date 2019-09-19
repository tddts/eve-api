package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * wallet transaction
 */
@ApiModel(description = "wallet transaction")
@Validated
public class GetCharactersCharacterIdWalletTransactions200Ok {
  @JsonProperty("client_id")
  private Integer clientId = null;

  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("is_buy")
  private Boolean isBuy = null;

  @JsonProperty("is_personal")
  private Boolean isPersonal = null;

  @JsonProperty("journal_ref_id")
  private Long journalRefId = null;

  @JsonProperty("location_id")
  private Long locationId = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("transaction_id")
  private Long transactionId = null;

  @JsonProperty("type_id")
  private Integer typeId = null;

  @JsonProperty("unit_price")
  private Double unitPrice = null;

  public GetCharactersCharacterIdWalletTransactions200Ok clientId(Integer clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * client_id integer
   *
   * @return clientId
   **/
  @ApiModelProperty(required = true, value = "client_id integer")
  @NotNull


  public Integer getClientId() {
    return clientId;
  }

  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

  public GetCharactersCharacterIdWalletTransactions200Ok date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Date and time of transaction
   *
   * @return date
   **/
  @ApiModelProperty(required = true, value = "Date and time of transaction")
  @NotNull

  @Valid

  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public GetCharactersCharacterIdWalletTransactions200Ok isBuy(Boolean isBuy) {
    this.isBuy = isBuy;
    return this;
  }

  /**
   * is_buy boolean
   *
   * @return isBuy
   **/
  @ApiModelProperty(required = true, value = "is_buy boolean")
  @NotNull


  public Boolean isIsBuy() {
    return isBuy;
  }

  public void setIsBuy(Boolean isBuy) {
    this.isBuy = isBuy;
  }

  public GetCharactersCharacterIdWalletTransactions200Ok isPersonal(Boolean isPersonal) {
    this.isPersonal = isPersonal;
    return this;
  }

  /**
   * is_personal boolean
   *
   * @return isPersonal
   **/
  @ApiModelProperty(required = true, value = "is_personal boolean")
  @NotNull


  public Boolean isIsPersonal() {
    return isPersonal;
  }

  public void setIsPersonal(Boolean isPersonal) {
    this.isPersonal = isPersonal;
  }

  public GetCharactersCharacterIdWalletTransactions200Ok journalRefId(Long journalRefId) {
    this.journalRefId = journalRefId;
    return this;
  }

  /**
   * journal_ref_id integer
   *
   * @return journalRefId
   **/
  @ApiModelProperty(required = true, value = "journal_ref_id integer")
  @NotNull


  public Long getJournalRefId() {
    return journalRefId;
  }

  public void setJournalRefId(Long journalRefId) {
    this.journalRefId = journalRefId;
  }

  public GetCharactersCharacterIdWalletTransactions200Ok locationId(Long locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * location_id integer
   *
   * @return locationId
   **/
  @ApiModelProperty(required = true, value = "location_id integer")
  @NotNull


  public Long getLocationId() {
    return locationId;
  }

  public void setLocationId(Long locationId) {
    this.locationId = locationId;
  }

  public GetCharactersCharacterIdWalletTransactions200Ok quantity(Integer quantity) {
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

  public GetCharactersCharacterIdWalletTransactions200Ok transactionId(Long transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Unique transaction ID
   *
   * @return transactionId
   **/
  @ApiModelProperty(required = true, value = "Unique transaction ID")
  @NotNull


  public Long getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(Long transactionId) {
    this.transactionId = transactionId;
  }

  public GetCharactersCharacterIdWalletTransactions200Ok typeId(Integer typeId) {
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

  public GetCharactersCharacterIdWalletTransactions200Ok unitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

  /**
   * Amount paid per unit
   *
   * @return unitPrice
   **/
  @ApiModelProperty(required = true, value = "Amount paid per unit")
  @NotNull


  public Double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdWalletTransactions200Ok getCharactersCharacterIdWalletTransactions200Ok = (GetCharactersCharacterIdWalletTransactions200Ok) o;
    return Objects.equals(this.clientId, getCharactersCharacterIdWalletTransactions200Ok.clientId) &&
        Objects.equals(this.date, getCharactersCharacterIdWalletTransactions200Ok.date) &&
        Objects.equals(this.isBuy, getCharactersCharacterIdWalletTransactions200Ok.isBuy) &&
        Objects.equals(this.isPersonal, getCharactersCharacterIdWalletTransactions200Ok.isPersonal) &&
        Objects.equals(this.journalRefId, getCharactersCharacterIdWalletTransactions200Ok.journalRefId) &&
        Objects.equals(this.locationId, getCharactersCharacterIdWalletTransactions200Ok.locationId) &&
        Objects.equals(this.quantity, getCharactersCharacterIdWalletTransactions200Ok.quantity) &&
        Objects.equals(this.transactionId, getCharactersCharacterIdWalletTransactions200Ok.transactionId) &&
        Objects.equals(this.typeId, getCharactersCharacterIdWalletTransactions200Ok.typeId) &&
        Objects.equals(this.unitPrice, getCharactersCharacterIdWalletTransactions200Ok.unitPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, date, isBuy, isPersonal, journalRefId, locationId, quantity, transactionId, typeId, unitPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdWalletTransactions200Ok {\n");

    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    isBuy: ").append(toIndentedString(isBuy)).append("\n");
    sb.append("    isPersonal: ").append(toIndentedString(isPersonal)).append("\n");
    sb.append("    journalRefId: ").append(toIndentedString(journalRefId)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
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

