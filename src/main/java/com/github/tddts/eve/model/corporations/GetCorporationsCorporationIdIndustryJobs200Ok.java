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
import java.util.Objects;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@Validated
public class GetCorporationsCorporationIdIndustryJobs200Ok {
  @JsonProperty("activity_id")
  private Integer activityId = null;

  @JsonProperty("blueprint_id")
  private Long blueprintId = null;

  @JsonProperty("blueprint_location_id")
  private Long blueprintLocationId = null;

  @JsonProperty("blueprint_type_id")
  private Integer blueprintTypeId = null;

  @JsonProperty("completed_character_id")
  private Integer completedCharacterId = null;

  @JsonProperty("completed_date")
  private OffsetDateTime completedDate = null;

  @JsonProperty("cost")
  private Double cost = null;

  @JsonProperty("duration")
  private Integer duration = null;

  @JsonProperty("end_date")
  private OffsetDateTime endDate = null;

  @JsonProperty("facility_id")
  private Long facilityId = null;

  @JsonProperty("installer_id")
  private Integer installerId = null;

  @JsonProperty("job_id")
  private Integer jobId = null;

  @JsonProperty("licensed_runs")
  private Integer licensedRuns = null;

  @JsonProperty("location_id")
  private Long locationId = null;

  @JsonProperty("output_location_id")
  private Long outputLocationId = null;

  @JsonProperty("pause_date")
  private OffsetDateTime pauseDate = null;

  @JsonProperty("probability")
  private Float probability = null;

  @JsonProperty("product_type_id")
  private Integer productTypeId = null;

  @JsonProperty("runs")
  private Integer runs = null;

  @JsonProperty("start_date")
  private OffsetDateTime startDate = null;

  /**
   * status string
   */
  public enum StatusEnum {
    ACTIVE("active"),

    CANCELLED("cancelled"),

    DELIVERED("delivered"),

    PAUSED("paused"),

    READY("ready"),

    REVERTED("reverted");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("successful_runs")
  private Integer successfulRuns = null;

  public GetCorporationsCorporationIdIndustryJobs200Ok activityId(Integer activityId) {
    this.activityId = activityId;
    return this;
  }

  /**
   * Job activity ID
   *
   * @return activityId
   **/
  @ApiModelProperty(required = true, value = "Job activity ID")
  @NotNull


  public Integer getActivityId() {
    return activityId;
  }

  public void setActivityId(Integer activityId) {
    this.activityId = activityId;
  }

  public GetCorporationsCorporationIdIndustryJobs200Ok blueprintId(Long blueprintId) {
    this.blueprintId = blueprintId;
    return this;
  }

  /**
   * blueprint_id integer
   *
   * @return blueprintId
   **/
  @ApiModelProperty(required = true, value = "blueprint_id integer")
  @NotNull


  public Long getBlueprintId() {
    return blueprintId;
  }

  public void setBlueprintId(Long blueprintId) {
    this.blueprintId = blueprintId;
  }

  public GetCorporationsCorporationIdIndustryJobs200Ok blueprintLocationId(Long blueprintLocationId) {
    this.blueprintLocationId = blueprintLocationId;
    return this;
  }

  /**
   * Location ID of the location from which the blueprint was installed. Normally a station ID, but can also be an asset (e.g. container) or corporation facility
   *
   * @return blueprintLocationId
   **/
  @ApiModelProperty(required = true, value = "Location ID of the location from which the blueprint was installed. Normally a station ID, but can also be an asset (e.g. container) or corporation facility")
  @NotNull


  public Long getBlueprintLocationId() {
    return blueprintLocationId;
  }

  public void setBlueprintLocationId(Long blueprintLocationId) {
    this.blueprintLocationId = blueprintLocationId;
  }

  public GetCorporationsCorporationIdIndustryJobs200Ok blueprintTypeId(Integer blueprintTypeId) {
    this.blueprintTypeId = blueprintTypeId;
    return this;
  }

  /**
   * blueprint_type_id integer
   *
   * @return blueprintTypeId
   **/
  @ApiModelProperty(required = true, value = "blueprint_type_id integer")
  @NotNull


