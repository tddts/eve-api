package com.github.tddts.eve.model.industry;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * cost_indice object
 */
@ApiModel(description = "cost_indice object")
@Validated
public class GetIndustrySystemsCostIndice {
  /**
   * activity string
   */
  public enum ActivityEnum {
    COPYING("copying"),

    DUPLICATING("duplicating"),

    INVENTION("invention"),

    MANUFACTURING("manufacturing"),

    NONE("none"),

    REACTION("reaction"),

    RESEARCHING_MATERIAL_EFFICIENCY("researching_material_efficiency"),

    RESEARCHING_TECHNOLOGY("researching_technology"),

    RESEARCHING_TIME_EFFICIENCY("researching_time_efficiency"),

    REVERSE_ENGINEERING("reverse_engineering");

    private String value;

    ActivityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ActivityEnum fromValue(String text) {
      for (ActivityEnum b : ActivityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("activity")
  private ActivityEnum activity = null;

  @JsonProperty("cost_index")
  private Float costIndex = null;

  public GetIndustrySystemsCostIndice activity(ActivityEnum activity) {
    this.activity = activity;
    return this;
  }

  /**
   * activity string
   *
   * @return activity
   **/
  @ApiModelProperty(required = true, value = "activity string")
  @NotNull


  public ActivityEnum getActivity() {
    return activity;
  }

  public void setActivity(ActivityEnum activity) {
    this.activity = activity;
  }

  public GetIndustrySystemsCostIndice costIndex(Float costIndex) {
    this.costIndex = costIndex;
    return this;
  }

  /**
   * cost_index number
   *
   * @return costIndex
   **/
  @ApiModelProperty(required = true, value = "cost_index number")
  @NotNull


  public Float getCostIndex() {
    return costIndex;
  }

  public void setCostIndex(Float costIndex) {
    this.costIndex = costIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetIndustrySystemsCostIndice getIndustrySystemsCostIndice = (GetIndustrySystemsCostIndice) o;
    return Objects.equals(this.activity, getIndustrySystemsCostIndice.activity) &&
        Objects.equals(this.costIndex, getIndustrySystemsCostIndice.costIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activity, costIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetIndustrySystemsCostIndice {\n");

    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
    sb.append("    costIndex: ").append(toIndentedString(costIndex)).append("\n");
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

