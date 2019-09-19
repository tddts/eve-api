package com.github.tddts.eve.model.dogma;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * modifier object
 */
@ApiModel(description = "modifier object")
@Validated
public class GetDogmaEffectsEffectIdModifier {
  @JsonProperty("domain")
  private String domain = null;

  @JsonProperty("effect_id")
  private Integer effectId = null;

  @JsonProperty("func")
  private String func = null;

  @JsonProperty("modified_attribute_id")
  private Integer modifiedAttributeId = null;

  @JsonProperty("modifying_attribute_id")
  private Integer modifyingAttributeId = null;

  @JsonProperty("operator")
  private Integer operator = null;

  public GetDogmaEffectsEffectIdModifier domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * domain string
   *
   * @return domain
   **/
  @ApiModelProperty(value = "domain string")


  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public GetDogmaEffectsEffectIdModifier effectId(Integer effectId) {
    this.effectId = effectId;
    return this;
  }

  /**
   * effect_id integer
   *
   * @return effectId
   **/
  @ApiModelProperty(value = "effect_id integer")


  public Integer getEffectId() {
    return effectId;
  }

  public void setEffectId(Integer effectId) {
    this.effectId = effectId;
  }

  public GetDogmaEffectsEffectIdModifier func(String func) {
    this.func = func;
    return this;
  }

  /**
   * func string
   *
   * @return func
   **/
  @ApiModelProperty(required = true, value = "func string")
  @NotNull


  public String getFunc() {
    return func;
  }

  public void setFunc(String func) {
    this.func = func;
  }

  public GetDogmaEffectsEffectIdModifier modifiedAttributeId(Integer modifiedAttributeId) {
    this.modifiedAttributeId = modifiedAttributeId;
    return this;
  }

  /**
   * modified_attribute_id integer
   *
   * @return modifiedAttributeId
   **/
  @ApiModelProperty(value = "modified_attribute_id integer")


  public Integer getModifiedAttributeId() {
    return modifiedAttributeId;
  }

  public void setModifiedAttributeId(Integer modifiedAttributeId) {
    this.modifiedAttributeId = modifiedAttributeId;
  }

  public GetDogmaEffectsEffectIdModifier modifyingAttributeId(Integer modifyingAttributeId) {
    this.modifyingAttributeId = modifyingAttributeId;
    return this;
  }

  /**
   * modifying_attribute_id integer
   *
   * @return modifyingAttributeId
   **/
  @ApiModelProperty(value = "modifying_attribute_id integer")


  public Integer getModifyingAttributeId() {
    return modifyingAttributeId;
  }

  public void setModifyingAttributeId(Integer modifyingAttributeId) {
    this.modifyingAttributeId = modifyingAttributeId;
  }

  public GetDogmaEffectsEffectIdModifier operator(Integer operator) {
    this.operator = operator;
    return this;
  }

  /**
   * operator integer
   *
   * @return operator
   **/
  @ApiModelProperty(value = "operator integer")


  public Integer getOperator() {
    return operator;
  }

  public void setOperator(Integer operator) {
    this.operator = operator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDogmaEffectsEffectIdModifier getDogmaEffectsEffectIdModifier = (GetDogmaEffectsEffectIdModifier) o;
    return Objects.equals(this.domain, getDogmaEffectsEffectIdModifier.domain) &&
        Objects.equals(this.effectId, getDogmaEffectsEffectIdModifier.effectId) &&
        Objects.equals(this.func, getDogmaEffectsEffectIdModifier.func) &&
        Objects.equals(this.modifiedAttributeId, getDogmaEffectsEffectIdModifier.modifiedAttributeId) &&
        Objects.equals(this.modifyingAttributeId, getDogmaEffectsEffectIdModifier.modifyingAttributeId) &&
        Objects.equals(this.operator, getDogmaEffectsEffectIdModifier.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, effectId, func, modifiedAttributeId, modifyingAttributeId, operator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDogmaEffectsEffectIdModifier {\n");

    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    effectId: ").append(toIndentedString(effectId)).append("\n");
    sb.append("    func: ").append(toIndentedString(func)).append("\n");
    sb.append("    modifiedAttributeId: ").append(toIndentedString(modifiedAttributeId)).append("\n");
    sb.append("    modifyingAttributeId: ").append(toIndentedString(modifyingAttributeId)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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

