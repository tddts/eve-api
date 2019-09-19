package com.github.tddts.eve.model.corporations;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * hangar object
 */
@ApiModel(description = "hangar object")
@Validated
public class GetCorporationsCorporationIdDivisionsHangarHangar {
  @JsonProperty("division")
  private Integer division = null;

  @JsonProperty("name")
  private String name = null;

  public GetCorporationsCorporationIdDivisionsHangarHangar division(Integer division) {
    this.division = division;
    return this;
  }

  /**
   * division integer
   * minimum: 1
   * maximum: 7
   *
   * @return division
   **/
  @ApiModelProperty(value = "division integer")

  @Min(1)
  @Max(7)
  public Integer getDivision() {
    return division;
  }

  public void setDivision(Integer division) {
    this.division = division;
  }

  public GetCorporationsCorporationIdDivisionsHangarHangar name(String name) {
    this.name = name;
    return this;
  }

  /**
   * name string
   *
   * @return name
   **/
  @ApiModelProperty(value = "name string")

  @Size(max = 50)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdDivisionsHangarHangar getCorporationsCorporationIdDivisionsHangarHangar = (GetCorporationsCorporationIdDivisionsHangarHangar) o;
    return Objects.equals(this.division, getCorporationsCorporationIdDivisionsHangarHangar.division) &&
        Objects.equals(this.name, getCorporationsCorporationIdDivisionsHangarHangar.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(division, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdDivisionsHangarHangar {\n");

    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

