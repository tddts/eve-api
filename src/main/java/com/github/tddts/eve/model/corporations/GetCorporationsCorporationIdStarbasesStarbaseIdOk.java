package com.github.tddts.eve.model.corporations;

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
public class GetCorporationsCorporationIdStarbasesStarbaseIdOk {
  @JsonProperty("allow_alliance_members")
  private Boolean allowAllianceMembers = null;

  @JsonProperty("allow_corporation_members")
  private Boolean allowCorporationMembers = null;

  /**
   * Who can anchor starbase (POS) and its structures
   */
  public enum AnchorEnum {
    ALLIANCE_MEMBER("alliance_member"),

    CONFIG_STARBASE_EQUIPMENT_ROLE("config_starbase_equipment_role"),

    CORPORATION_MEMBER("corporation_member"),

    STARBASE_FUEL_TECHNICIAN_ROLE("starbase_fuel_technician_role");

    private String value;

    AnchorEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AnchorEnum fromValue(String text) {
      for (AnchorEnum b : AnchorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("anchor")
  private AnchorEnum anchor = null;

  @JsonProperty("attack_if_at_war")
  private Boolean attackIfAtWar = null;

  @JsonProperty("attack_if_other_security_status_dropping")
  private Boolean attackIfOtherSecurityStatusDropping = null;

  @JsonProperty("attack_security_status_threshold")
  private Float attackSecurityStatusThreshold = null;

  @JsonProperty("attack_standing_threshold")
  private Float attackStandingThreshold = null;

  /**
   * Who can take fuel blocks out of the starbase (POS)'s fuel bay
   */
  public enum FuelBayTakeEnum {
    ALLIANCE_MEMBER("alliance_member"),

    CONFIG_STARBASE_EQUIPMENT_ROLE("config_starbase_equipment_role"),

    CORPORATION_MEMBER("corporation_member"),

    STARBASE_FUEL_TECHNICIAN_ROLE("starbase_fuel_technician_role");

    private String value;

    FuelBayTakeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FuelBayTakeEnum fromValue(String text) {
      for (FuelBayTakeEnum b : FuelBayTakeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("fuel_bay_take")
  private FuelBayTakeEnum fuelBayTake = null;

  /**
   * Who can view the starbase (POS)'s fule bay. Characters either need to have required role or belong to the starbase (POS) owner's corporation or alliance, as described by the enum, all other access settings follows the same scheme
   */
  public enum FuelBayViewEnum {
    ALLIANCE_MEMBER("alliance_member"),

    CONFIG_STARBASE_EQUIPMENT_ROLE("config_starbase_equipment_role"),

    CORPORATION_MEMBER("corporation_member"),

    STARBASE_FUEL_TECHNICIAN_ROLE("starbase_fuel_technician_role");

    private String value;

    FuelBayViewEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FuelBayViewEnum fromValue(String text) {
      for (FuelBayViewEnum b : FuelBayViewEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("fuel_bay_view")
  private FuelBayViewEnum fuelBayView = null;

  @JsonProperty("fuels")
  @Valid
  private List<GetCorporationsCorporationIdStarbasesStarbaseIdFuel> fuels = null;

  /**
   * Who can offline starbase (POS) and its structures
   */
  public enum OfflineEnum {
    ALLIANCE_MEMBER("alliance_member"),

    CONFIG_STARBASE_EQUIPMENT_ROLE("config_starbase_equipment_role"),

    CORPORATION_MEMBER("corporation_member"),

    STARBASE_FUEL_TECHNICIAN_ROLE("starbase_fuel_technician_role");

    private String value;

    OfflineEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OfflineEnum fromValue(String text) {
      for (OfflineEnum b : OfflineEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("offline")
  private OfflineEnum offline = null;

  /**
   * Who can online starbase (POS) and its structures
   */
  public enum OnlineEnum {
    ALLIANCE_MEMBER("alliance_member"),

    CONFIG_STARBASE_EQUIPMENT_ROLE("config_starbase_equipment_role"),

    CORPORATION_MEMBER("corporation_member"),

    STARBASE_FUEL_TECHNICIAN_ROLE("starbase_fuel_technician_role");

    private String value;

    OnlineEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OnlineEnum fromValue(String text) {
      for (OnlineEnum b : OnlineEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("online")
  private OnlineEnum online = null;

  /**
   * Who can unanchor starbase (POS) and its structures
   */
  public enum UnanchorEnum {
    ALLIANCE_MEMBER("alliance_member"),

    CONFIG_STARBASE_EQUIPMENT_ROLE("config_starbase_equipment_role"),

    CORPORATION_MEMBER("corporation_member"),

    STARBASE_FUEL_TECHNICIAN_ROLE("starbase_fuel_technician_role");

    private String value;

    UnanchorEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static UnanchorEnum fromValue(String text) {
      for (UnanchorEnum b : UnanchorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("unanchor")
  private UnanchorEnum unanchor = null;

  @JsonProperty("use_alliance_standings")
  private Boolean useAllianceStandings = null;

  public GetCorporationsCorporationIdStarbasesStarbaseIdOk allowAllianceMembers(Boolean allowAllianceMembers) {
    this.allowAllianceMembers = allowAllianceMembers;
    return this;
  }

  /**
   * allow_alliance_members boolean
   *
   * @return allowAllianceMembers
   **/
  @ApiModelProperty(required = true, value = "allow_alliance_members boolean")
  @NotNull


  public Boolean isAllowAllianceMembers() {
    return allowAllianceMembers;
  }

  public void setAllowAllianceMembers(Boolean allowAllianceMembers) {
    this.allowAllianceMembers = allowAllianceMembers;
  }

  public GetCorporationsCorporationIdStarbasesStarbaseIdOk allowCorporationMembers(Boolean allowCorporationMembers) {
    this.allowCorporationMembers = allowCorporationMembers;
    return this;
  }

  /**
   * allow_corporation_members boolean
   *
   * @return allowCorporationMembers
   **/
  @ApiModelProperty(required = true, value = "allow_corporation_members boolean")
  @NotNull


  public Boolean isAllowCorporationMembers() {
    return allowCorporationMembers;
  }

  public void setAllowCorporationMembers(Boolean allowCorporationMembers) {
    this.allowCorporationMembers = allowCorporationMembers;
  }

  public GetCorporationsCorporationIdStarbasesStarbaseIdOk anchor(AnchorEnum anchor) {
    this.anchor = anchor;
    return this;
  }

  /**
   * Who can anchor starbase (POS) and its structures
   *
   * @return anchor
   **/
  @ApiModelProperty(required = true, value = "Who can anchor starbase (POS) and its structures")
  @NotNull


  public AnchorEnum getAnchor() {
    return anchor;
  }

  public void setAnchor(AnchorEnum anchor) {
    this.anchor = anchor;
  }

  public GetCorporationsCorporationIdStarbasesStarbaseIdOk attackIfAtWar(Boolean attackIfAtWar) {
    this.attackIfAtWar = attackIfAtWar;
    return this;
  }

  /**
   * attack_if_at_war boolean
   *
   * @return attackIfAtWar
   **/
  @ApiModelProperty(required = true, value = "attack_if_at_war boolean")
  @NotNull


  public Boolean isAttackIfAtWar() {
    return attackIfAtWar;
  }

  public void setAttackIfAtWar(Boolean attackIfAtWar) {
    this.attackIfAtWar = attackIfAtWar;
  }

  public GetCorporationsCorporationIdStarbasesStarbaseIdOk attackIfOtherSecurityStatusDropping(Boolean attackIfOtherSecurityStatusDropping) {
    this.attackIfOtherSecurityStatusDropping = attackIfOtherSecurityStatusDropping;
    return this;
  }

  /**
   * attack_if_other_security_status_dropping boolean
   *
   * @return attackIfOtherSecurityStatusDropping
   **/
  @ApiModelProperty(required = true, value = "attack_if_other_security_status_dropping boolean")
  @NotNull


  public Boolean isAttackIfOtherSecurityStatusDropping() {
    return attackIfOtherSecurityStatusDropping;
  }

  public void setAttackIfOtherSecurityStatusDropping(Boolean attackIfOtherSecurityStatusDropping) {
    this.attackIfOtherSecurityStatusDropping = attackIfOtherSecurityStatusDropping;
  }

  public GetCorporationsCorporationIdStarbasesStarbaseIdOk attackSecurityStatusThreshold(Float attackSecurityStatusThreshold) {
    this.attackSecurityStatusThreshold = attackSecurityStatusThreshold;
    return this;
  }

  /**
   * Starbase (POS) will attack if target's security standing is lower than this value
   *
   * @return attackSecurityStatusThreshold
   **/
  @ApiModelProperty(value = "Starbase (POS) will attack if target's security standing is lower than this value")


  public Float getAttackSecurityStatusThreshold() {
    return attackSecurityStatusThreshold;
  }

  public void setAttackSecurityStatusThreshold(Float attackSecurityStatusThreshold) {
    this.attackSecurityStatusThreshold = attackSecurityStatusThreshold;
  }

  public GetCorporationsCorporationIdStarbasesStarbaseIdOk attackStandingThreshold(Float attackStandingThreshold) {
    this.attackStandingThreshold = attackStandingThreshold;
    return this;
  }

  /**
   * Starbase (POS) will attack if target's standing is lower than this value
   *
   * @return attackStandingThreshold
   **/
  @ApiModelProperty(value = "Starbase (POS) will attack if target's standing is lower than this value")


  public Float getAttackStandingThreshold() {
    return attackStandingThreshold;
  }

  public void setAttackStandingThreshold(Float attackStandingThreshold) {
    this.attackStandingThreshold = attackStandingThreshold;
  }

  public GetCorporationsCorporationIdStarbasesStarbaseIdOk fuelBayTake(FuelBayTakeEnum fuelBayTake) {
    this.fuelBayTake = fuelBayTake;
    return this;
  }

  /**
   * Who can take fuel blocks out of the starbase (POS)'s fuel bay
   *
   * @return fuelBayTake
   **/
  @ApiModelProperty(required = true, value = "Who can take fuel blocks out of the starbase (POS)'s fuel bay")
  @NotNull


  public FuelBayTakeEnum getFuelBayTake() {
    return fuelBayTake;
  }

  public void setFuelBayTake(FuelBayTakeEnum fuelBayTake) {
    this.fuelBayTake = fuelBayTake;
  }

  public GetCorporationsCorporationIdStarbasesStarbaseIdOk fuelBayView(FuelBayViewEnum fuelBayView) {
    this.fuelBayView = fuelBayView;
    return this;
  }

  /**
   * Who can view the starbase (POS)'s fule bay. Characters either need to have required role or belong to the starbase (POS) owner's corporation or alliance, as described by the enum, all other access settings follows the same scheme
   *
   * @return fuelBayView
   **/
  @ApiModelProperty(required = true, value = "Who can view the starbase (POS)'s fule bay. Characters either need to have required role or belong to the starbase (POS) owner's corporation or alliance, as described by the enum, all other access settings follows the same scheme")
  @NotNull


  public FuelBayViewEnum getFuelBayView() {
    return fuelBayView;
  }

  public void setFuelBayView(FuelBayViewEnum fuelBayView) {
    this.fuelBayView = fuelBayView;
  }

  public GetCorporationsCorporationIdStarbasesStarbaseIdOk fuels(List<GetCorporationsCorporationIdStarbasesStarbaseIdFuel> fuels) {
    this.fuels = fuels;
    return this;
  }

  public GetCorporationsCorporationIdStarbasesStarbaseIdOk addFuelsItem(GetCorporationsCorporationIdStarbasesStarbaseIdFuel fuelsItem) {
    if (this.fuels == null) {
      this.fuels = new ArrayList<GetCorporationsCorporationIdStarbasesStarbaseIdFuel>();
    }
    this.fuels.add(fuelsItem);
    return this;
  }

  /**
   * Fuel blocks and other things that will be consumed when operating a starbase (POS)
   *
   * @return fuels
   **/
  @ApiModelProperty(value = "Fuel blocks and other things that will be consumed when operating a starbase (POS)")

  @Valid
  @Size(max = 20)
  public List<GetCorporationsCorporationIdStarbasesStarbaseIdFuel> getFuels() {
    return fuels;
  }

  public void setFuels(List<GetCorporationsCorporationIdStarbasesStarbaseIdFuel> fuels) {
    this.fuels = fuels;
  }

  public GetCorporationsCorporationIdStarbasesStarbaseIdOk offline(OfflineEnum offline) {
    this.offline = offline;
    return this;
  }

  /**
   * Who can offline starbase (POS) and its structures
   *
   * @return offline
   **/
  @ApiModelProperty(required = true, value = "Who can offline starbase (POS) and its structures")
  @NotNull


  public OfflineEnum getOffline() {
    return offline;
  }

  public void setOffline(OfflineEnum offline) {
    this.offline = offline;
  }

  public GetCorporationsCorporationIdStarbasesStarbaseIdOk online(OnlineEnum online) {
    this.online = online;
    return this;
  }

  /**
   * Who can online starbase (POS) and its structures
   *
   * @return online
   **/
  @ApiModelProperty(required = true, value = "Who can online starbase (POS) and its structures")
  @NotNull


  public OnlineEnum getOnline() {
    return online;
  }

  public void setOnline(OnlineEnum online) {
    this.online = online;
  }

  public GetCorporationsCorporationIdStarbasesStarbaseIdOk unanchor(UnanchorEnum unanchor) {
    this.unanchor = unanchor;
    return this;
  }

  /**
   * Who can unanchor starbase (POS) and its structures
   *
   * @return unanchor
   **/
  @ApiModelProperty(required = true, value = "Who can unanchor starbase (POS) and its structures")
  @NotNull


  public UnanchorEnum getUnanchor() {
    return unanchor;
  }

  public void setUnanchor(UnanchorEnum unanchor) {
    this.unanchor = unanchor;
  }

  public GetCorporationsCorporationIdStarbasesStarbaseIdOk useAllianceStandings(Boolean useAllianceStandings) {
    this.useAllianceStandings = useAllianceStandings;
    return this;
  }

  /**
   * True if the starbase (POS) is using alliance standings, otherwise using corporation's
   *
   * @return useAllianceStandings
   **/
  @ApiModelProperty(required = true, value = "True if the starbase (POS) is using alliance standings, otherwise using corporation's")
  @NotNull


  public Boolean isUseAllianceStandings() {
    return useAllianceStandings;
  }

  public void setUseAllianceStandings(Boolean useAllianceStandings) {
    this.useAllianceStandings = useAllianceStandings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdStarbasesStarbaseIdOk getCorporationsCorporationIdStarbasesStarbaseIdOk = (GetCorporationsCorporationIdStarbasesStarbaseIdOk) o;
    return Objects.equals(this.allowAllianceMembers, getCorporationsCorporationIdStarbasesStarbaseIdOk.allowAllianceMembers) &&
        Objects.equals(this.allowCorporationMembers, getCorporationsCorporationIdStarbasesStarbaseIdOk.allowCorporationMembers) &&
        Objects.equals(this.anchor, getCorporationsCorporationIdStarbasesStarbaseIdOk.anchor) &&
        Objects.equals(this.attackIfAtWar, getCorporationsCorporationIdStarbasesStarbaseIdOk.attackIfAtWar) &&
        Objects.equals(this.attackIfOtherSecurityStatusDropping, getCorporationsCorporationIdStarbasesStarbaseIdOk.attackIfOtherSecurityStatusDropping) &&
        Objects.equals(this.attackSecurityStatusThreshold, getCorporationsCorporationIdStarbasesStarbaseIdOk.attackSecurityStatusThreshold) &&
        Objects.equals(this.attackStandingThreshold, getCorporationsCorporationIdStarbasesStarbaseIdOk.attackStandingThreshold) &&
        Objects.equals(this.fuelBayTake, getCorporationsCorporationIdStarbasesStarbaseIdOk.fuelBayTake) &&
        Objects.equals(this.fuelBayView, getCorporationsCorporationIdStarbasesStarbaseIdOk.fuelBayView) &&
        Objects.equals(this.fuels, getCorporationsCorporationIdStarbasesStarbaseIdOk.fuels) &&
        Objects.equals(this.offline, getCorporationsCorporationIdStarbasesStarbaseIdOk.offline) &&
        Objects.equals(this.online, getCorporationsCorporationIdStarbasesStarbaseIdOk.online) &&
        Objects.equals(this.unanchor, getCorporationsCorporationIdStarbasesStarbaseIdOk.unanchor) &&
        Objects.equals(this.useAllianceStandings, getCorporationsCorporationIdStarbasesStarbaseIdOk.useAllianceStandings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowAllianceMembers, allowCorporationMembers, anchor, attackIfAtWar, attackIfOtherSecurityStatusDropping, attackSecurityStatusThreshold, attackStandingThreshold, fuelBayTake, fuelBayView, fuels, offline, online, unanchor, useAllianceStandings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdStarbasesStarbaseIdOk {\n");

    sb.append("    allowAllianceMembers: ").append(toIndentedString(allowAllianceMembers)).append("\n");
    sb.append("    allowCorporationMembers: ").append(toIndentedString(allowCorporationMembers)).append("\n");
    sb.append("    anchor: ").append(toIndentedString(anchor)).append("\n");
    sb.append("    attackIfAtWar: ").append(toIndentedString(attackIfAtWar)).append("\n");
    sb.append("    attackIfOtherSecurityStatusDropping: ").append(toIndentedString(attackIfOtherSecurityStatusDropping)).append("\n");
    sb.append("    attackSecurityStatusThreshold: ").append(toIndentedString(attackSecurityStatusThreshold)).append("\n");
    sb.append("    attackStandingThreshold: ").append(toIndentedString(attackStandingThreshold)).append("\n");
    sb.append("    fuelBayTake: ").append(toIndentedString(fuelBayTake)).append("\n");
    sb.append("    fuelBayView: ").append(toIndentedString(fuelBayView)).append("\n");
    sb.append("    fuels: ").append(toIndentedString(fuels)).append("\n");
    sb.append("    offline: ").append(toIndentedString(offline)).append("\n");
    sb.append("    online: ").append(toIndentedString(online)).append("\n");
    sb.append("    unanchor: ").append(toIndentedString(unanchor)).append("\n");
    sb.append("    useAllianceStandings: ").append(toIndentedString(useAllianceStandings)).append("\n");
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

