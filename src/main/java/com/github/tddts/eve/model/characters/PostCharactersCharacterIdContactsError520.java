package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * Error 520
 */
@ApiModel(description = "Error 520")
@Validated
public class PostCharactersCharacterIdContactsError520 {
  @JsonProperty("error")
  private String error = null;

  public PostCharactersCharacterIdContactsError520 error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Error 520 message
   *
   * @return error
   **/
  @ApiModelProperty(value = "Error 520 message")


  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostCharactersCharacterIdContactsError520 postCharactersCharacterIdContactsError520 = (PostCharactersCharacterIdContactsError520) o;
    return Objects.equals(this.error, postCharactersCharacterIdContactsError520.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCharactersCharacterIdContactsError520 {\n");

    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

