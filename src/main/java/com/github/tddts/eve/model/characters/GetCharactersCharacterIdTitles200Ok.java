package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@Validated
public class GetCharactersCharacterIdTitles200Ok {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("title_id")
  private Integer titleId = null;

  public GetCharactersCharacterIdTitles200Ok name(String name) {
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

  public GetCharactersCharacterIdTitles200Ok titleId(Integer titleId) {
    this.titleId = titleId;
    return this;
  }

  /**
   * title_id integer
   *
   * @return titleId
   **/
  @ApiModelProperty(value = "title_id integer")


  public Integer getTitleId() {
    return titleId;
  }

  public void setTitleId(Integer titleId) {
    this.titleId = titleId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdTitles200Ok getCharactersCharacterIdTitles200Ok = (GetCharactersCharacterIdTitles200Ok) o;
    return Objects.equals(this.name, getCharactersCharacterIdTitles200Ok.name) &&
        Objects.equals(this.titleId, getCharactersCharacterIdTitles200Ok.titleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, titleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdTitles200Ok {\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    titleId: ").append(toIndentedString(titleId)).append("\n");
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

