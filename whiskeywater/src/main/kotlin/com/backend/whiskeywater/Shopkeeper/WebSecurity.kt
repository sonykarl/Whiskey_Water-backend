package com.backend.whiskeywater.Shopkeeper

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.authentication.dao.DaoAuthenticationProvider
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

@Configuration
@EnableWebSecurity
class WebSecurity @Autowired constructor(val repo: ShopkeeperRepo): WebSecurityConfigurerAdapter(){

    @Bean
    fun shopkeeperDetailsService():ShopkeeperDetailsService{
        return ShopkeeperDetailsService(repo)
    }
    @Bean
    fun passwordEncoder():BCryptPasswordEncoder{
        return BCryptPasswordEncoder()
    }
    @Bean
    fun authenticationProvider():DaoAuthenticationProvider{
        val authenticationProvider = DaoAuthenticationProvider()
        authenticationProvider.setUserDetailsService(shopkeeperDetailsService())
        authenticationProvider.setPasswordEncoder(passwordEncoder())
        return authenticationProvider
    }
}