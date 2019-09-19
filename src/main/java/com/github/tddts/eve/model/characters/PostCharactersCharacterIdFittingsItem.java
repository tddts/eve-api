package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * item object
 */
@ApiModel(description = "item object")
@Validated
public class PostCharactersCharacterIdFittingsItem {
  /**
   * Fitting location for the item. Entries placed in 'Invalid' will be discarded. If this leaves the fitting with nothing, it will cause an error.
   */
  public enum FlagEnum {
    CARGO("Cargo"),

    DRONEBAY("DroneBay"),

    FIGHTERBAY("FighterBay"),

    HISLOT0("HiSlot0"),

    HISLOT1("HiSlot1"),

    HISLOT2("HiSlot2"),

    HISLOT3("HiSlot3"),

    HISLOT4("HiSlot4"),

    HISLOT5("HiSlot5"),

    HISLOT6("HiSlot6"),

    HISLOT7("HiSlot7"),

    INVALID("Invalid"),

    LOSLOT0("LoSlot0"),

    LOSLOT1("LoSlot1"),

    LOSLOT2("LoSlot2"),

    LOSLOT3("LoSlot3"),

    LOSLOT4("LoSlot4"),

    LOSLOT5("LoSlot5"),

    LOSLOT6("LoSlot6"),

    LOSLOT7("LoSlot7"),

    MEDSLOT0("MedSlot0"),

    MEDSLOT1("MedSlot1"),

    MEDSLOT2("MedSlot2"),

    MEDSLOT3("MedSlot3"),

    MEDSLOT4("MedSlot4"),

    MEDSLOT5("MedSlot5"),

    MEDSLOT6("MedSlot6"),

    MEDSLOT7("MedSlot7"),

    RIGSLOT0("RigSlot0"),

    RIGSLOT1("RigSlot1"),

    RIGSLOT2("RigSlot2"),

    SERVICESLOT0("ServiceSlot0"),

    SERVICESLOT1("ServiceSlot1"),

    SERVICESLOT2("ServiceSlot2"),

    SERVICESLOT3("ServiceSlot3"),

    SERVICESLOT4("ServiceSlot4"),

    SERVICESLOT5("ServiceSlot5"),

    SERVICESLOT6("ServiceSlot6"),

    SERVICESLOT7("ServiceSlot7"),

    SUBSYSTEMSLOT0("SubSystemSlot0"),

    SUBSYSTEMSLOT1("SubSystemSlot1"),

    SUBSYSTEMSLOT2("SubSystemSlot2"),

    SUBSYSTEMSLOT3("SubSystemSlot3");

    private String value;

    FlagEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FlagEnum fromValue(String text) {
      for (FlagEnum b : FlagEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("flag")
  private FlagEnum flag = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("type_id")
  private Integer typeId = null;

  public PostCharactersCharacterIdFittingsItem flag(FlagEnum flag) {
    this.flag = flag;
    return this;
  }

  /**
   * Fitting location for the item. Entries placed in 'Invalid' will be discarded. If this leaves the fitting with nothing, it will cause an error.
   *
   * @return flag
   **/
  @ApiModelProperty(required = true, value = "Fitting location for the item. Entries placed in 'Invalid' will be discarded. If this leaves the fitting with nothing, it will cause an error.")
  @NotNull


  public FlagEnum getFlag() {
    return flag;
  }

  public void setFlag(FlagEnum flag) {
    this.flag = flag;
  }

  public PostCharactersCharacterIdFittingsItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * quantity integer
   *
   * @return quantity
   **/
  @ApiModelProperty(required = true, value = "quantity integer")
  @NotNull


  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public PostCharactersCharacterIdFittingsItem typeId(Integer typeId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostCharactersCharacterIdFittingsItem postCharactersCharacterIdFittingsItem = (PostCharactersCharacterIdFittingsItem) o;
    return Objects.equals(this.flag, postCharactersCharacterIdFittingsItem.flag) &&
        Objects.equals(this.quantity, postCharactersCharacterIdFittingsItem.quantity) &&
        Objects.equals(this.typeId, postCharactersCharacterIdFittingsItem.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flag, quantity, typeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCharactersCharacterIdFittingsItem {\n");

    sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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

