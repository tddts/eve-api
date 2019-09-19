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
public class GetCharactersCharacterIdMailMailIdOk {
  @JsonProperty("body")
  private String body = null;

  @JsonProperty("from")
  private Integer from = null;

  @JsonProperty("labels")
  @Valid
  private List<Integer> labels = null;

  @JsonProperty("read")
  private Boolean read = null;

  @JsonProperty("recipients")
  @Valid
  private List<GetCharactersCharacterIdMailMailIdRecipient> recipients = null;

  @JsonProperty("subject")
  private String subject = null;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;

  public GetCharactersCharacterIdMailMailIdOk body(String body) {
    this.body = body;
    return this;
  }

  /**
   * Mail's body
   *
   * @return body
   **/
  @ApiModelProperty(value = "Mail's body")


  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public GetCharactersCharacterIdMailMailIdOk from(Integer from) {
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

  public GetCharactersCharacterIdMailMailIdOk labels(List<Integer> labels) {
    this.labels = labels;
    return this;
  }

  public GetCharactersCharacterIdMailMailIdOk addLabelsItem(Integer labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<Integer>();
    }
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * Labels attached to the mail
   *
   * @return labels
   **/
  @ApiModelProperty(value = "Labels attached to the mail")

  @Size(max = 25)
  public List<Integer> getLabels() {
    return labels;
  }

  public void setLabels(List<Integer> labels) {
    this.labels = labels;
  }

  public GetCharactersCharacterIdMailMailIdOk read(Boolean read) {
    this.read = read;
    return this;
  }

  /**
   * Whether the mail is flagged as read
   *
   * @return read
   **/
  @ApiModelProperty(value = "Whether the mail is flagged as read")


  public Boolean isRead() {
    return read;
  }

  public void setRead(Boolean read) {
    this.read = read;
  }

  public GetCharactersCharacterIdMailMailIdOk recipients(List<GetCharactersCharacterIdMailMailIdRecipient> recipients) {
    this.recipients = recipients;
    return this;
  }

  public GetCharactersCharacterIdMailMailIdOk addRecipientsItem(GetCharactersCharacterIdMailMailIdRecipient recipientsItem) {
    if (this.recipients == null) {
      this.recipients = new ArrayList<GetCharactersCharacterIdMailMailIdRecipient>();
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
  public List<GetCharactersCharacterIdMailMailIdRecipient> getRecipients() {
    return recipients;
  }

  public void setRecipients(List<GetCharactersCharacterIdMailMailIdRecipient> recipients) {
    this.recipients = recipients;
  }

  public GetCharactersCharacterIdMailMailIdOk subject(String subject) {
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

  public GetCharactersCharacterIdMailMailIdOk timestamp(OffsetDateTime timestamp) {
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
    GetCharactersCharacterIdMailMailIdOk getCharactersCharacterIdMailMailIdOk = (GetCharactersCharacterIdMailMailIdOk) o;
    return Objects.equals(this.body, getCharactersCharacterIdMailMailIdOk.body) &&
        Objects.equals(this.from, getCharactersCharacterIdMailMailIdOk.from) &&
        Objects.equals(this.labels, getCharactersCharacterIdMailMailIdOk.labels) &&
        Objects.equals(this.read, getCharactersCharacterIdMailMailIdOk.read) &&
        Objects.equals(this.recipients, getCharactersCharacterIdMailMailIdOk.recipients) &&
        Objects.equals(this.subject, getCharactersCharacterIdMailMailIdOk.subject) &&
        Objects.equals(this.timestamp, getCharactersCharacterIdMailMailIdOk.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, from, labels, read, recipients, subject, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdMailMailIdOk {\n");

    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
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

