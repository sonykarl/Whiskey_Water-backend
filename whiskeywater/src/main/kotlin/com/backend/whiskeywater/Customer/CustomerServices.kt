package com.backend.whiskeywater.Customer

import org.springframework.beans.factory.annotation.Autowired

class CustomerServices  @Autowired constructor(val customerRepository: CustomerRepository){
    fun save(customer: Customer){
        customerRepository.save(customer)
    }

    fun findByEmail(email:String):Customer?{
        return customerRepository.findByEmail(email)
    }
}