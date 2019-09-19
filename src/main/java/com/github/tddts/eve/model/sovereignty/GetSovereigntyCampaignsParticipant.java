package com.github.tddts.eve.model.sovereignty;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * participant object
 */
@ApiModel(description = "participant object")
@Validated
public class GetSovereigntyCampaignsParticipant {
  @JsonProperty("alliance_id")
  private Integer allianceId = null;

  @JsonProperty("score")
  private Float score = null;

  public GetSovereigntyCampaignsParticipant allianceId(Integer allianceId) {
    this.allianceId = allianceId;
    return this;
  }

  /**
   * alliance_id integer
   *
   * @return allianceId
   **/
  @ApiModelProperty(required = true, value = "alliance_id integer")
  @NotNull


  public Integer getAllianceId() {
    return allianceId;
  }

  public void setAllianceId(Integer allianceId) {
    this.allianceId = allianceId;
  }

  public GetSovereigntyCampaignsParticipant score(Float score) {
    this.score = score;
    return this;
  }

  /**
   * score number
   *
   * @return score
   **/
  @ApiModelProperty(required = true, value = "score number")
  @NotNull


  public Float getScore() {
    return score;
  }

  public void setScore(Float score) {
    this.score = score;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSovereigntyCampaignsParticipant getSovereigntyCampaignsParticipant = (GetSovereigntyCampaignsParticipant) o;
    return Objects.equals(this.allianceId, getSovereigntyCampaignsParticipant.allianceId) &&
        Objects.equals(this.score, getSovereigntyCampaignsParticipant.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allianceId, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSovereigntyCampaignsParticipant {\n");

    sb.append("    allianceId: ").append(toIndentedString(allianceId)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

