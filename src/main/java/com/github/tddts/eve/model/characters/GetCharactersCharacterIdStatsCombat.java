package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * combat object
 */
@ApiModel(description = "combat object")
@Validated
public class GetCharactersCharacterIdStatsCombat {
  @JsonProperty("cap_drainedby_npc")
  private Long capDrainedbyNpc = null;

  @JsonProperty("cap_drainedby_pc")
  private Long capDrainedbyPc = null;

  @JsonProperty("cap_draining_pc")
  private Long capDrainingPc = null;

  @JsonProperty("criminal_flag_set")
  private Long criminalFlagSet = null;

  @JsonProperty("damage_from_np_cs_amount")
  private Long damageFromNpCsAmount = null;

  @JsonProperty("damage_from_np_cs_num_shots")
  private Long damageFromNpCsNumShots = null;

  @JsonProperty("damage_from_players_bomb_amount")
  private Long damageFromPlayersBombAmount = null;

  @JsonProperty("damage_from_players_bomb_num_shots")
  private Long damageFromPlayersBombNumShots = null;

  @JsonProperty("damage_from_players_combat_drone_amount")
  private Long damageFromPlayersCombatDroneAmount = null;

  @JsonProperty("damage_from_players_combat_drone_num_shots")
  private Long damageFromPlayersCombatDroneNumShots = null;

  @JsonProperty("damage_from_players_energy_amount")
  private Long damageFromPlayersEnergyAmount = null;

  @JsonProperty("damage_from_players_energy_num_shots")
  private Long damageFromPlayersEnergyNumShots = null;

  @JsonProperty("damage_from_players_fighter_bomber_amount")
  private Long damageFromPlayersFighterBomberAmount = null;

  @JsonProperty("damage_from_players_fighter_bomber_num_shots")
  private Long damageFromPlayersFighterBomberNumShots = null;

  @JsonProperty("damage_from_players_fighter_drone_amount")
  private Long damageFromPlayersFighterDroneAmount = null;

  @JsonProperty("damage_from_players_fighter_drone_num_shots")
  private Long damageFromPlayersFighterDroneNumShots = null;

  @JsonProperty("damage_from_players_hybrid_amount")
  private Long damageFromPlayersHybridAmount = null;

  @JsonProperty("damage_from_players_hybrid_num_shots")
  private Long damageFromPlayersHybridNumShots = null;

  @JsonProperty("damage_from_players_missile_amount")
  private Long damageFromPlayersMissileAmount = null;

  @JsonProperty("damage_from_players_missile_num_shots")
  private Long damageFromPlayersMissileNumShots = null;

  @JsonProperty("damage_from_players_projectile_amount")
  private Long damageFromPlayersProjectileAmount = null;

  @JsonProperty("damage_from_players_projectile_num_shots")
  private Long damageFromPlayersProjectileNumShots = null;

  @JsonProperty("damage_from_players_smart_bomb_amount")
  private Long damageFromPlayersSmartBombAmount = null;

  @JsonProperty("damage_from_players_smart_bomb_num_shots")
  private Long damageFromPlayersSmartBombNumShots = null;

  @JsonProperty("damage_from_players_super_amount")
  private Long damageFromPlayersSuperAmount = null;

  @JsonProperty("damage_from_players_super_num_shots")
  private Long damageFromPlayersSuperNumShots = null;

  @JsonProperty("damage_from_structures_total_amount")
  private Long damageFromStructuresTotalAmount = null;

  @JsonProperty("damage_from_structures_total_num_shots")
  private Long damageFromStructuresTotalNumShots = null;

  @JsonProperty("damage_to_players_bomb_amount")
  private Long damageToPlayersBombAmount = null;

  @JsonProperty("damage_to_players_bomb_num_shots")
  private Long damageToPlayersBombNumShots = null;

  @JsonProperty("damage_to_players_combat_drone_amount")
  private Long damageToPlayersCombatDroneAmount = null;

  @JsonProperty("damage_to_players_combat_drone_num_shots")
  private Long damageToPlayersCombatDroneNumShots = null;

  @JsonProperty("damage_to_players_energy_amount")
  private Long damageToPlayersEnergyAmount = null;

  @JsonProperty("damage_to_players_energy_num_shots")
  private Long damageToPlayersEnergyNumShots = null;

  @JsonProperty("damage_to_players_fighter_bomber_amount")
  private Long damageToPlayersFighterBomberAmount = null;

  @JsonProperty("damage_to_players_fighter_bomber_num_shots")
  private Long damageToPlayersFighterBomberNumShots = null;

  @JsonProperty("damage_to_players_fighter_drone_amount")
  private Long damageToPlayersFighterDroneAmount = null;

  @JsonProperty("damage_to_players_fighter_drone_num_shots")
  private Long damageToPlayersFighterDroneNumShots = null;

  @JsonProperty("damage_to_players_hybrid_amount")
  private Long damageToPlayersHybridAmount = null;

  @JsonProperty("damage_to_players_hybrid_num_shots")
  private Long damageToPlayersHybridNumShots = null;

  @JsonProperty("damage_to_players_missile_amount")
  private Long damageToPlayersMissileAmount = null;

  @JsonProperty("damage_to_players_missile_num_shots")
  private Long damageToPlayersMissileNumShots = null;

  @JsonProperty("damage_to_players_projectile_amount")
  private Long damageToPlayersProjectileAmount = null;

  @JsonProperty("damage_to_players_projectile_num_shots")
  private Long damageToPlayersProjectileNumShots = null;

  @JsonProperty("damage_to_players_smart_bomb_amount")
  private Long damageToPlayersSmartBombAmount = null;

  @JsonProperty("damage_to_players_smart_bomb_num_shots")
  private Long damageToPlayersSmartBombNumShots = null;

  @JsonProperty("damage_to_players_super_amount")
  private Long damageToPlayersSuperAmount = null;

  @JsonProperty("damage_to_players_super_num_shots")
  private Long damageToPlayersSuperNumShots = null;

  @JsonProperty("damage_to_structures_total_amount")
  private Long damageToStructuresTotalAmount = null;

  @JsonProperty("damage_to_structures_total_num_shots")
  private Long damageToStructuresTotalNumShots = null;

  @JsonProperty("deaths_high_sec")
  private Long deathsHighSec = null;

  @JsonProperty("deaths_low_sec")
  private Long deathsLowSec = null;

  @JsonProperty("deaths_null_sec")
  private Long deathsNullSec = null;

  @JsonProperty("deaths_pod_high_sec")
  private Long deathsPodHighSec = null;

  @JsonProperty("deaths_pod_low_sec")
  private Long deathsPodLowSec = null;

  @JsonProperty("deaths_pod_null_sec")
  private Long deathsPodNullSec = null;

  @JsonProperty("deaths_pod_wormhole")
  private Long deathsPodWormhole = null;

  @JsonProperty("deaths_wormhole")
  private Long deathsWormhole = null;

  @JsonProperty("drone_engage")
  private Long droneEngage = null;

  @JsonProperty("dscans")
  private Long dscans = null;

  @JsonProperty("duel_requested")
  private Long duelRequested = null;

  @JsonProperty("engagement_register")
  private Long engagementRegister = null;

  @JsonProperty("kills_assists")
  private Long killsAssists = null;

  @JsonProperty("kills_high_sec")
  private Long killsHighSec = null;

  @JsonProperty("kills_low_sec")
  private Long killsLowSec = null;

  @JsonProperty("kills_null_sec")
  private Long killsNullSec = null;

  @JsonProperty("kills_pod_high_sec")
  private Long killsPodHighSec = null;

  @JsonProperty("kills_pod_low_sec")
  private Long killsPodLowSec = null;

  @JsonProperty("kills_pod_null_sec")
  private Long killsPodNullSec = null;

  @JsonProperty("kills_pod_wormhole")
  private Long killsPodWormhole = null;

  @JsonProperty("kills_wormhole")
  private Long killsWormhole = null;

  @JsonProperty("npc_flag_set")
  private Long npcFlagSet = null;

  @JsonProperty("probe_scans")
  private Long probeScans = null;

  @JsonProperty("pvp_flag_set")
  private Long pvpFlagSet = null;

  @JsonProperty("repair_armor_by_remote_amount")
  private Long repairArmorByRemoteAmount = null;

  @JsonProperty("repair_armor_remote_amount")
  private Long repairArmorRemoteAmount = null;

  @JsonProperty("repair_armor_self_amount")
  private Long repairArmorSelfAmount = null;

  @JsonProperty("repair_capacitor_by_remote_amount")
  private Long repairCapacitorByRemoteAmount = null;

  @JsonProperty("repair_capacitor_remote_amount")
  private Long repairCapacitorRemoteAmount = null;

  @JsonProperty("repair_capacitor_self_amount")
  private Long repairCapacitorSelfAmount = null;

  @JsonProperty("repair_hull_by_remote_amount")
  private Long repairHullByRemoteAmount = null;

  @JsonProperty("repair_hull_remote_amount")
  private Long repairHullRemoteAmount = null;

  @JsonProperty("repair_hull_self_amount")
  private Long repairHullSelfAmount = null;

  @JsonProperty("repair_shield_by_remote_amount")
  private Long repairShieldByRemoteAmount = null;

  @JsonProperty("repair_shield_remote_amount")
  private Long repairShieldRemoteAmount = null;

  @JsonProperty("repair_shield_self_amount")
  private Long repairShieldSelfAmount = null;

  @JsonProperty("self_destructs")
  private Long selfDestructs = null;

  @JsonProperty("warp_scramble_pc")
  private Long warpScramblePc = null;

  @JsonProperty("warp_scrambledby_npc")
  private Long warpScrambledbyNpc = null;

  @JsonProperty("warp_scrambledby_pc")
  private Long warpScrambledbyPc = null;

  @JsonProperty("weapon_flag_set")
  private Long weaponFlagSet = null;

  @JsonProperty("webifiedby_npc")
  private Long webifiedbyNpc = null;

  @JsonProperty("webifiedby_pc")
  private Long webifiedbyPc = null;

  @JsonProperty("webifying_pc")
  private Long webifyingPc = null;

  public GetCharactersCharacterIdStatsCombat capDrainedbyNpc(Long capDrainedbyNpc) {
    this.capDrainedbyNpc = capDrainedbyNpc;
    return this;
  }

  /**
   * cap_drainedby_npc integer
   *
   * @return capDrainedbyNpc
   **/
  @ApiModelProperty(value = "cap_drainedby_npc integer")


  public Long getCapDrainedbyNpc() {
    return capDrainedbyNpc;
  }

  public void setCapDrainedbyNpc(Long capDrainedbyNpc) {
    this.capDrainedbyNpc = capDrainedbyNpc;
  }

  public GetCharactersCharacterIdStatsCombat capDrainedbyPc(Long capDrainedbyPc) {
    this.capDrainedbyPc = capDrainedbyPc;
    return this;
  }

  /**
   * cap_drainedby_pc integer
   *
   * @return capDrainedbyPc
   **/
  @ApiModelProperty(value = "cap_drainedby_pc integer")


  public Long getCapDrainedbyPc() {
    return capDrainedbyPc;
  }

  public void setCapDrainedbyPc(Long capDrainedbyPc) {
    this.capDrainedbyPc = capDrainedbyPc;
  }

  public GetCharactersCharacterIdStatsCombat capDrainingPc(Long capDrainingPc) {
    this.capDrainingPc = capDrainingPc;
    return this;
  }

  /**
   * cap_draining_pc integer
   *
   * @return capDrainingPc
   **/
  @ApiModelProperty(value = "cap_draining_pc integer")


  public Long getCapDrainingPc() {
    return capDrainingPc;
  }

  public void setCapDrainingPc(Long capDrainingPc) {
    this.capDrainingPc = capDrainingPc;
  }

  public GetCharactersCharacterIdStatsCombat criminalFlagSet(Long criminalFlagSet) {
    this.criminalFlagSet = criminalFlagSet;
    return this;
  }

  /**
   * criminal_flag_set integer
   *
   * @return criminalFlagSet
   **/
  @ApiModelProperty(value = "criminal_flag_set integer")


  public Long getCriminalFlagSet() {
    return criminalFlagSet;
  }

  public void setCriminalFlagSet(Long criminalFlagSet) {
    this.criminalFlagSet = criminalFlagSet;
  }

  public GetCharactersCharacterIdStatsCombat damageFromNpCsAmount(Long damageFromNpCsAmount) {
    this.damageFromNpCsAmount = damageFromNpCsAmount;
    return this;
  }

