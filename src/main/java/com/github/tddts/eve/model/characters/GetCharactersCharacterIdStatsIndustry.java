package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * industry object
 */
@ApiModel(description = "industry object")
@Validated
public class GetCharactersCharacterIdStatsIndustry {
  @JsonProperty("hacking_successes")
  private Long hackingSuccesses = null;

  @JsonProperty("jobs_cancelled")
  private Long jobsCancelled = null;

  @JsonProperty("jobs_completed_copy_blueprint")
  private Long jobsCompletedCopyBlueprint = null;

  @JsonProperty("jobs_completed_invention")
  private Long jobsCompletedInvention = null;

  @JsonProperty("jobs_completed_manufacture")
  private Long jobsCompletedManufacture = null;

  @JsonProperty("jobs_completed_manufacture_asteroid")
  private Long jobsCompletedManufactureAsteroid = null;

  @JsonProperty("jobs_completed_manufacture_asteroid_quantity")
  private Long jobsCompletedManufactureAsteroidQuantity = null;

  @JsonProperty("jobs_completed_manufacture_charge")
  private Long jobsCompletedManufactureCharge = null;

  @JsonProperty("jobs_completed_manufacture_charge_quantity")
  private Long jobsCompletedManufactureChargeQuantity = null;

  @JsonProperty("jobs_completed_manufacture_commodity")
  private Long jobsCompletedManufactureCommodity = null;

  @JsonProperty("jobs_completed_manufacture_commodity_quantity")
  private Long jobsCompletedManufactureCommodityQuantity = null;

  @JsonProperty("jobs_completed_manufacture_deployable")
  private Long jobsCompletedManufactureDeployable = null;

  @JsonProperty("jobs_completed_manufacture_deployable_quantity")
  private Long jobsCompletedManufactureDeployableQuantity = null;

  @JsonProperty("jobs_completed_manufacture_drone")
  private Long jobsCompletedManufactureDrone = null;

  @JsonProperty("jobs_completed_manufacture_drone_quantity")
  private Long jobsCompletedManufactureDroneQuantity = null;

  @JsonProperty("jobs_completed_manufacture_implant")
  private Long jobsCompletedManufactureImplant = null;

  @JsonProperty("jobs_completed_manufacture_implant_quantity")
  private Long jobsCompletedManufactureImplantQuantity = null;

  @JsonProperty("jobs_completed_manufacture_module")
  private Long jobsCompletedManufactureModule = null;

  @JsonProperty("jobs_completed_manufacture_module_quantity")
  private Long jobsCompletedManufactureModuleQuantity = null;

  @JsonProperty("jobs_completed_manufacture_other")
  private Long jobsCompletedManufactureOther = null;

  @JsonProperty("jobs_completed_manufacture_other_quantity")
  private Long jobsCompletedManufactureOtherQuantity = null;

  @JsonProperty("jobs_completed_manufacture_ship")
  private Long jobsCompletedManufactureShip = null;

  @JsonProperty("jobs_completed_manufacture_ship_quantity")
  private Long jobsCompletedManufactureShipQuantity = null;

  @JsonProperty("jobs_completed_manufacture_structure")
  private Long jobsCompletedManufactureStructure = null;

  @JsonProperty("jobs_completed_manufacture_structure_quantity")
  private Long jobsCompletedManufactureStructureQuantity = null;

  @JsonProperty("jobs_completed_manufacture_subsystem")
  private Long jobsCompletedManufactureSubsystem = null;

  @JsonProperty("jobs_completed_manufacture_subsystem_quantity")
  private Long jobsCompletedManufactureSubsystemQuantity = null;

  @JsonProperty("jobs_completed_material_productivity")
  private Long jobsCompletedMaterialProductivity = null;

  @JsonProperty("jobs_completed_time_productivity")
  private Long jobsCompletedTimeProductivity = null;

  @JsonProperty("jobs_started_copy_blueprint")
  private Long jobsStartedCopyBlueprint = null;

  @JsonProperty("jobs_started_invention")
  private Long jobsStartedInvention = null;

  @JsonProperty("jobs_started_manufacture")
  private Long jobsStartedManufacture = null;

  @JsonProperty("jobs_started_material_productivity")
  private Long jobsStartedMaterialProductivity = null;

  @JsonProperty("jobs_started_time_productivity")
  private Long jobsStartedTimeProductivity = null;

  @JsonProperty("reprocess_item")
  private Long reprocessItem = null;

  @JsonProperty("reprocess_item_quantity")
  private Long reprocessItemQuantity = null;

  public GetCharactersCharacterIdStatsIndustry hackingSuccesses(Long hackingSuccesses) {
    this.hackingSuccesses = hackingSuccesses;
    return this;
  }

  /**
   * hacking_successes integer
   *
   * @return hackingSuccesses
   **/
  @ApiModelProperty(value = "hacking_successes integer")


  public Long getHackingSuccesses() {
    return hackingSuccesses;
  }

  public void setHackingSuccesses(Long hackingSuccesses) {
    this.hackingSuccesses = hackingSuccesses;
  }

  public GetCharactersCharacterIdStatsIndustry jobsCancelled(Long jobsCancelled) {
    this.jobsCancelled = jobsCancelled;
    return this;
  }

  /**
   * jobs_cancelled integer
   *
   * @return jobsCancelled
   **/
  @ApiModelProperty(value = "jobs_cancelled integer")


  public Long getJobsCancelled() {
    return jobsCancelled;
  }

