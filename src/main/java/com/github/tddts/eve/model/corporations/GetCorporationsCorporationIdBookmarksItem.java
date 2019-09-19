package com.github.tddts.eve.model.corporations;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Optional object that is returned if a bookmark was made on a particular item.
 */
@ApiModel(description = "Optional object that is returned if a bookmark was made on a particular item.")
@Validated
public class GetCorporationsCorporationIdBookmarksItem {
  @JsonProperty("item_id")
  private Long itemId = null;

  @JsonProperty("type_id")
  private Integer typeId = null;

  public GetCorporationsCorporationIdBookmarksItem itemId(Long itemId) {
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

  public GetCorporationsCorporationIdBookmarksItem typeId(Integer typeId) {
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
    GetCorporationsCorporationIdBookmarksItem getCorporationsCorporationIdBookmarksItem = (GetCorporationsCorporationIdBookmarksItem) o;
    return Objects.equals(this.itemId, getCorporationsCorporationIdBookmarksItem.itemId) &&
        Objects.equals(this.typeId, getCorporationsCorporationIdBookmarksItem.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, typeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdBookmarksItem {\n");

    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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

