package com.backend.whiskeywater.Customer

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
class CustomerController @Autowired constructor(val repository: CustomerRepository) {

    @GetMapping("/customer")
    fun getCustomers(): MutableIterable<Customer>{
        return repository.findAll()
    }
}