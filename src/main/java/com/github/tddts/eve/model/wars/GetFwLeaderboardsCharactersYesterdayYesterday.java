package com.github.tddts.eve.model.wars;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * yesterday object
 */
@ApiModel(description = "yesterday object")
@Validated
public class GetFwLeaderboardsCharactersYesterdayYesterday {
  @JsonProperty("amount")
  private Integer amount = null;

  @JsonProperty("character_id")
  private Integer characterId = null;

  public GetFwLeaderboardsCharactersYesterdayYesterday amount(Integer amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Amount of kills
   *
   * @return amount
   **/
  @ApiModelProperty(value = "Amount of kills")


  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public GetFwLeaderboardsCharactersYesterdayYesterday characterId(Integer characterId) {
    this.characterId = characterId;
    return this;
  }

  /**
   * character_id integer
   *
   * @return characterId
   **/
  @ApiModelProperty(value = "character_id integer")


  public Integer getCharacterId() {
    return characterId;
  }

  public void setCharacterId(Integer characterId) {
    this.characterId = characterId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFwLeaderboardsCharactersYesterdayYesterday getFwLeaderboardsCharactersYesterdayYesterday = (GetFwLeaderboardsCharactersYesterdayYesterday) o;
    return Objects.equals(this.amount, getFwLeaderboardsCharactersYesterdayYesterday.amount) &&
        Objects.equals(this.characterId, getFwLeaderboardsCharactersYesterdayYesterday.characterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, characterId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFwLeaderboardsCharactersYesterdayYesterday {\n");

    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
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

