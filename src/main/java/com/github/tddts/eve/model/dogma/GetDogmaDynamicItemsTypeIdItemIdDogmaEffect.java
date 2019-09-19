package com.github.tddts.eve.model.dogma;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * dogma_effect object
 */
@ApiModel(description = "dogma_effect object")
@Validated
public class GetDogmaDynamicItemsTypeIdItemIdDogmaEffect {
  @JsonProperty("effect_id")
  private Integer effectId = null;

  @JsonProperty("is_default")
  private Boolean isDefault = null;

  public GetDogmaDynamicItemsTypeIdItemIdDogmaEffect effectId(Integer effectId) {
    this.effectId = effectId;
    return this;
  }

  /**
   * effect_id integer
   *
   * @return effectId
   **/
  @ApiModelProperty(required = true, value = "effect_id integer")
  @NotNull


  public Integer getEffectId() {
    return effectId;
  }

  public void setEffectId(Integer effectId) {
    this.effectId = effectId;
  }

  public GetDogmaDynamicItemsTypeIdItemIdDogmaEffect isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * is_default boolean
   *
   * @return isDefault
   **/
  @ApiModelProperty(required = true, value = "is_default boolean")
  @NotNull


  public Boolean isIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDogmaDynamicItemsTypeIdItemIdDogmaEffect getDogmaDynamicItemsTypeIdItemIdDogmaEffect = (GetDogmaDynamicItemsTypeIdItemIdDogmaEffect) o;
    return Objects.equals(this.effectId, getDogmaDynamicItemsTypeIdItemIdDogmaEffect.effectId) &&
        Objects.equals(this.isDefault, getDogmaDynamicItemsTypeIdItemIdDogmaEffect.isDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectId, isDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDogmaDynamicItemsTypeIdItemIdDogmaEffect {\n");

    sb.append("    effectId: ").append(toIndentedString(effectId)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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

