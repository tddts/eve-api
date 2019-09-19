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
 * wallet object
 */
@ApiModel(description = "wallet object")
@Validated
public class GetCorporationsCorporationIdDivisionsWalletWallet {
  @JsonProperty("division")
  private Integer division = null;

  @JsonProperty("name")
  private String name = null;

  public GetCorporationsCorporationIdDivisionsWalletWallet division(Integer division) {
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

  public GetCorporationsCorporationIdDivisionsWalletWallet name(String name) {
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
    GetCorporationsCorporationIdDivisionsWalletWallet getCorporationsCorporationIdDivisionsWalletWallet = (GetCorporationsCorporationIdDivisionsWalletWallet) o;
    return Objects.equals(this.division, getCorporationsCorporationIdDivisionsWalletWallet.division) &&
        Objects.equals(this.name, getCorporationsCorporationIdDivisionsWalletWallet.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(division, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdDivisionsWalletWallet {\n");

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

