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
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@Validated
public class GetCharactersCharacterIdMedals200Ok {
  @JsonProperty("corporation_id")
  private Integer corporationId = null;

  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("graphics")
  @Valid
  private List<GetCharactersCharacterIdMedalsGraphic> graphics = new ArrayList<GetCharactersCharacterIdMedalsGraphic>();

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
    PUBLIC("public"),

    PRIVATE("private");

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

  @JsonProperty("title")
  private String title = null;

  public GetCharactersCharacterIdMedals200Ok corporationId(Integer corporationId) {
    this.corporationId = corporationId;
    return this;
  }

  /**
   * corporation_id integer
   *
   * @return corporationId
   **/
  @ApiModelProperty(required = true, value = "corporation_id integer")
  @NotNull


  public Integer getCorporationId() {
    return corporationId;
  }

  public void setCorporationId(Integer corporationId) {
    this.corporationId = corporationId;
  }

  public GetCharactersCharacterIdMedals200Ok date(OffsetDateTime date) {
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

  public GetCharactersCharacterIdMedals200Ok description(String description) {
    this.description = description;
    return this;
  }

  /**
   * description string
   *
   * @return description
   **/
  @ApiModelProperty(required = true, value = "description string")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GetCharactersCharacterIdMedals200Ok graphics(List<GetCharactersCharacterIdMedalsGraphic> graphics) {
    this.graphics = graphics;
    return this;
  }

  public GetCharactersCharacterIdMedals200Ok addGraphicsItem(GetCharactersCharacterIdMedalsGraphic graphicsItem) {
    this.graphics.add(graphicsItem);
    return this;
  }

  /**
   * graphics array
   *
   * @return graphics
   **/
  @ApiModelProperty(required = true, value = "graphics array")
  @NotNull

  @Valid
  @Size(min = 3, max = 9)
  public List<GetCharactersCharacterIdMedalsGraphic> getGraphics() {
    return graphics;
  }

  public void setGraphics(List<GetCharactersCharacterIdMedalsGraphic> graphics) {
    this.graphics = graphics;
  }

  public GetCharactersCharacterIdMedals200Ok issuerId(Integer issuerId) {
    this.issuerId = issuerId;
    return this;
  }

  /**
   * issuer_id integer
   *
   * @return issuerId
   **/
  @ApiModelProperty(required = true, value = "issuer_id integer")
  @NotNull


  public Integer getIssuerId() {
    return issuerId;
  }

  public void setIssuerId(Integer issuerId) {
    this.issuerId = issuerId;
  }

  public GetCharactersCharacterIdMedals200Ok medalId(Integer medalId) {
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

  public GetCharactersCharacterIdMedals200Ok reason(String reason) {
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


  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public GetCharactersCharacterIdMedals200Ok status(StatusEnum status) {
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

  public GetCharactersCharacterIdMedals200Ok title(String title) {
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
    GetCharactersCharacterIdMedals200Ok getCharactersCharacterIdMedals200Ok = (GetCharactersCharacterIdMedals200Ok) o;
    return Objects.equals(this.corporationId, getCharactersCharacterIdMedals200Ok.corporationId) &&
        Objects.equals(this.date, getCharactersCharacterIdMedals200Ok.date) &&
        Objects.equals(this.description, getCharactersCharacterIdMedals200Ok.description) &&
        Objects.equals(this.graphics, getCharactersCharacterIdMedals200Ok.graphics) &&
        Objects.equals(this.issuerId, getCharactersCharacterIdMedals200Ok.issuerId) &&
        Objects.equals(this.medalId, getCharactersCharacterIdMedals200Ok.medalId) &&
        Objects.equals(this.reason, getCharactersCharacterIdMedals200Ok.reason) &&
        Objects.equals(this.status, getCharactersCharacterIdMedals200Ok.status) &&
        Objects.equals(this.title, getCharactersCharacterIdMedals200Ok.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corporationId, date, description, graphics, issuerId, medalId, reason, status, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdMedals200Ok {\n");

    sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    graphics: ").append(toIndentedString(graphics)).append("\n");
    sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
    sb.append("    medalId: ").append(toIndentedString(medalId)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

