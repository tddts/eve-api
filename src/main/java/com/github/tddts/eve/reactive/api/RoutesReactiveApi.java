/**
 * NOTE: This class is auto generated by the swagger code generator program (unset).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.github.tddts.eve.reactive.api;

import com.github.tddts.eve.model.error.*;
import com.github.tddts.eve.model.misc.GetRouteOriginDestinationNotFound;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import javax.validation.Valid;
import javax.validation.constraints.Size;

@Api(value = "Routes")
public interface RoutesReactiveApi {

  @ApiOperation(value = "Get route", nickname = "getRouteOriginDestination", notes = "Get the systems between origin and destination  --- Alternate route: `/dev/route/{origin}/{destination}/`  Alternate route: `/legacy/route/{origin}/{destination}/`  Alternate route: `/v1/route/{origin}/{destination}/`  --- This route is cached for up to 86400 seconds", response = Integer.class, responseContainer = "List", tags = {"Routes",})
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "Solar systems in route from origin to destination", response = Integer.class, responseContainer = "List"),
      @ApiResponse(code = 304, message = "Not modified"),
      @ApiResponse(code = 400, message = "Bad request", response = BadRequest.class),
      @ApiResponse(code = 404, message = "No route found", response = GetRouteOriginDestinationNotFound.class),
      @ApiResponse(code = 420, message = "Error limited", response = ErrorLimited.class),
      @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class),
      @ApiResponse(code = 503, message = "Service unavailable", response = ServiceUnavailable.class),
      @ApiResponse(code = 504, message = "Gateway timeout", response = GatewayTimeout.class)})
  @RequestMapping(value = "/route/{origin}/{destination}/",
      produces = "application/json",
      consumes = "",
      method = RequestMethod.GET)
  Flux<Integer> getRouteOriginDestination(@ApiParam(value = "destination solar system ID", required = true) @PathVariable("destination") Integer destination,
      @ApiParam(value = "origin solar system ID", required = true) @PathVariable("origin") Integer origin,
      @Size(max = 100) @ApiParam(value = "avoid solar system ID(s)") @Valid @RequestParam(value = "avoid", required = false) Flux<Integer> avoid,
      @Size(max = 100) @ApiParam(value = "connected solar system pairs") @Valid @RequestParam(value = "connections", required = false) Flux<Flux<Integer>> connections,
      @ApiParam(value = "The server name you would like data from", allowableValues = "tranquility, singularity", defaultValue = "tranquility") @Valid @RequestParam(value = "datasource", required = false, defaultValue = "tranquility") String datasource,
      @ApiParam(value = "route security preference", allowableValues = "shortest, secure, insecure", defaultValue = "shortest") @Valid @RequestParam(value = "flag", required = false, defaultValue = "shortest") String flag,
      @ApiParam(value = "ETag from a previous request. A 304 will be returned if this matches the current ETag") @RequestHeader(value = "If-None-Match", required = false) String ifNoneMatch);

}
