package com.github.tddts.eve.model.wars;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@Validated
public class GetWarsWarIdOk {
  @JsonProperty("aggressor")
  private GetWarsWarIdAggressor aggressor = null;

  @JsonProperty("allies")
  @Valid
  private List<GetWarsWarIdAlly> allies = null;

  @JsonProperty("declared")
  private OffsetDateTime declared = null;

  @JsonProperty("defender")
  private GetWarsWarIdDefender defender = null;

  @JsonProperty("finished")
  private OffsetDateTime finished = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("mutual")
  private Boolean mutual = null;

  @JsonProperty("open_for_allies")
  private Boolean openForAllies = null;

  @JsonProperty("retracted")
  private OffsetDateTime retracted = null;

  @JsonProperty("started")
  private OffsetDateTime started = null;

  public GetWarsWarIdOk aggressor(GetWarsWarIdAggressor aggressor) {
    this.aggressor = aggressor;
    return this;
  }

  /**
   * Get aggressor
   *
   * @return aggressor
   **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public GetWarsWarIdAggressor getAggressor() {
    return aggressor;
  }

  public void setAggressor(GetWarsWarIdAggressor aggressor) {
    this.aggressor = aggressor;
  }

  public GetWarsWarIdOk allies(List<GetWarsWarIdAlly> allies) {
    this.allies = allies;
    return this;
  }

  public GetWarsWarIdOk addAlliesItem(GetWarsWarIdAlly alliesItem) {
    if (this.allies == null) {
      this.allies = new ArrayList<GetWarsWarIdAlly>();
    }
    this.allies.add(alliesItem);
    return this;
  }

  /**
   * allied corporations or alliances, each object contains either corporation_id or alliance_id
   *
   * @return allies
   **/
  @ApiModelProperty(value = "allied corporations or alliances, each object contains either corporation_id or alliance_id")

  @Valid
  @Size(max = 10000)
  public List<GetWarsWarIdAlly> getAllies() {
    return allies;
  }

  public void setAllies(List<GetWarsWarIdAlly> allies) {
    this.allies = allies;
  }

  public GetWarsWarIdOk declared(OffsetDateTime declared) {
    this.declared = declared;
    return this;
  }

  /**
   * Time that the war was declared
   *
   * @return declared
   **/
  @ApiModelProperty(required = true, value = "Time that the war was declared")
  @NotNull

  @Valid

  public OffsetDateTime getDeclared() {
    return declared;
  }

  public void setDeclared(OffsetDateTime declared) {
    this.declared = declared;
  }

  public GetWarsWarIdOk defender(GetWarsWarIdDefender defender) {
    this.defender = defender;
    return this;
  }

  /**
   * Get defender
   *
   * @return defender
   **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public GetWarsWarIdDefender getDefender() {
    return defender;
  }

  public void setDefender(GetWarsWarIdDefender defender) {
    this.defender = defender;
  }

  public GetWarsWarIdOk finished(OffsetDateTime finished) {
    this.finished = finished;
    return this;
  }

  /**
   * Time the war ended and shooting was no longer allowed
   *
   * @return finished
   **/
  @ApiModelProperty(value = "Time the war ended and shooting was no longer allowed")

  @Valid

  public OffsetDateTime getFinished() {
    return finished;
  }

  public void setFinished(OffsetDateTime finished) {
    this.finished = finished;
  }

  public GetWarsWarIdOk id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the specified war
   *
   * @return id
   **/
  @ApiModelProperty(required = true, value = "ID of the specified war")
  @NotNull


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GetWarsWarIdOk mutual(Boolean mutual) {
    this.mutual = mutual;
    return this;
  }

  /**
   * Was the war declared mutual by both parties
   *
   * @return mutual
   **/
  @ApiModelProperty(required = true, value = "Was the war declared mutual by both parties")
  @NotNull


  public Boolean isMutual() {
    return mutual;
  }

  public void setMutual(Boolean mutual) {
    this.mutual = mutual;
  }

  public GetWarsWarIdOk openForAllies(Boolean openForAllies) {
    this.openForAllies = openForAllies;
    return this;
  }

  /**
   * Is the war currently open for allies or not
   *
   * @return openForAllies
   **/
  @ApiModelProperty(required = true, value = "Is the war currently open for allies or not")
  @NotNull


  public Boolean isOpenForAllies() {
    return openForAllies;
  }

  public void setOpenForAllies(Boolean openForAllies) {
    this.openForAllies = openForAllies;
  }

  public GetWarsWarIdOk retracted(OffsetDateTime retracted) {
    this.retracted = retracted;
    return this;
  }

  /**
   * Time the war was retracted but both sides could still shoot each other
   *
   * @return retracted
   **/
  @ApiModelProperty(value = "Time the war was retracted but both sides could still shoot each other")

  @Valid

  public OffsetDateTime getRetracted() {
    return retracted;
  }

  public void setRetracted(OffsetDateTime retracted) {
    this.retracted = retracted;
  }

  public GetWarsWarIdOk started(OffsetDateTime started) {
    this.started = started;
    return this;
  }

  /**
   * Time when the war started and both sides could shoot each other
   *
   * @return started
   **/
  @ApiModelProperty(value = "Time when the war started and both sides could shoot each other")

  @Valid

  public OffsetDateTime getStarted() {
    return started;
  }

  public void setStarted(OffsetDateTime started) {
    this.started = started;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetWarsWarIdOk getWarsWarIdOk = (GetWarsWarIdOk) o;
    return Objects.equals(this.aggressor, getWarsWarIdOk.aggressor) &&
        Objects.equals(this.allies, getWarsWarIdOk.allies) &&
        Objects.equals(this.declared, getWarsWarIdOk.declared) &&
        Objects.equals(this.defender, getWarsWarIdOk.defender) &&
        Objects.equals(this.finished, getWarsWarIdOk.finished) &&
        Objects.equals(this.id, getWarsWarIdOk.id) &&
        Objects.equals(this.mutual, getWarsWarIdOk.mutual) &&
        Objects.equals(this.openForAllies, getWarsWarIdOk.openForAllies) &&
        Objects.equals(this.retracted, getWarsWarIdOk.retracted) &&
        Objects.equals(this.started, getWarsWarIdOk.started);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aggressor, allies, declared, defender, finished, id, mutual, openForAllies, retracted, started);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetWarsWarIdOk {\n");

    sb.append("    aggressor: ").append(toIndentedString(aggressor)).append("\n");
    sb.append("    allies: ").append(toIndentedString(allies)).append("\n");
    sb.append("    declared: ").append(toIndentedString(declared)).append("\n");
    sb.append("    defender: ").append(toIndentedString(defender)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mutual: ").append(toIndentedString(mutual)).append("\n");
    sb.append("    openForAllies: ").append(toIndentedString(openForAllies)).append("\n");
    sb.append("    retracted: ").append(toIndentedString(retracted)).append("\n");
    sb.append("    started: ").append(toIndentedString(started)).append("\n");
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

