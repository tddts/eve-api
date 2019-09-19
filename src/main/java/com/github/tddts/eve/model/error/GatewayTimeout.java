package com.github.tddts.eve.model.error;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Gateway timeout model
 */
@ApiModel(description = "Gateway timeout model")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-19T00:31:50.538543+04:00[Europe/Samara]")
public class GatewayTimeout {
  @JsonProperty("error")
  private String error = null;

  @JsonProperty("timeout")
  private Integer timeout = null;

  public GatewayTimeout error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Gateway timeout message
   *
   * @return error
   **/
  @ApiModelProperty(required = true, value = "Gateway timeout message")
  @NotNull
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public GatewayTimeout timeout(Integer timeout) {
    this.timeout = timeout;
    return this;
  }

  /**
   * number of seconds the request was given
   *
   * @return timeout
   **/
  @ApiModelProperty(value = "number of seconds the request was given")
  public Integer getTimeout() {
    return timeout;
  }

  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayTimeout gatewayTimeout = (GatewayTimeout) o;
    return Objects.equals(this.error, gatewayTimeout.error) &&
        Objects.equals(this.timeout, gatewayTimeout.timeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, timeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayTimeout {\n");

    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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
