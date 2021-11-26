package com.backend.whiskeywater.Customer

import org.springframework.data.jpa.repository.JpaRepository

interface CustomerRepository : JpaRepository<Customer, Int>{
    fun findByEmail(email:String): Customer?
}