  public Integer getBlueprintTypeId() {
    return blueprintTypeId;
  }

  public void setBlueprintTypeId(Integer blueprintTypeId) {
    this.blueprintTypeId = blueprintTypeId;
  }

  public GetCorporationsCorporationIdIndustryJobs200Ok completedCharacterId(Integer completedCharacterId) {
    this.completedCharacterId = completedCharacterId;
    return this;
  }

  /**
   * ID of the character which completed this job
   *
   * @return completedCharacterId
   **/
  @ApiModelProperty(value = "ID of the character which completed this job")


  public Integer getCompletedCharacterId() {
    return completedCharacterId;
  }

  public void setCompletedCharacterId(Integer completedCharacterId) {
    this.completedCharacterId = completedCharacterId;
  }

  public GetCorporationsCorporationIdIndustryJobs200Ok completedDate(OffsetDateTime completedDate) {
    this.completedDate = completedDate;
    return this;
  }

  /**
   * Date and time when this job was completed
   *
   * @return completedDate
   **/
  @ApiModelProperty(value = "Date and time when this job was completed")

  @Valid

  public OffsetDateTime getCompletedDate() {
    return completedDate;
  }

  public void setCompletedDate(OffsetDateTime completedDate) {
    this.completedDate = completedDate;
  }

  public GetCorporationsCorporationIdIndustryJobs200Ok cost(Double cost) {
    this.cost = cost;
    return this;
  }

  /**
   * The sume of job installation fee and industry facility tax
   *
   * @return cost
   **/
  @ApiModelProperty(value = "The sume of job installation fee and industry facility tax")


  public Double getCost() {
    return cost;
  }

  public void setCost(Double cost) {
    this.cost = cost;
  }

