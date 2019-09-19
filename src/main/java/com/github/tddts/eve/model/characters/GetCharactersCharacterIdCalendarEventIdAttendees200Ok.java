package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * character_id and response of an attendee
 */
@ApiModel(description = "character_id and response of an attendee")
@Validated
public class GetCharactersCharacterIdCalendarEventIdAttendees200Ok {
  @JsonProperty("character_id")
  private Integer characterId = null;

  /**
   * event_response string
   */
  public enum EventResponseEnum {
    DECLINED("declined"),

    NOT_RESPONDED("not_responded"),

    ACCEPTED("accepted"),

    TENTATIVE("tentative");

    private String value;

    EventResponseEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EventResponseEnum fromValue(String text) {
      for (EventResponseEnum b : EventResponseEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("event_response")
  private EventResponseEnum eventResponse = null;

  public GetCharactersCharacterIdCalendarEventIdAttendees200Ok characterId(Integer characterId) {
    this.characterId = characterId;
    return this;
  }

  /**
   * character_id integer
   *
   * @return characterId
   **/
  @ApiModelProperty(value = "character_id integer")


  public Integer getCharacterId() {
    return characterId;
  }

  public void setCharacterId(Integer characterId) {
    this.characterId = characterId;
  }

  public GetCharactersCharacterIdCalendarEventIdAttendees200Ok eventResponse(EventResponseEnum eventResponse) {
    this.eventResponse = eventResponse;
    return this;
  }

  /**
   * event_response string
   *
   * @return eventResponse
   **/
  @ApiModelProperty(value = "event_response string")


  public EventResponseEnum getEventResponse() {
    return eventResponse;
  }

  public void setEventResponse(EventResponseEnum eventResponse) {
    this.eventResponse = eventResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdCalendarEventIdAttendees200Ok getCharactersCharacterIdCalendarEventIdAttendees200Ok = (GetCharactersCharacterIdCalendarEventIdAttendees200Ok) o;
    return Objects.equals(this.characterId, getCharactersCharacterIdCalendarEventIdAttendees200Ok.characterId) &&
        Objects.equals(this.eventResponse, getCharactersCharacterIdCalendarEventIdAttendees200Ok.eventResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characterId, eventResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdCalendarEventIdAttendees200Ok {\n");

    sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
    sb.append("    eventResponse: ").append(toIndentedString(eventResponse)).append("\n");
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

