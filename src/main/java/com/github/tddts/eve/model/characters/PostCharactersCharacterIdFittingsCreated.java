package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * 201 created object
 */
@ApiModel(description = "201 created object")
@Validated
public class PostCharactersCharacterIdFittingsCreated {
  @JsonProperty("fitting_id")
  private Integer fittingId = null;

  public PostCharactersCharacterIdFittingsCreated fittingId(Integer fittingId) {
    this.fittingId = fittingId;
    return this;
  }

  /**
   * fitting_id integer
   *
   * @return fittingId
   **/
  @ApiModelProperty(required = true, value = "fitting_id integer")
  @NotNull


  public Integer getFittingId() {
    return fittingId;
  }

  public void setFittingId(Integer fittingId) {
    this.fittingId = fittingId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostCharactersCharacterIdFittingsCreated postCharactersCharacterIdFittingsCreated = (PostCharactersCharacterIdFittingsCreated) o;
    return Objects.equals(this.fittingId, postCharactersCharacterIdFittingsCreated.fittingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fittingId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCharactersCharacterIdFittingsCreated {\n");

    sb.append("    fittingId: ").append(toIndentedString(fittingId)).append("\n");
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

