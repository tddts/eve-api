package com.github.tddts.eve.model.ui;

import com.fasterxml.jackson.annotation.JsonProperty;
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
 * new_mail object
 */
@ApiModel(description = "new_mail object")
@Validated
public class PostUiOpenwindowNewmailNewMail {
  @JsonProperty("body")
  private String body = null;

  @JsonProperty("recipients")
  @Valid
  private List<Integer> recipients = new ArrayList<Integer>();

  @JsonProperty("subject")
  private String subject = null;

  @JsonProperty("to_corp_or_alliance_id")
  private Integer toCorpOrAllianceId = null;

  @JsonProperty("to_mailing_list_id")
  private Integer toMailingListId = null;

  public PostUiOpenwindowNewmailNewMail body(String body) {
    this.body = body;
    return this;
  }

  /**
   * body string
   *
   * @return body
   **/
  @ApiModelProperty(required = true, value = "body string")
  @NotNull

  @Size(max = 10000)
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public PostUiOpenwindowNewmailNewMail recipients(List<Integer> recipients) {
    this.recipients = recipients;
    return this;
  }

  public PostUiOpenwindowNewmailNewMail addRecipientsItem(Integer recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

  /**
   * recipients array
   *
   * @return recipients
   **/
  @ApiModelProperty(required = true, value = "recipients array")
  @NotNull

  @Size(min = 1, max = 50)
  public List<Integer> getRecipients() {
    return recipients;
  }

  public void setRecipients(List<Integer> recipients) {
    this.recipients = recipients;
  }

  public PostUiOpenwindowNewmailNewMail subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * subject string
   *
   * @return subject
   **/
  @ApiModelProperty(required = true, value = "subject string")
  @NotNull

  @Size(max = 1000)
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public PostUiOpenwindowNewmailNewMail toCorpOrAllianceId(Integer toCorpOrAllianceId) {
    this.toCorpOrAllianceId = toCorpOrAllianceId;
    return this;
  }

  /**
   * to_corp_or_alliance_id integer
   *
   * @return toCorpOrAllianceId
   **/
  @ApiModelProperty(value = "to_corp_or_alliance_id integer")


  public Integer getToCorpOrAllianceId() {
    return toCorpOrAllianceId;
  }

  public void setToCorpOrAllianceId(Integer toCorpOrAllianceId) {
    this.toCorpOrAllianceId = toCorpOrAllianceId;
  }

  public PostUiOpenwindowNewmailNewMail toMailingListId(Integer toMailingListId) {
    this.toMailingListId = toMailingListId;
    return this;
  }

  /**
   * Corporations, alliances and mailing lists are all types of mailing groups. You may only send to one mailing group, at a time, so you may fill out either this field or the to_corp_or_alliance_ids field
   *
   * @return toMailingListId
   **/
  @ApiModelProperty(value = "Corporations, alliances and mailing lists are all types of mailing groups. You may only send to one mailing group, at a time, so you may fill out either this field or the to_corp_or_alliance_ids field")


  public Integer getToMailingListId() {
    return toMailingListId;
  }

  public void setToMailingListId(Integer toMailingListId) {
    this.toMailingListId = toMailingListId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostUiOpenwindowNewmailNewMail postUiOpenwindowNewmailNewMail = (PostUiOpenwindowNewmailNewMail) o;
    return Objects.equals(this.body, postUiOpenwindowNewmailNewMail.body) &&
        Objects.equals(this.recipients, postUiOpenwindowNewmailNewMail.recipients) &&
        Objects.equals(this.subject, postUiOpenwindowNewmailNewMail.subject) &&
        Objects.equals(this.toCorpOrAllianceId, postUiOpenwindowNewmailNewMail.toCorpOrAllianceId) &&
        Objects.equals(this.toMailingListId, postUiOpenwindowNewmailNewMail.toMailingListId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, recipients, subject, toCorpOrAllianceId, toMailingListId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostUiOpenwindowNewmailNewMail {\n");

    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    toCorpOrAllianceId: ").append(toIndentedString(toCorpOrAllianceId)).append("\n");
    sb.append("    toMailingListId: ").append(toIndentedString(toMailingListId)).append("\n");
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

