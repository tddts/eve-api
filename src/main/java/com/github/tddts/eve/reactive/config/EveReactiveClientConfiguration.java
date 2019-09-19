package com.github.tddts.eve.reactive.config;

import org.springframework.cloud.security.oauth2.client.feign.OAuth2FeignRequestInterceptor;
import org.springframework.context.annotation.Configuration;

/**
 * @author Tigran Dadaiants
 */
@Configuration
public class EveReactiveClientConfiguration {

  public OAuth2FeignRequestInterceptor oAuth2FeignRequestInterceptor(){
    return new ReactiveOAuth2FeignRequestInterceptor();
  }
}
