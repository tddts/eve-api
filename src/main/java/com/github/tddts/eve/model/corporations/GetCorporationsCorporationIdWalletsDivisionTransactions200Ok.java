package com.github.tddts.eve.model.corporations;

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
public class GetCorporationsCorporationIdWalletsDivisionTransactions200Ok {
  @JsonProperty("client_id")
  private Integer clientId = null;

  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("is_buy")
  private Boolean isBuy = null;

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

  public GetCorporationsCorporationIdWalletsDivisionTransactions200Ok clientId(Integer clientId) {
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

  public GetCorporationsCorporationIdWalletsDivisionTransactions200Ok date(OffsetDateTime date) {
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

  public GetCorporationsCorporationIdWalletsDivisionTransactions200Ok isBuy(Boolean isBuy) {
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

  public GetCorporationsCorporationIdWalletsDivisionTransactions200Ok journalRefId(Long journalRefId) {
    this.journalRefId = journalRefId;
    return this;
  }

  /**
   * -1 if there is no corresponding wallet journal entry
   *
   * @return journalRefId
   **/
  @ApiModelProperty(required = true, value = "-1 if there is no corresponding wallet journal entry")
  @NotNull


  public Long getJournalRefId() {
    return journalRefId;
  }

  public void setJournalRefId(Long journalRefId) {
    this.journalRefId = journalRefId;
  }

  public GetCorporationsCorporationIdWalletsDivisionTransactions200Ok locationId(Long locationId) {
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

  public GetCorporationsCorporationIdWalletsDivisionTransactions200Ok quantity(Integer quantity) {
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

  public GetCorporationsCorporationIdWalletsDivisionTransactions200Ok transactionId(Long transactionId) {
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

  public GetCorporationsCorporationIdWalletsDivisionTransactions200Ok typeId(Integer typeId) {
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

  public GetCorporationsCorporationIdWalletsDivisionTransactions200Ok unitPrice(Double unitPrice) {
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
    GetCorporationsCorporationIdWalletsDivisionTransactions200Ok getCorporationsCorporationIdWalletsDivisionTransactions200Ok = (GetCorporationsCorporationIdWalletsDivisionTransactions200Ok) o;
    return Objects.equals(this.clientId, getCorporationsCorporationIdWalletsDivisionTransactions200Ok.clientId) &&
        Objects.equals(this.date, getCorporationsCorporationIdWalletsDivisionTransactions200Ok.date) &&
        Objects.equals(this.isBuy, getCorporationsCorporationIdWalletsDivisionTransactions200Ok.isBuy) &&
        Objects.equals(this.journalRefId, getCorporationsCorporationIdWalletsDivisionTransactions200Ok.journalRefId) &&
        Objects.equals(this.locationId, getCorporationsCorporationIdWalletsDivisionTransactions200Ok.locationId) &&
        Objects.equals(this.quantity, getCorporationsCorporationIdWalletsDivisionTransactions200Ok.quantity) &&
        Objects.equals(this.transactionId, getCorporationsCorporationIdWalletsDivisionTransactions200Ok.transactionId) &&
        Objects.equals(this.typeId, getCorporationsCorporationIdWalletsDivisionTransactions200Ok.typeId) &&
        Objects.equals(this.unitPrice, getCorporationsCorporationIdWalletsDivisionTransactions200Ok.unitPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, date, isBuy, journalRefId, locationId, quantity, transactionId, typeId, unitPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdWalletsDivisionTransactions200Ok {\n");

    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    isBuy: ").append(toIndentedString(isBuy)).append("\n");
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

