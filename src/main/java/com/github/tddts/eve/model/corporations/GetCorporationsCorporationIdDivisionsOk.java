package com.github.tddts.eve.model.corporations;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@Validated
public class GetCorporationsCorporationIdDivisionsOk {
  @JsonProperty("hangar")
  @Valid
  private List<GetCorporationsCorporationIdDivisionsHangarHangar> hangar = null;

  @JsonProperty("wallet")
  @Valid
  private List<GetCorporationsCorporationIdDivisionsWalletWallet> wallet = null;

  public GetCorporationsCorporationIdDivisionsOk hangar(List<GetCorporationsCorporationIdDivisionsHangarHangar> hangar) {
    this.hangar = hangar;
    return this;
  }

  public GetCorporationsCorporationIdDivisionsOk addHangarItem(GetCorporationsCorporationIdDivisionsHangarHangar hangarItem) {
    if (this.hangar == null) {
      this.hangar = new ArrayList<GetCorporationsCorporationIdDivisionsHangarHangar>();
    }
    this.hangar.add(hangarItem);
    return this;
  }

  /**
   * hangar array
   *
   * @return hangar
   **/
  @ApiModelProperty(value = "hangar array")

  @Valid
  @Size(max = 7)
  public List<GetCorporationsCorporationIdDivisionsHangarHangar> getHangar() {
    return hangar;
  }

  public void setHangar(List<GetCorporationsCorporationIdDivisionsHangarHangar> hangar) {
    this.hangar = hangar;
  }

  public GetCorporationsCorporationIdDivisionsOk wallet(List<GetCorporationsCorporationIdDivisionsWalletWallet> wallet) {
    this.wallet = wallet;
    return this;
  }

  public GetCorporationsCorporationIdDivisionsOk addWalletItem(GetCorporationsCorporationIdDivisionsWalletWallet walletItem) {
    if (this.wallet == null) {
      this.wallet = new ArrayList<GetCorporationsCorporationIdDivisionsWalletWallet>();
    }
    this.wallet.add(walletItem);
    return this;
  }

  /**
   * wallet array
   *
   * @return wallet
   **/
  @ApiModelProperty(value = "wallet array")

  @Valid
  @Size(max = 7)
  public List<GetCorporationsCorporationIdDivisionsWalletWallet> getWallet() {
    return wallet;
  }

  public void setWallet(List<GetCorporationsCorporationIdDivisionsWalletWallet> wallet) {
    this.wallet = wallet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdDivisionsOk getCorporationsCorporationIdDivisionsOk = (GetCorporationsCorporationIdDivisionsOk) o;
    return Objects.equals(this.hangar, getCorporationsCorporationIdDivisionsOk.hangar) &&
        Objects.equals(this.wallet, getCorporationsCorporationIdDivisionsOk.wallet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hangar, wallet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdDivisionsOk {\n");

    sb.append("    hangar: ").append(toIndentedString(hangar)).append("\n");
    sb.append("    wallet: ").append(toIndentedString(wallet)).append("\n");
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

