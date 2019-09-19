package com.github.tddts.eve.model.corporations;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@Validated
public class GetCorporationsCorporationIdWallets200Ok {
  @JsonProperty("balance")
  private Double balance = null;

  @JsonProperty("division")
  private Integer division = null;

  public GetCorporationsCorporationIdWallets200Ok balance(Double balance) {
    this.balance = balance;
    return this;
  }

  /**
   * balance number
   *
   * @return balance
   **/
  @ApiModelProperty(required = true, value = "balance number")
  @NotNull


  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public GetCorporationsCorporationIdWallets200Ok division(Integer division) {
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
  @ApiModelProperty(required = true, value = "division integer")
  @NotNull

  @Min(1)
  @Max(7)
  public Integer getDivision() {
    return division;
  }

  public void setDivision(Integer division) {
    this.division = division;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdWallets200Ok getCorporationsCorporationIdWallets200Ok = (GetCorporationsCorporationIdWallets200Ok) o;
    return Objects.equals(this.balance, getCorporationsCorporationIdWallets200Ok.balance) &&
        Objects.equals(this.division, getCorporationsCorporationIdWallets200Ok.division);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, division);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdWallets200Ok {\n");

    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
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

