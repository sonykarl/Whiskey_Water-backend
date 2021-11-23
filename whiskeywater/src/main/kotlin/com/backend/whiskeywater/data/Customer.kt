package com.backend.whiskeywater.data

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table
data class Customer(
    val first_name: String,
    val last_name : String,
    @Id
    val email: String,
    val phone_number: String,

)