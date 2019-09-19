package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * inventory object
 */
@ApiModel(description = "inventory object")
@Validated
public class GetCharactersCharacterIdStatsInventory {
  @JsonProperty("abandon_loot_quantity")
  private Long abandonLootQuantity = null;

  @JsonProperty("trash_item_quantity")
  private Long trashItemQuantity = null;

  public GetCharactersCharacterIdStatsInventory abandonLootQuantity(Long abandonLootQuantity) {
    this.abandonLootQuantity = abandonLootQuantity;
    return this;
  }

  /**
   * abandon_loot_quantity integer
   *
   * @return abandonLootQuantity
   **/
  @ApiModelProperty(value = "abandon_loot_quantity integer")


  public Long getAbandonLootQuantity() {
    return abandonLootQuantity;
  }

  public void setAbandonLootQuantity(Long abandonLootQuantity) {
    this.abandonLootQuantity = abandonLootQuantity;
  }

  public GetCharactersCharacterIdStatsInventory trashItemQuantity(Long trashItemQuantity) {
    this.trashItemQuantity = trashItemQuantity;
    return this;
  }

  /**
   * trash_item_quantity integer
   *
   * @return trashItemQuantity
   **/
  @ApiModelProperty(value = "trash_item_quantity integer")


  public Long getTrashItemQuantity() {
    return trashItemQuantity;
  }

  public void setTrashItemQuantity(Long trashItemQuantity) {
    this.trashItemQuantity = trashItemQuantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdStatsInventory getCharactersCharacterIdStatsInventory = (GetCharactersCharacterIdStatsInventory) o;
    return Objects.equals(this.abandonLootQuantity, getCharactersCharacterIdStatsInventory.abandonLootQuantity) &&
        Objects.equals(this.trashItemQuantity, getCharactersCharacterIdStatsInventory.trashItemQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abandonLootQuantity, trashItemQuantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdStatsInventory {\n");

    sb.append("    abandonLootQuantity: ").append(toIndentedString(abandonLootQuantity)).append("\n");
    sb.append("    trashItemQuantity: ").append(toIndentedString(trashItemQuantity)).append("\n");
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

