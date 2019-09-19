package com.github.tddts.eve.model.corporations;

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
public class GetCorporationsCorporationIdKillmailsRecent200Ok {
  @JsonProperty("killmail_hash")
  private String killmailHash = null;

  @JsonProperty("killmail_id")
  private Integer killmailId = null;

  public GetCorporationsCorporationIdKillmailsRecent200Ok killmailHash(String killmailHash) {
    this.killmailHash = killmailHash;
    return this;
  }

  /**
   * A hash of this killmail
   *
   * @return killmailHash
   **/
  @ApiModelProperty(required = true, value = "A hash of this killmail")
  @NotNull


  public String getKillmailHash() {
    return killmailHash;
  }

  public void setKillmailHash(String killmailHash) {
    this.killmailHash = killmailHash;
  }

  public GetCorporationsCorporationIdKillmailsRecent200Ok killmailId(Integer killmailId) {
    this.killmailId = killmailId;
    return this;
  }

  /**
   * ID of this killmail
   *
   * @return killmailId
   **/
  @ApiModelProperty(required = true, value = "ID of this killmail")
  @NotNull


  public Integer getKillmailId() {
    return killmailId;
  }

  public void setKillmailId(Integer killmailId) {
    this.killmailId = killmailId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdKillmailsRecent200Ok getCorporationsCorporationIdKillmailsRecent200Ok = (GetCorporationsCorporationIdKillmailsRecent200Ok) o;
    return Objects.equals(this.killmailHash, getCorporationsCorporationIdKillmailsRecent200Ok.killmailHash) &&
        Objects.equals(this.killmailId, getCorporationsCorporationIdKillmailsRecent200Ok.killmailId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(killmailHash, killmailId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdKillmailsRecent200Ok {\n");

    sb.append("    killmailHash: ").append(toIndentedString(killmailHash)).append("\n");
    sb.append("    killmailId: ").append(toIndentedString(killmailId)).append("\n");
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

