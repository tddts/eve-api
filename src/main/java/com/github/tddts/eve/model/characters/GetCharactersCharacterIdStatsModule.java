package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * module object
 */
@ApiModel(description = "module object")
@Validated
public class GetCharactersCharacterIdStatsModule {
  @JsonProperty("activations_armor_hardener")
  private Long activationsArmorHardener = null;

  @JsonProperty("activations_armor_repair_unit")
  private Long activationsArmorRepairUnit = null;

  @JsonProperty("activations_armor_resistance_shift_hardener")
  private Long activationsArmorResistanceShiftHardener = null;

  @JsonProperty("activations_automated_targeting_system")
  private Long activationsAutomatedTargetingSystem = null;

  @JsonProperty("activations_bastion")
  private Long activationsBastion = null;

  @JsonProperty("activations_bomb_launcher")
  private Long activationsBombLauncher = null;

  @JsonProperty("activations_capacitor_booster")
  private Long activationsCapacitorBooster = null;

  @JsonProperty("activations_cargo_scanner")
  private Long activationsCargoScanner = null;

  @JsonProperty("activations_cloaking_device")
  private Long activationsCloakingDevice = null;

  @JsonProperty("activations_clone_vat_bay")
  private Long activationsCloneVatBay = null;

  @JsonProperty("activations_cynosural_field")
  private Long activationsCynosuralField = null;

  @JsonProperty("activations_damage_control")
  private Long activationsDamageControl = null;

  @JsonProperty("activations_data_miners")
  private Long activationsDataMiners = null;

  @JsonProperty("activations_drone_control_unit")
  private Long activationsDroneControlUnit = null;

  @JsonProperty("activations_drone_tracking_modules")
  private Long activationsDroneTrackingModules = null;

  @JsonProperty("activations_eccm")
  private Long activationsEccm = null;

  @JsonProperty("activations_ecm")
  private Long activationsEcm = null;

  @JsonProperty("activations_ecm_burst")
  private Long activationsEcmBurst = null;

  @JsonProperty("activations_energy_destabilizer")
  private Long activationsEnergyDestabilizer = null;

  @JsonProperty("activations_energy_vampire")
  private Long activationsEnergyVampire = null;

  @JsonProperty("activations_energy_weapon")
  private Long activationsEnergyWeapon = null;

  @JsonProperty("activations_festival_launcher")
  private Long activationsFestivalLauncher = null;

  @JsonProperty("activations_frequency_mining_laser")
  private Long activationsFrequencyMiningLaser = null;

  @JsonProperty("activations_fueled_armor_repairer")
  private Long activationsFueledArmorRepairer = null;

  @JsonProperty("activations_fueled_shield_booster")
  private Long activationsFueledShieldBooster = null;

  @JsonProperty("activations_gang_coordinator")
  private Long activationsGangCoordinator = null;

  @JsonProperty("activations_gas_cloud_harvester")
  private Long activationsGasCloudHarvester = null;

  @JsonProperty("activations_hull_repair_unit")
  private Long activationsHullRepairUnit = null;

  @JsonProperty("activations_hybrid_weapon")
  private Long activationsHybridWeapon = null;

  @JsonProperty("activations_industrial_core")
  private Long activationsIndustrialCore = null;

  @JsonProperty("activations_interdiction_sphere_launcher")
  private Long activationsInterdictionSphereLauncher = null;

  @JsonProperty("activations_micro_jump_drive")
  private Long activationsMicroJumpDrive = null;

  @JsonProperty("activations_mining_laser")
  private Long activationsMiningLaser = null;

  @JsonProperty("activations_missile_launcher")
  private Long activationsMissileLauncher = null;

  @JsonProperty("activations_passive_targeting_system")
  private Long activationsPassiveTargetingSystem = null;

  @JsonProperty("activations_probe_launcher")
  private Long activationsProbeLauncher = null;

  @JsonProperty("activations_projected_eccm")
  private Long activationsProjectedEccm = null;

  @JsonProperty("activations_projectile_weapon")
  private Long activationsProjectileWeapon = null;

  @JsonProperty("activations_propulsion_module")
  private Long activationsPropulsionModule = null;

  @JsonProperty("activations_remote_armor_repairer")
  private Long activationsRemoteArmorRepairer = null;

  @JsonProperty("activations_remote_capacitor_transmitter")
  private Long activationsRemoteCapacitorTransmitter = null;

  @JsonProperty("activations_remote_ecm_burst")
  private Long activationsRemoteEcmBurst = null;

  @JsonProperty("activations_remote_hull_repairer")
  private Long activationsRemoteHullRepairer = null;

  @JsonProperty("activations_remote_sensor_booster")
  private Long activationsRemoteSensorBooster = null;

  @JsonProperty("activations_remote_sensor_damper")
  private Long activationsRemoteSensorDamper = null;

  @JsonProperty("activations_remote_shield_booster")
  private Long activationsRemoteShieldBooster = null;

  @JsonProperty("activations_remote_tracking_computer")
  private Long activationsRemoteTrackingComputer = null;

  @JsonProperty("activations_salvager")
  private Long activationsSalvager = null;

  @JsonProperty("activations_sensor_booster")
  private Long activationsSensorBooster = null;

  @JsonProperty("activations_shield_booster")
  private Long activationsShieldBooster = null;

  @JsonProperty("activations_shield_hardener")
  private Long activationsShieldHardener = null;

  @JsonProperty("activations_ship_scanner")
  private Long activationsShipScanner = null;

  @JsonProperty("activations_siege")
  private Long activationsSiege = null;

  @JsonProperty("activations_smart_bomb")
  private Long activationsSmartBomb = null;

  @JsonProperty("activations_stasis_web")
  private Long activationsStasisWeb = null;

  @JsonProperty("activations_strip_miner")
  private Long activationsStripMiner = null;

  @JsonProperty("activations_super_weapon")
  private Long activationsSuperWeapon = null;

  @JsonProperty("activations_survey_scanner")
  private Long activationsSurveyScanner = null;

  @JsonProperty("activations_target_breaker")
  private Long activationsTargetBreaker = null;

  @JsonProperty("activations_target_painter")
  private Long activationsTargetPainter = null;

  @JsonProperty("activations_tracking_computer")
  private Long activationsTrackingComputer = null;

  @JsonProperty("activations_tracking_disruptor")
  private Long activationsTrackingDisruptor = null;

  @JsonProperty("activations_tractor_beam")
  private Long activationsTractorBeam = null;

  @JsonProperty("activations_triage")
  private Long activationsTriage = null;

  @JsonProperty("activations_warp_disrupt_field_generator")
  private Long activationsWarpDisruptFieldGenerator = null;

  @JsonProperty("activations_warp_scrambler")
  private Long activationsWarpScrambler = null;

  @JsonProperty("link_weapons")
  private Long linkWeapons = null;

  @JsonProperty("overload")
  private Long overload = null;

  @JsonProperty("repairs")
  private Long repairs = null;

  public GetCharactersCharacterIdStatsModule activationsArmorHardener(Long activationsArmorHardener) {
    this.activationsArmorHardener = activationsArmorHardener;
    return this;
  }

  /**
   * activations_armor_hardener integer
   *
   * @return activationsArmorHardener
   **/
  @ApiModelProperty(value = "activations_armor_hardener integer")


  public Long getActivationsArmorHardener() {
    return activationsArmorHardener;
  }

  public void setActivationsArmorHardener(Long activationsArmorHardener) {
    this.activationsArmorHardener = activationsArmorHardener;
  }

  public GetCharactersCharacterIdStatsModule activationsArmorRepairUnit(Long activationsArmorRepairUnit) {
    this.activationsArmorRepairUnit = activationsArmorRepairUnit;
    return this;
  }

  /**
   * activations_armor_repair_unit integer
   *
   * @return activationsArmorRepairUnit
   **/
  @ApiModelProperty(value = "activations_armor_repair_unit integer")


  public Long getActivationsArmorRepairUnit() {
    return activationsArmorRepairUnit;
  }

  public void setActivationsArmorRepairUnit(Long activationsArmorRepairUnit) {
    this.activationsArmorRepairUnit = activationsArmorRepairUnit;
  }

  public GetCharactersCharacterIdStatsModule activationsArmorResistanceShiftHardener(Long activationsArmorResistanceShiftHardener) {
    this.activationsArmorResistanceShiftHardener = activationsArmorResistanceShiftHardener;
    return this;
  }

  /**
   * activations_armor_resistance_shift_hardener integer
   *
   * @return activationsArmorResistanceShiftHardener
   **/
  @ApiModelProperty(value = "activations_armor_resistance_shift_hardener integer")


