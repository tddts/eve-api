/**
 * NOTE: This class is auto generated by the swagger code generator program (unset).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.github.tddts.eve.api;

import com.github.tddts.eve.model.characters.GetCharactersCharacterIdSearchOk;
import com.github.tddts.eve.model.error.*;
import com.github.tddts.eve.model.misc.GetSearchOk;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Api(value = "Search")
public interface SearchApi {

  @ApiOperation(value = "Search on a string", nickname = "getCharactersCharacterIdSearch", notes = "Search for entities that match a given sub-string.  --- Alternate route: `/dev/characters/{character_id}/search/`  Alternate route: `/legacy/characters/{character_id}/search/`  Alternate route: `/v3/characters/{character_id}/search/`  --- This route is cached for up to 3600 seconds", response = GetCharactersCharacterIdSearchOk.class, authorizations = {
      @Authorization(value = "evesso", scopes = {
          @AuthorizationScope(scope = "esi-search.search_structures.v1", description = "EVE SSO scope esi-search.search_structures.v1")
      })
  }, tags = {"Search",})
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "A list of search results", response = GetCharactersCharacterIdSearchOk.class),
      @ApiResponse(code = 304, message = "Not modified"),
      @ApiResponse(code = 400, message = "Bad request", response = BadRequest.class),
      @ApiResponse(code = 401, message = "Unauthorized", response = Unauthorized.class),
      @ApiResponse(code = 403, message = "Forbidden", response = Forbidden.class),
      @ApiResponse(code = 420, message = "Error limited", response = ErrorLimited.class),
      @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class),
      @ApiResponse(code = 503, message = "Service unavailable", response = ServiceUnavailable.class),
      @ApiResponse(code = 504, message = "Gateway timeout", response = GatewayTimeout.class)})
  @RequestMapping(value = "/characters/{character_id}/search/",
      produces = "application/json",
      consumes = "",
      method = RequestMethod.GET)
  GetCharactersCharacterIdSearchOk getCharactersCharacterIdSearch(
      @NotNull @Size(min = 1, max = 11) @ApiParam(value = "Type of entities to search for", required = true, allowableValues = "agent, alliance, character, constellation, corporation, faction, inventory_type, region, solar_system, station, structure") @Valid @RequestParam(value = "categories", required = true) List<String> categories,
      @Min(1) @ApiParam(value = "An EVE character ID", required = true) @PathVariable("character_id") Integer characterId,
      @NotNull @Size(min = 3) @ApiParam(value = "The string to search on", required = true) @Valid @RequestParam(value = "search", required = true) String search,
      @ApiParam(value = "Language to use in the response", allowableValues = "de, en-us, fr, ja, ru, zh", defaultValue = "en-us") @RequestHeader(value = "Accept-Language", required = false) String acceptLanguage,
      @ApiParam(value = "The server name you would like data from", allowableValues = "tranquility, singularity", defaultValue = "tranquility") @Valid @RequestParam(value = "datasource", required = false, defaultValue = "tranquility") String datasource,
      @ApiParam(value = "ETag from a previous request. A 304 will be returned if this matches the current ETag") @RequestHeader(value = "If-None-Match", required = false) String ifNoneMatch,
      @ApiParam(value = "Language to use in the response, takes precedence over Accept-Language", allowableValues = "de, en-us, fr, ja, ru, zh", defaultValue = "en-us") @Valid @RequestParam(value = "language", required = false, defaultValue = "en-us") String language,
      @ApiParam(value = "Whether the search should be a strict match", defaultValue = "false") @Valid @RequestParam(value = "strict", required = false, defaultValue = "false") Boolean strict,
      @ApiParam(value = "Access token to use if unable to set a header") @Valid @RequestParam(value = "token", required = false) String token);


  @ApiOperation(value = "Search on a string", nickname = "getSearch", notes = "Search for entities that match a given sub-string.  --- Alternate route: `/dev/search/`  Alternate route: `/legacy/search/`  Alternate route: `/v2/search/`  --- This route is cached for up to 3600 seconds", response = GetSearchOk.class, tags = {"Search",})
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "A list of search results", response = GetSearchOk.class),
      @ApiResponse(code = 304, message = "Not modified"),
      @ApiResponse(code = 400, message = "Bad request", response = BadRequest.class),
      @ApiResponse(code = 420, message = "Error limited", response = ErrorLimited.class),
      @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class),
      @ApiResponse(code = 503, message = "Service unavailable", response = ServiceUnavailable.class),
      @ApiResponse(code = 504, message = "Gateway timeout", response = GatewayTimeout.class)})
  @RequestMapping(value = "/search/",
      produces = "application/json",
      consumes = "",
      method = RequestMethod.GET)
  GetSearchOk getSearch(
      @NotNull @Size(min = 1, max = 10) @ApiParam(value = "Type of entities to search for", required = true, allowableValues = "agent, alliance, character, constellation, corporation, faction, inventory_type, region, solar_system, station") @Valid @RequestParam(value = "categories", required = true) List<String> categories,
      @NotNull @Size(min = 3) @ApiParam(value = "The string to search on", required = true) @Valid @RequestParam(value = "search", required = true) String search,
      @ApiParam(value = "Language to use in the response", allowableValues = "de, en-us, fr, ja, ru, zh", defaultValue = "en-us") @RequestHeader(value = "Accept-Language", required = false) String acceptLanguage,
      @ApiParam(value = "The server name you would like data from", allowableValues = "tranquility, singularity", defaultValue = "tranquility") @Valid @RequestParam(value = "datasource", required = false, defaultValue = "tranquility") String datasource,
      @ApiParam(value = "ETag from a previous request. A 304 will be returned if this matches the current ETag") @RequestHeader(value = "If-None-Match", required = false) String ifNoneMatch,
      @ApiParam(value = "Language to use in the response, takes precedence over Accept-Language", allowableValues = "de, en-us, fr, ja, ru, zh", defaultValue = "en-us") @Valid @RequestParam(value = "language", required = false, defaultValue = "en-us") String language,
      @ApiParam(value = "Whether the search should be a strict match", defaultValue = "false") @Valid @RequestParam(value = "strict", required = false, defaultValue = "false") Boolean strict);

}
