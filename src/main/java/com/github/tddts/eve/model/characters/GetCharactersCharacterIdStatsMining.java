package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * mining object
 */
@ApiModel(description = "mining object")
@Validated
public class GetCharactersCharacterIdStatsMining {
  @JsonProperty("drone_mine")
  private Long droneMine = null;

  @JsonProperty("ore_arkonor")
  private Long oreArkonor = null;

  @JsonProperty("ore_bistot")
  private Long oreBistot = null;

  @JsonProperty("ore_crokite")
  private Long oreCrokite = null;

  @JsonProperty("ore_dark_ochre")
  private Long oreDarkOchre = null;

  @JsonProperty("ore_gneiss")
  private Long oreGneiss = null;

  @JsonProperty("ore_harvestable_cloud")
  private Long oreHarvestableCloud = null;

  @JsonProperty("ore_hedbergite")
  private Long oreHedbergite = null;

  @JsonProperty("ore_hemorphite")
  private Long oreHemorphite = null;

  @JsonProperty("ore_ice")
  private Long oreIce = null;

  @JsonProperty("ore_jaspet")
  private Long oreJaspet = null;

  @JsonProperty("ore_kernite")
  private Long oreKernite = null;

  @JsonProperty("ore_mercoxit")
  private Long oreMercoxit = null;

  @JsonProperty("ore_omber")
  private Long oreOmber = null;

  @JsonProperty("ore_plagioclase")
  private Long orePlagioclase = null;

  @JsonProperty("ore_pyroxeres")
  private Long orePyroxeres = null;

  @JsonProperty("ore_scordite")
  private Long oreScordite = null;

  @JsonProperty("ore_spodumain")
  private Long oreSpodumain = null;

  @JsonProperty("ore_veldspar")
  private Long oreVeldspar = null;

  public GetCharactersCharacterIdStatsMining droneMine(Long droneMine) {
    this.droneMine = droneMine;
    return this;
  }

  /**
   * drone_mine integer
   *
   * @return droneMine
   **/
  @ApiModelProperty(value = "drone_mine integer")


  public Long getDroneMine() {
    return droneMine;
  }

  public void setDroneMine(Long droneMine) {
    this.droneMine = droneMine;
  }

  public GetCharactersCharacterIdStatsMining oreArkonor(Long oreArkonor) {
    this.oreArkonor = oreArkonor;
    return this;
  }

  /**
   * ore_arkonor integer
   *
   * @return oreArkonor
   **/
  @ApiModelProperty(value = "ore_arkonor integer")


  public Long getOreArkonor() {
    return oreArkonor;
  }

  public void setOreArkonor(Long oreArkonor) {
    this.oreArkonor = oreArkonor;
  }

  public GetCharactersCharacterIdStatsMining oreBistot(Long oreBistot) {
    this.oreBistot = oreBistot;
    return this;
  }

  /**
   * ore_bistot integer
   *
   * @return oreBistot
   **/
  @ApiModelProperty(value = "ore_bistot integer")


  public Long getOreBistot() {
    return oreBistot;
  }

  public void setOreBistot(Long oreBistot) {
    this.oreBistot = oreBistot;
  }

  public GetCharactersCharacterIdStatsMining oreCrokite(Long oreCrokite) {
    this.oreCrokite = oreCrokite;
    return this;
  }

  /**
   * ore_crokite integer
   *
   * @return oreCrokite
   **/
  @ApiModelProperty(value = "ore_crokite integer")


  public Long getOreCrokite() {
    return oreCrokite;
  }

  public void setOreCrokite(Long oreCrokite) {
    this.oreCrokite = oreCrokite;
  }

  public GetCharactersCharacterIdStatsMining oreDarkOchre(Long oreDarkOchre) {
    this.oreDarkOchre = oreDarkOchre;
    return this;
  }

  /**
   * ore_dark_ochre integer
   *
   * @return oreDarkOchre
   **/
  @ApiModelProperty(value = "ore_dark_ochre integer")