  public Long getActivationsArmorResistanceShiftHardener() {
    return activationsArmorResistanceShiftHardener;
  }

  public void setActivationsArmorResistanceShiftHardener(Long activationsArmorResistanceShiftHardener) {
    this.activationsArmorResistanceShiftHardener = activationsArmorResistanceShiftHardener;
  }

  public GetCharactersCharacterIdStatsModule activationsAutomatedTargetingSystem(Long activationsAutomatedTargetingSystem) {
    this.activationsAutomatedTargetingSystem = activationsAutomatedTargetingSystem;
    return this;
  }

  /**
   * activations_automated_targeting_system integer
   *
   * @return activationsAutomatedTargetingSystem
   **/
  @ApiModelProperty(value = "activations_automated_targeting_system integer")


  public Long getActivationsAutomatedTargetingSystem() {
    return activationsAutomatedTargetingSystem;
  }

  public void setActivationsAutomatedTargetingSystem(Long activationsAutomatedTargetingSystem) {
    this.activationsAutomatedTargetingSystem = activationsAutomatedTargetingSystem;
  }

  public GetCharactersCharacterIdStatsModule activationsBastion(Long activationsBastion) {
    this.activationsBastion = activationsBastion;
    return this;
  }

  /**
   * activations_bastion integer
   *
   * @return activationsBastion
   **/
  @ApiModelProperty(value = "activations_bastion integer")


  public Long getActivationsBastion() {
    return activationsBastion;
  }

  public void setActivationsBastion(Long activationsBastion) {
    this.activationsBastion = activationsBastion;
  }

  public GetCharactersCharacterIdStatsModule activationsBombLauncher(Long activationsBombLauncher) {
    this.activationsBombLauncher = activationsBombLauncher;
    return this;
  }

  /**
   * activations_bomb_launcher integer
   *
   * @return activationsBombLauncher
   **/
  @ApiModelProperty(value = "activations_bomb_launcher integer")


  public Long getActivationsBombLauncher() {
    return activationsBombLauncher;
  }

  public void setActivationsBombLauncher(Long activationsBombLauncher) {
    this.activationsBombLauncher = activationsBombLauncher;
  }

  public GetCharactersCharacterIdStatsModule activationsCapacitorBooster(Long activationsCapacitorBooster) {
    this.activationsCapacitorBooster = activationsCapacitorBooster;
    return this;
  }

  /**
   * activations_capacitor_booster integer
   *
   * @return activationsCapacitorBooster
   **/
  @ApiModelProperty(value = "activations_capacitor_booster integer")


  public Long getActivationsCapacitorBooster() {
    return activationsCapacitorBooster;
  }

  public void setActivationsCapacitorBooster(Long activationsCapacitorBooster) {
    this.activationsCapacitorBooster = activationsCapacitorBooster;
  }

  public GetCharactersCharacterIdStatsModule activationsCargoScanner(Long activationsCargoScanner) {
    this.activationsCargoScanner = activationsCargoScanner;
    return this;
  }

  /**
   * activations_cargo_scanner integer
   *
   * @return activationsCargoScanner
   **/
  @ApiModelProperty(value = "activations_cargo_scanner integer")


  public Long getActivationsCargoScanner() {
    return activationsCargoScanner;
  }

  public void setActivationsCargoScanner(Long activationsCargoScanner) {
    this.activationsCargoScanner = activationsCargoScanner;
  }

  public GetCharactersCharacterIdStatsModule activationsCloakingDevice(Long activationsCloakingDevice) {
    this.activationsCloakingDevice = activationsCloakingDevice;
    return this;
  }

  /**
   * activations_cloaking_device integer
   *
   * @return activationsCloakingDevice
   **/
  @ApiModelProperty(value = "activations_cloaking_device integer")


  public Long getActivationsCloakingDevice() {
    return activationsCloakingDevice;
  }

  public void setActivationsCloakingDevice(Long activationsCloakingDevice) {
    this.activationsCloakingDevice = activationsCloakingDevice;
  }

  public GetCharactersCharacterIdStatsModule activationsCloneVatBay(Long activationsCloneVatBay) {
    this.activationsCloneVatBay = activationsCloneVatBay;
    return this;
  }

  /**
   * activations_clone_vat_bay integer
   *
   * @return activationsCloneVatBay
   **/
  @ApiModelProperty(value = "activations_clone_vat_bay integer")


  public Long getActivationsCloneVatBay() {
    return activationsCloneVatBay;
  }

  public void setActivationsCloneVatBay(Long activationsCloneVatBay) {
    this.activationsCloneVatBay = activationsCloneVatBay;
  }

  public GetCharactersCharacterIdStatsModule activationsCynosuralField(Long activationsCynosuralField) {
    this.activationsCynosuralField = activationsCynosuralField;
    return this;
  }

  /**
   * activations_cynosural_field integer
   *
   * @return activationsCynosuralField
   **/
  @ApiModelProperty(value = "activations_cynosural_field integer")


  public Long getActivationsCynosuralField() {
    return activationsCynosuralField;
  }

  public void setActivationsCynosuralField(Long activationsCynosuralField) {
    this.activationsCynosuralField = activationsCynosuralField;
  }

  public GetCharactersCharacterIdStatsModule activationsDamageControl(Long activationsDamageControl) {
    this.activationsDamageControl = activationsDamageControl;
    return this;
  }

  /**
   * activations_damage_control integer
   *
   * @return activationsDamageControl
   **/
  @ApiModelProperty(value = "activations_damage_control integer")


  public Long getActivationsDamageControl() {
    return activationsDamageControl;
  }

  public void setActivationsDamageControl(Long activationsDamageControl) {
    this.activationsDamageControl = activationsDamageControl;
  }

  public GetCharactersCharacterIdStatsModule activationsDataMiners(Long activationsDataMiners) {
    this.activationsDataMiners = activationsDataMiners;
    return this;
  }

  /**
   * activations_data_miners integer
   *
   * @return activationsDataMiners
   **/
  @ApiModelProperty(value = "activations_data_miners integer")


  public Long getActivationsDataMiners() {
    return activationsDataMiners;
  }

  public void setActivationsDataMiners(Long activationsDataMiners) {
    this.activationsDataMiners = activationsDataMiners;
  }

  public GetCharactersCharacterIdStatsModule activationsDroneControlUnit(Long activationsDroneControlUnit) {
    this.activationsDroneControlUnit = activationsDroneControlUnit;
    return this;
  }

  /**
   * activations_drone_control_unit integer
   *
   * @return activationsDroneControlUnit
   **/
  @ApiModelProperty(value = "activations_drone_control_unit integer")


  public Long getActivationsDroneControlUnit() {
    return activationsDroneControlUnit;
  }

  public void setActivationsDroneControlUnit(Long activationsDroneControlUnit) {
    this.activationsDroneControlUnit = activationsDroneControlUnit;
  }

  public GetCharactersCharacterIdStatsModule activationsDroneTrackingModules(Long activationsDroneTrackingModules) {
    this.activationsDroneTrackingModules = activationsDroneTrackingModules;
    return this;
  }

  /**
   * activations_drone_tracking_modules integer
   *
   * @return activationsDroneTrackingModules
   **/
  @ApiModelProperty(value = "activations_drone_tracking_modules integer")


  public Long getActivationsDroneTrackingModules() {
    return activationsDroneTrackingModules;
  }

  public void setActivationsDroneTrackingModules(Long activationsDroneTrackingModules) {
    this.activationsDroneTrackingModules = activationsDroneTrackingModules;
  }

  public GetCharactersCharacterIdStatsModule activationsEccm(Long activationsEccm) {
    this.activationsEccm = activationsEccm;
    return this;
  }

  /**
   * activations_eccm integer
   *
   * @return activationsEccm
   **/
  @ApiModelProperty(value = "activations_eccm integer")


  public Long getActivationsEccm() {
    return activationsEccm;
  }

  public void setActivationsEccm(Long activationsEccm) {
    this.activationsEccm = activationsEccm;
  }

  public GetCharactersCharacterIdStatsModule activationsEcm(Long activationsEcm) {
    this.activationsEcm = activationsEcm;
    return this;
  }

  /**
   * activations_ecm integer
   *
   * @return activationsEcm
   **/
  @ApiModelProperty(value = "activations_ecm integer")


  public Long getActivationsEcm() {
    return activationsEcm;
  }

  public void setActivationsEcm(Long activationsEcm) {
    this.activationsEcm = activationsEcm;
  }

