/**
 * NOTE: This class is auto generated by the swagger code generator program (unset).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.github.tddts.eve.api;

import com.github.tddts.eve.model.characters.*;
import com.github.tddts.eve.model.contracts.*;
import com.github.tddts.eve.model.corporations.*;
import com.github.tddts.eve.model.error.*;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@Api(value = "Contracts")
public interface ContractsApi {

  @ApiOperation(value = "Get contracts", nickname = "getCharactersCharacterIdContracts", notes = "Returns contracts available to a character, only if the character is issuer, acceptor or assignee. Only returns contracts no older than 30 days, or if the status is \"in_progress\".  --- Alternate route: `/dev/characters/{character_id}/contracts/`  Alternate route: `/legacy/characters/{character_id}/contracts/`  Alternate route: `/v1/characters/{character_id}/contracts/`  --- This route is cached for up to 300 seconds", response = GetCharactersCharacterIdContracts200Ok.class, responseContainer = "List", authorizations = {
      @Authorization(value = "evesso", scopes = {
          @AuthorizationScope(scope = "esi-contracts.read_character_contracts.v1", description = "EVE SSO scope esi-contracts.read_character_contracts.v1")
      })
  }, tags = {"Contracts",})
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "A list of contracts", response = GetCharactersCharacterIdContracts200Ok.class, responseContainer = "List"),
      @ApiResponse(code = 304, message = "Not modified"),
      @ApiResponse(code = 400, message = "Bad request", response = BadRequest.class),
      @ApiResponse(code = 401, message = "Unauthorized", response = Unauthorized.class),
      @ApiResponse(code = 403, message = "Forbidden", response = Forbidden.class),
      @ApiResponse(code = 420, message = "Error limited", response = ErrorLimited.class),
      @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class),
      @ApiResponse(code = 503, message = "Service unavailable", response = ServiceUnavailable.class),
      @ApiResponse(code = 504, message = "Gateway timeout", response = GatewayTimeout.class)})
  @RequestMapping(value = "/characters/{character_id}/contracts/",
      produces = "application/json",
      consumes = "",
      method = RequestMethod.GET)
  List<GetCharactersCharacterIdContracts200Ok> getCharactersCharacterIdContracts(
      @Min(1) @ApiParam(value = "An EVE character ID", required = true) @PathVariable("character_id") Integer characterId,
      @ApiParam(value = "The server name you would like data from", allowableValues = "tranquility, singularity", defaultValue = "tranquility") @Valid @RequestParam(value = "datasource", required = false, defaultValue = "tranquility") String datasource,
      @ApiParam(value = "ETag from a previous request. A 304 will be returned if this matches the current ETag") @RequestHeader(value = "If-None-Match", required = false) String ifNoneMatch,
      @Min(1) @ApiParam(value = "Which page of results to return", defaultValue = "1") @Valid @RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
      @ApiParam(value = "Access token to use if unable to set a header") @Valid @RequestParam(value = "token", required = false) String token);


  @ApiOperation(value = "Get contract bids", nickname = "getCharactersCharacterIdContractsContractIdBids", notes = "Lists bids on a particular auction contract  --- Alternate route: `/dev/characters/{character_id}/contracts/{contract_id}/bids/`  Alternate route: `/legacy/characters/{character_id}/contracts/{contract_id}/bids/`  Alternate route: `/v1/characters/{character_id}/contracts/{contract_id}/bids/`  --- This route is cached for up to 300 seconds", response = GetCharactersCharacterIdContractsContractIdBids200Ok.class, responseContainer = "List", authorizations = {
      @Authorization(value = "evesso", scopes = {
          @AuthorizationScope(scope = "esi-contracts.read_character_contracts.v1", description = "EVE SSO scope esi-contracts.read_character_contracts.v1")
      })
  }, tags = {"Contracts",})
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "A list of bids", response = GetCharactersCharacterIdContractsContractIdBids200Ok.class, responseContainer = "List"),
      @ApiResponse(code = 304, message = "Not modified"),
      @ApiResponse(code = 400, message = "Bad request", response = BadRequest.class),
      @ApiResponse(code = 401, message = "Unauthorized", response = Unauthorized.class),
      @ApiResponse(code = 403, message = "Forbidden", response = Forbidden.class),
      @ApiResponse(code = 404, message = "Not found", response = GetCharactersCharacterIdContractsContractIdBidsNotFound.class),
      @ApiResponse(code = 420, message = "Error limited", response = ErrorLimited.class),
      @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class),
      @ApiResponse(code = 503, message = "Service unavailable", response = ServiceUnavailable.class),
      @ApiResponse(code = 504, message = "Gateway timeout", response = GatewayTimeout.class)})
  @RequestMapping(value = "/characters/{character_id}/contracts/{contract_id}/bids/",
      produces = "application/json",
      consumes = "",
      method = RequestMethod.GET)
  List<GetCharactersCharacterIdContractsContractIdBids200Ok> getCharactersCharacterIdContractsContractIdBids(
      @Min(1) @ApiParam(value = "An EVE character ID", required = true) @PathVariable("character_id") Integer characterId,
      @ApiParam(value = "ID of a contract", required = true) @PathVariable("contract_id") Integer contractId,
      @ApiParam(value = "The server name you would like data from", allowableValues = "tranquility, singularity", defaultValue = "tranquility") @Valid @RequestParam(value = "datasource", required = false, defaultValue = "tranquility") String datasource,
      @ApiParam(value = "ETag from a previous request. A 304 will be returned if this matches the current ETag") @RequestHeader(value = "If-None-Match", required = false) String ifNoneMatch,
      @ApiParam(value = "Access token to use if unable to set a header") @Valid @RequestParam(value = "token", required = false) String token);


  @ApiOperation(value = "Get contract items", nickname = "getCharactersCharacterIdContractsContractIdItems", notes = "Lists items of a particular contract  --- Alternate route: `/dev/characters/{character_id}/contracts/{contract_id}/items/`  Alternate route: `/legacy/characters/{character_id}/contracts/{contract_id}/items/`  Alternate route: `/v1/characters/{character_id}/contracts/{contract_id}/items/`  --- This route is cached for up to 3600 seconds", response = GetCharactersCharacterIdContractsContractIdItems200Ok.class, responseContainer = "List", authorizations = {
      @Authorization(value = "evesso", scopes = {
          @AuthorizationScope(scope = "esi-contracts.read_character_contracts.v1", description = "EVE SSO scope esi-contracts.read_character_contracts.v1")
      })
  }, tags = {"Contracts",})
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "A list of items in this contract", response = GetCharactersCharacterIdContractsContractIdItems200Ok.class, responseContainer = "List"),
      @ApiResponse(code = 304, message = "Not modified"),
      @ApiResponse(code = 400, message = "Bad request", response = BadRequest.class),
      @ApiResponse(code = 401, message = "Unauthorized", response = Unauthorized.class),
      @ApiResponse(code = 403, message = "Forbidden", response = Forbidden.class),
      @ApiResponse(code = 404, message = "Not found", response = GetCharactersCharacterIdContractsContractIdItemsNotFound.class),
      @ApiResponse(code = 420, message = "Error limited", response = ErrorLimited.class),
      @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class),
      @ApiResponse(code = 503, message = "Service unavailable", response = ServiceUnavailable.class),
      @ApiResponse(code = 504, message = "Gateway timeout", response = GatewayTimeout.class)})
  @RequestMapping(value = "/characters/{character_id}/contracts/{contract_id}/items/",
      produces = "application/json",
      consumes = "",
      method = RequestMethod.GET)
  List<GetCharactersCharacterIdContractsContractIdItems200Ok> getCharactersCharacterIdContractsContractIdItems(
      @Min(1) @ApiParam(value = "An EVE character ID", required = true) @PathVariable("character_id") Integer characterId,
      @ApiParam(value = "ID of a contract", required = true) @PathVariable("contract_id") Integer contractId,
      @ApiParam(value = "The server name you would like data from", allowableValues = "tranquility, singularity", defaultValue = "tranquility") @Valid @RequestParam(value = "datasource", required = false, defaultValue = "tranquility") String datasource,
      @ApiParam(value = "ETag from a previous request. A 304 will be returned if this matches the current ETag") @RequestHeader(value = "If-None-Match", required = false) String ifNoneMatch,
      @ApiParam(value = "Access token to use if unable to set a header") @Valid @RequestParam(value = "token", required = false) String token);


  @ApiOperation(value = "Get public contract bids", nickname = "getContractsPublicBidsContractId", notes = "Lists bids on a public auction contract  --- Alternate route: `/dev/contracts/public/bids/{contract_id}/`  Alternate route: `/legacy/contracts/public/bids/{contract_id}/`  Alternate route: `/v1/contracts/public/bids/{contract_id}/`  --- This route is cached for up to 300 seconds", response = GetContractsPublicBidsContractId200Ok.class, responseContainer = "List", tags = {"Contracts",})
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "A list of bids", response = GetContractsPublicBidsContractId200Ok.class, responseContainer = "List"),
      @ApiResponse(code = 204, message = "Contract expired or recently accepted by player"),
      @ApiResponse(code = 304, message = "Not modified"),
      @ApiResponse(code = 400, message = "Bad request", response = BadRequest.class),
      @ApiResponse(code = 403, message = "Not Authorized to see contract", response = GetContractsPublicBidsContractIdForbidden.class),
      @ApiResponse(code = 404, message = "Not found", response = GetContractsPublicBidsContractIdNotFound.class),
      @ApiResponse(code = 420, message = "Error limited", response = ErrorLimited.class),
      @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class),
      @ApiResponse(code = 503, message = "Service unavailable", response = ServiceUnavailable.class),
      @ApiResponse(code = 504, message = "Gateway timeout", response = GatewayTimeout.class)})
  @RequestMapping(value = "/contracts/public/bids/{contract_id}/",
      produces = "application/json",
      consumes = "",
      method = RequestMethod.GET)
  List<GetContractsPublicBidsContractId200Ok> getContractsPublicBidsContractId(
      @ApiParam(value = "ID of a contract", required = true) @PathVariable("contract_id") Integer contractId,
      @ApiParam(value = "The server name you would like data from", allowableValues = "tranquility, singularity", defaultValue = "tranquility") @Valid @RequestParam(value = "datasource", required = false, defaultValue = "tranquility") String datasource,
      @ApiParam(value = "ETag from a previous request. A 304 will be returned if this matches the current ETag") @RequestHeader(value = "If-None-Match", required = false) String ifNoneMatch,
      @Min(1) @ApiParam(value = "Which page of results to return", defaultValue = "1") @Valid @RequestParam(value = "page", required = false, defaultValue = "1") Integer page);


  @ApiOperation(value = "Get public contract items", nickname = "getContractsPublicItemsContractId", notes = "Lists items of a public contract  --- Alternate route: `/dev/contracts/public/items/{contract_id}/`  Alternate route: `/legacy/contracts/public/items/{contract_id}/`  Alternate route: `/v1/contracts/public/items/{contract_id}/`  --- This route is cached for up to 3600 seconds", response = GetContractsPublicItemsContractId200Ok.class, responseContainer = "List", tags = {"Contracts",})
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "A list of items in this contract", response = GetContractsPublicItemsContractId200Ok.class, responseContainer = "List"),
      @ApiResponse(code = 204, message = "Contract expired or recently accepted by player"),
      @ApiResponse(code = 304, message = "Not modified"),
      @ApiResponse(code = 400, message = "Bad request", response = BadRequest.class),
      @ApiResponse(code = 403, message = "Not Authorized to see contract", response = GetContractsPublicItemsContractIdForbidden.class),
      @ApiResponse(code = 404, message = "Not found", response = GetContractsPublicItemsContractIdNotFound.class),
      @ApiResponse(code = 420, message = "Error limited", response = ErrorLimited.class),
      @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class),
      @ApiResponse(code = 503, message = "Service unavailable", response = ServiceUnavailable.class),
      @ApiResponse(code = 504, message = "Gateway timeout", response = GatewayTimeout.class)})
  @RequestMapping(value = "/contracts/public/items/{contract_id}/",
      produces = "application/json",
      consumes = "",
      method = RequestMethod.GET)
  List<GetContractsPublicItemsContractId200Ok> getContractsPublicItemsContractId(
      @ApiParam(value = "ID of a contract", required = true) @PathVariable("contract_id") Integer contractId,
      @ApiParam(value = "The server name you would like data from", allowableValues = "tranquility, singularity", defaultValue = "tranquility") @Valid @RequestParam(value = "datasource", required = false, defaultValue = "tranquility") String datasource,
      @ApiParam(value = "ETag from a previous request. A 304 will be returned if this matches the current ETag") @RequestHeader(value = "If-None-Match", required = false) String ifNoneMatch,
      @Min(1) @ApiParam(value = "Which page of results to return", defaultValue = "1") @Valid @RequestParam(value = "page", required = false, defaultValue = "1") Integer page);


  @ApiOperation(value = "Get public contracts", nickname = "getContractsPublicRegionId", notes = "Returns a paginated list of all public contracts in the given region  --- Alternate route: `/dev/contracts/public/{region_id}/`  Alternate route: `/legacy/contracts/public/{region_id}/`  Alternate route: `/v1/contracts/public/{region_id}/`  --- This route is cached for up to 1800 seconds", response = GetContractsPublicRegionId200Ok.class, responseContainer = "List", tags = {"Contracts",})
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "A list of contracts", response = GetContractsPublicRegionId200Ok.class, responseContainer = "List"),
      @ApiResponse(code = 304, message = "Not modified"),
      @ApiResponse(code = 400, message = "Bad request", response = BadRequest.class),
      @ApiResponse(code = 404, message = "Region not found", response = GetContractsPublicRegionIdNotFound.class),
      @ApiResponse(code = 420, message = "Error limited", response = ErrorLimited.class),
      @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class),
      @ApiResponse(code = 503, message = "Service unavailable", response = ServiceUnavailable.class),
      @ApiResponse(code = 504, message = "Gateway timeout", response = GatewayTimeout.class)})
  @RequestMapping(value = "/contracts/public/{region_id}/",
      produces = "application/json",
      consumes = "",
      method = RequestMethod.GET)
  List<GetContractsPublicRegionId200Ok> getContractsPublicRegionId(
      @ApiParam(value = "An EVE region id", required = true) @PathVariable("region_id") Integer regionId,
      @ApiParam(value = "The server name you would like data from", allowableValues = "tranquility, singularity", defaultValue = "tranquility") @Valid @RequestParam(value = "datasource", required = false, defaultValue = "tranquility") String datasource,
      @ApiParam(value = "ETag from a previous request. A 304 will be returned if this matches the current ETag") @RequestHeader(value = "If-None-Match", required = false) String ifNoneMatch,
      @Min(1) @ApiParam(value = "Which page of results to return", defaultValue = "1") @Valid @RequestParam(value = "page", required = false, defaultValue = "1") Integer page);


  @ApiOperation(value = "Get corporation contracts", nickname = "getCorporationsCorporationIdContracts", notes = "Returns contracts available to a corporation, only if the corporation is issuer, acceptor or assignee. Only returns contracts no older than 30 days, or if the status is \"in_progress\".  --- Alternate route: `/dev/corporations/{corporation_id}/contracts/`  Alternate route: `/legacy/corporations/{corporation_id}/contracts/`  Alternate route: `/v1/corporations/{corporation_id}/contracts/`  --- This route is cached for up to 300 seconds", response = GetCorporationsCorporationIdContracts200Ok.class, responseContainer = "List", authorizations = {
      @Authorization(value = "evesso", scopes = {
          @AuthorizationScope(scope = "esi-contracts.read_corporation_contracts.v1", description = "EVE SSO scope esi-contracts.read_corporation_contracts.v1")
      })
  }, tags = {"Contracts",})
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "A list of contracts", response = GetCorporationsCorporationIdContracts200Ok.class, responseContainer = "List"),
      @ApiResponse(code = 304, message = "Not modified"),
      @ApiResponse(code = 400, message = "Bad request", response = BadRequest.class),
      @ApiResponse(code = 401, message = "Unauthorized", response = Unauthorized.class),
      @ApiResponse(code = 403, message = "Forbidden", response = Forbidden.class),
      @ApiResponse(code = 420, message = "Error limited", response = ErrorLimited.class),
      @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class),
      @ApiResponse(code = 503, message = "Service unavailable", response = ServiceUnavailable.class),
      @ApiResponse(code = 504, message = "Gateway timeout", response = GatewayTimeout.class)})
  @RequestMapping(value = "/corporations/{corporation_id}/contracts/",
      produces = "application/json",
      consumes = "",
      method = RequestMethod.GET)
  List<GetCorporationsCorporationIdContracts200Ok> getCorporationsCorporationIdContracts(
      @Min(1) @ApiParam(value = "An EVE corporation ID", required = true) @PathVariable("corporation_id") Integer corporationId,
      @ApiParam(value = "The server name you would like data from", allowableValues = "tranquility, singularity", defaultValue = "tranquility") @Valid @RequestParam(value = "datasource", required = false, defaultValue = "tranquility") String datasource,
      @ApiParam(value = "ETag from a previous request. A 304 will be returned if this matches the current ETag") @RequestHeader(value = "If-None-Match", required = false) String ifNoneMatch,
      @Min(1) @ApiParam(value = "Which page of results to return", defaultValue = "1") @Valid @RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
      @ApiParam(value = "Access token to use if unable to set a header") @Valid @RequestParam(value = "token", required = false) String token);


  @ApiOperation(value = "Get corporation contract bids", nickname = "getCorporationsCorporationIdContractsContractIdBids", notes = "Lists bids on a particular auction contract  --- Alternate route: `/dev/corporations/{corporation_id}/contracts/{contract_id}/bids/`  Alternate route: `/legacy/corporations/{corporation_id}/contracts/{contract_id}/bids/`  Alternate route: `/v1/corporations/{corporation_id}/contracts/{contract_id}/bids/`  --- This route is cached for up to 3600 seconds", response = GetCorporationsCorporationIdContractsContractIdBids200Ok.class, responseContainer = "List", authorizations = {
      @Authorization(value = "evesso", scopes = {
          @AuthorizationScope(scope = "esi-contracts.read_corporation_contracts.v1", description = "EVE SSO scope esi-contracts.read_corporation_contracts.v1")
      })
  }, tags = {"Contracts",})
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "A list of bids", response = GetCorporationsCorporationIdContractsContractIdBids200Ok.class, responseContainer = "List"),
      @ApiResponse(code = 304, message = "Not modified"),
      @ApiResponse(code = 400, message = "Bad request", response = BadRequest.class),
      @ApiResponse(code = 401, message = "Unauthorized", response = Unauthorized.class),
      @ApiResponse(code = 403, message = "Forbidden", response = Forbidden.class),
      @ApiResponse(code = 404, message = "Not found", response = GetCorporationsCorporationIdContractsContractIdBidsNotFound.class),
      @ApiResponse(code = 420, message = "Error limited", response = ErrorLimited.class),
      @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class),
      @ApiResponse(code = 503, message = "Service unavailable", response = ServiceUnavailable.class),
      @ApiResponse(code = 504, message = "Gateway timeout", response = GatewayTimeout.class)})
  @RequestMapping(value = "/corporations/{corporation_id}/contracts/{contract_id}/bids/",
      produces = "application/json",
      consumes = "",
      method = RequestMethod.GET)
  List<GetCorporationsCorporationIdContractsContractIdBids200Ok> getCorporationsCorporationIdContractsContractIdBids(
      @ApiParam(value = "ID of a contract", required = true) @PathVariable("contract_id") Integer contractId,
      @Min(1) @ApiParam(value = "An EVE corporation ID", required = true) @PathVariable("corporation_id") Integer corporationId,
      @ApiParam(value = "The server name you would like data from", allowableValues = "tranquility, singularity", defaultValue = "tranquility") @Valid @RequestParam(value = "datasource", required = false, defaultValue = "tranquility") String datasource,
      @ApiParam(value = "ETag from a previous request. A 304 will be returned if this matches the current ETag") @RequestHeader(value = "If-None-Match", required = false) String ifNoneMatch,
      @Min(1) @ApiParam(value = "Which page of results to return", defaultValue = "1") @Valid @RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
      @ApiParam(value = "Access token to use if unable to set a header") @Valid @RequestParam(value = "token", required = false) String token);


  @ApiOperation(value = "Get corporation contract items", nickname = "getCorporationsCorporationIdContractsContractIdItems", notes = "Lists items of a particular contract  --- Alternate route: `/dev/corporations/{corporation_id}/contracts/{contract_id}/items/`  Alternate route: `/legacy/corporations/{corporation_id}/contracts/{contract_id}/items/`  Alternate route: `/v1/corporations/{corporation_id}/contracts/{contract_id}/items/`  --- This route is cached for up to 3600 seconds", response = GetCorporationsCorporationIdContractsContractIdItems200Ok.class, responseContainer = "List", authorizations = {
      @Authorization(value = "evesso", scopes = {
          @AuthorizationScope(scope = "esi-contracts.read_corporation_contracts.v1", description = "EVE SSO scope esi-contracts.read_corporation_contracts.v1")
      })
  }, tags = {"Contracts",})
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "A list of items in this contract", response = GetCorporationsCorporationIdContractsContractIdItems200Ok.class, responseContainer = "List"),
      @ApiResponse(code = 304, message = "Not modified"),
      @ApiResponse(code = 400, message = "Bad request", response = BadRequest.class),
      @ApiResponse(code = 401, message = "Unauthorized", response = Unauthorized.class),
      @ApiResponse(code = 403, message = "Forbidden", response = Forbidden.class),
      @ApiResponse(code = 404, message = "Not found", response = GetCorporationsCorporationIdContractsContractIdItemsNotFound.class),
      @ApiResponse(code = 420, message = "Error limited", response = ErrorLimited.class),
      @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class),
      @ApiResponse(code = 503, message = "Service unavailable", response = ServiceUnavailable.class),
      @ApiResponse(code = 504, message = "Gateway timeout", response = GatewayTimeout.class),
      @ApiResponse(code = 520, message = "Internal error thrown from the EVE server. Most of the time this means you have hit an EVE server rate limit", response = GetCorporationsCorporationIdContractsContractIdItemsError520.class)})
  @RequestMapping(value = "/corporations/{corporation_id}/contracts/{contract_id}/items/",
      produces = "application/json",
      consumes = "",
      method = RequestMethod.GET)
  List<GetCorporationsCorporationIdContractsContractIdItems200Ok> getCorporationsCorporationIdContractsContractIdItems(
      @ApiParam(value = "ID of a contract", required = true) @PathVariable("contract_id") Integer contractId,
      @Min(1) @ApiParam(value = "An EVE corporation ID", required = true) @PathVariable("corporation_id") Integer corporationId,
      @ApiParam(value = "The server name you would like data from", allowableValues = "tranquility, singularity", defaultValue = "tranquility") @Valid @RequestParam(value = "datasource", required = false, defaultValue = "tranquility") String datasource,
      @ApiParam(value = "ETag from a previous request. A 304 will be returned if this matches the current ETag") @RequestHeader(value = "If-None-Match", required = false) String ifNoneMatch,
      @ApiParam(value = "Access token to use if unable to set a header") @Valid @RequestParam(value = "token", required = false) String token);

}
