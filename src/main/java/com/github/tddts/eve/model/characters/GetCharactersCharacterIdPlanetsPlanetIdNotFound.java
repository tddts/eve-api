package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * Colony not found
 */
@ApiModel(description = "Colony not found")
@Validated
public class GetCharactersCharacterIdPlanetsPlanetIdNotFound {
  @JsonProperty("error")
  private String error = null;

  public GetCharactersCharacterIdPlanetsPlanetIdNotFound error(String error) {
    this.error = error;
    return this;
  }

  /**
   * error message
   *
   * @return error
   **/
  @ApiModelProperty(value = "error message")


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
    GetCharactersCharacterIdPlanetsPlanetIdNotFound getCharactersCharacterIdPlanetsPlanetIdNotFound = (GetCharactersCharacterIdPlanetsPlanetIdNotFound) o;
    return Objects.equals(this.error, getCharactersCharacterIdPlanetsPlanetIdNotFound.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdPlanetsPlanetIdNotFound {\n");

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

