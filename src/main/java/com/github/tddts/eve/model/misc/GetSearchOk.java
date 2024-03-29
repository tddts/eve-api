package com.github.tddts.eve.model.misc;

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
public class GetSearchOk {
  @JsonProperty("agent")
  @Valid
  private List<Integer> agent = null;

  @JsonProperty("alliance")
  @Valid
  private List<Integer> alliance = null;

  @JsonProperty("character")
  @Valid
  private List<Integer> character = null;

  @JsonProperty("constellation")
  @Valid
  private List<Integer> constellation = null;

  @JsonProperty("corporation")
  @Valid
  private List<Integer> corporation = null;

  @JsonProperty("faction")
  @Valid
  private List<Integer> faction = null;

  @JsonProperty("inventory_type")
  @Valid
  private List<Integer> inventoryType = null;

  @JsonProperty("region")
  @Valid
  private List<Integer> region = null;

  @JsonProperty("solar_system")
  @Valid
  private List<Integer> solarSystem = null;

  @JsonProperty("station")
  @Valid
  private List<Integer> station = null;

  public GetSearchOk agent(List<Integer> agent) {
    this.agent = agent;
    return this;
  }

  public GetSearchOk addAgentItem(Integer agentItem) {
    if (this.agent == null) {
      this.agent = new ArrayList<Integer>();
    }
    this.agent.add(agentItem);
    return this;
  }

  /**
   * agent array
   *
   * @return agent
   **/
  @ApiModelProperty(value = "agent array")

  @Size(max = 500)
  public List<Integer> getAgent() {
    return agent;
  }

  public void setAgent(List<Integer> agent) {
    this.agent = agent;
  }

  public GetSearchOk alliance(List<Integer> alliance) {
    this.alliance = alliance;
    return this;
  }

  public GetSearchOk addAllianceItem(Integer allianceItem) {
    if (this.alliance == null) {
      this.alliance = new ArrayList<Integer>();
    }
    this.alliance.add(allianceItem);
    return this;
  }

  /**
   * alliance array
   *
   * @return alliance
   **/
  @ApiModelProperty(value = "alliance array")

  @Size(max = 500)
  public List<Integer> getAlliance() {
    return alliance;
  }

  public void setAlliance(List<Integer> alliance) {
    this.alliance = alliance;
  }

  public GetSearchOk character(List<Integer> character) {
    this.character = character;
    return this;
  }

  public GetSearchOk addCharacterItem(Integer characterItem) {
    if (this.character == null) {
      this.character = new ArrayList<Integer>();
    }
    this.character.add(characterItem);
    return this;
  }

  /**
   * character array
   *
   * @return character
   **/
  @ApiModelProperty(value = "character array")

  @Size(max = 500)
  public List<Integer> getCharacter() {
    return character;
  }

  public void setCharacter(List<Integer> character) {
    this.character = character;
  }

  public GetSearchOk constellation(List<Integer> constellation) {
    this.constellation = constellation;
    return this;
  }

  public GetSearchOk addConstellationItem(Integer constellationItem) {
    if (this.constellation == null) {
      this.constellation = new ArrayList<Integer>();
    }
    this.constellation.add(constellationItem);
    return this;
  }

  /**
   * constellation array
   *
   * @return constellation
   **/
  @ApiModelProperty(value = "constellation array")

  @Size(max = 500)
  public List<Integer> getConstellation() {
    return constellation;
  }

  public void setConstellation(List<Integer> constellation) {
    this.constellation = constellation;
  }

  public GetSearchOk corporation(List<Integer> corporation) {
    this.corporation = corporation;
    return this;
  }

  public GetSearchOk addCorporationItem(Integer corporationItem) {
    if (this.corporation == null) {
      this.corporation = new ArrayList<Integer>();
    }
    this.corporation.add(corporationItem);
    return this;
  }

  /**
   * corporation array
   *
   * @return corporation
   **/
  @ApiModelProperty(value = "corporation array")

  @Size(max = 500)
  public List<Integer> getCorporation() {
    return corporation;
  }

  public void setCorporation(List<Integer> corporation) {
    this.corporation = corporation;
  }

  public GetSearchOk faction(List<Integer> faction) {
    this.faction = faction;
    return this;
  }

  public GetSearchOk addFactionItem(Integer factionItem) {
    if (this.faction == null) {
      this.faction = new ArrayList<Integer>();
    }
    this.faction.add(factionItem);
    return this;
  }

