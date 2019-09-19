package com.github.tddts.eve.model.universe;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * dogma_attribute object
 */
@ApiModel(description = "dogma_attribute object")
@Validated
public class GetUniverseTypesTypeIdDogmaAttribute {
  @JsonProperty("attribute_id")
  private Integer attributeId = null;

  @JsonProperty("value")
  private Float value = null;

  public GetUniverseTypesTypeIdDogmaAttribute attributeId(Integer attributeId) {
    this.attributeId = attributeId;
    return this;
  }

  /**
   * attribute_id integer
   *
   * @return attributeId
   **/
  @ApiModelProperty(required = true, value = "attribute_id integer")
  @NotNull


  public Integer getAttributeId() {
    return attributeId;
  }

  public void setAttributeId(Integer attributeId) {
    this.attributeId = attributeId;
  }

  public GetUniverseTypesTypeIdDogmaAttribute value(Float value) {
    this.value = value;
    return this;
  }

  /**
   * value number
   *
   * @return value
   **/
  @ApiModelProperty(required = true, value = "value number")
  @NotNull


  public Float getValue() {
    return value;
  }

  public void setValue(Float value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseTypesTypeIdDogmaAttribute getUniverseTypesTypeIdDogmaAttribute = (GetUniverseTypesTypeIdDogmaAttribute) o;
    return Objects.equals(this.attributeId, getUniverseTypesTypeIdDogmaAttribute.attributeId) &&
        Objects.equals(this.value, getUniverseTypesTypeIdDogmaAttribute.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeId, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseTypesTypeIdDogmaAttribute {\n");

    sb.append("    attributeId: ").append(toIndentedString(attributeId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

