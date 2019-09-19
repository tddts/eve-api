package com.github.tddts.eve.model.killmail;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class GetKillmailsKillmailIdKillmailHashOk {
  @JsonProperty("attackers")
  @Valid
  private List<GetKillmailsKillmailIdKillmailHashAttacker> attackers = new ArrayList<GetKillmailsKillmailIdKillmailHashAttacker>();

  @JsonProperty("killmail_id")
  private Integer killmailId = null;

  @JsonProperty("killmail_time")
  private OffsetDateTime killmailTime = null;

  @JsonProperty("moon_id")
  private Integer moonId = null;

  @JsonProperty("solar_system_id")
  private Integer solarSystemId = null;

  @JsonProperty("victim")
  private GetKillmailsKillmailIdKillmailHashVictim victim = null;

  @JsonProperty("war_id")
  private Integer warId = null;

  public GetKillmailsKillmailIdKillmailHashOk attackers(List<GetKillmailsKillmailIdKillmailHashAttacker> attackers) {
    this.attackers = attackers;
    return this;
  }

  public GetKillmailsKillmailIdKillmailHashOk addAttackersItem(GetKillmailsKillmailIdKillmailHashAttacker attackersItem) {
    this.attackers.add(attackersItem);
    return this;
  }

  /**
   * attackers array
   *
   * @return attackers
   **/
  @ApiModelProperty(required = true, value = "attackers array")
  @NotNull

  @Valid
  @Size(max = 10000)
  public List<GetKillmailsKillmailIdKillmailHashAttacker> getAttackers() {
    return attackers;
  }

  public void setAttackers(List<GetKillmailsKillmailIdKillmailHashAttacker> attackers) {
    this.attackers = attackers;
  }

  public GetKillmailsKillmailIdKillmailHashOk killmailId(Integer killmailId) {
    this.killmailId = killmailId;
    return this;
  }

  /**
   * ID of the killmail
   *
   * @return killmailId
   **/
  @ApiModelProperty(required = true, value = "ID of the killmail")
  @NotNull


  public Integer getKillmailId() {
    return killmailId;
  }

  public void setKillmailId(Integer killmailId) {
    this.killmailId = killmailId;
  }

  public GetKillmailsKillmailIdKillmailHashOk killmailTime(OffsetDateTime killmailTime) {
    this.killmailTime = killmailTime;
    return this;
  }

  /**
   * Time that the victim was killed and the killmail generated
   *
   * @return killmailTime
   **/
  @ApiModelProperty(required = true, value = "Time that the victim was killed and the killmail generated ")
  @NotNull

  @Valid

  public OffsetDateTime getKillmailTime() {
    return killmailTime;
  }

  public void setKillmailTime(OffsetDateTime killmailTime) {
    this.killmailTime = killmailTime;
  }

  public GetKillmailsKillmailIdKillmailHashOk moonId(Integer moonId) {
    this.moonId = moonId;
    return this;
  }

  /**
   * Moon if the kill took place at one
   *
   * @return moonId
   **/
  @ApiModelProperty(value = "Moon if the kill took place at one")


  public Integer getMoonId() {
    return moonId;
  }

  public void setMoonId(Integer moonId) {
    this.moonId = moonId;
  }

  public GetKillmailsKillmailIdKillmailHashOk solarSystemId(Integer solarSystemId) {
    this.solarSystemId = solarSystemId;
    return this;
  }

  /**
   * Solar system that the kill took place in
   *
   * @return solarSystemId
   **/
  @ApiModelProperty(required = true, value = "Solar system that the kill took place in ")
  @NotNull


  public Integer getSolarSystemId() {
    return solarSystemId;
  }

  public void setSolarSystemId(Integer solarSystemId) {
    this.solarSystemId = solarSystemId;
  }

  public GetKillmailsKillmailIdKillmailHashOk victim(GetKillmailsKillmailIdKillmailHashVictim victim) {
    this.victim = victim;
    return this;
  }

  /**
   * Get victim
   *
   * @return victim
   **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public GetKillmailsKillmailIdKillmailHashVictim getVictim() {
    return victim;
  }

  public void setVictim(GetKillmailsKillmailIdKillmailHashVictim victim) {
    this.victim = victim;
  }

  public GetKillmailsKillmailIdKillmailHashOk warId(Integer warId) {
    this.warId = warId;
    return this;
  }

  /**
   * War if the killmail is generated in relation to an official war
   *
   * @return warId
   **/
  @ApiModelProperty(value = "War if the killmail is generated in relation to an official war ")


  public Integer getWarId() {
    return warId;
  }

  public void setWarId(Integer warId) {
    this.warId = warId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetKillmailsKillmailIdKillmailHashOk getKillmailsKillmailIdKillmailHashOk = (GetKillmailsKillmailIdKillmailHashOk) o;
    return Objects.equals(this.attackers, getKillmailsKillmailIdKillmailHashOk.attackers) &&
        Objects.equals(this.killmailId, getKillmailsKillmailIdKillmailHashOk.killmailId) &&
        Objects.equals(this.killmailTime, getKillmailsKillmailIdKillmailHashOk.killmailTime) &&
        Objects.equals(this.moonId, getKillmailsKillmailIdKillmailHashOk.moonId) &&
        Objects.equals(this.solarSystemId, getKillmailsKillmailIdKillmailHashOk.solarSystemId) &&
        Objects.equals(this.victim, getKillmailsKillmailIdKillmailHashOk.victim) &&
        Objects.equals(this.warId, getKillmailsKillmailIdKillmailHashOk.warId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attackers, killmailId, killmailTime, moonId, solarSystemId, victim, warId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetKillmailsKillmailIdKillmailHashOk {\n");

    sb.append("    attackers: ").append(toIndentedString(attackers)).append("\n");
    sb.append("    killmailId: ").append(toIndentedString(killmailId)).append("\n");
    sb.append("    killmailTime: ").append(toIndentedString(killmailTime)).append("\n");
    sb.append("    moonId: ").append(toIndentedString(moonId)).append("\n");
    sb.append("    solarSystemId: ").append(toIndentedString(solarSystemId)).append("\n");
    sb.append("    victim: ").append(toIndentedString(victim)).append("\n");
    sb.append("    warId: ").append(toIndentedString(warId)).append("\n");
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

