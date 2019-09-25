package com.github.tddts.eve.model.universe;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * region object
 */
@ApiModel(description = "region object")
@Validated
public class PostUniverseIdsRegion {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  public PostUniverseIdsRegion id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * id integer
   *
   * @return id
   **/
  @ApiModelProperty(value = "id integer")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PostUniverseIdsRegion name(String name) {
    this.name = name;
    return this;
  }

  /**
   * name string
   *
   * @return name
   **/
  @ApiModelProperty(value = "name string")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostUniverseIdsRegion postUniverseIdsRegion = (PostUniverseIdsRegion) o;
    return Objects.equals(this.id, postUniverseIdsRegion.id) &&
        Objects.equals(this.name, postUniverseIdsRegion.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostUniverseIdsRegion {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

