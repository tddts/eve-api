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
public class GetUniverseTypesTypeIdOk {
  @JsonProperty("capacity")
  private Float capacity = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("dogma_attributes")
  @Valid
  private List<GetUniverseTypesTypeIdDogmaAttribute> dogmaAttributes = null;

  @JsonProperty("dogma_effects")
  @Valid
  private List<GetUniverseTypesTypeIdDogmaEffect> dogmaEffects = null;

  @JsonProperty("graphic_id")
  private Integer graphicId = null;

  @JsonProperty("group_id")
  private Integer groupId = null;

  @JsonProperty("icon_id")
  private Integer iconId = null;

  @JsonProperty("market_group_id")
  private Integer marketGroupId = null;

  @JsonProperty("mass")
  private Float mass = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("packaged_volume")
  private Float packagedVolume = null;

  @JsonProperty("portion_size")
  private Integer portionSize = null;

  @JsonProperty("published")
  private Boolean published = null;

  @JsonProperty("radius")
  private Float radius = null;

  @JsonProperty("type_id")
  private Integer typeId = null;

  @JsonProperty("volume")
  private Float volume = null;

  public GetUniverseTypesTypeIdOk capacity(Float capacity) {
    this.capacity = capacity;
    return this;
  }

  /**
   * capacity number
   *
   * @return capacity
   **/
  @ApiModelProperty(value = "capacity number")


  public Float getCapacity() {
    return capacity;
  }

  public void setCapacity(Float capacity) {
    this.capacity = capacity;
  }

