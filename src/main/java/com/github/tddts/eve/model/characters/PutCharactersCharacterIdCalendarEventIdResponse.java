package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * response object
 */
@ApiModel(description = "response object")
@Validated
public class PutCharactersCharacterIdCalendarEventIdResponse {
  /**
   * response string
   */
  public enum ResponseEnum {
    ACCEPTED("accepted"),

    DECLINED("declined"),

    TENTATIVE("tentative");

    private String value;

    ResponseEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ResponseEnum fromValue(String text) {
      for (ResponseEnum b : ResponseEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("response")
  private ResponseEnum response = null;

  public PutCharactersCharacterIdCalendarEventIdResponse response(ResponseEnum response) {
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


  public ResponseEnum getResponse() {
    return response;
  }

  public void setResponse(ResponseEnum response) {
    this.response = response;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutCharactersCharacterIdCalendarEventIdResponse putCharactersCharacterIdCalendarEventIdResponse = (PutCharactersCharacterIdCalendarEventIdResponse) o;
    return Objects.equals(this.response, putCharactersCharacterIdCalendarEventIdResponse.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(response);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutCharactersCharacterIdCalendarEventIdResponse {\n");

    sb.append("    response: ").append(toIndentedString(response)).append("\n");
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

