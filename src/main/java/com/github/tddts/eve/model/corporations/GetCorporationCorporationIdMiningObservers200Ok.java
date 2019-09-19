package com.github.tddts.eve.model.corporations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
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
public class GetCorporationCorporationIdMiningObservers200Ok {
  @JsonProperty("last_updated")
  private LocalDate lastUpdated = null;

  @JsonProperty("observer_id")
  private Long observerId = null;

  /**
   * The category of the observing entity
   */
  public enum ObserverTypeEnum {
    STRUCTURE("structure");

    private String value;

    ObserverTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ObserverTypeEnum fromValue(String text) {
      for (ObserverTypeEnum b : ObserverTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("observer_type")
  private ObserverTypeEnum observerType = null;

  public GetCorporationCorporationIdMiningObservers200Ok lastUpdated(LocalDate lastUpdated) {
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

  public GetCorporationCorporationIdMiningObservers200Ok observerId(Long observerId) {
    this.observerId = observerId;
    return this;
  }

  /**
   * The entity that was observing the asteroid field when it was mined.
   *
   * @return observerId
   **/
  @ApiModelProperty(required = true, value = "The entity that was observing the asteroid field when it was mined. ")
  @NotNull


  public Long getObserverId() {
    return observerId;
  }

  public void setObserverId(Long observerId) {
    this.observerId = observerId;
  }

  public GetCorporationCorporationIdMiningObservers200Ok observerType(ObserverTypeEnum observerType) {
    this.observerType = observerType;
    return this;
  }

  /**
   * The category of the observing entity
   *
   * @return observerType
   **/
  @ApiModelProperty(required = true, value = "The category of the observing entity")
  @NotNull


  public ObserverTypeEnum getObserverType() {
    return observerType;
  }

  public void setObserverType(ObserverTypeEnum observerType) {
    this.observerType = observerType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationCorporationIdMiningObservers200Ok getCorporationCorporationIdMiningObservers200Ok = (GetCorporationCorporationIdMiningObservers200Ok) o;
    return Objects.equals(this.lastUpdated, getCorporationCorporationIdMiningObservers200Ok.lastUpdated) &&
        Objects.equals(this.observerId, getCorporationCorporationIdMiningObservers200Ok.observerId) &&
        Objects.equals(this.observerType, getCorporationCorporationIdMiningObservers200Ok.observerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdated, observerId, observerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationCorporationIdMiningObservers200Ok {\n");

    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    observerId: ").append(toIndentedString(observerId)).append("\n");
    sb.append("    observerType: ").append(toIndentedString(observerType)).append("\n");
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

