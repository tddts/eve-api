package com.github.tddts.eve.model.alliance;

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
public class GetAlliancesAllianceIdContactsLabels200Ok {
  @JsonProperty("label_id")
  private Long labelId = null;

  @JsonProperty("label_name")
  private String labelName = null;

  public GetAlliancesAllianceIdContactsLabels200Ok labelId(Long labelId) {
    this.labelId = labelId;
    return this;
  }

  /**
   * label_id integer
   *
   * @return labelId
   **/
  @ApiModelProperty(required = true, value = "label_id integer")
  @NotNull


  public Long getLabelId() {
    return labelId;
  }

  public void setLabelId(Long labelId) {
    this.labelId = labelId;
  }

  public GetAlliancesAllianceIdContactsLabels200Ok labelName(String labelName) {
    this.labelName = labelName;
    return this;
  }

  /**
   * label_name string
   *
   * @return labelName
   **/
  @ApiModelProperty(required = true, value = "label_name string")
  @NotNull


  public String getLabelName() {
    return labelName;
  }

  public void setLabelName(String labelName) {
    this.labelName = labelName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAlliancesAllianceIdContactsLabels200Ok getAlliancesAllianceIdContactsLabels200Ok = (GetAlliancesAllianceIdContactsLabels200Ok) o;
    return Objects.equals(this.labelId, getAlliancesAllianceIdContactsLabels200Ok.labelId) &&
        Objects.equals(this.labelName, getAlliancesAllianceIdContactsLabels200Ok.labelName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelId, labelName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAlliancesAllianceIdContactsLabels200Ok {\n");

    sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
    sb.append("    labelName: ").append(toIndentedString(labelName)).append("\n");
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

