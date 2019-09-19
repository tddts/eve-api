package com.github.tddts.eve.model.wars;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * Unprocessable entity
 */
@ApiModel(description = "Unprocessable entity")
@Validated
public class GetWarsWarIdUnprocessableEntity {
  @JsonProperty("error")
  private String error = null;

  public GetWarsWarIdUnprocessableEntity error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Unprocessable entity message
   *
   * @return error
   **/
  @ApiModelProperty(value = "Unprocessable entity message")


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
    GetWarsWarIdUnprocessableEntity getWarsWarIdUnprocessableEntity = (GetWarsWarIdUnprocessableEntity) o;
    return Objects.equals(this.error, getWarsWarIdUnprocessableEntity.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetWarsWarIdUnprocessableEntity {\n");

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

