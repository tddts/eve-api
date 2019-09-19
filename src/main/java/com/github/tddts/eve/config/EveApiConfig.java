package com.github.tddts.eve.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * @author Tigran Dadaiants
 */
@Configuration
@EnableFeignClients(basePackages = "com.github.tddts.eve.api")
public class EveApiConfig {

}
