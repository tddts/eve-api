package com.github.tddts.eve.model.fleets;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@Validated
public class GetFleetsFleetIdOk {
  @JsonProperty("is_free_move")
  private Boolean isFreeMove = null;

  @JsonProperty("is_registered")
  private Boolean isRegistered = null;

  @JsonProperty("is_voice_enabled")
  private Boolean isVoiceEnabled = null;

  @JsonProperty("motd")
  private String motd = null;

  public GetFleetsFleetIdOk isFreeMove(Boolean isFreeMove) {
    this.isFreeMove = isFreeMove;
    return this;
  }

  /**
   * Is free-move enabled
   *
   * @return isFreeMove
   **/
  @ApiModelProperty(required = true, value = "Is free-move enabled")
  @NotNull


  public Boolean isIsFreeMove() {
    return isFreeMove;
  }

  public void setIsFreeMove(Boolean isFreeMove) {
    this.isFreeMove = isFreeMove;
  }

  public GetFleetsFleetIdOk isRegistered(Boolean isRegistered) {
    this.isRegistered = isRegistered;
    return this;
  }

  /**
   * Does the fleet have an active fleet advertisement
   *
   * @return isRegistered
   **/
  @ApiModelProperty(required = true, value = "Does the fleet have an active fleet advertisement")
  @NotNull


  public Boolean isIsRegistered() {
    return isRegistered;
  }

  public void setIsRegistered(Boolean isRegistered) {
    this.isRegistered = isRegistered;
  }

  public GetFleetsFleetIdOk isVoiceEnabled(Boolean isVoiceEnabled) {
    this.isVoiceEnabled = isVoiceEnabled;
    return this;
  }

  /**
   * Is EVE Voice enabled
   *
   * @return isVoiceEnabled
   **/
  @ApiModelProperty(required = true, value = "Is EVE Voice enabled")
  @NotNull


  public Boolean isIsVoiceEnabled() {
    return isVoiceEnabled;
  }

  public void setIsVoiceEnabled(Boolean isVoiceEnabled) {
    this.isVoiceEnabled = isVoiceEnabled;
  }

  public GetFleetsFleetIdOk motd(String motd) {
    this.motd = motd;
    return this;
  }

  /**
   * Fleet MOTD in CCP flavoured HTML
   *
   * @return motd
   **/
  @ApiModelProperty(required = true, value = "Fleet MOTD in CCP flavoured HTML")
  @NotNull


  public String getMotd() {
    return motd;
  }

  public void setMotd(String motd) {
    this.motd = motd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFleetsFleetIdOk getFleetsFleetIdOk = (GetFleetsFleetIdOk) o;
    return Objects.equals(this.isFreeMove, getFleetsFleetIdOk.isFreeMove) &&
        Objects.equals(this.isRegistered, getFleetsFleetIdOk.isRegistered) &&
        Objects.equals(this.isVoiceEnabled, getFleetsFleetIdOk.isVoiceEnabled) &&
        Objects.equals(this.motd, getFleetsFleetIdOk.motd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isFreeMove, isRegistered, isVoiceEnabled, motd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFleetsFleetIdOk {\n");

    sb.append("    isFreeMove: ").append(toIndentedString(isFreeMove)).append("\n");
    sb.append("    isRegistered: ").append(toIndentedString(isRegistered)).append("\n");
    sb.append("    isVoiceEnabled: ").append(toIndentedString(isVoiceEnabled)).append("\n");
    sb.append("    motd: ").append(toIndentedString(motd)).append("\n");
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

