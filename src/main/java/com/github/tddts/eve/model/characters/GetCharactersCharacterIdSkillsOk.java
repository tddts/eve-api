package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class GetCharactersCharacterIdSkillsOk {
  @JsonProperty("skills")
  @Valid
  private List<GetCharactersCharacterIdSkillsSkill> skills = new ArrayList<GetCharactersCharacterIdSkillsSkill>();

  @JsonProperty("total_sp")
  private Long totalSp = null;

  @JsonProperty("unallocated_sp")
  private Integer unallocatedSp = null;

  public GetCharactersCharacterIdSkillsOk skills(List<GetCharactersCharacterIdSkillsSkill> skills) {
    this.skills = skills;
    return this;
  }

  public GetCharactersCharacterIdSkillsOk addSkillsItem(GetCharactersCharacterIdSkillsSkill skillsItem) {
    this.skills.add(skillsItem);
    return this;
  }

  /**
   * skills array
   *
   * @return skills
   **/
  @ApiModelProperty(required = true, value = "skills array")
  @NotNull

  @Valid
  @Size(max = 1000)
  public List<GetCharactersCharacterIdSkillsSkill> getSkills() {
    return skills;
  }

  public void setSkills(List<GetCharactersCharacterIdSkillsSkill> skills) {
    this.skills = skills;
  }

  public GetCharactersCharacterIdSkillsOk totalSp(Long totalSp) {
    this.totalSp = totalSp;
    return this;
  }

  /**
   * total_sp integer
   *
   * @return totalSp
   **/
  @ApiModelProperty(required = true, value = "total_sp integer")
  @NotNull


  public Long getTotalSp() {
    return totalSp;
  }

  public void setTotalSp(Long totalSp) {
    this.totalSp = totalSp;
  }

  public GetCharactersCharacterIdSkillsOk unallocatedSp(Integer unallocatedSp) {
    this.unallocatedSp = unallocatedSp;
    return this;
  }

  /**
   * Skill points available to be assigned
   *
   * @return unallocatedSp
   **/
  @ApiModelProperty(value = "Skill points available to be assigned")


  public Integer getUnallocatedSp() {
    return unallocatedSp;
  }

  public void setUnallocatedSp(Integer unallocatedSp) {
    this.unallocatedSp = unallocatedSp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdSkillsOk getCharactersCharacterIdSkillsOk = (GetCharactersCharacterIdSkillsOk) o;
    return Objects.equals(this.skills, getCharactersCharacterIdSkillsOk.skills) &&
        Objects.equals(this.totalSp, getCharactersCharacterIdSkillsOk.totalSp) &&
        Objects.equals(this.unallocatedSp, getCharactersCharacterIdSkillsOk.unallocatedSp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skills, totalSp, unallocatedSp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdSkillsOk {\n");

    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
    sb.append("    totalSp: ").append(toIndentedString(totalSp)).append("\n");
    sb.append("    unallocatedSp: ").append(toIndentedString(unallocatedSp)).append("\n");
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

