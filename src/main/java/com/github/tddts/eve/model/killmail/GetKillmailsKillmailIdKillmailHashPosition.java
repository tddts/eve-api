package com.github.tddts.eve.model.killmail;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Coordinates of the victim in Cartesian space relative to the Sun
 */
@ApiModel(description = "Coordinates of the victim in Cartesian space relative to the Sun ")
@Validated
public class GetKillmailsKillmailIdKillmailHashPosition {
  @JsonProperty("x")
  private Double x = null;

  @JsonProperty("y")
  private Double y = null;

  @JsonProperty("z")
  private Double z = null;

  public GetKillmailsKillmailIdKillmailHashPosition x(Double x) {
    this.x = x;
    return this;
  }

  /**
   * x number
   *
   * @return x
   **/
  @ApiModelProperty(required = true, value = "x number")
  @NotNull


  public Double getX() {
    return x;
  }

  public void setX(Double x) {
    this.x = x;
  }

  public GetKillmailsKillmailIdKillmailHashPosition y(Double y) {
    this.y = y;
    return this;
  }

  /**
   * y number
   *
   * @return y
   **/
  @ApiModelProperty(required = true, value = "y number")
  @NotNull


  public Double getY() {
    return y;
  }

  public void setY(Double y) {
    this.y = y;
  }

  public GetKillmailsKillmailIdKillmailHashPosition z(Double z) {
    this.z = z;
    return this;
  }

  /**
   * z number
   *
   * @return z
   **/
  @ApiModelProperty(required = true, value = "z number")
  @NotNull


  public Double getZ() {
    return z;
  }

  public void setZ(Double z) {
    this.z = z;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetKillmailsKillmailIdKillmailHashPosition getKillmailsKillmailIdKillmailHashPosition = (GetKillmailsKillmailIdKillmailHashPosition) o;
    return Objects.equals(this.x, getKillmailsKillmailIdKillmailHashPosition.x) &&
        Objects.equals(this.y, getKillmailsKillmailIdKillmailHashPosition.y) &&
        Objects.equals(this.z, getKillmailsKillmailIdKillmailHashPosition.z);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, z);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetKillmailsKillmailIdKillmailHashPosition {\n");

    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    z: ").append(toIndentedString(z)).append("\n");
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

