package com.github.tddts.eve.model.error;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Bad request model
 */
@ApiModel(description = "Bad request model")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-19T00:31:50.538543+04:00[Europe/Samara]")
public class BadRequest {
  @JsonProperty("error")
  private String error = null;

  public BadRequest error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Bad request message
   *
   * @return error
   **/
  @ApiModelProperty(required = true, value = "Bad request message")
  @NotNull

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
    BadRequest badRequest = (BadRequest) o;
    return Objects.equals(this.error, badRequest.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BadRequest {\n");

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