  public Long getOreDarkOchre() {
    return oreDarkOchre;
  }

  public void setOreDarkOchre(Long oreDarkOchre) {
    this.oreDarkOchre = oreDarkOchre;
  }

  public GetCharactersCharacterIdStatsMining oreGneiss(Long oreGneiss) {
    this.oreGneiss = oreGneiss;
    return this;
  }

  /**
   * ore_gneiss integer
   *
   * @return oreGneiss
   **/
  @ApiModelProperty(value = "ore_gneiss integer")


  public Long getOreGneiss() {
    return oreGneiss;
  }

  public void setOreGneiss(Long oreGneiss) {
    this.oreGneiss = oreGneiss;
  }

  public GetCharactersCharacterIdStatsMining oreHarvestableCloud(Long oreHarvestableCloud) {
    this.oreHarvestableCloud = oreHarvestableCloud;
    return this;
  }

  /**
   * ore_harvestable_cloud integer
   *
   * @return oreHarvestableCloud
   **/
  @ApiModelProperty(value = "ore_harvestable_cloud integer")


  public Long getOreHarvestableCloud() {
    return oreHarvestableCloud;
  }

  public void setOreHarvestableCloud(Long oreHarvestableCloud) {
    this.oreHarvestableCloud = oreHarvestableCloud;
  }

  public GetCharactersCharacterIdStatsMining oreHedbergite(Long oreHedbergite) {
    this.oreHedbergite = oreHedbergite;
    return this;
  }

  /**
   * ore_hedbergite integer
   *
   * @return oreHedbergite
   **/
  @ApiModelProperty(value = "ore_hedbergite integer")


  public Long getOreHedbergite() {
    return oreHedbergite;
  }

  public void setOreHedbergite(Long oreHedbergite) {
    this.oreHedbergite = oreHedbergite;
  }

  public GetCharactersCharacterIdStatsMining oreHemorphite(Long oreHemorphite) {
    this.oreHemorphite = oreHemorphite;
    return this;
  }

  /**
   * ore_hemorphite integer
   *
   * @return oreHemorphite
   **/
  @ApiModelProperty(value = "ore_hemorphite integer")


  public Long getOreHemorphite() {
    return oreHemorphite;
  }

  public void setOreHemorphite(Long oreHemorphite) {
    this.oreHemorphite = oreHemorphite;
  }

  public GetCharactersCharacterIdStatsMining oreIce(Long oreIce) {
    this.oreIce = oreIce;
    return this;
  }

  /**
   * ore_ice integer
   *
   * @return oreIce
   **/
  @ApiModelProperty(value = "ore_ice integer")


  public Long getOreIce() {
    return oreIce;
  }

  public void setOreIce(Long oreIce) {
    this.oreIce = oreIce;
  }

  public GetCharactersCharacterIdStatsMining oreJaspet(Long oreJaspet) {
    this.oreJaspet = oreJaspet;
    return this;
  }

  /**
   * ore_jaspet integer
   *
   * @return oreJaspet
   **/
  @ApiModelProperty(value = "ore_jaspet integer")


  public Long getOreJaspet() {
    return oreJaspet;
  }

  public void setOreJaspet(Long oreJaspet) {
    this.oreJaspet = oreJaspet;
  }

  public GetCharactersCharacterIdStatsMining oreKernite(Long oreKernite) {
    this.oreKernite = oreKernite;
    return this;
  }

  /**
   * ore_kernite integer
   *
   * @return oreKernite
   **/
  @ApiModelProperty(value = "ore_kernite integer")


  public Long getOreKernite() {
    return oreKernite;
  }

  public void setOreKernite(Long oreKernite) {
    this.oreKernite = oreKernite;
  }

  public GetCharactersCharacterIdStatsMining oreMercoxit(Long oreMercoxit) {
    this.oreMercoxit = oreMercoxit;
    return this;
  }

