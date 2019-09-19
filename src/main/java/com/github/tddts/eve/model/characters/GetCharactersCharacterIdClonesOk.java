package com.github.tddts.eve.model.characters;

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
public class GetCharactersCharacterIdClonesOk {
  @JsonProperty("home_location")
  private GetCharactersCharacterIdClonesHomeLocation homeLocation = null;

  @JsonProperty("jump_clones")
  @Valid
  private List<GetCharactersCharacterIdClonesJumpClone> jumpClones = new ArrayList<GetCharactersCharacterIdClonesJumpClone>();

  @JsonProperty("last_clone_jump_date")
  private OffsetDateTime lastCloneJumpDate = null;

  @JsonProperty("last_station_change_date")
  private OffsetDateTime lastStationChangeDate = null;

  public GetCharactersCharacterIdClonesOk homeLocation(GetCharactersCharacterIdClonesHomeLocation homeLocation) {
    this.homeLocation = homeLocation;
    return this;
  }

  /**
   * Get homeLocation
   *
   * @return homeLocation
   **/
  @ApiModelProperty(value = "")

  @Valid

  public GetCharactersCharacterIdClonesHomeLocation getHomeLocation() {
    return homeLocation;
  }

  public void setHomeLocation(GetCharactersCharacterIdClonesHomeLocation homeLocation) {
    this.homeLocation = homeLocation;
  }

  public GetCharactersCharacterIdClonesOk jumpClones(List<GetCharactersCharacterIdClonesJumpClone> jumpClones) {
    this.jumpClones = jumpClones;
    return this;
  }

  public GetCharactersCharacterIdClonesOk addJumpClonesItem(GetCharactersCharacterIdClonesJumpClone jumpClonesItem) {
    this.jumpClones.add(jumpClonesItem);
    return this;
  }

  /**
   * jump_clones array
   *
   * @return jumpClones
   **/
  @ApiModelProperty(required = true, value = "jump_clones array")
  @NotNull

  @Valid
  @Size(max = 10)
  public List<GetCharactersCharacterIdClonesJumpClone> getJumpClones() {
    return jumpClones;
  }

  public void setJumpClones(List<GetCharactersCharacterIdClonesJumpClone> jumpClones) {
    this.jumpClones = jumpClones;
  }

  public GetCharactersCharacterIdClonesOk lastCloneJumpDate(OffsetDateTime lastCloneJumpDate) {
    this.lastCloneJumpDate = lastCloneJumpDate;
    return this;
  }

  /**
   * last_clone_jump_date string
   *
   * @return lastCloneJumpDate
   **/
  @ApiModelProperty(value = "last_clone_jump_date string")

  @Valid

  public OffsetDateTime getLastCloneJumpDate() {
    return lastCloneJumpDate;
  }

  public void setLastCloneJumpDate(OffsetDateTime lastCloneJumpDate) {
    this.lastCloneJumpDate = lastCloneJumpDate;
  }

  public GetCharactersCharacterIdClonesOk lastStationChangeDate(OffsetDateTime lastStationChangeDate) {
    this.lastStationChangeDate = lastStationChangeDate;
    return this;
  }

  /**
   * last_station_change_date string
   *
   * @return lastStationChangeDate
   **/
  @ApiModelProperty(value = "last_station_change_date string")

  @Valid

  public OffsetDateTime getLastStationChangeDate() {
    return lastStationChangeDate;
  }

  public void setLastStationChangeDate(OffsetDateTime lastStationChangeDate) {
    this.lastStationChangeDate = lastStationChangeDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdClonesOk getCharactersCharacterIdClonesOk = (GetCharactersCharacterIdClonesOk) o;
    return Objects.equals(this.homeLocation, getCharactersCharacterIdClonesOk.homeLocation) &&
        Objects.equals(this.jumpClones, getCharactersCharacterIdClonesOk.jumpClones) &&
        Objects.equals(this.lastCloneJumpDate, getCharactersCharacterIdClonesOk.lastCloneJumpDate) &&
        Objects.equals(this.lastStationChangeDate, getCharactersCharacterIdClonesOk.lastStationChangeDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(homeLocation, jumpClones, lastCloneJumpDate, lastStationChangeDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdClonesOk {\n");

    sb.append("    homeLocation: ").append(toIndentedString(homeLocation)).append("\n");
    sb.append("    jumpClones: ").append(toIndentedString(jumpClones)).append("\n");
    sb.append("    lastCloneJumpDate: ").append(toIndentedString(lastCloneJumpDate)).append("\n");
    sb.append("    lastStationChangeDate: ").append(toIndentedString(lastStationChangeDate)).append("\n");
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

