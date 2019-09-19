package com.github.tddts.eve.model.characters;

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
public class GetCharactersCharacterIdMailLists200Ok {
  @JsonProperty("mailing_list_id")
  private Integer mailingListId = null;

  @JsonProperty("name")
  private String name = null;

  public GetCharactersCharacterIdMailLists200Ok mailingListId(Integer mailingListId) {
    this.mailingListId = mailingListId;
    return this;
  }

  /**
   * Mailing list ID
   *
   * @return mailingListId
   **/
  @ApiModelProperty(required = true, value = "Mailing list ID")
  @NotNull


  public Integer getMailingListId() {
    return mailingListId;
  }

  public void setMailingListId(Integer mailingListId) {
    this.mailingListId = mailingListId;
  }

  public GetCharactersCharacterIdMailLists200Ok name(String name) {
    this.name = name;
    return this;
  }

  /**
   * name string
   *
   * @return name
   **/
  @ApiModelProperty(required = true, value = "name string")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdMailLists200Ok getCharactersCharacterIdMailLists200Ok = (GetCharactersCharacterIdMailLists200Ok) o;
    return Objects.equals(this.mailingListId, getCharactersCharacterIdMailLists200Ok.mailingListId) &&
        Objects.equals(this.name, getCharactersCharacterIdMailLists200Ok.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mailingListId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdMailLists200Ok {\n");

    sb.append("    mailingListId: ").append(toIndentedString(mailingListId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