  public GetCharactersCharacterIdStatsModule activationsEcmBurst(Long activationsEcmBurst) {
    this.activationsEcmBurst = activationsEcmBurst;
    return this;
  }

  /**
   * activations_ecm_burst integer
   *
   * @return activationsEcmBurst
   **/
  @ApiModelProperty(value = "activations_ecm_burst integer")


  public Long getActivationsEcmBurst() {
    return activationsEcmBurst;
  }

  public void setActivationsEcmBurst(Long activationsEcmBurst) {
    this.activationsEcmBurst = activationsEcmBurst;
  }

  public GetCharactersCharacterIdStatsModule activationsEnergyDestabilizer(Long activationsEnergyDestabilizer) {
    this.activationsEnergyDestabilizer = activationsEnergyDestabilizer;
    return this;
  }

  /**
   * activations_energy_destabilizer integer
   *
   * @return activationsEnergyDestabilizer
   **/
  @ApiModelProperty(value = "activations_energy_destabilizer integer")


  public Long getActivationsEnergyDestabilizer() {
    return activationsEnergyDestabilizer;
  }

  public void setActivationsEnergyDestabilizer(Long activationsEnergyDestabilizer) {
    this.activationsEnergyDestabilizer = activationsEnergyDestabilizer;
  }

  public GetCharactersCharacterIdStatsModule activationsEnergyVampire(Long activationsEnergyVampire) {
    this.activationsEnergyVampire = activationsEnergyVampire;
    return this;
  }

  /**
   * activations_energy_vampire integer
   *
   * @return activationsEnergyVampire
   **/
  @ApiModelProperty(value = "activations_energy_vampire integer")


  public Long getActivationsEnergyVampire() {
    return activationsEnergyVampire;
  }

  public void setActivationsEnergyVampire(Long activationsEnergyVampire) {
    this.activationsEnergyVampire = activationsEnergyVampire;
  }

  public GetCharactersCharacterIdStatsModule activationsEnergyWeapon(Long activationsEnergyWeapon) {
    this.activationsEnergyWeapon = activationsEnergyWeapon;
    return this;
  }

  /**
   * activations_energy_weapon integer
   *
   * @return activationsEnergyWeapon
   **/
  @ApiModelProperty(value = "activations_energy_weapon integer")


  public Long getActivationsEnergyWeapon() {
    return activationsEnergyWeapon;
  }

  public void setActivationsEnergyWeapon(Long activationsEnergyWeapon) {
    this.activationsEnergyWeapon = activationsEnergyWeapon;
  }

  public GetCharactersCharacterIdStatsModule activationsFestivalLauncher(Long activationsFestivalLauncher) {
    this.activationsFestivalLauncher = activationsFestivalLauncher;
    return this;
  }

  /**
   * activations_festival_launcher integer
   *
   * @return activationsFestivalLauncher
   **/
  @ApiModelProperty(value = "activations_festival_launcher integer")


  public Long getActivationsFestivalLauncher() {
    return activationsFestivalLauncher;
  }

  public void setActivationsFestivalLauncher(Long activationsFestivalLauncher) {
    this.activationsFestivalLauncher = activationsFestivalLauncher;
  }

  public GetCharactersCharacterIdStatsModule activationsFrequencyMiningLaser(Long activationsFrequencyMiningLaser) {
    this.activationsFrequencyMiningLaser = activationsFrequencyMiningLaser;
    return this;
  }

  /**
   * activations_frequency_mining_laser integer
   *
   * @return activationsFrequencyMiningLaser
   **/
  @ApiModelProperty(value = "activations_frequency_mining_laser integer")


  public Long getActivationsFrequencyMiningLaser() {
    return activationsFrequencyMiningLaser;
  }

  public void setActivationsFrequencyMiningLaser(Long activationsFrequencyMiningLaser) {
    this.activationsFrequencyMiningLaser = activationsFrequencyMiningLaser;
  }

  public GetCharactersCharacterIdStatsModule activationsFueledArmorRepairer(Long activationsFueledArmorRepairer) {
    this.activationsFueledArmorRepairer = activationsFueledArmorRepairer;
    return this;
  }

  /**
   * activations_fueled_armor_repairer integer
   *
   * @return activationsFueledArmorRepairer
   **/
  @ApiModelProperty(value = "activations_fueled_armor_repairer integer")


  public Long getActivationsFueledArmorRepairer() {
    return activationsFueledArmorRepairer;
  }

  public void setActivationsFueledArmorRepairer(Long activationsFueledArmorRepairer) {
    this.activationsFueledArmorRepairer = activationsFueledArmorRepairer;
  }

  public GetCharactersCharacterIdStatsModule activationsFueledShieldBooster(Long activationsFueledShieldBooster) {
    this.activationsFueledShieldBooster = activationsFueledShieldBooster;
    return this;
  }

  /**
   * activations_fueled_shield_booster integer
   *
   * @return activationsFueledShieldBooster
   **/
  @ApiModelProperty(value = "activations_fueled_shield_booster integer")


  public Long getActivationsFueledShieldBooster() {
    return activationsFueledShieldBooster;
  }

  public void setActivationsFueledShieldBooster(Long activationsFueledShieldBooster) {
    this.activationsFueledShieldBooster = activationsFueledShieldBooster;
  }

  public GetCharactersCharacterIdStatsModule activationsGangCoordinator(Long activationsGangCoordinator) {
    this.activationsGangCoordinator = activationsGangCoordinator;
    return this;
  }

  /**
   * activations_gang_coordinator integer
   *
   * @return activationsGangCoordinator
   **/
  @ApiModelProperty(value = "activations_gang_coordinator integer")


  public Long getActivationsGangCoordinator() {
    return activationsGangCoordinator;
  }

  public void setActivationsGangCoordinator(Long activationsGangCoordinator) {
    this.activationsGangCoordinator = activationsGangCoordinator;
  }

  public GetCharactersCharacterIdStatsModule activationsGasCloudHarvester(Long activationsGasCloudHarvester) {
    this.activationsGasCloudHarvester = activationsGasCloudHarvester;
    return this;
  }

  /**
   * activations_gas_cloud_harvester integer
   *
   * @return activationsGasCloudHarvester
   **/
  @ApiModelProperty(value = "activations_gas_cloud_harvester integer")


  public Long getActivationsGasCloudHarvester() {
    return activationsGasCloudHarvester;
  }

  public void setActivationsGasCloudHarvester(Long activationsGasCloudHarvester) {
    this.activationsGasCloudHarvester = activationsGasCloudHarvester;
  }

  public GetCharactersCharacterIdStatsModule activationsHullRepairUnit(Long activationsHullRepairUnit) {
    this.activationsHullRepairUnit = activationsHullRepairUnit;
    return this;
  }

  /**
   * activations_hull_repair_unit integer
   *
   * @return activationsHullRepairUnit
   **/
  @ApiModelProperty(value = "activations_hull_repair_unit integer")


  public Long getActivationsHullRepairUnit() {
    return activationsHullRepairUnit;
  }

  public void setActivationsHullRepairUnit(Long activationsHullRepairUnit) {
    this.activationsHullRepairUnit = activationsHullRepairUnit;
  }

  public GetCharactersCharacterIdStatsModule activationsHybridWeapon(Long activationsHybridWeapon) {
    this.activationsHybridWeapon = activationsHybridWeapon;
    return this;
  }

  /**
   * activations_hybrid_weapon integer
   *
   * @return activationsHybridWeapon
   **/
  @ApiModelProperty(value = "activations_hybrid_weapon integer")


  public Long getActivationsHybridWeapon() {
    return activationsHybridWeapon;
  }

  public void setActivationsHybridWeapon(Long activationsHybridWeapon) {
    this.activationsHybridWeapon = activationsHybridWeapon;
  }

  public GetCharactersCharacterIdStatsModule activationsIndustrialCore(Long activationsIndustrialCore) {
    this.activationsIndustrialCore = activationsIndustrialCore;
    return this;
  }

  /**
   * activations_industrial_core integer
   *
   * @return activationsIndustrialCore
   **/
  @ApiModelProperty(value = "activations_industrial_core integer")


  public Long getActivationsIndustrialCore() {
    return activationsIndustrialCore;
  }

  public void setActivationsIndustrialCore(Long activationsIndustrialCore) {
    this.activationsIndustrialCore = activationsIndustrialCore;
  }

  public GetCharactersCharacterIdStatsModule activationsInterdictionSphereLauncher(Long activationsInterdictionSphereLauncher) {
    this.activationsInterdictionSphereLauncher = activationsInterdictionSphereLauncher;
    return this;
  }

