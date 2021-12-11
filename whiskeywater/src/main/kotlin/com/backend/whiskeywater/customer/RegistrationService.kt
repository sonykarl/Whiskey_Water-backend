package com.backend.whiskeywater.customer

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import kotlin.jvm.Throws
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer

@Service
class RegistrationService @Autowired constructor(val repository: CustomerRepository, val customerService: CustomerService){

    fun signUpUser(customerDetails: CustomerDetails):String?{
        val exists = repository.findByEmail(customerDetails.email)
        if (exists != null){
            repository.save(customerDetails)
            return "user saved"
        }else
        {
            return "email exists"
        }
    }
}