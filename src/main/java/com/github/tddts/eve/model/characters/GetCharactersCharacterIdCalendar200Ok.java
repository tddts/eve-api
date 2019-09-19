package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

import javax.validation.Valid;
import java.util.Objects;

/**
 * event
 */
@ApiModel(description = "event")
@Validated
public class GetCharactersCharacterIdCalendar200Ok {
  @JsonProperty("event_date")
  private OffsetDateTime eventDate = null;

  @JsonProperty("event_id")
  private Integer eventId = null;

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

  @JsonProperty("importance")
  private Integer importance = null;

  @JsonProperty("title")
  private String title = null;

  public GetCharactersCharacterIdCalendar200Ok eventDate(OffsetDateTime eventDate) {
    this.eventDate = eventDate;
    return this;
  }

  /**
   * event_date string
   *
   * @return eventDate
   **/
  @ApiModelProperty(value = "event_date string")

  @Valid

  public OffsetDateTime getEventDate() {
    return eventDate;
  }

  public void setEventDate(OffsetDateTime eventDate) {
    this.eventDate = eventDate;
  }

  public GetCharactersCharacterIdCalendar200Ok eventId(Integer eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * event_id integer
   *
   * @return eventId
   **/
  @ApiModelProperty(value = "event_id integer")


  public Integer getEventId() {
    return eventId;
  }

  public void setEventId(Integer eventId) {
    this.eventId = eventId;
  }

  public GetCharactersCharacterIdCalendar200Ok eventResponse(EventResponseEnum eventResponse) {
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

  public GetCharactersCharacterIdCalendar200Ok importance(Integer importance) {
    this.importance = importance;
    return this;
  }

  /**
   * importance integer
   *
   * @return importance
   **/
  @ApiModelProperty(value = "importance integer")


  public Integer getImportance() {
    return importance;
  }

  public void setImportance(Integer importance) {
    this.importance = importance;
  }

  public GetCharactersCharacterIdCalendar200Ok title(String title) {
    this.title = title;
    return this;
  }

  /**
   * title string
   *
   * @return title
   **/
  @ApiModelProperty(value = "title string")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdCalendar200Ok getCharactersCharacterIdCalendar200Ok = (GetCharactersCharacterIdCalendar200Ok) o;
    return Objects.equals(this.eventDate, getCharactersCharacterIdCalendar200Ok.eventDate) &&
        Objects.equals(this.eventId, getCharactersCharacterIdCalendar200Ok.eventId) &&
        Objects.equals(this.eventResponse, getCharactersCharacterIdCalendar200Ok.eventResponse) &&
        Objects.equals(this.importance, getCharactersCharacterIdCalendar200Ok.importance) &&
        Objects.equals(this.title, getCharactersCharacterIdCalendar200Ok.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventDate, eventId, eventResponse, importance, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdCalendar200Ok {\n");

    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventResponse: ").append(toIndentedString(eventResponse)).append("\n");
    sb.append("    importance: ").append(toIndentedString(importance)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

