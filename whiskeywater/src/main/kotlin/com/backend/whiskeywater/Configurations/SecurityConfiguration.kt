package com.backend.whiskeywater.Configurations

import com.backend.whiskeywater.Customer.Data.repositories.CustomerRepository
import com.backend.whiskeywater.authentication.domain.services.CustomerDetailsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.authentication.dao.DaoAuthenticationProvider
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

@EnableWebSecurity
@Configuration
class SecurityConfiguration @Autowired constructor(private val customerDetailsService: CustomerDetailsService): WebSecurityConfigurerAdapter() {
    override fun configure(http: HttpSecurity?) {
        http
            ?.httpBasic()?.disable()
            ?.formLogin()?.disable()
    }

    override fun configure(auth: AuthenticationManagerBuilder?) {
        auth
            ?.authenticationProvider(authenticationProvider())
    }

    @Bean
    fun authenticationProvider():DaoAuthenticationProvider{
        val daoAuthenticationProvider = DaoAuthenticationProvider()
        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder())
        daoAuthenticationProvider.setUserDetailsService(customerDetailsService)
        return daoAuthenticationProvider
    }

    @Bean
    fun passwordEncoder():BCryptPasswordEncoder{
        return BCryptPasswordEncoder()
    }
}