  public void setJobsCancelled(Long jobsCancelled) {
    this.jobsCancelled = jobsCancelled;
  }

  public GetCharactersCharacterIdStatsIndustry jobsCompletedCopyBlueprint(Long jobsCompletedCopyBlueprint) {
    this.jobsCompletedCopyBlueprint = jobsCompletedCopyBlueprint;
    return this;
  }

  /**
   * jobs_completed_copy_blueprint integer
   *
   * @return jobsCompletedCopyBlueprint
   **/
  @ApiModelProperty(value = "jobs_completed_copy_blueprint integer")


  public Long getJobsCompletedCopyBlueprint() {
    return jobsCompletedCopyBlueprint;
  }

  public void setJobsCompletedCopyBlueprint(Long jobsCompletedCopyBlueprint) {
    this.jobsCompletedCopyBlueprint = jobsCompletedCopyBlueprint;
  }

  public GetCharactersCharacterIdStatsIndustry jobsCompletedInvention(Long jobsCompletedInvention) {
    this.jobsCompletedInvention = jobsCompletedInvention;
    return this;
  }

  /**
   * jobs_completed_invention integer
   *
   * @return jobsCompletedInvention
   **/
  @ApiModelProperty(value = "jobs_completed_invention integer")


  public Long getJobsCompletedInvention() {
    return jobsCompletedInvention;
  }

  public void setJobsCompletedInvention(Long jobsCompletedInvention) {
    this.jobsCompletedInvention = jobsCompletedInvention;
  }

  public GetCharactersCharacterIdStatsIndustry jobsCompletedManufacture(Long jobsCompletedManufacture) {
    this.jobsCompletedManufacture = jobsCompletedManufacture;
    return this;
  }

  /**
   * jobs_completed_manufacture integer
   *
   * @return jobsCompletedManufacture
   **/
  @ApiModelProperty(value = "jobs_completed_manufacture integer")


  public Long getJobsCompletedManufacture() {
    return jobsCompletedManufacture;
  }

  public void setJobsCompletedManufacture(Long jobsCompletedManufacture) {
    this.jobsCompletedManufacture = jobsCompletedManufacture;
  }

  public GetCharactersCharacterIdStatsIndustry jobsCompletedManufactureAsteroid(Long jobsCompletedManufactureAsteroid) {
    this.jobsCompletedManufactureAsteroid = jobsCompletedManufactureAsteroid;
    return this;
  }

  /**
   * jobs_completed_manufacture_asteroid integer
   *
   * @return jobsCompletedManufactureAsteroid
   **/
  @ApiModelProperty(value = "jobs_completed_manufacture_asteroid integer")


  public Long getJobsCompletedManufactureAsteroid() {
    return jobsCompletedManufactureAsteroid;
  }

  public void setJobsCompletedManufactureAsteroid(Long jobsCompletedManufactureAsteroid) {
    this.jobsCompletedManufactureAsteroid = jobsCompletedManufactureAsteroid;
  }

  public GetCharactersCharacterIdStatsIndustry jobsCompletedManufactureAsteroidQuantity(Long jobsCompletedManufactureAsteroidQuantity) {
    this.jobsCompletedManufactureAsteroidQuantity = jobsCompletedManufactureAsteroidQuantity;
    return this;
  }

  /**
   * jobs_completed_manufacture_asteroid_quantity integer
   *
   * @return jobsCompletedManufactureAsteroidQuantity
   **/
  @ApiModelProperty(value = "jobs_completed_manufacture_asteroid_quantity integer")


  public Long getJobsCompletedManufactureAsteroidQuantity() {
    return jobsCompletedManufactureAsteroidQuantity;
  }

  public void setJobsCompletedManufactureAsteroidQuantity(Long jobsCompletedManufactureAsteroidQuantity) {
    this.jobsCompletedManufactureAsteroidQuantity = jobsCompletedManufactureAsteroidQuantity;
  }

  public GetCharactersCharacterIdStatsIndustry jobsCompletedManufactureCharge(Long jobsCompletedManufactureCharge) {
    this.jobsCompletedManufactureCharge = jobsCompletedManufactureCharge;
    return this;
  }

  /**
   * jobs_completed_manufacture_charge integer
   *
   * @return jobsCompletedManufactureCharge
   **/
  @ApiModelProperty(value = "jobs_completed_manufacture_charge integer")


  public Long getJobsCompletedManufactureCharge() {
    return jobsCompletedManufactureCharge;
  }

  public void setJobsCompletedManufactureCharge(Long jobsCompletedManufactureCharge) {
    this.jobsCompletedManufactureCharge = jobsCompletedManufactureCharge;
  }

  public GetCharactersCharacterIdStatsIndustry jobsCompletedManufactureChargeQuantity(Long jobsCompletedManufactureChargeQuantity) {
    this.jobsCompletedManufactureChargeQuantity = jobsCompletedManufactureChargeQuantity;
    return this;
  }

  /**
   * jobs_completed_manufacture_charge_quantity integer
   *
   * @return jobsCompletedManufactureChargeQuantity
   **/
  @ApiModelProperty(value = "jobs_completed_manufacture_charge_quantity integer")


  public Long getJobsCompletedManufactureChargeQuantity() {
    return jobsCompletedManufactureChargeQuantity;
  }

  public void setJobsCompletedManufactureChargeQuantity(Long jobsCompletedManufactureChargeQuantity) {
    this.jobsCompletedManufactureChargeQuantity = jobsCompletedManufactureChargeQuantity;
  }

