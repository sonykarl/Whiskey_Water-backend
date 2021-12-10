package com.backend.whiskeywater.customer

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Service


@Configuration
class PasswordConfig{

    @Bean
    fun passwordEncoder():BCryptPasswordEncoder{
        return BCryptPasswordEncoder()
    }
}