  /**
   * ore_mercoxit integer
   *
   * @return oreMercoxit
   **/
  @ApiModelProperty(value = "ore_mercoxit integer")


  public Long getOreMercoxit() {
    return oreMercoxit;
  }

  public void setOreMercoxit(Long oreMercoxit) {
    this.oreMercoxit = oreMercoxit;
  }

  public GetCharactersCharacterIdStatsMining oreOmber(Long oreOmber) {
    this.oreOmber = oreOmber;
    return this;
  }

  /**
   * ore_omber integer
   *
   * @return oreOmber
   **/
  @ApiModelProperty(value = "ore_omber integer")


  public Long getOreOmber() {
    return oreOmber;
  }

  public void setOreOmber(Long oreOmber) {
    this.oreOmber = oreOmber;
  }

  public GetCharactersCharacterIdStatsMining orePlagioclase(Long orePlagioclase) {
    this.orePlagioclase = orePlagioclase;
    return this;
  }

  /**
   * ore_plagioclase integer
   *
   * @return orePlagioclase
   **/
  @ApiModelProperty(value = "ore_plagioclase integer")


  public Long getOrePlagioclase() {
    return orePlagioclase;
  }

  public void setOrePlagioclase(Long orePlagioclase) {
    this.orePlagioclase = orePlagioclase;
  }

  public GetCharactersCharacterIdStatsMining orePyroxeres(Long orePyroxeres) {
    this.orePyroxeres = orePyroxeres;
    return this;
  }

  /**
   * ore_pyroxeres integer
   *
   * @return orePyroxeres
   **/
  @ApiModelProperty(value = "ore_pyroxeres integer")


  public Long getOrePyroxeres() {
    return orePyroxeres;
  }

  public void setOrePyroxeres(Long orePyroxeres) {
    this.orePyroxeres = orePyroxeres;
  }

  public GetCharactersCharacterIdStatsMining oreScordite(Long oreScordite) {
    this.oreScordite = oreScordite;
    return this;
  }

  /**
   * ore_scordite integer
   *
   * @return oreScordite
   **/
  @ApiModelProperty(value = "ore_scordite integer")


  public Long getOreScordite() {
    return oreScordite;
  }

  public void setOreScordite(Long oreScordite) {
    this.oreScordite = oreScordite;
  }

  public GetCharactersCharacterIdStatsMining oreSpodumain(Long oreSpodumain) {
    this.oreSpodumain = oreSpodumain;
    return this;
  }

  /**
   * ore_spodumain integer
   *
   * @return oreSpodumain
   **/
  @ApiModelProperty(value = "ore_spodumain integer")


  public Long getOreSpodumain() {
    return oreSpodumain;
  }

  public void setOreSpodumain(Long oreSpodumain) {
    this.oreSpodumain = oreSpodumain;
  }

  public GetCharactersCharacterIdStatsMining oreVeldspar(Long oreVeldspar) {
    this.oreVeldspar = oreVeldspar;
    return this;
  }

  /**
   * ore_veldspar integer
   *
   * @return oreVeldspar
   **/
  @ApiModelProperty(value = "ore_veldspar integer")


  public Long getOreVeldspar() {
    return oreVeldspar;
  }

