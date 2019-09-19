package com.github.tddts.eve.model.universe;

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
public class PostUniverseIdsOk {
  @JsonProperty("agents")
  @Valid
  private List<PostUniverseIdsAgent> agents = null;

  @JsonProperty("alliances")
  @Valid
  private List<PostUniverseIdsAlliance> alliances = null;

  @JsonProperty("characters")
  @Valid
  private List<PostUniverseIdsCharacter> characters = null;

  @JsonProperty("constellations")
  @Valid
  private List<PostUniverseIdsConstellation> constellations = null;

  @JsonProperty("corporations")
  @Valid
  private List<PostUniverseIdsCorporation> corporations = null;

  @JsonProperty("factions")
  @Valid
  private List<PostUniverseIdsFaction> factions = null;

  @JsonProperty("inventory_types")
  @Valid
  private List<PostUniverseIdsInventoryType> inventoryTypes = null;

  @JsonProperty("regions")
  @Valid
  private List<PostUniverseIdsRegion> regions = null;

  @JsonProperty("stations")
  @Valid
  private List<PostUniverseIdsStation> stations = null;

  @JsonProperty("systems")
  @Valid
  private List<PostUniverseIdsSystem> systems = null;

  public PostUniverseIdsOk agents(List<PostUniverseIdsAgent> agents) {
    this.agents = agents;
    return this;
  }

  public PostUniverseIdsOk addAgentsItem(PostUniverseIdsAgent agentsItem) {
    if (this.agents == null) {
      this.agents = new ArrayList<PostUniverseIdsAgent>();
    }
    this.agents.add(agentsItem);
    return this;
  }

  /**
   * agents array
   *
   * @return agents
   **/
  @ApiModelProperty(value = "agents array")

  @Valid
  @Size(max = 500)
  public List<PostUniverseIdsAgent> getAgents() {
    return agents;
  }

  public void setAgents(List<PostUniverseIdsAgent> agents) {
    this.agents = agents;
  }

  public PostUniverseIdsOk alliances(List<PostUniverseIdsAlliance> alliances) {
    this.alliances = alliances;
    return this;
  }

  public PostUniverseIdsOk addAlliancesItem(PostUniverseIdsAlliance alliancesItem) {
    if (this.alliances == null) {
      this.alliances = new ArrayList<PostUniverseIdsAlliance>();
    }
    this.alliances.add(alliancesItem);
    return this;
  }

  /**
   * alliances array
   *
   * @return alliances
   **/
  @ApiModelProperty(value = "alliances array")

  @Valid
  @Size(max = 500)
  public List<PostUniverseIdsAlliance> getAlliances() {
    return alliances;
  }

  public void setAlliances(List<PostUniverseIdsAlliance> alliances) {
    this.alliances = alliances;
  }

  public PostUniverseIdsOk characters(List<PostUniverseIdsCharacter> characters) {
    this.characters = characters;
    return this;
  }

  public PostUniverseIdsOk addCharactersItem(PostUniverseIdsCharacter charactersItem) {
    if (this.characters == null) {
      this.characters = new ArrayList<PostUniverseIdsCharacter>();
    }
    this.characters.add(charactersItem);
    return this;
  }

  /**
   * characters array
   *
   * @return characters
   **/
  @ApiModelProperty(value = "characters array")

  @Valid
  @Size(max = 500)
  public List<PostUniverseIdsCharacter> getCharacters() {
    return characters;
  }

  public void setCharacters(List<PostUniverseIdsCharacter> characters) {
    this.characters = characters;
  }

  public PostUniverseIdsOk constellations(List<PostUniverseIdsConstellation> constellations) {
    this.constellations = constellations;
    return this;
  }

  public PostUniverseIdsOk addConstellationsItem(PostUniverseIdsConstellation constellationsItem) {
    if (this.constellations == null) {
      this.constellations = new ArrayList<PostUniverseIdsConstellation>();
    }
    this.constellations.add(constellationsItem);
    return this;
  }

  /**
   * constellations array
   *
   * @return constellations
   **/
  @ApiModelProperty(value = "constellations array")

  @Valid
  @Size(max = 500)
  public List<PostUniverseIdsConstellation> getConstellations() {
    return constellations;
  }

  public void setConstellations(List<PostUniverseIdsConstellation> constellations) {
    this.constellations = constellations;
  }

  public PostUniverseIdsOk corporations(List<PostUniverseIdsCorporation> corporations) {
    this.corporations = corporations;
    return this;
  }

  public PostUniverseIdsOk addCorporationsItem(PostUniverseIdsCorporation corporationsItem) {
    if (this.corporations == null) {
      this.corporations = new ArrayList<PostUniverseIdsCorporation>();
    }
    this.corporations.add(corporationsItem);
    return this;
  }

  /**
   * corporations array
   *
   * @return corporations
   **/
  @ApiModelProperty(value = "corporations array")

  @Valid
  @Size(max = 500)
  public List<PostUniverseIdsCorporation> getCorporations() {
    return corporations;
  }

  public void setCorporations(List<PostUniverseIdsCorporation> corporations) {
    this.corporations = corporations;
  }

  public PostUniverseIdsOk factions(List<PostUniverseIdsFaction> factions) {
    this.factions = factions;
    return this;
  }

