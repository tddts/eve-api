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
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@Validated
public class GetCharactersCharacterIdContractsContractIdBids200Ok {
  @JsonProperty("amount")
  private Float amount = null;

  @JsonProperty("bid_id")
  private Integer bidId = null;

  @JsonProperty("bidder_id")
  private Integer bidderId = null;

  @JsonProperty("date_bid")
  private OffsetDateTime dateBid = null;

  public GetCharactersCharacterIdContractsContractIdBids200Ok amount(Float amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount bid, in ISK
   *
   * @return amount
   **/
  @ApiModelProperty(required = true, value = "The amount bid, in ISK")
  @NotNull


  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public GetCharactersCharacterIdContractsContractIdBids200Ok bidId(Integer bidId) {
    this.bidId = bidId;
    return this;
  }

  /**
   * Unique ID for the bid
   *
   * @return bidId
   **/
  @ApiModelProperty(required = true, value = "Unique ID for the bid")
  @NotNull


  public Integer getBidId() {
    return bidId;
  }

  public void setBidId(Integer bidId) {
    this.bidId = bidId;
  }

  public GetCharactersCharacterIdContractsContractIdBids200Ok bidderId(Integer bidderId) {
    this.bidderId = bidderId;
    return this;
  }

  /**
   * Character ID of the bidder
   *
   * @return bidderId
   **/
  @ApiModelProperty(required = true, value = "Character ID of the bidder")
  @NotNull


  public Integer getBidderId() {
    return bidderId;
  }

  public void setBidderId(Integer bidderId) {
    this.bidderId = bidderId;
  }

  public GetCharactersCharacterIdContractsContractIdBids200Ok dateBid(OffsetDateTime dateBid) {
    this.dateBid = dateBid;
    return this;
  }

  /**
   * Datetime when the bid was placed
   *
   * @return dateBid
   **/
  @ApiModelProperty(required = true, value = "Datetime when the bid was placed")
  @NotNull

  @Valid

  public OffsetDateTime getDateBid() {
    return dateBid;
  }

  public void setDateBid(OffsetDateTime dateBid) {
    this.dateBid = dateBid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdContractsContractIdBids200Ok getCharactersCharacterIdContractsContractIdBids200Ok = (GetCharactersCharacterIdContractsContractIdBids200Ok) o;
    return Objects.equals(this.amount, getCharactersCharacterIdContractsContractIdBids200Ok.amount) &&
        Objects.equals(this.bidId, getCharactersCharacterIdContractsContractIdBids200Ok.bidId) &&
        Objects.equals(this.bidderId, getCharactersCharacterIdContractsContractIdBids200Ok.bidderId) &&
        Objects.equals(this.dateBid, getCharactersCharacterIdContractsContractIdBids200Ok.dateBid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, bidId, bidderId, dateBid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdContractsContractIdBids200Ok {\n");

    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    bidId: ").append(toIndentedString(bidId)).append("\n");
    sb.append("    bidderId: ").append(toIndentedString(bidderId)).append("\n");
    sb.append("    dateBid: ").append(toIndentedString(dateBid)).append("\n");
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

