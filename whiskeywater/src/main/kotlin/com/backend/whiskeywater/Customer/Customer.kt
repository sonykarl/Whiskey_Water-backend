package com.backend.whiskeywater.Customer

import com.backend.whiskeywater.Order.Order
import javax.persistence.*

@Entity
@Table
data class Customer(
    val first_name: String,
    val last_name : String,
    @Id
    val email: String,
    val phone_number: String,

) {
    @ManyToOne
    @JoinColumn(name = "order_id", unique = true)
    open var order: Order? = null
}