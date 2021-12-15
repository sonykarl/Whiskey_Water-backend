package com.backend.whiskeywater.authentication.domain.services

import com.backend.whiskeywater.Customer.Data.repositories.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service

@Service
class CustomerDetailsService @Autowired constructor(val repository:CustomerRepository): UserDetailsService {
    override fun loadUserByUsername(username: String?): UserDetails {
        val customer = repository.findByEmail(username)
        val customerPrincipal = CustomerPrincipal(customer)
        return customerPrincipal
    }
}