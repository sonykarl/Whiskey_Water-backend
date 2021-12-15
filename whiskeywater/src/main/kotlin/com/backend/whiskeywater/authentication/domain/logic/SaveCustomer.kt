package com.backend.whiskeywater.authentication.domain.logic

import com.backend.whiskeywater.Customer.Data.models.Customer
import com.backend.whiskeywater.Customer.Data.repositories.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired

class SaveCustomer @Autowired constructor(val repository: CustomerRepository) {
    fun saveCustomer(customer:Customer){
        repository.save(customer)
    }
}