  public GetCharactersCharacterIdStatsIndustry jobsCompletedManufactureCommodity(Long jobsCompletedManufactureCommodity) {
    this.jobsCompletedManufactureCommodity = jobsCompletedManufactureCommodity;
    return this;
  }

  /**
   * jobs_completed_manufacture_commodity integer
   *
   * @return jobsCompletedManufactureCommodity
   **/
  @ApiModelProperty(value = "jobs_completed_manufacture_commodity integer")


  public Long getJobsCompletedManufactureCommodity() {
    return jobsCompletedManufactureCommodity;
  }

  public void setJobsCompletedManufactureCommodity(Long jobsCompletedManufactureCommodity) {
    this.jobsCompletedManufactureCommodity = jobsCompletedManufactureCommodity;
  }

  public GetCharactersCharacterIdStatsIndustry jobsCompletedManufactureCommodityQuantity(Long jobsCompletedManufactureCommodityQuantity) {
    this.jobsCompletedManufactureCommodityQuantity = jobsCompletedManufactureCommodityQuantity;
    return this;
  }

  /**
   * jobs_completed_manufacture_commodity_quantity integer
   *
   * @return jobsCompletedManufactureCommodityQuantity
   **/
  @ApiModelProperty(value = "jobs_completed_manufacture_commodity_quantity integer")


  public Long getJobsCompletedManufactureCommodityQuantity() {
    return jobsCompletedManufactureCommodityQuantity;
  }

  public void setJobsCompletedManufactureCommodityQuantity(Long jobsCompletedManufactureCommodityQuantity) {
    this.jobsCompletedManufactureCommodityQuantity = jobsCompletedManufactureCommodityQuantity;
  }

  public GetCharactersCharacterIdStatsIndustry jobsCompletedManufactureDeployable(Long jobsCompletedManufactureDeployable) {
    this.jobsCompletedManufactureDeployable = jobsCompletedManufactureDeployable;
    return this;
  }

  /**
   * jobs_completed_manufacture_deployable integer
   *
   * @return jobsCompletedManufactureDeployable
   **/
  @ApiModelProperty(value = "jobs_completed_manufacture_deployable integer")


  public Long getJobsCompletedManufactureDeployable() {
    return jobsCompletedManufactureDeployable;
  }

  public void setJobsCompletedManufactureDeployable(Long jobsCompletedManufactureDeployable) {
    this.jobsCompletedManufactureDeployable = jobsCompletedManufactureDeployable;
  }

  public GetCharactersCharacterIdStatsIndustry jobsCompletedManufactureDeployableQuantity(Long jobsCompletedManufactureDeployableQuantity) {
    this.jobsCompletedManufactureDeployableQuantity = jobsCompletedManufactureDeployableQuantity;
    return this;
  }

  /**
   * jobs_completed_manufacture_deployable_quantity integer
   *
   * @return jobsCompletedManufactureDeployableQuantity
   **/
  @ApiModelProperty(value = "jobs_completed_manufacture_deployable_quantity integer")


  public Long getJobsCompletedManufactureDeployableQuantity() {
    return jobsCompletedManufactureDeployableQuantity;
  }

  public void setJobsCompletedManufactureDeployableQuantity(Long jobsCompletedManufactureDeployableQuantity) {
    this.jobsCompletedManufactureDeployableQuantity = jobsCompletedManufactureDeployableQuantity;
  }

  public GetCharactersCharacterIdStatsIndustry jobsCompletedManufactureDrone(Long jobsCompletedManufactureDrone) {
    this.jobsCompletedManufactureDrone = jobsCompletedManufactureDrone;
    return this;
  }

  /**
   * jobs_completed_manufacture_drone integer
   *
   * @return jobsCompletedManufactureDrone
   **/
  @ApiModelProperty(value = "jobs_completed_manufacture_drone integer")


  public Long getJobsCompletedManufactureDrone() {
    return jobsCompletedManufactureDrone;
  }

  public void setJobsCompletedManufactureDrone(Long jobsCompletedManufactureDrone) {
    this.jobsCompletedManufactureDrone = jobsCompletedManufactureDrone;
  }

  public GetCharactersCharacterIdStatsIndustry jobsCompletedManufactureDroneQuantity(Long jobsCompletedManufactureDroneQuantity) {
    this.jobsCompletedManufactureDroneQuantity = jobsCompletedManufactureDroneQuantity;
    return this;
  }

  /**
   * jobs_completed_manufacture_drone_quantity integer
   *
   * @return jobsCompletedManufactureDroneQuantity
   **/
  @ApiModelProperty(value = "jobs_completed_manufacture_drone_quantity integer")


  public Long getJobsCompletedManufactureDroneQuantity() {
    return jobsCompletedManufactureDroneQuantity;
  }

  public void setJobsCompletedManufactureDroneQuantity(Long jobsCompletedManufactureDroneQuantity) {
    this.jobsCompletedManufactureDroneQuantity = jobsCompletedManufactureDroneQuantity;
  }

  public GetCharactersCharacterIdStatsIndustry jobsCompletedManufactureImplant(Long jobsCompletedManufactureImplant) {
    this.jobsCompletedManufactureImplant = jobsCompletedManufactureImplant;
    return this;
  }

  /**
   * jobs_completed_manufacture_implant integer
   *
   * @return jobsCompletedManufactureImplant
   **/
  @ApiModelProperty(value = "jobs_completed_manufacture_implant integer")


