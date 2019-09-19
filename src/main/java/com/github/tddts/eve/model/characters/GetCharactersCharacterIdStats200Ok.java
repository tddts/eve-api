package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Aggregate stats for a year
 */
@ApiModel(description = "Aggregate stats for a year")
@Validated
public class GetCharactersCharacterIdStats200Ok {
  @JsonProperty("character")
  private GetCharactersCharacterIdStatsCharacter character = null;

  @JsonProperty("combat")
  private GetCharactersCharacterIdStatsCombat combat = null;

  @JsonProperty("industry")
  private GetCharactersCharacterIdStatsIndustry industry = null;

  @JsonProperty("inventory")
  private GetCharactersCharacterIdStatsInventory inventory = null;

  @JsonProperty("isk")
  private GetCharactersCharacterIdStatsIsk isk = null;

  @JsonProperty("market")
  private GetCharactersCharacterIdStatsMarket market = null;

  @JsonProperty("mining")
  private GetCharactersCharacterIdStatsMining mining = null;

  @JsonProperty("module")
  private GetCharactersCharacterIdStatsModule module = null;

  @JsonProperty("orbital")
  private GetCharactersCharacterIdStatsOrbital orbital = null;

  @JsonProperty("pve")
  private GetCharactersCharacterIdStatsPve pve = null;

  @JsonProperty("social")
  private GetCharactersCharacterIdStatsSocial social = null;

  @JsonProperty("travel")
  private GetCharactersCharacterIdStatsTravel travel = null;

  @JsonProperty("year")
  private Integer year = null;

  public GetCharactersCharacterIdStats200Ok character(GetCharactersCharacterIdStatsCharacter character) {
    this.character = character;
    return this;
  }

  /**
   * Get character
   *
   * @return character
   **/
  @ApiModelProperty(value = "")

  @Valid

  public GetCharactersCharacterIdStatsCharacter getCharacter() {
    return character;
  }

  public void setCharacter(GetCharactersCharacterIdStatsCharacter character) {
    this.character = character;
  }

  public GetCharactersCharacterIdStats200Ok combat(GetCharactersCharacterIdStatsCombat combat) {
    this.combat = combat;
    return this;
  }

  /**
   * Get combat
   *
   * @return combat
   **/
  @ApiModelProperty(value = "")

  @Valid

  public GetCharactersCharacterIdStatsCombat getCombat() {
    return combat;
  }

  public void setCombat(GetCharactersCharacterIdStatsCombat combat) {
    this.combat = combat;
  }

  public GetCharactersCharacterIdStats200Ok industry(GetCharactersCharacterIdStatsIndustry industry) {
    this.industry = industry;
    return this;
  }

  /**
   * Get industry
   *
   * @return industry
   **/
  @ApiModelProperty(value = "")

  @Valid

  public GetCharactersCharacterIdStatsIndustry getIndustry() {
    return industry;
  }

  public void setIndustry(GetCharactersCharacterIdStatsIndustry industry) {
    this.industry = industry;
  }

  public GetCharactersCharacterIdStats200Ok inventory(GetCharactersCharacterIdStatsInventory inventory) {
    this.inventory = inventory;
    return this;
  }

  /**
   * Get inventory
   *
   * @return inventory
   **/
  @ApiModelProperty(value = "")

  @Valid

  public GetCharactersCharacterIdStatsInventory getInventory() {
    return inventory;
  }

  public void setInventory(GetCharactersCharacterIdStatsInventory inventory) {
    this.inventory = inventory;
  }

  public GetCharactersCharacterIdStats200Ok isk(GetCharactersCharacterIdStatsIsk isk) {
    this.isk = isk;
    return this;
  }

  /**
   * Get isk
   *
   * @return isk
   **/
  @ApiModelProperty(value = "")

  @Valid

  public GetCharactersCharacterIdStatsIsk getIsk() {
    return isk;
  }

  public void setIsk(GetCharactersCharacterIdStatsIsk isk) {
    this.isk = isk;
  }

  public GetCharactersCharacterIdStats200Ok market(GetCharactersCharacterIdStatsMarket market) {
    this.market = market;
    return this;
  }

  /**
   * Get market
   *
   * @return market
   **/
  @ApiModelProperty(value = "")

  @Valid

  public GetCharactersCharacterIdStatsMarket getMarket() {
    return market;
  }

  public void setMarket(GetCharactersCharacterIdStatsMarket market) {
    this.market = market;
  }

  public GetCharactersCharacterIdStats200Ok mining(GetCharactersCharacterIdStatsMining mining) {
    this.mining = mining;
    return this;
  }

  /**
   * Get mining
   *
   * @return mining
   **/
  @ApiModelProperty(value = "")

  @Valid

  public GetCharactersCharacterIdStatsMining getMining() {
    return mining;
  }

