package com.github.tddts.eve.model.contracts;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@Validated
public class GetContractsPublicRegionId200Ok {
  @JsonProperty("buyout")
  private Double buyout = null;

  @JsonProperty("collateral")
  private Double collateral = null;

  @JsonProperty("contract_id")
  private Integer contractId = null;

  @JsonProperty("date_expired")
  private OffsetDateTime dateExpired = null;

  @JsonProperty("date_issued")
  private OffsetDateTime dateIssued = null;

  @JsonProperty("days_to_complete")
  private Integer daysToComplete = null;

  @JsonProperty("end_location_id")
  private Long endLocationId = null;

  @JsonProperty("for_corporation")
  private Boolean forCorporation = null;

  @JsonProperty("issuer_corporation_id")
  private Integer issuerCorporationId = null;

  @JsonProperty("issuer_id")
  private Integer issuerId = null;

  @JsonProperty("price")
  private Double price = null;

  @JsonProperty("reward")
  private Double reward = null;

  @JsonProperty("start_location_id")
  private Long startLocationId = null;

  @JsonProperty("title")
  private String title = null;

  /**
   * Type of the contract
   */
  public enum TypeEnum {
    UNKNOWN("unknown"),

    ITEM_EXCHANGE("item_exchange"),

    AUCTION("auction"),

    COURIER("courier"),

    LOAN("loan");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("volume")
  private Double volume = null;

  public GetContractsPublicRegionId200Ok buyout(Double buyout) {
    this.buyout = buyout;
    return this;
  }

  /**
   * Buyout price (for Auctions only)
   *
   * @return buyout
   **/
  @ApiModelProperty(value = "Buyout price (for Auctions only)")


  public Double getBuyout() {
    return buyout;
  }

  public void setBuyout(Double buyout) {
    this.buyout = buyout;
  }

  public GetContractsPublicRegionId200Ok collateral(Double collateral) {
    this.collateral = collateral;
    return this;
  }

  /**
   * Collateral price (for Couriers only)
   *
   * @return collateral
   **/
  @ApiModelProperty(value = "Collateral price (for Couriers only)")


  public Double getCollateral() {
    return collateral;
  }

  public void setCollateral(Double collateral) {
    this.collateral = collateral;
  }

  public GetContractsPublicRegionId200Ok contractId(Integer contractId) {
    this.contractId = contractId;
    return this;
  }

  /**
   * contract_id integer
   *
   * @return contractId
   **/
  @ApiModelProperty(required = true, value = "contract_id integer")
  @NotNull


  public Integer getContractId() {
    return contractId;
  }

  public void setContractId(Integer contractId) {
    this.contractId = contractId;
  }

  public GetContractsPublicRegionId200Ok dateExpired(OffsetDateTime dateExpired) {
    this.dateExpired = dateExpired;
    return this;
  }

  /**
   * Expiration date of the contract
   *
   * @return dateExpired
   **/
  @ApiModelProperty(required = true, value = "Expiration date of the contract")
  @NotNull

  @Valid

  public OffsetDateTime getDateExpired() {
    return dateExpired;
  }

  public void setDateExpired(OffsetDateTime dateExpired) {
    this.dateExpired = dateExpired;
  }

  public GetContractsPublicRegionId200Ok dateIssued(OffsetDateTime dateIssued) {
    this.dateIssued = dateIssued;
    return this;
  }

  /**
   * Сreation date of the contract
   *
   * @return dateIssued
   **/
  @ApiModelProperty(required = true, value = "Сreation date of the contract")
  @NotNull

  @Valid

  public OffsetDateTime getDateIssued() {
    return dateIssued;
  }

  public void setDateIssued(OffsetDateTime dateIssued) {
    this.dateIssued = dateIssued;
  }

  public GetContractsPublicRegionId200Ok daysToComplete(Integer daysToComplete) {
    this.daysToComplete = daysToComplete;
    return this;
  }

  /**
   * Number of days to perform the contract
   *
   * @return daysToComplete
   **/
  @ApiModelProperty(value = "Number of days to perform the contract")


  public Integer getDaysToComplete() {
    return daysToComplete;
  }

  public void setDaysToComplete(Integer daysToComplete) {
    this.daysToComplete = daysToComplete;
  }

  public GetContractsPublicRegionId200Ok endLocationId(Long endLocationId) {
    this.endLocationId = endLocationId;
    return this;
  }

  /**
   * End location ID (for Couriers contract)
   *
   * @return endLocationId
   **/
  @ApiModelProperty(value = "End location ID (for Couriers contract)")


  public Long getEndLocationId() {
    return endLocationId;
  }

  public void setEndLocationId(Long endLocationId) {
    this.endLocationId = endLocationId;
  }

  public GetContractsPublicRegionId200Ok forCorporation(Boolean forCorporation) {
    this.forCorporation = forCorporation;
    return this;
  }

  /**
   * true if the contract was issued on behalf of the issuer's corporation
   *
   * @return forCorporation
   **/
  @ApiModelProperty(value = "true if the contract was issued on behalf of the issuer's corporation")


  public Boolean isForCorporation() {
    return forCorporation;
  }

  public void setForCorporation(Boolean forCorporation) {
    this.forCorporation = forCorporation;
  }

  public GetContractsPublicRegionId200Ok issuerCorporationId(Integer issuerCorporationId) {
    this.issuerCorporationId = issuerCorporationId;
    return this;
  }

