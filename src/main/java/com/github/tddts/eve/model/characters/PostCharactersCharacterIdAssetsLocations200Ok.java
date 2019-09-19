package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@Validated
public class PostCharactersCharacterIdAssetsLocations200Ok {
  @JsonProperty("item_id")
  private Long itemId = null;

  @JsonProperty("position")
  private PostCharactersCharacterIdAssetsLocationsPosition position = null;

  public PostCharactersCharacterIdAssetsLocations200Ok itemId(Long itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * item_id integer
   *
   * @return itemId
   **/
  @ApiModelProperty(required = true, value = "item_id integer")
  @NotNull


  public Long getItemId() {
    return itemId;
  }

  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }

  public PostCharactersCharacterIdAssetsLocations200Ok position(PostCharactersCharacterIdAssetsLocationsPosition position) {
    this.position = position;
    return this;
  }

  /**
   * Get position
   *
   * @return position
   **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PostCharactersCharacterIdAssetsLocationsPosition getPosition() {
    return position;
  }

  public void setPosition(PostCharactersCharacterIdAssetsLocationsPosition position) {
    this.position = position;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostCharactersCharacterIdAssetsLocations200Ok postCharactersCharacterIdAssetsLocations200Ok = (PostCharactersCharacterIdAssetsLocations200Ok) o;
    return Objects.equals(this.itemId, postCharactersCharacterIdAssetsLocations200Ok.itemId) &&
        Objects.equals(this.position, postCharactersCharacterIdAssetsLocations200Ok.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, position);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCharactersCharacterIdAssetsLocations200Ok {\n");

    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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