  /**
   * activations_interdiction_sphere_launcher integer
   *
   * @return activationsInterdictionSphereLauncher
   **/
  @ApiModelProperty(value = "activations_interdiction_sphere_launcher integer")


  public Long getActivationsInterdictionSphereLauncher() {
    return activationsInterdictionSphereLauncher;
  }

  public void setActivationsInterdictionSphereLauncher(Long activationsInterdictionSphereLauncher) {
    this.activationsInterdictionSphereLauncher = activationsInterdictionSphereLauncher;
  }

  public GetCharactersCharacterIdStatsModule activationsMicroJumpDrive(Long activationsMicroJumpDrive) {
    this.activationsMicroJumpDrive = activationsMicroJumpDrive;
    return this;
  }

  /**
   * activations_micro_jump_drive integer
   *
   * @return activationsMicroJumpDrive
   **/
  @ApiModelProperty(value = "activations_micro_jump_drive integer")


  public Long getActivationsMicroJumpDrive() {
    return activationsMicroJumpDrive;
  }

  public void setActivationsMicroJumpDrive(Long activationsMicroJumpDrive) {
    this.activationsMicroJumpDrive = activationsMicroJumpDrive;
  }

  public GetCharactersCharacterIdStatsModule activationsMiningLaser(Long activationsMiningLaser) {
    this.activationsMiningLaser = activationsMiningLaser;
    return this;
  }

  /**
   * activations_mining_laser integer
   *
   * @return activationsMiningLaser
   **/
  @ApiModelProperty(value = "activations_mining_laser integer")


  public Long getActivationsMiningLaser() {
    return activationsMiningLaser;
  }

  public void setActivationsMiningLaser(Long activationsMiningLaser) {
    this.activationsMiningLaser = activationsMiningLaser;
  }

  public GetCharactersCharacterIdStatsModule activationsMissileLauncher(Long activationsMissileLauncher) {
    this.activationsMissileLauncher = activationsMissileLauncher;
    return this;
  }

  /**
   * activations_missile_launcher integer
   *
   * @return activationsMissileLauncher
   **/
  @ApiModelProperty(value = "activations_missile_launcher integer")


  public Long getActivationsMissileLauncher() {
    return activationsMissileLauncher;
  }

  public void setActivationsMissileLauncher(Long activationsMissileLauncher) {
    this.activationsMissileLauncher = activationsMissileLauncher;
  }

  public GetCharactersCharacterIdStatsModule activationsPassiveTargetingSystem(Long activationsPassiveTargetingSystem) {
    this.activationsPassiveTargetingSystem = activationsPassiveTargetingSystem;
    return this;
  }

  /**
   * activations_passive_targeting_system integer
   *
   * @return activationsPassiveTargetingSystem
   **/
  @ApiModelProperty(value = "activations_passive_targeting_system integer")


  public Long getActivationsPassiveTargetingSystem() {
    return activationsPassiveTargetingSystem;
  }

  public void setActivationsPassiveTargetingSystem(Long activationsPassiveTargetingSystem) {
    this.activationsPassiveTargetingSystem = activationsPassiveTargetingSystem;
  }

  public GetCharactersCharacterIdStatsModule activationsProbeLauncher(Long activationsProbeLauncher) {
    this.activationsProbeLauncher = activationsProbeLauncher;
    return this;
  }

  /**
   * activations_probe_launcher integer
   *
   * @return activationsProbeLauncher
   **/
  @ApiModelProperty(value = "activations_probe_launcher integer")


  public Long getActivationsProbeLauncher() {
    return activationsProbeLauncher;
  }

  public void setActivationsProbeLauncher(Long activationsProbeLauncher) {
    this.activationsProbeLauncher = activationsProbeLauncher;
  }

  public GetCharactersCharacterIdStatsModule activationsProjectedEccm(Long activationsProjectedEccm) {
    this.activationsProjectedEccm = activationsProjectedEccm;
    return this;
  }

  /**
   * activations_projected_eccm integer
   *
   * @return activationsProjectedEccm
   **/
  @ApiModelProperty(value = "activations_projected_eccm integer")


  public Long getActivationsProjectedEccm() {
    return activationsProjectedEccm;
  }

  public void setActivationsProjectedEccm(Long activationsProjectedEccm) {
    this.activationsProjectedEccm = activationsProjectedEccm;
  }

  public GetCharactersCharacterIdStatsModule activationsProjectileWeapon(Long activationsProjectileWeapon) {
    this.activationsProjectileWeapon = activationsProjectileWeapon;
    return this;
  }

  /**
   * activations_projectile_weapon integer
   *
   * @return activationsProjectileWeapon
   **/
  @ApiModelProperty(value = "activations_projectile_weapon integer")


  public Long getActivationsProjectileWeapon() {
    return activationsProjectileWeapon;
  }

  public void setActivationsProjectileWeapon(Long activationsProjectileWeapon) {
    this.activationsProjectileWeapon = activationsProjectileWeapon;
  }

  public GetCharactersCharacterIdStatsModule activationsPropulsionModule(Long activationsPropulsionModule) {
    this.activationsPropulsionModule = activationsPropulsionModule;
    return this;
  }

  /**
   * activations_propulsion_module integer
   *
   * @return activationsPropulsionModule
   **/
  @ApiModelProperty(value = "activations_propulsion_module integer")


  public Long getActivationsPropulsionModule() {
    return activationsPropulsionModule;
  }

  public void setActivationsPropulsionModule(Long activationsPropulsionModule) {
    this.activationsPropulsionModule = activationsPropulsionModule;
  }

  public GetCharactersCharacterIdStatsModule activationsRemoteArmorRepairer(Long activationsRemoteArmorRepairer) {
    this.activationsRemoteArmorRepairer = activationsRemoteArmorRepairer;
    return this;
  }

  /**
   * activations_remote_armor_repairer integer
   *
   * @return activationsRemoteArmorRepairer
   **/
  @ApiModelProperty(value = "activations_remote_armor_repairer integer")


  public Long getActivationsRemoteArmorRepairer() {
    return activationsRemoteArmorRepairer;
  }

  public void setActivationsRemoteArmorRepairer(Long activationsRemoteArmorRepairer) {
    this.activationsRemoteArmorRepairer = activationsRemoteArmorRepairer;
  }

  public GetCharactersCharacterIdStatsModule activationsRemoteCapacitorTransmitter(Long activationsRemoteCapacitorTransmitter) {
    this.activationsRemoteCapacitorTransmitter = activationsRemoteCapacitorTransmitter;
    return this;
  }

  /**
   * activations_remote_capacitor_transmitter integer
   *
   * @return activationsRemoteCapacitorTransmitter
   **/
  @ApiModelProperty(value = "activations_remote_capacitor_transmitter integer")


  public Long getActivationsRemoteCapacitorTransmitter() {
    return activationsRemoteCapacitorTransmitter;
  }

  public void setActivationsRemoteCapacitorTransmitter(Long activationsRemoteCapacitorTransmitter) {
    this.activationsRemoteCapacitorTransmitter = activationsRemoteCapacitorTransmitter;
  }

  public GetCharactersCharacterIdStatsModule activationsRemoteEcmBurst(Long activationsRemoteEcmBurst) {
    this.activationsRemoteEcmBurst = activationsRemoteEcmBurst;
    return this;
  }

  /**
   * activations_remote_ecm_burst integer
   *
   * @return activationsRemoteEcmBurst
   **/
  @ApiModelProperty(value = "activations_remote_ecm_burst integer")


  public Long getActivationsRemoteEcmBurst() {
    return activationsRemoteEcmBurst;
  }

  public void setActivationsRemoteEcmBurst(Long activationsRemoteEcmBurst) {
    this.activationsRemoteEcmBurst = activationsRemoteEcmBurst;
  }

  public GetCharactersCharacterIdStatsModule activationsRemoteHullRepairer(Long activationsRemoteHullRepairer) {
    this.activationsRemoteHullRepairer = activationsRemoteHullRepairer;
    return this;
  }

  /**
   * activations_remote_hull_repairer integer
   *
   * @return activationsRemoteHullRepairer
   **/
  @ApiModelProperty(value = "activations_remote_hull_repairer integer")


  public Long getActivationsRemoteHullRepairer() {
    return activationsRemoteHullRepairer;
  }

  public void setActivationsRemoteHullRepairer(Long activationsRemoteHullRepairer) {
    this.activationsRemoteHullRepairer = activationsRemoteHullRepairer;
  }

