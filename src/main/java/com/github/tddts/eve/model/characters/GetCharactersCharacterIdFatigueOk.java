package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

import javax.validation.Valid;
import java.util.Objects;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@Validated
public class GetCharactersCharacterIdFatigueOk {
  @JsonProperty("jump_fatigue_expire_date")
  private OffsetDateTime jumpFatigueExpireDate = null;

  @JsonProperty("last_jump_date")
  private OffsetDateTime lastJumpDate = null;

  @JsonProperty("last_update_date")
  private OffsetDateTime lastUpdateDate = null;

  public GetCharactersCharacterIdFatigueOk jumpFatigueExpireDate(OffsetDateTime jumpFatigueExpireDate) {
    this.jumpFatigueExpireDate = jumpFatigueExpireDate;
    return this;
  }

  /**
   * Character's jump fatigue expiry
   *
   * @return jumpFatigueExpireDate
   **/
  @ApiModelProperty(value = "Character's jump fatigue expiry")

  @Valid

  public OffsetDateTime getJumpFatigueExpireDate() {
    return jumpFatigueExpireDate;
  }

  public void setJumpFatigueExpireDate(OffsetDateTime jumpFatigueExpireDate) {
    this.jumpFatigueExpireDate = jumpFatigueExpireDate;
  }

  public GetCharactersCharacterIdFatigueOk lastJumpDate(OffsetDateTime lastJumpDate) {
    this.lastJumpDate = lastJumpDate;
    return this;
  }

  /**
   * Character's last jump activation
   *
   * @return lastJumpDate
   **/
  @ApiModelProperty(value = "Character's last jump activation")

  @Valid

  public OffsetDateTime getLastJumpDate() {
    return lastJumpDate;
  }

  public void setLastJumpDate(OffsetDateTime lastJumpDate) {
    this.lastJumpDate = lastJumpDate;
  }

  public GetCharactersCharacterIdFatigueOk lastUpdateDate(OffsetDateTime lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
    return this;
  }

  /**
   * Character's last jump update
   *
   * @return lastUpdateDate
   **/
  @ApiModelProperty(value = "Character's last jump update")

  @Valid

  public OffsetDateTime getLastUpdateDate() {
    return lastUpdateDate;
  }

  public void setLastUpdateDate(OffsetDateTime lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdFatigueOk getCharactersCharacterIdFatigueOk = (GetCharactersCharacterIdFatigueOk) o;
    return Objects.equals(this.jumpFatigueExpireDate, getCharactersCharacterIdFatigueOk.jumpFatigueExpireDate) &&
        Objects.equals(this.lastJumpDate, getCharactersCharacterIdFatigueOk.lastJumpDate) &&
        Objects.equals(this.lastUpdateDate, getCharactersCharacterIdFatigueOk.lastUpdateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jumpFatigueExpireDate, lastJumpDate, lastUpdateDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdFatigueOk {\n");

    sb.append("    jumpFatigueExpireDate: ").append(toIndentedString(jumpFatigueExpireDate)).append("\n");
    sb.append("    lastJumpDate: ").append(toIndentedString(lastJumpDate)).append("\n");
    sb.append("    lastUpdateDate: ").append(toIndentedString(lastUpdateDate)).append("\n");
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

