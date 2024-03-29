package com.github.tddts.eve.model.corporations;

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
public class GetCorporationsCorporationIdTitles200Ok {
  /**
   * grantable_role string
   */
  public enum GrantableRolesEnum {
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

    GrantableRolesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GrantableRolesEnum fromValue(String text) {
      for (GrantableRolesEnum b : GrantableRolesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("grantable_roles")
  @Valid
  private List<GrantableRolesEnum> grantableRoles = null;

  /**
   * grantable_roles_at_base string
   */
  public enum GrantableRolesAtBaseEnum {
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

    GrantableRolesAtBaseEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GrantableRolesAtBaseEnum fromValue(String text) {
      for (GrantableRolesAtBaseEnum b : GrantableRolesAtBaseEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("grantable_roles_at_base")
  @Valid
  private List<GrantableRolesAtBaseEnum> grantableRolesAtBase = null;

  /**
   * grantable_roles_at_hq string
   */
  public enum GrantableRolesAtHqEnum {
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

    GrantableRolesAtHqEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GrantableRolesAtHqEnum fromValue(String text) {
      for (GrantableRolesAtHqEnum b : GrantableRolesAtHqEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("grantable_roles_at_hq")
  @Valid
  private List<GrantableRolesAtHqEnum> grantableRolesAtHq = null;

  /**
   * grantable_roles_at_other string
   */
  public enum GrantableRolesAtOtherEnum {
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

    GrantableRolesAtOtherEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GrantableRolesAtOtherEnum fromValue(String text) {
      for (GrantableRolesAtOtherEnum b : GrantableRolesAtOtherEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("grantable_roles_at_other")
  @Valid
  private List<GrantableRolesAtOtherEnum> grantableRolesAtOther = null;

  @JsonProperty("name")
  private String name = null;

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

  @JsonProperty("title_id")
  private Integer titleId = null;

  public GetCorporationsCorporationIdTitles200Ok grantableRoles(List<GrantableRolesEnum> grantableRoles) {
    this.grantableRoles = grantableRoles;
    return this;
  }

  public GetCorporationsCorporationIdTitles200Ok addGrantableRolesItem(GrantableRolesEnum grantableRolesItem) {
    if (this.grantableRoles == null) {
      this.grantableRoles = new ArrayList<GrantableRolesEnum>();
    }
    this.grantableRoles.add(grantableRolesItem);
    return this;
  }

  /**
   * grantable_roles array
   *
   * @return grantableRoles
   **/
  @ApiModelProperty(value = "grantable_roles array")

  @Size(max = 50)
  public List<GrantableRolesEnum> getGrantableRoles() {
    return grantableRoles;
  }

  public void setGrantableRoles(List<GrantableRolesEnum> grantableRoles) {
    this.grantableRoles = grantableRoles;
  }

  public GetCorporationsCorporationIdTitles200Ok grantableRolesAtBase(List<GrantableRolesAtBaseEnum> grantableRolesAtBase) {
    this.grantableRolesAtBase = grantableRolesAtBase;
    return this;
  }

  public GetCorporationsCorporationIdTitles200Ok addGrantableRolesAtBaseItem(GrantableRolesAtBaseEnum grantableRolesAtBaseItem) {
    if (this.grantableRolesAtBase == null) {
      this.grantableRolesAtBase = new ArrayList<GrantableRolesAtBaseEnum>();
    }
    this.grantableRolesAtBase.add(grantableRolesAtBaseItem);
    return this;
  }

  /**
   * grantable_roles_at_base array
   *
   * @return grantableRolesAtBase
   **/
  @ApiModelProperty(value = "grantable_roles_at_base array")

  @Size(max = 50)
  public List<GrantableRolesAtBaseEnum> getGrantableRolesAtBase() {
    return grantableRolesAtBase;
  }

  public void setGrantableRolesAtBase(List<GrantableRolesAtBaseEnum> grantableRolesAtBase) {
    this.grantableRolesAtBase = grantableRolesAtBase;
  }

  public GetCorporationsCorporationIdTitles200Ok grantableRolesAtHq(List<GrantableRolesAtHqEnum> grantableRolesAtHq) {
    this.grantableRolesAtHq = grantableRolesAtHq;
    return this;
  }

  public GetCorporationsCorporationIdTitles200Ok addGrantableRolesAtHqItem(GrantableRolesAtHqEnum grantableRolesAtHqItem) {
    if (this.grantableRolesAtHq == null) {
      this.grantableRolesAtHq = new ArrayList<GrantableRolesAtHqEnum>();
    }
    this.grantableRolesAtHq.add(grantableRolesAtHqItem);
    return this;
  }

  /**
   * grantable_roles_at_hq array
   *
   * @return grantableRolesAtHq
   **/
  @ApiModelProperty(value = "grantable_roles_at_hq array")

  @Size(max = 50)
  public List<GrantableRolesAtHqEnum> getGrantableRolesAtHq() {
    return grantableRolesAtHq;
  }

  public void setGrantableRolesAtHq(List<GrantableRolesAtHqEnum> grantableRolesAtHq) {
    this.grantableRolesAtHq = grantableRolesAtHq;
  }

  public GetCorporationsCorporationIdTitles200Ok grantableRolesAtOther(List<GrantableRolesAtOtherEnum> grantableRolesAtOther) {
    this.grantableRolesAtOther = grantableRolesAtOther;
    return this;
  }

  public GetCorporationsCorporationIdTitles200Ok addGrantableRolesAtOtherItem(GrantableRolesAtOtherEnum grantableRolesAtOtherItem) {
    if (this.grantableRolesAtOther == null) {
      this.grantableRolesAtOther = new ArrayList<GrantableRolesAtOtherEnum>();
    }
    this.grantableRolesAtOther.add(grantableRolesAtOtherItem);
    return this;
  }

  /**
   * grantable_roles_at_other array
   *
   * @return grantableRolesAtOther
   **/
  @ApiModelProperty(value = "grantable_roles_at_other array")

  @Size(max = 50)
  public List<GrantableRolesAtOtherEnum> getGrantableRolesAtOther() {
    return grantableRolesAtOther;
  }

  public void setGrantableRolesAtOther(List<GrantableRolesAtOtherEnum> grantableRolesAtOther) {
    this.grantableRolesAtOther = grantableRolesAtOther;
  }

  public GetCorporationsCorporationIdTitles200Ok name(String name) {
    this.name = name;
    return this;
  }

  /**
   * name string
   *
   * @return name
   **/
  @ApiModelProperty(value = "name string")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetCorporationsCorporationIdTitles200Ok roles(List<RolesEnum> roles) {
    this.roles = roles;
    return this;
  }

  public GetCorporationsCorporationIdTitles200Ok addRolesItem(RolesEnum rolesItem) {
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

  public GetCorporationsCorporationIdTitles200Ok rolesAtBase(List<RolesAtBaseEnum> rolesAtBase) {
    this.rolesAtBase = rolesAtBase;
    return this;
  }

  public GetCorporationsCorporationIdTitles200Ok addRolesAtBaseItem(RolesAtBaseEnum rolesAtBaseItem) {
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

  public GetCorporationsCorporationIdTitles200Ok rolesAtHq(List<RolesAtHqEnum> rolesAtHq) {
    this.rolesAtHq = rolesAtHq;
    return this;
  }

  public GetCorporationsCorporationIdTitles200Ok addRolesAtHqItem(RolesAtHqEnum rolesAtHqItem) {
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

  public GetCorporationsCorporationIdTitles200Ok rolesAtOther(List<RolesAtOtherEnum> rolesAtOther) {
    this.rolesAtOther = rolesAtOther;
    return this;
  }

  public GetCorporationsCorporationIdTitles200Ok addRolesAtOtherItem(RolesAtOtherEnum rolesAtOtherItem) {
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

  public GetCorporationsCorporationIdTitles200Ok titleId(Integer titleId) {
    this.titleId = titleId;
    return this;
  }

  /**
   * title_id integer
   *
   * @return titleId
   **/
  @ApiModelProperty(value = "title_id integer")


  public Integer getTitleId() {
    return titleId;
  }

  public void setTitleId(Integer titleId) {
    this.titleId = titleId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdTitles200Ok getCorporationsCorporationIdTitles200Ok = (GetCorporationsCorporationIdTitles200Ok) o;
    return Objects.equals(this.grantableRoles, getCorporationsCorporationIdTitles200Ok.grantableRoles) &&
        Objects.equals(this.grantableRolesAtBase, getCorporationsCorporationIdTitles200Ok.grantableRolesAtBase) &&
        Objects.equals(this.grantableRolesAtHq, getCorporationsCorporationIdTitles200Ok.grantableRolesAtHq) &&
        Objects.equals(this.grantableRolesAtOther, getCorporationsCorporationIdTitles200Ok.grantableRolesAtOther) &&
        Objects.equals(this.name, getCorporationsCorporationIdTitles200Ok.name) &&
        Objects.equals(this.roles, getCorporationsCorporationIdTitles200Ok.roles) &&
        Objects.equals(this.rolesAtBase, getCorporationsCorporationIdTitles200Ok.rolesAtBase) &&
        Objects.equals(this.rolesAtHq, getCorporationsCorporationIdTitles200Ok.rolesAtHq) &&
        Objects.equals(this.rolesAtOther, getCorporationsCorporationIdTitles200Ok.rolesAtOther) &&
        Objects.equals(this.titleId, getCorporationsCorporationIdTitles200Ok.titleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grantableRoles, grantableRolesAtBase, grantableRolesAtHq, grantableRolesAtOther, name, roles, rolesAtBase, rolesAtHq, rolesAtOther, titleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdTitles200Ok {\n");

    sb.append("    grantableRoles: ").append(toIndentedString(grantableRoles)).append("\n");
    sb.append("    grantableRolesAtBase: ").append(toIndentedString(grantableRolesAtBase)).append("\n");
    sb.append("    grantableRolesAtHq: ").append(toIndentedString(grantableRolesAtHq)).append("\n");
    sb.append("    grantableRolesAtOther: ").append(toIndentedString(grantableRolesAtOther)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    rolesAtBase: ").append(toIndentedString(rolesAtBase)).append("\n");
    sb.append("    rolesAtHq: ").append(toIndentedString(rolesAtHq)).append("\n");
    sb.append("    rolesAtOther: ").append(toIndentedString(rolesAtOther)).append("\n");
    sb.append("    titleId: ").append(toIndentedString(titleId)).append("\n");
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

