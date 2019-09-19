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
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@Validated
public class GetCorporationsCorporationIdMedalsIssued200Ok {
  @JsonProperty("character_id")
  private Integer characterId = null;

  @JsonProperty("issued_at")
  private OffsetDateTime issuedAt = null;

  @JsonProperty("issuer_id")
  private Integer issuerId = null;

  @JsonProperty("medal_id")
  private Integer medalId = null;

  @JsonProperty("reason")
  private String reason = null;

  /**
   * status string
   */
  public enum StatusEnum {
    PRIVATE("private"),

    PUBLIC("public");

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

  public GetCorporationsCorporationIdMedalsIssued200Ok characterId(Integer characterId) {
    this.characterId = characterId;
    return this;
  }

  /**
   * ID of the character who was rewarded this medal
   *
   * @return characterId
   **/
  @ApiModelProperty(required = true, value = "ID of the character who was rewarded this medal")
  @NotNull


  public Integer getCharacterId() {
    return characterId;
  }

  public void setCharacterId(Integer characterId) {
    this.characterId = characterId;
  }

  public GetCorporationsCorporationIdMedalsIssued200Ok issuedAt(OffsetDateTime issuedAt) {
    this.issuedAt = issuedAt;
    return this;
  }

  /**
   * issued_at string
   *
   * @return issuedAt
   **/
  @ApiModelProperty(required = true, value = "issued_at string")
  @NotNull

  @Valid

  public OffsetDateTime getIssuedAt() {
    return issuedAt;
  }

  public void setIssuedAt(OffsetDateTime issuedAt) {
    this.issuedAt = issuedAt;
  }

  public GetCorporationsCorporationIdMedalsIssued200Ok issuerId(Integer issuerId) {
    this.issuerId = issuerId;
    return this;
  }

  /**
   * ID of the character who issued the medal
   *
   * @return issuerId
   **/
  @ApiModelProperty(required = true, value = "ID of the character who issued the medal")
  @NotNull


  public Integer getIssuerId() {
    return issuerId;
  }

  public void setIssuerId(Integer issuerId) {
    this.issuerId = issuerId;
  }

  public GetCorporationsCorporationIdMedalsIssued200Ok medalId(Integer medalId) {
    this.medalId = medalId;
    return this;
  }

  /**
   * medal_id integer
   *
   * @return medalId
   **/
  @ApiModelProperty(required = true, value = "medal_id integer")
  @NotNull


  public Integer getMedalId() {
    return medalId;
  }

  public void setMedalId(Integer medalId) {
    this.medalId = medalId;
  }

  public GetCorporationsCorporationIdMedalsIssued200Ok reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * reason string
   *
   * @return reason
   **/
  @ApiModelProperty(required = true, value = "reason string")
  @NotNull

  @Size(max = 1000)
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public GetCorporationsCorporationIdMedalsIssued200Ok status(StatusEnum status) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdMedalsIssued200Ok getCorporationsCorporationIdMedalsIssued200Ok = (GetCorporationsCorporationIdMedalsIssued200Ok) o;
    return Objects.equals(this.characterId, getCorporationsCorporationIdMedalsIssued200Ok.characterId) &&
        Objects.equals(this.issuedAt, getCorporationsCorporationIdMedalsIssued200Ok.issuedAt) &&
        Objects.equals(this.issuerId, getCorporationsCorporationIdMedalsIssued200Ok.issuerId) &&
        Objects.equals(this.medalId, getCorporationsCorporationIdMedalsIssued200Ok.medalId) &&
        Objects.equals(this.reason, getCorporationsCorporationIdMedalsIssued200Ok.reason) &&
        Objects.equals(this.status, getCorporationsCorporationIdMedalsIssued200Ok.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characterId, issuedAt, issuerId, medalId, reason, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdMedalsIssued200Ok {\n");

    sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
    sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
    sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
    sb.append("    medalId: ").append(toIndentedString(medalId)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

