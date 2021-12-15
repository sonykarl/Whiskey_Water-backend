package com.backend.whiskeywater.Configurations

import org.springframework.context.annotation.Bean
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

class SecurityConfiguration: WebSecurityConfigurerAdapter() {
    override fun configure(http: HttpSecurity?) {
        super.configure(http)
    }

    @Bean
    fun passwordEncoder():BCryptPasswordEncoder{
        return BCryptPasswordEncoder()
    }
}