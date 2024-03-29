package com.github.tddts.eve.model.market;

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
public class GetMarketsGroupsMarketGroupIdOk {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("market_group_id")
  private Integer marketGroupId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("parent_group_id")
  private Integer parentGroupId = null;

  @JsonProperty("types")
  @Valid
  private List<Integer> types = new ArrayList<Integer>();

  public GetMarketsGroupsMarketGroupIdOk description(String description) {
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

  public GetMarketsGroupsMarketGroupIdOk marketGroupId(Integer marketGroupId) {
    this.marketGroupId = marketGroupId;
    return this;
  }

  /**
   * market_group_id integer
   *
   * @return marketGroupId
   **/
  @ApiModelProperty(required = true, value = "market_group_id integer")
  @NotNull


  public Integer getMarketGroupId() {
    return marketGroupId;
  }

  public void setMarketGroupId(Integer marketGroupId) {
    this.marketGroupId = marketGroupId;
  }

  public GetMarketsGroupsMarketGroupIdOk name(String name) {
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

  public GetMarketsGroupsMarketGroupIdOk parentGroupId(Integer parentGroupId) {
    this.parentGroupId = parentGroupId;
    return this;
  }

  /**
   * parent_group_id integer
   *
   * @return parentGroupId
   **/
  @ApiModelProperty(value = "parent_group_id integer")


  public Integer getParentGroupId() {
    return parentGroupId;
  }

  public void setParentGroupId(Integer parentGroupId) {
    this.parentGroupId = parentGroupId;
  }

  public GetMarketsGroupsMarketGroupIdOk types(List<Integer> types) {
    this.types = types;
    return this;
  }

  public GetMarketsGroupsMarketGroupIdOk addTypesItem(Integer typesItem) {
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

  @Size(max = 5000)
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
    GetMarketsGroupsMarketGroupIdOk getMarketsGroupsMarketGroupIdOk = (GetMarketsGroupsMarketGroupIdOk) o;
    return Objects.equals(this.description, getMarketsGroupsMarketGroupIdOk.description) &&
        Objects.equals(this.marketGroupId, getMarketsGroupsMarketGroupIdOk.marketGroupId) &&
        Objects.equals(this.name, getMarketsGroupsMarketGroupIdOk.name) &&
        Objects.equals(this.parentGroupId, getMarketsGroupsMarketGroupIdOk.parentGroupId) &&
        Objects.equals(this.types, getMarketsGroupsMarketGroupIdOk.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, marketGroupId, name, parentGroupId, types);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMarketsGroupsMarketGroupIdOk {\n");

    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    marketGroupId: ").append(toIndentedString(marketGroupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentGroupId: ").append(toIndentedString(parentGroupId)).append("\n");
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

