package com.github.tddts.eve.model.error;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Forbidden model
 */
@ApiModel(description = "Forbidden model")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-19T00:31:50.538543+04:00[Europe/Samara]")
public class Forbidden {
  @JsonProperty("error")
  private String error = null;

  @JsonProperty("sso_status")
  private Integer ssoStatus = null;

  public Forbidden error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Forbidden message
   *
   * @return error
   **/
  @ApiModelProperty(required = true, value = "Forbidden message")
  @NotNull
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public Forbidden ssoStatus(Integer ssoStatus) {
    this.ssoStatus = ssoStatus;
    return this;
  }

  /**
   * status code received from SSO
   *
   * @return ssoStatus
   **/
  @ApiModelProperty(value = "status code received from SSO")

  public Integer getSsoStatus() {
    return ssoStatus;
  }

  public void setSsoStatus(Integer ssoStatus) {
    this.ssoStatus = ssoStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Forbidden forbidden = (Forbidden) o;
    return Objects.equals(this.error, forbidden.error) &&
        Objects.equals(this.ssoStatus, forbidden.ssoStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, ssoStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Forbidden {\n");

    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    ssoStatus: ").append(toIndentedString(ssoStatus)).append("\n");
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
