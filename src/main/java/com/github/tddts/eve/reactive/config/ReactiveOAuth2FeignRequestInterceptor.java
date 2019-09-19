package com.github.tddts.eve.reactive.config;

import org.springframework.cloud.security.oauth2.client.feign.OAuth2FeignRequestInterceptor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;

/**
 * @author Tigran Dadaiants
 */
public class ReactiveOAuth2FeignRequestInterceptor extends OAuth2FeignRequestInterceptor {

  public ReactiveOAuth2FeignRequestInterceptor() {
    super(null, null);
  }

  @Override
  public OAuth2AccessToken getToken() {
    Authentication authentication = SecurityContextHolder.getContext()
        .getAuthentication();
    if (authentication != null) {
      Object details = authentication.getDetails();
      if (details instanceof OAuth2AuthenticationDetails) {
        OAuth2AuthenticationDetails holder = (OAuth2AuthenticationDetails) details;
        String token = holder.getTokenValue();
        DefaultOAuth2AccessToken accessToken = new DefaultOAuth2AccessToken(
            token);
        String tokenType = holder.getTokenType();
        if (tokenType != null) {
          accessToken.setTokenType(tokenType);
        }
        return accessToken;
      }
    }
    return super.getToken();
  }
}