  public void setOreVeldspar(Long oreVeldspar) {
    this.oreVeldspar = oreVeldspar;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdStatsMining getCharactersCharacterIdStatsMining = (GetCharactersCharacterIdStatsMining) o;
    return Objects.equals(this.droneMine, getCharactersCharacterIdStatsMining.droneMine) &&
        Objects.equals(this.oreArkonor, getCharactersCharacterIdStatsMining.oreArkonor) &&
        Objects.equals(this.oreBistot, getCharactersCharacterIdStatsMining.oreBistot) &&
        Objects.equals(this.oreCrokite, getCharactersCharacterIdStatsMining.oreCrokite) &&
        Objects.equals(this.oreDarkOchre, getCharactersCharacterIdStatsMining.oreDarkOchre) &&
        Objects.equals(this.oreGneiss, getCharactersCharacterIdStatsMining.oreGneiss) &&
        Objects.equals(this.oreHarvestableCloud, getCharactersCharacterIdStatsMining.oreHarvestableCloud) &&
        Objects.equals(this.oreHedbergite, getCharactersCharacterIdStatsMining.oreHedbergite) &&
        Objects.equals(this.oreHemorphite, getCharactersCharacterIdStatsMining.oreHemorphite) &&
        Objects.equals(this.oreIce, getCharactersCharacterIdStatsMining.oreIce) &&
        Objects.equals(this.oreJaspet, getCharactersCharacterIdStatsMining.oreJaspet) &&
        Objects.equals(this.oreKernite, getCharactersCharacterIdStatsMining.oreKernite) &&
        Objects.equals(this.oreMercoxit, getCharactersCharacterIdStatsMining.oreMercoxit) &&
        Objects.equals(this.oreOmber, getCharactersCharacterIdStatsMining.oreOmber) &&
        Objects.equals(this.orePlagioclase, getCharactersCharacterIdStatsMining.orePlagioclase) &&
        Objects.equals(this.orePyroxeres, getCharactersCharacterIdStatsMining.orePyroxeres) &&
        Objects.equals(this.oreScordite, getCharactersCharacterIdStatsMining.oreScordite) &&
        Objects.equals(this.oreSpodumain, getCharactersCharacterIdStatsMining.oreSpodumain) &&
        Objects.equals(this.oreVeldspar, getCharactersCharacterIdStatsMining.oreVeldspar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(droneMine, oreArkonor, oreBistot, oreCrokite, oreDarkOchre, oreGneiss, oreHarvestableCloud, oreHedbergite, oreHemorphite, oreIce, oreJaspet, oreKernite, oreMercoxit, oreOmber, orePlagioclase, orePyroxeres, oreScordite, oreSpodumain, oreVeldspar);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdStatsMining {\n");

    sb.append("    droneMine: ").append(toIndentedString(droneMine)).append("\n");
    sb.append("    oreArkonor: ").append(toIndentedString(oreArkonor)).append("\n");
    sb.append("    oreBistot: ").append(toIndentedString(oreBistot)).append("\n");
    sb.append("    oreCrokite: ").append(toIndentedString(oreCrokite)).append("\n");
    sb.append("    oreDarkOchre: ").append(toIndentedString(oreDarkOchre)).append("\n");
    sb.append("    oreGneiss: ").append(toIndentedString(oreGneiss)).append("\n");
    sb.append("    oreHarvestableCloud: ").append(toIndentedString(oreHarvestableCloud)).append("\n");
    sb.append("    oreHedbergite: ").append(toIndentedString(oreHedbergite)).append("\n");
    sb.append("    oreHemorphite: ").append(toIndentedString(oreHemorphite)).append("\n");
    sb.append("    oreIce: ").append(toIndentedString(oreIce)).append("\n");
    sb.append("    oreJaspet: ").append(toIndentedString(oreJaspet)).append("\n");
    sb.append("    oreKernite: ").append(toIndentedString(oreKernite)).append("\n");
    sb.append("    oreMercoxit: ").append(toIndentedString(oreMercoxit)).append("\n");
    sb.append("    oreOmber: ").append(toIndentedString(oreOmber)).append("\n");
    sb.append("    orePlagioclase: ").append(toIndentedString(orePlagioclase)).append("\n");
    sb.append("    orePyroxeres: ").append(toIndentedString(orePyroxeres)).append("\n");
    sb.append("    oreScordite: ").append(toIndentedString(oreScordite)).append("\n");
    sb.append("    oreSpodumain: ").append(toIndentedString(oreSpodumain)).append("\n");
    sb.append("    oreVeldspar: ").append(toIndentedString(oreVeldspar)).append("\n");
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

