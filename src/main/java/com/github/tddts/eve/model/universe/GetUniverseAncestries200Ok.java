package com.github.tddts.eve.model.universe;

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
public class GetUniverseAncestries200Ok {
  @JsonProperty("bloodline_id")
  private Integer bloodlineId = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("icon_id")
  private Integer iconId = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("short_description")
  private String shortDescription = null;

  public GetUniverseAncestries200Ok bloodlineId(Integer bloodlineId) {
    this.bloodlineId = bloodlineId;
    return this;
  }

  /**
   * The bloodline associated with this ancestry
   *
   * @return bloodlineId
   **/
  @ApiModelProperty(required = true, value = "The bloodline associated with this ancestry")
  @NotNull


  public Integer getBloodlineId() {
    return bloodlineId;
  }

  public void setBloodlineId(Integer bloodlineId) {
    this.bloodlineId = bloodlineId;
  }

  public GetUniverseAncestries200Ok description(String description) {
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

  public GetUniverseAncestries200Ok iconId(Integer iconId) {
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

  public GetUniverseAncestries200Ok id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * id integer
   *
   * @return id
   **/
  @ApiModelProperty(required = true, value = "id integer")
  @NotNull


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GetUniverseAncestries200Ok name(String name) {
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

  public GetUniverseAncestries200Ok shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

  /**
   * short_description string
   *
   * @return shortDescription
   **/
  @ApiModelProperty(value = "short_description string")


  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseAncestries200Ok getUniverseAncestries200Ok = (GetUniverseAncestries200Ok) o;
    return Objects.equals(this.bloodlineId, getUniverseAncestries200Ok.bloodlineId) &&
        Objects.equals(this.description, getUniverseAncestries200Ok.description) &&
        Objects.equals(this.iconId, getUniverseAncestries200Ok.iconId) &&
        Objects.equals(this.id, getUniverseAncestries200Ok.id) &&
        Objects.equals(this.name, getUniverseAncestries200Ok.name) &&
        Objects.equals(this.shortDescription, getUniverseAncestries200Ok.shortDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bloodlineId, description, iconId, id, name, shortDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseAncestries200Ok {\n");

    sb.append("    bloodlineId: ").append(toIndentedString(bloodlineId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    iconId: ").append(toIndentedString(iconId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
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
