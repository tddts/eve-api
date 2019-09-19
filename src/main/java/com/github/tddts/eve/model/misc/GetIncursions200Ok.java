package com.github.tddts.eve.model.misc;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@Validated
public class GetIncursions200Ok {
  @JsonProperty("constellation_id")
  private Integer constellationId = null;

  @JsonProperty("faction_id")
  private Integer factionId = null;

  @JsonProperty("has_boss")
  private Boolean hasBoss = null;

  @JsonProperty("infested_solar_systems")
  @Valid
  private List<Integer> infestedSolarSystems = new ArrayList<Integer>();

  @JsonProperty("influence")
  private Float influence = null;

  @JsonProperty("staging_solar_system_id")
  private Integer stagingSolarSystemId = null;

  /**
   * The state of this incursion
   */
  public enum StateEnum {
    WITHDRAWING("withdrawing"),

    MOBILIZING("mobilizing"),

    ESTABLISHED("established");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("state")
  private StateEnum state = null;

  @JsonProperty("type")
  private String type = null;

  public GetIncursions200Ok constellationId(Integer constellationId) {
    this.constellationId = constellationId;
    return this;
  }

  /**
   * The constellation id in which this incursion takes place
   *
   * @return constellationId
   **/
  @ApiModelProperty(required = true, value = "The constellation id in which this incursion takes place")
  @NotNull


  public Integer getConstellationId() {
    return constellationId;
  }

  public void setConstellationId(Integer constellationId) {
    this.constellationId = constellationId;
  }

  public GetIncursions200Ok factionId(Integer factionId) {
    this.factionId = factionId;
    return this;
  }

  /**
   * The attacking faction's id
   *
   * @return factionId
   **/
  @ApiModelProperty(required = true, value = "The attacking faction's id")
  @NotNull


  public Integer getFactionId() {
    return factionId;
  }

  public void setFactionId(Integer factionId) {
    this.factionId = factionId;
  }

  public GetIncursions200Ok hasBoss(Boolean hasBoss) {
    this.hasBoss = hasBoss;
    return this;
  }

  /**
   * Whether the final encounter has boss or not
   *
   * @return hasBoss
   **/
  @ApiModelProperty(required = true, value = "Whether the final encounter has boss or not")
  @NotNull


  public Boolean isHasBoss() {
    return hasBoss;
  }

  public void setHasBoss(Boolean hasBoss) {
    this.hasBoss = hasBoss;
  }

  public GetIncursions200Ok infestedSolarSystems(List<Integer> infestedSolarSystems) {
    this.infestedSolarSystems = infestedSolarSystems;
    return this;
  }

  public GetIncursions200Ok addInfestedSolarSystemsItem(Integer infestedSolarSystemsItem) {
    this.infestedSolarSystems.add(infestedSolarSystemsItem);
    return this;
  }

  /**
   * A list of infested solar system ids that are a part of this incursion
   *
   * @return infestedSolarSystems
   **/
  @ApiModelProperty(required = true, value = "A list of infested solar system ids that are a part of this incursion")
  @NotNull

  @Size(max = 100)
  public List<Integer> getInfestedSolarSystems() {
    return infestedSolarSystems;
  }

  public void setInfestedSolarSystems(List<Integer> infestedSolarSystems) {
    this.infestedSolarSystems = infestedSolarSystems;
  }

  public GetIncursions200Ok influence(Float influence) {
    this.influence = influence;
    return this;
  }

  /**
   * Influence of this incursion as a float from 0 to 1
   *
   * @return influence
   **/
  @ApiModelProperty(required = true, value = "Influence of this incursion as a float from 0 to 1")
  @NotNull


  public Float getInfluence() {
    return influence;
  }

  public void setInfluence(Float influence) {
    this.influence = influence;
  }

  public GetIncursions200Ok stagingSolarSystemId(Integer stagingSolarSystemId) {
    this.stagingSolarSystemId = stagingSolarSystemId;
    return this;
  }

  /**
   * Staging solar system for this incursion
   *
   * @return stagingSolarSystemId
   **/
  @ApiModelProperty(required = true, value = "Staging solar system for this incursion")
  @NotNull


  public Integer getStagingSolarSystemId() {
    return stagingSolarSystemId;
  }

  public void setStagingSolarSystemId(Integer stagingSolarSystemId) {
    this.stagingSolarSystemId = stagingSolarSystemId;
  }

  public GetIncursions200Ok state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * The state of this incursion
   *
   * @return state
   **/
  @ApiModelProperty(required = true, value = "The state of this incursion")
  @NotNull


  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public GetIncursions200Ok type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of this incursion
   *
   * @return type
   **/
  @ApiModelProperty(required = true, value = "The type of this incursion")
  @NotNull


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetIncursions200Ok getIncursions200Ok = (GetIncursions200Ok) o;
    return Objects.equals(this.constellationId, getIncursions200Ok.constellationId) &&
        Objects.equals(this.factionId, getIncursions200Ok.factionId) &&
        Objects.equals(this.hasBoss, getIncursions200Ok.hasBoss) &&
        Objects.equals(this.infestedSolarSystems, getIncursions200Ok.infestedSolarSystems) &&
        Objects.equals(this.influence, getIncursions200Ok.influence) &&
        Objects.equals(this.stagingSolarSystemId, getIncursions200Ok.stagingSolarSystemId) &&
        Objects.equals(this.state, getIncursions200Ok.state) &&
        Objects.equals(this.type, getIncursions200Ok.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constellationId, factionId, hasBoss, infestedSolarSystems, influence, stagingSolarSystemId, state, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetIncursions200Ok {\n");

    sb.append("    constellationId: ").append(toIndentedString(constellationId)).append("\n");
    sb.append("    factionId: ").append(toIndentedString(factionId)).append("\n");
    sb.append("    hasBoss: ").append(toIndentedString(hasBoss)).append("\n");
    sb.append("    infestedSolarSystems: ").append(toIndentedString(infestedSolarSystems)).append("\n");
    sb.append("    influence: ").append(toIndentedString(influence)).append("\n");
    sb.append("    stagingSolarSystemId: ").append(toIndentedString(stagingSolarSystemId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

