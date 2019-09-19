package com.github.tddts.eve.model.characters;

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
 * Full details of a specific event
 */
@ApiModel(description = "Full details of a specific event")
@Validated
public class GetCharactersCharacterIdCalendarEventIdOk {
  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("duration")
  private Integer duration = null;

  @JsonProperty("event_id")
  private Integer eventId = null;

  @JsonProperty("importance")
  private Integer importance = null;

  @JsonProperty("owner_id")
  private Integer ownerId = null;

  @JsonProperty("owner_name")
  private String ownerName = null;

  /**
   * owner_type string
   */
  public enum OwnerTypeEnum {
    EVE_SERVER("eve_server"),

    CORPORATION("corporation"),

    FACTION("faction"),

    CHARACTER("character"),

    ALLIANCE("alliance");

    private String value;

    OwnerTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OwnerTypeEnum fromValue(String text) {
      for (OwnerTypeEnum b : OwnerTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("owner_type")
  private OwnerTypeEnum ownerType = null;

  @JsonProperty("response")
  private String response = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("title")
  private String title = null;

  public GetCharactersCharacterIdCalendarEventIdOk date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * date string
   *
   * @return date
   **/
  @ApiModelProperty(required = true, value = "date string")
  @NotNull

  @Valid

  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public GetCharactersCharacterIdCalendarEventIdOk duration(Integer duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Length in minutes
   *
   * @return duration
   **/
  @ApiModelProperty(required = true, value = "Length in minutes")
  @NotNull


  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public GetCharactersCharacterIdCalendarEventIdOk eventId(Integer eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * event_id integer
   *
   * @return eventId
   **/
  @ApiModelProperty(required = true, value = "event_id integer")
  @NotNull


  public Integer getEventId() {
    return eventId;
  }

  public void setEventId(Integer eventId) {
    this.eventId = eventId;
  }

  public GetCharactersCharacterIdCalendarEventIdOk importance(Integer importance) {
    this.importance = importance;
    return this;
  }

  /**
   * importance integer
   *
   * @return importance
   **/
  @ApiModelProperty(required = true, value = "importance integer")
  @NotNull


  public Integer getImportance() {
    return importance;
  }

  public void setImportance(Integer importance) {
    this.importance = importance;
  }

  public GetCharactersCharacterIdCalendarEventIdOk ownerId(Integer ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * owner_id integer
   *
   * @return ownerId
   **/
  @ApiModelProperty(required = true, value = "owner_id integer")
  @NotNull


  public Integer getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Integer ownerId) {
    this.ownerId = ownerId;
  }

  public GetCharactersCharacterIdCalendarEventIdOk ownerName(String ownerName) {
    this.ownerName = ownerName;
    return this;
  }

  /**
   * owner_name string
   *
   * @return ownerName
   **/
  @ApiModelProperty(required = true, value = "owner_name string")
  @NotNull


  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public GetCharactersCharacterIdCalendarEventIdOk ownerType(OwnerTypeEnum ownerType) {
    this.ownerType = ownerType;
    return this;
  }

  /**
   * owner_type string
   *
   * @return ownerType
   **/
  @ApiModelProperty(required = true, value = "owner_type string")
  @NotNull


  public OwnerTypeEnum getOwnerType() {
    return ownerType;
  }

  public void setOwnerType(OwnerTypeEnum ownerType) {
    this.ownerType = ownerType;
  }

  public GetCharactersCharacterIdCalendarEventIdOk response(String response) {
    this.response = response;
    return this;
  }

  /**
   * response string
   *
   * @return response
   **/
  @ApiModelProperty(required = true, value = "response string")
  @NotNull


  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }

  public GetCharactersCharacterIdCalendarEventIdOk text(String text) {
    this.text = text;
    return this;
  }

  /**
   * text string
   *
   * @return text
   **/
  @ApiModelProperty(required = true, value = "text string")
  @NotNull


  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public GetCharactersCharacterIdCalendarEventIdOk title(String title) {
    this.title = title;
    return this;
  }

  /**
   * title string
   *
   * @return title
   **/
  @ApiModelProperty(required = true, value = "title string")
  @NotNull


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
    GetCharactersCharacterIdCalendarEventIdOk getCharactersCharacterIdCalendarEventIdOk = (GetCharactersCharacterIdCalendarEventIdOk) o;
    return Objects.equals(this.date, getCharactersCharacterIdCalendarEventIdOk.date) &&
        Objects.equals(this.duration, getCharactersCharacterIdCalendarEventIdOk.duration) &&
        Objects.equals(this.eventId, getCharactersCharacterIdCalendarEventIdOk.eventId) &&
        Objects.equals(this.importance, getCharactersCharacterIdCalendarEventIdOk.importance) &&
        Objects.equals(this.ownerId, getCharactersCharacterIdCalendarEventIdOk.ownerId) &&
        Objects.equals(this.ownerName, getCharactersCharacterIdCalendarEventIdOk.ownerName) &&
        Objects.equals(this.ownerType, getCharactersCharacterIdCalendarEventIdOk.ownerType) &&
        Objects.equals(this.response, getCharactersCharacterIdCalendarEventIdOk.response) &&
        Objects.equals(this.text, getCharactersCharacterIdCalendarEventIdOk.text) &&
        Objects.equals(this.title, getCharactersCharacterIdCalendarEventIdOk.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, duration, eventId, importance, ownerId, ownerName, ownerType, response, text, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdCalendarEventIdOk {\n");

    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    importance: ").append(toIndentedString(importance)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