  /**
   * Character's corporation ID for the issuer
   *
   * @return issuerCorporationId
   **/
  @ApiModelProperty(required = true, value = "Character's corporation ID for the issuer")
  @NotNull


  public Integer getIssuerCorporationId() {
    return issuerCorporationId;
  }

  public void setIssuerCorporationId(Integer issuerCorporationId) {
    this.issuerCorporationId = issuerCorporationId;
  }

  public GetContractsPublicRegionId200Ok issuerId(Integer issuerId) {
    this.issuerId = issuerId;
    return this;
  }

  /**
   * Character ID for the issuer
   *
   * @return issuerId
   **/
  @ApiModelProperty(required = true, value = "Character ID for the issuer")
  @NotNull


  public Integer getIssuerId() {
    return issuerId;
  }

  public void setIssuerId(Integer issuerId) {
    this.issuerId = issuerId;
  }

  public GetContractsPublicRegionId200Ok price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * Price of contract (for ItemsExchange and Auctions)
   *
   * @return price
   **/
  @ApiModelProperty(value = "Price of contract (for ItemsExchange and Auctions)")


  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public GetContractsPublicRegionId200Ok reward(Double reward) {
    this.reward = reward;
    return this;
  }

  /**
   * Remuneration for contract (for Couriers only)
   *
   * @return reward
   **/
  @ApiModelProperty(value = "Remuneration for contract (for Couriers only)")


  public Double getReward() {
    return reward;
  }

  public void setReward(Double reward) {
    this.reward = reward;
  }

  public GetContractsPublicRegionId200Ok startLocationId(Long startLocationId) {
    this.startLocationId = startLocationId;
    return this;
  }

  /**
   * Start location ID (for Couriers contract)
   *
   * @return startLocationId
   **/
  @ApiModelProperty(value = "Start location ID (for Couriers contract)")


  public Long getStartLocationId() {
    return startLocationId;
  }

  public void setStartLocationId(Long startLocationId) {
    this.startLocationId = startLocationId;
  }

  public GetContractsPublicRegionId200Ok title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the contract
   *
   * @return title
   **/
  @ApiModelProperty(value = "Title of the contract")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public GetContractsPublicRegionId200Ok type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the contract
   *
   * @return type
   **/
  @ApiModelProperty(required = true, value = "Type of the contract")
  @NotNull


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public GetContractsPublicRegionId200Ok volume(Double volume) {
    this.volume = volume;
    return this;
  }

  /**
   * Volume of items in the contract
   *
   * @return volume
   **/
  @ApiModelProperty(value = "Volume of items in the contract")


  public Double getVolume() {
    return volume;
  }

  public void setVolume(Double volume) {
    this.volume = volume;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetContractsPublicRegionId200Ok getContractsPublicRegionId200Ok = (GetContractsPublicRegionId200Ok) o;
    return Objects.equals(this.buyout, getContractsPublicRegionId200Ok.buyout) &&
        Objects.equals(this.collateral, getContractsPublicRegionId200Ok.collateral) &&
        Objects.equals(this.contractId, getContractsPublicRegionId200Ok.contractId) &&
        Objects.equals(this.dateExpired, getContractsPublicRegionId200Ok.dateExpired) &&
        Objects.equals(this.dateIssued, getContractsPublicRegionId200Ok.dateIssued) &&
        Objects.equals(this.daysToComplete, getContractsPublicRegionId200Ok.daysToComplete) &&
        Objects.equals(this.endLocationId, getContractsPublicRegionId200Ok.endLocationId) &&
        Objects.equals(this.forCorporation, getContractsPublicRegionId200Ok.forCorporation) &&
        Objects.equals(this.issuerCorporationId, getContractsPublicRegionId200Ok.issuerCorporationId) &&
        Objects.equals(this.issuerId, getContractsPublicRegionId200Ok.issuerId) &&
        Objects.equals(this.price, getContractsPublicRegionId200Ok.price) &&
        Objects.equals(this.reward, getContractsPublicRegionId200Ok.reward) &&
        Objects.equals(this.startLocationId, getContractsPublicRegionId200Ok.startLocationId) &&
        Objects.equals(this.title, getContractsPublicRegionId200Ok.title) &&
        Objects.equals(this.type, getContractsPublicRegionId200Ok.type) &&
        Objects.equals(this.volume, getContractsPublicRegionId200Ok.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyout, collateral, contractId, dateExpired, dateIssued, daysToComplete, endLocationId, forCorporation, issuerCorporationId, issuerId, price, reward, startLocationId, title, type, volume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetContractsPublicRegionId200Ok {\n");

    sb.append("    buyout: ").append(toIndentedString(buyout)).append("\n");
    sb.append("    collateral: ").append(toIndentedString(collateral)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    dateExpired: ").append(toIndentedString(dateExpired)).append("\n");
    sb.append("    dateIssued: ").append(toIndentedString(dateIssued)).append("\n");
    sb.append("    daysToComplete: ").append(toIndentedString(daysToComplete)).append("\n");
    sb.append("    endLocationId: ").append(toIndentedString(endLocationId)).append("\n");
    sb.append("    forCorporation: ").append(toIndentedString(forCorporation)).append("\n");
    sb.append("    issuerCorporationId: ").append(toIndentedString(issuerCorporationId)).append("\n");
    sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    reward: ").append(toIndentedString(reward)).append("\n");
    sb.append("    startLocationId: ").append(toIndentedString(startLocationId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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

