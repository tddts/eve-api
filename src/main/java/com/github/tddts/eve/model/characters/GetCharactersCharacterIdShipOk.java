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
public class GetCharactersCharacterIdShipOk {
  @JsonProperty("ship_item_id")
  private Long shipItemId = null;

  @JsonProperty("ship_name")
  private String shipName = null;

  @JsonProperty("ship_type_id")
  private Integer shipTypeId = null;

  public GetCharactersCharacterIdShipOk shipItemId(Long shipItemId) {
    this.shipItemId = shipItemId;
    return this;
  }

  /**
   * Item id's are unique to a ship and persist until it is repackaged. This value can be used to track repeated uses of a ship, or detect when a pilot changes into a different instance of the same ship type.
   *
   * @return shipItemId
   **/
  @ApiModelProperty(required = true, value = "Item id's are unique to a ship and persist until it is repackaged. This value can be used to track repeated uses of a ship, or detect when a pilot changes into a different instance of the same ship type.")
  @NotNull


  public Long getShipItemId() {
    return shipItemId;
  }

  public void setShipItemId(Long shipItemId) {
    this.shipItemId = shipItemId;
  }

  public GetCharactersCharacterIdShipOk shipName(String shipName) {
    this.shipName = shipName;
    return this;
  }

  /**
   * ship_name string
   *
   * @return shipName
   **/
  @ApiModelProperty(required = true, value = "ship_name string")
  @NotNull


  public String getShipName() {
    return shipName;
  }

  public void setShipName(String shipName) {
    this.shipName = shipName;
  }

  public GetCharactersCharacterIdShipOk shipTypeId(Integer shipTypeId) {
    this.shipTypeId = shipTypeId;
    return this;
  }

  /**
   * ship_type_id integer
   *
   * @return shipTypeId
   **/
  @ApiModelProperty(required = true, value = "ship_type_id integer")
  @NotNull


  public Integer getShipTypeId() {
    return shipTypeId;
  }

  public void setShipTypeId(Integer shipTypeId) {
    this.shipTypeId = shipTypeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdShipOk getCharactersCharacterIdShipOk = (GetCharactersCharacterIdShipOk) o;
    return Objects.equals(this.shipItemId, getCharactersCharacterIdShipOk.shipItemId) &&
        Objects.equals(this.shipName, getCharactersCharacterIdShipOk.shipName) &&
        Objects.equals(this.shipTypeId, getCharactersCharacterIdShipOk.shipTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shipItemId, shipName, shipTypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdShipOk {\n");

    sb.append("    shipItemId: ").append(toIndentedString(shipItemId)).append("\n");
    sb.append("    shipName: ").append(toIndentedString(shipName)).append("\n");
    sb.append("    shipTypeId: ").append(toIndentedString(shipTypeId)).append("\n");
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