  /**
   * damage_from_np_cs_amount integer
   *
   * @return damageFromNpCsAmount
   **/
  @ApiModelProperty(value = "damage_from_np_cs_amount integer")


  public Long getDamageFromNpCsAmount() {
    return damageFromNpCsAmount;
  }

  public void setDamageFromNpCsAmount(Long damageFromNpCsAmount) {
    this.damageFromNpCsAmount = damageFromNpCsAmount;
  }

  public GetCharactersCharacterIdStatsCombat damageFromNpCsNumShots(Long damageFromNpCsNumShots) {
    this.damageFromNpCsNumShots = damageFromNpCsNumShots;
    return this;
  }

  /**
   * damage_from_np_cs_num_shots integer
   *
   * @return damageFromNpCsNumShots
   **/
  @ApiModelProperty(value = "damage_from_np_cs_num_shots integer")


  public Long getDamageFromNpCsNumShots() {
    return damageFromNpCsNumShots;
  }

  public void setDamageFromNpCsNumShots(Long damageFromNpCsNumShots) {
    this.damageFromNpCsNumShots = damageFromNpCsNumShots;
  }

  public GetCharactersCharacterIdStatsCombat damageFromPlayersBombAmount(Long damageFromPlayersBombAmount) {
    this.damageFromPlayersBombAmount = damageFromPlayersBombAmount;
    return this;
  }

  /**
   * damage_from_players_bomb_amount integer
   *
   * @return damageFromPlayersBombAmount
   **/
  @ApiModelProperty(value = "damage_from_players_bomb_amount integer")


  public Long getDamageFromPlayersBombAmount() {
    return damageFromPlayersBombAmount;
  }

  public void setDamageFromPlayersBombAmount(Long damageFromPlayersBombAmount) {
    this.damageFromPlayersBombAmount = damageFromPlayersBombAmount;
  }

  public GetCharactersCharacterIdStatsCombat damageFromPlayersBombNumShots(Long damageFromPlayersBombNumShots) {
    this.damageFromPlayersBombNumShots = damageFromPlayersBombNumShots;
    return this;
  }

  /**
   * damage_from_players_bomb_num_shots integer
   *
   * @return damageFromPlayersBombNumShots
   **/
  @ApiModelProperty(value = "damage_from_players_bomb_num_shots integer")


  public Long getDamageFromPlayersBombNumShots() {
    return damageFromPlayersBombNumShots;
  }

  public void setDamageFromPlayersBombNumShots(Long damageFromPlayersBombNumShots) {
    this.damageFromPlayersBombNumShots = damageFromPlayersBombNumShots;
  }

  public GetCharactersCharacterIdStatsCombat damageFromPlayersCombatDroneAmount(Long damageFromPlayersCombatDroneAmount) {
    this.damageFromPlayersCombatDroneAmount = damageFromPlayersCombatDroneAmount;
    return this;
  }

  /**
   * damage_from_players_combat_drone_amount integer
   *
   * @return damageFromPlayersCombatDroneAmount
   **/
  @ApiModelProperty(value = "damage_from_players_combat_drone_amount integer")


  public Long getDamageFromPlayersCombatDroneAmount() {
    return damageFromPlayersCombatDroneAmount;
  }

  public void setDamageFromPlayersCombatDroneAmount(Long damageFromPlayersCombatDroneAmount) {
    this.damageFromPlayersCombatDroneAmount = damageFromPlayersCombatDroneAmount;
  }

  public GetCharactersCharacterIdStatsCombat damageFromPlayersCombatDroneNumShots(Long damageFromPlayersCombatDroneNumShots) {
    this.damageFromPlayersCombatDroneNumShots = damageFromPlayersCombatDroneNumShots;
    return this;
  }

  /**
   * damage_from_players_combat_drone_num_shots integer
   *
   * @return damageFromPlayersCombatDroneNumShots
   **/
  @ApiModelProperty(value = "damage_from_players_combat_drone_num_shots integer")


  public Long getDamageFromPlayersCombatDroneNumShots() {
    return damageFromPlayersCombatDroneNumShots;
  }

  public void setDamageFromPlayersCombatDroneNumShots(Long damageFromPlayersCombatDroneNumShots) {
    this.damageFromPlayersCombatDroneNumShots = damageFromPlayersCombatDroneNumShots;
  }

  public GetCharactersCharacterIdStatsCombat damageFromPlayersEnergyAmount(Long damageFromPlayersEnergyAmount) {
    this.damageFromPlayersEnergyAmount = damageFromPlayersEnergyAmount;
    return this;
  }

  /**
   * damage_from_players_energy_amount integer
   *
   * @return damageFromPlayersEnergyAmount
   **/
  @ApiModelProperty(value = "damage_from_players_energy_amount integer")


  public Long getDamageFromPlayersEnergyAmount() {
    return damageFromPlayersEnergyAmount;
  }

  public void setDamageFromPlayersEnergyAmount(Long damageFromPlayersEnergyAmount) {
    this.damageFromPlayersEnergyAmount = damageFromPlayersEnergyAmount;
  }

  public GetCharactersCharacterIdStatsCombat damageFromPlayersEnergyNumShots(Long damageFromPlayersEnergyNumShots) {
    this.damageFromPlayersEnergyNumShots = damageFromPlayersEnergyNumShots;
    return this;
  }

  /**
   * damage_from_players_energy_num_shots integer
   *
   * @return damageFromPlayersEnergyNumShots
   **/
  @ApiModelProperty(value = "damage_from_players_energy_num_shots integer")


  public Long getDamageFromPlayersEnergyNumShots() {
    return damageFromPlayersEnergyNumShots;
  }

  public void setDamageFromPlayersEnergyNumShots(Long damageFromPlayersEnergyNumShots) {
    this.damageFromPlayersEnergyNumShots = damageFromPlayersEnergyNumShots;
  }

  public GetCharactersCharacterIdStatsCombat damageFromPlayersFighterBomberAmount(Long damageFromPlayersFighterBomberAmount) {
    this.damageFromPlayersFighterBomberAmount = damageFromPlayersFighterBomberAmount;
    return this;
  }

  /**
   * damage_from_players_fighter_bomber_amount integer
   *
   * @return damageFromPlayersFighterBomberAmount
   **/
  @ApiModelProperty(value = "damage_from_players_fighter_bomber_amount integer")


  public Long getDamageFromPlayersFighterBomberAmount() {
    return damageFromPlayersFighterBomberAmount;
  }

  public void setDamageFromPlayersFighterBomberAmount(Long damageFromPlayersFighterBomberAmount) {
    this.damageFromPlayersFighterBomberAmount = damageFromPlayersFighterBomberAmount;
  }

  public GetCharactersCharacterIdStatsCombat damageFromPlayersFighterBomberNumShots(Long damageFromPlayersFighterBomberNumShots) {
    this.damageFromPlayersFighterBomberNumShots = damageFromPlayersFighterBomberNumShots;
    return this;
  }

  /**
   * damage_from_players_fighter_bomber_num_shots integer
   *
   * @return damageFromPlayersFighterBomberNumShots
   **/
  @ApiModelProperty(value = "damage_from_players_fighter_bomber_num_shots integer")


  public Long getDamageFromPlayersFighterBomberNumShots() {
    return damageFromPlayersFighterBomberNumShots;
  }

  public void setDamageFromPlayersFighterBomberNumShots(Long damageFromPlayersFighterBomberNumShots) {
    this.damageFromPlayersFighterBomberNumShots = damageFromPlayersFighterBomberNumShots;
  }

  public GetCharactersCharacterIdStatsCombat damageFromPlayersFighterDroneAmount(Long damageFromPlayersFighterDroneAmount) {
    this.damageFromPlayersFighterDroneAmount = damageFromPlayersFighterDroneAmount;
    return this;
  }

  /**
   * damage_from_players_fighter_drone_amount integer
   *
   * @return damageFromPlayersFighterDroneAmount
   **/
  @ApiModelProperty(value = "damage_from_players_fighter_drone_amount integer")


  public Long getDamageFromPlayersFighterDroneAmount() {
    return damageFromPlayersFighterDroneAmount;
  }

  public void setDamageFromPlayersFighterDroneAmount(Long damageFromPlayersFighterDroneAmount) {
    this.damageFromPlayersFighterDroneAmount = damageFromPlayersFighterDroneAmount;
  }

  public GetCharactersCharacterIdStatsCombat damageFromPlayersFighterDroneNumShots(Long damageFromPlayersFighterDroneNumShots) {
    this.damageFromPlayersFighterDroneNumShots = damageFromPlayersFighterDroneNumShots;
    return this;
  }

  /**
   * damage_from_players_fighter_drone_num_shots integer
   *
   * @return damageFromPlayersFighterDroneNumShots
   **/
  @ApiModelProperty(value = "damage_from_players_fighter_drone_num_shots integer")


  public Long getDamageFromPlayersFighterDroneNumShots() {
    return damageFromPlayersFighterDroneNumShots;
  }

  public void setDamageFromPlayersFighterDroneNumShots(Long damageFromPlayersFighterDroneNumShots) {
    this.damageFromPlayersFighterDroneNumShots = damageFromPlayersFighterDroneNumShots;
  }

  public GetCharactersCharacterIdStatsCombat damageFromPlayersHybridAmount(Long damageFromPlayersHybridAmount) {
    this.damageFromPlayersHybridAmount = damageFromPlayersHybridAmount;
    return this;
  }

  /**
   * damage_from_players_hybrid_amount integer
   *
   * @return damageFromPlayersHybridAmount
   **/
  @ApiModelProperty(value = "damage_from_players_hybrid_amount integer")


  public Long getDamageFromPlayersHybridAmount() {
    return damageFromPlayersHybridAmount;
  }

  public void setDamageFromPlayersHybridAmount(Long damageFromPlayersHybridAmount) {
    this.damageFromPlayersHybridAmount = damageFromPlayersHybridAmount;
  }

  public GetCharactersCharacterIdStatsCombat damageFromPlayersHybridNumShots(Long damageFromPlayersHybridNumShots) {
    this.damageFromPlayersHybridNumShots = damageFromPlayersHybridNumShots;
    return this;
  }

  /**
   * damage_from_players_hybrid_num_shots integer
   *
   * @return damageFromPlayersHybridNumShots
   **/
  @ApiModelProperty(value = "damage_from_players_hybrid_num_shots integer")


  public Long getDamageFromPlayersHybridNumShots() {
    return damageFromPlayersHybridNumShots;
  }

  public void setDamageFromPlayersHybridNumShots(Long damageFromPlayersHybridNumShots) {
    this.damageFromPlayersHybridNumShots = damageFromPlayersHybridNumShots;
  }

  public GetCharactersCharacterIdStatsCombat damageFromPlayersMissileAmount(Long damageFromPlayersMissileAmount) {
    this.damageFromPlayersMissileAmount = damageFromPlayersMissileAmount;
    return this;
  }

  /**
   * damage_from_players_missile_amount integer
   *
   * @return damageFromPlayersMissileAmount
   **/
  @ApiModelProperty(value = "damage_from_players_missile_amount integer")


  public Long getDamageFromPlayersMissileAmount() {
    return damageFromPlayersMissileAmount;
  }

  public void setDamageFromPlayersMissileAmount(Long damageFromPlayersMissileAmount) {
    this.damageFromPlayersMissileAmount = damageFromPlayersMissileAmount;
  }

  public GetCharactersCharacterIdStatsCombat damageFromPlayersMissileNumShots(Long damageFromPlayersMissileNumShots) {
    this.damageFromPlayersMissileNumShots = damageFromPlayersMissileNumShots;
    return this;
  }

  /**
   * damage_from_players_missile_num_shots integer
   *
   * @return damageFromPlayersMissileNumShots
   **/
  @ApiModelProperty(value = "damage_from_players_missile_num_shots integer")


  public Long getDamageFromPlayersMissileNumShots() {
    return damageFromPlayersMissileNumShots;
  }

  public void setDamageFromPlayersMissileNumShots(Long damageFromPlayersMissileNumShots) {
    this.damageFromPlayersMissileNumShots = damageFromPlayersMissileNumShots;
  }

  public GetCharactersCharacterIdStatsCombat damageFromPlayersProjectileAmount(Long damageFromPlayersProjectileAmount) {
    this.damageFromPlayersProjectileAmount = damageFromPlayersProjectileAmount;
    return this;
  }

