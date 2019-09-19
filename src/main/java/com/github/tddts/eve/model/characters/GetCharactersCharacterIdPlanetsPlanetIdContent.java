package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * content object
 */
@ApiModel(description = "content object")
@Validated
public class GetCharactersCharacterIdPlanetsPlanetIdContent {
  @JsonProperty("amount")
  private Long amount = null;

  @JsonProperty("type_id")
  private Integer typeId = null;

  public GetCharactersCharacterIdPlanetsPlanetIdContent amount(Long amount) {
    this.amount = amount;
    return this;
  }

  /**
   * amount integer
   *
   * @return amount
   **/
  @ApiModelProperty(required = true, value = "amount integer")
  @NotNull


  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdContent typeId(Integer typeId) {
    this.typeId = typeId;
    return this;
  }

  /**
   * type_id integer
   *
   * @return typeId
   **/
  @ApiModelProperty(required = true, value = "type_id integer")
  @NotNull


  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdPlanetsPlanetIdContent getCharactersCharacterIdPlanetsPlanetIdContent = (GetCharactersCharacterIdPlanetsPlanetIdContent) o;
    return Objects.equals(this.amount, getCharactersCharacterIdPlanetsPlanetIdContent.amount) &&
        Objects.equals(this.typeId, getCharactersCharacterIdPlanetsPlanetIdContent.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, typeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdPlanetsPlanetIdContent {\n");

    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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

