package com.github.tddts.eve.model.corporations;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class GetCorporationCorporationIdMiningExtractions200Ok {
  @JsonProperty("chunk_arrival_time")
  private OffsetDateTime chunkArrivalTime = null;

  @JsonProperty("extraction_start_time")
  private OffsetDateTime extractionStartTime = null;

  @JsonProperty("moon_id")
  private Integer moonId = null;

  @JsonProperty("natural_decay_time")
  private OffsetDateTime naturalDecayTime = null;

  @JsonProperty("structure_id")
  private Long structureId = null;

  public GetCorporationCorporationIdMiningExtractions200Ok chunkArrivalTime(OffsetDateTime chunkArrivalTime) {
    this.chunkArrivalTime = chunkArrivalTime;
    return this;
  }

  /**
   * The time at which the chunk being extracted will arrive and can be fractured by the moon mining drill.
   *
   * @return chunkArrivalTime
   **/
  @ApiModelProperty(required = true, value = "The time at which the chunk being extracted will arrive and can be fractured by the moon mining drill. ")
  @NotNull

  @Valid

  public OffsetDateTime getChunkArrivalTime() {
    return chunkArrivalTime;
  }

  public void setChunkArrivalTime(OffsetDateTime chunkArrivalTime) {
    this.chunkArrivalTime = chunkArrivalTime;
  }

  public GetCorporationCorporationIdMiningExtractions200Ok extractionStartTime(OffsetDateTime extractionStartTime) {
    this.extractionStartTime = extractionStartTime;
    return this;
  }

  /**
   * The time at which the current extraction was initiated.
   *
   * @return extractionStartTime
   **/
  @ApiModelProperty(required = true, value = "The time at which the current extraction was initiated. ")
  @NotNull

  @Valid

  public OffsetDateTime getExtractionStartTime() {
    return extractionStartTime;
  }

  public void setExtractionStartTime(OffsetDateTime extractionStartTime) {
    this.extractionStartTime = extractionStartTime;
  }

  public GetCorporationCorporationIdMiningExtractions200Ok moonId(Integer moonId) {
    this.moonId = moonId;
    return this;
  }

  /**
   * moon_id integer
   *
   * @return moonId
   **/
  @ApiModelProperty(required = true, value = "moon_id integer")
  @NotNull


  public Integer getMoonId() {
    return moonId;
  }

  public void setMoonId(Integer moonId) {
    this.moonId = moonId;
  }

  public GetCorporationCorporationIdMiningExtractions200Ok naturalDecayTime(OffsetDateTime naturalDecayTime) {
    this.naturalDecayTime = naturalDecayTime;
    return this;
  }

  /**
   * The time at which the chunk being extracted will naturally fracture if it is not first fractured by the moon mining drill.
   *
   * @return naturalDecayTime
   **/
  @ApiModelProperty(required = true, value = "The time at which the chunk being extracted will naturally fracture if it is not first fractured by the moon mining drill. ")
  @NotNull

  @Valid

  public OffsetDateTime getNaturalDecayTime() {
    return naturalDecayTime;
  }

  public void setNaturalDecayTime(OffsetDateTime naturalDecayTime) {
    this.naturalDecayTime = naturalDecayTime;
  }

  public GetCorporationCorporationIdMiningExtractions200Ok structureId(Long structureId) {
    this.structureId = structureId;
    return this;
  }

  /**
   * structure_id integer
   *
   * @return structureId
   **/
  @ApiModelProperty(required = true, value = "structure_id integer")
  @NotNull


  public Long getStructureId() {
    return structureId;
  }

  public void setStructureId(Long structureId) {
    this.structureId = structureId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationCorporationIdMiningExtractions200Ok getCorporationCorporationIdMiningExtractions200Ok = (GetCorporationCorporationIdMiningExtractions200Ok) o;
    return Objects.equals(this.chunkArrivalTime, getCorporationCorporationIdMiningExtractions200Ok.chunkArrivalTime) &&
        Objects.equals(this.extractionStartTime, getCorporationCorporationIdMiningExtractions200Ok.extractionStartTime) &&
        Objects.equals(this.moonId, getCorporationCorporationIdMiningExtractions200Ok.moonId) &&
        Objects.equals(this.naturalDecayTime, getCorporationCorporationIdMiningExtractions200Ok.naturalDecayTime) &&
        Objects.equals(this.structureId, getCorporationCorporationIdMiningExtractions200Ok.structureId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chunkArrivalTime, extractionStartTime, moonId, naturalDecayTime, structureId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationCorporationIdMiningExtractions200Ok {\n");

    sb.append("    chunkArrivalTime: ").append(toIndentedString(chunkArrivalTime)).append("\n");
    sb.append("    extractionStartTime: ").append(toIndentedString(extractionStartTime)).append("\n");
    sb.append("    moonId: ").append(toIndentedString(moonId)).append("\n");
    sb.append("    naturalDecayTime: ").append(toIndentedString(naturalDecayTime)).append("\n");
    sb.append("    structureId: ").append(toIndentedString(structureId)).append("\n");
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

