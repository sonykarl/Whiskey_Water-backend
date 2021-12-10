package com.backend.whiskeywater.customer

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.authentication.dao.DaoAuthenticationProvider
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

@Configuration
@EnableWebSecurity
class Websecurityconfig @Autowired constructor(private val customerservice: CustomerService, val passwordConfig: PasswordConfig): WebSecurityConfigurerAdapter(){
    override fun configure(http: HttpSecurity?) {
        http
            ?.csrf()?.disable()
            ?.authorizeRequests()
            ?.antMatchers("/api/v*/registration/**")
            ?.permitAll()
            ?.anyRequest()
            ?.authenticated()?.and()
            ?.formLogin()
    }

    override fun configure(auth: AuthenticationManagerBuilder?) {
        auth
            ?.authenticationProvider(authentication())
    }
    @Bean
    fun authentication():DaoAuthenticationProvider{
        val provider = DaoAuthenticationProvider()
        provider.setPasswordEncoder(passwordConfig.passwordEncoder())
        provider.setUserDetailsService(customerservice)
        return provider
    }
}