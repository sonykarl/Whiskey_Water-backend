package com.backend.whiskeywater.Security

import com.backend.whiskeywater.Authentication.AuthenticationService
import com.backend.whiskeywater.Customer.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.authentication.dao.DaoAuthenticationProvider
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter


@EnableWebSecurity
@Configuration
class SecurityConfig @Autowired constructor(val authenticationService: AuthenticationService, val customerRepository: CustomerRepository): WebSecurityConfigurerAdapter() {

    override fun configure(auth: AuthenticationManagerBuilder?) {
        auth?.userDetailsService(authenticationService)?.passwordEncoder(passwordEncoder())
    }

    override fun configure(http: HttpSecurity?) {
        http?.authorizeRequests()
            ?.antMatchers("/admin")?.hasRole("ADMIN")
            ?.antMatchers("/user")?.hasAnyRole("ADMIN","USER")
            ?.antMatchers("/admin")?.permitAll()
            ?.and()?.formLogin()
    }

    @Bean
    fun passwordEncoder():PasswordEncoder = BCryptPasswordEncoder()


}