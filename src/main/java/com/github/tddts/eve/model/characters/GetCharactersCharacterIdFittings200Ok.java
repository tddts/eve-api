package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@Validated
public class GetCharactersCharacterIdFittings200Ok {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("fitting_id")
  private Integer fittingId = null;

  @JsonProperty("items")
  @Valid
  private List<GetCharactersCharacterIdFittingsItem> items = new ArrayList<GetCharactersCharacterIdFittingsItem>();

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("ship_type_id")
  private Integer shipTypeId = null;

  public GetCharactersCharacterIdFittings200Ok description(String description) {
    this.description = description;
    return this;
  }

  /**
   * description string
   *
   * @return description
   **/
  @ApiModelProperty(required = true, value = "description string")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GetCharactersCharacterIdFittings200Ok fittingId(Integer fittingId) {
    this.fittingId = fittingId;
    return this;
  }

  /**
   * fitting_id integer
   *
   * @return fittingId
   **/
  @ApiModelProperty(required = true, value = "fitting_id integer")
  @NotNull


  public Integer getFittingId() {
    return fittingId;
  }

  public void setFittingId(Integer fittingId) {
    this.fittingId = fittingId;
  }

  public GetCharactersCharacterIdFittings200Ok items(List<GetCharactersCharacterIdFittingsItem> items) {
    this.items = items;
    return this;
  }

  public GetCharactersCharacterIdFittings200Ok addItemsItem(GetCharactersCharacterIdFittingsItem itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

  /**
   * items array
   *
   * @return items
   **/
  @ApiModelProperty(required = true, value = "items array")
  @NotNull

  @Valid
  @Size(max = 255)
  public List<GetCharactersCharacterIdFittingsItem> getItems() {
    return items;
  }

  public void setItems(List<GetCharactersCharacterIdFittingsItem> items) {
    this.items = items;
  }

  public GetCharactersCharacterIdFittings200Ok name(String name) {
    this.name = name;
    return this;
  }

  /**
   * name string
   *
   * @return name
   **/
  @ApiModelProperty(required = true, value = "name string")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetCharactersCharacterIdFittings200Ok shipTypeId(Integer shipTypeId) {
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
    GetCharactersCharacterIdFittings200Ok getCharactersCharacterIdFittings200Ok = (GetCharactersCharacterIdFittings200Ok) o;
    return Objects.equals(this.description, getCharactersCharacterIdFittings200Ok.description) &&
        Objects.equals(this.fittingId, getCharactersCharacterIdFittings200Ok.fittingId) &&
        Objects.equals(this.items, getCharactersCharacterIdFittings200Ok.items) &&
        Objects.equals(this.name, getCharactersCharacterIdFittings200Ok.name) &&
        Objects.equals(this.shipTypeId, getCharactersCharacterIdFittings200Ok.shipTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, fittingId, items, name, shipTypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdFittings200Ok {\n");

    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fittingId: ").append(toIndentedString(fittingId)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

