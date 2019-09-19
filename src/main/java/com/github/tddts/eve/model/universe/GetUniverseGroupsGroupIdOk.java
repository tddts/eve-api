package com.github.tddts.eve.model.universe;

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
public class GetUniverseGroupsGroupIdOk {
  @JsonProperty("category_id")
  private Integer categoryId = null;

  @JsonProperty("group_id")
  private Integer groupId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("published")
  private Boolean published = null;

  @JsonProperty("types")
  @Valid
  private List<Integer> types = new ArrayList<Integer>();

  public GetUniverseGroupsGroupIdOk categoryId(Integer categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * category_id integer
   *
   * @return categoryId
   **/
  @ApiModelProperty(required = true, value = "category_id integer")
  @NotNull


  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public GetUniverseGroupsGroupIdOk groupId(Integer groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * group_id integer
   *
   * @return groupId
   **/
  @ApiModelProperty(required = true, value = "group_id integer")
  @NotNull


  public Integer getGroupId() {
    return groupId;
  }

  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }

  public GetUniverseGroupsGroupIdOk name(String name) {
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

  public GetUniverseGroupsGroupIdOk published(Boolean published) {
    this.published = published;
    return this;
  }

  /**
   * published boolean
   *
   * @return published
   **/
  @ApiModelProperty(required = true, value = "published boolean")
  @NotNull


  public Boolean isPublished() {
    return published;
  }

  public void setPublished(Boolean published) {
    this.published = published;
  }

  public GetUniverseGroupsGroupIdOk types(List<Integer> types) {
    this.types = types;
    return this;
  }

  public GetUniverseGroupsGroupIdOk addTypesItem(Integer typesItem) {
    this.types.add(typesItem);
    return this;
  }

  /**
   * types array
   *
   * @return types
   **/
  @ApiModelProperty(required = true, value = "types array")
  @NotNull

  @Size(max = 10000)
  public List<Integer> getTypes() {
    return types;
  }

  public void setTypes(List<Integer> types) {
    this.types = types;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseGroupsGroupIdOk getUniverseGroupsGroupIdOk = (GetUniverseGroupsGroupIdOk) o;
    return Objects.equals(this.categoryId, getUniverseGroupsGroupIdOk.categoryId) &&
        Objects.equals(this.groupId, getUniverseGroupsGroupIdOk.groupId) &&
        Objects.equals(this.name, getUniverseGroupsGroupIdOk.name) &&
        Objects.equals(this.published, getUniverseGroupsGroupIdOk.published) &&
        Objects.equals(this.types, getUniverseGroupsGroupIdOk.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, groupId, name, published, types);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseGroupsGroupIdOk {\n");

    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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

