package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@Validated
public class GetCharactersCharacterIdMailLabelsOk {
  @JsonProperty("labels")
  @Valid
  private List<GetCharactersCharacterIdMailLabelsLabel> labels = null;

  @JsonProperty("total_unread_count")
  private Integer totalUnreadCount = null;

  public GetCharactersCharacterIdMailLabelsOk labels(List<GetCharactersCharacterIdMailLabelsLabel> labels) {
    this.labels = labels;
    return this;
  }

  public GetCharactersCharacterIdMailLabelsOk addLabelsItem(GetCharactersCharacterIdMailLabelsLabel labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<GetCharactersCharacterIdMailLabelsLabel>();
    }
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * labels array
   *
   * @return labels
   **/
  @ApiModelProperty(value = "labels array")

  @Valid
  @Size(max = 30)
  public List<GetCharactersCharacterIdMailLabelsLabel> getLabels() {
    return labels;
  }

  public void setLabels(List<GetCharactersCharacterIdMailLabelsLabel> labels) {
    this.labels = labels;
  }

  public GetCharactersCharacterIdMailLabelsOk totalUnreadCount(Integer totalUnreadCount) {
    this.totalUnreadCount = totalUnreadCount;
    return this;
  }

  /**
   * total_unread_count integer
   * minimum: 0
   *
   * @return totalUnreadCount
   **/
  @ApiModelProperty(value = "total_unread_count integer")

  @Min(0)
  public Integer getTotalUnreadCount() {
    return totalUnreadCount;
  }

  public void setTotalUnreadCount(Integer totalUnreadCount) {
    this.totalUnreadCount = totalUnreadCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdMailLabelsOk getCharactersCharacterIdMailLabelsOk = (GetCharactersCharacterIdMailLabelsOk) o;
    return Objects.equals(this.labels, getCharactersCharacterIdMailLabelsOk.labels) &&
        Objects.equals(this.totalUnreadCount, getCharactersCharacterIdMailLabelsOk.totalUnreadCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels, totalUnreadCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdMailLabelsOk {\n");

    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    totalUnreadCount: ").append(toIndentedString(totalUnreadCount)).append("\n");
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

