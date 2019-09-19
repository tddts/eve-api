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
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@Validated
public class GetCorporationsCorporationIdShareholders200Ok {
  @JsonProperty("share_count")
  private Long shareCount = null;

  @JsonProperty("shareholder_id")
  private Integer shareholderId = null;

  /**
   * shareholder_type string
   */
  public enum ShareholderTypeEnum {
    CHARACTER("character"),

    CORPORATION("corporation");

    private String value;

    ShareholderTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ShareholderTypeEnum fromValue(String text) {
      for (ShareholderTypeEnum b : ShareholderTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("shareholder_type")
  private ShareholderTypeEnum shareholderType = null;

  public GetCorporationsCorporationIdShareholders200Ok shareCount(Long shareCount) {
    this.shareCount = shareCount;
    return this;
  }

  /**
   * share_count integer
   *
   * @return shareCount
   **/
  @ApiModelProperty(required = true, value = "share_count integer")
  @NotNull


  public Long getShareCount() {
    return shareCount;
  }

  public void setShareCount(Long shareCount) {
    this.shareCount = shareCount;
  }

  public GetCorporationsCorporationIdShareholders200Ok shareholderId(Integer shareholderId) {
    this.shareholderId = shareholderId;
    return this;
  }

  /**
   * shareholder_id integer
   *
   * @return shareholderId
   **/
  @ApiModelProperty(required = true, value = "shareholder_id integer")
  @NotNull


  public Integer getShareholderId() {
    return shareholderId;
  }

  public void setShareholderId(Integer shareholderId) {
    this.shareholderId = shareholderId;
  }

  public GetCorporationsCorporationIdShareholders200Ok shareholderType(ShareholderTypeEnum shareholderType) {
    this.shareholderType = shareholderType;
    return this;
  }

  /**
   * shareholder_type string
   *
   * @return shareholderType
   **/
  @ApiModelProperty(required = true, value = "shareholder_type string")
  @NotNull


  public ShareholderTypeEnum getShareholderType() {
    return shareholderType;
  }

  public void setShareholderType(ShareholderTypeEnum shareholderType) {
    this.shareholderType = shareholderType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdShareholders200Ok getCorporationsCorporationIdShareholders200Ok = (GetCorporationsCorporationIdShareholders200Ok) o;
    return Objects.equals(this.shareCount, getCorporationsCorporationIdShareholders200Ok.shareCount) &&
        Objects.equals(this.shareholderId, getCorporationsCorporationIdShareholders200Ok.shareholderId) &&
        Objects.equals(this.shareholderType, getCorporationsCorporationIdShareholders200Ok.shareholderType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shareCount, shareholderId, shareholderType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdShareholders200Ok {\n");

    sb.append("    shareCount: ").append(toIndentedString(shareCount)).append("\n");
    sb.append("    shareholderId: ").append(toIndentedString(shareholderId)).append("\n");
    sb.append("    shareholderType: ").append(toIndentedString(shareholderType)).append("\n");
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

