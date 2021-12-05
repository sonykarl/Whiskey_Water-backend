package com.backend.whiskeywater.Authentication

import com.backend.whiskeywater.Customer.Customer
import com.backend.whiskeywater.Customer.CustomerDetails
import com.backend.whiskeywater.Customer.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.security.SecurityProperties
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Service
import kotlin.jvm.Throws

@Service
class AuthenticationService @Autowired constructor(val customerRepository: CustomerRepository): UserDetailsService{

    private val passwordEncoder: BCryptPasswordEncoder? = null

    fun saveCustomer(customer: Customer): Customer?{
        return customerRepository.save(customer)
    }

    @Throws(UsernameNotFoundException::class)
    override fun loadUserByUsername(username: String): UserDetails {
        val customerdetails = customerRepository.findByEmail(username)
        return CustomerDetails(customerdetails)
    }


    val all: List<Customer>? = customerRepository.findAll()




}
