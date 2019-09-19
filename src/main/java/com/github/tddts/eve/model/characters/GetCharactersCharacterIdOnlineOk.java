package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@Validated
public class GetCharactersCharacterIdOnlineOk {
  @JsonProperty("last_login")
  private OffsetDateTime lastLogin = null;

  @JsonProperty("last_logout")
  private OffsetDateTime lastLogout = null;

  @JsonProperty("logins")
  private Integer logins = null;

  @JsonProperty("online")
  private Boolean online = null;

  public GetCharactersCharacterIdOnlineOk lastLogin(OffsetDateTime lastLogin) {
    this.lastLogin = lastLogin;
    return this;
  }

  /**
   * Timestamp of the last login
   *
   * @return lastLogin
   **/
  @ApiModelProperty(value = "Timestamp of the last login")

  @Valid

  public OffsetDateTime getLastLogin() {
    return lastLogin;
  }

  public void setLastLogin(OffsetDateTime lastLogin) {
    this.lastLogin = lastLogin;
  }

  public GetCharactersCharacterIdOnlineOk lastLogout(OffsetDateTime lastLogout) {
    this.lastLogout = lastLogout;
    return this;
  }

  /**
   * Timestamp of the last logout
   *
   * @return lastLogout
   **/
  @ApiModelProperty(value = "Timestamp of the last logout")

  @Valid

  public OffsetDateTime getLastLogout() {
    return lastLogout;
  }

  public void setLastLogout(OffsetDateTime lastLogout) {
    this.lastLogout = lastLogout;
  }

  public GetCharactersCharacterIdOnlineOk logins(Integer logins) {
    this.logins = logins;
    return this;
  }

  /**
   * Total number of times the character has logged in
   *
   * @return logins
   **/
  @ApiModelProperty(value = "Total number of times the character has logged in")


  public Integer getLogins() {
    return logins;
  }

  public void setLogins(Integer logins) {
    this.logins = logins;
  }

  public GetCharactersCharacterIdOnlineOk online(Boolean online) {
    this.online = online;
    return this;
  }

  /**
   * If the character is online
   *
   * @return online
   **/
  @ApiModelProperty(required = true, value = "If the character is online")
  @NotNull


  public Boolean isOnline() {
    return online;
  }

  public void setOnline(Boolean online) {
    this.online = online;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdOnlineOk getCharactersCharacterIdOnlineOk = (GetCharactersCharacterIdOnlineOk) o;
    return Objects.equals(this.lastLogin, getCharactersCharacterIdOnlineOk.lastLogin) &&
        Objects.equals(this.lastLogout, getCharactersCharacterIdOnlineOk.lastLogout) &&
        Objects.equals(this.logins, getCharactersCharacterIdOnlineOk.logins) &&
        Objects.equals(this.online, getCharactersCharacterIdOnlineOk.online);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastLogin, lastLogout, logins, online);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdOnlineOk {\n");

    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    lastLogout: ").append(toIndentedString(lastLogout)).append("\n");
    sb.append("    logins: ").append(toIndentedString(logins)).append("\n");
    sb.append("    online: ").append(toIndentedString(online)).append("\n");
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

