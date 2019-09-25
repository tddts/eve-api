package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
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
public class GetCharactersCharacterIdRolesOk {
  /**
   * role string
   */
  public enum RolesEnum {
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

    RolesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RolesEnum fromValue(String text) {
      for (RolesEnum b : RolesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("roles")
  @Valid
  private List<RolesEnum> roles = null;

  /**
   * roles_at_base string
   */
  public enum RolesAtBaseEnum {
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

    RolesAtBaseEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RolesAtBaseEnum fromValue(String text) {
      for (RolesAtBaseEnum b : RolesAtBaseEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("roles_at_base")
  @Valid
  private List<RolesAtBaseEnum> rolesAtBase = null;

  /**
   * roles_at_hq string
   */
  public enum RolesAtHqEnum {
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

    RolesAtHqEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RolesAtHqEnum fromValue(String text) {
      for (RolesAtHqEnum b : RolesAtHqEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("roles_at_hq")
  @Valid
  private List<RolesAtHqEnum> rolesAtHq = null;

  /**
   * roles_at_other string
   */
  public enum RolesAtOtherEnum {
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

    RolesAtOtherEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RolesAtOtherEnum fromValue(String text) {
      for (RolesAtOtherEnum b : RolesAtOtherEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("roles_at_other")
  @Valid
  private List<RolesAtOtherEnum> rolesAtOther = null;

  public GetCharactersCharacterIdRolesOk roles(List<RolesEnum> roles) {
    this.roles = roles;
    return this;
  }

  public GetCharactersCharacterIdRolesOk addRolesItem(RolesEnum rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<RolesEnum>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * roles array
   *
   * @return roles
   **/
  @ApiModelProperty(value = "roles array")

  @Size(max = 50)
  public List<RolesEnum> getRoles() {
    return roles;
  }

  public void setRoles(List<RolesEnum> roles) {
    this.roles = roles;
  }

  public GetCharactersCharacterIdRolesOk rolesAtBase(List<RolesAtBaseEnum> rolesAtBase) {
    this.rolesAtBase = rolesAtBase;
    return this;
  }

  public GetCharactersCharacterIdRolesOk addRolesAtBaseItem(RolesAtBaseEnum rolesAtBaseItem) {
    if (this.rolesAtBase == null) {
      this.rolesAtBase = new ArrayList<RolesAtBaseEnum>();
    }
    this.rolesAtBase.add(rolesAtBaseItem);
    return this;
  }

  /**
   * roles_at_base array
   *
   * @return rolesAtBase
   **/
  @ApiModelProperty(value = "roles_at_base array")

  @Size(max = 50)
  public List<RolesAtBaseEnum> getRolesAtBase() {
    return rolesAtBase;
  }

  public void setRolesAtBase(List<RolesAtBaseEnum> rolesAtBase) {
    this.rolesAtBase = rolesAtBase;
  }

  public GetCharactersCharacterIdRolesOk rolesAtHq(List<RolesAtHqEnum> rolesAtHq) {
    this.rolesAtHq = rolesAtHq;
    return this;
  }

  public GetCharactersCharacterIdRolesOk addRolesAtHqItem(RolesAtHqEnum rolesAtHqItem) {
    if (this.rolesAtHq == null) {
      this.rolesAtHq = new ArrayList<RolesAtHqEnum>();
    }
    this.rolesAtHq.add(rolesAtHqItem);
    return this;
  }

  /**
   * roles_at_hq array
   *
   * @return rolesAtHq
   **/
  @ApiModelProperty(value = "roles_at_hq array")

  @Size(max = 50)
  public List<RolesAtHqEnum> getRolesAtHq() {
    return rolesAtHq;
  }

  public void setRolesAtHq(List<RolesAtHqEnum> rolesAtHq) {
    this.rolesAtHq = rolesAtHq;
  }

  public GetCharactersCharacterIdRolesOk rolesAtOther(List<RolesAtOtherEnum> rolesAtOther) {
    this.rolesAtOther = rolesAtOther;
    return this;
  }

  public GetCharactersCharacterIdRolesOk addRolesAtOtherItem(RolesAtOtherEnum rolesAtOtherItem) {
    if (this.rolesAtOther == null) {
      this.rolesAtOther = new ArrayList<RolesAtOtherEnum>();
    }
    this.rolesAtOther.add(rolesAtOtherItem);
    return this;
  }

  /**
   * roles_at_other array
   *
   * @return rolesAtOther
   **/
  @ApiModelProperty(value = "roles_at_other array")

  @Size(max = 50)
  public List<RolesAtOtherEnum> getRolesAtOther() {
    return rolesAtOther;
  }

  public void setRolesAtOther(List<RolesAtOtherEnum> rolesAtOther) {
    this.rolesAtOther = rolesAtOther;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdRolesOk getCharactersCharacterIdRolesOk = (GetCharactersCharacterIdRolesOk) o;
    return Objects.equals(this.roles, getCharactersCharacterIdRolesOk.roles) &&
        Objects.equals(this.rolesAtBase, getCharactersCharacterIdRolesOk.rolesAtBase) &&
        Objects.equals(this.rolesAtHq, getCharactersCharacterIdRolesOk.rolesAtHq) &&
        Objects.equals(this.rolesAtOther, getCharactersCharacterIdRolesOk.rolesAtOther);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roles, rolesAtBase, rolesAtHq, rolesAtOther);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdRolesOk {\n");

    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    rolesAtBase: ").append(toIndentedString(rolesAtBase)).append("\n");
    sb.append("    rolesAtHq: ").append(toIndentedString(rolesAtHq)).append("\n");
    sb.append("    rolesAtOther: ").append(toIndentedString(rolesAtOther)).append("\n");
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

