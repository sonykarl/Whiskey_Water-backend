package com.backend.whiskeywater.datalayer

import com.backend.whiskeywater.Customer.Customer
import org.springframework.data.jpa.repository.JpaRepository

interface CustomerRepository: JpaRepository<Customer, Long> {
    fun findByEmail(email:String):Customer?
}