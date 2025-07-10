package org.cherry.hergy_vanilla.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/contact/**").permitAll() // Autorise la route API Contact sans auth
                        .anyRequest().authenticated() // Les autres routes nécessitent une auth (si tu en as)
                )
                .csrf(csrf -> csrf.disable());
        return http.build();
    }
}
