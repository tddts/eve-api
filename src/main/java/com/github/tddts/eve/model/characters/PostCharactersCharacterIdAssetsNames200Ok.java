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
public class PostCharactersCharacterIdAssetsNames200Ok {
  @JsonProperty("item_id")
  private Long itemId = null;

  @JsonProperty("name")
  private String name = null;

  public PostCharactersCharacterIdAssetsNames200Ok itemId(Long itemId) {
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

  public PostCharactersCharacterIdAssetsNames200Ok name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostCharactersCharacterIdAssetsNames200Ok postCharactersCharacterIdAssetsNames200Ok = (PostCharactersCharacterIdAssetsNames200Ok) o;
    return Objects.equals(this.itemId, postCharactersCharacterIdAssetsNames200Ok.itemId) &&
        Objects.equals(this.name, postCharactersCharacterIdAssetsNames200Ok.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCharactersCharacterIdAssetsNames200Ok {\n");

    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

