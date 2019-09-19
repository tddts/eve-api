package com.github.tddts.eve.model.characters;

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
 * extractor_details object
 */
@ApiModel(description = "extractor_details object")
@Validated
public class GetCharactersCharacterIdPlanetsPlanetIdExtractorDetails {
  @JsonProperty("cycle_time")
  private Integer cycleTime = null;

  @JsonProperty("head_radius")
  private Float headRadius = null;

  @JsonProperty("heads")
  @Valid
  private List<GetCharactersCharacterIdPlanetsPlanetIdHead> heads = new ArrayList<GetCharactersCharacterIdPlanetsPlanetIdHead>();

  @JsonProperty("product_type_id")
  private Integer productTypeId = null;

  @JsonProperty("qty_per_cycle")
  private Integer qtyPerCycle = null;

  public GetCharactersCharacterIdPlanetsPlanetIdExtractorDetails cycleTime(Integer cycleTime) {
    this.cycleTime = cycleTime;
    return this;
  }

  /**
   * in seconds
   *
   * @return cycleTime
   **/
  @ApiModelProperty(value = "in seconds")


  public Integer getCycleTime() {
    return cycleTime;
  }

  public void setCycleTime(Integer cycleTime) {
    this.cycleTime = cycleTime;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdExtractorDetails headRadius(Float headRadius) {
    this.headRadius = headRadius;
    return this;
  }

  /**
   * head_radius number
   *
   * @return headRadius
   **/
  @ApiModelProperty(value = "head_radius number")


  public Float getHeadRadius() {
    return headRadius;
  }

  public void setHeadRadius(Float headRadius) {
    this.headRadius = headRadius;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdExtractorDetails heads(List<GetCharactersCharacterIdPlanetsPlanetIdHead> heads) {
    this.heads = heads;
    return this;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdExtractorDetails addHeadsItem(GetCharactersCharacterIdPlanetsPlanetIdHead headsItem) {
    this.heads.add(headsItem);
    return this;
  }

  /**
   * heads array
   *
   * @return heads
   **/
  @ApiModelProperty(required = true, value = "heads array")
  @NotNull

  @Valid
  @Size(max = 10)
  public List<GetCharactersCharacterIdPlanetsPlanetIdHead> getHeads() {
    return heads;
  }

  public void setHeads(List<GetCharactersCharacterIdPlanetsPlanetIdHead> heads) {
    this.heads = heads;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdExtractorDetails productTypeId(Integer productTypeId) {
    this.productTypeId = productTypeId;
    return this;
  }

  /**
   * product_type_id integer
   *
   * @return productTypeId
   **/
  @ApiModelProperty(value = "product_type_id integer")


  public Integer getProductTypeId() {
    return productTypeId;
  }

  public void setProductTypeId(Integer productTypeId) {
    this.productTypeId = productTypeId;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdExtractorDetails qtyPerCycle(Integer qtyPerCycle) {
    this.qtyPerCycle = qtyPerCycle;
    return this;
  }

  /**
   * qty_per_cycle integer
   *
   * @return qtyPerCycle
   **/
  @ApiModelProperty(value = "qty_per_cycle integer")


  public Integer getQtyPerCycle() {
    return qtyPerCycle;
  }

  public void setQtyPerCycle(Integer qtyPerCycle) {
    this.qtyPerCycle = qtyPerCycle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdPlanetsPlanetIdExtractorDetails getCharactersCharacterIdPlanetsPlanetIdExtractorDetails = (GetCharactersCharacterIdPlanetsPlanetIdExtractorDetails) o;
    return Objects.equals(this.cycleTime, getCharactersCharacterIdPlanetsPlanetIdExtractorDetails.cycleTime) &&
        Objects.equals(this.headRadius, getCharactersCharacterIdPlanetsPlanetIdExtractorDetails.headRadius) &&
        Objects.equals(this.heads, getCharactersCharacterIdPlanetsPlanetIdExtractorDetails.heads) &&
        Objects.equals(this.productTypeId, getCharactersCharacterIdPlanetsPlanetIdExtractorDetails.productTypeId) &&
        Objects.equals(this.qtyPerCycle, getCharactersCharacterIdPlanetsPlanetIdExtractorDetails.qtyPerCycle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cycleTime, headRadius, heads, productTypeId, qtyPerCycle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdPlanetsPlanetIdExtractorDetails {\n");

    sb.append("    cycleTime: ").append(toIndentedString(cycleTime)).append("\n");
    sb.append("    headRadius: ").append(toIndentedString(headRadius)).append("\n");
    sb.append("    heads: ").append(toIndentedString(heads)).append("\n");
    sb.append("    productTypeId: ").append(toIndentedString(productTypeId)).append("\n");
    sb.append("    qtyPerCycle: ").append(toIndentedString(qtyPerCycle)).append("\n");
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

