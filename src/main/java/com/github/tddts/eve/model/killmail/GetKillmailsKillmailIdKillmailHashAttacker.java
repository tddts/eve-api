package com.github.tddts.eve.model.killmail;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * attacker object
 */
@ApiModel(description = "attacker object")
@Validated
public class GetKillmailsKillmailIdKillmailHashAttacker {
  @JsonProperty("alliance_id")
  private Integer allianceId = null;

  @JsonProperty("character_id")
  private Integer characterId = null;

  @JsonProperty("corporation_id")
  private Integer corporationId = null;

  @JsonProperty("damage_done")
  private Integer damageDone = null;

  @JsonProperty("faction_id")
  private Integer factionId = null;

  @JsonProperty("final_blow")
  private Boolean finalBlow = null;

  @JsonProperty("security_status")
  private Float securityStatus = null;

  @JsonProperty("ship_type_id")
  private Integer shipTypeId = null;

  @JsonProperty("weapon_type_id")
  private Integer weaponTypeId = null;

  public GetKillmailsKillmailIdKillmailHashAttacker allianceId(Integer allianceId) {
    this.allianceId = allianceId;
    return this;
  }

  /**
   * alliance_id integer
   *
   * @return allianceId
   **/
  @ApiModelProperty(value = "alliance_id integer")


  public Integer getAllianceId() {
    return allianceId;
  }

  public void setAllianceId(Integer allianceId) {
    this.allianceId = allianceId;
  }

  public GetKillmailsKillmailIdKillmailHashAttacker characterId(Integer characterId) {
    this.characterId = characterId;
    return this;
  }

  /**
   * character_id integer
   *
   * @return characterId
   **/
  @ApiModelProperty(value = "character_id integer")


  public Integer getCharacterId() {
    return characterId;
  }

  public void setCharacterId(Integer characterId) {
    this.characterId = characterId;
  }

  public GetKillmailsKillmailIdKillmailHashAttacker corporationId(Integer corporationId) {
    this.corporationId = corporationId;
    return this;
  }

  /**
   * corporation_id integer
   *
   * @return corporationId
   **/
  @ApiModelProperty(value = "corporation_id integer")


  public Integer getCorporationId() {
    return corporationId;
  }

  public void setCorporationId(Integer corporationId) {
    this.corporationId = corporationId;
  }

  public GetKillmailsKillmailIdKillmailHashAttacker damageDone(Integer damageDone) {
    this.damageDone = damageDone;
    return this;
  }

  /**
   * damage_done integer
   *
   * @return damageDone
   **/
  @ApiModelProperty(required = true, value = "damage_done integer")
  @NotNull


  public Integer getDamageDone() {
    return damageDone;
  }

  public void setDamageDone(Integer damageDone) {
    this.damageDone = damageDone;
  }

  public GetKillmailsKillmailIdKillmailHashAttacker factionId(Integer factionId) {
    this.factionId = factionId;
    return this;
  }

  /**
   * faction_id integer
   *
   * @return factionId
   **/
  @ApiModelProperty(value = "faction_id integer")


  public Integer getFactionId() {
    return factionId;
  }

  public void setFactionId(Integer factionId) {
    this.factionId = factionId;
  }

  public GetKillmailsKillmailIdKillmailHashAttacker finalBlow(Boolean finalBlow) {
    this.finalBlow = finalBlow;
    return this;
  }

  /**
   * Was the attacker the one to achieve the final blow
   *
   * @return finalBlow
   **/
  @ApiModelProperty(required = true, value = "Was the attacker the one to achieve the final blow ")
  @NotNull


  public Boolean isFinalBlow() {
    return finalBlow;
  }

  public void setFinalBlow(Boolean finalBlow) {
    this.finalBlow = finalBlow;
  }

  public GetKillmailsKillmailIdKillmailHashAttacker securityStatus(Float securityStatus) {
    this.securityStatus = securityStatus;
    return this;
  }

  /**
   * Security status for the attacker
   *
   * @return securityStatus
   **/
  @ApiModelProperty(required = true, value = "Security status for the attacker ")
  @NotNull


  public Float getSecurityStatus() {
    return securityStatus;
  }

  public void setSecurityStatus(Float securityStatus) {
    this.securityStatus = securityStatus;
  }

  public GetKillmailsKillmailIdKillmailHashAttacker shipTypeId(Integer shipTypeId) {
    this.shipTypeId = shipTypeId;
    return this;
  }

  /**
   * What ship was the attacker flying
   *
   * @return shipTypeId
   **/
  @ApiModelProperty(value = "What ship was the attacker flying ")


  public Integer getShipTypeId() {
    return shipTypeId;
  }

  public void setShipTypeId(Integer shipTypeId) {
    this.shipTypeId = shipTypeId;
  }

  public GetKillmailsKillmailIdKillmailHashAttacker weaponTypeId(Integer weaponTypeId) {
    this.weaponTypeId = weaponTypeId;
    return this;
  }

  /**
   * What weapon was used by the attacker for the kill
   *
   * @return weaponTypeId
   **/
  @ApiModelProperty(value = "What weapon was used by the attacker for the kill ")


  public Integer getWeaponTypeId() {
    return weaponTypeId;
  }

  public void setWeaponTypeId(Integer weaponTypeId) {
    this.weaponTypeId = weaponTypeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetKillmailsKillmailIdKillmailHashAttacker getKillmailsKillmailIdKillmailHashAttacker = (GetKillmailsKillmailIdKillmailHashAttacker) o;
    return Objects.equals(this.allianceId, getKillmailsKillmailIdKillmailHashAttacker.allianceId) &&
        Objects.equals(this.characterId, getKillmailsKillmailIdKillmailHashAttacker.characterId) &&
        Objects.equals(this.corporationId, getKillmailsKillmailIdKillmailHashAttacker.corporationId) &&
        Objects.equals(this.damageDone, getKillmailsKillmailIdKillmailHashAttacker.damageDone) &&
        Objects.equals(this.factionId, getKillmailsKillmailIdKillmailHashAttacker.factionId) &&
        Objects.equals(this.finalBlow, getKillmailsKillmailIdKillmailHashAttacker.finalBlow) &&
        Objects.equals(this.securityStatus, getKillmailsKillmailIdKillmailHashAttacker.securityStatus) &&
        Objects.equals(this.shipTypeId, getKillmailsKillmailIdKillmailHashAttacker.shipTypeId) &&
        Objects.equals(this.weaponTypeId, getKillmailsKillmailIdKillmailHashAttacker.weaponTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allianceId, characterId, corporationId, damageDone, factionId, finalBlow, securityStatus, shipTypeId, weaponTypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetKillmailsKillmailIdKillmailHashAttacker {\n");

    sb.append("    allianceId: ").append(toIndentedString(allianceId)).append("\n");
    sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
    sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
    sb.append("    damageDone: ").append(toIndentedString(damageDone)).append("\n");
    sb.append("    factionId: ").append(toIndentedString(factionId)).append("\n");
    sb.append("    finalBlow: ").append(toIndentedString(finalBlow)).append("\n");
    sb.append("    securityStatus: ").append(toIndentedString(securityStatus)).append("\n");
    sb.append("    shipTypeId: ").append(toIndentedString(shipTypeId)).append("\n");
    sb.append("    weaponTypeId: ").append(toIndentedString(weaponTypeId)).append("\n");
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

