package com.github.tddts.eve.api;

import com.github.tddts.eve.config.EveClientConfiguration;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(contextId = "EveFactionWarfareClient", name = "${eve-swagger-interface.name:eve-swagger-interface}", url = "${eve-swagger-interface.url:https://esi.evetech.net/latest}", configuration = EveClientConfiguration.class)
public interface FactionWarfareApiClient extends FactionWarfareApi {
}