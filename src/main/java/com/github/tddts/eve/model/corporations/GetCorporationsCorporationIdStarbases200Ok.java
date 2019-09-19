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
public class GetCorporationsCorporationIdStarbases200Ok {
  @JsonProperty("moon_id")
  private Integer moonId = null;

  @JsonProperty("onlined_since")
  private OffsetDateTime onlinedSince = null;

  @JsonProperty("reinforced_until")
  private OffsetDateTime reinforcedUntil = null;

  @JsonProperty("starbase_id")
  private Long starbaseId = null;

  /**
   * state string
   */
  public enum StateEnum {
    OFFLINE("offline"),

    ONLINE("online"),

    ONLINING("onlining"),

    REINFORCED("reinforced"),

    UNANCHORING("unanchoring");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("state")
  private StateEnum state = null;

  @JsonProperty("system_id")
  private Integer systemId = null;

  @JsonProperty("type_id")
  private Integer typeId = null;

  @JsonProperty("unanchor_at")
  private OffsetDateTime unanchorAt = null;

  public GetCorporationsCorporationIdStarbases200Ok moonId(Integer moonId) {
    this.moonId = moonId;
    return this;
  }

  /**
   * The moon this starbase (POS) is anchored on, unanchored POSes do not have this information
   *
   * @return moonId
   **/
  @ApiModelProperty(value = "The moon this starbase (POS) is anchored on, unanchored POSes do not have this information")


  public Integer getMoonId() {
    return moonId;
  }

  public void setMoonId(Integer moonId) {
    this.moonId = moonId;
  }

  public GetCorporationsCorporationIdStarbases200Ok onlinedSince(OffsetDateTime onlinedSince) {
    this.onlinedSince = onlinedSince;
    return this;
  }

  /**
   * When the POS onlined, for starbases (POSes) in online state
   *
   * @return onlinedSince
   **/
  @ApiModelProperty(value = "When the POS onlined, for starbases (POSes) in online state")

  @Valid

  public OffsetDateTime getOnlinedSince() {
    return onlinedSince;
  }

  public void setOnlinedSince(OffsetDateTime onlinedSince) {
    this.onlinedSince = onlinedSince;
  }

  public GetCorporationsCorporationIdStarbases200Ok reinforcedUntil(OffsetDateTime reinforcedUntil) {
    this.reinforcedUntil = reinforcedUntil;
    return this;
  }

  /**
   * When the POS will be out of reinforcement, for starbases (POSes) in reinforced state
   *
   * @return reinforcedUntil
   **/
  @ApiModelProperty(value = "When the POS will be out of reinforcement, for starbases (POSes) in reinforced state")

  @Valid

  public OffsetDateTime getReinforcedUntil() {
    return reinforcedUntil;
  }

  public void setReinforcedUntil(OffsetDateTime reinforcedUntil) {
    this.reinforcedUntil = reinforcedUntil;
  }

  public GetCorporationsCorporationIdStarbases200Ok starbaseId(Long starbaseId) {
    this.starbaseId = starbaseId;
    return this;
  }

  /**
   * Unique ID for this starbase (POS)
   *
   * @return starbaseId
   **/
  @ApiModelProperty(required = true, value = "Unique ID for this starbase (POS)")
  @NotNull


  public Long getStarbaseId() {
    return starbaseId;
  }

  public void setStarbaseId(Long starbaseId) {
    this.starbaseId = starbaseId;
  }

  public GetCorporationsCorporationIdStarbases200Ok state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * state string
   *
   * @return state
   **/
  @ApiModelProperty(value = "state string")


  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public GetCorporationsCorporationIdStarbases200Ok systemId(Integer systemId) {
    this.systemId = systemId;
    return this;
  }

  /**
   * The solar system this starbase (POS) is in, unanchored POSes have this information
   *
   * @return systemId
   **/
  @ApiModelProperty(required = true, value = "The solar system this starbase (POS) is in, unanchored POSes have this information")
  @NotNull


  public Integer getSystemId() {
    return systemId;
  }

  public void setSystemId(Integer systemId) {
    this.systemId = systemId;
  }

  public GetCorporationsCorporationIdStarbases200Ok typeId(Integer typeId) {
    this.typeId = typeId;
    return this;
  }

  /**
   * Starbase (POS) type
   *
   * @return typeId
   **/
  @ApiModelProperty(required = true, value = "Starbase (POS) type")
  @NotNull


  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }

  public GetCorporationsCorporationIdStarbases200Ok unanchorAt(OffsetDateTime unanchorAt) {
    this.unanchorAt = unanchorAt;
    return this;
  }

  /**
   * When the POS started unanchoring, for starbases (POSes) in unanchoring state
   *
   * @return unanchorAt
   **/
  @ApiModelProperty(value = "When the POS started unanchoring, for starbases (POSes) in unanchoring state")

  @Valid

  public OffsetDateTime getUnanchorAt() {
    return unanchorAt;
  }

  public void setUnanchorAt(OffsetDateTime unanchorAt) {
    this.unanchorAt = unanchorAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdStarbases200Ok getCorporationsCorporationIdStarbases200Ok = (GetCorporationsCorporationIdStarbases200Ok) o;
    return Objects.equals(this.moonId, getCorporationsCorporationIdStarbases200Ok.moonId) &&
        Objects.equals(this.onlinedSince, getCorporationsCorporationIdStarbases200Ok.onlinedSince) &&
        Objects.equals(this.reinforcedUntil, getCorporationsCorporationIdStarbases200Ok.reinforcedUntil) &&
        Objects.equals(this.starbaseId, getCorporationsCorporationIdStarbases200Ok.starbaseId) &&
        Objects.equals(this.state, getCorporationsCorporationIdStarbases200Ok.state) &&
        Objects.equals(this.systemId, getCorporationsCorporationIdStarbases200Ok.systemId) &&
        Objects.equals(this.typeId, getCorporationsCorporationIdStarbases200Ok.typeId) &&
        Objects.equals(this.unanchorAt, getCorporationsCorporationIdStarbases200Ok.unanchorAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(moonId, onlinedSince, reinforcedUntil, starbaseId, state, systemId, typeId, unanchorAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdStarbases200Ok {\n");

    sb.append("    moonId: ").append(toIndentedString(moonId)).append("\n");
    sb.append("    onlinedSince: ").append(toIndentedString(onlinedSince)).append("\n");
    sb.append("    reinforcedUntil: ").append(toIndentedString(reinforcedUntil)).append("\n");
    sb.append("    starbaseId: ").append(toIndentedString(starbaseId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    unanchorAt: ").append(toIndentedString(unanchorAt)).append("\n");
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