  public Long getJobsCompletedManufactureImplant() {
    return jobsCompletedManufactureImplant;
  }

  public void setJobsCompletedManufactureImplant(Long jobsCompletedManufactureImplant) {
    this.jobsCompletedManufactureImplant = jobsCompletedManufactureImplant;
  }

  public GetCharactersCharacterIdStatsIndustry jobsCompletedManufactureImplantQuantity(Long jobsCompletedManufactureImplantQuantity) {
    this.jobsCompletedManufactureImplantQuantity = jobsCompletedManufactureImplantQuantity;
    return this;
  }

  /**
   * jobs_completed_manufacture_implant_quantity integer
   *
   * @return jobsCompletedManufactureImplantQuantity
   **/
  @ApiModelProperty(value = "jobs_completed_manufacture_implant_quantity integer")


  public Long getJobsCompletedManufactureImplantQuantity() {
    return jobsCompletedManufactureImplantQuantity;
  }

  public void setJobsCompletedManufactureImplantQuantity(Long jobsCompletedManufactureImplantQuantity) {
    this.jobsCompletedManufactureImplantQuantity = jobsCompletedManufactureImplantQuantity;
  }

  public GetCharactersCharacterIdStatsIndustry jobsCompletedManufactureModule(Long jobsCompletedManufactureModule) {
    this.jobsCompletedManufactureModule = jobsCompletedManufactureModule;
    return this;
  }

  /**
   * jobs_completed_manufacture_module integer
   *
   * @return jobsCompletedManufactureModule
   **/
  @ApiModelProperty(value = "jobs_completed_manufacture_module integer")


  public Long getJobsCompletedManufactureModule() {
    return jobsCompletedManufactureModule;
  }

  public void setJobsCompletedManufactureModule(Long jobsCompletedManufactureModule) {
    this.jobsCompletedManufactureModule = jobsCompletedManufactureModule;
  }

  public GetCharactersCharacterIdStatsIndustry jobsCompletedManufactureModuleQuantity(Long jobsCompletedManufactureModuleQuantity) {
    this.jobsCompletedManufactureModuleQuantity = jobsCompletedManufactureModuleQuantity;
    return this;
  }

  /**
   * jobs_completed_manufacture_module_quantity integer
   *
   * @return jobsCompletedManufactureModuleQuantity
   **/
  @ApiModelProperty(value = "jobs_completed_manufacture_module_quantity integer")


  public Long getJobsCompletedManufactureModuleQuantity() {
    return jobsCompletedManufactureModuleQuantity;
  }

  public void setJobsCompletedManufactureModuleQuantity(Long jobsCompletedManufactureModuleQuantity) {
    this.jobsCompletedManufactureModuleQuantity = jobsCompletedManufactureModuleQuantity;
  }

  public GetCharactersCharacterIdStatsIndustry jobsCompletedManufactureOther(Long jobsCompletedManufactureOther) {
    this.jobsCompletedManufactureOther = jobsCompletedManufactureOther;
    return this;
  }

  /**
   * jobs_completed_manufacture_other integer
   *
   * @return jobsCompletedManufactureOther
   **/
  @ApiModelProperty(value = "jobs_completed_manufacture_other integer")


  public Long getJobsCompletedManufactureOther() {
    return jobsCompletedManufactureOther;
  }

  public void setJobsCompletedManufactureOther(Long jobsCompletedManufactureOther) {
    this.jobsCompletedManufactureOther = jobsCompletedManufactureOther;
  }

  public GetCharactersCharacterIdStatsIndustry jobsCompletedManufactureOtherQuantity(Long jobsCompletedManufactureOtherQuantity) {
    this.jobsCompletedManufactureOtherQuantity = jobsCompletedManufactureOtherQuantity;
    return this;
  }

  /**
   * jobs_completed_manufacture_other_quantity integer
   *
   * @return jobsCompletedManufactureOtherQuantity
   **/
  @ApiModelProperty(value = "jobs_completed_manufacture_other_quantity integer")


  public Long getJobsCompletedManufactureOtherQuantity() {
    return jobsCompletedManufactureOtherQuantity;
  }

  public void setJobsCompletedManufactureOtherQuantity(Long jobsCompletedManufactureOtherQuantity) {
    this.jobsCompletedManufactureOtherQuantity = jobsCompletedManufactureOtherQuantity;
  }

  public GetCharactersCharacterIdStatsIndustry jobsCompletedManufactureShip(Long jobsCompletedManufactureShip) {
    this.jobsCompletedManufactureShip = jobsCompletedManufactureShip;
    return this;
  }

  /**
   * jobs_completed_manufacture_ship integer
   *
   * @return jobsCompletedManufactureShip
   **/
  @ApiModelProperty(value = "jobs_completed_manufacture_ship integer")


  public Long getJobsCompletedManufactureShip() {
    return jobsCompletedManufactureShip;
  }

  public void setJobsCompletedManufactureShip(Long jobsCompletedManufactureShip) {
    this.jobsCompletedManufactureShip = jobsCompletedManufactureShip;
  }

  public GetCharactersCharacterIdStatsIndustry jobsCompletedManufactureShipQuantity(Long jobsCompletedManufactureShipQuantity) {
    this.jobsCompletedManufactureShipQuantity = jobsCompletedManufactureShipQuantity;
    return this;
  }

  /**
   * jobs_completed_manufacture_ship_quantity integer
   *
   * @return jobsCompletedManufactureShipQuantity
   **/
  @ApiModelProperty(value = "jobs_completed_manufacture_ship_quantity integer")


