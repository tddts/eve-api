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
public class GetCharactersCharacterIdBookmarksFolders200Ok {
  @JsonProperty("folder_id")
  private Integer folderId = null;

  @JsonProperty("name")
  private String name = null;

  public GetCharactersCharacterIdBookmarksFolders200Ok folderId(Integer folderId) {
    this.folderId = folderId;
    return this;
  }

  /**
   * folder_id integer
   *
   * @return folderId
   **/
  @ApiModelProperty(required = true, value = "folder_id integer")
  @NotNull


  public Integer getFolderId() {
    return folderId;
  }

  public void setFolderId(Integer folderId) {
    this.folderId = folderId;
  }

  public GetCharactersCharacterIdBookmarksFolders200Ok name(String name) {
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
    GetCharactersCharacterIdBookmarksFolders200Ok getCharactersCharacterIdBookmarksFolders200Ok = (GetCharactersCharacterIdBookmarksFolders200Ok) o;
    return Objects.equals(this.folderId, getCharactersCharacterIdBookmarksFolders200Ok.folderId) &&
        Objects.equals(this.name, getCharactersCharacterIdBookmarksFolders200Ok.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(folderId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdBookmarksFolders200Ok {\n");

    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
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

