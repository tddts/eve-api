package com.github.tddts.eve.model.characters;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
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
public class GetCharactersCharacterIdWalletJournal200Ok {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("balance")
  private Double balance = null;

  @JsonProperty("context_id")
  private Long contextId = null;

  /**
   * The type of the given context_id if present
   */
  public enum ContextIdTypeEnum {
    STRUCTURE_ID("structure_id"),

    STATION_ID("station_id"),

    MARKET_TRANSACTION_ID("market_transaction_id"),

    CHARACTER_ID("character_id"),

    CORPORATION_ID("corporation_id"),

    ALLIANCE_ID("alliance_id"),

    EVE_SYSTEM("eve_system"),

    INDUSTRY_JOB_ID("industry_job_id"),

    CONTRACT_ID("contract_id"),

    PLANET_ID("planet_id"),

    SYSTEM_ID("system_id"),

    TYPE_ID("type_id");

    private String value;

    ContextIdTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ContextIdTypeEnum fromValue(String text) {
      for (ContextIdTypeEnum b : ContextIdTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("context_id_type")
  private ContextIdTypeEnum contextIdType = null;

  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("first_party_id")
  private Integer firstPartyId = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("reason")
  private String reason = null;

  /**
   * \"The transaction type for the given. transaction. Different transaction types will populate different attributes.\"
   */
  public enum RefTypeEnum {
    ACCELERATION_GATE_FEE("acceleration_gate_fee"),

    ADVERTISEMENT_LISTING_FEE("advertisement_listing_fee"),

    AGENT_DONATION("agent_donation"),

    AGENT_LOCATION_SERVICES("agent_location_services"),

    AGENT_MISCELLANEOUS("agent_miscellaneous"),

    AGENT_MISSION_COLLATERAL_PAID("agent_mission_collateral_paid"),

    AGENT_MISSION_COLLATERAL_REFUNDED("agent_mission_collateral_refunded"),

    AGENT_MISSION_REWARD("agent_mission_reward"),

    AGENT_MISSION_REWARD_CORPORATION_TAX("agent_mission_reward_corporation_tax"),

    AGENT_MISSION_TIME_BONUS_REWARD("agent_mission_time_bonus_reward"),

    AGENT_MISSION_TIME_BONUS_REWARD_CORPORATION_TAX("agent_mission_time_bonus_reward_corporation_tax"),

    AGENT_SECURITY_SERVICES("agent_security_services"),

    AGENT_SERVICES_RENDERED("agent_services_rendered"),

    AGENTS_PREWARD("agents_preward"),

    ALLIANCE_MAINTAINANCE_FEE("alliance_maintainance_fee"),

    ALLIANCE_REGISTRATION_FEE("alliance_registration_fee"),

    ASSET_SAFETY_RECOVERY_TAX("asset_safety_recovery_tax"),

    BOUNTY("bounty"),

    BOUNTY_PRIZE("bounty_prize"),

    BOUNTY_PRIZE_CORPORATION_TAX("bounty_prize_corporation_tax"),

    BOUNTY_PRIZES("bounty_prizes"),

    BOUNTY_REIMBURSEMENT("bounty_reimbursement"),

    BOUNTY_SURCHARGE("bounty_surcharge"),

    BROKERS_FEE("brokers_fee"),

    CLONE_ACTIVATION("clone_activation"),

    CLONE_TRANSFER("clone_transfer"),

    CONTRABAND_FINE("contraband_fine"),

    CONTRACT_AUCTION_BID("contract_auction_bid"),

    CONTRACT_AUCTION_BID_CORP("contract_auction_bid_corp"),

    CONTRACT_AUCTION_BID_REFUND("contract_auction_bid_refund"),

    CONTRACT_AUCTION_SOLD("contract_auction_sold"),

    CONTRACT_BROKERS_FEE("contract_brokers_fee"),

    CONTRACT_BROKERS_FEE_CORP("contract_brokers_fee_corp"),

    CONTRACT_COLLATERAL("contract_collateral"),

    CONTRACT_COLLATERAL_DEPOSITED_CORP("contract_collateral_deposited_corp"),

    CONTRACT_COLLATERAL_PAYOUT("contract_collateral_payout"),

    CONTRACT_COLLATERAL_REFUND("contract_collateral_refund"),

    CONTRACT_DEPOSIT("contract_deposit"),

    CONTRACT_DEPOSIT_CORP("contract_deposit_corp"),

    CONTRACT_DEPOSIT_REFUND("contract_deposit_refund"),

    CONTRACT_DEPOSIT_SALES_TAX("contract_deposit_sales_tax"),

    CONTRACT_PRICE("contract_price"),

    CONTRACT_PRICE_PAYMENT_CORP("contract_price_payment_corp"),

    CONTRACT_REVERSAL("contract_reversal"),

    CONTRACT_REWARD("contract_reward"),

    CONTRACT_REWARD_DEPOSITED("contract_reward_deposited"),

    CONTRACT_REWARD_DEPOSITED_CORP("contract_reward_deposited_corp"),

    CONTRACT_REWARD_REFUND("contract_reward_refund"),

    CONTRACT_SALES_TAX("contract_sales_tax"),

    COPYING("copying"),

    CORPORATE_REWARD_PAYOUT("corporate_reward_payout"),

    CORPORATE_REWARD_TAX("corporate_reward_tax"),

    CORPORATION_ACCOUNT_WITHDRAWAL("corporation_account_withdrawal"),

    CORPORATION_BULK_PAYMENT("corporation_bulk_payment"),

    CORPORATION_DIVIDEND_PAYMENT("corporation_dividend_payment"),

    CORPORATION_LIQUIDATION("corporation_liquidation"),

    CORPORATION_LOGO_CHANGE_COST("corporation_logo_change_cost"),

    CORPORATION_PAYMENT("corporation_payment"),

    CORPORATION_REGISTRATION_FEE("corporation_registration_fee"),

    COURIER_MISSION_ESCROW("courier_mission_escrow"),

    CSPA("cspa"),

    CSPAOFFLINEREFUND("cspaofflinerefund"),

    DATACORE_FEE("datacore_fee"),

    DNA_MODIFICATION_FEE("dna_modification_fee"),

    DOCKING_FEE("docking_fee"),

    DUEL_WAGER_ESCROW("duel_wager_escrow"),

    DUEL_WAGER_PAYMENT("duel_wager_payment"),

    DUEL_WAGER_REFUND("duel_wager_refund"),

    FACTORY_SLOT_RENTAL_FEE("factory_slot_rental_fee"),

    GM_CASH_TRANSFER("gm_cash_transfer"),

    INDUSTRY_JOB_TAX("industry_job_tax"),

    INFRASTRUCTURE_HUB_MAINTENANCE("infrastructure_hub_maintenance"),

    INHERITANCE("inheritance"),

    INSURANCE("insurance"),

    ITEM_TRADER_PAYMENT("item_trader_payment"),

    JUMP_CLONE_ACTIVATION_FEE("jump_clone_activation_fee"),

    JUMP_CLONE_INSTALLATION_FEE("jump_clone_installation_fee"),

    KILL_RIGHT_FEE("kill_right_fee"),

    LP_STORE("lp_store"),

    MANUFACTURING("manufacturing"),

    MARKET_ESCROW("market_escrow"),

    MARKET_FINE_PAID("market_fine_paid"),

    MARKET_TRANSACTION("market_transaction"),

    MEDAL_CREATION("medal_creation"),

    MEDAL_ISSUED("medal_issued"),

    MISSION_COMPLETION("mission_completion"),

    MISSION_COST("mission_cost"),

    MISSION_EXPIRATION("mission_expiration"),

    MISSION_REWARD("mission_reward"),

    OFFICE_RENTAL_FEE("office_rental_fee"),

    OPERATION_BONUS("operation_bonus"),

    OPPORTUNITY_REWARD("opportunity_reward"),

    PLANETARY_CONSTRUCTION("planetary_construction"),

    PLANETARY_EXPORT_TAX("planetary_export_tax"),

    PLANETARY_IMPORT_TAX("planetary_import_tax"),

    PLAYER_DONATION("player_donation"),

    PLAYER_TRADING("player_trading"),

    PROJECT_DISCOVERY_REWARD("project_discovery_reward"),

    PROJECT_DISCOVERY_TAX("project_discovery_tax"),

    REACTION("reaction"),

    RELEASE_OF_IMPOUNDED_PROPERTY("release_of_impounded_property"),

    REPAIR_BILL("repair_bill"),

    REPROCESSING_TAX("reprocessing_tax"),

    RESEARCHING_MATERIAL_PRODUCTIVITY("researching_material_productivity"),

    RESEARCHING_TECHNOLOGY("researching_technology"),

    RESEARCHING_TIME_PRODUCTIVITY("researching_time_productivity"),

    RESOURCE_WARS_REWARD("resource_wars_reward"),

    REVERSE_ENGINEERING("reverse_engineering"),

    SECURITY_PROCESSING_FEE("security_processing_fee"),

    SHARES("shares"),

    SKILL_PURCHASE("skill_purchase"),

    SOVEREIGNITY_BILL("sovereignity_bill"),

    STORE_PURCHASE("store_purchase"),

    STORE_PURCHASE_REFUND("store_purchase_refund"),

    STRUCTURE_GATE_JUMP("structure_gate_jump"),

    TRANSACTION_TAX("transaction_tax"),

    UPKEEP_ADJUSTMENT_FEE("upkeep_adjustment_fee"),

    WAR_ALLY_CONTRACT("war_ally_contract"),

    WAR_FEE("war_fee"),

    WAR_FEE_SURRENDER("war_fee_surrender");

    private String value;

    RefTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RefTypeEnum fromValue(String text) {
      for (RefTypeEnum b : RefTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("ref_type")
  private RefTypeEnum refType = null;

  @JsonProperty("second_party_id")
  private Integer secondPartyId = null;

  @JsonProperty("tax")
  private Double tax = null;

  @JsonProperty("tax_receiver_id")
  private Integer taxReceiverId = null;

  public GetCharactersCharacterIdWalletJournal200Ok amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount of ISK given or taken from the wallet as a result of the given transaction. Positive when ISK is deposited into the wallet and negative when ISK is withdrawn
   *
   * @return amount
   **/
  @ApiModelProperty(value = "The amount of ISK given or taken from the wallet as a result of the given transaction. Positive when ISK is deposited into the wallet and negative when ISK is withdrawn")


  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public GetCharactersCharacterIdWalletJournal200Ok balance(Double balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Wallet balance after transaction occurred
   *
   * @return balance
   **/
  @ApiModelProperty(value = "Wallet balance after transaction occurred")


  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public GetCharactersCharacterIdWalletJournal200Ok contextId(Long contextId) {
    this.contextId = contextId;
    return this;
  }

  /**
   * An ID that gives extra context to the particular transaction. Because of legacy reasons the context is completely different per ref_type and means different things. It is also possible to not have a context_id
   *
   * @return contextId
   **/
  @ApiModelProperty(value = "An ID that gives extra context to the particular transaction. Because of legacy reasons the context is completely different per ref_type and means different things. It is also possible to not have a context_id")


  public Long getContextId() {
    return contextId;
  }

  public void setContextId(Long contextId) {
    this.contextId = contextId;
  }

  public GetCharactersCharacterIdWalletJournal200Ok contextIdType(ContextIdTypeEnum contextIdType) {
    this.contextIdType = contextIdType;
    return this;
  }

  /**
   * The type of the given context_id if present
   *
   * @return contextIdType
   **/
  @ApiModelProperty(value = "The type of the given context_id if present")


  public ContextIdTypeEnum getContextIdType() {
    return contextIdType;
  }

  public void setContextIdType(ContextIdTypeEnum contextIdType) {
    this.contextIdType = contextIdType;
  }

  public GetCharactersCharacterIdWalletJournal200Ok date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Date and time of transaction
   *
   * @return date
   **/
  @ApiModelProperty(required = true, value = "Date and time of transaction")
  @NotNull

  @Valid

  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public GetCharactersCharacterIdWalletJournal200Ok description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The reason for the transaction, mirrors what is seen in the client
   *
   * @return description
   **/
  @ApiModelProperty(required = true, value = "The reason for the transaction, mirrors what is seen in the client")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GetCharactersCharacterIdWalletJournal200Ok firstPartyId(Integer firstPartyId) {
    this.firstPartyId = firstPartyId;
    return this;
  }

  /**
   * The id of the first party involved in the transaction. This attribute has no consistency and is different or non existant for particular ref_types. The description attribute will help make sense of what this attribute means. For more info about the given ID it can be dropped into the /universe/names/ ESI route to determine its type and name
   *
   * @return firstPartyId
   **/
  @ApiModelProperty(value = "The id of the first party involved in the transaction. This attribute has no consistency and is different or non existant for particular ref_types. The description attribute will help make sense of what this attribute means. For more info about the given ID it can be dropped into the /universe/names/ ESI route to determine its type and name")


  public Integer getFirstPartyId() {
    return firstPartyId;
  }

  public void setFirstPartyId(Integer firstPartyId) {
    this.firstPartyId = firstPartyId;
  }

  public GetCharactersCharacterIdWalletJournal200Ok id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Unique journal reference ID
   *
   * @return id
   **/
  @ApiModelProperty(required = true, value = "Unique journal reference ID")
  @NotNull


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetCharactersCharacterIdWalletJournal200Ok reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * The user stated reason for the transaction. Only applies to some ref_types
   *
   * @return reason
   **/
  @ApiModelProperty(value = "The user stated reason for the transaction. Only applies to some ref_types")


  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public GetCharactersCharacterIdWalletJournal200Ok refType(RefTypeEnum refType) {
    this.refType = refType;
    return this;
  }

  /**
   * \"The transaction type for the given. transaction. Different transaction types will populate different attributes.\"
   *
   * @return refType
   **/
  @ApiModelProperty(required = true, value = "\"The transaction type for the given. transaction. Different transaction types will populate different attributes.\"")
  @NotNull


  public RefTypeEnum getRefType() {
    return refType;
  }

  public void setRefType(RefTypeEnum refType) {
    this.refType = refType;
  }

  public GetCharactersCharacterIdWalletJournal200Ok secondPartyId(Integer secondPartyId) {
    this.secondPartyId = secondPartyId;
    return this;
  }

  /**
   * The id of the second party involved in the transaction. This attribute has no consistency and is different or non existant for particular ref_types. The description attribute will help make sense of what this attribute means. For more info about the given ID it can be dropped into the /universe/names/ ESI route to determine its type and name
   *
   * @return secondPartyId
   **/
  @ApiModelProperty(value = "The id of the second party involved in the transaction. This attribute has no consistency and is different or non existant for particular ref_types. The description attribute will help make sense of what this attribute means. For more info about the given ID it can be dropped into the /universe/names/ ESI route to determine its type and name")


  public Integer getSecondPartyId() {
    return secondPartyId;
  }

  public void setSecondPartyId(Integer secondPartyId) {
    this.secondPartyId = secondPartyId;
  }

  public GetCharactersCharacterIdWalletJournal200Ok tax(Double tax) {
    this.tax = tax;
    return this;
  }

  /**
   * Tax amount received. Only applies to tax related transactions
   *
   * @return tax
   **/
  @ApiModelProperty(value = "Tax amount received. Only applies to tax related transactions")


  public Double getTax() {
    return tax;
  }

  public void setTax(Double tax) {
    this.tax = tax;
  }

  public GetCharactersCharacterIdWalletJournal200Ok taxReceiverId(Integer taxReceiverId) {
    this.taxReceiverId = taxReceiverId;
    return this;
  }

  /**
   * The corporation ID receiving any tax paid. Only applies to tax related transactions
   *
   * @return taxReceiverId
   **/
  @ApiModelProperty(value = "The corporation ID receiving any tax paid. Only applies to tax related transactions")


  public Integer getTaxReceiverId() {
    return taxReceiverId;
  }

  public void setTaxReceiverId(Integer taxReceiverId) {
    this.taxReceiverId = taxReceiverId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdWalletJournal200Ok getCharactersCharacterIdWalletJournal200Ok = (GetCharactersCharacterIdWalletJournal200Ok) o;
    return Objects.equals(this.amount, getCharactersCharacterIdWalletJournal200Ok.amount) &&
        Objects.equals(this.balance, getCharactersCharacterIdWalletJournal200Ok.balance) &&
        Objects.equals(this.contextId, getCharactersCharacterIdWalletJournal200Ok.contextId) &&
        Objects.equals(this.contextIdType, getCharactersCharacterIdWalletJournal200Ok.contextIdType) &&
        Objects.equals(this.date, getCharactersCharacterIdWalletJournal200Ok.date) &&
        Objects.equals(this.description, getCharactersCharacterIdWalletJournal200Ok.description) &&
        Objects.equals(this.firstPartyId, getCharactersCharacterIdWalletJournal200Ok.firstPartyId) &&
        Objects.equals(this.id, getCharactersCharacterIdWalletJournal200Ok.id) &&
        Objects.equals(this.reason, getCharactersCharacterIdWalletJournal200Ok.reason) &&
        Objects.equals(this.refType, getCharactersCharacterIdWalletJournal200Ok.refType) &&
        Objects.equals(this.secondPartyId, getCharactersCharacterIdWalletJournal200Ok.secondPartyId) &&
        Objects.equals(this.tax, getCharactersCharacterIdWalletJournal200Ok.tax) &&
        Objects.equals(this.taxReceiverId, getCharactersCharacterIdWalletJournal200Ok.taxReceiverId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, balance, contextId, contextIdType, date, description, firstPartyId, id, reason, refType, secondPartyId, tax, taxReceiverId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdWalletJournal200Ok {\n");

    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    contextIdType: ").append(toIndentedString(contextIdType)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    firstPartyId: ").append(toIndentedString(firstPartyId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    refType: ").append(toIndentedString(refType)).append("\n");
    sb.append("    secondPartyId: ").append(toIndentedString(secondPartyId)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    taxReceiverId: ").append(toIndentedString(taxReceiverId)).append("\n");
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

