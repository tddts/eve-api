package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * isk object
 */
@ApiModel(description = "isk object")
@Validated
public class GetCharactersCharacterIdStatsIsk {
  @JsonProperty("in")
  private Long in = null;

  @JsonProperty("out")
  private Long out = null;

  public GetCharactersCharacterIdStatsIsk in(Long in) {
    this.in = in;
    return this;
  }

  /**
   * in integer
   *
   * @return in
   **/
  @ApiModelProperty(value = "in integer")


  public Long getIn() {
    return in;
  }

  public void setIn(Long in) {
    this.in = in;
  }

  public GetCharactersCharacterIdStatsIsk out(Long out) {
    this.out = out;
    return this;
  }

  /**
   * out integer
   *
   * @return out
   **/
  @ApiModelProperty(value = "out integer")


  public Long getOut() {
    return out;
  }

  public void setOut(Long out) {
    this.out = out;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdStatsIsk getCharactersCharacterIdStatsIsk = (GetCharactersCharacterIdStatsIsk) o;
    return Objects.equals(this.in, getCharactersCharacterIdStatsIsk.in) &&
        Objects.equals(this.out, getCharactersCharacterIdStatsIsk.out);
  }

  @Override
  public int hashCode() {
    return Objects.hash(in, out);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdStatsIsk {\n");

    sb.append("    in: ").append(toIndentedString(in)).append("\n");
    sb.append("    out: ").append(toIndentedString(out)).append("\n");
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