  public GetCorporationsCorporationIdIndustryJobs200Ok duration(Integer duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Job duration in seconds
   *
   * @return duration
   **/
  @ApiModelProperty(required = true, value = "Job duration in seconds")
  @NotNull


  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public GetCorporationsCorporationIdIndustryJobs200Ok endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Date and time when this job finished
   *
   * @return endDate
   **/
  @ApiModelProperty(required = true, value = "Date and time when this job finished")
  @NotNull

  @Valid

  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public GetCorporationsCorporationIdIndustryJobs200Ok facilityId(Long facilityId) {
    this.facilityId = facilityId;
    return this;
  }

  /**
   * ID of the facility where this job is running
   *
   * @return facilityId
   **/
  @ApiModelProperty(required = true, value = "ID of the facility where this job is running")
  @NotNull


  public Long getFacilityId() {
    return facilityId;
  }

  public void setFacilityId(Long facilityId) {
    this.facilityId = facilityId;
  }

  public GetCorporationsCorporationIdIndustryJobs200Ok installerId(Integer installerId) {
    this.installerId = installerId;
    return this;
  }

  /**
   * ID of the character which installed this job
   *
   * @return installerId
   **/
  @ApiModelProperty(required = true, value = "ID of the character which installed this job")
  @NotNull


  public Integer getInstallerId() {
    return installerId;
  }

  public void setInstallerId(Integer installerId) {
    this.installerId = installerId;
  }

  public GetCorporationsCorporationIdIndustryJobs200Ok jobId(Integer jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * Unique job ID
   *
   * @return jobId
   **/
  @ApiModelProperty(required = true, value = "Unique job ID")
  @NotNull


  public Integer getJobId() {
    return jobId;
  }

  public void setJobId(Integer jobId) {
    this.jobId = jobId;
  }

  public GetCorporationsCorporationIdIndustryJobs200Ok licensedRuns(Integer licensedRuns) {
    this.licensedRuns = licensedRuns;
    return this;
  }

  /**
   * Number of runs blueprint is licensed for
   *
   * @return licensedRuns
   **/
  @ApiModelProperty(value = "Number of runs blueprint is licensed for")


  public Integer getLicensedRuns() {
    return licensedRuns;
  }

  public void setLicensedRuns(Integer licensedRuns) {
    this.licensedRuns = licensedRuns;
  }

  public GetCorporationsCorporationIdIndustryJobs200Ok locationId(Long locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * ID of the location for the industry facility
   *
   * @return locationId
   **/
  @ApiModelProperty(required = true, value = "ID of the location for the industry facility")
  @NotNull


  public Long getLocationId() {
    return locationId;
  }

  public void setLocationId(Long locationId) {
    this.locationId = locationId;
  }

  public GetCorporationsCorporationIdIndustryJobs200Ok outputLocationId(Long outputLocationId) {
    this.outputLocationId = outputLocationId;
    return this;
  }

  /**
   * Location ID of the location to which the output of the job will be delivered. Normally a station ID, but can also be a corporation facility
   *
   * @return outputLocationId
   **/
  @ApiModelProperty(required = true, value = "Location ID of the location to which the output of the job will be delivered. Normally a station ID, but can also be a corporation facility")
  @NotNull


  public Long getOutputLocationId() {
    return outputLocationId;
  }

  public void setOutputLocationId(Long outputLocationId) {
    this.outputLocationId = outputLocationId;
  }

  public GetCorporationsCorporationIdIndustryJobs200Ok pauseDate(OffsetDateTime pauseDate) {
    this.pauseDate = pauseDate;
    return this;
  }

  /**
   * Date and time when this job was paused (i.e. time when the facility where this job was installed went offline)
   *
   * @return pauseDate
   **/
  @ApiModelProperty(value = "Date and time when this job was paused (i.e. time when the facility where this job was installed went offline)")

  @Valid

  public OffsetDateTime getPauseDate() {
    return pauseDate;
  }

  public void setPauseDate(OffsetDateTime pauseDate) {
    this.pauseDate = pauseDate;
  }

  public GetCorporationsCorporationIdIndustryJobs200Ok probability(Float probability) {
    this.probability = probability;
    return this;
  }

  /**
   * Chance of success for invention
   *
   * @return probability
   **/
  @ApiModelProperty(value = "Chance of success for invention")


  public Float getProbability() {
    return probability;
  }

  public void setProbability(Float probability) {
    this.probability = probability;
  }

  public GetCorporationsCorporationIdIndustryJobs200Ok productTypeId(Integer productTypeId) {
    this.productTypeId = productTypeId;
    return this;
  }

  /**
   * Type ID of product (manufactured, copied or invented)
   *
   * @return productTypeId
   **/
  @ApiModelProperty(value = "Type ID of product (manufactured, copied or invented)")


  public Integer getProductTypeId() {
    return productTypeId;
  }

  public void setProductTypeId(Integer productTypeId) {
    this.productTypeId = productTypeId;
  }

  public GetCorporationsCorporationIdIndustryJobs200Ok runs(Integer runs) {
    this.runs = runs;
    return this;
  }

  /**
   * Number of runs for a manufacturing job, or number of copies to make for a blueprint copy
   *
   * @return runs
   **/
  @ApiModelProperty(required = true, value = "Number of runs for a manufacturing job, or number of copies to make for a blueprint copy")
  @NotNull


  public Integer getRuns() {
    return runs;
  }

  public void setRuns(Integer runs) {
    this.runs = runs;
  }

  public GetCorporationsCorporationIdIndustryJobs200Ok startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Date and time when this job started
   *
   * @return startDate
   **/
  @ApiModelProperty(required = true, value = "Date and time when this job started")
  @NotNull

  @Valid

  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public GetCorporationsCorporationIdIndustryJobs200Ok status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * status string
   *
   * @return status
   **/
  @ApiModelProperty(required = true, value = "status string")
  @NotNull


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public GetCorporationsCorporationIdIndustryJobs200Ok successfulRuns(Integer successfulRuns) {
    this.successfulRuns = successfulRuns;
    return this;
  }

  /**
   * Number of successful runs for this job. Equal to runs unless this is an invention job
   *
   * @return successfulRuns
   **/
  @ApiModelProperty(value = "Number of successful runs for this job. Equal to runs unless this is an invention job")


  public Integer getSuccessfulRuns() {
    return successfulRuns;
  }

  public void setSuccessfulRuns(Integer successfulRuns) {
    this.successfulRuns = successfulRuns;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdIndustryJobs200Ok getCorporationsCorporationIdIndustryJobs200Ok = (GetCorporationsCorporationIdIndustryJobs200Ok) o;
    return Objects.equals(this.activityId, getCorporationsCorporationIdIndustryJobs200Ok.activityId) &&
        Objects.equals(this.blueprintId, getCorporationsCorporationIdIndustryJobs200Ok.blueprintId) &&
        Objects.equals(this.blueprintLocationId, getCorporationsCorporationIdIndustryJobs200Ok.blueprintLocationId) &&
        Objects.equals(this.blueprintTypeId, getCorporationsCorporationIdIndustryJobs200Ok.blueprintTypeId) &&
        Objects.equals(this.completedCharacterId, getCorporationsCorporationIdIndustryJobs200Ok.completedCharacterId) &&
        Objects.equals(this.completedDate, getCorporationsCorporationIdIndustryJobs200Ok.completedDate) &&
        Objects.equals(this.cost, getCorporationsCorporationIdIndustryJobs200Ok.cost) &&
        Objects.equals(this.duration, getCorporationsCorporationIdIndustryJobs200Ok.duration) &&
        Objects.equals(this.endDate, getCorporationsCorporationIdIndustryJobs200Ok.endDate) &&
        Objects.equals(this.facilityId, getCorporationsCorporationIdIndustryJobs200Ok.facilityId) &&
        Objects.equals(this.installerId, getCorporationsCorporationIdIndustryJobs200Ok.installerId) &&
        Objects.equals(this.jobId, getCorporationsCorporationIdIndustryJobs200Ok.jobId) &&
        Objects.equals(this.licensedRuns, getCorporationsCorporationIdIndustryJobs200Ok.licensedRuns) &&
        Objects.equals(this.locationId, getCorporationsCorporationIdIndustryJobs200Ok.locationId) &&
        Objects.equals(this.outputLocationId, getCorporationsCorporationIdIndustryJobs200Ok.outputLocationId) &&
        Objects.equals(this.pauseDate, getCorporationsCorporationIdIndustryJobs200Ok.pauseDate) &&
        Objects.equals(this.probability, getCorporationsCorporationIdIndustryJobs200Ok.probability) &&
        Objects.equals(this.productTypeId, getCorporationsCorporationIdIndustryJobs200Ok.productTypeId) &&
        Objects.equals(this.runs, getCorporationsCorporationIdIndustryJobs200Ok.runs) &&
        Objects.equals(this.startDate, getCorporationsCorporationIdIndustryJobs200Ok.startDate) &&
        Objects.equals(this.status, getCorporationsCorporationIdIndustryJobs200Ok.status) &&
        Objects.equals(this.successfulRuns, getCorporationsCorporationIdIndustryJobs200Ok.successfulRuns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, blueprintId, blueprintLocationId, blueprintTypeId, completedCharacterId, completedDate, cost, duration, endDate, facilityId, installerId, jobId, licensedRuns, locationId, outputLocationId, pauseDate, probability, productTypeId, runs, startDate, status, successfulRuns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdIndustryJobs200Ok {\n");

    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    blueprintId: ").append(toIndentedString(blueprintId)).append("\n");
    sb.append("    blueprintLocationId: ").append(toIndentedString(blueprintLocationId)).append("\n");
    sb.append("    blueprintTypeId: ").append(toIndentedString(blueprintTypeId)).append("\n");
    sb.append("    completedCharacterId: ").append(toIndentedString(completedCharacterId)).append("\n");
    sb.append("    completedDate: ").append(toIndentedString(completedDate)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    facilityId: ").append(toIndentedString(facilityId)).append("\n");
    sb.append("    installerId: ").append(toIndentedString(installerId)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    licensedRuns: ").append(toIndentedString(licensedRuns)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    outputLocationId: ").append(toIndentedString(outputLocationId)).append("\n");
    sb.append("    pauseDate: ").append(toIndentedString(pauseDate)).append("\n");
    sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
    sb.append("    productTypeId: ").append(toIndentedString(productTypeId)).append("\n");
    sb.append("    runs: ").append(toIndentedString(runs)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    successfulRuns: ").append(toIndentedString(successfulRuns)).append("\n");
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

