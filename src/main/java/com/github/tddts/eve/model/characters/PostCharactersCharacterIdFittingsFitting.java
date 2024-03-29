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
 * fitting object
 */
@ApiModel(description = "fitting object")
@Validated
public class PostCharactersCharacterIdFittingsFitting {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("items")
  @Valid
  private List<PostCharactersCharacterIdFittingsItem> items = new ArrayList<PostCharactersCharacterIdFittingsItem>();

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("ship_type_id")
  private Integer shipTypeId = null;

  public PostCharactersCharacterIdFittingsFitting description(String description) {
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

  @Size(min = 0, max = 500)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PostCharactersCharacterIdFittingsFitting items(List<PostCharactersCharacterIdFittingsItem> items) {
    this.items = items;
    return this;
  }

  public PostCharactersCharacterIdFittingsFitting addItemsItem(PostCharactersCharacterIdFittingsItem itemsItem) {
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
  @Size(min = 1, max = 255)
  public List<PostCharactersCharacterIdFittingsItem> getItems() {
    return items;
  }

  public void setItems(List<PostCharactersCharacterIdFittingsItem> items) {
    this.items = items;
  }

  public PostCharactersCharacterIdFittingsFitting name(String name) {
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

  @Size(min = 1, max = 50)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PostCharactersCharacterIdFittingsFitting shipTypeId(Integer shipTypeId) {
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
    PostCharactersCharacterIdFittingsFitting postCharactersCharacterIdFittingsFitting = (PostCharactersCharacterIdFittingsFitting) o;
    return Objects.equals(this.description, postCharactersCharacterIdFittingsFitting.description) &&
        Objects.equals(this.items, postCharactersCharacterIdFittingsFitting.items) &&
        Objects.equals(this.name, postCharactersCharacterIdFittingsFitting.name) &&
        Objects.equals(this.shipTypeId, postCharactersCharacterIdFittingsFitting.shipTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, items, name, shipTypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCharactersCharacterIdFittingsFitting {\n");

    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