  public Long getJobsCompletedManufactureShipQuantity() {
    return jobsCompletedManufactureShipQuantity;
  }

  public void setJobsCompletedManufactureShipQuantity(Long jobsCompletedManufactureShipQuantity) {
    this.jobsCompletedManufactureShipQuantity = jobsCompletedManufactureShipQuantity;
  }

  public GetCharactersCharacterIdStatsIndustry jobsCompletedManufactureStructure(Long jobsCompletedManufactureStructure) {
    this.jobsCompletedManufactureStructure = jobsCompletedManufactureStructure;
    return this;
  }

  /**
   * jobs_completed_manufacture_structure integer
   *
   * @return jobsCompletedManufactureStructure
   **/
  @ApiModelProperty(value = "jobs_completed_manufacture_structure integer")


  public Long getJobsCompletedManufactureStructure() {
    return jobsCompletedManufactureStructure;
  }

  public void setJobsCompletedManufactureStructure(Long jobsCompletedManufactureStructure) {
    this.jobsCompletedManufactureStructure = jobsCompletedManufactureStructure;
  }

  public GetCharactersCharacterIdStatsIndustry jobsCompletedManufactureStructureQuantity(Long jobsCompletedManufactureStructureQuantity) {
    this.jobsCompletedManufactureStructureQuantity = jobsCompletedManufactureStructureQuantity;
    return this;
  }

  /**
   * jobs_completed_manufacture_structure_quantity integer
   *
   * @return jobsCompletedManufactureStructureQuantity
   **/
  @ApiModelProperty(value = "jobs_completed_manufacture_structure_quantity integer")


  public Long getJobsCompletedManufactureStructureQuantity() {
    return jobsCompletedManufactureStructureQuantity;
  }

  public void setJobsCompletedManufactureStructureQuantity(Long jobsCompletedManufactureStructureQuantity) {
    this.jobsCompletedManufactureStructureQuantity = jobsCompletedManufactureStructureQuantity;
  }

  public GetCharactersCharacterIdStatsIndustry jobsCompletedManufactureSubsystem(Long jobsCompletedManufactureSubsystem) {
    this.jobsCompletedManufactureSubsystem = jobsCompletedManufactureSubsystem;
    return this;
  }

  /**
   * jobs_completed_manufacture_subsystem integer
   *
   * @return jobsCompletedManufactureSubsystem
   **/
  @ApiModelProperty(value = "jobs_completed_manufacture_subsystem integer")


  public Long getJobsCompletedManufactureSubsystem() {
    return jobsCompletedManufactureSubsystem;
  }

  public void setJobsCompletedManufactureSubsystem(Long jobsCompletedManufactureSubsystem) {
    this.jobsCompletedManufactureSubsystem = jobsCompletedManufactureSubsystem;
  }

  public GetCharactersCharacterIdStatsIndustry jobsCompletedManufactureSubsystemQuantity(Long jobsCompletedManufactureSubsystemQuantity) {
    this.jobsCompletedManufactureSubsystemQuantity = jobsCompletedManufactureSubsystemQuantity;
    return this;
  }

  /**
   * jobs_completed_manufacture_subsystem_quantity integer
   *
   * @return jobsCompletedManufactureSubsystemQuantity
   **/
  @ApiModelProperty(value = "jobs_completed_manufacture_subsystem_quantity integer")


  public Long getJobsCompletedManufactureSubsystemQuantity() {
    return jobsCompletedManufactureSubsystemQuantity;
  }

  public void setJobsCompletedManufactureSubsystemQuantity(Long jobsCompletedManufactureSubsystemQuantity) {
    this.jobsCompletedManufactureSubsystemQuantity = jobsCompletedManufactureSubsystemQuantity;
  }

  public GetCharactersCharacterIdStatsIndustry jobsCompletedMaterialProductivity(Long jobsCompletedMaterialProductivity) {
    this.jobsCompletedMaterialProductivity = jobsCompletedMaterialProductivity;
    return this;
  }

  /**
   * jobs_completed_material_productivity integer
   *
   * @return jobsCompletedMaterialProductivity
   **/
  @ApiModelProperty(value = "jobs_completed_material_productivity integer")


  public Long getJobsCompletedMaterialProductivity() {
    return jobsCompletedMaterialProductivity;
  }

  public void setJobsCompletedMaterialProductivity(Long jobsCompletedMaterialProductivity) {
    this.jobsCompletedMaterialProductivity = jobsCompletedMaterialProductivity;
  }

  public GetCharactersCharacterIdStatsIndustry jobsCompletedTimeProductivity(Long jobsCompletedTimeProductivity) {
    this.jobsCompletedTimeProductivity = jobsCompletedTimeProductivity;
    return this;
  }

  /**
   * jobs_completed_time_productivity integer
   *
   * @return jobsCompletedTimeProductivity
   **/
  @ApiModelProperty(value = "jobs_completed_time_productivity integer")


  public Long getJobsCompletedTimeProductivity() {
    return jobsCompletedTimeProductivity;
  }

  public void setJobsCompletedTimeProductivity(Long jobsCompletedTimeProductivity) {
    this.jobsCompletedTimeProductivity = jobsCompletedTimeProductivity;
  }

  public GetCharactersCharacterIdStatsIndustry jobsStartedCopyBlueprint(Long jobsStartedCopyBlueprint) {
    this.jobsStartedCopyBlueprint = jobsStartedCopyBlueprint;
    return this;
  }

