/**
 * NOTE: This class is auto generated by the swagger code generator program (unset).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.github.tddts.eve.reactive.api;

import com.github.tddts.eve.model.alliance.GetAlliancesAllianceIdIconsNotFound;
import com.github.tddts.eve.model.alliance.GetAlliancesAllianceIdIconsOk;
import com.github.tddts.eve.model.alliance.GetAlliancesAllianceIdNotFound;
import com.github.tddts.eve.model.alliance.GetAlliancesAllianceIdOk;
import com.github.tddts.eve.model.error.*;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;
import javax.validation.constraints.Min;

@Api(value = "Alliance")
public interface AllianceReactiveApi {

  @ApiOperation(value = "List all alliances", nickname = "getAlliances", notes = "List all active player alliances  --- Alternate route: `/dev/alliances/`  Alternate route: `/legacy/alliances/`  Alternate route: `/v1/alliances/`  --- This route is cached for up to 3600 seconds", response = Integer.class, responseContainer = "List", tags = {"Alliance",})
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "List of Alliance IDs", response = Integer.class, responseContainer = "List"),
      @ApiResponse(code = 304, message = "Not modified"),
      @ApiResponse(code = 400, message = "Bad request", response = BadRequest.class),
      @ApiResponse(code = 420, message = "Error limited", response = ErrorLimited.class),
      @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class),
      @ApiResponse(code = 503, message = "Service unavailable", response = ServiceUnavailable.class),
      @ApiResponse(code = 504, message = "Gateway timeout", response = GatewayTimeout.class)})
  @RequestMapping(value = "/alliances/",
      produces = "application/json",
      consumes = "",
      method = RequestMethod.GET)
  Flux<Integer> getAlliances(
      @ApiParam(value = "The server name you would like data from", allowableValues = "tranquility, singularity", defaultValue = "tranquility") @Valid @RequestParam(value = "datasource", required = false, defaultValue = "tranquility") String datasource,
      @ApiParam(value = "ETag from a previous request. A 304 will be returned if this matches the current ETag") @RequestHeader(value = "If-None-Match", required = false) String ifNoneMatch);


  @ApiOperation(value = "Get alliance information", nickname = "getAlliancesAllianceId", notes = "Public information about an alliance  --- Alternate route: `/dev/alliances/{alliance_id}/`  Alternate route: `/v3/alliances/{alliance_id}/`  --- This route is cached for up to 3600 seconds", response = GetAlliancesAllianceIdOk.class, tags = {"Alliance",})
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "Public data about an alliance", response = GetAlliancesAllianceIdOk.class),
      @ApiResponse(code = 304, message = "Not modified"),
      @ApiResponse(code = 400, message = "Bad request", response = BadRequest.class),
      @ApiResponse(code = 404, message = "Alliance not found", response = GetAlliancesAllianceIdNotFound.class),
      @ApiResponse(code = 420, message = "Error limited", response = ErrorLimited.class),
      @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class),
      @ApiResponse(code = 503, message = "Service unavailable", response = ServiceUnavailable.class),
      @ApiResponse(code = 504, message = "Gateway timeout", response = GatewayTimeout.class)})
  @RequestMapping(value = "/alliances/{alliance_id}/",
      produces = "application/json",
      consumes = "",
      method = RequestMethod.GET)
  Mono<GetAlliancesAllianceIdOk> getAlliancesAllianceId(
      @Min(1) @ApiParam(value = "An EVE alliance ID", required = true) @PathVariable("alliance_id") Integer allianceId,
      @ApiParam(value = "The server name you would like data from", allowableValues = "tranquility, singularity", defaultValue = "tranquility") @Valid @RequestParam(value = "datasource", required = false, defaultValue = "tranquility") String datasource,
      @ApiParam(value = "ETag from a previous request. A 304 will be returned if this matches the current ETag") @RequestHeader(value = "If-None-Match", required = false) String ifNoneMatch);


  @ApiOperation(value = "List alliance's corporations", nickname = "getAlliancesAllianceIdCorporations", notes = "List all current member corporations of an alliance  --- Alternate route: `/dev/alliances/{alliance_id}/corporations/`  Alternate route: `/legacy/alliances/{alliance_id}/corporations/`  Alternate route: `/v1/alliances/{alliance_id}/corporations/`  --- This route is cached for up to 3600 seconds", response = Integer.class, responseContainer = "List", tags = {"Alliance",})
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "List of corporation IDs", response = Integer.class, responseContainer = "List"),
      @ApiResponse(code = 304, message = "Not modified"),
      @ApiResponse(code = 400, message = "Bad request", response = BadRequest.class),
      @ApiResponse(code = 420, message = "Error limited", response = ErrorLimited.class),
      @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class),
      @ApiResponse(code = 503, message = "Service unavailable", response = ServiceUnavailable.class),
      @ApiResponse(code = 504, message = "Gateway timeout", response = GatewayTimeout.class)})
  @RequestMapping(value = "/alliances/{alliance_id}/corporations/",
      produces = "application/json",
      consumes = "",
      method = RequestMethod.GET)
  Flux<Integer> getAlliancesAllianceIdCorporations(
      @Min(1) @ApiParam(value = "An EVE alliance ID", required = true) @PathVariable("alliance_id") Integer allianceId,
      @ApiParam(value = "The server name you would like data from", allowableValues = "tranquility, singularity", defaultValue = "tranquility") @Valid @RequestParam(value = "datasource", required = false, defaultValue = "tranquility") String datasource,
      @ApiParam(value = "ETag from a previous request. A 304 will be returned if this matches the current ETag") @RequestHeader(value = "If-None-Match", required = false) String ifNoneMatch);


  @ApiOperation(value = "Get alliance icon", nickname = "getAlliancesAllianceIdIcons", notes = "Get the icon urls for a alliance  --- Alternate route: `/dev/alliances/{alliance_id}/icons/`  Alternate route: `/legacy/alliances/{alliance_id}/icons/`  Alternate route: `/v1/alliances/{alliance_id}/icons/`  --- This route expires daily at 11:05", response = GetAlliancesAllianceIdIconsOk.class, tags = {"Alliance",})
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "Icon URLs for the given alliance id and server", response = GetAlliancesAllianceIdIconsOk.class),
      @ApiResponse(code = 304, message = "Not modified"),
      @ApiResponse(code = 400, message = "Bad request", response = BadRequest.class),
      @ApiResponse(code = 404, message = "No image server for this datasource", response = GetAlliancesAllianceIdIconsNotFound.class),
      @ApiResponse(code = 420, message = "Error limited", response = ErrorLimited.class),
      @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class),
      @ApiResponse(code = 503, message = "Service unavailable", response = ServiceUnavailable.class),
      @ApiResponse(code = 504, message = "Gateway timeout", response = GatewayTimeout.class)})
  @RequestMapping(value = "/alliances/{alliance_id}/icons/",
      produces = "application/json",
      consumes = "",
      method = RequestMethod.GET)
  Mono<GetAlliancesAllianceIdIconsOk> getAlliancesAllianceIdIcons(
      @Min(1) @ApiParam(value = "An EVE alliance ID", required = true) @PathVariable("alliance_id") Integer allianceId,
      @ApiParam(value = "The server name you would like data from", allowableValues = "tranquility, singularity", defaultValue = "tranquility") @Valid @RequestParam(value = "datasource", required = false, defaultValue = "tranquility") String datasource,
      @ApiParam(value = "ETag from a previous request. A 304 will be returned if this matches the current ETag") @RequestHeader(value = "If-None-Match", required = false) String ifNoneMatch);

}