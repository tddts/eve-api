package com.github.tddts.eve.model.dogma;

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
public class GetDogmaDynamicItemsTypeIdItemIdOk {
  @JsonProperty("created_by")
  private Integer createdBy = null;

  @JsonProperty("dogma_attributes")
  @Valid
  private List<GetDogmaDynamicItemsTypeIdItemIdDogmaAttribute> dogmaAttributes = new ArrayList<GetDogmaDynamicItemsTypeIdItemIdDogmaAttribute>();

  @JsonProperty("dogma_effects")
  @Valid
  private List<GetDogmaDynamicItemsTypeIdItemIdDogmaEffect> dogmaEffects = new ArrayList<GetDogmaDynamicItemsTypeIdItemIdDogmaEffect>();

  @JsonProperty("mutator_type_id")
  private Integer mutatorTypeId = null;

  @JsonProperty("source_type_id")
  private Integer sourceTypeId = null;

  public GetDogmaDynamicItemsTypeIdItemIdOk createdBy(Integer createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The ID of the character who created the item
   *
   * @return createdBy
   **/
  @ApiModelProperty(required = true, value = "The ID of the character who created the item")
  @NotNull


  public Integer getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Integer createdBy) {
    this.createdBy = createdBy;
  }

  public GetDogmaDynamicItemsTypeIdItemIdOk dogmaAttributes(List<GetDogmaDynamicItemsTypeIdItemIdDogmaAttribute> dogmaAttributes) {
    this.dogmaAttributes = dogmaAttributes;
    return this;
  }

  public GetDogmaDynamicItemsTypeIdItemIdOk addDogmaAttributesItem(GetDogmaDynamicItemsTypeIdItemIdDogmaAttribute dogmaAttributesItem) {
    this.dogmaAttributes.add(dogmaAttributesItem);
    return this;
  }

  /**
   * dogma_attributes array
   *
   * @return dogmaAttributes
   **/
  @ApiModelProperty(required = true, value = "dogma_attributes array")
  @NotNull

  @Valid
  @Size(max = 1000)
  public List<GetDogmaDynamicItemsTypeIdItemIdDogmaAttribute> getDogmaAttributes() {
    return dogmaAttributes;
  }

  public void setDogmaAttributes(List<GetDogmaDynamicItemsTypeIdItemIdDogmaAttribute> dogmaAttributes) {
    this.dogmaAttributes = dogmaAttributes;
  }

  public GetDogmaDynamicItemsTypeIdItemIdOk dogmaEffects(List<GetDogmaDynamicItemsTypeIdItemIdDogmaEffect> dogmaEffects) {
    this.dogmaEffects = dogmaEffects;
    return this;
  }

  public GetDogmaDynamicItemsTypeIdItemIdOk addDogmaEffectsItem(GetDogmaDynamicItemsTypeIdItemIdDogmaEffect dogmaEffectsItem) {
    this.dogmaEffects.add(dogmaEffectsItem);
    return this;
  }

  /**
   * dogma_effects array
   *
   * @return dogmaEffects
   **/
  @ApiModelProperty(required = true, value = "dogma_effects array")
  @NotNull

  @Valid
  @Size(max = 1000)
  public List<GetDogmaDynamicItemsTypeIdItemIdDogmaEffect> getDogmaEffects() {
    return dogmaEffects;
  }

  public void setDogmaEffects(List<GetDogmaDynamicItemsTypeIdItemIdDogmaEffect> dogmaEffects) {
    this.dogmaEffects = dogmaEffects;
  }

  public GetDogmaDynamicItemsTypeIdItemIdOk mutatorTypeId(Integer mutatorTypeId) {
    this.mutatorTypeId = mutatorTypeId;
    return this;
  }

  /**
   * The type ID of the mutator used to generate the dynamic item.
   *
   * @return mutatorTypeId
   **/
  @ApiModelProperty(required = true, value = "The type ID of the mutator used to generate the dynamic item.")
  @NotNull


  public Integer getMutatorTypeId() {
    return mutatorTypeId;
  }

  public void setMutatorTypeId(Integer mutatorTypeId) {
    this.mutatorTypeId = mutatorTypeId;
  }

  public GetDogmaDynamicItemsTypeIdItemIdOk sourceTypeId(Integer sourceTypeId) {
    this.sourceTypeId = sourceTypeId;
    return this;
  }

  /**
   * The type ID of the source item the mutator was applied to create the dynamic item.
   *
   * @return sourceTypeId
   **/
  @ApiModelProperty(required = true, value = "The type ID of the source item the mutator was applied to create the dynamic item.")
  @NotNull


  public Integer getSourceTypeId() {
    return sourceTypeId;
  }

  public void setSourceTypeId(Integer sourceTypeId) {
    this.sourceTypeId = sourceTypeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDogmaDynamicItemsTypeIdItemIdOk getDogmaDynamicItemsTypeIdItemIdOk = (GetDogmaDynamicItemsTypeIdItemIdOk) o;
    return Objects.equals(this.createdBy, getDogmaDynamicItemsTypeIdItemIdOk.createdBy) &&
        Objects.equals(this.dogmaAttributes, getDogmaDynamicItemsTypeIdItemIdOk.dogmaAttributes) &&
        Objects.equals(this.dogmaEffects, getDogmaDynamicItemsTypeIdItemIdOk.dogmaEffects) &&
        Objects.equals(this.mutatorTypeId, getDogmaDynamicItemsTypeIdItemIdOk.mutatorTypeId) &&
        Objects.equals(this.sourceTypeId, getDogmaDynamicItemsTypeIdItemIdOk.sourceTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, dogmaAttributes, dogmaEffects, mutatorTypeId, sourceTypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDogmaDynamicItemsTypeIdItemIdOk {\n");

    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dogmaAttributes: ").append(toIndentedString(dogmaAttributes)).append("\n");
    sb.append("    dogmaEffects: ").append(toIndentedString(dogmaEffects)).append("\n");
    sb.append("    mutatorTypeId: ").append(toIndentedString(mutatorTypeId)).append("\n");
    sb.append("    sourceTypeId: ").append(toIndentedString(sourceTypeId)).append("\n");
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