  /**
   * jobs_started_copy_blueprint integer
   *
   * @return jobsStartedCopyBlueprint
   **/
  @ApiModelProperty(value = "jobs_started_copy_blueprint integer")


  public Long getJobsStartedCopyBlueprint() {
    return jobsStartedCopyBlueprint;
  }

  public void setJobsStartedCopyBlueprint(Long jobsStartedCopyBlueprint) {
    this.jobsStartedCopyBlueprint = jobsStartedCopyBlueprint;
  }

  public GetCharactersCharacterIdStatsIndustry jobsStartedInvention(Long jobsStartedInvention) {
    this.jobsStartedInvention = jobsStartedInvention;
    return this;
  }

  /**
   * jobs_started_invention integer
   *
   * @return jobsStartedInvention
   **/
  @ApiModelProperty(value = "jobs_started_invention integer")


  public Long getJobsStartedInvention() {
    return jobsStartedInvention;
  }

  public void setJobsStartedInvention(Long jobsStartedInvention) {
    this.jobsStartedInvention = jobsStartedInvention;
  }

  public GetCharactersCharacterIdStatsIndustry jobsStartedManufacture(Long jobsStartedManufacture) {
    this.jobsStartedManufacture = jobsStartedManufacture;
    return this;
  }

  /**
   * jobs_started_manufacture integer
   *
   * @return jobsStartedManufacture
   **/
  @ApiModelProperty(value = "jobs_started_manufacture integer")


  public Long getJobsStartedManufacture() {
    return jobsStartedManufacture;
  }

  public void setJobsStartedManufacture(Long jobsStartedManufacture) {
    this.jobsStartedManufacture = jobsStartedManufacture;
  }

  public GetCharactersCharacterIdStatsIndustry jobsStartedMaterialProductivity(Long jobsStartedMaterialProductivity) {
    this.jobsStartedMaterialProductivity = jobsStartedMaterialProductivity;
    return this;
  }

  /**
   * jobs_started_material_productivity integer
   *
   * @return jobsStartedMaterialProductivity
   **/
  @ApiModelProperty(value = "jobs_started_material_productivity integer")


  public Long getJobsStartedMaterialProductivity() {
    return jobsStartedMaterialProductivity;
  }

  public void setJobsStartedMaterialProductivity(Long jobsStartedMaterialProductivity) {
    this.jobsStartedMaterialProductivity = jobsStartedMaterialProductivity;
  }

  public GetCharactersCharacterIdStatsIndustry jobsStartedTimeProductivity(Long jobsStartedTimeProductivity) {
    this.jobsStartedTimeProductivity = jobsStartedTimeProductivity;
    return this;
  }

  /**
   * jobs_started_time_productivity integer
   *
   * @return jobsStartedTimeProductivity
   **/
  @ApiModelProperty(value = "jobs_started_time_productivity integer")


  public Long getJobsStartedTimeProductivity() {
    return jobsStartedTimeProductivity;
  }

  public void setJobsStartedTimeProductivity(Long jobsStartedTimeProductivity) {
    this.jobsStartedTimeProductivity = jobsStartedTimeProductivity;
  }

  public GetCharactersCharacterIdStatsIndustry reprocessItem(Long reprocessItem) {
    this.reprocessItem = reprocessItem;
    return this;
  }

  /**
   * reprocess_item integer
   *
   * @return reprocessItem
   **/
  @ApiModelProperty(value = "reprocess_item integer")


  public Long getReprocessItem() {
    return reprocessItem;
  }

  public void setReprocessItem(Long reprocessItem) {
    this.reprocessItem = reprocessItem;
  }

  public GetCharactersCharacterIdStatsIndustry reprocessItemQuantity(Long reprocessItemQuantity) {
    this.reprocessItemQuantity = reprocessItemQuantity;
    return this;
  }

  /**
   * reprocess_item_quantity integer
   *
   * @return reprocessItemQuantity
   **/
  @ApiModelProperty(value = "reprocess_item_quantity integer")


  public Long getReprocessItemQuantity() {
    return reprocessItemQuantity;
  }