  public void setMining(GetCharactersCharacterIdStatsMining mining) {
    this.mining = mining;
  }

  public GetCharactersCharacterIdStats200Ok module(GetCharactersCharacterIdStatsModule module) {
    this.module = module;
    return this;
  }

  /**
   * Get module
   *
   * @return module
   **/
  @ApiModelProperty(value = "")

  @Valid

  public GetCharactersCharacterIdStatsModule getModule() {
    return module;
  }

  public void setModule(GetCharactersCharacterIdStatsModule module) {
    this.module = module;
  }

  public GetCharactersCharacterIdStats200Ok orbital(GetCharactersCharacterIdStatsOrbital orbital) {
    this.orbital = orbital;
    return this;
  }

  /**
   * Get orbital
   *
   * @return orbital
   **/
  @ApiModelProperty(value = "")

  @Valid

  public GetCharactersCharacterIdStatsOrbital getOrbital() {
    return orbital;
  }

  public void setOrbital(GetCharactersCharacterIdStatsOrbital orbital) {
    this.orbital = orbital;
  }

  public GetCharactersCharacterIdStats200Ok pve(GetCharactersCharacterIdStatsPve pve) {
    this.pve = pve;
    return this;
  }

  /**
   * Get pve
   *
   * @return pve
   **/
  @ApiModelProperty(value = "")

  @Valid

  public GetCharactersCharacterIdStatsPve getPve() {
    return pve;
  }

  public void setPve(GetCharactersCharacterIdStatsPve pve) {
    this.pve = pve;
  }

  public GetCharactersCharacterIdStats200Ok social(GetCharactersCharacterIdStatsSocial social) {
    this.social = social;
    return this;
  }

  /**
   * Get social
   *
   * @return social
   **/
  @ApiModelProperty(value = "")

  @Valid

  public GetCharactersCharacterIdStatsSocial getSocial() {
    return social;
  }

  public void setSocial(GetCharactersCharacterIdStatsSocial social) {
    this.social = social;
  }

  public GetCharactersCharacterIdStats200Ok travel(GetCharactersCharacterIdStatsTravel travel) {
    this.travel = travel;
    return this;
  }

  /**
   * Get travel
   *
   * @return travel
   **/
  @ApiModelProperty(value = "")

  @Valid

  public GetCharactersCharacterIdStatsTravel getTravel() {
    return travel;
  }

  public void setTravel(GetCharactersCharacterIdStatsTravel travel) {
    this.travel = travel;
  }

  public GetCharactersCharacterIdStats200Ok year(Integer year) {
    this.year = year;
    return this;
  }

  /**
   * Gregorian year for this set of aggregates
   *
   * @return year
   **/
  @ApiModelProperty(required = true, value = "Gregorian year for this set of aggregates")
  @NotNull


  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdStats200Ok getCharactersCharacterIdStats200Ok = (GetCharactersCharacterIdStats200Ok) o;
    return Objects.equals(this.character, getCharactersCharacterIdStats200Ok.character) &&
        Objects.equals(this.combat, getCharactersCharacterIdStats200Ok.combat) &&
        Objects.equals(this.industry, getCharactersCharacterIdStats200Ok.industry) &&
        Objects.equals(this.inventory, getCharactersCharacterIdStats200Ok.inventory) &&
        Objects.equals(this.isk, getCharactersCharacterIdStats200Ok.isk) &&
        Objects.equals(this.market, getCharactersCharacterIdStats200Ok.market) &&
        Objects.equals(this.mining, getCharactersCharacterIdStats200Ok.mining) &&
        Objects.equals(this.module, getCharactersCharacterIdStats200Ok.module) &&
        Objects.equals(this.orbital, getCharactersCharacterIdStats200Ok.orbital) &&
        Objects.equals(this.pve, getCharactersCharacterIdStats200Ok.pve) &&
        Objects.equals(this.social, getCharactersCharacterIdStats200Ok.social) &&
        Objects.equals(this.travel, getCharactersCharacterIdStats200Ok.travel) &&
        Objects.equals(this.year, getCharactersCharacterIdStats200Ok.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(character, combat, industry, inventory, isk, market, mining, module, orbital, pve, social, travel, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdStats200Ok {\n");

    sb.append("    character: ").append(toIndentedString(character)).append("\n");
    sb.append("    combat: ").append(toIndentedString(combat)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
    sb.append("    isk: ").append(toIndentedString(isk)).append("\n");
    sb.append("    market: ").append(toIndentedString(market)).append("\n");
    sb.append("    mining: ").append(toIndentedString(mining)).append("\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    orbital: ").append(toIndentedString(orbital)).append("\n");
    sb.append("    pve: ").append(toIndentedString(pve)).append("\n");
    sb.append("    social: ").append(toIndentedString(social)).append("\n");
    sb.append("    travel: ").append(toIndentedString(travel)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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