  /**
   * damage_from_players_projectile_amount integer
   *
   * @return damageFromPlayersProjectileAmount
   **/
  @ApiModelProperty(value = "damage_from_players_projectile_amount integer")


  public Long getDamageFromPlayersProjectileAmount() {
    return damageFromPlayersProjectileAmount;
  }

  public void setDamageFromPlayersProjectileAmount(Long damageFromPlayersProjectileAmount) {
    this.damageFromPlayersProjectileAmount = damageFromPlayersProjectileAmount;
  }

  public GetCharactersCharacterIdStatsCombat damageFromPlayersProjectileNumShots(Long damageFromPlayersProjectileNumShots) {
    this.damageFromPlayersProjectileNumShots = damageFromPlayersProjectileNumShots;
    return this;
  }

  /**
   * damage_from_players_projectile_num_shots integer
   *
   * @return damageFromPlayersProjectileNumShots
   **/
  @ApiModelProperty(value = "damage_from_players_projectile_num_shots integer")


  public Long getDamageFromPlayersProjectileNumShots() {
    return damageFromPlayersProjectileNumShots;
  }

  public void setDamageFromPlayersProjectileNumShots(Long damageFromPlayersProjectileNumShots) {
    this.damageFromPlayersProjectileNumShots = damageFromPlayersProjectileNumShots;
  }

  public GetCharactersCharacterIdStatsCombat damageFromPlayersSmartBombAmount(Long damageFromPlayersSmartBombAmount) {
    this.damageFromPlayersSmartBombAmount = damageFromPlayersSmartBombAmount;
    return this;
  }

  /**
   * damage_from_players_smart_bomb_amount integer
   *
   * @return damageFromPlayersSmartBombAmount
   **/
  @ApiModelProperty(value = "damage_from_players_smart_bomb_amount integer")


  public Long getDamageFromPlayersSmartBombAmount() {
    return damageFromPlayersSmartBombAmount;
  }

  public void setDamageFromPlayersSmartBombAmount(Long damageFromPlayersSmartBombAmount) {
    this.damageFromPlayersSmartBombAmount = damageFromPlayersSmartBombAmount;
  }

  public GetCharactersCharacterIdStatsCombat damageFromPlayersSmartBombNumShots(Long damageFromPlayersSmartBombNumShots) {
    this.damageFromPlayersSmartBombNumShots = damageFromPlayersSmartBombNumShots;
    return this;
  }

  /**
   * damage_from_players_smart_bomb_num_shots integer
   *
   * @return damageFromPlayersSmartBombNumShots
   **/
  @ApiModelProperty(value = "damage_from_players_smart_bomb_num_shots integer")


  public Long getDamageFromPlayersSmartBombNumShots() {
    return damageFromPlayersSmartBombNumShots;
  }

  public void setDamageFromPlayersSmartBombNumShots(Long damageFromPlayersSmartBombNumShots) {
    this.damageFromPlayersSmartBombNumShots = damageFromPlayersSmartBombNumShots;
  }

  public GetCharactersCharacterIdStatsCombat damageFromPlayersSuperAmount(Long damageFromPlayersSuperAmount) {
    this.damageFromPlayersSuperAmount = damageFromPlayersSuperAmount;
    return this;
  }

  /**
   * damage_from_players_super_amount integer
   *
   * @return damageFromPlayersSuperAmount
   **/
  @ApiModelProperty(value = "damage_from_players_super_amount integer")


  public Long getDamageFromPlayersSuperAmount() {
    return damageFromPlayersSuperAmount;
  }

  public void setDamageFromPlayersSuperAmount(Long damageFromPlayersSuperAmount) {
    this.damageFromPlayersSuperAmount = damageFromPlayersSuperAmount;
  }

  public GetCharactersCharacterIdStatsCombat damageFromPlayersSuperNumShots(Long damageFromPlayersSuperNumShots) {
    this.damageFromPlayersSuperNumShots = damageFromPlayersSuperNumShots;
    return this;
  }

  /**
   * damage_from_players_super_num_shots integer
   *
   * @return damageFromPlayersSuperNumShots
   **/
  @ApiModelProperty(value = "damage_from_players_super_num_shots integer")


  public Long getDamageFromPlayersSuperNumShots() {
    return damageFromPlayersSuperNumShots;
  }

  public void setDamageFromPlayersSuperNumShots(Long damageFromPlayersSuperNumShots) {
    this.damageFromPlayersSuperNumShots = damageFromPlayersSuperNumShots;
  }

  public GetCharactersCharacterIdStatsCombat damageFromStructuresTotalAmount(Long damageFromStructuresTotalAmount) {
    this.damageFromStructuresTotalAmount = damageFromStructuresTotalAmount;
    return this;
  }

  /**
   * damage_from_structures_total_amount integer
   *
   * @return damageFromStructuresTotalAmount
   **/
  @ApiModelProperty(value = "damage_from_structures_total_amount integer")


  public Long getDamageFromStructuresTotalAmount() {
    return damageFromStructuresTotalAmount;
  }

  public void setDamageFromStructuresTotalAmount(Long damageFromStructuresTotalAmount) {
    this.damageFromStructuresTotalAmount = damageFromStructuresTotalAmount;
  }

  public GetCharactersCharacterIdStatsCombat damageFromStructuresTotalNumShots(Long damageFromStructuresTotalNumShots) {
    this.damageFromStructuresTotalNumShots = damageFromStructuresTotalNumShots;
    return this;
  }

  /**
   * damage_from_structures_total_num_shots integer
   *
   * @return damageFromStructuresTotalNumShots
   **/
  @ApiModelProperty(value = "damage_from_structures_total_num_shots integer")


  public Long getDamageFromStructuresTotalNumShots() {
    return damageFromStructuresTotalNumShots;
  }

  public void setDamageFromStructuresTotalNumShots(Long damageFromStructuresTotalNumShots) {
    this.damageFromStructuresTotalNumShots = damageFromStructuresTotalNumShots;
  }

  public GetCharactersCharacterIdStatsCombat damageToPlayersBombAmount(Long damageToPlayersBombAmount) {
    this.damageToPlayersBombAmount = damageToPlayersBombAmount;
    return this;
  }

  /**
   * damage_to_players_bomb_amount integer
   *
   * @return damageToPlayersBombAmount
   **/
  @ApiModelProperty(value = "damage_to_players_bomb_amount integer")


  public Long getDamageToPlayersBombAmount() {
    return damageToPlayersBombAmount;
  }

  public void setDamageToPlayersBombAmount(Long damageToPlayersBombAmount) {
    this.damageToPlayersBombAmount = damageToPlayersBombAmount;
  }

  public GetCharactersCharacterIdStatsCombat damageToPlayersBombNumShots(Long damageToPlayersBombNumShots) {
    this.damageToPlayersBombNumShots = damageToPlayersBombNumShots;
    return this;
  }

  /**
   * damage_to_players_bomb_num_shots integer
   *
   * @return damageToPlayersBombNumShots
   **/
  @ApiModelProperty(value = "damage_to_players_bomb_num_shots integer")


  public Long getDamageToPlayersBombNumShots() {
    return damageToPlayersBombNumShots;
  }

  public void setDamageToPlayersBombNumShots(Long damageToPlayersBombNumShots) {
    this.damageToPlayersBombNumShots = damageToPlayersBombNumShots;
  }

  public GetCharactersCharacterIdStatsCombat damageToPlayersCombatDroneAmount(Long damageToPlayersCombatDroneAmount) {
    this.damageToPlayersCombatDroneAmount = damageToPlayersCombatDroneAmount;
    return this;
  }

  /**
   * damage_to_players_combat_drone_amount integer
   *
   * @return damageToPlayersCombatDroneAmount
   **/
  @ApiModelProperty(value = "damage_to_players_combat_drone_amount integer")


  public Long getDamageToPlayersCombatDroneAmount() {
    return damageToPlayersCombatDroneAmount;
  }

  public void setDamageToPlayersCombatDroneAmount(Long damageToPlayersCombatDroneAmount) {
    this.damageToPlayersCombatDroneAmount = damageToPlayersCombatDroneAmount;
  }

  public GetCharactersCharacterIdStatsCombat damageToPlayersCombatDroneNumShots(Long damageToPlayersCombatDroneNumShots) {
    this.damageToPlayersCombatDroneNumShots = damageToPlayersCombatDroneNumShots;
    return this;
  }

  /**
   * damage_to_players_combat_drone_num_shots integer
   *
   * @return damageToPlayersCombatDroneNumShots
   **/
  @ApiModelProperty(value = "damage_to_players_combat_drone_num_shots integer")


  public Long getDamageToPlayersCombatDroneNumShots() {
    return damageToPlayersCombatDroneNumShots;
  }

  public void setDamageToPlayersCombatDroneNumShots(Long damageToPlayersCombatDroneNumShots) {
    this.damageToPlayersCombatDroneNumShots = damageToPlayersCombatDroneNumShots;
  }

  public GetCharactersCharacterIdStatsCombat damageToPlayersEnergyAmount(Long damageToPlayersEnergyAmount) {
    this.damageToPlayersEnergyAmount = damageToPlayersEnergyAmount;
    return this;
  }

  /**
   * damage_to_players_energy_amount integer
   *
   * @return damageToPlayersEnergyAmount
   **/
  @ApiModelProperty(value = "damage_to_players_energy_amount integer")


  public Long getDamageToPlayersEnergyAmount() {
    return damageToPlayersEnergyAmount;
  }

  public void setDamageToPlayersEnergyAmount(Long damageToPlayersEnergyAmount) {
    this.damageToPlayersEnergyAmount = damageToPlayersEnergyAmount;
  }

  public GetCharactersCharacterIdStatsCombat damageToPlayersEnergyNumShots(Long damageToPlayersEnergyNumShots) {
    this.damageToPlayersEnergyNumShots = damageToPlayersEnergyNumShots;
    return this;
  }

  /**
   * damage_to_players_energy_num_shots integer
   *
   * @return damageToPlayersEnergyNumShots
   **/
  @ApiModelProperty(value = "damage_to_players_energy_num_shots integer")


  public Long getDamageToPlayersEnergyNumShots() {
    return damageToPlayersEnergyNumShots;
  }

  public void setDamageToPlayersEnergyNumShots(Long damageToPlayersEnergyNumShots) {
    this.damageToPlayersEnergyNumShots = damageToPlayersEnergyNumShots;
  }

  public GetCharactersCharacterIdStatsCombat damageToPlayersFighterBomberAmount(Long damageToPlayersFighterBomberAmount) {
    this.damageToPlayersFighterBomberAmount = damageToPlayersFighterBomberAmount;
    return this;
  }

  /**
   * damage_to_players_fighter_bomber_amount integer
   *
   * @return damageToPlayersFighterBomberAmount
   **/
  @ApiModelProperty(value = "damage_to_players_fighter_bomber_amount integer")


  public Long getDamageToPlayersFighterBomberAmount() {
    return damageToPlayersFighterBomberAmount;
  }

  public void setDamageToPlayersFighterBomberAmount(Long damageToPlayersFighterBomberAmount) {
    this.damageToPlayersFighterBomberAmount = damageToPlayersFighterBomberAmount;
  }

  public GetCharactersCharacterIdStatsCombat damageToPlayersFighterBomberNumShots(Long damageToPlayersFighterBomberNumShots) {
    this.damageToPlayersFighterBomberNumShots = damageToPlayersFighterBomberNumShots;
    return this;
  }

  /**
   * damage_to_players_fighter_bomber_num_shots integer
   *
   * @return damageToPlayersFighterBomberNumShots
   **/
  @ApiModelProperty(value = "damage_to_players_fighter_bomber_num_shots integer")


  public Long getDamageToPlayersFighterBomberNumShots() {
    return damageToPlayersFighterBomberNumShots;
  }

  public void setDamageToPlayersFighterBomberNumShots(Long damageToPlayersFighterBomberNumShots) {
    this.damageToPlayersFighterBomberNumShots = damageToPlayersFighterBomberNumShots;
  }

  public GetCharactersCharacterIdStatsCombat damageToPlayersFighterDroneAmount(Long damageToPlayersFighterDroneAmount) {
    this.damageToPlayersFighterDroneAmount = damageToPlayersFighterDroneAmount;
    return this;
  }

  /**
   * damage_to_players_fighter_drone_amount integer
   *
   * @return damageToPlayersFighterDroneAmount
   **/
  @ApiModelProperty(value = "damage_to_players_fighter_drone_amount integer")


