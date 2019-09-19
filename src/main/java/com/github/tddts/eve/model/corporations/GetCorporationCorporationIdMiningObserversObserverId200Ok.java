package com.github.tddts.eve.model.corporations;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.LocalDate;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@Validated
public class GetCorporationCorporationIdMiningObserversObserverId200Ok {
  @JsonProperty("character_id")
  private Integer characterId = null;

  @JsonProperty("last_updated")
  private LocalDate lastUpdated = null;

  @JsonProperty("quantity")
  private Long quantity = null;

  @JsonProperty("recorded_corporation_id")
  private Integer recordedCorporationId = null;

  @JsonProperty("type_id")
  private Integer typeId = null;

  public GetCorporationCorporationIdMiningObserversObserverId200Ok characterId(Integer characterId) {
    this.characterId = characterId;
    return this;
  }

  /**
   * The character that did the mining
   *
   * @return characterId
   **/
  @ApiModelProperty(required = true, value = "The character that did the mining ")
  @NotNull


  public Integer getCharacterId() {
    return characterId;
  }

  public void setCharacterId(Integer characterId) {
    this.characterId = characterId;
  }

  public GetCorporationCorporationIdMiningObserversObserverId200Ok lastUpdated(LocalDate lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * last_updated string
   *
   * @return lastUpdated
   **/
  @ApiModelProperty(required = true, value = "last_updated string")
  @NotNull

  @Valid

  public LocalDate getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(LocalDate lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public GetCorporationCorporationIdMiningObserversObserverId200Ok quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * quantity integer
   *
   * @return quantity
   **/
  @ApiModelProperty(required = true, value = "quantity integer")
  @NotNull


  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public GetCorporationCorporationIdMiningObserversObserverId200Ok recordedCorporationId(Integer recordedCorporationId) {
    this.recordedCorporationId = recordedCorporationId;
    return this;
  }

  /**
   * The corporation id of the character at the time data was recorded.
   *
   * @return recordedCorporationId
   **/
  @ApiModelProperty(required = true, value = "The corporation id of the character at the time data was recorded. ")
  @NotNull


  public Integer getRecordedCorporationId() {
    return recordedCorporationId;
  }

  public void setRecordedCorporationId(Integer recordedCorporationId) {
    this.recordedCorporationId = recordedCorporationId;
  }

  public GetCorporationCorporationIdMiningObserversObserverId200Ok typeId(Integer typeId) {
    this.typeId = typeId;
    return this;
  }

  /**
   * type_id integer
   *
   * @return typeId
   **/
  @ApiModelProperty(required = true, value = "type_id integer")
  @NotNull


  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationCorporationIdMiningObserversObserverId200Ok getCorporationCorporationIdMiningObserversObserverId200Ok = (GetCorporationCorporationIdMiningObserversObserverId200Ok) o;
    return Objects.equals(this.characterId, getCorporationCorporationIdMiningObserversObserverId200Ok.characterId) &&
        Objects.equals(this.lastUpdated, getCorporationCorporationIdMiningObserversObserverId200Ok.lastUpdated) &&
        Objects.equals(this.quantity, getCorporationCorporationIdMiningObserversObserverId200Ok.quantity) &&
        Objects.equals(this.recordedCorporationId, getCorporationCorporationIdMiningObserversObserverId200Ok.recordedCorporationId) &&
        Objects.equals(this.typeId, getCorporationCorporationIdMiningObserversObserverId200Ok.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characterId, lastUpdated, quantity, recordedCorporationId, typeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationCorporationIdMiningObserversObserverId200Ok {\n");

    sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    recordedCorporationId: ").append(toIndentedString(recordedCorporationId)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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

