package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * pve object
 */
@ApiModel(description = "pve object")
@Validated
public class GetCharactersCharacterIdStatsPve {
  @JsonProperty("dungeons_completed_agent")
  private Long dungeonsCompletedAgent = null;

  @JsonProperty("dungeons_completed_distribution")
  private Long dungeonsCompletedDistribution = null;

  @JsonProperty("missions_succeeded")
  private Long missionsSucceeded = null;

  @JsonProperty("missions_succeeded_epic_arc")
  private Long missionsSucceededEpicArc = null;

  public GetCharactersCharacterIdStatsPve dungeonsCompletedAgent(Long dungeonsCompletedAgent) {
    this.dungeonsCompletedAgent = dungeonsCompletedAgent;
    return this;
  }

  /**
   * dungeons_completed_agent integer
   *
   * @return dungeonsCompletedAgent
   **/
  @ApiModelProperty(value = "dungeons_completed_agent integer")


  public Long getDungeonsCompletedAgent() {
    return dungeonsCompletedAgent;
  }

  public void setDungeonsCompletedAgent(Long dungeonsCompletedAgent) {
    this.dungeonsCompletedAgent = dungeonsCompletedAgent;
  }

  public GetCharactersCharacterIdStatsPve dungeonsCompletedDistribution(Long dungeonsCompletedDistribution) {
    this.dungeonsCompletedDistribution = dungeonsCompletedDistribution;
    return this;
  }

  /**
   * dungeons_completed_distribution integer
   *
   * @return dungeonsCompletedDistribution
   **/
  @ApiModelProperty(value = "dungeons_completed_distribution integer")


  public Long getDungeonsCompletedDistribution() {
    return dungeonsCompletedDistribution;
  }

  public void setDungeonsCompletedDistribution(Long dungeonsCompletedDistribution) {
    this.dungeonsCompletedDistribution = dungeonsCompletedDistribution;
  }

  public GetCharactersCharacterIdStatsPve missionsSucceeded(Long missionsSucceeded) {
    this.missionsSucceeded = missionsSucceeded;
    return this;
  }

  /**
   * missions_succeeded integer
   *
   * @return missionsSucceeded
   **/
  @ApiModelProperty(value = "missions_succeeded integer")


  public Long getMissionsSucceeded() {
    return missionsSucceeded;
  }

  public void setMissionsSucceeded(Long missionsSucceeded) {
    this.missionsSucceeded = missionsSucceeded;
  }

  public GetCharactersCharacterIdStatsPve missionsSucceededEpicArc(Long missionsSucceededEpicArc) {
    this.missionsSucceededEpicArc = missionsSucceededEpicArc;
    return this;
  }

  /**
   * missions_succeeded_epic_arc integer
   *
   * @return missionsSucceededEpicArc
   **/
  @ApiModelProperty(value = "missions_succeeded_epic_arc integer")


  public Long getMissionsSucceededEpicArc() {
    return missionsSucceededEpicArc;
  }

  public void setMissionsSucceededEpicArc(Long missionsSucceededEpicArc) {
    this.missionsSucceededEpicArc = missionsSucceededEpicArc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdStatsPve getCharactersCharacterIdStatsPve = (GetCharactersCharacterIdStatsPve) o;
    return Objects.equals(this.dungeonsCompletedAgent, getCharactersCharacterIdStatsPve.dungeonsCompletedAgent) &&
        Objects.equals(this.dungeonsCompletedDistribution, getCharactersCharacterIdStatsPve.dungeonsCompletedDistribution) &&
        Objects.equals(this.missionsSucceeded, getCharactersCharacterIdStatsPve.missionsSucceeded) &&
        Objects.equals(this.missionsSucceededEpicArc, getCharactersCharacterIdStatsPve.missionsSucceededEpicArc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dungeonsCompletedAgent, dungeonsCompletedDistribution, missionsSucceeded, missionsSucceededEpicArc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdStatsPve {\n");

    sb.append("    dungeonsCompletedAgent: ").append(toIndentedString(dungeonsCompletedAgent)).append("\n");
    sb.append("    dungeonsCompletedDistribution: ").append(toIndentedString(dungeonsCompletedDistribution)).append("\n");
    sb.append("    missionsSucceeded: ").append(toIndentedString(missionsSucceeded)).append("\n");
    sb.append("    missionsSucceededEpicArc: ").append(toIndentedString(missionsSucceededEpicArc)).append("\n");
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