  public void setReprocessItemQuantity(Long reprocessItemQuantity) {
    this.reprocessItemQuantity = reprocessItemQuantity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdStatsIndustry getCharactersCharacterIdStatsIndustry = (GetCharactersCharacterIdStatsIndustry) o;
    return Objects.equals(this.hackingSuccesses, getCharactersCharacterIdStatsIndustry.hackingSuccesses) &&
        Objects.equals(this.jobsCancelled, getCharactersCharacterIdStatsIndustry.jobsCancelled) &&
        Objects.equals(this.jobsCompletedCopyBlueprint, getCharactersCharacterIdStatsIndustry.jobsCompletedCopyBlueprint) &&
        Objects.equals(this.jobsCompletedInvention, getCharactersCharacterIdStatsIndustry.jobsCompletedInvention) &&
        Objects.equals(this.jobsCompletedManufacture, getCharactersCharacterIdStatsIndustry.jobsCompletedManufacture) &&
        Objects.equals(this.jobsCompletedManufactureAsteroid, getCharactersCharacterIdStatsIndustry.jobsCompletedManufactureAsteroid) &&
        Objects.equals(this.jobsCompletedManufactureAsteroidQuantity, getCharactersCharacterIdStatsIndustry.jobsCompletedManufactureAsteroidQuantity) &&
        Objects.equals(this.jobsCompletedManufactureCharge, getCharactersCharacterIdStatsIndustry.jobsCompletedManufactureCharge) &&
        Objects.equals(this.jobsCompletedManufactureChargeQuantity, getCharactersCharacterIdStatsIndustry.jobsCompletedManufactureChargeQuantity) &&
        Objects.equals(this.jobsCompletedManufactureCommodity, getCharactersCharacterIdStatsIndustry.jobsCompletedManufactureCommodity) &&
        Objects.equals(this.jobsCompletedManufactureCommodityQuantity, getCharactersCharacterIdStatsIndustry.jobsCompletedManufactureCommodityQuantity) &&
        Objects.equals(this.jobsCompletedManufactureDeployable, getCharactersCharacterIdStatsIndustry.jobsCompletedManufactureDeployable) &&
        Objects.equals(this.jobsCompletedManufactureDeployableQuantity, getCharactersCharacterIdStatsIndustry.jobsCompletedManufactureDeployableQuantity) &&
        Objects.equals(this.jobsCompletedManufactureDrone, getCharactersCharacterIdStatsIndustry.jobsCompletedManufactureDrone) &&
        Objects.equals(this.jobsCompletedManufactureDroneQuantity, getCharactersCharacterIdStatsIndustry.jobsCompletedManufactureDroneQuantity) &&
        Objects.equals(this.jobsCompletedManufactureImplant, getCharactersCharacterIdStatsIndustry.jobsCompletedManufactureImplant) &&
        Objects.equals(this.jobsCompletedManufactureImplantQuantity, getCharactersCharacterIdStatsIndustry.jobsCompletedManufactureImplantQuantity) &&
        Objects.equals(this.jobsCompletedManufactureModule, getCharactersCharacterIdStatsIndustry.jobsCompletedManufactureModule) &&
        Objects.equals(this.jobsCompletedManufactureModuleQuantity, getCharactersCharacterIdStatsIndustry.jobsCompletedManufactureModuleQuantity) &&
        Objects.equals(this.jobsCompletedManufactureOther, getCharactersCharacterIdStatsIndustry.jobsCompletedManufactureOther) &&
        Objects.equals(this.jobsCompletedManufactureOtherQuantity, getCharactersCharacterIdStatsIndustry.jobsCompletedManufactureOtherQuantity) &&
        Objects.equals(this.jobsCompletedManufactureShip, getCharactersCharacterIdStatsIndustry.jobsCompletedManufactureShip) &&
        Objects.equals(this.jobsCompletedManufactureShipQuantity, getCharactersCharacterIdStatsIndustry.jobsCompletedManufactureShipQuantity) &&
        Objects.equals(this.jobsCompletedManufactureStructure, getCharactersCharacterIdStatsIndustry.jobsCompletedManufactureStructure) &&
        Objects.equals(this.jobsCompletedManufactureStructureQuantity, getCharactersCharacterIdStatsIndustry.jobsCompletedManufactureStructureQuantity) &&
        Objects.equals(this.jobsCompletedManufactureSubsystem, getCharactersCharacterIdStatsIndustry.jobsCompletedManufactureSubsystem) &&
        Objects.equals(this.jobsCompletedManufactureSubsystemQuantity, getCharactersCharacterIdStatsIndustry.jobsCompletedManufactureSubsystemQuantity) &&
        Objects.equals(this.jobsCompletedMaterialProductivity, getCharactersCharacterIdStatsIndustry.jobsCompletedMaterialProductivity) &&
        Objects.equals(this.jobsCompletedTimeProductivity, getCharactersCharacterIdStatsIndustry.jobsCompletedTimeProductivity) &&
        Objects.equals(this.jobsStartedCopyBlueprint, getCharactersCharacterIdStatsIndustry.jobsStartedCopyBlueprint) &&
        Objects.equals(this.jobsStartedInvention, getCharactersCharacterIdStatsIndustry.jobsStartedInvention) &&
        Objects.equals(this.jobsStartedManufacture, getCharactersCharacterIdStatsIndustry.jobsStartedManufacture) &&
        Objects.equals(this.jobsStartedMaterialProductivity, getCharactersCharacterIdStatsIndustry.jobsStartedMaterialProductivity) &&
        Objects.equals(this.jobsStartedTimeProductivity, getCharactersCharacterIdStatsIndustry.jobsStartedTimeProductivity) &&
        Objects.equals(this.reprocessItem, getCharactersCharacterIdStatsIndustry.reprocessItem) &&
        Objects.equals(this.reprocessItemQuantity, getCharactersCharacterIdStatsIndustry.reprocessItemQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hackingSuccesses, jobsCancelled, jobsCompletedCopyBlueprint, jobsCompletedInvention, jobsCompletedManufacture, jobsCompletedManufactureAsteroid, jobsCompletedManufactureAsteroidQuantity, jobsCompletedManufactureCharge, jobsCompletedManufactureChargeQuantity, jobsCompletedManufactureCommodity, jobsCompletedManufactureCommodityQuantity, jobsCompletedManufactureDeployable, jobsCompletedManufactureDeployableQuantity, jobsCompletedManufactureDrone, jobsCompletedManufactureDroneQuantity, jobsCompletedManufactureImplant, jobsCompletedManufactureImplantQuantity, jobsCompletedManufactureModule, jobsCompletedManufactureModuleQuantity, jobsCompletedManufactureOther, jobsCompletedManufactureOtherQuantity, jobsCompletedManufactureShip, jobsCompletedManufactureShipQuantity, jobsCompletedManufactureStructure, jobsCompletedManufactureStructureQuantity, jobsCompletedManufactureSubsystem, jobsCompletedManufactureSubsystemQuantity, jobsCompletedMaterialProductivity, jobsCompletedTimeProductivity, jobsStartedCopyBlueprint, jobsStartedInvention, jobsStartedManufacture, jobsStartedMaterialProductivity, jobsStartedTimeProductivity, reprocessItem, reprocessItemQuantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdStatsIndustry {\n");

    sb.append("    hackingSuccesses: ").append(toIndentedString(hackingSuccesses)).append("\n");
    sb.append("    jobsCancelled: ").append(toIndentedString(jobsCancelled)).append("\n");
    sb.append("    jobsCompletedCopyBlueprint: ").append(toIndentedString(jobsCompletedCopyBlueprint)).append("\n");
    sb.append("    jobsCompletedInvention: ").append(toIndentedString(jobsCompletedInvention)).append("\n");
    sb.append("    jobsCompletedManufacture: ").append(toIndentedString(jobsCompletedManufacture)).append("\n");
    sb.append("    jobsCompletedManufactureAsteroid: ").append(toIndentedString(jobsCompletedManufactureAsteroid)).append("\n");
    sb.append("    jobsCompletedManufactureAsteroidQuantity: ").append(toIndentedString(jobsCompletedManufactureAsteroidQuantity)).append("\n");
    sb.append("    jobsCompletedManufactureCharge: ").append(toIndentedString(jobsCompletedManufactureCharge)).append("\n");
    sb.append("    jobsCompletedManufactureChargeQuantity: ").append(toIndentedString(jobsCompletedManufactureChargeQuantity)).append("\n");
    sb.append("    jobsCompletedManufactureCommodity: ").append(toIndentedString(jobsCompletedManufactureCommodity)).append("\n");
    sb.append("    jobsCompletedManufactureCommodityQuantity: ").append(toIndentedString(jobsCompletedManufactureCommodityQuantity)).append("\n");
    sb.append("    jobsCompletedManufactureDeployable: ").append(toIndentedString(jobsCompletedManufactureDeployable)).append("\n");
    sb.append("    jobsCompletedManufactureDeployableQuantity: ").append(toIndentedString(jobsCompletedManufactureDeployableQuantity)).append("\n");
    sb.append("    jobsCompletedManufactureDrone: ").append(toIndentedString(jobsCompletedManufactureDrone)).append("\n");
    sb.append("    jobsCompletedManufactureDroneQuantity: ").append(toIndentedString(jobsCompletedManufactureDroneQuantity)).append("\n");
    sb.append("    jobsCompletedManufactureImplant: ").append(toIndentedString(jobsCompletedManufactureImplant)).append("\n");
    sb.append("    jobsCompletedManufactureImplantQuantity: ").append(toIndentedString(jobsCompletedManufactureImplantQuantity)).append("\n");
    sb.append("    jobsCompletedManufactureModule: ").append(toIndentedString(jobsCompletedManufactureModule)).append("\n");
    sb.append("    jobsCompletedManufactureModuleQuantity: ").append(toIndentedString(jobsCompletedManufactureModuleQuantity)).append("\n");
    sb.append("    jobsCompletedManufactureOther: ").append(toIndentedString(jobsCompletedManufactureOther)).append("\n");
    sb.append("    jobsCompletedManufactureOtherQuantity: ").append(toIndentedString(jobsCompletedManufactureOtherQuantity)).append("\n");
    sb.append("    jobsCompletedManufactureShip: ").append(toIndentedString(jobsCompletedManufactureShip)).append("\n");
    sb.append("    jobsCompletedManufactureShipQuantity: ").append(toIndentedString(jobsCompletedManufactureShipQuantity)).append("\n");
    sb.append("    jobsCompletedManufactureStructure: ").append(toIndentedString(jobsCompletedManufactureStructure)).append("\n");
    sb.append("    jobsCompletedManufactureStructureQuantity: ").append(toIndentedString(jobsCompletedManufactureStructureQuantity)).append("\n");
    sb.append("    jobsCompletedManufactureSubsystem: ").append(toIndentedString(jobsCompletedManufactureSubsystem)).append("\n");
    sb.append("    jobsCompletedManufactureSubsystemQuantity: ").append(toIndentedString(jobsCompletedManufactureSubsystemQuantity)).append("\n");
    sb.append("    jobsCompletedMaterialProductivity: ").append(toIndentedString(jobsCompletedMaterialProductivity)).append("\n");
    sb.append("    jobsCompletedTimeProductivity: ").append(toIndentedString(jobsCompletedTimeProductivity)).append("\n");
    sb.append("    jobsStartedCopyBlueprint: ").append(toIndentedString(jobsStartedCopyBlueprint)).append("\n");
    sb.append("    jobsStartedInvention: ").append(toIndentedString(jobsStartedInvention)).append("\n");
    sb.append("    jobsStartedManufacture: ").append(toIndentedString(jobsStartedManufacture)).append("\n");
    sb.append("    jobsStartedMaterialProductivity: ").append(toIndentedString(jobsStartedMaterialProductivity)).append("\n");
    sb.append("    jobsStartedTimeProductivity: ").append(toIndentedString(jobsStartedTimeProductivity)).append("\n");
    sb.append("    reprocessItem: ").append(toIndentedString(reprocessItem)).append("\n");
    sb.append("    reprocessItemQuantity: ").append(toIndentedString(reprocessItemQuantity)).append("\n");
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

