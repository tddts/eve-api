package com.github.tddts.eve.model.corporations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * service object
 */
@ApiModel(description = "service object")
@Validated
public class GetCorporationsCorporationIdStructuresService {
  @JsonProperty("name")
  private String name = null;

  /**
   * state string
   */
  public enum StateEnum {
    ONLINE("online"),

    OFFLINE("offline"),

    CLEANUP("cleanup");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("state")
  private StateEnum state = null;

  public GetCorporationsCorporationIdStructuresService name(String name) {
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

  public GetCorporationsCorporationIdStructuresService state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * state string
   *
   * @return state
   **/
  @ApiModelProperty(required = true, value = "state string")
  @NotNull


  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdStructuresService getCorporationsCorporationIdStructuresService = (GetCorporationsCorporationIdStructuresService) o;
    return Objects.equals(this.name, getCorporationsCorporationIdStructuresService.name) &&
        Objects.equals(this.state, getCorporationsCorporationIdStructuresService.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdStructuresService {\n");

    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