  public Long getDamageToPlayersFighterDroneAmount() {
    return damageToPlayersFighterDroneAmount;
  }

  public void setDamageToPlayersFighterDroneAmount(Long damageToPlayersFighterDroneAmount) {
    this.damageToPlayersFighterDroneAmount = damageToPlayersFighterDroneAmount;
  }

  public GetCharactersCharacterIdStatsCombat damageToPlayersFighterDroneNumShots(Long damageToPlayersFighterDroneNumShots) {
    this.damageToPlayersFighterDroneNumShots = damageToPlayersFighterDroneNumShots;
    return this;
  }

  /**
   * damage_to_players_fighter_drone_num_shots integer
   *
   * @return damageToPlayersFighterDroneNumShots
   **/
  @ApiModelProperty(value = "damage_to_players_fighter_drone_num_shots integer")


  public Long getDamageToPlayersFighterDroneNumShots() {
    return damageToPlayersFighterDroneNumShots;
  }

  public void setDamageToPlayersFighterDroneNumShots(Long damageToPlayersFighterDroneNumShots) {
    this.damageToPlayersFighterDroneNumShots = damageToPlayersFighterDroneNumShots;
  }

  public GetCharactersCharacterIdStatsCombat damageToPlayersHybridAmount(Long damageToPlayersHybridAmount) {
    this.damageToPlayersHybridAmount = damageToPlayersHybridAmount;
    return this;
  }

  /**
   * damage_to_players_hybrid_amount integer
   *
   * @return damageToPlayersHybridAmount
   **/
  @ApiModelProperty(value = "damage_to_players_hybrid_amount integer")


  public Long getDamageToPlayersHybridAmount() {
    return damageToPlayersHybridAmount;
  }

  public void setDamageToPlayersHybridAmount(Long damageToPlayersHybridAmount) {
    this.damageToPlayersHybridAmount = damageToPlayersHybridAmount;
  }

  public GetCharactersCharacterIdStatsCombat damageToPlayersHybridNumShots(Long damageToPlayersHybridNumShots) {
    this.damageToPlayersHybridNumShots = damageToPlayersHybridNumShots;
    return this;
  }

  /**
   * damage_to_players_hybrid_num_shots integer
   *
   * @return damageToPlayersHybridNumShots
   **/
  @ApiModelProperty(value = "damage_to_players_hybrid_num_shots integer")


  public Long getDamageToPlayersHybridNumShots() {
    return damageToPlayersHybridNumShots;
  }

  public void setDamageToPlayersHybridNumShots(Long damageToPlayersHybridNumShots) {
    this.damageToPlayersHybridNumShots = damageToPlayersHybridNumShots;
  }

  public GetCharactersCharacterIdStatsCombat damageToPlayersMissileAmount(Long damageToPlayersMissileAmount) {
    this.damageToPlayersMissileAmount = damageToPlayersMissileAmount;
    return this;
  }

  /**
   * damage_to_players_missile_amount integer
   *
   * @return damageToPlayersMissileAmount
   **/
  @ApiModelProperty(value = "damage_to_players_missile_amount integer")


  public Long getDamageToPlayersMissileAmount() {
    return damageToPlayersMissileAmount;
  }

  public void setDamageToPlayersMissileAmount(Long damageToPlayersMissileAmount) {
    this.damageToPlayersMissileAmount = damageToPlayersMissileAmount;
  }

  public GetCharactersCharacterIdStatsCombat damageToPlayersMissileNumShots(Long damageToPlayersMissileNumShots) {
    this.damageToPlayersMissileNumShots = damageToPlayersMissileNumShots;
    return this;
  }

  /**
   * damage_to_players_missile_num_shots integer
   *
   * @return damageToPlayersMissileNumShots
   **/
  @ApiModelProperty(value = "damage_to_players_missile_num_shots integer")


  public Long getDamageToPlayersMissileNumShots() {
    return damageToPlayersMissileNumShots;
  }

  public void setDamageToPlayersMissileNumShots(Long damageToPlayersMissileNumShots) {
    this.damageToPlayersMissileNumShots = damageToPlayersMissileNumShots;
  }

  public GetCharactersCharacterIdStatsCombat damageToPlayersProjectileAmount(Long damageToPlayersProjectileAmount) {
    this.damageToPlayersProjectileAmount = damageToPlayersProjectileAmount;
    return this;
  }

  /**
   * damage_to_players_projectile_amount integer
   *
   * @return damageToPlayersProjectileAmount
   **/
  @ApiModelProperty(value = "damage_to_players_projectile_amount integer")


  public Long getDamageToPlayersProjectileAmount() {
    return damageToPlayersProjectileAmount;
  }

  public void setDamageToPlayersProjectileAmount(Long damageToPlayersProjectileAmount) {
    this.damageToPlayersProjectileAmount = damageToPlayersProjectileAmount;
  }

  public GetCharactersCharacterIdStatsCombat damageToPlayersProjectileNumShots(Long damageToPlayersProjectileNumShots) {
    this.damageToPlayersProjectileNumShots = damageToPlayersProjectileNumShots;
    return this;
  }

  /**
   * damage_to_players_projectile_num_shots integer
   *
   * @return damageToPlayersProjectileNumShots
   **/
  @ApiModelProperty(value = "damage_to_players_projectile_num_shots integer")


  public Long getDamageToPlayersProjectileNumShots() {
    return damageToPlayersProjectileNumShots;
  }

  public void setDamageToPlayersProjectileNumShots(Long damageToPlayersProjectileNumShots) {
    this.damageToPlayersProjectileNumShots = damageToPlayersProjectileNumShots;
  }

  public GetCharactersCharacterIdStatsCombat damageToPlayersSmartBombAmount(Long damageToPlayersSmartBombAmount) {
    this.damageToPlayersSmartBombAmount = damageToPlayersSmartBombAmount;
    return this;
  }

  /**
   * damage_to_players_smart_bomb_amount integer
   *
   * @return damageToPlayersSmartBombAmount
   **/
  @ApiModelProperty(value = "damage_to_players_smart_bomb_amount integer")


  public Long getDamageToPlayersSmartBombAmount() {
    return damageToPlayersSmartBombAmount;
  }

  public void setDamageToPlayersSmartBombAmount(Long damageToPlayersSmartBombAmount) {
    this.damageToPlayersSmartBombAmount = damageToPlayersSmartBombAmount;
  }

  public GetCharactersCharacterIdStatsCombat damageToPlayersSmartBombNumShots(Long damageToPlayersSmartBombNumShots) {
    this.damageToPlayersSmartBombNumShots = damageToPlayersSmartBombNumShots;
    return this;
  }

  /**
   * damage_to_players_smart_bomb_num_shots integer
   *
   * @return damageToPlayersSmartBombNumShots
   **/
  @ApiModelProperty(value = "damage_to_players_smart_bomb_num_shots integer")


  public Long getDamageToPlayersSmartBombNumShots() {
    return damageToPlayersSmartBombNumShots;
  }

  public void setDamageToPlayersSmartBombNumShots(Long damageToPlayersSmartBombNumShots) {
    this.damageToPlayersSmartBombNumShots = damageToPlayersSmartBombNumShots;
  }

  public GetCharactersCharacterIdStatsCombat damageToPlayersSuperAmount(Long damageToPlayersSuperAmount) {
    this.damageToPlayersSuperAmount = damageToPlayersSuperAmount;
    return this;
  }

  /**
   * damage_to_players_super_amount integer
   *
   * @return damageToPlayersSuperAmount
   **/
  @ApiModelProperty(value = "damage_to_players_super_amount integer")


  public Long getDamageToPlayersSuperAmount() {
    return damageToPlayersSuperAmount;
  }

  public void setDamageToPlayersSuperAmount(Long damageToPlayersSuperAmount) {
    this.damageToPlayersSuperAmount = damageToPlayersSuperAmount;
  }

  public GetCharactersCharacterIdStatsCombat damageToPlayersSuperNumShots(Long damageToPlayersSuperNumShots) {
    this.damageToPlayersSuperNumShots = damageToPlayersSuperNumShots;
    return this;
  }

  /**
   * damage_to_players_super_num_shots integer
   *
   * @return damageToPlayersSuperNumShots
   **/
  @ApiModelProperty(value = "damage_to_players_super_num_shots integer")


  public Long getDamageToPlayersSuperNumShots() {
    return damageToPlayersSuperNumShots;
  }

  public void setDamageToPlayersSuperNumShots(Long damageToPlayersSuperNumShots) {
    this.damageToPlayersSuperNumShots = damageToPlayersSuperNumShots;
  }

  public GetCharactersCharacterIdStatsCombat damageToStructuresTotalAmount(Long damageToStructuresTotalAmount) {
    this.damageToStructuresTotalAmount = damageToStructuresTotalAmount;
    return this;
  }

  /**
   * damage_to_structures_total_amount integer
   *
   * @return damageToStructuresTotalAmount
   **/
  @ApiModelProperty(value = "damage_to_structures_total_amount integer")


  public Long getDamageToStructuresTotalAmount() {
    return damageToStructuresTotalAmount;
  }

  public void setDamageToStructuresTotalAmount(Long damageToStructuresTotalAmount) {
    this.damageToStructuresTotalAmount = damageToStructuresTotalAmount;
  }

  public GetCharactersCharacterIdStatsCombat damageToStructuresTotalNumShots(Long damageToStructuresTotalNumShots) {
    this.damageToStructuresTotalNumShots = damageToStructuresTotalNumShots;
    return this;
  }

  /**
   * damage_to_structures_total_num_shots integer
   *
   * @return damageToStructuresTotalNumShots
   **/
  @ApiModelProperty(value = "damage_to_structures_total_num_shots integer")


  public Long getDamageToStructuresTotalNumShots() {
    return damageToStructuresTotalNumShots;
  }

  public void setDamageToStructuresTotalNumShots(Long damageToStructuresTotalNumShots) {
    this.damageToStructuresTotalNumShots = damageToStructuresTotalNumShots;
  }

  public GetCharactersCharacterIdStatsCombat deathsHighSec(Long deathsHighSec) {
    this.deathsHighSec = deathsHighSec;
    return this;
  }

  /**
   * deaths_high_sec integer
   *
   * @return deathsHighSec
   **/
  @ApiModelProperty(value = "deaths_high_sec integer")


  public Long getDeathsHighSec() {
    return deathsHighSec;
  }

  public void setDeathsHighSec(Long deathsHighSec) {
    this.deathsHighSec = deathsHighSec;
  }

  public GetCharactersCharacterIdStatsCombat deathsLowSec(Long deathsLowSec) {
    this.deathsLowSec = deathsLowSec;
    return this;
  }

  /**
   * deaths_low_sec integer
   *
   * @return deathsLowSec
   **/
  @ApiModelProperty(value = "deaths_low_sec integer")


  public Long getDeathsLowSec() {
    return deathsLowSec;
  }

  public void setDeathsLowSec(Long deathsLowSec) {
    this.deathsLowSec = deathsLowSec;
  }

  public GetCharactersCharacterIdStatsCombat deathsNullSec(Long deathsNullSec) {
    this.deathsNullSec = deathsNullSec;
    return this;
  }

  /**
   * deaths_null_sec integer
   *
   * @return deathsNullSec
   **/
  @ApiModelProperty(value = "deaths_null_sec integer")


  public Long getDeathsNullSec() {
    return deathsNullSec;
  }

  public void setDeathsNullSec(Long deathsNullSec) {
    this.deathsNullSec = deathsNullSec;
  }

  public GetCharactersCharacterIdStatsCombat deathsPodHighSec(Long deathsPodHighSec) {
    this.deathsPodHighSec = deathsPodHighSec;
    return this;
  }

  /**
   * deaths_pod_high_sec integer
   *
   * @return deathsPodHighSec
   **/
  @ApiModelProperty(value = "deaths_pod_high_sec integer")


  public Long getDeathsPodHighSec() {
    return deathsPodHighSec;
  }

  public void setDeathsPodHighSec(Long deathsPodHighSec) {
    this.deathsPodHighSec = deathsPodHighSec;
  }

  public GetCharactersCharacterIdStatsCombat deathsPodLowSec(Long deathsPodLowSec) {
    this.deathsPodLowSec = deathsPodLowSec;
    return this;
  }

  /**
   * deaths_pod_low_sec integer
   *
   * @return deathsPodLowSec
   **/
  @ApiModelProperty(value = "deaths_pod_low_sec integer")


  public Long getDeathsPodLowSec() {
    return deathsPodLowSec;
  }