  public GetCharactersCharacterIdStatsModule activationsRemoteSensorBooster(Long activationsRemoteSensorBooster) {
    this.activationsRemoteSensorBooster = activationsRemoteSensorBooster;
    return this;
  }

  /**
   * activations_remote_sensor_booster integer
   *
   * @return activationsRemoteSensorBooster
   **/
  @ApiModelProperty(value = "activations_remote_sensor_booster integer")


  public Long getActivationsRemoteSensorBooster() {
    return activationsRemoteSensorBooster;
  }

  public void setActivationsRemoteSensorBooster(Long activationsRemoteSensorBooster) {
    this.activationsRemoteSensorBooster = activationsRemoteSensorBooster;
  }

  public GetCharactersCharacterIdStatsModule activationsRemoteSensorDamper(Long activationsRemoteSensorDamper) {
    this.activationsRemoteSensorDamper = activationsRemoteSensorDamper;
    return this;
  }

  /**
   * activations_remote_sensor_damper integer
   *
   * @return activationsRemoteSensorDamper
   **/
  @ApiModelProperty(value = "activations_remote_sensor_damper integer")


  public Long getActivationsRemoteSensorDamper() {
    return activationsRemoteSensorDamper;
  }

  public void setActivationsRemoteSensorDamper(Long activationsRemoteSensorDamper) {
    this.activationsRemoteSensorDamper = activationsRemoteSensorDamper;
  }

  public GetCharactersCharacterIdStatsModule activationsRemoteShieldBooster(Long activationsRemoteShieldBooster) {
    this.activationsRemoteShieldBooster = activationsRemoteShieldBooster;
    return this;
  }

  /**
   * activations_remote_shield_booster integer
   *
   * @return activationsRemoteShieldBooster
   **/
  @ApiModelProperty(value = "activations_remote_shield_booster integer")


  public Long getActivationsRemoteShieldBooster() {
    return activationsRemoteShieldBooster;
  }

  public void setActivationsRemoteShieldBooster(Long activationsRemoteShieldBooster) {
    this.activationsRemoteShieldBooster = activationsRemoteShieldBooster;
  }

  public GetCharactersCharacterIdStatsModule activationsRemoteTrackingComputer(Long activationsRemoteTrackingComputer) {
    this.activationsRemoteTrackingComputer = activationsRemoteTrackingComputer;
    return this;
  }

  /**
   * activations_remote_tracking_computer integer
   *
   * @return activationsRemoteTrackingComputer
   **/
  @ApiModelProperty(value = "activations_remote_tracking_computer integer")


  public Long getActivationsRemoteTrackingComputer() {
    return activationsRemoteTrackingComputer;
  }

  public void setActivationsRemoteTrackingComputer(Long activationsRemoteTrackingComputer) {
    this.activationsRemoteTrackingComputer = activationsRemoteTrackingComputer;
  }

  public GetCharactersCharacterIdStatsModule activationsSalvager(Long activationsSalvager) {
    this.activationsSalvager = activationsSalvager;
    return this;
  }

  /**
   * activations_salvager integer
   *
   * @return activationsSalvager
   **/
  @ApiModelProperty(value = "activations_salvager integer")


  public Long getActivationsSalvager() {
    return activationsSalvager;
  }

  public void setActivationsSalvager(Long activationsSalvager) {
    this.activationsSalvager = activationsSalvager;
  }

  public GetCharactersCharacterIdStatsModule activationsSensorBooster(Long activationsSensorBooster) {
    this.activationsSensorBooster = activationsSensorBooster;
    return this;
  }

  /**
   * activations_sensor_booster integer
   *
   * @return activationsSensorBooster
   **/
  @ApiModelProperty(value = "activations_sensor_booster integer")


  public Long getActivationsSensorBooster() {
    return activationsSensorBooster;
  }

  public void setActivationsSensorBooster(Long activationsSensorBooster) {
    this.activationsSensorBooster = activationsSensorBooster;
  }

  public GetCharactersCharacterIdStatsModule activationsShieldBooster(Long activationsShieldBooster) {
    this.activationsShieldBooster = activationsShieldBooster;
    return this;
  }

  /**
   * activations_shield_booster integer
   *
   * @return activationsShieldBooster
   **/
  @ApiModelProperty(value = "activations_shield_booster integer")


  public Long getActivationsShieldBooster() {
    return activationsShieldBooster;
  }

  public void setActivationsShieldBooster(Long activationsShieldBooster) {
    this.activationsShieldBooster = activationsShieldBooster;
  }

  public GetCharactersCharacterIdStatsModule activationsShieldHardener(Long activationsShieldHardener) {
    this.activationsShieldHardener = activationsShieldHardener;
    return this;
  }

  /**
   * activations_shield_hardener integer
   *
   * @return activationsShieldHardener
   **/
  @ApiModelProperty(value = "activations_shield_hardener integer")


  public Long getActivationsShieldHardener() {
    return activationsShieldHardener;
  }

  public void setActivationsShieldHardener(Long activationsShieldHardener) {
    this.activationsShieldHardener = activationsShieldHardener;
  }

  public GetCharactersCharacterIdStatsModule activationsShipScanner(Long activationsShipScanner) {
    this.activationsShipScanner = activationsShipScanner;
    return this;
  }

  /**
   * activations_ship_scanner integer
   *
   * @return activationsShipScanner
   **/
  @ApiModelProperty(value = "activations_ship_scanner integer")


  public Long getActivationsShipScanner() {
    return activationsShipScanner;
  }

  public void setActivationsShipScanner(Long activationsShipScanner) {
    this.activationsShipScanner = activationsShipScanner;
  }

  public GetCharactersCharacterIdStatsModule activationsSiege(Long activationsSiege) {
    this.activationsSiege = activationsSiege;
    return this;
  }

  /**
   * activations_siege integer
   *
   * @return activationsSiege
   **/
  @ApiModelProperty(value = "activations_siege integer")


  public Long getActivationsSiege() {
    return activationsSiege;
  }

  public void setActivationsSiege(Long activationsSiege) {
    this.activationsSiege = activationsSiege;
  }

  public GetCharactersCharacterIdStatsModule activationsSmartBomb(Long activationsSmartBomb) {
    this.activationsSmartBomb = activationsSmartBomb;
    return this;
  }

  /**
   * activations_smart_bomb integer
   *
   * @return activationsSmartBomb
   **/
  @ApiModelProperty(value = "activations_smart_bomb integer")


  public Long getActivationsSmartBomb() {
    return activationsSmartBomb;
  }

  public void setActivationsSmartBomb(Long activationsSmartBomb) {
    this.activationsSmartBomb = activationsSmartBomb;
  }

  public GetCharactersCharacterIdStatsModule activationsStasisWeb(Long activationsStasisWeb) {
    this.activationsStasisWeb = activationsStasisWeb;
    return this;
  }

  /**
   * activations_stasis_web integer
   *
   * @return activationsStasisWeb
   **/
  @ApiModelProperty(value = "activations_stasis_web integer")


  public Long getActivationsStasisWeb() {
    return activationsStasisWeb;
  }

  public void setActivationsStasisWeb(Long activationsStasisWeb) {
    this.activationsStasisWeb = activationsStasisWeb;
  }

  public GetCharactersCharacterIdStatsModule activationsStripMiner(Long activationsStripMiner) {
    this.activationsStripMiner = activationsStripMiner;
    return this;
  }

  /**
   * activations_strip_miner integer
   *
   * @return activationsStripMiner
   **/
  @ApiModelProperty(value = "activations_strip_miner integer")


  public Long getActivationsStripMiner() {
    return activationsStripMiner;
  }

  public void setActivationsStripMiner(Long activationsStripMiner) {
    this.activationsStripMiner = activationsStripMiner;
  }

  public GetCharactersCharacterIdStatsModule activationsSuperWeapon(Long activationsSuperWeapon) {
    this.activationsSuperWeapon = activationsSuperWeapon;
    return this;
  }

  /**
   * activations_super_weapon integer
   *
   * @return activationsSuperWeapon
   **/
  @ApiModelProperty(value = "activations_super_weapon integer")


  public Long getActivationsSuperWeapon() {
    return activationsSuperWeapon;
  }

  public void setActivationsSuperWeapon(Long activationsSuperWeapon) {
    this.activationsSuperWeapon = activationsSuperWeapon;
  }

  public GetCharactersCharacterIdStatsModule activationsSurveyScanner(Long activationsSurveyScanner) {
    this.activationsSurveyScanner = activationsSurveyScanner;
    return this;
  }

  /**
   * activations_survey_scanner integer
   *
   * @return activationsSurveyScanner
   **/
  @ApiModelProperty(value = "activations_survey_scanner integer")


