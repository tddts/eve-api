package com.github.tddts.eve.model.corporations;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Optional object that is returned if a bookmark was made on a planet or a random location in space.
 */
@ApiModel(description = "Optional object that is returned if a bookmark was made on a planet or a random location in space.")
@Validated
public class GetCorporationsCorporationIdBookmarksCoordinates {
  @JsonProperty("x")
  private Double x = null;

  @JsonProperty("y")
  private Double y = null;

  @JsonProperty("z")
  private Double z = null;

  public GetCorporationsCorporationIdBookmarksCoordinates x(Double x) {
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

  public GetCorporationsCorporationIdBookmarksCoordinates y(Double y) {
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

  public GetCorporationsCorporationIdBookmarksCoordinates z(Double z) {
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
    GetCorporationsCorporationIdBookmarksCoordinates getCorporationsCorporationIdBookmarksCoordinates = (GetCorporationsCorporationIdBookmarksCoordinates) o;
    return Objects.equals(this.x, getCorporationsCorporationIdBookmarksCoordinates.x) &&
        Objects.equals(this.y, getCorporationsCorporationIdBookmarksCoordinates.y) &&
        Objects.equals(this.z, getCorporationsCorporationIdBookmarksCoordinates.z);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, z);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdBookmarksCoordinates {\n");

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

