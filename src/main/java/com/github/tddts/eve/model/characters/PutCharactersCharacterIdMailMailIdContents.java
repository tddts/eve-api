package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * contents object
 */
@ApiModel(description = "contents object")
@Validated
public class PutCharactersCharacterIdMailMailIdContents {
  @JsonProperty("labels")
  @Valid
  private List<Integer> labels = null;

  @JsonProperty("read")
  private Boolean read = null;

  public PutCharactersCharacterIdMailMailIdContents labels(List<Integer> labels) {
    this.labels = labels;
    return this;
  }

  public PutCharactersCharacterIdMailMailIdContents addLabelsItem(Integer labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<Integer>();
    }
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * Labels to assign to the mail. Pre-existing labels are unassigned.
   *
   * @return labels
   **/
  @ApiModelProperty(value = "Labels to assign to the mail. Pre-existing labels are unassigned.")

  @Size(max = 25)
  public List<Integer> getLabels() {
    return labels;
  }

  public void setLabels(List<Integer> labels) {
    this.labels = labels;
  }

  public PutCharactersCharacterIdMailMailIdContents read(Boolean read) {
    this.read = read;
    return this;
  }

  /**
   * Whether the mail is flagged as read
   *
   * @return read
   **/
  @ApiModelProperty(value = "Whether the mail is flagged as read")


  public Boolean isRead() {
    return read;
  }

  public void setRead(Boolean read) {
    this.read = read;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutCharactersCharacterIdMailMailIdContents putCharactersCharacterIdMailMailIdContents = (PutCharactersCharacterIdMailMailIdContents) o;
    return Objects.equals(this.labels, putCharactersCharacterIdMailMailIdContents.labels) &&
        Objects.equals(this.read, putCharactersCharacterIdMailMailIdContents.read);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels, read);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutCharactersCharacterIdMailMailIdContents {\n");

    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
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

