package com.github.tddts.eve.model.killmail;

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
 * victim object
 */
@ApiModel(description = "victim object")
@Validated
public class GetKillmailsKillmailIdKillmailHashVictim {
  @JsonProperty("alliance_id")
  private Integer allianceId = null;

  @JsonProperty("character_id")
  private Integer characterId = null;

  @JsonProperty("corporation_id")
  private Integer corporationId = null;

  @JsonProperty("damage_taken")
  private Integer damageTaken = null;

  @JsonProperty("faction_id")
  private Integer factionId = null;

  @JsonProperty("items")
  @Valid
  private List<GetKillmailsKillmailIdKillmailHashItem> items = null;

  @JsonProperty("position")
  private GetKillmailsKillmailIdKillmailHashPosition position = null;

  @JsonProperty("ship_type_id")
  private Integer shipTypeId = null;

  public GetKillmailsKillmailIdKillmailHashVictim allianceId(Integer allianceId) {
    this.allianceId = allianceId;
    return this;
  }

  /**
   * alliance_id integer
   *
   * @return allianceId
   **/
  @ApiModelProperty(value = "alliance_id integer")


  public Integer getAllianceId() {
    return allianceId;
  }

  public void setAllianceId(Integer allianceId) {
    this.allianceId = allianceId;
  }

  public GetKillmailsKillmailIdKillmailHashVictim characterId(Integer characterId) {
    this.characterId = characterId;
    return this;
  }

  /**
   * character_id integer
   *
   * @return characterId
   **/
  @ApiModelProperty(value = "character_id integer")


  public Integer getCharacterId() {
    return characterId;
  }

  public void setCharacterId(Integer characterId) {
    this.characterId = characterId;
  }

  public GetKillmailsKillmailIdKillmailHashVictim corporationId(Integer corporationId) {
    this.corporationId = corporationId;
    return this;
  }

  /**
   * corporation_id integer
   *
   * @return corporationId
   **/
  @ApiModelProperty(value = "corporation_id integer")


  public Integer getCorporationId() {
    return corporationId;
  }

  public void setCorporationId(Integer corporationId) {
    this.corporationId = corporationId;
  }

  public GetKillmailsKillmailIdKillmailHashVictim damageTaken(Integer damageTaken) {
    this.damageTaken = damageTaken;
    return this;
  }

  /**
   * How much total damage was taken by the victim
   *
   * @return damageTaken
   **/
  @ApiModelProperty(required = true, value = "How much total damage was taken by the victim ")
  @NotNull


  public Integer getDamageTaken() {
    return damageTaken;
  }

  public void setDamageTaken(Integer damageTaken) {
    this.damageTaken = damageTaken;
  }

  public GetKillmailsKillmailIdKillmailHashVictim factionId(Integer factionId) {
    this.factionId = factionId;
    return this;
  }

  /**
   * faction_id integer
   *
   * @return factionId
   **/
  @ApiModelProperty(value = "faction_id integer")


  public Integer getFactionId() {
    return factionId;
  }

  public void setFactionId(Integer factionId) {
    this.factionId = factionId;
  }

  public GetKillmailsKillmailIdKillmailHashVictim items(List<GetKillmailsKillmailIdKillmailHashItem> items) {
    this.items = items;
    return this;
  }

  public GetKillmailsKillmailIdKillmailHashVictim addItemsItem(GetKillmailsKillmailIdKillmailHashItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<GetKillmailsKillmailIdKillmailHashItem>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * items array
   *
   * @return items
   **/
  @ApiModelProperty(value = "items array")

  @Valid
  @Size(max = 10000)
  public List<GetKillmailsKillmailIdKillmailHashItem> getItems() {
    return items;
  }

  public void setItems(List<GetKillmailsKillmailIdKillmailHashItem> items) {
    this.items = items;
  }

  public GetKillmailsKillmailIdKillmailHashVictim position(GetKillmailsKillmailIdKillmailHashPosition position) {
    this.position = position;
    return this;
  }

  /**
   * Get position
   *
   * @return position
   **/
  @ApiModelProperty(value = "")

  @Valid

  public GetKillmailsKillmailIdKillmailHashPosition getPosition() {
    return position;
  }

  public void setPosition(GetKillmailsKillmailIdKillmailHashPosition position) {
    this.position = position;
  }

  public GetKillmailsKillmailIdKillmailHashVictim shipTypeId(Integer shipTypeId) {
    this.shipTypeId = shipTypeId;
    return this;
  }

  /**
   * The ship that the victim was piloting and was destroyed
   *
   * @return shipTypeId
   **/
  @ApiModelProperty(required = true, value = "The ship that the victim was piloting and was destroyed ")
  @NotNull


  public Integer getShipTypeId() {
    return shipTypeId;
  }

  public void setShipTypeId(Integer shipTypeId) {
    this.shipTypeId = shipTypeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetKillmailsKillmailIdKillmailHashVictim getKillmailsKillmailIdKillmailHashVictim = (GetKillmailsKillmailIdKillmailHashVictim) o;
    return Objects.equals(this.allianceId, getKillmailsKillmailIdKillmailHashVictim.allianceId) &&
        Objects.equals(this.characterId, getKillmailsKillmailIdKillmailHashVictim.characterId) &&
        Objects.equals(this.corporationId, getKillmailsKillmailIdKillmailHashVictim.corporationId) &&
        Objects.equals(this.damageTaken, getKillmailsKillmailIdKillmailHashVictim.damageTaken) &&
        Objects.equals(this.factionId, getKillmailsKillmailIdKillmailHashVictim.factionId) &&
        Objects.equals(this.items, getKillmailsKillmailIdKillmailHashVictim.items) &&
        Objects.equals(this.position, getKillmailsKillmailIdKillmailHashVictim.position) &&
        Objects.equals(this.shipTypeId, getKillmailsKillmailIdKillmailHashVictim.shipTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allianceId, characterId, corporationId, damageTaken, factionId, items, position, shipTypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetKillmailsKillmailIdKillmailHashVictim {\n");

    sb.append("    allianceId: ").append(toIndentedString(allianceId)).append("\n");
    sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
    sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
    sb.append("    damageTaken: ").append(toIndentedString(damageTaken)).append("\n");
    sb.append("    factionId: ").append(toIndentedString(factionId)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    shipTypeId: ").append(toIndentedString(shipTypeId)).append("\n");
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

