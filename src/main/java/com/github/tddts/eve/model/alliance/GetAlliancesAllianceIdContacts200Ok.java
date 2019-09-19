package com.github.tddts.eve.model.alliance;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@Validated
public class GetAlliancesAllianceIdContacts200Ok {
  @JsonProperty("contact_id")
  private Integer contactId = null;

  /**
   * contact_type string
   */
  public enum ContactTypeEnum {
    CHARACTER("character"),

    CORPORATION("corporation"),

    ALLIANCE("alliance"),

    FACTION("faction");

    private String value;

    ContactTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ContactTypeEnum fromValue(String text) {
      for (ContactTypeEnum b : ContactTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("contact_type")
  private ContactTypeEnum contactType = null;

  @JsonProperty("label_ids")
  @Valid
  private List<Long> labelIds = null;

  @JsonProperty("standing")
  private Float standing = null;

  public GetAlliancesAllianceIdContacts200Ok contactId(Integer contactId) {
    this.contactId = contactId;
    return this;
  }

  /**
   * contact_id integer
   *
   * @return contactId
   **/
  @ApiModelProperty(required = true, value = "contact_id integer")
  @NotNull


  public Integer getContactId() {
    return contactId;
  }

  public void setContactId(Integer contactId) {
    this.contactId = contactId;
  }

  public GetAlliancesAllianceIdContacts200Ok contactType(ContactTypeEnum contactType) {
    this.contactType = contactType;
    return this;
  }

  /**
   * contact_type string
   *
   * @return contactType
   **/
  @ApiModelProperty(required = true, value = "contact_type string")
  @NotNull


  public ContactTypeEnum getContactType() {
    return contactType;
  }

  public void setContactType(ContactTypeEnum contactType) {
    this.contactType = contactType;
  }

  public GetAlliancesAllianceIdContacts200Ok labelIds(List<Long> labelIds) {
    this.labelIds = labelIds;
    return this;
  }

  public GetAlliancesAllianceIdContacts200Ok addLabelIdsItem(Long labelIdsItem) {
    if (this.labelIds == null) {
      this.labelIds = new ArrayList<Long>();
    }
    this.labelIds.add(labelIdsItem);
    return this;
  }

  /**
   * label_ids array
   *
   * @return labelIds
   **/
  @ApiModelProperty(value = "label_ids array")

  @Size(max = 63)
  public List<Long> getLabelIds() {
    return labelIds;
  }

  public void setLabelIds(List<Long> labelIds) {
    this.labelIds = labelIds;
  }

  public GetAlliancesAllianceIdContacts200Ok standing(Float standing) {
    this.standing = standing;
    return this;
  }

  /**
   * Standing of the contact
   *
   * @return standing
   **/
  @ApiModelProperty(required = true, value = "Standing of the contact")
  @NotNull


  public Float getStanding() {
    return standing;
  }

  public void setStanding(Float standing) {
    this.standing = standing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAlliancesAllianceIdContacts200Ok getAlliancesAllianceIdContacts200Ok = (GetAlliancesAllianceIdContacts200Ok) o;
    return Objects.equals(this.contactId, getAlliancesAllianceIdContacts200Ok.contactId) &&
        Objects.equals(this.contactType, getAlliancesAllianceIdContacts200Ok.contactType) &&
        Objects.equals(this.labelIds, getAlliancesAllianceIdContacts200Ok.labelIds) &&
        Objects.equals(this.standing, getAlliancesAllianceIdContacts200Ok.standing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactId, contactType, labelIds, standing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAlliancesAllianceIdContacts200Ok {\n");

    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    contactType: ").append(toIndentedString(contactType)).append("\n");
    sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
    sb.append("    standing: ").append(toIndentedString(standing)).append("\n");
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

