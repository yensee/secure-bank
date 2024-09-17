package com.nc.sb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
// import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
// import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

//     public RestHeaderAuthFilter restHeaderAuthFilter(AuthenticationManager authenticationManager) {
//         RestHeaderAuthFilter filter = new RestHeaderAuthFilter(new AntPathRequestMatcher("/api/**"));
//         filter.setAuthenticationManager(authenticationManager);
//         return filter;
//     }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.securityMatcher("/api/**")
                .authorizeHttpRequests(authorize -> authorize
                        .anyRequest().authenticated())
                .httpBasic(withDefaults());
        return http.build();
    }

//     @Bean
//     public SecurityFilterChain formLoginFilterChain(HttpSecurity http) throws Exception {
//         http
//                 .authorizeHttpRequests(authorize -> authorize
//                         .anyRequest().authenticated())
//                 .formLogin(withDefaults());
//         return http.build();
//     }

//     @Bean
//     public SecurityFilterChain filterChainWithMVCFilters(HttpSecurity http) throws Exception {
//         http
//                 .authorizeHttpRequests(authorize -> authorize
//                         .anyRequest().authenticated())
//                 .httpBasic(withDefaults());
//         return http.build();
//     }

/*
    @Bean
    public SecurityFilterChain h2ConsoleSecurityFilterChain(HttpSecurity http) throws Exception {
        http.securityMatcher()
                .authorizeHttpRequests(authorize -> authorize
                        .anyRequest().authenticated())
                .httpBasic(withDefaults());
        return http.build();
    }

    protected SecurityFilterChain configure(HttpSecurity http) throws Exception {

        AuthenticationManager am = http.getSharedObject(AuthenticationManager.class);

        http.addFilterBefore(restHeaderAuthFilter(am), UsernamePasswordAuthenticationFilter.class);

        http.authorizeHttpRequests(authorize -> authorize
                .anyRequest().authenticated())
                .httpBasic(withDefaults());
        return http.build();

    }
*/
}
