package com.backend.whiskeywater.Customer

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository : JpaRepository<Customer, Int>{
    fun findByEmail(email:String): Customer?
}