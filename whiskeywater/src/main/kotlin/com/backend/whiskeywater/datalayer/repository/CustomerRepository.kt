package com.backend.whiskeywater.datalayer.repository

import com.backend.whiskeywater.datalayer.models.Customer
import org.springframework.data.jpa.repository.JpaRepository

interface CustomerRepository: JpaRepository<Customer, Long> {
    fun findByEmail(email:String): Customer?
}