package com.backend.whiskeywater.Customer


import java.io.Serializable
import javax.persistence.*

@Entity
@Table
data class Customer(
    val first_name: String,
    val last_name : String,
    @Id
    val email: String,
    val phone_number: String,

): Serializable