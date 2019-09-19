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
public class GetUniverseSystemKills200Ok {
  @JsonProperty("npc_kills")
  private Integer npcKills = null;

  @JsonProperty("pod_kills")
  private Integer podKills = null;

  @JsonProperty("ship_kills")
  private Integer shipKills = null;

  @JsonProperty("system_id")
  private Integer systemId = null;

  public GetUniverseSystemKills200Ok npcKills(Integer npcKills) {
    this.npcKills = npcKills;
    return this;
  }

  /**
   * Number of NPC ships killed in this system
   *
   * @return npcKills
   **/
  @ApiModelProperty(required = true, value = "Number of NPC ships killed in this system")
  @NotNull


  public Integer getNpcKills() {
    return npcKills;
  }

  public void setNpcKills(Integer npcKills) {
    this.npcKills = npcKills;
  }

  public GetUniverseSystemKills200Ok podKills(Integer podKills) {
    this.podKills = podKills;
    return this;
  }

  /**
   * Number of pods killed in this system
   *
   * @return podKills
   **/
  @ApiModelProperty(required = true, value = "Number of pods killed in this system")
  @NotNull


  public Integer getPodKills() {
    return podKills;
  }

  public void setPodKills(Integer podKills) {
    this.podKills = podKills;
  }

  public GetUniverseSystemKills200Ok shipKills(Integer shipKills) {
    this.shipKills = shipKills;
    return this;
  }

  /**
   * Number of player ships killed in this system
   *
   * @return shipKills
   **/
  @ApiModelProperty(required = true, value = "Number of player ships killed in this system")
  @NotNull


  public Integer getShipKills() {
    return shipKills;
  }

  public void setShipKills(Integer shipKills) {
    this.shipKills = shipKills;
  }

  public GetUniverseSystemKills200Ok systemId(Integer systemId) {
    this.systemId = systemId;
    return this;
  }

  /**
   * system_id integer
   *
   * @return systemId
   **/
  @ApiModelProperty(required = true, value = "system_id integer")
  @NotNull


  public Integer getSystemId() {
    return systemId;
  }

  public void setSystemId(Integer systemId) {
    this.systemId = systemId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseSystemKills200Ok getUniverseSystemKills200Ok = (GetUniverseSystemKills200Ok) o;
    return Objects.equals(this.npcKills, getUniverseSystemKills200Ok.npcKills) &&
        Objects.equals(this.podKills, getUniverseSystemKills200Ok.podKills) &&
        Objects.equals(this.shipKills, getUniverseSystemKills200Ok.shipKills) &&
        Objects.equals(this.systemId, getUniverseSystemKills200Ok.systemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(npcKills, podKills, shipKills, systemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseSystemKills200Ok {\n");

    sb.append("    npcKills: ").append(toIndentedString(npcKills)).append("\n");
    sb.append("    podKills: ").append(toIndentedString(podKills)).append("\n");
    sb.append("    shipKills: ").append(toIndentedString(shipKills)).append("\n");
    sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
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

