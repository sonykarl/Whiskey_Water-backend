package com.backend.whiskeywater.Customer


import org.springframework.security.core.userdetails.UserDetails
import java.io.Serializable
import javax.persistence.*

@Entity
@Table
data class Customer(
    val first_name: String,
    val last_name : String,
    val password: String,
    @Id
    val email: String,
    val phone_number: Int,

): Serializable