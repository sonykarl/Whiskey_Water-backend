package com.backend.whiskeywater.customer

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class RegistrationService @Autowired constructor(val repository: CustomerRepository, val customerService: CustomerService){

    fun signUpUser(customerDetails: CustomerDetails){
        repository.save(customerDetails)
    }
}