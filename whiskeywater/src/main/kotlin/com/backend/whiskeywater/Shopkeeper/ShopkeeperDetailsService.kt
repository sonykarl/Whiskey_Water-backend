package com.backend.whiskeywater.Shopkeeper

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService

class ShopkeeperDetailsService @Autowired constructor(val repo: ShopkeeperRepo): UserDetailsService{
    override fun loadUserByUsername(username: String?): UserDetails {
        val shopkeeper = repo.findByUsername(username)
        return ShopkeeperDetails(shopkeeper)
    }
}