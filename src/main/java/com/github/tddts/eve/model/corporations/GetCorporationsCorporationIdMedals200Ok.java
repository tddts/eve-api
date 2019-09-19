package com.github.tddts.eve.model.corporations;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@Validated
public class GetCorporationsCorporationIdMedals200Ok {
  @JsonProperty("created_at")
  private OffsetDateTime createdAt = null;

  @JsonProperty("creator_id")
  private Integer creatorId = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("medal_id")
  private Integer medalId = null;

  @JsonProperty("title")
  private String title = null;

  public GetCorporationsCorporationIdMedals200Ok createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * created_at string
   *
   * @return createdAt
   **/
  @ApiModelProperty(required = true, value = "created_at string")
  @NotNull

  @Valid

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public GetCorporationsCorporationIdMedals200Ok creatorId(Integer creatorId) {
    this.creatorId = creatorId;
    return this;
  }

  /**
   * ID of the character who created this medal
   *
   * @return creatorId
   **/
  @ApiModelProperty(required = true, value = "ID of the character who created this medal")
  @NotNull


  public Integer getCreatorId() {
    return creatorId;
  }

  public void setCreatorId(Integer creatorId) {
    this.creatorId = creatorId;
  }

  public GetCorporationsCorporationIdMedals200Ok description(String description) {
    this.description = description;
    return this;
  }

  /**
   * description string
   *
   * @return description
   **/
  @ApiModelProperty(required = true, value = "description string")
  @NotNull

  @Size(max = 1000)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GetCorporationsCorporationIdMedals200Ok medalId(Integer medalId) {
    this.medalId = medalId;
    return this;
  }

  /**
   * medal_id integer
   *
   * @return medalId
   **/
  @ApiModelProperty(required = true, value = "medal_id integer")
  @NotNull


  public Integer getMedalId() {
    return medalId;
  }

  public void setMedalId(Integer medalId) {
    this.medalId = medalId;
  }

  public GetCorporationsCorporationIdMedals200Ok title(String title) {
    this.title = title;
    return this;
  }

  /**
   * title string
   *
   * @return title
   **/
  @ApiModelProperty(required = true, value = "title string")
  @NotNull

  @Size(max = 100)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdMedals200Ok getCorporationsCorporationIdMedals200Ok = (GetCorporationsCorporationIdMedals200Ok) o;
    return Objects.equals(this.createdAt, getCorporationsCorporationIdMedals200Ok.createdAt) &&
        Objects.equals(this.creatorId, getCorporationsCorporationIdMedals200Ok.creatorId) &&
        Objects.equals(this.description, getCorporationsCorporationIdMedals200Ok.description) &&
        Objects.equals(this.medalId, getCorporationsCorporationIdMedals200Ok.medalId) &&
        Objects.equals(this.title, getCorporationsCorporationIdMedals200Ok.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, creatorId, description, medalId, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdMedals200Ok {\n");

    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    medalId: ").append(toIndentedString(medalId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

