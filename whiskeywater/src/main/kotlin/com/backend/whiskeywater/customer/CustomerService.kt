package com.backend.whiskeywater.customer

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service

@Service
class CustomerService @Autowired constructor(private val repository: CustomerRepository): UserDetailsService {

    override fun loadUserByUsername(username: String?): UserDetails {
        return repository.findByEmail(username)
    }
}