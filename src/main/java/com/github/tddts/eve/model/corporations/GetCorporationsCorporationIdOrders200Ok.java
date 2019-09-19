package com.github.tddts.eve.model.corporations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@Validated
public class GetCorporationsCorporationIdOrders200Ok {
  @JsonProperty("duration")
  private Integer duration = null;

  @JsonProperty("escrow")
  private Double escrow = null;

  @JsonProperty("is_buy_order")
  private Boolean isBuyOrder = null;

  @JsonProperty("issued")
  private OffsetDateTime issued = null;

  @JsonProperty("issued_by")
  private Integer issuedBy = null;

  @JsonProperty("location_id")
  private Long locationId = null;

  @JsonProperty("min_volume")
  private Integer minVolume = null;

  @JsonProperty("order_id")
  private Long orderId = null;

  @JsonProperty("price")
  private Double price = null;

  /**
   * Valid order range, numbers are ranges in jumps
   */
  public enum RangeEnum {
    _1("1"),

    _10("10"),

    _2("2"),

    _20("20"),

    _3("3"),

    _30("30"),

    _4("4"),

    _40("40"),

    _5("5"),

    REGION("region"),

    SOLARSYSTEM("solarsystem"),

    STATION("station");

    private String value;

    RangeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RangeEnum fromValue(String text) {
      for (RangeEnum b : RangeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("range")
  private RangeEnum range = null;

  @JsonProperty("region_id")
  private Integer regionId = null;

  @JsonProperty("type_id")
  private Integer typeId = null;

  @JsonProperty("volume_remain")
  private Integer volumeRemain = null;

  @JsonProperty("volume_total")
  private Integer volumeTotal = null;

  @JsonProperty("wallet_division")
  private Integer walletDivision = null;

  public GetCorporationsCorporationIdOrders200Ok duration(Integer duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Number of days for which order is valid (starting from the issued date). An order expires at time issued + duration
   *
   * @return duration
   **/
  @ApiModelProperty(required = true, value = "Number of days for which order is valid (starting from the issued date). An order expires at time issued + duration")
  @NotNull


  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public GetCorporationsCorporationIdOrders200Ok escrow(Double escrow) {
    this.escrow = escrow;
    return this;
  }

  /**
   * For buy orders, the amount of ISK in escrow
   *
   * @return escrow
   **/
  @ApiModelProperty(value = "For buy orders, the amount of ISK in escrow")


  public Double getEscrow() {
    return escrow;
  }

  public void setEscrow(Double escrow) {
    this.escrow = escrow;
  }

  public GetCorporationsCorporationIdOrders200Ok isBuyOrder(Boolean isBuyOrder) {
    this.isBuyOrder = isBuyOrder;
    return this;
  }

  /**
   * True if the order is a bid (buy) order
   *
   * @return isBuyOrder
   **/
  @ApiModelProperty(value = "True if the order is a bid (buy) order")


  public Boolean isIsBuyOrder() {
    return isBuyOrder;
  }

  public void setIsBuyOrder(Boolean isBuyOrder) {
    this.isBuyOrder = isBuyOrder;
  }

  public GetCorporationsCorporationIdOrders200Ok issued(OffsetDateTime issued) {
    this.issued = issued;
    return this;
  }

  /**
   * Date and time when this order was issued
   *
   * @return issued
   **/
  @ApiModelProperty(required = true, value = "Date and time when this order was issued")
  @NotNull

  @Valid

  public OffsetDateTime getIssued() {
    return issued;
  }

  public void setIssued(OffsetDateTime issued) {
    this.issued = issued;
  }

  public GetCorporationsCorporationIdOrders200Ok issuedBy(Integer issuedBy) {
    this.issuedBy = issuedBy;
    return this;
  }

  /**
   * The character who issued this order
   *
   * @return issuedBy
   **/
  @ApiModelProperty(required = true, value = "The character who issued this order")
  @NotNull


  public Integer getIssuedBy() {
    return issuedBy;
  }

  public void setIssuedBy(Integer issuedBy) {
    this.issuedBy = issuedBy;
  }

  public GetCorporationsCorporationIdOrders200Ok locationId(Long locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * ID of the location where order was placed
   *
   * @return locationId
   **/
  @ApiModelProperty(required = true, value = "ID of the location where order was placed")
  @NotNull


  public Long getLocationId() {
    return locationId;
  }

  public void setLocationId(Long locationId) {
    this.locationId = locationId;
  }

  public GetCorporationsCorporationIdOrders200Ok minVolume(Integer minVolume) {
    this.minVolume = minVolume;
    return this;
  }

  /**
   * For buy orders, the minimum quantity that will be accepted in a matching sell order
   *
   * @return minVolume
   **/
  @ApiModelProperty(value = "For buy orders, the minimum quantity that will be accepted in a matching sell order")


  public Integer getMinVolume() {
    return minVolume;
  }

  public void setMinVolume(Integer minVolume) {
    this.minVolume = minVolume;
  }

  public GetCorporationsCorporationIdOrders200Ok orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Unique order ID
   *
   * @return orderId
   **/
  @ApiModelProperty(required = true, value = "Unique order ID")
  @NotNull


  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public GetCorporationsCorporationIdOrders200Ok price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * Cost per unit for this order
   *
   * @return price
   **/
  @ApiModelProperty(required = true, value = "Cost per unit for this order")
  @NotNull


  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public GetCorporationsCorporationIdOrders200Ok range(RangeEnum range) {
    this.range = range;
    return this;
  }

  /**
   * Valid order range, numbers are ranges in jumps
   *
   * @return range
   **/
  @ApiModelProperty(required = true, value = "Valid order range, numbers are ranges in jumps")
  @NotNull


  public RangeEnum getRange() {
    return range;
  }

  public void setRange(RangeEnum range) {
    this.range = range;
  }

  public GetCorporationsCorporationIdOrders200Ok regionId(Integer regionId) {
    this.regionId = regionId;
    return this;
  }

  /**
   * ID of the region where order was placed
   *
   * @return regionId
   **/
  @ApiModelProperty(required = true, value = "ID of the region where order was placed")
  @NotNull


  public Integer getRegionId() {
    return regionId;
  }

  public void setRegionId(Integer regionId) {
    this.regionId = regionId;
  }

  public GetCorporationsCorporationIdOrders200Ok typeId(Integer typeId) {
    this.typeId = typeId;
    return this;
  }

  /**
   * The type ID of the item transacted in this order
   *
   * @return typeId
   **/
  @ApiModelProperty(required = true, value = "The type ID of the item transacted in this order")
  @NotNull


  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }

  public GetCorporationsCorporationIdOrders200Ok volumeRemain(Integer volumeRemain) {
    this.volumeRemain = volumeRemain;
    return this;
  }

  /**
   * Quantity of items still required or offered
   *
   * @return volumeRemain
   **/
  @ApiModelProperty(required = true, value = "Quantity of items still required or offered")
  @NotNull


  public Integer getVolumeRemain() {
    return volumeRemain;
  }

  public void setVolumeRemain(Integer volumeRemain) {
    this.volumeRemain = volumeRemain;
  }

  public GetCorporationsCorporationIdOrders200Ok volumeTotal(Integer volumeTotal) {
    this.volumeTotal = volumeTotal;
    return this;
  }

  /**
   * Quantity of items required or offered at time order was placed
   *
   * @return volumeTotal
   **/
  @ApiModelProperty(required = true, value = "Quantity of items required or offered at time order was placed")
  @NotNull


  public Integer getVolumeTotal() {
    return volumeTotal;
  }

  public void setVolumeTotal(Integer volumeTotal) {
    this.volumeTotal = volumeTotal;
  }

  public GetCorporationsCorporationIdOrders200Ok walletDivision(Integer walletDivision) {
    this.walletDivision = walletDivision;
    return this;
  }

  /**
   * The corporation wallet division used for this order.
   * minimum: 1
   * maximum: 7
   *
   * @return walletDivision
   **/
  @ApiModelProperty(required = true, value = "The corporation wallet division used for this order.")
  @NotNull

  @Min(1)
  @Max(7)
  public Integer getWalletDivision() {
    return walletDivision;
  }

  public void setWalletDivision(Integer walletDivision) {
    this.walletDivision = walletDivision;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdOrders200Ok getCorporationsCorporationIdOrders200Ok = (GetCorporationsCorporationIdOrders200Ok) o;
    return Objects.equals(this.duration, getCorporationsCorporationIdOrders200Ok.duration) &&
        Objects.equals(this.escrow, getCorporationsCorporationIdOrders200Ok.escrow) &&
        Objects.equals(this.isBuyOrder, getCorporationsCorporationIdOrders200Ok.isBuyOrder) &&
        Objects.equals(this.issued, getCorporationsCorporationIdOrders200Ok.issued) &&
        Objects.equals(this.issuedBy, getCorporationsCorporationIdOrders200Ok.issuedBy) &&
        Objects.equals(this.locationId, getCorporationsCorporationIdOrders200Ok.locationId) &&
        Objects.equals(this.minVolume, getCorporationsCorporationIdOrders200Ok.minVolume) &&
        Objects.equals(this.orderId, getCorporationsCorporationIdOrders200Ok.orderId) &&
        Objects.equals(this.price, getCorporationsCorporationIdOrders200Ok.price) &&
        Objects.equals(this.range, getCorporationsCorporationIdOrders200Ok.range) &&
        Objects.equals(this.regionId, getCorporationsCorporationIdOrders200Ok.regionId) &&
        Objects.equals(this.typeId, getCorporationsCorporationIdOrders200Ok.typeId) &&
        Objects.equals(this.volumeRemain, getCorporationsCorporationIdOrders200Ok.volumeRemain) &&
        Objects.equals(this.volumeTotal, getCorporationsCorporationIdOrders200Ok.volumeTotal) &&
        Objects.equals(this.walletDivision, getCorporationsCorporationIdOrders200Ok.walletDivision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, escrow, isBuyOrder, issued, issuedBy, locationId, minVolume, orderId, price, range, regionId, typeId, volumeRemain, volumeTotal, walletDivision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdOrders200Ok {\n");

    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    escrow: ").append(toIndentedString(escrow)).append("\n");
    sb.append("    isBuyOrder: ").append(toIndentedString(isBuyOrder)).append("\n");
    sb.append("    issued: ").append(toIndentedString(issued)).append("\n");
    sb.append("    issuedBy: ").append(toIndentedString(issuedBy)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    minVolume: ").append(toIndentedString(minVolume)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    volumeRemain: ").append(toIndentedString(volumeRemain)).append("\n");
    sb.append("    volumeTotal: ").append(toIndentedString(volumeTotal)).append("\n");
    sb.append("    walletDivision: ").append(toIndentedString(walletDivision)).append("\n");
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

