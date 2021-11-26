package com.backend.whiskeywater.Authentication

import com.backend.whiskeywater.Customer.Customer
import com.backend.whiskeywater.Customer.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired

class AuthenticationService @Autowired constructor(private val customerRepository: CustomerRepository) {

    fun RegisterCustomer(customer: Customer): Customer {
        return customerRepository.save(customer)
    }

    fun findByEmail(email:String): Customer?{
        return customerRepository.findByEmail(email)
    }
}