  public PostUniverseIdsOk addFactionsItem(PostUniverseIdsFaction factionsItem) {
    if (this.factions == null) {
      this.factions = new ArrayList<PostUniverseIdsFaction>();
    }
    this.factions.add(factionsItem);
    return this;
  }

  /**
   * factions array
   *
   * @return factions
   **/
  @ApiModelProperty(value = "factions array")

  @Valid
  @Size(max = 500)
  public List<PostUniverseIdsFaction> getFactions() {
    return factions;
  }

  public void setFactions(List<PostUniverseIdsFaction> factions) {
    this.factions = factions;
  }

  public PostUniverseIdsOk inventoryTypes(List<PostUniverseIdsInventoryType> inventoryTypes) {
    this.inventoryTypes = inventoryTypes;
    return this;
  }

  public PostUniverseIdsOk addInventoryTypesItem(PostUniverseIdsInventoryType inventoryTypesItem) {
    if (this.inventoryTypes == null) {
      this.inventoryTypes = new ArrayList<PostUniverseIdsInventoryType>();
    }
    this.inventoryTypes.add(inventoryTypesItem);
    return this;
  }

  /**
   * inventory_types array
   *
   * @return inventoryTypes
   **/
  @ApiModelProperty(value = "inventory_types array")

  @Valid
  @Size(max = 500)
  public List<PostUniverseIdsInventoryType> getInventoryTypes() {
    return inventoryTypes;
  }

  public void setInventoryTypes(List<PostUniverseIdsInventoryType> inventoryTypes) {
    this.inventoryTypes = inventoryTypes;
  }

  public PostUniverseIdsOk regions(List<PostUniverseIdsRegion> regions) {
    this.regions = regions;
    return this;
  }

  public PostUniverseIdsOk addRegionsItem(PostUniverseIdsRegion regionsItem) {
    if (this.regions == null) {
      this.regions = new ArrayList<PostUniverseIdsRegion>();
    }
    this.regions.add(regionsItem);
    return this;
  }

  /**
   * regions array
   *
   * @return regions
   **/
  @ApiModelProperty(value = "regions array")

  @Valid
  @Size(max = 500)
  public List<PostUniverseIdsRegion> getRegions() {
    return regions;
  }

  public void setRegions(List<PostUniverseIdsRegion> regions) {
    this.regions = regions;
  }

  public PostUniverseIdsOk stations(List<PostUniverseIdsStation> stations) {
    this.stations = stations;
    return this;
  }

  public PostUniverseIdsOk addStationsItem(PostUniverseIdsStation stationsItem) {
    if (this.stations == null) {
      this.stations = new ArrayList<PostUniverseIdsStation>();
    }
    this.stations.add(stationsItem);
    return this;
  }

  /**
   * stations array
   *
   * @return stations
   **/
  @ApiModelProperty(value = "stations array")

  @Valid
  @Size(max = 500)
  public List<PostUniverseIdsStation> getStations() {
    return stations;
  }

  public void setStations(List<PostUniverseIdsStation> stations) {
    this.stations = stations;
  }

  public PostUniverseIdsOk systems(List<PostUniverseIdsSystem> systems) {
    this.systems = systems;
    return this;
  }

  public PostUniverseIdsOk addSystemsItem(PostUniverseIdsSystem systemsItem) {
    if (this.systems == null) {
      this.systems = new ArrayList<PostUniverseIdsSystem>();
    }
    this.systems.add(systemsItem);
    return this;
  }

  /**
   * systems array
   *
   * @return systems
   **/
  @ApiModelProperty(value = "systems array")

  @Valid
  @Size(max = 500)
  public List<PostUniverseIdsSystem> getSystems() {
    return systems;
  }

  public void setSystems(List<PostUniverseIdsSystem> systems) {
    this.systems = systems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostUniverseIdsOk postUniverseIdsOk = (PostUniverseIdsOk) o;
    return Objects.equals(this.agents, postUniverseIdsOk.agents) &&
        Objects.equals(this.alliances, postUniverseIdsOk.alliances) &&
        Objects.equals(this.characters, postUniverseIdsOk.characters) &&
        Objects.equals(this.constellations, postUniverseIdsOk.constellations) &&
        Objects.equals(this.corporations, postUniverseIdsOk.corporations) &&
        Objects.equals(this.factions, postUniverseIdsOk.factions) &&
        Objects.equals(this.inventoryTypes, postUniverseIdsOk.inventoryTypes) &&
        Objects.equals(this.regions, postUniverseIdsOk.regions) &&
        Objects.equals(this.stations, postUniverseIdsOk.stations) &&
        Objects.equals(this.systems, postUniverseIdsOk.systems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agents, alliances, characters, constellations, corporations, factions, inventoryTypes, regions, stations, systems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostUniverseIdsOk {\n");

    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    alliances: ").append(toIndentedString(alliances)).append("\n");
    sb.append("    characters: ").append(toIndentedString(characters)).append("\n");
    sb.append("    constellations: ").append(toIndentedString(constellations)).append("\n");
    sb.append("    corporations: ").append(toIndentedString(corporations)).append("\n");
    sb.append("    factions: ").append(toIndentedString(factions)).append("\n");
    sb.append("    inventoryTypes: ").append(toIndentedString(inventoryTypes)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    stations: ").append(toIndentedString(stations)).append("\n");
    sb.append("    systems: ").append(toIndentedString(systems)).append("\n");
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

