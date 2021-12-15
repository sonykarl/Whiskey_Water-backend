package com.backend.whiskeywater.authentication.domain.services

import com.backend.whiskeywater.Customer.Data.models.Customer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

class CustomerPrincipal  @Autowired constructor(val customer: Customer):UserDetails {
    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
        TODO("Not yet implemented")
    }

    override fun getPassword(): String {
        return customer.password
    }

    override fun getUsername(): String {
        return customer.email
    }

    override fun isAccountNonExpired(): Boolean {
        return false
    }

    override fun isAccountNonLocked(): Boolean {
        return false
    }

    override fun isCredentialsNonExpired(): Boolean {
        return false
    }

    override fun isEnabled(): Boolean {
        return true
    }
}