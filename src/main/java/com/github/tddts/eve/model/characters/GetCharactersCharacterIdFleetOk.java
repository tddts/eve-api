package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
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
public class GetCharactersCharacterIdFleetOk {
  @JsonProperty("fleet_id")
  private Long fleetId = null;

  /**
   * Member’s role in fleet
   */
  public enum RoleEnum {
    FLEET_COMMANDER("fleet_commander"),

    SQUAD_COMMANDER("squad_commander"),

    SQUAD_MEMBER("squad_member"),

    WING_COMMANDER("wing_commander");

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

  public GetCharactersCharacterIdFleetOk fleetId(Long fleetId) {
    this.fleetId = fleetId;
    return this;
  }

  /**
   * The character's current fleet ID
   *
   * @return fleetId
   **/
  @ApiModelProperty(required = true, value = "The character's current fleet ID")
  @NotNull


  public Long getFleetId() {
    return fleetId;
  }

  public void setFleetId(Long fleetId) {
    this.fleetId = fleetId;
  }

  public GetCharactersCharacterIdFleetOk role(RoleEnum role) {
    this.role = role;
    return this;
  }

  /**
   * Member’s role in fleet
   *
   * @return role
   **/
  @ApiModelProperty(required = true, value = "Member’s role in fleet")
  @NotNull


  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public GetCharactersCharacterIdFleetOk squadId(Long squadId) {
    this.squadId = squadId;
    return this;
  }

  /**
   * ID of the squad the member is in. If not applicable, will be set to -1
   *
   * @return squadId
   **/
  @ApiModelProperty(required = true, value = "ID of the squad the member is in. If not applicable, will be set to -1")
  @NotNull


  public Long getSquadId() {
    return squadId;
  }

  public void setSquadId(Long squadId) {
    this.squadId = squadId;
  }

  public GetCharactersCharacterIdFleetOk wingId(Long wingId) {
    this.wingId = wingId;
    return this;
  }

  /**
   * ID of the wing the member is in. If not applicable, will be set to -1
   *
   * @return wingId
   **/
  @ApiModelProperty(required = true, value = "ID of the wing the member is in. If not applicable, will be set to -1")
  @NotNull


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
    GetCharactersCharacterIdFleetOk getCharactersCharacterIdFleetOk = (GetCharactersCharacterIdFleetOk) o;
    return Objects.equals(this.fleetId, getCharactersCharacterIdFleetOk.fleetId) &&
        Objects.equals(this.role, getCharactersCharacterIdFleetOk.role) &&
        Objects.equals(this.squadId, getCharactersCharacterIdFleetOk.squadId) &&
        Objects.equals(this.wingId, getCharactersCharacterIdFleetOk.wingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fleetId, role, squadId, wingId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdFleetOk {\n");

    sb.append("    fleetId: ").append(toIndentedString(fleetId)).append("\n");
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