  public void setDeathsPodLowSec(Long deathsPodLowSec) {
    this.deathsPodLowSec = deathsPodLowSec;
  }

  public GetCharactersCharacterIdStatsCombat deathsPodNullSec(Long deathsPodNullSec) {
    this.deathsPodNullSec = deathsPodNullSec;
    return this;
  }

  /**
   * deaths_pod_null_sec integer
   *
   * @return deathsPodNullSec
   **/
  @ApiModelProperty(value = "deaths_pod_null_sec integer")


  public Long getDeathsPodNullSec() {
    return deathsPodNullSec;
  }

  public void setDeathsPodNullSec(Long deathsPodNullSec) {
    this.deathsPodNullSec = deathsPodNullSec;
  }

  public GetCharactersCharacterIdStatsCombat deathsPodWormhole(Long deathsPodWormhole) {
    this.deathsPodWormhole = deathsPodWormhole;
    return this;
  }

  /**
   * deaths_pod_wormhole integer
   *
   * @return deathsPodWormhole
   **/
  @ApiModelProperty(value = "deaths_pod_wormhole integer")


  public Long getDeathsPodWormhole() {
    return deathsPodWormhole;
  }

  public void setDeathsPodWormhole(Long deathsPodWormhole) {
    this.deathsPodWormhole = deathsPodWormhole;
  }

  public GetCharactersCharacterIdStatsCombat deathsWormhole(Long deathsWormhole) {
    this.deathsWormhole = deathsWormhole;
    return this;
  }

  /**
   * deaths_wormhole integer
   *
   * @return deathsWormhole
   **/
  @ApiModelProperty(value = "deaths_wormhole integer")


  public Long getDeathsWormhole() {
    return deathsWormhole;
  }

  public void setDeathsWormhole(Long deathsWormhole) {
    this.deathsWormhole = deathsWormhole;
  }

  public GetCharactersCharacterIdStatsCombat droneEngage(Long droneEngage) {
    this.droneEngage = droneEngage;
    return this;
  }

  /**
   * drone_engage integer
   *
   * @return droneEngage
   **/
  @ApiModelProperty(value = "drone_engage integer")


  public Long getDroneEngage() {
    return droneEngage;
  }

  public void setDroneEngage(Long droneEngage) {
    this.droneEngage = droneEngage;
  }

  public GetCharactersCharacterIdStatsCombat dscans(Long dscans) {
    this.dscans = dscans;
    return this;
  }

  /**
   * dscans integer
   *
   * @return dscans
   **/
  @ApiModelProperty(value = "dscans integer")


  public Long getDscans() {
    return dscans;
  }

  public void setDscans(Long dscans) {
    this.dscans = dscans;
  }

  public GetCharactersCharacterIdStatsCombat duelRequested(Long duelRequested) {
    this.duelRequested = duelRequested;
    return this;
  }

  /**
   * duel_requested integer
   *
   * @return duelRequested
   **/
  @ApiModelProperty(value = "duel_requested integer")


  public Long getDuelRequested() {
    return duelRequested;
  }

  public void setDuelRequested(Long duelRequested) {
    this.duelRequested = duelRequested;
  }

  public GetCharactersCharacterIdStatsCombat engagementRegister(Long engagementRegister) {
    this.engagementRegister = engagementRegister;
    return this;
  }

  /**
   * engagement_register integer
   *
   * @return engagementRegister
   **/
  @ApiModelProperty(value = "engagement_register integer")


  public Long getEngagementRegister() {
    return engagementRegister;
  }

  public void setEngagementRegister(Long engagementRegister) {
    this.engagementRegister = engagementRegister;
  }

  public GetCharactersCharacterIdStatsCombat killsAssists(Long killsAssists) {
    this.killsAssists = killsAssists;
    return this;
  }

  /**
   * kills_assists integer
   *
   * @return killsAssists
   **/
  @ApiModelProperty(value = "kills_assists integer")


  public Long getKillsAssists() {
    return killsAssists;
  }

  public void setKillsAssists(Long killsAssists) {
    this.killsAssists = killsAssists;
  }

  public GetCharactersCharacterIdStatsCombat killsHighSec(Long killsHighSec) {
    this.killsHighSec = killsHighSec;
    return this;
  }

  /**
   * kills_high_sec integer
   *
   * @return killsHighSec
   **/
  @ApiModelProperty(value = "kills_high_sec integer")


  public Long getKillsHighSec() {
    return killsHighSec;
  }

  public void setKillsHighSec(Long killsHighSec) {
    this.killsHighSec = killsHighSec;
  }

  public GetCharactersCharacterIdStatsCombat killsLowSec(Long killsLowSec) {
    this.killsLowSec = killsLowSec;
    return this;
  }

  /**
   * kills_low_sec integer
   *
   * @return killsLowSec
   **/
  @ApiModelProperty(value = "kills_low_sec integer")


  public Long getKillsLowSec() {
    return killsLowSec;
  }

  public void setKillsLowSec(Long killsLowSec) {
    this.killsLowSec = killsLowSec;
  }

  public GetCharactersCharacterIdStatsCombat killsNullSec(Long killsNullSec) {
    this.killsNullSec = killsNullSec;
    return this;
  }

  /**
   * kills_null_sec integer
   *
   * @return killsNullSec
   **/
  @ApiModelProperty(value = "kills_null_sec integer")


  public Long getKillsNullSec() {
    return killsNullSec;
  }

  public void setKillsNullSec(Long killsNullSec) {
    this.killsNullSec = killsNullSec;
  }

  public GetCharactersCharacterIdStatsCombat killsPodHighSec(Long killsPodHighSec) {
    this.killsPodHighSec = killsPodHighSec;
    return this;
  }

  /**
   * kills_pod_high_sec integer
   *
   * @return killsPodHighSec
   **/
  @ApiModelProperty(value = "kills_pod_high_sec integer")


  public Long getKillsPodHighSec() {
    return killsPodHighSec;
  }

  public void setKillsPodHighSec(Long killsPodHighSec) {
    this.killsPodHighSec = killsPodHighSec;
  }

  public GetCharactersCharacterIdStatsCombat killsPodLowSec(Long killsPodLowSec) {
    this.killsPodLowSec = killsPodLowSec;
    return this;
  }

  /**
   * kills_pod_low_sec integer
   *
   * @return killsPodLowSec
   **/
  @ApiModelProperty(value = "kills_pod_low_sec integer")


  public Long getKillsPodLowSec() {
    return killsPodLowSec;
  }

  public void setKillsPodLowSec(Long killsPodLowSec) {
    this.killsPodLowSec = killsPodLowSec;
  }

  public GetCharactersCharacterIdStatsCombat killsPodNullSec(Long killsPodNullSec) {
    this.killsPodNullSec = killsPodNullSec;
    return this;
  }

  /**
   * kills_pod_null_sec integer
   *
   * @return killsPodNullSec
   **/
  @ApiModelProperty(value = "kills_pod_null_sec integer")


  public Long getKillsPodNullSec() {
    return killsPodNullSec;
  }

  public void setKillsPodNullSec(Long killsPodNullSec) {
    this.killsPodNullSec = killsPodNullSec;
  }

  public GetCharactersCharacterIdStatsCombat killsPodWormhole(Long killsPodWormhole) {
    this.killsPodWormhole = killsPodWormhole;
    return this;
  }

  /**
   * kills_pod_wormhole integer
   *
   * @return killsPodWormhole
   **/
  @ApiModelProperty(value = "kills_pod_wormhole integer")


  public Long getKillsPodWormhole() {
    return killsPodWormhole;
  }

  public void setKillsPodWormhole(Long killsPodWormhole) {
    this.killsPodWormhole = killsPodWormhole;
  }

  public GetCharactersCharacterIdStatsCombat killsWormhole(Long killsWormhole) {
    this.killsWormhole = killsWormhole;
    return this;
  }

  /**
   * kills_wormhole integer
   *
   * @return killsWormhole
   **/
  @ApiModelProperty(value = "kills_wormhole integer")


  public Long getKillsWormhole() {
    return killsWormhole;
  }

  public void setKillsWormhole(Long killsWormhole) {
    this.killsWormhole = killsWormhole;
  }

  public GetCharactersCharacterIdStatsCombat npcFlagSet(Long npcFlagSet) {
    this.npcFlagSet = npcFlagSet;
    return this;
  }

  /**
   * npc_flag_set integer
   *
   * @return npcFlagSet
   **/
  @ApiModelProperty(value = "npc_flag_set integer")


  public Long getNpcFlagSet() {
    return npcFlagSet;
  }

  public void setNpcFlagSet(Long npcFlagSet) {
    this.npcFlagSet = npcFlagSet;
  }

  public GetCharactersCharacterIdStatsCombat probeScans(Long probeScans) {
    this.probeScans = probeScans;
    return this;
  }

  /**
   * probe_scans integer
   *
   * @return probeScans
   **/
  @ApiModelProperty(value = "probe_scans integer")


  public Long getProbeScans() {
    return probeScans;
  }

  public void setProbeScans(Long probeScans) {
    this.probeScans = probeScans;
  }

  public GetCharactersCharacterIdStatsCombat pvpFlagSet(Long pvpFlagSet) {
    this.pvpFlagSet = pvpFlagSet;
    return this;
  }

  /**
   * pvp_flag_set integer
   *
   * @return pvpFlagSet
   **/
  @ApiModelProperty(value = "pvp_flag_set integer")


  public Long getPvpFlagSet() {
    return pvpFlagSet;
  }

  public void setPvpFlagSet(Long pvpFlagSet) {
    this.pvpFlagSet = pvpFlagSet;
  }

  public GetCharactersCharacterIdStatsCombat repairArmorByRemoteAmount(Long repairArmorByRemoteAmount) {
    this.repairArmorByRemoteAmount = repairArmorByRemoteAmount;
    return this;
  }

  /**
   * repair_armor_by_remote_amount integer
   *
   * @return repairArmorByRemoteAmount
   **/
  @ApiModelProperty(value = "repair_armor_by_remote_amount integer")


  public Long getRepairArmorByRemoteAmount() {
    return repairArmorByRemoteAmount;
  }

  public void setRepairArmorByRemoteAmount(Long repairArmorByRemoteAmount) {
    this.repairArmorByRemoteAmount = repairArmorByRemoteAmount;
  }

  public GetCharactersCharacterIdStatsCombat repairArmorRemoteAmount(Long repairArmorRemoteAmount) {
    this.repairArmorRemoteAmount = repairArmorRemoteAmount;
    return this;
  }

  /**
   * repair_armor_remote_amount integer
   *
   * @return repairArmorRemoteAmount
   **/
  @ApiModelProperty(value = "repair_armor_remote_amount integer")


  public Long getRepairArmorRemoteAmount() {
    return repairArmorRemoteAmount;
  }

  public void setRepairArmorRemoteAmount(Long repairArmorRemoteAmount) {
    this.repairArmorRemoteAmount = repairArmorRemoteAmount;
  }

  public GetCharactersCharacterIdStatsCombat repairArmorSelfAmount(Long repairArmorSelfAmount) {
    this.repairArmorSelfAmount = repairArmorSelfAmount;
    return this;
  }

  /**
   * repair_armor_self_amount integer
   *
   * @return repairArmorSelfAmount
   **/
  @ApiModelProperty(value = "repair_armor_self_amount integer")


  public Long getRepairArmorSelfAmount() {
    return repairArmorSelfAmount;
  }

  public void setRepairArmorSelfAmount(Long repairArmorSelfAmount) {
    this.repairArmorSelfAmount = repairArmorSelfAmount;
  }

  public GetCharactersCharacterIdStatsCombat repairCapacitorByRemoteAmount(Long repairCapacitorByRemoteAmount) {
    this.repairCapacitorByRemoteAmount = repairCapacitorByRemoteAmount;
    return this;
  }

  /**
   * repair_capacitor_by_remote_amount integer
   *
   * @return repairCapacitorByRemoteAmount
   **/
  @ApiModelProperty(value = "repair_capacitor_by_remote_amount integer")


  public Long getRepairCapacitorByRemoteAmount() {
    return repairCapacitorByRemoteAmount;
  }

  public void setRepairCapacitorByRemoteAmount(Long repairCapacitorByRemoteAmount) {
    this.repairCapacitorByRemoteAmount = repairCapacitorByRemoteAmount;
  }

