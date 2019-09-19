package com.github.tddts.eve.model.corporations;

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
public class PostCorporationsCorporationIdAssetsLocations200Ok {
  @JsonProperty("item_id")
  private Long itemId = null;

  @JsonProperty("position")
  private PostCorporationsCorporationIdAssetsLocationsPosition position = null;

  public PostCorporationsCorporationIdAssetsLocations200Ok itemId(Long itemId) {
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

  public PostCorporationsCorporationIdAssetsLocations200Ok position(PostCorporationsCorporationIdAssetsLocationsPosition position) {
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

  public PostCorporationsCorporationIdAssetsLocationsPosition getPosition() {
    return position;
  }

  public void setPosition(PostCorporationsCorporationIdAssetsLocationsPosition position) {
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
    PostCorporationsCorporationIdAssetsLocations200Ok postCorporationsCorporationIdAssetsLocations200Ok = (PostCorporationsCorporationIdAssetsLocations200Ok) o;
    return Objects.equals(this.itemId, postCorporationsCorporationIdAssetsLocations200Ok.itemId) &&
        Objects.equals(this.position, postCorporationsCorporationIdAssetsLocations200Ok.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, position);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCorporationsCorporationIdAssetsLocations200Ok {\n");

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

