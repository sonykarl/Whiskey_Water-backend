package com.backend.whiskeywater.Authentication

import com.backend.whiskeywater.Customer.Customer
import com.backend.whiskeywater.Customer.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class Authentication @Autowired constructor(val customerRepository: CustomerRepository){

    fun saveCustomer(customer: Customer):Customer{
        return customerRepository.save(customer)
    }
}