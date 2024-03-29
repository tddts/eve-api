package com.github.tddts.eve.model.characters;

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
public class GetCharactersCharacterIdContracts200Ok {
  @JsonProperty("acceptor_id")
  private Integer acceptorId = null;

  @JsonProperty("assignee_id")
  private Integer assigneeId = null;

  /**
   * To whom the contract is available
   */
  public enum AvailabilityEnum {
    PUBLIC("public"),

    PERSONAL("personal"),

    CORPORATION("corporation"),

    ALLIANCE("alliance");

    private String value;

    AvailabilityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AvailabilityEnum fromValue(String text) {
      for (AvailabilityEnum b : AvailabilityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("availability")
  private AvailabilityEnum availability = null;

  @JsonProperty("buyout")
  private Double buyout = null;

  @JsonProperty("collateral")
  private Double collateral = null;

  @JsonProperty("contract_id")
  private Integer contractId = null;

  @JsonProperty("date_accepted")
  private OffsetDateTime dateAccepted = null;

  @JsonProperty("date_completed")
  private OffsetDateTime dateCompleted = null;

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

  /**
   * Status of the the contract
   */
  public enum StatusEnum {
    OUTSTANDING("outstanding"),

    IN_PROGRESS("in_progress"),

    FINISHED_ISSUER("finished_issuer"),

    FINISHED_CONTRACTOR("finished_contractor"),

    FINISHED("finished"),

    CANCELLED("cancelled"),

    REJECTED("rejected"),

    FAILED("failed"),

    DELETED("deleted"),

    REVERSED("reversed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

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

  public GetCharactersCharacterIdContracts200Ok acceptorId(Integer acceptorId) {
    this.acceptorId = acceptorId;
    return this;
  }

  /**
   * Who will accept the contract
   *
   * @return acceptorId
   **/
  @ApiModelProperty(required = true, value = "Who will accept the contract")
  @NotNull


  public Integer getAcceptorId() {
    return acceptorId;
  }

  public void setAcceptorId(Integer acceptorId) {
    this.acceptorId = acceptorId;
  }

  public GetCharactersCharacterIdContracts200Ok assigneeId(Integer assigneeId) {
    this.assigneeId = assigneeId;
    return this;
  }

  /**
   * ID to whom the contract is assigned, can be corporation or character ID
   *
   * @return assigneeId
   **/
  @ApiModelProperty(required = true, value = "ID to whom the contract is assigned, can be corporation or character ID")
  @NotNull


  public Integer getAssigneeId() {
    return assigneeId;
  }

  public void setAssigneeId(Integer assigneeId) {
    this.assigneeId = assigneeId;
  }

  public GetCharactersCharacterIdContracts200Ok availability(AvailabilityEnum availability) {
    this.availability = availability;
    return this;
  }

  /**
   * To whom the contract is available
   *
   * @return availability
   **/
  @ApiModelProperty(required = true, value = "To whom the contract is available")
  @NotNull


  public AvailabilityEnum getAvailability() {
    return availability;
  }

  public void setAvailability(AvailabilityEnum availability) {
    this.availability = availability;
  }

  public GetCharactersCharacterIdContracts200Ok buyout(Double buyout) {
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

  public GetCharactersCharacterIdContracts200Ok collateral(Double collateral) {
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

  public GetCharactersCharacterIdContracts200Ok contractId(Integer contractId) {
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

  public GetCharactersCharacterIdContracts200Ok dateAccepted(OffsetDateTime dateAccepted) {
    this.dateAccepted = dateAccepted;
    return this;
  }

  /**
   * Date of confirmation of contract
   *
   * @return dateAccepted
   **/
  @ApiModelProperty(value = "Date of confirmation of contract")

  @Valid

  public OffsetDateTime getDateAccepted() {
    return dateAccepted;
  }

  public void setDateAccepted(OffsetDateTime dateAccepted) {
    this.dateAccepted = dateAccepted;
  }

  public GetCharactersCharacterIdContracts200Ok dateCompleted(OffsetDateTime dateCompleted) {
    this.dateCompleted = dateCompleted;
    return this;
  }

  /**
   * Date of completed of contract
   *
   * @return dateCompleted
   **/
  @ApiModelProperty(value = "Date of completed of contract")

  @Valid

  public OffsetDateTime getDateCompleted() {
    return dateCompleted;
  }

  public void setDateCompleted(OffsetDateTime dateCompleted) {
    this.dateCompleted = dateCompleted;
  }

  public GetCharactersCharacterIdContracts200Ok dateExpired(OffsetDateTime dateExpired) {
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

  public GetCharactersCharacterIdContracts200Ok dateIssued(OffsetDateTime dateIssued) {
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

  public GetCharactersCharacterIdContracts200Ok daysToComplete(Integer daysToComplete) {
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

  public GetCharactersCharacterIdContracts200Ok endLocationId(Long endLocationId) {
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

  public GetCharactersCharacterIdContracts200Ok forCorporation(Boolean forCorporation) {
    this.forCorporation = forCorporation;
    return this;
  }

  /**
   * true if the contract was issued on behalf of the issuer's corporation
   *
   * @return forCorporation
   **/
  @ApiModelProperty(required = true, value = "true if the contract was issued on behalf of the issuer's corporation")
  @NotNull


  public Boolean isForCorporation() {
    return forCorporation;
  }

  public void setForCorporation(Boolean forCorporation) {
    this.forCorporation = forCorporation;
  }

  public GetCharactersCharacterIdContracts200Ok issuerCorporationId(Integer issuerCorporationId) {
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

  public GetCharactersCharacterIdContracts200Ok issuerId(Integer issuerId) {
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

  public GetCharactersCharacterIdContracts200Ok price(Double price) {
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

  public GetCharactersCharacterIdContracts200Ok reward(Double reward) {
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

  public GetCharactersCharacterIdContracts200Ok startLocationId(Long startLocationId) {
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

  public GetCharactersCharacterIdContracts200Ok status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the the contract
   *
   * @return status
   **/
  @ApiModelProperty(required = true, value = "Status of the the contract")
  @NotNull


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public GetCharactersCharacterIdContracts200Ok title(String title) {
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

  public GetCharactersCharacterIdContracts200Ok type(TypeEnum type) {
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

  public GetCharactersCharacterIdContracts200Ok volume(Double volume) {
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
    GetCharactersCharacterIdContracts200Ok getCharactersCharacterIdContracts200Ok = (GetCharactersCharacterIdContracts200Ok) o;
    return Objects.equals(this.acceptorId, getCharactersCharacterIdContracts200Ok.acceptorId) &&
        Objects.equals(this.assigneeId, getCharactersCharacterIdContracts200Ok.assigneeId) &&
        Objects.equals(this.availability, getCharactersCharacterIdContracts200Ok.availability) &&
        Objects.equals(this.buyout, getCharactersCharacterIdContracts200Ok.buyout) &&
        Objects.equals(this.collateral, getCharactersCharacterIdContracts200Ok.collateral) &&
        Objects.equals(this.contractId, getCharactersCharacterIdContracts200Ok.contractId) &&
        Objects.equals(this.dateAccepted, getCharactersCharacterIdContracts200Ok.dateAccepted) &&
        Objects.equals(this.dateCompleted, getCharactersCharacterIdContracts200Ok.dateCompleted) &&
        Objects.equals(this.dateExpired, getCharactersCharacterIdContracts200Ok.dateExpired) &&
        Objects.equals(this.dateIssued, getCharactersCharacterIdContracts200Ok.dateIssued) &&
        Objects.equals(this.daysToComplete, getCharactersCharacterIdContracts200Ok.daysToComplete) &&
        Objects.equals(this.endLocationId, getCharactersCharacterIdContracts200Ok.endLocationId) &&
        Objects.equals(this.forCorporation, getCharactersCharacterIdContracts200Ok.forCorporation) &&
        Objects.equals(this.issuerCorporationId, getCharactersCharacterIdContracts200Ok.issuerCorporationId) &&
        Objects.equals(this.issuerId, getCharactersCharacterIdContracts200Ok.issuerId) &&
        Objects.equals(this.price, getCharactersCharacterIdContracts200Ok.price) &&
        Objects.equals(this.reward, getCharactersCharacterIdContracts200Ok.reward) &&
        Objects.equals(this.startLocationId, getCharactersCharacterIdContracts200Ok.startLocationId) &&
        Objects.equals(this.status, getCharactersCharacterIdContracts200Ok.status) &&
        Objects.equals(this.title, getCharactersCharacterIdContracts200Ok.title) &&
        Objects.equals(this.type, getCharactersCharacterIdContracts200Ok.type) &&
        Objects.equals(this.volume, getCharactersCharacterIdContracts200Ok.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptorId, assigneeId, availability, buyout, collateral, contractId, dateAccepted, dateCompleted, dateExpired, dateIssued, daysToComplete, endLocationId, forCorporation, issuerCorporationId, issuerId, price, reward, startLocationId, status, title, type, volume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdContracts200Ok {\n");

    sb.append("    acceptorId: ").append(toIndentedString(acceptorId)).append("\n");
    sb.append("    assigneeId: ").append(toIndentedString(assigneeId)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    buyout: ").append(toIndentedString(buyout)).append("\n");
    sb.append("    collateral: ").append(toIndentedString(collateral)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    dateAccepted: ").append(toIndentedString(dateAccepted)).append("\n");
    sb.append("    dateCompleted: ").append(toIndentedString(dateCompleted)).append("\n");
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
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

