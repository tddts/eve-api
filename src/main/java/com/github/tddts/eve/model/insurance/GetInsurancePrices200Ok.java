package com.github.tddts.eve.model.insurance;

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
public class GetInsurancePrices200Ok {
  @JsonProperty("levels")
  @Valid
  private List<GetInsurancePricesLevel> levels = new ArrayList<GetInsurancePricesLevel>();

  @JsonProperty("type_id")
  private Integer typeId = null;

  public GetInsurancePrices200Ok levels(List<GetInsurancePricesLevel> levels) {
    this.levels = levels;
    return this;
  }

  public GetInsurancePrices200Ok addLevelsItem(GetInsurancePricesLevel levelsItem) {
    this.levels.add(levelsItem);
    return this;
  }

  /**
   * A list of a available insurance levels for this ship type
   *
   * @return levels
   **/
  @ApiModelProperty(required = true, value = "A list of a available insurance levels for this ship type")
  @NotNull

  @Valid
  @Size(max = 6)
  public List<GetInsurancePricesLevel> getLevels() {
    return levels;
  }

  public void setLevels(List<GetInsurancePricesLevel> levels) {
    this.levels = levels;
  }

  public GetInsurancePrices200Ok typeId(Integer typeId) {
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
    GetInsurancePrices200Ok getInsurancePrices200Ok = (GetInsurancePrices200Ok) o;
    return Objects.equals(this.levels, getInsurancePrices200Ok.levels) &&
        Objects.equals(this.typeId, getInsurancePrices200Ok.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(levels, typeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInsurancePrices200Ok {\n");

    sb.append("    levels: ").append(toIndentedString(levels)).append("\n");
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

