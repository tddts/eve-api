package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * graphic object
 */
@ApiModel(description = "graphic object")
@Validated
public class GetCharactersCharacterIdMedalsGraphic {
  @JsonProperty("color")
  private Integer color = null;

  @JsonProperty("graphic")
  private String graphic = null;

  @JsonProperty("layer")
  private Integer layer = null;

  @JsonProperty("part")
  private Integer part = null;

  public GetCharactersCharacterIdMedalsGraphic color(Integer color) {
    this.color = color;
    return this;
  }

  /**
   * color integer
   *
   * @return color
   **/
  @ApiModelProperty(value = "color integer")


  public Integer getColor() {
    return color;
  }

  public void setColor(Integer color) {
    this.color = color;
  }

  public GetCharactersCharacterIdMedalsGraphic graphic(String graphic) {
    this.graphic = graphic;
    return this;
  }

  /**
   * graphic string
   *
   * @return graphic
   **/
  @ApiModelProperty(required = true, value = "graphic string")
  @NotNull


  public String getGraphic() {
    return graphic;
  }

  public void setGraphic(String graphic) {
    this.graphic = graphic;
  }

  public GetCharactersCharacterIdMedalsGraphic layer(Integer layer) {
    this.layer = layer;
    return this;
  }

  /**
   * layer integer
   *
   * @return layer
   **/
  @ApiModelProperty(required = true, value = "layer integer")
  @NotNull


  public Integer getLayer() {
    return layer;
  }

  public void setLayer(Integer layer) {
    this.layer = layer;
  }

  public GetCharactersCharacterIdMedalsGraphic part(Integer part) {
    this.part = part;
    return this;
  }

  /**
   * part integer
   *
   * @return part
   **/
  @ApiModelProperty(required = true, value = "part integer")
  @NotNull


  public Integer getPart() {
    return part;
  }

  public void setPart(Integer part) {
    this.part = part;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdMedalsGraphic getCharactersCharacterIdMedalsGraphic = (GetCharactersCharacterIdMedalsGraphic) o;
    return Objects.equals(this.color, getCharactersCharacterIdMedalsGraphic.color) &&
        Objects.equals(this.graphic, getCharactersCharacterIdMedalsGraphic.graphic) &&
        Objects.equals(this.layer, getCharactersCharacterIdMedalsGraphic.layer) &&
        Objects.equals(this.part, getCharactersCharacterIdMedalsGraphic.part);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, graphic, layer, part);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdMedalsGraphic {\n");

    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    graphic: ").append(toIndentedString(graphic)).append("\n");
    sb.append("    layer: ").append(toIndentedString(layer)).append("\n");
    sb.append("    part: ").append(toIndentedString(part)).append("\n");
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

