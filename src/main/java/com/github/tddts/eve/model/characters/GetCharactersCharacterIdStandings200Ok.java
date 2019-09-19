package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
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
public class GetCharactersCharacterIdStandings200Ok {
  @JsonProperty("from_id")
  private Integer fromId = null;

  /**
   * from_type string
   */
  public enum FromTypeEnum {
    AGENT("agent"),

    NPC_CORP("npc_corp"),

    FACTION("faction");

    private String value;

    FromTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static FromTypeEnum fromValue(String text) {
      for (FromTypeEnum b : FromTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("from_type")
  private FromTypeEnum fromType = null;

  @JsonProperty("standing")
  private Float standing = null;

  public GetCharactersCharacterIdStandings200Ok fromId(Integer fromId) {
    this.fromId = fromId;
    return this;
  }

  /**
   * from_id integer
   *
   * @return fromId
   **/
  @ApiModelProperty(required = true, value = "from_id integer")
  @NotNull


  public Integer getFromId() {
    return fromId;
  }

  public void setFromId(Integer fromId) {
    this.fromId = fromId;
  }

  public GetCharactersCharacterIdStandings200Ok fromType(FromTypeEnum fromType) {
    this.fromType = fromType;
    return this;
  }

  /**
   * from_type string
   *
   * @return fromType
   **/
  @ApiModelProperty(required = true, value = "from_type string")
  @NotNull


  public FromTypeEnum getFromType() {
    return fromType;
  }

  public void setFromType(FromTypeEnum fromType) {
    this.fromType = fromType;
  }

  public GetCharactersCharacterIdStandings200Ok standing(Float standing) {
    this.standing = standing;
    return this;
  }

  /**
   * standing number
   *
   * @return standing
   **/
  @ApiModelProperty(required = true, value = "standing number")
  @NotNull


  public Float getStanding() {
    return standing;
  }

  public void setStanding(Float standing) {
    this.standing = standing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdStandings200Ok getCharactersCharacterIdStandings200Ok = (GetCharactersCharacterIdStandings200Ok) o;
    return Objects.equals(this.fromId, getCharactersCharacterIdStandings200Ok.fromId) &&
        Objects.equals(this.fromType, getCharactersCharacterIdStandings200Ok.fromType) &&
        Objects.equals(this.standing, getCharactersCharacterIdStandings200Ok.standing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromId, fromType, standing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdStandings200Ok {\n");

    sb.append("    fromId: ").append(toIndentedString(fromId)).append("\n");
    sb.append("    fromType: ").append(toIndentedString(fromType)).append("\n");
    sb.append("    standing: ").append(toIndentedString(standing)).append("\n");
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