  public GetCharactersCharacterIdStatsCombat repairCapacitorRemoteAmount(Long repairCapacitorRemoteAmount) {
    this.repairCapacitorRemoteAmount = repairCapacitorRemoteAmount;
    return this;
  }

  /**
   * repair_capacitor_remote_amount integer
   *
   * @return repairCapacitorRemoteAmount
   **/
  @ApiModelProperty(value = "repair_capacitor_remote_amount integer")


  public Long getRepairCapacitorRemoteAmount() {
    return repairCapacitorRemoteAmount;
  }

  public void setRepairCapacitorRemoteAmount(Long repairCapacitorRemoteAmount) {
    this.repairCapacitorRemoteAmount = repairCapacitorRemoteAmount;
  }

  public GetCharactersCharacterIdStatsCombat repairCapacitorSelfAmount(Long repairCapacitorSelfAmount) {
    this.repairCapacitorSelfAmount = repairCapacitorSelfAmount;
    return this;
  }

  /**
   * repair_capacitor_self_amount integer
   *
   * @return repairCapacitorSelfAmount
   **/
  @ApiModelProperty(value = "repair_capacitor_self_amount integer")


  public Long getRepairCapacitorSelfAmount() {
    return repairCapacitorSelfAmount;
  }

  public void setRepairCapacitorSelfAmount(Long repairCapacitorSelfAmount) {
    this.repairCapacitorSelfAmount = repairCapacitorSelfAmount;
  }

  public GetCharactersCharacterIdStatsCombat repairHullByRemoteAmount(Long repairHullByRemoteAmount) {
    this.repairHullByRemoteAmount = repairHullByRemoteAmount;
    return this;
  }

  /**
   * repair_hull_by_remote_amount integer
   *
   * @return repairHullByRemoteAmount
   **/
  @ApiModelProperty(value = "repair_hull_by_remote_amount integer")


  public Long getRepairHullByRemoteAmount() {
    return repairHullByRemoteAmount;
  }

  public void setRepairHullByRemoteAmount(Long repairHullByRemoteAmount) {
    this.repairHullByRemoteAmount = repairHullByRemoteAmount;
  }

  public GetCharactersCharacterIdStatsCombat repairHullRemoteAmount(Long repairHullRemoteAmount) {
    this.repairHullRemoteAmount = repairHullRemoteAmount;
    return this;
  }

  /**
   * repair_hull_remote_amount integer
   *
   * @return repairHullRemoteAmount
   **/
  @ApiModelProperty(value = "repair_hull_remote_amount integer")


  public Long getRepairHullRemoteAmount() {
    return repairHullRemoteAmount;
  }

  public void setRepairHullRemoteAmount(Long repairHullRemoteAmount) {
    this.repairHullRemoteAmount = repairHullRemoteAmount;
  }

  public GetCharactersCharacterIdStatsCombat repairHullSelfAmount(Long repairHullSelfAmount) {
    this.repairHullSelfAmount = repairHullSelfAmount;
    return this;
  }

  /**
   * repair_hull_self_amount integer
   *
   * @return repairHullSelfAmount
   **/
  @ApiModelProperty(value = "repair_hull_self_amount integer")


  public Long getRepairHullSelfAmount() {
    return repairHullSelfAmount;
  }

  public void setRepairHullSelfAmount(Long repairHullSelfAmount) {
    this.repairHullSelfAmount = repairHullSelfAmount;
  }

  public GetCharactersCharacterIdStatsCombat repairShieldByRemoteAmount(Long repairShieldByRemoteAmount) {
    this.repairShieldByRemoteAmount = repairShieldByRemoteAmount;
    return this;
  }

  /**
   * repair_shield_by_remote_amount integer
   *
   * @return repairShieldByRemoteAmount
   **/
  @ApiModelProperty(value = "repair_shield_by_remote_amount integer")


  public Long getRepairShieldByRemoteAmount() {
    return repairShieldByRemoteAmount;
  }

  public void setRepairShieldByRemoteAmount(Long repairShieldByRemoteAmount) {
    this.repairShieldByRemoteAmount = repairShieldByRemoteAmount;
  }

  public GetCharactersCharacterIdStatsCombat repairShieldRemoteAmount(Long repairShieldRemoteAmount) {
    this.repairShieldRemoteAmount = repairShieldRemoteAmount;
    return this;
  }

  /**
   * repair_shield_remote_amount integer
   *
   * @return repairShieldRemoteAmount
   **/
  @ApiModelProperty(value = "repair_shield_remote_amount integer")


  public Long getRepairShieldRemoteAmount() {
    return repairShieldRemoteAmount;
  }

  public void setRepairShieldRemoteAmount(Long repairShieldRemoteAmount) {
    this.repairShieldRemoteAmount = repairShieldRemoteAmount;
  }

  public GetCharactersCharacterIdStatsCombat repairShieldSelfAmount(Long repairShieldSelfAmount) {
    this.repairShieldSelfAmount = repairShieldSelfAmount;
    return this;
  }

  /**
   * repair_shield_self_amount integer
   *
   * @return repairShieldSelfAmount
   **/
  @ApiModelProperty(value = "repair_shield_self_amount integer")


  public Long getRepairShieldSelfAmount() {
    return repairShieldSelfAmount;
  }

  public void setRepairShieldSelfAmount(Long repairShieldSelfAmount) {
    this.repairShieldSelfAmount = repairShieldSelfAmount;
  }

  public GetCharactersCharacterIdStatsCombat selfDestructs(Long selfDestructs) {
    this.selfDestructs = selfDestructs;
    return this;
  }

  /**
   * self_destructs integer
   *
   * @return selfDestructs
   **/
  @ApiModelProperty(value = "self_destructs integer")


  public Long getSelfDestructs() {
    return selfDestructs;
  }

  public void setSelfDestructs(Long selfDestructs) {
    this.selfDestructs = selfDestructs;
  }

  public GetCharactersCharacterIdStatsCombat warpScramblePc(Long warpScramblePc) {
    this.warpScramblePc = warpScramblePc;
    return this;
  }

  /**
   * warp_scramble_pc integer
   *
   * @return warpScramblePc
   **/
  @ApiModelProperty(value = "warp_scramble_pc integer")


  public Long getWarpScramblePc() {
    return warpScramblePc;
  }

  public void setWarpScramblePc(Long warpScramblePc) {
    this.warpScramblePc = warpScramblePc;
  }

  public GetCharactersCharacterIdStatsCombat warpScrambledbyNpc(Long warpScrambledbyNpc) {
    this.warpScrambledbyNpc = warpScrambledbyNpc;
    return this;
  }

  /**
   * warp_scrambledby_npc integer
   *
   * @return warpScrambledbyNpc
   **/
  @ApiModelProperty(value = "warp_scrambledby_npc integer")


  public Long getWarpScrambledbyNpc() {
    return warpScrambledbyNpc;
  }

  public void setWarpScrambledbyNpc(Long warpScrambledbyNpc) {
    this.warpScrambledbyNpc = warpScrambledbyNpc;
  }

  public GetCharactersCharacterIdStatsCombat warpScrambledbyPc(Long warpScrambledbyPc) {
    this.warpScrambledbyPc = warpScrambledbyPc;
    return this;
  }

  /**
   * warp_scrambledby_pc integer
   *
   * @return warpScrambledbyPc
   **/
  @ApiModelProperty(value = "warp_scrambledby_pc integer")


  public Long getWarpScrambledbyPc() {
    return warpScrambledbyPc;
  }

  public void setWarpScrambledbyPc(Long warpScrambledbyPc) {
    this.warpScrambledbyPc = warpScrambledbyPc;
  }

  public GetCharactersCharacterIdStatsCombat weaponFlagSet(Long weaponFlagSet) {
    this.weaponFlagSet = weaponFlagSet;
    return this;
  }

  /**
   * weapon_flag_set integer
   *
   * @return weaponFlagSet
   **/
  @ApiModelProperty(value = "weapon_flag_set integer")


  public Long getWeaponFlagSet() {
    return weaponFlagSet;
  }

  public void setWeaponFlagSet(Long weaponFlagSet) {
    this.weaponFlagSet = weaponFlagSet;
  }

  public GetCharactersCharacterIdStatsCombat webifiedbyNpc(Long webifiedbyNpc) {
    this.webifiedbyNpc = webifiedbyNpc;
    return this;
  }

  /**
   * webifiedby_npc integer
   *
   * @return webifiedbyNpc
   **/
  @ApiModelProperty(value = "webifiedby_npc integer")


  public Long getWebifiedbyNpc() {
    return webifiedbyNpc;
  }

  public void setWebifiedbyNpc(Long webifiedbyNpc) {
    this.webifiedbyNpc = webifiedbyNpc;
  }

  public GetCharactersCharacterIdStatsCombat webifiedbyPc(Long webifiedbyPc) {
    this.webifiedbyPc = webifiedbyPc;
    return this;
  }

  /**
   * webifiedby_pc integer
   *
   * @return webifiedbyPc
   **/
  @ApiModelProperty(value = "webifiedby_pc integer")


  public Long getWebifiedbyPc() {
    return webifiedbyPc;
  }

  public void setWebifiedbyPc(Long webifiedbyPc) {
    this.webifiedbyPc = webifiedbyPc;
  }

  public GetCharactersCharacterIdStatsCombat webifyingPc(Long webifyingPc) {
    this.webifyingPc = webifyingPc;
    return this;
  }

  /**
   * webifying_pc integer
   *
   * @return webifyingPc
   **/
  @ApiModelProperty(value = "webifying_pc integer")


  public Long getWebifyingPc() {
    return webifyingPc;
  }

