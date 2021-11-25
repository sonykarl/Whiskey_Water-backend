package com.backend.whiskeywater.Customer

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface CustomerRepository: JpaRepository<Customer, String> {
    override fun findById(id: String): Optional<Customer> {
        TODO("Not yet implemented")
    }
}