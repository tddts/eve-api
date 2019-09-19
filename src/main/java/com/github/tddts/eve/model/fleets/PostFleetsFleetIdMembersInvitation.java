package com.github.tddts.eve.model.fleets;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * invitation object
 */
@ApiModel(description = "invitation object")
@Validated
public class PostFleetsFleetIdMembersInvitation {
  @JsonProperty("character_id")
  private Integer characterId = null;

  /**
   * If a character is invited with the `fleet_commander` role, neither `wing_id` or `squad_id` should be specified. If a character is invited with the `wing_commander` role, only `wing_id` should be specified. If a character is invited with the `squad_commander` role, both `wing_id` and `squad_id` should be specified. If a character is invited with the `squad_member` role, `wing_id` and `squad_id` should either both be specified or not specified at all. If they aren’t specified, the invited character will join any squad with available positions.
   */
  public enum RoleEnum {
    FLEET_COMMANDER("fleet_commander"),

    WING_COMMANDER("wing_commander"),

    SQUAD_COMMANDER("squad_commander"),

    SQUAD_MEMBER("squad_member");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoleEnum fromValue(String text) {
      for (RoleEnum b : RoleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("role")
  private RoleEnum role = null;

  @JsonProperty("squad_id")
  private Long squadId = null;

  @JsonProperty("wing_id")
  private Long wingId = null;

  public PostFleetsFleetIdMembersInvitation characterId(Integer characterId) {
    this.characterId = characterId;
    return this;
  }

  /**
   * The character you want to invite
   *
   * @return characterId
   **/
  @ApiModelProperty(required = true, value = "The character you want to invite")
  @NotNull


  public Integer getCharacterId() {
    return characterId;
  }

  public void setCharacterId(Integer characterId) {
    this.characterId = characterId;
  }

  public PostFleetsFleetIdMembersInvitation role(RoleEnum role) {
    this.role = role;
    return this;
  }

  /**
   * If a character is invited with the `fleet_commander` role, neither `wing_id` or `squad_id` should be specified. If a character is invited with the `wing_commander` role, only `wing_id` should be specified. If a character is invited with the `squad_commander` role, both `wing_id` and `squad_id` should be specified. If a character is invited with the `squad_member` role, `wing_id` and `squad_id` should either both be specified or not specified at all. If they aren’t specified, the invited character will join any squad with available positions.
   *
   * @return role
   **/
  @ApiModelProperty(required = true, value = "If a character is invited with the `fleet_commander` role, neither `wing_id` or `squad_id` should be specified. If a character is invited with the `wing_commander` role, only `wing_id` should be specified. If a character is invited with the `squad_commander` role, both `wing_id` and `squad_id` should be specified. If a character is invited with the `squad_member` role, `wing_id` and `squad_id` should either both be specified or not specified at all. If they aren’t specified, the invited character will join any squad with available positions.")
  @NotNull


  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public PostFleetsFleetIdMembersInvitation squadId(Long squadId) {
    this.squadId = squadId;
    return this;
  }

  /**
   * squad_id integer
   * minimum: 0
   *
   * @return squadId
   **/
  @ApiModelProperty(value = "squad_id integer")

  @Min(0L)
  public Long getSquadId() {
    return squadId;
  }

  public void setSquadId(Long squadId) {
    this.squadId = squadId;
  }

  public PostFleetsFleetIdMembersInvitation wingId(Long wingId) {
    this.wingId = wingId;
    return this;
  }

  /**
   * wing_id integer
   * minimum: 0
   *
   * @return wingId
   **/
  @ApiModelProperty(value = "wing_id integer")

  @Min(0L)
  public Long getWingId() {
    return wingId;
  }

  public void setWingId(Long wingId) {
    this.wingId = wingId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostFleetsFleetIdMembersInvitation postFleetsFleetIdMembersInvitation = (PostFleetsFleetIdMembersInvitation) o;
    return Objects.equals(this.characterId, postFleetsFleetIdMembersInvitation.characterId) &&
        Objects.equals(this.role, postFleetsFleetIdMembersInvitation.role) &&
        Objects.equals(this.squadId, postFleetsFleetIdMembersInvitation.squadId) &&
        Objects.equals(this.wingId, postFleetsFleetIdMembersInvitation.wingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characterId, role, squadId, wingId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostFleetsFleetIdMembersInvitation {\n");

    sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    squadId: ").append(toIndentedString(squadId)).append("\n");
    sb.append("    wingId: ").append(toIndentedString(wingId)).append("\n");
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

