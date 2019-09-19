package com.github.tddts.eve.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.security.oauth2.client.feign.OAuth2FeignRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;

@Configuration
@EnableConfigurationProperties
public class EveClientConfiguration {

  @Bean
  @ConditionalOnProperty("spring.security.oauth2.client.registration.eve.client-id")
  public OAuth2FeignRequestInterceptor evessoRequestInterceptor(OAuth2ProtectedResourceDetails resourceDetails) {
    return new OAuth2FeignRequestInterceptor(new DefaultOAuth2ClientContext(), resourceDetails);
  }
}
