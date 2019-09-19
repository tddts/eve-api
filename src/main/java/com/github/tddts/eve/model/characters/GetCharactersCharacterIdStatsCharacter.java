package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * character object
 */
@ApiModel(description = "character object")
@Validated
public class GetCharactersCharacterIdStatsCharacter {
  @JsonProperty("days_of_activity")
  private Long daysOfActivity = null;

  @JsonProperty("minutes")
  private Long minutes = null;

  @JsonProperty("sessions_started")
  private Long sessionsStarted = null;

  public GetCharactersCharacterIdStatsCharacter daysOfActivity(Long daysOfActivity) {
    this.daysOfActivity = daysOfActivity;
    return this;
  }

  /**
   * days_of_activity integer
   *
   * @return daysOfActivity
   **/
  @ApiModelProperty(value = "days_of_activity integer")


  public Long getDaysOfActivity() {
    return daysOfActivity;
  }

  public void setDaysOfActivity(Long daysOfActivity) {
    this.daysOfActivity = daysOfActivity;
  }

  public GetCharactersCharacterIdStatsCharacter minutes(Long minutes) {
    this.minutes = minutes;
    return this;
  }

  /**
   * minutes integer
   *
   * @return minutes
   **/
  @ApiModelProperty(value = "minutes integer")


  public Long getMinutes() {
    return minutes;
  }

  public void setMinutes(Long minutes) {
    this.minutes = minutes;
  }

  public GetCharactersCharacterIdStatsCharacter sessionsStarted(Long sessionsStarted) {
    this.sessionsStarted = sessionsStarted;
    return this;
  }

  /**
   * sessions_started integer
   *
   * @return sessionsStarted
   **/
  @ApiModelProperty(value = "sessions_started integer")


  public Long getSessionsStarted() {
    return sessionsStarted;
  }

  public void setSessionsStarted(Long sessionsStarted) {
    this.sessionsStarted = sessionsStarted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdStatsCharacter getCharactersCharacterIdStatsCharacter = (GetCharactersCharacterIdStatsCharacter) o;
    return Objects.equals(this.daysOfActivity, getCharactersCharacterIdStatsCharacter.daysOfActivity) &&
        Objects.equals(this.minutes, getCharactersCharacterIdStatsCharacter.minutes) &&
        Objects.equals(this.sessionsStarted, getCharactersCharacterIdStatsCharacter.sessionsStarted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(daysOfActivity, minutes, sessionsStarted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdStatsCharacter {\n");

    sb.append("    daysOfActivity: ").append(toIndentedString(daysOfActivity)).append("\n");
    sb.append("    minutes: ").append(toIndentedString(minutes)).append("\n");
    sb.append("    sessionsStarted: ").append(toIndentedString(sessionsStarted)).append("\n");
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

