package com.github.tddts.eve.model.universe;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@Validated
public class GetUniverseBloodlines200Ok {
  @JsonProperty("bloodline_id")
  private Integer bloodlineId = null;

  @JsonProperty("charisma")
  private Integer charisma = null;

  @JsonProperty("corporation_id")
  private Integer corporationId = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("intelligence")
  private Integer intelligence = null;

  @JsonProperty("memory")
  private Integer memory = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("perception")
  private Integer perception = null;

  @JsonProperty("race_id")
  private Integer raceId = null;

  @JsonProperty("ship_type_id")
  private Integer shipTypeId = null;

  @JsonProperty("willpower")
  private Integer willpower = null;

  public GetUniverseBloodlines200Ok bloodlineId(Integer bloodlineId) {
    this.bloodlineId = bloodlineId;
    return this;
  }

  /**
   * bloodline_id integer
   *
   * @return bloodlineId
   **/
  @ApiModelProperty(required = true, value = "bloodline_id integer")
  @NotNull


  public Integer getBloodlineId() {
    return bloodlineId;
  }

  public void setBloodlineId(Integer bloodlineId) {
    this.bloodlineId = bloodlineId;
  }

  public GetUniverseBloodlines200Ok charisma(Integer charisma) {
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

  public GetUniverseBloodlines200Ok corporationId(Integer corporationId) {
    this.corporationId = corporationId;
    return this;
  }

  /**
   * corporation_id integer
   *
   * @return corporationId
   **/
  @ApiModelProperty(required = true, value = "corporation_id integer")
  @NotNull


  public Integer getCorporationId() {
    return corporationId;
  }

  public void setCorporationId(Integer corporationId) {
    this.corporationId = corporationId;
  }

  public GetUniverseBloodlines200Ok description(String description) {
    this.description = description;
    return this;
  }

  /**
   * description string
   *
   * @return description
   **/
  @ApiModelProperty(required = true, value = "description string")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GetUniverseBloodlines200Ok intelligence(Integer intelligence) {
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

  public GetUniverseBloodlines200Ok memory(Integer memory) {
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

  public GetUniverseBloodlines200Ok name(String name) {
    this.name = name;
    return this;
  }

  /**
   * name string
   *
   * @return name
   **/
  @ApiModelProperty(required = true, value = "name string")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetUniverseBloodlines200Ok perception(Integer perception) {
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

  public GetUniverseBloodlines200Ok raceId(Integer raceId) {
    this.raceId = raceId;
    return this;
  }

  /**
   * race_id integer
   *
   * @return raceId
   **/
  @ApiModelProperty(required = true, value = "race_id integer")
  @NotNull


  public Integer getRaceId() {
    return raceId;
  }

  public void setRaceId(Integer raceId) {
    this.raceId = raceId;
  }

  public GetUniverseBloodlines200Ok shipTypeId(Integer shipTypeId) {
    this.shipTypeId = shipTypeId;
    return this;
  }

  /**
   * ship_type_id integer
   *
   * @return shipTypeId
   **/
  @ApiModelProperty(required = true, value = "ship_type_id integer")
  @NotNull


  public Integer getShipTypeId() {
    return shipTypeId;
  }

  public void setShipTypeId(Integer shipTypeId) {
    this.shipTypeId = shipTypeId;
  }

  public GetUniverseBloodlines200Ok willpower(Integer willpower) {
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
    GetUniverseBloodlines200Ok getUniverseBloodlines200Ok = (GetUniverseBloodlines200Ok) o;
    return Objects.equals(this.bloodlineId, getUniverseBloodlines200Ok.bloodlineId) &&
        Objects.equals(this.charisma, getUniverseBloodlines200Ok.charisma) &&
        Objects.equals(this.corporationId, getUniverseBloodlines200Ok.corporationId) &&
        Objects.equals(this.description, getUniverseBloodlines200Ok.description) &&
        Objects.equals(this.intelligence, getUniverseBloodlines200Ok.intelligence) &&
        Objects.equals(this.memory, getUniverseBloodlines200Ok.memory) &&
        Objects.equals(this.name, getUniverseBloodlines200Ok.name) &&
        Objects.equals(this.perception, getUniverseBloodlines200Ok.perception) &&
        Objects.equals(this.raceId, getUniverseBloodlines200Ok.raceId) &&
        Objects.equals(this.shipTypeId, getUniverseBloodlines200Ok.shipTypeId) &&
        Objects.equals(this.willpower, getUniverseBloodlines200Ok.willpower);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bloodlineId, charisma, corporationId, description, intelligence, memory, name, perception, raceId, shipTypeId, willpower);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseBloodlines200Ok {\n");

    sb.append("    bloodlineId: ").append(toIndentedString(bloodlineId)).append("\n");
    sb.append("    charisma: ").append(toIndentedString(charisma)).append("\n");
    sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    intelligence: ").append(toIndentedString(intelligence)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    perception: ").append(toIndentedString(perception)).append("\n");
    sb.append("    raceId: ").append(toIndentedString(raceId)).append("\n");
    sb.append("    shipTypeId: ").append(toIndentedString(shipTypeId)).append("\n");
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

