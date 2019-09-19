/**
 * NOTE: This class is auto generated by the swagger code generator program (unset).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.github.tddts.eve.reactive.api;

import com.github.tddts.eve.model.characters.GetCharactersCharacterIdFittings200Ok;
import com.github.tddts.eve.model.characters.PostCharactersCharacterIdFittingsCreated;
import com.github.tddts.eve.model.characters.PostCharactersCharacterIdFittingsFitting;
import com.github.tddts.eve.model.error.*;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;
import javax.validation.constraints.Min;

@Api(value = "Fittings")
public interface FittingsReactiveApi {

  @ApiOperation(value = "Delete fitting", nickname = "deleteCharactersCharacterIdFittingsFittingId", notes = "Delete a fitting from a character  --- Alternate route: `/dev/characters/{character_id}/fittings/{fitting_id}/`  Alternate route: `/legacy/characters/{character_id}/fittings/{fitting_id}/`  Alternate route: `/v1/characters/{character_id}/fittings/{fitting_id}/` ", authorizations = {
      @Authorization(value = "evesso", scopes = {
          @AuthorizationScope(scope = "esi-fittings.write_fittings.v1", description = "EVE SSO scope esi-fittings.write_fittings.v1")
      })
  }, tags = {"Fittings",})
  @ApiResponses(value = {
      @ApiResponse(code = 204, message = "Fitting deleted"),
      @ApiResponse(code = 400, message = "Bad request", response = BadRequest.class),
      @ApiResponse(code = 401, message = "Unauthorized", response = Unauthorized.class),
      @ApiResponse(code = 403, message = "Forbidden", response = Forbidden.class),
      @ApiResponse(code = 420, message = "Error limited", response = ErrorLimited.class),
      @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class),
      @ApiResponse(code = 503, message = "Service unavailable", response = ServiceUnavailable.class),
      @ApiResponse(code = 504, message = "Gateway timeout", response = GatewayTimeout.class)})
  @RequestMapping(value = "/characters/{character_id}/fittings/{fitting_id}/",
      produces = "application/json",
      consumes = "",
      method = RequestMethod.DELETE)
  Void deleteCharactersCharacterIdFittingsFittingId(
      @Min(1) @ApiParam(value = "An EVE character ID", required = true) @PathVariable("character_id") Integer characterId,
      @ApiParam(value = "ID for a fitting of this character", required = true) @PathVariable("fitting_id") Integer fittingId,
      @ApiParam(value = "The server name you would like data from", allowableValues = "tranquility, singularity", defaultValue = "tranquility") @Valid @RequestParam(value = "datasource", required = false, defaultValue = "tranquility") String datasource,
      @ApiParam(value = "Access token to use if unable to set a header") @Valid @RequestParam(value = "token", required = false) String token);


  @ApiOperation(value = "Get fittings", nickname = "getCharactersCharacterIdFittings", notes = "Return fittings of a character  --- Alternate route: `/dev/characters/{character_id}/fittings/`  Alternate route: `/v2/characters/{character_id}/fittings/`  --- This route is cached for up to 300 seconds", response = GetCharactersCharacterIdFittings200Ok.class, responseContainer = "List", authorizations = {
      @Authorization(value = "evesso", scopes = {
          @AuthorizationScope(scope = "esi-fittings.read_fittings.v1", description = "EVE SSO scope esi-fittings.read_fittings.v1")
      })
  }, tags = {"Fittings",})
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "A list of fittings", response = GetCharactersCharacterIdFittings200Ok.class, responseContainer = "List"),
      @ApiResponse(code = 304, message = "Not modified"),
      @ApiResponse(code = 400, message = "Bad request", response = BadRequest.class),
      @ApiResponse(code = 401, message = "Unauthorized", response = Unauthorized.class),
      @ApiResponse(code = 403, message = "Forbidden", response = Forbidden.class),
      @ApiResponse(code = 420, message = "Error limited", response = ErrorLimited.class),
      @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class),
      @ApiResponse(code = 503, message = "Service unavailable", response = ServiceUnavailable.class),
      @ApiResponse(code = 504, message = "Gateway timeout", response = GatewayTimeout.class)})
  @RequestMapping(value = "/characters/{character_id}/fittings/",
      produces = "application/json",
      consumes = "",
      method = RequestMethod.GET)
  Flux<GetCharactersCharacterIdFittings200Ok> getCharactersCharacterIdFittings(
      @Min(1) @ApiParam(value = "An EVE character ID", required = true) @PathVariable("character_id") Integer characterId,
      @ApiParam(value = "The server name you would like data from", allowableValues = "tranquility, singularity", defaultValue = "tranquility") @Valid @RequestParam(value = "datasource", required = false, defaultValue = "tranquility") String datasource,
      @ApiParam(value = "ETag from a previous request. A 304 will be returned if this matches the current ETag") @RequestHeader(value = "If-None-Match", required = false) String ifNoneMatch,
      @ApiParam(value = "Access token to use if unable to set a header") @Valid @RequestParam(value = "token", required = false) String token);


  @ApiOperation(value = "Create fitting", nickname = "postCharactersCharacterIdFittings", notes = "Save a new fitting for a character  --- Alternate route: `/dev/characters/{character_id}/fittings/`  Alternate route: `/v2/characters/{character_id}/fittings/` ", response = PostCharactersCharacterIdFittingsCreated.class, authorizations = {
      @Authorization(value = "evesso", scopes = {
          @AuthorizationScope(scope = "esi-fittings.write_fittings.v1", description = "EVE SSO scope esi-fittings.write_fittings.v1")
      })
  }, tags = {"Fittings",})
  @ApiResponses(value = {
      @ApiResponse(code = 201, message = "A list of fittings", response = PostCharactersCharacterIdFittingsCreated.class),
      @ApiResponse(code = 400, message = "Bad request", response = BadRequest.class),
      @ApiResponse(code = 401, message = "Unauthorized", response = Unauthorized.class),
      @ApiResponse(code = 403, message = "Forbidden", response = Forbidden.class),
      @ApiResponse(code = 420, message = "Error limited", response = ErrorLimited.class),
      @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class),
      @ApiResponse(code = 503, message = "Service unavailable", response = ServiceUnavailable.class),
      @ApiResponse(code = 504, message = "Gateway timeout", response = GatewayTimeout.class)})
  @RequestMapping(value = "/characters/{character_id}/fittings/",
      produces = "application/json",
      consumes = "application/json",
      method = RequestMethod.POST)
  Mono<PostCharactersCharacterIdFittingsCreated> postCharactersCharacterIdFittings(
      @Min(1) @ApiParam(value = "An EVE character ID", required = true) @PathVariable("character_id") Integer characterId,
      @ApiParam(value = "Details about the new fitting", required = true) @Valid @RequestBody PostCharactersCharacterIdFittingsFitting fitting,
      @ApiParam(value = "The server name you would like data from", allowableValues = "tranquility, singularity", defaultValue = "tranquility") @Valid @RequestParam(value = "datasource", required = false, defaultValue = "tranquility") String datasource,
      @ApiParam(value = "Access token to use if unable to set a header") @Valid @RequestParam(value = "token", required = false) String token);

}