  /**
   * faction array
   *
   * @return faction
   **/
  @ApiModelProperty(value = "faction array")

  @Size(max = 500)
  public List<Integer> getFaction() {
    return faction;
  }

  public void setFaction(List<Integer> faction) {
    this.faction = faction;
  }

  public GetSearchOk inventoryType(List<Integer> inventoryType) {
    this.inventoryType = inventoryType;
    return this;
  }

  public GetSearchOk addInventoryTypeItem(Integer inventoryTypeItem) {
    if (this.inventoryType == null) {
      this.inventoryType = new ArrayList<Integer>();
    }
    this.inventoryType.add(inventoryTypeItem);
    return this;
  }

  /**
   * inventory_type array
   *
   * @return inventoryType
   **/
  @ApiModelProperty(value = "inventory_type array")

  @Size(max = 500)
  public List<Integer> getInventoryType() {
    return inventoryType;
  }

  public void setInventoryType(List<Integer> inventoryType) {
    this.inventoryType = inventoryType;
  }

  public GetSearchOk region(List<Integer> region) {
    this.region = region;
    return this;
  }

  public GetSearchOk addRegionItem(Integer regionItem) {
    if (this.region == null) {
      this.region = new ArrayList<Integer>();
    }
    this.region.add(regionItem);
    return this;
  }

  /**
   * region array
   *
   * @return region
   **/
  @ApiModelProperty(value = "region array")

  @Size(max = 500)
  public List<Integer> getRegion() {
    return region;
  }

  public void setRegion(List<Integer> region) {
    this.region = region;
  }

  public GetSearchOk solarSystem(List<Integer> solarSystem) {
    this.solarSystem = solarSystem;
    return this;
  }

  public GetSearchOk addSolarSystemItem(Integer solarSystemItem) {
    if (this.solarSystem == null) {
      this.solarSystem = new ArrayList<Integer>();
    }
    this.solarSystem.add(solarSystemItem);
    return this;
  }

  /**
   * solar_system array
   *
   * @return solarSystem
   **/
  @ApiModelProperty(value = "solar_system array")

  @Size(max = 500)
  public List<Integer> getSolarSystem() {
    return solarSystem;
  }

  public void setSolarSystem(List<Integer> solarSystem) {
    this.solarSystem = solarSystem;
  }

  public GetSearchOk station(List<Integer> station) {
    this.station = station;
    return this;
  }

  public GetSearchOk addStationItem(Integer stationItem) {
    if (this.station == null) {
      this.station = new ArrayList<Integer>();
    }
    this.station.add(stationItem);
    return this;
  }

  /**
   * station array
   *
   * @return station
   **/
  @ApiModelProperty(value = "station array")

  @Size(max = 500)
  public List<Integer> getStation() {
    return station;
  }

  public void setStation(List<Integer> station) {
    this.station = station;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSearchOk getSearchOk = (GetSearchOk) o;
    return Objects.equals(this.agent, getSearchOk.agent) &&
        Objects.equals(this.alliance, getSearchOk.alliance) &&
        Objects.equals(this.character, getSearchOk.character) &&
        Objects.equals(this.constellation, getSearchOk.constellation) &&
        Objects.equals(this.corporation, getSearchOk.corporation) &&
        Objects.equals(this.faction, getSearchOk.faction) &&
        Objects.equals(this.inventoryType, getSearchOk.inventoryType) &&
        Objects.equals(this.region, getSearchOk.region) &&
        Objects.equals(this.solarSystem, getSearchOk.solarSystem) &&
        Objects.equals(this.station, getSearchOk.station);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agent, alliance, character, constellation, corporation, faction, inventoryType, region, solarSystem, station);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSearchOk {\n");

    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    alliance: ").append(toIndentedString(alliance)).append("\n");
    sb.append("    character: ").append(toIndentedString(character)).append("\n");
    sb.append("    constellation: ").append(toIndentedString(constellation)).append("\n");
    sb.append("    corporation: ").append(toIndentedString(corporation)).append("\n");
    sb.append("    faction: ").append(toIndentedString(faction)).append("\n");
    sb.append("    inventoryType: ").append(toIndentedString(inventoryType)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    solarSystem: ").append(toIndentedString(solarSystem)).append("\n");
    sb.append("    station: ").append(toIndentedString(station)).append("\n");
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

