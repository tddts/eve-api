package com.github.tddts.eve.reactive.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * @author Tigran Dadaiants
 */
@Configuration
@EnableFeignClients(basePackages = "com.github.tddts.eve.reactive.api")
public class EveReactiveApiConfig {

}
