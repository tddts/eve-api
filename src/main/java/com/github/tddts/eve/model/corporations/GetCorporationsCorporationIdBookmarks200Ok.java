package com.github.tddts.eve.model.corporations;

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
public class GetCorporationsCorporationIdBookmarks200Ok {
  @JsonProperty("bookmark_id")
  private Integer bookmarkId = null;

  @JsonProperty("coordinates")
  private GetCorporationsCorporationIdBookmarksCoordinates coordinates = null;

  @JsonProperty("created")
  private OffsetDateTime created = null;

  @JsonProperty("creator_id")
  private Integer creatorId = null;

  @JsonProperty("folder_id")
  private Integer folderId = null;

  @JsonProperty("item")
  private GetCorporationsCorporationIdBookmarksItem item = null;

  @JsonProperty("label")
  private String label = null;

  @JsonProperty("location_id")
  private Integer locationId = null;

  @JsonProperty("notes")
  private String notes = null;

  public GetCorporationsCorporationIdBookmarks200Ok bookmarkId(Integer bookmarkId) {
    this.bookmarkId = bookmarkId;
    return this;
  }

  /**
   * bookmark_id integer
   *
   * @return bookmarkId
   **/
  @ApiModelProperty(required = true, value = "bookmark_id integer")
  @NotNull


  public Integer getBookmarkId() {
    return bookmarkId;
  }

  public void setBookmarkId(Integer bookmarkId) {
    this.bookmarkId = bookmarkId;
  }

  public GetCorporationsCorporationIdBookmarks200Ok coordinates(GetCorporationsCorporationIdBookmarksCoordinates coordinates) {
    this.coordinates = coordinates;
    return this;
  }

  /**
   * Get coordinates
   *
   * @return coordinates
   **/
  @ApiModelProperty(value = "")

  @Valid

  public GetCorporationsCorporationIdBookmarksCoordinates getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(GetCorporationsCorporationIdBookmarksCoordinates coordinates) {
    this.coordinates = coordinates;
  }

  public GetCorporationsCorporationIdBookmarks200Ok created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * created string
   *
   * @return created
   **/
  @ApiModelProperty(required = true, value = "created string")
  @NotNull

  @Valid

  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public GetCorporationsCorporationIdBookmarks200Ok creatorId(Integer creatorId) {
    this.creatorId = creatorId;
    return this;
  }

  /**
   * creator_id integer
   *
   * @return creatorId
   **/
  @ApiModelProperty(required = true, value = "creator_id integer")
  @NotNull


  public Integer getCreatorId() {
    return creatorId;
  }

  public void setCreatorId(Integer creatorId) {
    this.creatorId = creatorId;
  }

  public GetCorporationsCorporationIdBookmarks200Ok folderId(Integer folderId) {
    this.folderId = folderId;
    return this;
  }

  /**
   * folder_id integer
   *
   * @return folderId
   **/
  @ApiModelProperty(value = "folder_id integer")


  public Integer getFolderId() {
    return folderId;
  }

  public void setFolderId(Integer folderId) {
    this.folderId = folderId;
  }

  public GetCorporationsCorporationIdBookmarks200Ok item(GetCorporationsCorporationIdBookmarksItem item) {
    this.item = item;
    return this;
  }

  /**
   * Get item
   *
   * @return item
   **/
  @ApiModelProperty(value = "")

  @Valid

  public GetCorporationsCorporationIdBookmarksItem getItem() {
    return item;
  }

  public void setItem(GetCorporationsCorporationIdBookmarksItem item) {
    this.item = item;
  }

  public GetCorporationsCorporationIdBookmarks200Ok label(String label) {
    this.label = label;
    return this;
  }

  /**
   * label string
   *
   * @return label
   **/
  @ApiModelProperty(required = true, value = "label string")
  @NotNull


  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public GetCorporationsCorporationIdBookmarks200Ok locationId(Integer locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * location_id integer
   *
   * @return locationId
   **/
  @ApiModelProperty(required = true, value = "location_id integer")
  @NotNull


  public Integer getLocationId() {
    return locationId;
  }

  public void setLocationId(Integer locationId) {
    this.locationId = locationId;
  }

  public GetCorporationsCorporationIdBookmarks200Ok notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * notes string
   *
   * @return notes
   **/
  @ApiModelProperty(required = true, value = "notes string")
  @NotNull


  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdBookmarks200Ok getCorporationsCorporationIdBookmarks200Ok = (GetCorporationsCorporationIdBookmarks200Ok) o;
    return Objects.equals(this.bookmarkId, getCorporationsCorporationIdBookmarks200Ok.bookmarkId) &&
        Objects.equals(this.coordinates, getCorporationsCorporationIdBookmarks200Ok.coordinates) &&
        Objects.equals(this.created, getCorporationsCorporationIdBookmarks200Ok.created) &&
        Objects.equals(this.creatorId, getCorporationsCorporationIdBookmarks200Ok.creatorId) &&
        Objects.equals(this.folderId, getCorporationsCorporationIdBookmarks200Ok.folderId) &&
        Objects.equals(this.item, getCorporationsCorporationIdBookmarks200Ok.item) &&
        Objects.equals(this.label, getCorporationsCorporationIdBookmarks200Ok.label) &&
        Objects.equals(this.locationId, getCorporationsCorporationIdBookmarks200Ok.locationId) &&
        Objects.equals(this.notes, getCorporationsCorporationIdBookmarks200Ok.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookmarkId, coordinates, created, creatorId, folderId, item, label, locationId, notes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdBookmarks200Ok {\n");

    sb.append("    bookmarkId: ").append(toIndentedString(bookmarkId)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

