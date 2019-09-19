package com.github.tddts.eve.model.market;

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
public class GetMarketsStructuresStructureId200Ok {
  @JsonProperty("duration")
  private Integer duration = null;

  @JsonProperty("is_buy_order")
  private Boolean isBuyOrder = null;

  @JsonProperty("issued")
  private OffsetDateTime issued = null;

  @JsonProperty("location_id")
  private Long locationId = null;

  @JsonProperty("min_volume")
  private Integer minVolume = null;

  @JsonProperty("order_id")
  private Long orderId = null;

  @JsonProperty("price")
  private Double price = null;

  /**
   * range string
   */
  public enum RangeEnum {
    STATION("station"),

    REGION("region"),

    SOLARSYSTEM("solarsystem"),

    _1("1"),

    _2("2"),

    _3("3"),

    _4("4"),

    _5("5"),

    _10("10"),

    _20("20"),

    _30("30"),

    _40("40");

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

  @JsonProperty("type_id")
  private Integer typeId = null;

  @JsonProperty("volume_remain")
  private Integer volumeRemain = null;

  @JsonProperty("volume_total")
  private Integer volumeTotal = null;

  public GetMarketsStructuresStructureId200Ok duration(Integer duration) {
    this.duration = duration;
    return this;
  }

  /**
   * duration integer
   *
   * @return duration
   **/
  @ApiModelProperty(required = true, value = "duration integer")
  @NotNull


  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public GetMarketsStructuresStructureId200Ok isBuyOrder(Boolean isBuyOrder) {
    this.isBuyOrder = isBuyOrder;
    return this;
  }

  /**
   * is_buy_order boolean
   *
   * @return isBuyOrder
   **/
  @ApiModelProperty(required = true, value = "is_buy_order boolean")
  @NotNull


  public Boolean isIsBuyOrder() {
    return isBuyOrder;
  }

  public void setIsBuyOrder(Boolean isBuyOrder) {
    this.isBuyOrder = isBuyOrder;
  }

  public GetMarketsStructuresStructureId200Ok issued(OffsetDateTime issued) {
    this.issued = issued;
    return this;
  }

  /**
   * issued string
   *
   * @return issued
   **/
  @ApiModelProperty(required = true, value = "issued string")
  @NotNull

  @Valid

  public OffsetDateTime getIssued() {
    return issued;
  }

  public void setIssued(OffsetDateTime issued) {
    this.issued = issued;
  }

  public GetMarketsStructuresStructureId200Ok locationId(Long locationId) {
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

  public GetMarketsStructuresStructureId200Ok minVolume(Integer minVolume) {
    this.minVolume = minVolume;
    return this;
  }

  /**
   * min_volume integer
   *
   * @return minVolume
   **/
  @ApiModelProperty(required = true, value = "min_volume integer")
  @NotNull


  public Integer getMinVolume() {
    return minVolume;
  }

  public void setMinVolume(Integer minVolume) {
    this.minVolume = minVolume;
  }

  public GetMarketsStructuresStructureId200Ok orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * order_id integer
   *
   * @return orderId
   **/
  @ApiModelProperty(required = true, value = "order_id integer")
  @NotNull


  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public GetMarketsStructuresStructureId200Ok price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * price number
   *
   * @return price
   **/
  @ApiModelProperty(required = true, value = "price number")
  @NotNull


  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public GetMarketsStructuresStructureId200Ok range(RangeEnum range) {
    this.range = range;
    return this;
  }

  /**
   * range string
   *
   * @return range
   **/
  @ApiModelProperty(required = true, value = "range string")
  @NotNull


  public RangeEnum getRange() {
    return range;
  }

  public void setRange(RangeEnum range) {
    this.range = range;
  }

  public GetMarketsStructuresStructureId200Ok typeId(Integer typeId) {
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

  public GetMarketsStructuresStructureId200Ok volumeRemain(Integer volumeRemain) {
    this.volumeRemain = volumeRemain;
    return this;
  }

  /**
   * volume_remain integer
   *
   * @return volumeRemain
   **/
  @ApiModelProperty(required = true, value = "volume_remain integer")
  @NotNull


  public Integer getVolumeRemain() {
    return volumeRemain;
  }

  public void setVolumeRemain(Integer volumeRemain) {
    this.volumeRemain = volumeRemain;
  }

  public GetMarketsStructuresStructureId200Ok volumeTotal(Integer volumeTotal) {
    this.volumeTotal = volumeTotal;
    return this;
  }

  /**
   * volume_total integer
   *
   * @return volumeTotal
   **/
  @ApiModelProperty(required = true, value = "volume_total integer")
  @NotNull


  public Integer getVolumeTotal() {
    return volumeTotal;
  }

  public void setVolumeTotal(Integer volumeTotal) {
    this.volumeTotal = volumeTotal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMarketsStructuresStructureId200Ok getMarketsStructuresStructureId200Ok = (GetMarketsStructuresStructureId200Ok) o;
    return Objects.equals(this.duration, getMarketsStructuresStructureId200Ok.duration) &&
        Objects.equals(this.isBuyOrder, getMarketsStructuresStructureId200Ok.isBuyOrder) &&
        Objects.equals(this.issued, getMarketsStructuresStructureId200Ok.issued) &&
        Objects.equals(this.locationId, getMarketsStructuresStructureId200Ok.locationId) &&
        Objects.equals(this.minVolume, getMarketsStructuresStructureId200Ok.minVolume) &&
        Objects.equals(this.orderId, getMarketsStructuresStructureId200Ok.orderId) &&
        Objects.equals(this.price, getMarketsStructuresStructureId200Ok.price) &&
        Objects.equals(this.range, getMarketsStructuresStructureId200Ok.range) &&
        Objects.equals(this.typeId, getMarketsStructuresStructureId200Ok.typeId) &&
        Objects.equals(this.volumeRemain, getMarketsStructuresStructureId200Ok.volumeRemain) &&
        Objects.equals(this.volumeTotal, getMarketsStructuresStructureId200Ok.volumeTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, isBuyOrder, issued, locationId, minVolume, orderId, price, range, typeId, volumeRemain, volumeTotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMarketsStructuresStructureId200Ok {\n");

    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    isBuyOrder: ").append(toIndentedString(isBuyOrder)).append("\n");
    sb.append("    issued: ").append(toIndentedString(issued)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    minVolume: ").append(toIndentedString(minVolume)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    volumeRemain: ").append(toIndentedString(volumeRemain)).append("\n");
    sb.append("    volumeTotal: ").append(toIndentedString(volumeTotal)).append("\n");
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

