package com.backend.whiskeywater.Shopkeeper

import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService

class ShopkeeperDetailsService : UserDetailsService{
    override fun loadUserByUsername(username: String?): UserDetails {
        TODO("Not yet implemented")
    }
}