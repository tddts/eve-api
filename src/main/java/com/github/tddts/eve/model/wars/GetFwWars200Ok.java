package com.github.tddts.eve.model.wars;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@Validated
public class GetFwWars200Ok {
  @JsonProperty("against_id")
  private Integer againstId = null;

  @JsonProperty("faction_id")
  private Integer factionId = null;

  public GetFwWars200Ok againstId(Integer againstId) {
    this.againstId = againstId;
    return this;
  }

  /**
   * The faction ID of the enemy faction.
   *
   * @return againstId
   **/
  @ApiModelProperty(required = true, value = "The faction ID of the enemy faction.")
  @NotNull


  public Integer getAgainstId() {
    return againstId;
  }

  public void setAgainstId(Integer againstId) {
    this.againstId = againstId;
  }

  public GetFwWars200Ok factionId(Integer factionId) {
    this.factionId = factionId;
    return this;
  }

  /**
   * faction_id integer
   *
   * @return factionId
   **/
  @ApiModelProperty(required = true, value = "faction_id integer")
  @NotNull


  public Integer getFactionId() {
    return factionId;
  }

  public void setFactionId(Integer factionId) {
    this.factionId = factionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFwWars200Ok getFwWars200Ok = (GetFwWars200Ok) o;
    return Objects.equals(this.againstId, getFwWars200Ok.againstId) &&
        Objects.equals(this.factionId, getFwWars200Ok.factionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(againstId, factionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFwWars200Ok {\n");

    sb.append("    againstId: ").append(toIndentedString(againstId)).append("\n");
    sb.append("    factionId: ").append(toIndentedString(factionId)).append("\n");
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

