package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@Validated
public class GetCharactersCharacterIdAttributesOk {
  @JsonProperty("accrued_remap_cooldown_date")
  private OffsetDateTime accruedRemapCooldownDate = null;

  @JsonProperty("bonus_remaps")
  private Integer bonusRemaps = null;

  @JsonProperty("charisma")
  private Integer charisma = null;

  @JsonProperty("intelligence")
  private Integer intelligence = null;

  @JsonProperty("last_remap_date")
  private OffsetDateTime lastRemapDate = null;

  @JsonProperty("memory")
  private Integer memory = null;

  @JsonProperty("perception")
  private Integer perception = null;

  @JsonProperty("willpower")
  private Integer willpower = null;

  public GetCharactersCharacterIdAttributesOk accruedRemapCooldownDate(OffsetDateTime accruedRemapCooldownDate) {
    this.accruedRemapCooldownDate = accruedRemapCooldownDate;
    return this;
  }

  /**
   * Neural remapping cooldown after a character uses remap accrued over time
   *
   * @return accruedRemapCooldownDate
   **/
  @ApiModelProperty(value = "Neural remapping cooldown after a character uses remap accrued over time")

  @Valid

  public OffsetDateTime getAccruedRemapCooldownDate() {
    return accruedRemapCooldownDate;
  }

  public void setAccruedRemapCooldownDate(OffsetDateTime accruedRemapCooldownDate) {
    this.accruedRemapCooldownDate = accruedRemapCooldownDate;
  }

  public GetCharactersCharacterIdAttributesOk bonusRemaps(Integer bonusRemaps) {
    this.bonusRemaps = bonusRemaps;
    return this;
  }

  /**
   * Number of available bonus character neural remaps
   *
   * @return bonusRemaps
   **/
  @ApiModelProperty(value = "Number of available bonus character neural remaps")


  public Integer getBonusRemaps() {
    return bonusRemaps;
  }

  public void setBonusRemaps(Integer bonusRemaps) {
    this.bonusRemaps = bonusRemaps;
  }

  public GetCharactersCharacterIdAttributesOk charisma(Integer charisma) {
    this.charisma = charisma;
    return this;
  }

  /**
   * charisma integer
   *
   * @return charisma
   **/
  @ApiModelProperty(required = true, value = "charisma integer")
  @NotNull


  public Integer getCharisma() {
    return charisma;
  }

  public void setCharisma(Integer charisma) {
    this.charisma = charisma;
  }

  public GetCharactersCharacterIdAttributesOk intelligence(Integer intelligence) {
    this.intelligence = intelligence;
    return this;
  }

  /**
   * intelligence integer
   *
   * @return intelligence
   **/
  @ApiModelProperty(required = true, value = "intelligence integer")
  @NotNull


  public Integer getIntelligence() {
    return intelligence;
  }

  public void setIntelligence(Integer intelligence) {
    this.intelligence = intelligence;
  }

  public GetCharactersCharacterIdAttributesOk lastRemapDate(OffsetDateTime lastRemapDate) {
    this.lastRemapDate = lastRemapDate;
    return this;
  }

  /**
   * Datetime of last neural remap, including usage of bonus remaps
   *
   * @return lastRemapDate
   **/
  @ApiModelProperty(value = "Datetime of last neural remap, including usage of bonus remaps")

  @Valid

  public OffsetDateTime getLastRemapDate() {
    return lastRemapDate;
  }

  public void setLastRemapDate(OffsetDateTime lastRemapDate) {
    this.lastRemapDate = lastRemapDate;
  }

  public GetCharactersCharacterIdAttributesOk memory(Integer memory) {
    this.memory = memory;
    return this;
  }

  /**
   * memory integer
   *
   * @return memory
   **/
  @ApiModelProperty(required = true, value = "memory integer")
  @NotNull


  public Integer getMemory() {
    return memory;
  }

  public void setMemory(Integer memory) {
    this.memory = memory;
  }

  public GetCharactersCharacterIdAttributesOk perception(Integer perception) {
    this.perception = perception;
    return this;
  }

  /**
   * perception integer
   *
   * @return perception
   **/
  @ApiModelProperty(required = true, value = "perception integer")
  @NotNull


  public Integer getPerception() {
    return perception;
  }

  public void setPerception(Integer perception) {
    this.perception = perception;
  }

  public GetCharactersCharacterIdAttributesOk willpower(Integer willpower) {
    this.willpower = willpower;
    return this;
  }

  /**
   * willpower integer
   *
   * @return willpower
   **/
  @ApiModelProperty(required = true, value = "willpower integer")
  @NotNull


  public Integer getWillpower() {
    return willpower;
  }

  public void setWillpower(Integer willpower) {
    this.willpower = willpower;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdAttributesOk getCharactersCharacterIdAttributesOk = (GetCharactersCharacterIdAttributesOk) o;
    return Objects.equals(this.accruedRemapCooldownDate, getCharactersCharacterIdAttributesOk.accruedRemapCooldownDate) &&
        Objects.equals(this.bonusRemaps, getCharactersCharacterIdAttributesOk.bonusRemaps) &&
        Objects.equals(this.charisma, getCharactersCharacterIdAttributesOk.charisma) &&
        Objects.equals(this.intelligence, getCharactersCharacterIdAttributesOk.intelligence) &&
        Objects.equals(this.lastRemapDate, getCharactersCharacterIdAttributesOk.lastRemapDate) &&
        Objects.equals(this.memory, getCharactersCharacterIdAttributesOk.memory) &&
        Objects.equals(this.perception, getCharactersCharacterIdAttributesOk.perception) &&
        Objects.equals(this.willpower, getCharactersCharacterIdAttributesOk.willpower);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accruedRemapCooldownDate, bonusRemaps, charisma, intelligence, lastRemapDate, memory, perception, willpower);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdAttributesOk {\n");

    sb.append("    accruedRemapCooldownDate: ").append(toIndentedString(accruedRemapCooldownDate)).append("\n");
    sb.append("    bonusRemaps: ").append(toIndentedString(bonusRemaps)).append("\n");
    sb.append("    charisma: ").append(toIndentedString(charisma)).append("\n");
    sb.append("    intelligence: ").append(toIndentedString(intelligence)).append("\n");
    sb.append("    lastRemapDate: ").append(toIndentedString(lastRemapDate)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    perception: ").append(toIndentedString(perception)).append("\n");
    sb.append("    willpower: ").append(toIndentedString(willpower)).append("\n");
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