  public Long getActivationsSurveyScanner() {
    return activationsSurveyScanner;
  }

  public void setActivationsSurveyScanner(Long activationsSurveyScanner) {
    this.activationsSurveyScanner = activationsSurveyScanner;
  }

  public GetCharactersCharacterIdStatsModule activationsTargetBreaker(Long activationsTargetBreaker) {
    this.activationsTargetBreaker = activationsTargetBreaker;
    return this;
  }

  /**
   * activations_target_breaker integer
   *
   * @return activationsTargetBreaker
   **/
  @ApiModelProperty(value = "activations_target_breaker integer")


  public Long getActivationsTargetBreaker() {
    return activationsTargetBreaker;
  }

  public void setActivationsTargetBreaker(Long activationsTargetBreaker) {
    this.activationsTargetBreaker = activationsTargetBreaker;
  }

  public GetCharactersCharacterIdStatsModule activationsTargetPainter(Long activationsTargetPainter) {
    this.activationsTargetPainter = activationsTargetPainter;
    return this;
  }

  /**
   * activations_target_painter integer
   *
   * @return activationsTargetPainter
   **/
  @ApiModelProperty(value = "activations_target_painter integer")


  public Long getActivationsTargetPainter() {
    return activationsTargetPainter;
  }

  public void setActivationsTargetPainter(Long activationsTargetPainter) {
    this.activationsTargetPainter = activationsTargetPainter;
  }

  public GetCharactersCharacterIdStatsModule activationsTrackingComputer(Long activationsTrackingComputer) {
    this.activationsTrackingComputer = activationsTrackingComputer;
    return this;
  }

  /**
   * activations_tracking_computer integer
   *
   * @return activationsTrackingComputer
   **/
  @ApiModelProperty(value = "activations_tracking_computer integer")


  public Long getActivationsTrackingComputer() {
    return activationsTrackingComputer;
  }

  public void setActivationsTrackingComputer(Long activationsTrackingComputer) {
    this.activationsTrackingComputer = activationsTrackingComputer;
  }

  public GetCharactersCharacterIdStatsModule activationsTrackingDisruptor(Long activationsTrackingDisruptor) {
    this.activationsTrackingDisruptor = activationsTrackingDisruptor;
    return this;
  }

  /**
   * activations_tracking_disruptor integer
   *
   * @return activationsTrackingDisruptor
   **/
  @ApiModelProperty(value = "activations_tracking_disruptor integer")


  public Long getActivationsTrackingDisruptor() {
    return activationsTrackingDisruptor;
  }

  public void setActivationsTrackingDisruptor(Long activationsTrackingDisruptor) {
    this.activationsTrackingDisruptor = activationsTrackingDisruptor;
  }

  public GetCharactersCharacterIdStatsModule activationsTractorBeam(Long activationsTractorBeam) {
    this.activationsTractorBeam = activationsTractorBeam;
    return this;
  }

  /**
   * activations_tractor_beam integer
   *
   * @return activationsTractorBeam
   **/
  @ApiModelProperty(value = "activations_tractor_beam integer")


  public Long getActivationsTractorBeam() {
    return activationsTractorBeam;
  }

  public void setActivationsTractorBeam(Long activationsTractorBeam) {
    this.activationsTractorBeam = activationsTractorBeam;
  }

  public GetCharactersCharacterIdStatsModule activationsTriage(Long activationsTriage) {
    this.activationsTriage = activationsTriage;
    return this;
  }

  /**
   * activations_triage integer
   *
   * @return activationsTriage
   **/
  @ApiModelProperty(value = "activations_triage integer")


  public Long getActivationsTriage() {
    return activationsTriage;
  }

  public void setActivationsTriage(Long activationsTriage) {
    this.activationsTriage = activationsTriage;
  }

  public GetCharactersCharacterIdStatsModule activationsWarpDisruptFieldGenerator(Long activationsWarpDisruptFieldGenerator) {
    this.activationsWarpDisruptFieldGenerator = activationsWarpDisruptFieldGenerator;
    return this;
  }

  /**
   * activations_warp_disrupt_field_generator integer
   *
   * @return activationsWarpDisruptFieldGenerator
   **/
  @ApiModelProperty(value = "activations_warp_disrupt_field_generator integer")


  public Long getActivationsWarpDisruptFieldGenerator() {
    return activationsWarpDisruptFieldGenerator;
  }

  public void setActivationsWarpDisruptFieldGenerator(Long activationsWarpDisruptFieldGenerator) {
    this.activationsWarpDisruptFieldGenerator = activationsWarpDisruptFieldGenerator;
  }

  public GetCharactersCharacterIdStatsModule activationsWarpScrambler(Long activationsWarpScrambler) {
    this.activationsWarpScrambler = activationsWarpScrambler;
    return this;
  }

  /**
   * activations_warp_scrambler integer
   *
   * @return activationsWarpScrambler
   **/
  @ApiModelProperty(value = "activations_warp_scrambler integer")


  public Long getActivationsWarpScrambler() {
    return activationsWarpScrambler;
  }

  public void setActivationsWarpScrambler(Long activationsWarpScrambler) {
    this.activationsWarpScrambler = activationsWarpScrambler;
  }

  public GetCharactersCharacterIdStatsModule linkWeapons(Long linkWeapons) {
    this.linkWeapons = linkWeapons;
    return this;
  }

  /**
   * link_weapons integer
   *
   * @return linkWeapons
   **/
  @ApiModelProperty(value = "link_weapons integer")


  public Long getLinkWeapons() {
    return linkWeapons;
  }

  public void setLinkWeapons(Long linkWeapons) {
    this.linkWeapons = linkWeapons;
  }

  public GetCharactersCharacterIdStatsModule overload(Long overload) {
    this.overload = overload;
    return this;
  }

  /**
   * overload integer
   *
   * @return overload
   **/
  @ApiModelProperty(value = "overload integer")


  public Long getOverload() {
    return overload;
  }

  public void setOverload(Long overload) {
    this.overload = overload;
  }

  public GetCharactersCharacterIdStatsModule repairs(Long repairs) {
    this.repairs = repairs;
    return this;
  }

  /**
   * repairs integer
   *
   * @return repairs
   **/
  @ApiModelProperty(value = "repairs integer")


  public Long getRepairs() {
    return repairs;
  }