  public void setWebifyingPc(Long webifyingPc) {
    this.webifyingPc = webifyingPc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdStatsCombat getCharactersCharacterIdStatsCombat = (GetCharactersCharacterIdStatsCombat) o;
    return Objects.equals(this.capDrainedbyNpc, getCharactersCharacterIdStatsCombat.capDrainedbyNpc) &&
        Objects.equals(this.capDrainedbyPc, getCharactersCharacterIdStatsCombat.capDrainedbyPc) &&
        Objects.equals(this.capDrainingPc, getCharactersCharacterIdStatsCombat.capDrainingPc) &&
        Objects.equals(this.criminalFlagSet, getCharactersCharacterIdStatsCombat.criminalFlagSet) &&
        Objects.equals(this.damageFromNpCsAmount, getCharactersCharacterIdStatsCombat.damageFromNpCsAmount) &&
        Objects.equals(this.damageFromNpCsNumShots, getCharactersCharacterIdStatsCombat.damageFromNpCsNumShots) &&
        Objects.equals(this.damageFromPlayersBombAmount, getCharactersCharacterIdStatsCombat.damageFromPlayersBombAmount) &&
        Objects.equals(this.damageFromPlayersBombNumShots, getCharactersCharacterIdStatsCombat.damageFromPlayersBombNumShots) &&
        Objects.equals(this.damageFromPlayersCombatDroneAmount, getCharactersCharacterIdStatsCombat.damageFromPlayersCombatDroneAmount) &&
        Objects.equals(this.damageFromPlayersCombatDroneNumShots, getCharactersCharacterIdStatsCombat.damageFromPlayersCombatDroneNumShots) &&
        Objects.equals(this.damageFromPlayersEnergyAmount, getCharactersCharacterIdStatsCombat.damageFromPlayersEnergyAmount) &&
        Objects.equals(this.damageFromPlayersEnergyNumShots, getCharactersCharacterIdStatsCombat.damageFromPlayersEnergyNumShots) &&
        Objects.equals(this.damageFromPlayersFighterBomberAmount, getCharactersCharacterIdStatsCombat.damageFromPlayersFighterBomberAmount) &&
        Objects.equals(this.damageFromPlayersFighterBomberNumShots, getCharactersCharacterIdStatsCombat.damageFromPlayersFighterBomberNumShots) &&
        Objects.equals(this.damageFromPlayersFighterDroneAmount, getCharactersCharacterIdStatsCombat.damageFromPlayersFighterDroneAmount) &&
        Objects.equals(this.damageFromPlayersFighterDroneNumShots, getCharactersCharacterIdStatsCombat.damageFromPlayersFighterDroneNumShots) &&
        Objects.equals(this.damageFromPlayersHybridAmount, getCharactersCharacterIdStatsCombat.damageFromPlayersHybridAmount) &&
        Objects.equals(this.damageFromPlayersHybridNumShots, getCharactersCharacterIdStatsCombat.damageFromPlayersHybridNumShots) &&
        Objects.equals(this.damageFromPlayersMissileAmount, getCharactersCharacterIdStatsCombat.damageFromPlayersMissileAmount) &&
        Objects.equals(this.damageFromPlayersMissileNumShots, getCharactersCharacterIdStatsCombat.damageFromPlayersMissileNumShots) &&
        Objects.equals(this.damageFromPlayersProjectileAmount, getCharactersCharacterIdStatsCombat.damageFromPlayersProjectileAmount) &&
        Objects.equals(this.damageFromPlayersProjectileNumShots, getCharactersCharacterIdStatsCombat.damageFromPlayersProjectileNumShots) &&
        Objects.equals(this.damageFromPlayersSmartBombAmount, getCharactersCharacterIdStatsCombat.damageFromPlayersSmartBombAmount) &&
        Objects.equals(this.damageFromPlayersSmartBombNumShots, getCharactersCharacterIdStatsCombat.damageFromPlayersSmartBombNumShots) &&
        Objects.equals(this.damageFromPlayersSuperAmount, getCharactersCharacterIdStatsCombat.damageFromPlayersSuperAmount) &&
        Objects.equals(this.damageFromPlayersSuperNumShots, getCharactersCharacterIdStatsCombat.damageFromPlayersSuperNumShots) &&
        Objects.equals(this.damageFromStructuresTotalAmount, getCharactersCharacterIdStatsCombat.damageFromStructuresTotalAmount) &&
        Objects.equals(this.damageFromStructuresTotalNumShots, getCharactersCharacterIdStatsCombat.damageFromStructuresTotalNumShots) &&
        Objects.equals(this.damageToPlayersBombAmount, getCharactersCharacterIdStatsCombat.damageToPlayersBombAmount) &&
        Objects.equals(this.damageToPlayersBombNumShots, getCharactersCharacterIdStatsCombat.damageToPlayersBombNumShots) &&
        Objects.equals(this.damageToPlayersCombatDroneAmount, getCharactersCharacterIdStatsCombat.damageToPlayersCombatDroneAmount) &&
        Objects.equals(this.damageToPlayersCombatDroneNumShots, getCharactersCharacterIdStatsCombat.damageToPlayersCombatDroneNumShots) &&
        Objects.equals(this.damageToPlayersEnergyAmount, getCharactersCharacterIdStatsCombat.damageToPlayersEnergyAmount) &&
        Objects.equals(this.damageToPlayersEnergyNumShots, getCharactersCharacterIdStatsCombat.damageToPlayersEnergyNumShots) &&
        Objects.equals(this.damageToPlayersFighterBomberAmount, getCharactersCharacterIdStatsCombat.damageToPlayersFighterBomberAmount) &&
        Objects.equals(this.damageToPlayersFighterBomberNumShots, getCharactersCharacterIdStatsCombat.damageToPlayersFighterBomberNumShots) &&
        Objects.equals(this.damageToPlayersFighterDroneAmount, getCharactersCharacterIdStatsCombat.damageToPlayersFighterDroneAmount) &&
        Objects.equals(this.damageToPlayersFighterDroneNumShots, getCharactersCharacterIdStatsCombat.damageToPlayersFighterDroneNumShots) &&
        Objects.equals(this.damageToPlayersHybridAmount, getCharactersCharacterIdStatsCombat.damageToPlayersHybridAmount) &&
        Objects.equals(this.damageToPlayersHybridNumShots, getCharactersCharacterIdStatsCombat.damageToPlayersHybridNumShots) &&
        Objects.equals(this.damageToPlayersMissileAmount, getCharactersCharacterIdStatsCombat.damageToPlayersMissileAmount) &&
        Objects.equals(this.damageToPlayersMissileNumShots, getCharactersCharacterIdStatsCombat.damageToPlayersMissileNumShots) &&
        Objects.equals(this.damageToPlayersProjectileAmount, getCharactersCharacterIdStatsCombat.damageToPlayersProjectileAmount) &&
        Objects.equals(this.damageToPlayersProjectileNumShots, getCharactersCharacterIdStatsCombat.damageToPlayersProjectileNumShots) &&
        Objects.equals(this.damageToPlayersSmartBombAmount, getCharactersCharacterIdStatsCombat.damageToPlayersSmartBombAmount) &&
        Objects.equals(this.damageToPlayersSmartBombNumShots, getCharactersCharacterIdStatsCombat.damageToPlayersSmartBombNumShots) &&
        Objects.equals(this.damageToPlayersSuperAmount, getCharactersCharacterIdStatsCombat.damageToPlayersSuperAmount) &&
        Objects.equals(this.damageToPlayersSuperNumShots, getCharactersCharacterIdStatsCombat.damageToPlayersSuperNumShots) &&
        Objects.equals(this.damageToStructuresTotalAmount, getCharactersCharacterIdStatsCombat.damageToStructuresTotalAmount) &&
        Objects.equals(this.damageToStructuresTotalNumShots, getCharactersCharacterIdStatsCombat.damageToStructuresTotalNumShots) &&
        Objects.equals(this.deathsHighSec, getCharactersCharacterIdStatsCombat.deathsHighSec) &&
        Objects.equals(this.deathsLowSec, getCharactersCharacterIdStatsCombat.deathsLowSec) &&
        Objects.equals(this.deathsNullSec, getCharactersCharacterIdStatsCombat.deathsNullSec) &&
        Objects.equals(this.deathsPodHighSec, getCharactersCharacterIdStatsCombat.deathsPodHighSec) &&
        Objects.equals(this.deathsPodLowSec, getCharactersCharacterIdStatsCombat.deathsPodLowSec) &&
        Objects.equals(this.deathsPodNullSec, getCharactersCharacterIdStatsCombat.deathsPodNullSec) &&
        Objects.equals(this.deathsPodWormhole, getCharactersCharacterIdStatsCombat.deathsPodWormhole) &&
        Objects.equals(this.deathsWormhole, getCharactersCharacterIdStatsCombat.deathsWormhole) &&
        Objects.equals(this.droneEngage, getCharactersCharacterIdStatsCombat.droneEngage) &&
        Objects.equals(this.dscans, getCharactersCharacterIdStatsCombat.dscans) &&
        Objects.equals(this.duelRequested, getCharactersCharacterIdStatsCombat.duelRequested) &&
        Objects.equals(this.engagementRegister, getCharactersCharacterIdStatsCombat.engagementRegister) &&
        Objects.equals(this.killsAssists, getCharactersCharacterIdStatsCombat.killsAssists) &&
        Objects.equals(this.killsHighSec, getCharactersCharacterIdStatsCombat.killsHighSec) &&
        Objects.equals(this.killsLowSec, getCharactersCharacterIdStatsCombat.killsLowSec) &&
        Objects.equals(this.killsNullSec, getCharactersCharacterIdStatsCombat.killsNullSec) &&
        Objects.equals(this.killsPodHighSec, getCharactersCharacterIdStatsCombat.killsPodHighSec) &&
        Objects.equals(this.killsPodLowSec, getCharactersCharacterIdStatsCombat.killsPodLowSec) &&
        Objects.equals(this.killsPodNullSec, getCharactersCharacterIdStatsCombat.killsPodNullSec) &&
        Objects.equals(this.killsPodWormhole, getCharactersCharacterIdStatsCombat.killsPodWormhole) &&
        Objects.equals(this.killsWormhole, getCharactersCharacterIdStatsCombat.killsWormhole) &&
        Objects.equals(this.npcFlagSet, getCharactersCharacterIdStatsCombat.npcFlagSet) &&
        Objects.equals(this.probeScans, getCharactersCharacterIdStatsCombat.probeScans) &&
        Objects.equals(this.pvpFlagSet, getCharactersCharacterIdStatsCombat.pvpFlagSet) &&
        Objects.equals(this.repairArmorByRemoteAmount, getCharactersCharacterIdStatsCombat.repairArmorByRemoteAmount) &&
        Objects.equals(this.repairArmorRemoteAmount, getCharactersCharacterIdStatsCombat.repairArmorRemoteAmount) &&
        Objects.equals(this.repairArmorSelfAmount, getCharactersCharacterIdStatsCombat.repairArmorSelfAmount) &&
        Objects.equals(this.repairCapacitorByRemoteAmount, getCharactersCharacterIdStatsCombat.repairCapacitorByRemoteAmount) &&
        Objects.equals(this.repairCapacitorRemoteAmount, getCharactersCharacterIdStatsCombat.repairCapacitorRemoteAmount) &&
        Objects.equals(this.repairCapacitorSelfAmount, getCharactersCharacterIdStatsCombat.repairCapacitorSelfAmount) &&
        Objects.equals(this.repairHullByRemoteAmount, getCharactersCharacterIdStatsCombat.repairHullByRemoteAmount) &&
        Objects.equals(this.repairHullRemoteAmount, getCharactersCharacterIdStatsCombat.repairHullRemoteAmount) &&
        Objects.equals(this.repairHullSelfAmount, getCharactersCharacterIdStatsCombat.repairHullSelfAmount) &&
        Objects.equals(this.repairShieldByRemoteAmount, getCharactersCharacterIdStatsCombat.repairShieldByRemoteAmount) &&
        Objects.equals(this.repairShieldRemoteAmount, getCharactersCharacterIdStatsCombat.repairShieldRemoteAmount) &&
        Objects.equals(this.repairShieldSelfAmount, getCharactersCharacterIdStatsCombat.repairShieldSelfAmount) &&
        Objects.equals(this.selfDestructs, getCharactersCharacterIdStatsCombat.selfDestructs) &&
        Objects.equals(this.warpScramblePc, getCharactersCharacterIdStatsCombat.warpScramblePc) &&
        Objects.equals(this.warpScrambledbyNpc, getCharactersCharacterIdStatsCombat.warpScrambledbyNpc) &&
        Objects.equals(this.warpScrambledbyPc, getCharactersCharacterIdStatsCombat.warpScrambledbyPc) &&
        Objects.equals(this.weaponFlagSet, getCharactersCharacterIdStatsCombat.weaponFlagSet) &&
        Objects.equals(this.webifiedbyNpc, getCharactersCharacterIdStatsCombat.webifiedbyNpc) &&
        Objects.equals(this.webifiedbyPc, getCharactersCharacterIdStatsCombat.webifiedbyPc) &&
        Objects.equals(this.webifyingPc, getCharactersCharacterIdStatsCombat.webifyingPc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capDrainedbyNpc, capDrainedbyPc, capDrainingPc, criminalFlagSet, damageFromNpCsAmount, damageFromNpCsNumShots, damageFromPlayersBombAmount, damageFromPlayersBombNumShots, damageFromPlayersCombatDroneAmount, damageFromPlayersCombatDroneNumShots, damageFromPlayersEnergyAmount, damageFromPlayersEnergyNumShots, damageFromPlayersFighterBomberAmount, damageFromPlayersFighterBomberNumShots, damageFromPlayersFighterDroneAmount, damageFromPlayersFighterDroneNumShots, damageFromPlayersHybridAmount, damageFromPlayersHybridNumShots, damageFromPlayersMissileAmount, damageFromPlayersMissileNumShots, damageFromPlayersProjectileAmount, damageFromPlayersProjectileNumShots, damageFromPlayersSmartBombAmount, damageFromPlayersSmartBombNumShots, damageFromPlayersSuperAmount, damageFromPlayersSuperNumShots, damageFromStructuresTotalAmount, damageFromStructuresTotalNumShots, damageToPlayersBombAmount, damageToPlayersBombNumShots, damageToPlayersCombatDroneAmount, damageToPlayersCombatDroneNumShots, damageToPlayersEnergyAmount, damageToPlayersEnergyNumShots, damageToPlayersFighterBomberAmount, damageToPlayersFighterBomberNumShots, damageToPlayersFighterDroneAmount, damageToPlayersFighterDroneNumShots, damageToPlayersHybridAmount, damageToPlayersHybridNumShots, damageToPlayersMissileAmount, damageToPlayersMissileNumShots, damageToPlayersProjectileAmount, damageToPlayersProjectileNumShots, damageToPlayersSmartBombAmount, damageToPlayersSmartBombNumShots, damageToPlayersSuperAmount, damageToPlayersSuperNumShots, damageToStructuresTotalAmount, damageToStructuresTotalNumShots, deathsHighSec, deathsLowSec, deathsNullSec, deathsPodHighSec, deathsPodLowSec, deathsPodNullSec, deathsPodWormhole, deathsWormhole, droneEngage, dscans, duelRequested, engagementRegister, killsAssists, killsHighSec, killsLowSec, killsNullSec, killsPodHighSec, killsPodLowSec, killsPodNullSec, killsPodWormhole, killsWormhole, npcFlagSet, probeScans, pvpFlagSet, repairArmorByRemoteAmount, repairArmorRemoteAmount, repairArmorSelfAmount, repairCapacitorByRemoteAmount, repairCapacitorRemoteAmount, repairCapacitorSelfAmount, repairHullByRemoteAmount, repairHullRemoteAmount, repairHullSelfAmount, repairShieldByRemoteAmount, repairShieldRemoteAmount, repairShieldSelfAmount, selfDestructs, warpScramblePc, warpScrambledbyNpc, warpScrambledbyPc, weaponFlagSet, webifiedbyNpc, webifiedbyPc, webifyingPc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdStatsCombat {\n");

    sb.append("    capDrainedbyNpc: ").append(toIndentedString(capDrainedbyNpc)).append("\n");
    sb.append("    capDrainedbyPc: ").append(toIndentedString(capDrainedbyPc)).append("\n");
    sb.append("    capDrainingPc: ").append(toIndentedString(capDrainingPc)).append("\n");
    sb.append("    criminalFlagSet: ").append(toIndentedString(criminalFlagSet)).append("\n");
    sb.append("    damageFromNpCsAmount: ").append(toIndentedString(damageFromNpCsAmount)).append("\n");
    sb.append("    damageFromNpCsNumShots: ").append(toIndentedString(damageFromNpCsNumShots)).append("\n");
    sb.append("    damageFromPlayersBombAmount: ").append(toIndentedString(damageFromPlayersBombAmount)).append("\n");
    sb.append("    damageFromPlayersBombNumShots: ").append(toIndentedString(damageFromPlayersBombNumShots)).append("\n");
    sb.append("    damageFromPlayersCombatDroneAmount: ").append(toIndentedString(damageFromPlayersCombatDroneAmount)).append("\n");
    sb.append("    damageFromPlayersCombatDroneNumShots: ").append(toIndentedString(damageFromPlayersCombatDroneNumShots)).append("\n");
    sb.append("    damageFromPlayersEnergyAmount: ").append(toIndentedString(damageFromPlayersEnergyAmount)).append("\n");
    sb.append("    damageFromPlayersEnergyNumShots: ").append(toIndentedString(damageFromPlayersEnergyNumShots)).append("\n");
    sb.append("    damageFromPlayersFighterBomberAmount: ").append(toIndentedString(damageFromPlayersFighterBomberAmount)).append("\n");
    sb.append("    damageFromPlayersFighterBomberNumShots: ").append(toIndentedString(damageFromPlayersFighterBomberNumShots)).append("\n");
    sb.append("    damageFromPlayersFighterDroneAmount: ").append(toIndentedString(damageFromPlayersFighterDroneAmount)).append("\n");
    sb.append("    damageFromPlayersFighterDroneNumShots: ").append(toIndentedString(damageFromPlayersFighterDroneNumShots)).append("\n");
    sb.append("    damageFromPlayersHybridAmount: ").append(toIndentedString(damageFromPlayersHybridAmount)).append("\n");
    sb.append("    damageFromPlayersHybridNumShots: ").append(toIndentedString(damageFromPlayersHybridNumShots)).append("\n");
    sb.append("    damageFromPlayersMissileAmount: ").append(toIndentedString(damageFromPlayersMissileAmount)).append("\n");
    sb.append("    damageFromPlayersMissileNumShots: ").append(toIndentedString(damageFromPlayersMissileNumShots)).append("\n");
    sb.append("    damageFromPlayersProjectileAmount: ").append(toIndentedString(damageFromPlayersProjectileAmount)).append("\n");
    sb.append("    damageFromPlayersProjectileNumShots: ").append(toIndentedString(damageFromPlayersProjectileNumShots)).append("\n");
    sb.append("    damageFromPlayersSmartBombAmount: ").append(toIndentedString(damageFromPlayersSmartBombAmount)).append("\n");
    sb.append("    damageFromPlayersSmartBombNumShots: ").append(toIndentedString(damageFromPlayersSmartBombNumShots)).append("\n");
    sb.append("    damageFromPlayersSuperAmount: ").append(toIndentedString(damageFromPlayersSuperAmount)).append("\n");
    sb.append("    damageFromPlayersSuperNumShots: ").append(toIndentedString(damageFromPlayersSuperNumShots)).append("\n");
    sb.append("    damageFromStructuresTotalAmount: ").append(toIndentedString(damageFromStructuresTotalAmount)).append("\n");
    sb.append("    damageFromStructuresTotalNumShots: ").append(toIndentedString(damageFromStructuresTotalNumShots)).append("\n");
    sb.append("    damageToPlayersBombAmount: ").append(toIndentedString(damageToPlayersBombAmount)).append("\n");
    sb.append("    damageToPlayersBombNumShots: ").append(toIndentedString(damageToPlayersBombNumShots)).append("\n");
    sb.append("    damageToPlayersCombatDroneAmount: ").append(toIndentedString(damageToPlayersCombatDroneAmount)).append("\n");
    sb.append("    damageToPlayersCombatDroneNumShots: ").append(toIndentedString(damageToPlayersCombatDroneNumShots)).append("\n");
    sb.append("    damageToPlayersEnergyAmount: ").append(toIndentedString(damageToPlayersEnergyAmount)).append("\n");
    sb.append("    damageToPlayersEnergyNumShots: ").append(toIndentedString(damageToPlayersEnergyNumShots)).append("\n");
    sb.append("    damageToPlayersFighterBomberAmount: ").append(toIndentedString(damageToPlayersFighterBomberAmount)).append("\n");
    sb.append("    damageToPlayersFighterBomberNumShots: ").append(toIndentedString(damageToPlayersFighterBomberNumShots)).append("\n");
    sb.append("    damageToPlayersFighterDroneAmount: ").append(toIndentedString(damageToPlayersFighterDroneAmount)).append("\n");
    sb.append("    damageToPlayersFighterDroneNumShots: ").append(toIndentedString(damageToPlayersFighterDroneNumShots)).append("\n");
    sb.append("    damageToPlayersHybridAmount: ").append(toIndentedString(damageToPlayersHybridAmount)).append("\n");
    sb.append("    damageToPlayersHybridNumShots: ").append(toIndentedString(damageToPlayersHybridNumShots)).append("\n");
    sb.append("    damageToPlayersMissileAmount: ").append(toIndentedString(damageToPlayersMissileAmount)).append("\n");
    sb.append("    damageToPlayersMissileNumShots: ").append(toIndentedString(damageToPlayersMissileNumShots)).append("\n");
    sb.append("    damageToPlayersProjectileAmount: ").append(toIndentedString(damageToPlayersProjectileAmount)).append("\n");
    sb.append("    damageToPlayersProjectileNumShots: ").append(toIndentedString(damageToPlayersProjectileNumShots)).append("\n");
    sb.append("    damageToPlayersSmartBombAmount: ").append(toIndentedString(damageToPlayersSmartBombAmount)).append("\n");
    sb.append("    damageToPlayersSmartBombNumShots: ").append(toIndentedString(damageToPlayersSmartBombNumShots)).append("\n");
    sb.append("    damageToPlayersSuperAmount: ").append(toIndentedString(damageToPlayersSuperAmount)).append("\n");
    sb.append("    damageToPlayersSuperNumShots: ").append(toIndentedString(damageToPlayersSuperNumShots)).append("\n");
    sb.append("    damageToStructuresTotalAmount: ").append(toIndentedString(damageToStructuresTotalAmount)).append("\n");
    sb.append("    damageToStructuresTotalNumShots: ").append(toIndentedString(damageToStructuresTotalNumShots)).append("\n");
    sb.append("    deathsHighSec: ").append(toIndentedString(deathsHighSec)).append("\n");
    sb.append("    deathsLowSec: ").append(toIndentedString(deathsLowSec)).append("\n");
    sb.append("    deathsNullSec: ").append(toIndentedString(deathsNullSec)).append("\n");
    sb.append("    deathsPodHighSec: ").append(toIndentedString(deathsPodHighSec)).append("\n");
    sb.append("    deathsPodLowSec: ").append(toIndentedString(deathsPodLowSec)).append("\n");
    sb.append("    deathsPodNullSec: ").append(toIndentedString(deathsPodNullSec)).append("\n");
    sb.append("    deathsPodWormhole: ").append(toIndentedString(deathsPodWormhole)).append("\n");
    sb.append("    deathsWormhole: ").append(toIndentedString(deathsWormhole)).append("\n");
    sb.append("    droneEngage: ").append(toIndentedString(droneEngage)).append("\n");
    sb.append("    dscans: ").append(toIndentedString(dscans)).append("\n");
    sb.append("    duelRequested: ").append(toIndentedString(duelRequested)).append("\n");
    sb.append("    engagementRegister: ").append(toIndentedString(engagementRegister)).append("\n");
    sb.append("    killsAssists: ").append(toIndentedString(killsAssists)).append("\n");
    sb.append("    killsHighSec: ").append(toIndentedString(killsHighSec)).append("\n");
    sb.append("    killsLowSec: ").append(toIndentedString(killsLowSec)).append("\n");
    sb.append("    killsNullSec: ").append(toIndentedString(killsNullSec)).append("\n");
    sb.append("    killsPodHighSec: ").append(toIndentedString(killsPodHighSec)).append("\n");
    sb.append("    killsPodLowSec: ").append(toIndentedString(killsPodLowSec)).append("\n");
    sb.append("    killsPodNullSec: ").append(toIndentedString(killsPodNullSec)).append("\n");
    sb.append("    killsPodWormhole: ").append(toIndentedString(killsPodWormhole)).append("\n");
    sb.append("    killsWormhole: ").append(toIndentedString(killsWormhole)).append("\n");
    sb.append("    npcFlagSet: ").append(toIndentedString(npcFlagSet)).append("\n");
    sb.append("    probeScans: ").append(toIndentedString(probeScans)).append("\n");
    sb.append("    pvpFlagSet: ").append(toIndentedString(pvpFlagSet)).append("\n");
    sb.append("    repairArmorByRemoteAmount: ").append(toIndentedString(repairArmorByRemoteAmount)).append("\n");
    sb.append("    repairArmorRemoteAmount: ").append(toIndentedString(repairArmorRemoteAmount)).append("\n");
    sb.append("    repairArmorSelfAmount: ").append(toIndentedString(repairArmorSelfAmount)).append("\n");
    sb.append("    repairCapacitorByRemoteAmount: ").append(toIndentedString(repairCapacitorByRemoteAmount)).append("\n");
    sb.append("    repairCapacitorRemoteAmount: ").append(toIndentedString(repairCapacitorRemoteAmount)).append("\n");
    sb.append("    repairCapacitorSelfAmount: ").append(toIndentedString(repairCapacitorSelfAmount)).append("\n");
    sb.append("    repairHullByRemoteAmount: ").append(toIndentedString(repairHullByRemoteAmount)).append("\n");
    sb.append("    repairHullRemoteAmount: ").append(toIndentedString(repairHullRemoteAmount)).append("\n");
    sb.append("    repairHullSelfAmount: ").append(toIndentedString(repairHullSelfAmount)).append("\n");
    sb.append("    repairShieldByRemoteAmount: ").append(toIndentedString(repairShieldByRemoteAmount)).append("\n");
    sb.append("    repairShieldRemoteAmount: ").append(toIndentedString(repairShieldRemoteAmount)).append("\n");
    sb.append("    repairShieldSelfAmount: ").append(toIndentedString(repairShieldSelfAmount)).append("\n");
    sb.append("    selfDestructs: ").append(toIndentedString(selfDestructs)).append("\n");
    sb.append("    warpScramblePc: ").append(toIndentedString(warpScramblePc)).append("\n");
    sb.append("    warpScrambledbyNpc: ").append(toIndentedString(warpScrambledbyNpc)).append("\n");
    sb.append("    warpScrambledbyPc: ").append(toIndentedString(warpScrambledbyPc)).append("\n");
    sb.append("    weaponFlagSet: ").append(toIndentedString(weaponFlagSet)).append("\n");
    sb.append("    webifiedbyNpc: ").append(toIndentedString(webifiedbyNpc)).append("\n");
    sb.append("    webifiedbyPc: ").append(toIndentedString(webifiedbyPc)).append("\n");
    sb.append("    webifyingPc: ").append(toIndentedString(webifyingPc)).append("\n");
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

