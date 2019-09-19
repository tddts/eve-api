package com.github.tddts.eve.reactive.api;

import com.github.tddts.eve.reactive.config.EveReactiveClientConfiguration;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(contextId = "EveContractsClient", name = "${eve-swagger-interface.name:eve-swagger-interface}", url = "${eve-swagger-interface.url:https://esi.evetech.net/latest}", configuration = EveReactiveClientConfiguration.class)
public interface ContractsReactiveApiClient extends ContractsReactiveApi {
}