  public void setRepairs(Long repairs) {
    this.repairs = repairs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdStatsModule getCharactersCharacterIdStatsModule = (GetCharactersCharacterIdStatsModule) o;
    return Objects.equals(this.activationsArmorHardener, getCharactersCharacterIdStatsModule.activationsArmorHardener) &&
        Objects.equals(this.activationsArmorRepairUnit, getCharactersCharacterIdStatsModule.activationsArmorRepairUnit) &&
        Objects.equals(this.activationsArmorResistanceShiftHardener, getCharactersCharacterIdStatsModule.activationsArmorResistanceShiftHardener) &&
        Objects.equals(this.activationsAutomatedTargetingSystem, getCharactersCharacterIdStatsModule.activationsAutomatedTargetingSystem) &&
        Objects.equals(this.activationsBastion, getCharactersCharacterIdStatsModule.activationsBastion) &&
        Objects.equals(this.activationsBombLauncher, getCharactersCharacterIdStatsModule.activationsBombLauncher) &&
        Objects.equals(this.activationsCapacitorBooster, getCharactersCharacterIdStatsModule.activationsCapacitorBooster) &&
        Objects.equals(this.activationsCargoScanner, getCharactersCharacterIdStatsModule.activationsCargoScanner) &&
        Objects.equals(this.activationsCloakingDevice, getCharactersCharacterIdStatsModule.activationsCloakingDevice) &&
        Objects.equals(this.activationsCloneVatBay, getCharactersCharacterIdStatsModule.activationsCloneVatBay) &&
        Objects.equals(this.activationsCynosuralField, getCharactersCharacterIdStatsModule.activationsCynosuralField) &&
        Objects.equals(this.activationsDamageControl, getCharactersCharacterIdStatsModule.activationsDamageControl) &&
        Objects.equals(this.activationsDataMiners, getCharactersCharacterIdStatsModule.activationsDataMiners) &&
        Objects.equals(this.activationsDroneControlUnit, getCharactersCharacterIdStatsModule.activationsDroneControlUnit) &&
        Objects.equals(this.activationsDroneTrackingModules, getCharactersCharacterIdStatsModule.activationsDroneTrackingModules) &&
        Objects.equals(this.activationsEccm, getCharactersCharacterIdStatsModule.activationsEccm) &&
        Objects.equals(this.activationsEcm, getCharactersCharacterIdStatsModule.activationsEcm) &&
        Objects.equals(this.activationsEcmBurst, getCharactersCharacterIdStatsModule.activationsEcmBurst) &&
        Objects.equals(this.activationsEnergyDestabilizer, getCharactersCharacterIdStatsModule.activationsEnergyDestabilizer) &&
        Objects.equals(this.activationsEnergyVampire, getCharactersCharacterIdStatsModule.activationsEnergyVampire) &&
        Objects.equals(this.activationsEnergyWeapon, getCharactersCharacterIdStatsModule.activationsEnergyWeapon) &&
        Objects.equals(this.activationsFestivalLauncher, getCharactersCharacterIdStatsModule.activationsFestivalLauncher) &&
        Objects.equals(this.activationsFrequencyMiningLaser, getCharactersCharacterIdStatsModule.activationsFrequencyMiningLaser) &&
        Objects.equals(this.activationsFueledArmorRepairer, getCharactersCharacterIdStatsModule.activationsFueledArmorRepairer) &&
        Objects.equals(this.activationsFueledShieldBooster, getCharactersCharacterIdStatsModule.activationsFueledShieldBooster) &&
        Objects.equals(this.activationsGangCoordinator, getCharactersCharacterIdStatsModule.activationsGangCoordinator) &&
        Objects.equals(this.activationsGasCloudHarvester, getCharactersCharacterIdStatsModule.activationsGasCloudHarvester) &&
        Objects.equals(this.activationsHullRepairUnit, getCharactersCharacterIdStatsModule.activationsHullRepairUnit) &&
        Objects.equals(this.activationsHybridWeapon, getCharactersCharacterIdStatsModule.activationsHybridWeapon) &&
        Objects.equals(this.activationsIndustrialCore, getCharactersCharacterIdStatsModule.activationsIndustrialCore) &&
        Objects.equals(this.activationsInterdictionSphereLauncher, getCharactersCharacterIdStatsModule.activationsInterdictionSphereLauncher) &&
        Objects.equals(this.activationsMicroJumpDrive, getCharactersCharacterIdStatsModule.activationsMicroJumpDrive) &&
        Objects.equals(this.activationsMiningLaser, getCharactersCharacterIdStatsModule.activationsMiningLaser) &&
        Objects.equals(this.activationsMissileLauncher, getCharactersCharacterIdStatsModule.activationsMissileLauncher) &&
        Objects.equals(this.activationsPassiveTargetingSystem, getCharactersCharacterIdStatsModule.activationsPassiveTargetingSystem) &&
        Objects.equals(this.activationsProbeLauncher, getCharactersCharacterIdStatsModule.activationsProbeLauncher) &&
        Objects.equals(this.activationsProjectedEccm, getCharactersCharacterIdStatsModule.activationsProjectedEccm) &&
        Objects.equals(this.activationsProjectileWeapon, getCharactersCharacterIdStatsModule.activationsProjectileWeapon) &&
        Objects.equals(this.activationsPropulsionModule, getCharactersCharacterIdStatsModule.activationsPropulsionModule) &&
        Objects.equals(this.activationsRemoteArmorRepairer, getCharactersCharacterIdStatsModule.activationsRemoteArmorRepairer) &&
        Objects.equals(this.activationsRemoteCapacitorTransmitter, getCharactersCharacterIdStatsModule.activationsRemoteCapacitorTransmitter) &&
        Objects.equals(this.activationsRemoteEcmBurst, getCharactersCharacterIdStatsModule.activationsRemoteEcmBurst) &&
        Objects.equals(this.activationsRemoteHullRepairer, getCharactersCharacterIdStatsModule.activationsRemoteHullRepairer) &&
        Objects.equals(this.activationsRemoteSensorBooster, getCharactersCharacterIdStatsModule.activationsRemoteSensorBooster) &&
        Objects.equals(this.activationsRemoteSensorDamper, getCharactersCharacterIdStatsModule.activationsRemoteSensorDamper) &&
        Objects.equals(this.activationsRemoteShieldBooster, getCharactersCharacterIdStatsModule.activationsRemoteShieldBooster) &&
        Objects.equals(this.activationsRemoteTrackingComputer, getCharactersCharacterIdStatsModule.activationsRemoteTrackingComputer) &&
        Objects.equals(this.activationsSalvager, getCharactersCharacterIdStatsModule.activationsSalvager) &&
        Objects.equals(this.activationsSensorBooster, getCharactersCharacterIdStatsModule.activationsSensorBooster) &&
        Objects.equals(this.activationsShieldBooster, getCharactersCharacterIdStatsModule.activationsShieldBooster) &&
        Objects.equals(this.activationsShieldHardener, getCharactersCharacterIdStatsModule.activationsShieldHardener) &&
        Objects.equals(this.activationsShipScanner, getCharactersCharacterIdStatsModule.activationsShipScanner) &&
        Objects.equals(this.activationsSiege, getCharactersCharacterIdStatsModule.activationsSiege) &&
        Objects.equals(this.activationsSmartBomb, getCharactersCharacterIdStatsModule.activationsSmartBomb) &&
        Objects.equals(this.activationsStasisWeb, getCharactersCharacterIdStatsModule.activationsStasisWeb) &&
        Objects.equals(this.activationsStripMiner, getCharactersCharacterIdStatsModule.activationsStripMiner) &&
        Objects.equals(this.activationsSuperWeapon, getCharactersCharacterIdStatsModule.activationsSuperWeapon) &&
        Objects.equals(this.activationsSurveyScanner, getCharactersCharacterIdStatsModule.activationsSurveyScanner) &&
        Objects.equals(this.activationsTargetBreaker, getCharactersCharacterIdStatsModule.activationsTargetBreaker) &&
        Objects.equals(this.activationsTargetPainter, getCharactersCharacterIdStatsModule.activationsTargetPainter) &&
        Objects.equals(this.activationsTrackingComputer, getCharactersCharacterIdStatsModule.activationsTrackingComputer) &&
        Objects.equals(this.activationsTrackingDisruptor, getCharactersCharacterIdStatsModule.activationsTrackingDisruptor) &&
        Objects.equals(this.activationsTractorBeam, getCharactersCharacterIdStatsModule.activationsTractorBeam) &&
        Objects.equals(this.activationsTriage, getCharactersCharacterIdStatsModule.activationsTriage) &&
        Objects.equals(this.activationsWarpDisruptFieldGenerator, getCharactersCharacterIdStatsModule.activationsWarpDisruptFieldGenerator) &&
        Objects.equals(this.activationsWarpScrambler, getCharactersCharacterIdStatsModule.activationsWarpScrambler) &&
        Objects.equals(this.linkWeapons, getCharactersCharacterIdStatsModule.linkWeapons) &&
        Objects.equals(this.overload, getCharactersCharacterIdStatsModule.overload) &&
        Objects.equals(this.repairs, getCharactersCharacterIdStatsModule.repairs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activationsArmorHardener, activationsArmorRepairUnit, activationsArmorResistanceShiftHardener, activationsAutomatedTargetingSystem, activationsBastion, activationsBombLauncher, activationsCapacitorBooster, activationsCargoScanner, activationsCloakingDevice, activationsCloneVatBay, activationsCynosuralField, activationsDamageControl, activationsDataMiners, activationsDroneControlUnit, activationsDroneTrackingModules, activationsEccm, activationsEcm, activationsEcmBurst, activationsEnergyDestabilizer, activationsEnergyVampire, activationsEnergyWeapon, activationsFestivalLauncher, activationsFrequencyMiningLaser, activationsFueledArmorRepairer, activationsFueledShieldBooster, activationsGangCoordinator, activationsGasCloudHarvester, activationsHullRepairUnit, activationsHybridWeapon, activationsIndustrialCore, activationsInterdictionSphereLauncher, activationsMicroJumpDrive, activationsMiningLaser, activationsMissileLauncher, activationsPassiveTargetingSystem, activationsProbeLauncher, activationsProjectedEccm, activationsProjectileWeapon, activationsPropulsionModule, activationsRemoteArmorRepairer, activationsRemoteCapacitorTransmitter, activationsRemoteEcmBurst, activationsRemoteHullRepairer, activationsRemoteSensorBooster, activationsRemoteSensorDamper, activationsRemoteShieldBooster, activationsRemoteTrackingComputer, activationsSalvager, activationsSensorBooster, activationsShieldBooster, activationsShieldHardener, activationsShipScanner, activationsSiege, activationsSmartBomb, activationsStasisWeb, activationsStripMiner, activationsSuperWeapon, activationsSurveyScanner, activationsTargetBreaker, activationsTargetPainter, activationsTrackingComputer, activationsTrackingDisruptor, activationsTractorBeam, activationsTriage, activationsWarpDisruptFieldGenerator, activationsWarpScrambler, linkWeapons, overload, repairs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdStatsModule {\n");

    sb.append("    activationsArmorHardener: ").append(toIndentedString(activationsArmorHardener)).append("\n");
    sb.append("    activationsArmorRepairUnit: ").append(toIndentedString(activationsArmorRepairUnit)).append("\n");
    sb.append("    activationsArmorResistanceShiftHardener: ").append(toIndentedString(activationsArmorResistanceShiftHardener)).append("\n");
    sb.append("    activationsAutomatedTargetingSystem: ").append(toIndentedString(activationsAutomatedTargetingSystem)).append("\n");
    sb.append("    activationsBastion: ").append(toIndentedString(activationsBastion)).append("\n");
    sb.append("    activationsBombLauncher: ").append(toIndentedString(activationsBombLauncher)).append("\n");
    sb.append("    activationsCapacitorBooster: ").append(toIndentedString(activationsCapacitorBooster)).append("\n");
    sb.append("    activationsCargoScanner: ").append(toIndentedString(activationsCargoScanner)).append("\n");
    sb.append("    activationsCloakingDevice: ").append(toIndentedString(activationsCloakingDevice)).append("\n");
    sb.append("    activationsCloneVatBay: ").append(toIndentedString(activationsCloneVatBay)).append("\n");
    sb.append("    activationsCynosuralField: ").append(toIndentedString(activationsCynosuralField)).append("\n");
    sb.append("    activationsDamageControl: ").append(toIndentedString(activationsDamageControl)).append("\n");
    sb.append("    activationsDataMiners: ").append(toIndentedString(activationsDataMiners)).append("\n");
    sb.append("    activationsDroneControlUnit: ").append(toIndentedString(activationsDroneControlUnit)).append("\n");
    sb.append("    activationsDroneTrackingModules: ").append(toIndentedString(activationsDroneTrackingModules)).append("\n");
    sb.append("    activationsEccm: ").append(toIndentedString(activationsEccm)).append("\n");
    sb.append("    activationsEcm: ").append(toIndentedString(activationsEcm)).append("\n");
    sb.append("    activationsEcmBurst: ").append(toIndentedString(activationsEcmBurst)).append("\n");
    sb.append("    activationsEnergyDestabilizer: ").append(toIndentedString(activationsEnergyDestabilizer)).append("\n");
    sb.append("    activationsEnergyVampire: ").append(toIndentedString(activationsEnergyVampire)).append("\n");
    sb.append("    activationsEnergyWeapon: ").append(toIndentedString(activationsEnergyWeapon)).append("\n");
    sb.append("    activationsFestivalLauncher: ").append(toIndentedString(activationsFestivalLauncher)).append("\n");
    sb.append("    activationsFrequencyMiningLaser: ").append(toIndentedString(activationsFrequencyMiningLaser)).append("\n");
    sb.append("    activationsFueledArmorRepairer: ").append(toIndentedString(activationsFueledArmorRepairer)).append("\n");
    sb.append("    activationsFueledShieldBooster: ").append(toIndentedString(activationsFueledShieldBooster)).append("\n");
    sb.append("    activationsGangCoordinator: ").append(toIndentedString(activationsGangCoordinator)).append("\n");
    sb.append("    activationsGasCloudHarvester: ").append(toIndentedString(activationsGasCloudHarvester)).append("\n");
    sb.append("    activationsHullRepairUnit: ").append(toIndentedString(activationsHullRepairUnit)).append("\n");
    sb.append("    activationsHybridWeapon: ").append(toIndentedString(activationsHybridWeapon)).append("\n");
    sb.append("    activationsIndustrialCore: ").append(toIndentedString(activationsIndustrialCore)).append("\n");
    sb.append("    activationsInterdictionSphereLauncher: ").append(toIndentedString(activationsInterdictionSphereLauncher)).append("\n");
    sb.append("    activationsMicroJumpDrive: ").append(toIndentedString(activationsMicroJumpDrive)).append("\n");
    sb.append("    activationsMiningLaser: ").append(toIndentedString(activationsMiningLaser)).append("\n");
    sb.append("    activationsMissileLauncher: ").append(toIndentedString(activationsMissileLauncher)).append("\n");
    sb.append("    activationsPassiveTargetingSystem: ").append(toIndentedString(activationsPassiveTargetingSystem)).append("\n");
    sb.append("    activationsProbeLauncher: ").append(toIndentedString(activationsProbeLauncher)).append("\n");
    sb.append("    activationsProjectedEccm: ").append(toIndentedString(activationsProjectedEccm)).append("\n");
    sb.append("    activationsProjectileWeapon: ").append(toIndentedString(activationsProjectileWeapon)).append("\n");
    sb.append("    activationsPropulsionModule: ").append(toIndentedString(activationsPropulsionModule)).append("\n");
    sb.append("    activationsRemoteArmorRepairer: ").append(toIndentedString(activationsRemoteArmorRepairer)).append("\n");
    sb.append("    activationsRemoteCapacitorTransmitter: ").append(toIndentedString(activationsRemoteCapacitorTransmitter)).append("\n");
    sb.append("    activationsRemoteEcmBurst: ").append(toIndentedString(activationsRemoteEcmBurst)).append("\n");
    sb.append("    activationsRemoteHullRepairer: ").append(toIndentedString(activationsRemoteHullRepairer)).append("\n");
    sb.append("    activationsRemoteSensorBooster: ").append(toIndentedString(activationsRemoteSensorBooster)).append("\n");
    sb.append("    activationsRemoteSensorDamper: ").append(toIndentedString(activationsRemoteSensorDamper)).append("\n");
    sb.append("    activationsRemoteShieldBooster: ").append(toIndentedString(activationsRemoteShieldBooster)).append("\n");
    sb.append("    activationsRemoteTrackingComputer: ").append(toIndentedString(activationsRemoteTrackingComputer)).append("\n");
    sb.append("    activationsSalvager: ").append(toIndentedString(activationsSalvager)).append("\n");
    sb.append("    activationsSensorBooster: ").append(toIndentedString(activationsSensorBooster)).append("\n");
    sb.append("    activationsShieldBooster: ").append(toIndentedString(activationsShieldBooster)).append("\n");
    sb.append("    activationsShieldHardener: ").append(toIndentedString(activationsShieldHardener)).append("\n");
    sb.append("    activationsShipScanner: ").append(toIndentedString(activationsShipScanner)).append("\n");
    sb.append("    activationsSiege: ").append(toIndentedString(activationsSiege)).append("\n");
    sb.append("    activationsSmartBomb: ").append(toIndentedString(activationsSmartBomb)).append("\n");
    sb.append("    activationsStasisWeb: ").append(toIndentedString(activationsStasisWeb)).append("\n");
    sb.append("    activationsStripMiner: ").append(toIndentedString(activationsStripMiner)).append("\n");
    sb.append("    activationsSuperWeapon: ").append(toIndentedString(activationsSuperWeapon)).append("\n");
    sb.append("    activationsSurveyScanner: ").append(toIndentedString(activationsSurveyScanner)).append("\n");
    sb.append("    activationsTargetBreaker: ").append(toIndentedString(activationsTargetBreaker)).append("\n");
    sb.append("    activationsTargetPainter: ").append(toIndentedString(activationsTargetPainter)).append("\n");
    sb.append("    activationsTrackingComputer: ").append(toIndentedString(activationsTrackingComputer)).append("\n");
    sb.append("    activationsTrackingDisruptor: ").append(toIndentedString(activationsTrackingDisruptor)).append("\n");
    sb.append("    activationsTractorBeam: ").append(toIndentedString(activationsTractorBeam)).append("\n");
    sb.append("    activationsTriage: ").append(toIndentedString(activationsTriage)).append("\n");
    sb.append("    activationsWarpDisruptFieldGenerator: ").append(toIndentedString(activationsWarpDisruptFieldGenerator)).append("\n");
    sb.append("    activationsWarpScrambler: ").append(toIndentedString(activationsWarpScrambler)).append("\n");
    sb.append("    linkWeapons: ").append(toIndentedString(linkWeapons)).append("\n");
    sb.append("    overload: ").append(toIndentedString(overload)).append("\n");
    sb.append("    repairs: ").append(toIndentedString(repairs)).append("\n");
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

