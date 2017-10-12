package com.auth0.samples.authapi.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.auth0.samples")
// @EntityScan(basePackages = {"EntityPackage"})
// @EnableJpaRepositories(basePackages =
// {"com.auth0.samples.authapi.user.ApplicationUserRepository"})
public class Config {

  @Bean
  public BCryptPasswordEncoder bCryptPasswordEncoder() {
    return new BCryptPasswordEncoder();
  }

}
