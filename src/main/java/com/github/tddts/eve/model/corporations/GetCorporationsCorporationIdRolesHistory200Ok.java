package com.github.tddts.eve.model.corporations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

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
public class GetCorporationsCorporationIdRolesHistory200Ok {
  @JsonProperty("changed_at")
  private OffsetDateTime changedAt = null;

  @JsonProperty("character_id")
  private Integer characterId = null;

  @JsonProperty("issuer_id")
  private Integer issuerId = null;

  /**
   * new_role string
   */
  public enum NewRolesEnum {
    ACCOUNT_TAKE_1("Account_Take_1"),

    ACCOUNT_TAKE_2("Account_Take_2"),

    ACCOUNT_TAKE_3("Account_Take_3"),

    ACCOUNT_TAKE_4("Account_Take_4"),

    ACCOUNT_TAKE_5("Account_Take_5"),

    ACCOUNT_TAKE_6("Account_Take_6"),

    ACCOUNT_TAKE_7("Account_Take_7"),

    ACCOUNTANT("Accountant"),

    AUDITOR("Auditor"),

    COMMUNICATIONS_OFFICER("Communications_Officer"),

    CONFIG_EQUIPMENT("Config_Equipment"),

    CONFIG_STARBASE_EQUIPMENT("Config_Starbase_Equipment"),

    CONTAINER_TAKE_1("Container_Take_1"),

    CONTAINER_TAKE_2("Container_Take_2"),

    CONTAINER_TAKE_3("Container_Take_3"),

    CONTAINER_TAKE_4("Container_Take_4"),

    CONTAINER_TAKE_5("Container_Take_5"),

    CONTAINER_TAKE_6("Container_Take_6"),

    CONTAINER_TAKE_7("Container_Take_7"),

    CONTRACT_MANAGER("Contract_Manager"),

    DIPLOMAT("Diplomat"),

    DIRECTOR("Director"),

    FACTORY_MANAGER("Factory_Manager"),

    FITTING_MANAGER("Fitting_Manager"),

    HANGAR_QUERY_1("Hangar_Query_1"),

    HANGAR_QUERY_2("Hangar_Query_2"),

    HANGAR_QUERY_3("Hangar_Query_3"),

    HANGAR_QUERY_4("Hangar_Query_4"),

    HANGAR_QUERY_5("Hangar_Query_5"),

    HANGAR_QUERY_6("Hangar_Query_6"),

    HANGAR_QUERY_7("Hangar_Query_7"),

    HANGAR_TAKE_1("Hangar_Take_1"),

    HANGAR_TAKE_2("Hangar_Take_2"),

    HANGAR_TAKE_3("Hangar_Take_3"),

    HANGAR_TAKE_4("Hangar_Take_4"),

    HANGAR_TAKE_5("Hangar_Take_5"),

    HANGAR_TAKE_6("Hangar_Take_6"),

    HANGAR_TAKE_7("Hangar_Take_7"),

    JUNIOR_ACCOUNTANT("Junior_Accountant"),

    PERSONNEL_MANAGER("Personnel_Manager"),

    RENT_FACTORY_FACILITY("Rent_Factory_Facility"),

    RENT_OFFICE("Rent_Office"),

    RENT_RESEARCH_FACILITY("Rent_Research_Facility"),

    SECURITY_OFFICER("Security_Officer"),

    STARBASE_DEFENSE_OPERATOR("Starbase_Defense_Operator"),

    STARBASE_FUEL_TECHNICIAN("Starbase_Fuel_Technician"),

    STATION_MANAGER("Station_Manager"),

    TRADER("Trader");

    private String value;

    NewRolesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NewRolesEnum fromValue(String text) {
      for (NewRolesEnum b : NewRolesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("new_roles")
  @Valid
  private List<NewRolesEnum> newRoles = new ArrayList<NewRolesEnum>();

  /**
   * old_role string
   */
  public enum OldRolesEnum {
    ACCOUNT_TAKE_1("Account_Take_1"),

    ACCOUNT_TAKE_2("Account_Take_2"),

    ACCOUNT_TAKE_3("Account_Take_3"),

    ACCOUNT_TAKE_4("Account_Take_4"),

    ACCOUNT_TAKE_5("Account_Take_5"),

    ACCOUNT_TAKE_6("Account_Take_6"),

    ACCOUNT_TAKE_7("Account_Take_7"),

    ACCOUNTANT("Accountant"),

    AUDITOR("Auditor"),

    COMMUNICATIONS_OFFICER("Communications_Officer"),

    CONFIG_EQUIPMENT("Config_Equipment"),

    CONFIG_STARBASE_EQUIPMENT("Config_Starbase_Equipment"),

    CONTAINER_TAKE_1("Container_Take_1"),

    CONTAINER_TAKE_2("Container_Take_2"),

    CONTAINER_TAKE_3("Container_Take_3"),

    CONTAINER_TAKE_4("Container_Take_4"),

    CONTAINER_TAKE_5("Container_Take_5"),

    CONTAINER_TAKE_6("Container_Take_6"),

    CONTAINER_TAKE_7("Container_Take_7"),

    CONTRACT_MANAGER("Contract_Manager"),

    DIPLOMAT("Diplomat"),

    DIRECTOR("Director"),

    FACTORY_MANAGER("Factory_Manager"),

    FITTING_MANAGER("Fitting_Manager"),

    HANGAR_QUERY_1("Hangar_Query_1"),

    HANGAR_QUERY_2("Hangar_Query_2"),

    HANGAR_QUERY_3("Hangar_Query_3"),

    HANGAR_QUERY_4("Hangar_Query_4"),

    HANGAR_QUERY_5("Hangar_Query_5"),

    HANGAR_QUERY_6("Hangar_Query_6"),

    HANGAR_QUERY_7("Hangar_Query_7"),

    HANGAR_TAKE_1("Hangar_Take_1"),

    HANGAR_TAKE_2("Hangar_Take_2"),

    HANGAR_TAKE_3("Hangar_Take_3"),

    HANGAR_TAKE_4("Hangar_Take_4"),

    HANGAR_TAKE_5("Hangar_Take_5"),

    HANGAR_TAKE_6("Hangar_Take_6"),

    HANGAR_TAKE_7("Hangar_Take_7"),

    JUNIOR_ACCOUNTANT("Junior_Accountant"),

    PERSONNEL_MANAGER("Personnel_Manager"),

    RENT_FACTORY_FACILITY("Rent_Factory_Facility"),

    RENT_OFFICE("Rent_Office"),

    RENT_RESEARCH_FACILITY("Rent_Research_Facility"),

    SECURITY_OFFICER("Security_Officer"),

    STARBASE_DEFENSE_OPERATOR("Starbase_Defense_Operator"),

    STARBASE_FUEL_TECHNICIAN("Starbase_Fuel_Technician"),

    STATION_MANAGER("Station_Manager"),

    TRADER("Trader");

    private String value;

    OldRolesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OldRolesEnum fromValue(String text) {
      for (OldRolesEnum b : OldRolesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("old_roles")
  @Valid
  private List<OldRolesEnum> oldRoles = new ArrayList<OldRolesEnum>();

  /**
   * role_type string
   */
  public enum RoleTypeEnum {
    GRANTABLE_ROLES("grantable_roles"),

    GRANTABLE_ROLES_AT_BASE("grantable_roles_at_base"),

    GRANTABLE_ROLES_AT_HQ("grantable_roles_at_hq"),

    GRANTABLE_ROLES_AT_OTHER("grantable_roles_at_other"),

    ROLES("roles"),

    ROLES_AT_BASE("roles_at_base"),

    ROLES_AT_HQ("roles_at_hq"),

    ROLES_AT_OTHER("roles_at_other");

    private String value;

    RoleTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoleTypeEnum fromValue(String text) {
      for (RoleTypeEnum b : RoleTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("role_type")
  private RoleTypeEnum roleType = null;

  public GetCorporationsCorporationIdRolesHistory200Ok changedAt(OffsetDateTime changedAt) {
    this.changedAt = changedAt;
    return this;
  }

  /**
   * changed_at string
   *
   * @return changedAt
   **/
  @ApiModelProperty(required = true, value = "changed_at string")
  @NotNull

  @Valid

  public OffsetDateTime getChangedAt() {
    return changedAt;
  }

  public void setChangedAt(OffsetDateTime changedAt) {
    this.changedAt = changedAt;
  }

  public GetCorporationsCorporationIdRolesHistory200Ok characterId(Integer characterId) {
    this.characterId = characterId;
    return this;
  }

  /**
   * The character whose roles are changed
   *
   * @return characterId
   **/
  @ApiModelProperty(required = true, value = "The character whose roles are changed")
  @NotNull


  public Integer getCharacterId() {
    return characterId;
  }

  public void setCharacterId(Integer characterId) {
    this.characterId = characterId;
  }

  public GetCorporationsCorporationIdRolesHistory200Ok issuerId(Integer issuerId) {
    this.issuerId = issuerId;
    return this;
  }

  /**
   * ID of the character who issued this change
   *
   * @return issuerId
   **/
  @ApiModelProperty(required = true, value = "ID of the character who issued this change")
  @NotNull


  public Integer getIssuerId() {
    return issuerId;
  }

  public void setIssuerId(Integer issuerId) {
    this.issuerId = issuerId;
  }

  public GetCorporationsCorporationIdRolesHistory200Ok newRoles(List<NewRolesEnum> newRoles) {
    this.newRoles = newRoles;
    return this;
  }

  public GetCorporationsCorporationIdRolesHistory200Ok addNewRolesItem(NewRolesEnum newRolesItem) {
    this.newRoles.add(newRolesItem);
    return this;
  }

  /**
   * new_roles array
   *
   * @return newRoles
   **/
  @ApiModelProperty(required = true, value = "new_roles array")
  @NotNull

  @Size(max = 50)
  public List<NewRolesEnum> getNewRoles() {
    return newRoles;
  }

  public void setNewRoles(List<NewRolesEnum> newRoles) {
    this.newRoles = newRoles;
  }

  public GetCorporationsCorporationIdRolesHistory200Ok oldRoles(List<OldRolesEnum> oldRoles) {
    this.oldRoles = oldRoles;
    return this;
  }

  public GetCorporationsCorporationIdRolesHistory200Ok addOldRolesItem(OldRolesEnum oldRolesItem) {
    this.oldRoles.add(oldRolesItem);
    return this;
  }

  /**
   * old_roles array
   *
   * @return oldRoles
   **/
  @ApiModelProperty(required = true, value = "old_roles array")
  @NotNull

  @Size(max = 50)
  public List<OldRolesEnum> getOldRoles() {
    return oldRoles;
  }

  public void setOldRoles(List<OldRolesEnum> oldRoles) {
    this.oldRoles = oldRoles;
  }

  public GetCorporationsCorporationIdRolesHistory200Ok roleType(RoleTypeEnum roleType) {
    this.roleType = roleType;
    return this;
  }

  /**
   * role_type string
   *
   * @return roleType
   **/
  @ApiModelProperty(required = true, value = "role_type string")
  @NotNull


  public RoleTypeEnum getRoleType() {
    return roleType;
  }

  public void setRoleType(RoleTypeEnum roleType) {
    this.roleType = roleType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdRolesHistory200Ok getCorporationsCorporationIdRolesHistory200Ok = (GetCorporationsCorporationIdRolesHistory200Ok) o;
    return Objects.equals(this.changedAt, getCorporationsCorporationIdRolesHistory200Ok.changedAt) &&
        Objects.equals(this.characterId, getCorporationsCorporationIdRolesHistory200Ok.characterId) &&
        Objects.equals(this.issuerId, getCorporationsCorporationIdRolesHistory200Ok.issuerId) &&
        Objects.equals(this.newRoles, getCorporationsCorporationIdRolesHistory200Ok.newRoles) &&
        Objects.equals(this.oldRoles, getCorporationsCorporationIdRolesHistory200Ok.oldRoles) &&
        Objects.equals(this.roleType, getCorporationsCorporationIdRolesHistory200Ok.roleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changedAt, characterId, issuerId, newRoles, oldRoles, roleType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdRolesHistory200Ok {\n");

    sb.append("    changedAt: ").append(toIndentedString(changedAt)).append("\n");
    sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
    sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
    sb.append("    newRoles: ").append(toIndentedString(newRoles)).append("\n");
    sb.append("    oldRoles: ").append(toIndentedString(oldRoles)).append("\n");
    sb.append("    roleType: ").append(toIndentedString(roleType)).append("\n");
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