  public GetUniverseTypesTypeIdOk description(String description) {
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

  public GetUniverseTypesTypeIdOk dogmaAttributes(List<GetUniverseTypesTypeIdDogmaAttribute> dogmaAttributes) {
    this.dogmaAttributes = dogmaAttributes;
    return this;
  }

  public GetUniverseTypesTypeIdOk addDogmaAttributesItem(GetUniverseTypesTypeIdDogmaAttribute dogmaAttributesItem) {
    if (this.dogmaAttributes == null) {
      this.dogmaAttributes = new ArrayList<GetUniverseTypesTypeIdDogmaAttribute>();
    }
    this.dogmaAttributes.add(dogmaAttributesItem);
    return this;
  }

  /**
   * dogma_attributes array
   *
   * @return dogmaAttributes
   **/
  @ApiModelProperty(value = "dogma_attributes array")

  @Valid
  @Size(max = 1000)
  public List<GetUniverseTypesTypeIdDogmaAttribute> getDogmaAttributes() {
    return dogmaAttributes;
  }

  public void setDogmaAttributes(List<GetUniverseTypesTypeIdDogmaAttribute> dogmaAttributes) {
    this.dogmaAttributes = dogmaAttributes;
  }

  public GetUniverseTypesTypeIdOk dogmaEffects(List<GetUniverseTypesTypeIdDogmaEffect> dogmaEffects) {
    this.dogmaEffects = dogmaEffects;
    return this;
  }

  public GetUniverseTypesTypeIdOk addDogmaEffectsItem(GetUniverseTypesTypeIdDogmaEffect dogmaEffectsItem) {
    if (this.dogmaEffects == null) {
      this.dogmaEffects = new ArrayList<GetUniverseTypesTypeIdDogmaEffect>();
    }
    this.dogmaEffects.add(dogmaEffectsItem);
    return this;
  }

  /**
   * dogma_effects array
   *
   * @return dogmaEffects
   **/
  @ApiModelProperty(value = "dogma_effects array")

  @Valid
  @Size(max = 1000)
  public List<GetUniverseTypesTypeIdDogmaEffect> getDogmaEffects() {
    return dogmaEffects;
  }

  public void setDogmaEffects(List<GetUniverseTypesTypeIdDogmaEffect> dogmaEffects) {
    this.dogmaEffects = dogmaEffects;
  }

  public GetUniverseTypesTypeIdOk graphicId(Integer graphicId) {
    this.graphicId = graphicId;
    return this;
  }

  /**
   * graphic_id integer
   *
   * @return graphicId
   **/
  @ApiModelProperty(value = "graphic_id integer")


  public Integer getGraphicId() {
    return graphicId;
  }

  public void setGraphicId(Integer graphicId) {
    this.graphicId = graphicId;
  }

  public GetUniverseTypesTypeIdOk groupId(Integer groupId) {
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

  public GetUniverseTypesTypeIdOk iconId(Integer iconId) {
    this.iconId = iconId;
    return this;
  }

  /**
   * icon_id integer
   *
   * @return iconId
   **/
  @ApiModelProperty(value = "icon_id integer")


  public Integer getIconId() {
    return iconId;
  }

  public void setIconId(Integer iconId) {
    this.iconId = iconId;
  }

  public GetUniverseTypesTypeIdOk marketGroupId(Integer marketGroupId) {
    this.marketGroupId = marketGroupId;
    return this;
  }

  /**
   * This only exists for types that can be put on the market
   *
   * @return marketGroupId
   **/
  @ApiModelProperty(value = "This only exists for types that can be put on the market")


  public Integer getMarketGroupId() {
    return marketGroupId;
  }

  public void setMarketGroupId(Integer marketGroupId) {
    this.marketGroupId = marketGroupId;
  }

  public GetUniverseTypesTypeIdOk mass(Float mass) {
    this.mass = mass;
    return this;
  }

  /**
   * mass number
   *
   * @return mass
   **/
  @ApiModelProperty(value = "mass number")


  public Float getMass() {
    return mass;
  }

  public void setMass(Float mass) {
    this.mass = mass;
  }

  public GetUniverseTypesTypeIdOk name(String name) {
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

  public GetUniverseTypesTypeIdOk packagedVolume(Float packagedVolume) {
    this.packagedVolume = packagedVolume;
    return this;
  }

  /**
   * packaged_volume number
   *
   * @return packagedVolume
   **/
  @ApiModelProperty(value = "packaged_volume number")


  public Float getPackagedVolume() {
    return packagedVolume;
  }

  public void setPackagedVolume(Float packagedVolume) {
    this.packagedVolume = packagedVolume;
  }

  public GetUniverseTypesTypeIdOk portionSize(Integer portionSize) {
    this.portionSize = portionSize;
    return this;
  }

  /**
   * portion_size integer
   *
   * @return portionSize
   **/
  @ApiModelProperty(value = "portion_size integer")


  public Integer getPortionSize() {
    return portionSize;
  }

  public void setPortionSize(Integer portionSize) {
    this.portionSize = portionSize;
  }

  public GetUniverseTypesTypeIdOk published(Boolean published) {
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

  public GetUniverseTypesTypeIdOk radius(Float radius) {
    this.radius = radius;
    return this;
  }

  /**
   * radius number
   *
   * @return radius
   **/
  @ApiModelProperty(value = "radius number")


  public Float getRadius() {
    return radius;
  }

  public void setRadius(Float radius) {
    this.radius = radius;
  }

  public GetUniverseTypesTypeIdOk typeId(Integer typeId) {
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

  public GetUniverseTypesTypeIdOk volume(Float volume) {
    this.volume = volume;
    return this;
  }

  /**
   * volume number
   *
   * @return volume
   **/
  @ApiModelProperty(value = "volume number")


  public Float getVolume() {
    return volume;
  }

  public void setVolume(Float volume) {
    this.volume = volume;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseTypesTypeIdOk getUniverseTypesTypeIdOk = (GetUniverseTypesTypeIdOk) o;
    return Objects.equals(this.capacity, getUniverseTypesTypeIdOk.capacity) &&
        Objects.equals(this.description, getUniverseTypesTypeIdOk.description) &&
        Objects.equals(this.dogmaAttributes, getUniverseTypesTypeIdOk.dogmaAttributes) &&
        Objects.equals(this.dogmaEffects, getUniverseTypesTypeIdOk.dogmaEffects) &&
        Objects.equals(this.graphicId, getUniverseTypesTypeIdOk.graphicId) &&
        Objects.equals(this.groupId, getUniverseTypesTypeIdOk.groupId) &&
        Objects.equals(this.iconId, getUniverseTypesTypeIdOk.iconId) &&
        Objects.equals(this.marketGroupId, getUniverseTypesTypeIdOk.marketGroupId) &&
        Objects.equals(this.mass, getUniverseTypesTypeIdOk.mass) &&
        Objects.equals(this.name, getUniverseTypesTypeIdOk.name) &&
        Objects.equals(this.packagedVolume, getUniverseTypesTypeIdOk.packagedVolume) &&
        Objects.equals(this.portionSize, getUniverseTypesTypeIdOk.portionSize) &&
        Objects.equals(this.published, getUniverseTypesTypeIdOk.published) &&
        Objects.equals(this.radius, getUniverseTypesTypeIdOk.radius) &&
        Objects.equals(this.typeId, getUniverseTypesTypeIdOk.typeId) &&
        Objects.equals(this.volume, getUniverseTypesTypeIdOk.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacity, description, dogmaAttributes, dogmaEffects, graphicId, groupId, iconId, marketGroupId, mass, name, packagedVolume, portionSize, published, radius, typeId, volume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseTypesTypeIdOk {\n");

    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dogmaAttributes: ").append(toIndentedString(dogmaAttributes)).append("\n");
    sb.append("    dogmaEffects: ").append(toIndentedString(dogmaEffects)).append("\n");
    sb.append("    graphicId: ").append(toIndentedString(graphicId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    iconId: ").append(toIndentedString(iconId)).append("\n");
    sb.append("    marketGroupId: ").append(toIndentedString(marketGroupId)).append("\n");
    sb.append("    mass: ").append(toIndentedString(mass)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    packagedVolume: ").append(toIndentedString(packagedVolume)).append("\n");
    sb.append("    portionSize: ").append(toIndentedString(portionSize)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    radius: ").append(toIndentedString(radius)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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

