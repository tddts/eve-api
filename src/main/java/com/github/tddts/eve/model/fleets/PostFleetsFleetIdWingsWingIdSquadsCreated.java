package com.github.tddts.eve.model.fleets;

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
public class PostFleetsFleetIdWingsWingIdSquadsCreated {
  @JsonProperty("squad_id")
  private Long squadId = null;

  public PostFleetsFleetIdWingsWingIdSquadsCreated squadId(Long squadId) {
    this.squadId = squadId;
    return this;
  }

  /**
   * The squad_id of the newly created squad
   *
   * @return squadId
   **/
  @ApiModelProperty(required = true, value = "The squad_id of the newly created squad")
  @NotNull


  public Long getSquadId() {
    return squadId;
  }

  public void setSquadId(Long squadId) {
    this.squadId = squadId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostFleetsFleetIdWingsWingIdSquadsCreated postFleetsFleetIdWingsWingIdSquadsCreated = (PostFleetsFleetIdWingsWingIdSquadsCreated) o;
    return Objects.equals(this.squadId, postFleetsFleetIdWingsWingIdSquadsCreated.squadId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(squadId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostFleetsFleetIdWingsWingIdSquadsCreated {\n");

    sb.append("    squadId: ").append(toIndentedString(squadId)).append("\n");
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

