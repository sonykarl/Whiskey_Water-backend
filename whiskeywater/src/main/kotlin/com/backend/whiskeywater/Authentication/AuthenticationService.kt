package com.backend.whiskeywater.Authentication

import com.backend.whiskeywater.Customer.Customer
import com.backend.whiskeywater.Customer.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Service

@Service
class AuthenticationService @Autowired constructor(private val customerRepository: CustomerRepository) {

    fun RegisterCustomer(customer: Customer): Customer {
        return customerRepository.save(customer)
    }

    fun findByEmail(email:String): Customer?{
        return customerRepository.findByEmail(email)
    }

    fun comparePassword(password: String): Boolean{
        val passwordEncoder = BCryptPasswordEncoder()
        return passwordEncoder.matches(password,Customer().password)
    }
}
