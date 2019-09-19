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
 * recipient object
 */
@ApiModel(description = "recipient object")
@Validated
public class PostCharactersCharacterIdMailRecipient {
  @JsonProperty("recipient_id")
  private Integer recipientId = null;

  /**
   * recipient_type string
   */
  public enum RecipientTypeEnum {
    ALLIANCE("alliance"),

    CHARACTER("character"),

    CORPORATION("corporation"),

    MAILING_LIST("mailing_list");

    private String value;

    RecipientTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RecipientTypeEnum fromValue(String text) {
      for (RecipientTypeEnum b : RecipientTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("recipient_type")
  private RecipientTypeEnum recipientType = null;

  public PostCharactersCharacterIdMailRecipient recipientId(Integer recipientId) {
    this.recipientId = recipientId;
    return this;
  }

  /**
   * recipient_id integer
   *
   * @return recipientId
   **/
  @ApiModelProperty(required = true, value = "recipient_id integer")
  @NotNull


  public Integer getRecipientId() {
    return recipientId;
  }

  public void setRecipientId(Integer recipientId) {
    this.recipientId = recipientId;
  }

  public PostCharactersCharacterIdMailRecipient recipientType(RecipientTypeEnum recipientType) {
    this.recipientType = recipientType;
    return this;
  }

  /**
   * recipient_type string
   *
   * @return recipientType
   **/
  @ApiModelProperty(required = true, value = "recipient_type string")
  @NotNull


  public RecipientTypeEnum getRecipientType() {
    return recipientType;
  }

  public void setRecipientType(RecipientTypeEnum recipientType) {
    this.recipientType = recipientType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostCharactersCharacterIdMailRecipient postCharactersCharacterIdMailRecipient = (PostCharactersCharacterIdMailRecipient) o;
    return Objects.equals(this.recipientId, postCharactersCharacterIdMailRecipient.recipientId) &&
        Objects.equals(this.recipientType, postCharactersCharacterIdMailRecipient.recipientType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipientId, recipientType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCharactersCharacterIdMailRecipient {\n");

    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    recipientType: ").append(toIndentedString(recipientType)).append("\n");
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

