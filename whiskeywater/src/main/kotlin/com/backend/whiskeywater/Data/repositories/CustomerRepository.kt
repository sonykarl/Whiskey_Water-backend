package com.backend.whiskeywater.Data.repositories

import com.backend.whiskeywater.Data.models.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository: JpaRepository<Customer,Long> {
    fun findByEmailAndPassword(email:String,password:String): Customer?
}