package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@Validated
public class GetCharactersCharacterIdMail200Ok {
  @JsonProperty("from")
  private Integer from = null;

  @JsonProperty("is_read")
  private Boolean isRead = null;

  @JsonProperty("labels")
  @Valid
  private List<Integer> labels = null;

  @JsonProperty("mail_id")
  private Integer mailId = null;

  @JsonProperty("recipients")
  @Valid
  private List<GetCharactersCharacterIdMailRecipient> recipients = null;

  @JsonProperty("subject")
  private String subject = null;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;

  public GetCharactersCharacterIdMail200Ok from(Integer from) {
    this.from = from;
    return this;
  }

  /**
   * From whom the mail was sent
   *
   * @return from
   **/
  @ApiModelProperty(value = "From whom the mail was sent")


  public Integer getFrom() {
    return from;
  }

  public void setFrom(Integer from) {
    this.from = from;
  }

  public GetCharactersCharacterIdMail200Ok isRead(Boolean isRead) {
    this.isRead = isRead;
    return this;
  }

  /**
   * is_read boolean
   *
   * @return isRead
   **/
  @ApiModelProperty(value = "is_read boolean")


  public Boolean isIsRead() {
    return isRead;
  }

  public void setIsRead(Boolean isRead) {
    this.isRead = isRead;
  }

  public GetCharactersCharacterIdMail200Ok labels(List<Integer> labels) {
    this.labels = labels;
    return this;
  }

  public GetCharactersCharacterIdMail200Ok addLabelsItem(Integer labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<Integer>();
    }
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * labels array
   *
   * @return labels
   **/
  @ApiModelProperty(value = "labels array")

  @Size(max = 25)
  public List<Integer> getLabels() {
    return labels;
  }

  public void setLabels(List<Integer> labels) {
    this.labels = labels;
  }

  public GetCharactersCharacterIdMail200Ok mailId(Integer mailId) {
    this.mailId = mailId;
    return this;
  }

  /**
   * mail_id integer
   *
   * @return mailId
   **/
  @ApiModelProperty(value = "mail_id integer")


  public Integer getMailId() {
    return mailId;
  }

  public void setMailId(Integer mailId) {
    this.mailId = mailId;
  }

  public GetCharactersCharacterIdMail200Ok recipients(List<GetCharactersCharacterIdMailRecipient> recipients) {
    this.recipients = recipients;
    return this;
  }

  public GetCharactersCharacterIdMail200Ok addRecipientsItem(GetCharactersCharacterIdMailRecipient recipientsItem) {
    if (this.recipients == null) {
      this.recipients = new ArrayList<GetCharactersCharacterIdMailRecipient>();
    }
    this.recipients.add(recipientsItem);
    return this;
  }

  /**
   * Recipients of the mail
   *
   * @return recipients
   **/
  @ApiModelProperty(value = "Recipients of the mail")

  @Valid
  @Size(min = 1, max = 52)
  public List<GetCharactersCharacterIdMailRecipient> getRecipients() {
    return recipients;
  }

  public void setRecipients(List<GetCharactersCharacterIdMailRecipient> recipients) {
    this.recipients = recipients;
  }

  public GetCharactersCharacterIdMail200Ok subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Mail subject
   *
   * @return subject
   **/
  @ApiModelProperty(value = "Mail subject")


  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public GetCharactersCharacterIdMail200Ok timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * When the mail was sent
   *
   * @return timestamp
   **/
  @ApiModelProperty(value = "When the mail was sent")

  @Valid

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdMail200Ok getCharactersCharacterIdMail200Ok = (GetCharactersCharacterIdMail200Ok) o;
    return Objects.equals(this.from, getCharactersCharacterIdMail200Ok.from) &&
        Objects.equals(this.isRead, getCharactersCharacterIdMail200Ok.isRead) &&
        Objects.equals(this.labels, getCharactersCharacterIdMail200Ok.labels) &&
        Objects.equals(this.mailId, getCharactersCharacterIdMail200Ok.mailId) &&
        Objects.equals(this.recipients, getCharactersCharacterIdMail200Ok.recipients) &&
        Objects.equals(this.subject, getCharactersCharacterIdMail200Ok.subject) &&
        Objects.equals(this.timestamp, getCharactersCharacterIdMail200Ok.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, isRead, labels, mailId, recipients, subject, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdMail200Ok {\n");

    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    isRead: ").append(toIndentedString(isRead)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    mailId: ").append(toIndentedString(mailId)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

