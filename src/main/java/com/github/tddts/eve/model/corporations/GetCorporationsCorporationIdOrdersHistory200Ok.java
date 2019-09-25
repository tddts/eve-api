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
public class GetCorporationsCorporationIdOrdersHistory200Ok {
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

  /**
   * Current order state
   */
  public enum StateEnum {
    CANCELLED("cancelled"),

    EXPIRED("expired");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("state")
  private StateEnum state = null;

  @JsonProperty("type_id")
  private Integer typeId = null;

  @JsonProperty("volume_remain")
  private Integer volumeRemain = null;

  @JsonProperty("volume_total")
  private Integer volumeTotal = null;

  @JsonProperty("wallet_division")
  private Integer walletDivision = null;

  public GetCorporationsCorporationIdOrdersHistory200Ok duration(Integer duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Number of days the order was valid for (starting from the issued date). An order expires at time issued + duration
   *
   * @return duration
   **/
  @ApiModelProperty(required = true, value = "Number of days the order was valid for (starting from the issued date). An order expires at time issued + duration")
  @NotNull


  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public GetCorporationsCorporationIdOrdersHistory200Ok escrow(Double escrow) {
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

  public GetCorporationsCorporationIdOrdersHistory200Ok isBuyOrder(Boolean isBuyOrder) {
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

  public GetCorporationsCorporationIdOrdersHistory200Ok issued(OffsetDateTime issued) {
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

  public GetCorporationsCorporationIdOrdersHistory200Ok issuedBy(Integer issuedBy) {
    this.issuedBy = issuedBy;
    return this;
  }

  /**
   * The character who issued this order
   *
   * @return issuedBy
   **/
  @ApiModelProperty(value = "The character who issued this order")


  public Integer getIssuedBy() {
    return issuedBy;
  }

  public void setIssuedBy(Integer issuedBy) {
    this.issuedBy = issuedBy;
  }

  public GetCorporationsCorporationIdOrdersHistory200Ok locationId(Long locationId) {
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

  public GetCorporationsCorporationIdOrdersHistory200Ok minVolume(Integer minVolume) {
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

  public GetCorporationsCorporationIdOrdersHistory200Ok orderId(Long orderId) {
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

  public GetCorporationsCorporationIdOrdersHistory200Ok price(Double price) {
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

  public GetCorporationsCorporationIdOrdersHistory200Ok range(RangeEnum range) {
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

  public GetCorporationsCorporationIdOrdersHistory200Ok regionId(Integer regionId) {
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

  public GetCorporationsCorporationIdOrdersHistory200Ok state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Current order state
   *
   * @return state
   **/
  @ApiModelProperty(required = true, value = "Current order state")
  @NotNull


  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public GetCorporationsCorporationIdOrdersHistory200Ok typeId(Integer typeId) {
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

  public GetCorporationsCorporationIdOrdersHistory200Ok volumeRemain(Integer volumeRemain) {
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

  public GetCorporationsCorporationIdOrdersHistory200Ok volumeTotal(Integer volumeTotal) {
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

  public GetCorporationsCorporationIdOrdersHistory200Ok walletDivision(Integer walletDivision) {
    this.walletDivision = walletDivision;
    return this;
  }

  /**
   * The corporation wallet division used for this order
   * minimum: 1
   * maximum: 7
   *
   * @return walletDivision
   **/
  @ApiModelProperty(required = true, value = "The corporation wallet division used for this order")
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
    GetCorporationsCorporationIdOrdersHistory200Ok getCorporationsCorporationIdOrdersHistory200Ok = (GetCorporationsCorporationIdOrdersHistory200Ok) o;
    return Objects.equals(this.duration, getCorporationsCorporationIdOrdersHistory200Ok.duration) &&
        Objects.equals(this.escrow, getCorporationsCorporationIdOrdersHistory200Ok.escrow) &&
        Objects.equals(this.isBuyOrder, getCorporationsCorporationIdOrdersHistory200Ok.isBuyOrder) &&
        Objects.equals(this.issued, getCorporationsCorporationIdOrdersHistory200Ok.issued) &&
        Objects.equals(this.issuedBy, getCorporationsCorporationIdOrdersHistory200Ok.issuedBy) &&
        Objects.equals(this.locationId, getCorporationsCorporationIdOrdersHistory200Ok.locationId) &&
        Objects.equals(this.minVolume, getCorporationsCorporationIdOrdersHistory200Ok.minVolume) &&
        Objects.equals(this.orderId, getCorporationsCorporationIdOrdersHistory200Ok.orderId) &&
        Objects.equals(this.price, getCorporationsCorporationIdOrdersHistory200Ok.price) &&
        Objects.equals(this.range, getCorporationsCorporationIdOrdersHistory200Ok.range) &&
        Objects.equals(this.regionId, getCorporationsCorporationIdOrdersHistory200Ok.regionId) &&
        Objects.equals(this.state, getCorporationsCorporationIdOrdersHistory200Ok.state) &&
        Objects.equals(this.typeId, getCorporationsCorporationIdOrdersHistory200Ok.typeId) &&
        Objects.equals(this.volumeRemain, getCorporationsCorporationIdOrdersHistory200Ok.volumeRemain) &&
        Objects.equals(this.volumeTotal, getCorporationsCorporationIdOrdersHistory200Ok.volumeTotal) &&
        Objects.equals(this.walletDivision, getCorporationsCorporationIdOrdersHistory200Ok.walletDivision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, escrow, isBuyOrder, issued, issuedBy, locationId, minVolume, orderId, price, range, regionId, state, typeId, volumeRemain, volumeTotal, walletDivision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdOrdersHistory200Ok {\n");

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
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

