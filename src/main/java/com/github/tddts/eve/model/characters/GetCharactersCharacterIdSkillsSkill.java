package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * skill object
 */
@ApiModel(description = "skill object")
@Validated
public class GetCharactersCharacterIdSkillsSkill {
  @JsonProperty("active_skill_level")
  private Integer activeSkillLevel = null;

  @JsonProperty("skill_id")
  private Integer skillId = null;

  @JsonProperty("skillpoints_in_skill")
  private Long skillpointsInSkill = null;

  @JsonProperty("trained_skill_level")
  private Integer trainedSkillLevel = null;

  public GetCharactersCharacterIdSkillsSkill activeSkillLevel(Integer activeSkillLevel) {
    this.activeSkillLevel = activeSkillLevel;
    return this;
  }

  /**
   * active_skill_level integer
   *
   * @return activeSkillLevel
   **/
  @ApiModelProperty(required = true, value = "active_skill_level integer")
  @NotNull


  public Integer getActiveSkillLevel() {
    return activeSkillLevel;
  }

  public void setActiveSkillLevel(Integer activeSkillLevel) {
    this.activeSkillLevel = activeSkillLevel;
  }

  public GetCharactersCharacterIdSkillsSkill skillId(Integer skillId) {
    this.skillId = skillId;
    return this;
  }

  /**
   * skill_id integer
   *
   * @return skillId
   **/
  @ApiModelProperty(required = true, value = "skill_id integer")
  @NotNull


  public Integer getSkillId() {
    return skillId;
  }

  public void setSkillId(Integer skillId) {
    this.skillId = skillId;
  }

  public GetCharactersCharacterIdSkillsSkill skillpointsInSkill(Long skillpointsInSkill) {
    this.skillpointsInSkill = skillpointsInSkill;
    return this;
  }

  /**
   * skillpoints_in_skill integer
   *
   * @return skillpointsInSkill
   **/
  @ApiModelProperty(required = true, value = "skillpoints_in_skill integer")
  @NotNull


  public Long getSkillpointsInSkill() {
    return skillpointsInSkill;
  }

  public void setSkillpointsInSkill(Long skillpointsInSkill) {
    this.skillpointsInSkill = skillpointsInSkill;
  }

  public GetCharactersCharacterIdSkillsSkill trainedSkillLevel(Integer trainedSkillLevel) {
    this.trainedSkillLevel = trainedSkillLevel;
    return this;
  }

  /**
   * trained_skill_level integer
   *
   * @return trainedSkillLevel
   **/
  @ApiModelProperty(required = true, value = "trained_skill_level integer")
  @NotNull


  public Integer getTrainedSkillLevel() {
    return trainedSkillLevel;
  }

  public void setTrainedSkillLevel(Integer trainedSkillLevel) {
    this.trainedSkillLevel = trainedSkillLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdSkillsSkill getCharactersCharacterIdSkillsSkill = (GetCharactersCharacterIdSkillsSkill) o;
    return Objects.equals(this.activeSkillLevel, getCharactersCharacterIdSkillsSkill.activeSkillLevel) &&
        Objects.equals(this.skillId, getCharactersCharacterIdSkillsSkill.skillId) &&
        Objects.equals(this.skillpointsInSkill, getCharactersCharacterIdSkillsSkill.skillpointsInSkill) &&
        Objects.equals(this.trainedSkillLevel, getCharactersCharacterIdSkillsSkill.trainedSkillLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeSkillLevel, skillId, skillpointsInSkill, trainedSkillLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdSkillsSkill {\n");

    sb.append("    activeSkillLevel: ").append(toIndentedString(activeSkillLevel)).append("\n");
    sb.append("    skillId: ").append(toIndentedString(skillId)).append("\n");
    sb.append("    skillpointsInSkill: ").append(toIndentedString(skillpointsInSkill)).append("\n");
    sb.append("    trainedSkillLevel: ").append(toIndentedString(trainedSkillLevel)).append("\n");
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

