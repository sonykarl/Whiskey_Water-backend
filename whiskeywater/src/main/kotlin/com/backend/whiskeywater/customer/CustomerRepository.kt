package com.backend.whiskeywater.customer

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.stereotype.Repository
import javax.transaction.Transactional

@Repository
interface CustomerRepository: JpaRepository<CustomerDetails, Long>{
    fun findByEmail(email:String?): UserDetails
}