package com.backend.whiskeywater.Order

import com.backend.whiskeywater.Customer.Customer
import com.backend.whiskeywater.Address.ShippingAddress
import java.io.Serializable
import java.sql.Date
import javax.persistence.*

@Entity
@Table (name="customer_order")
data class Order (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,
    @OneToOne
    val customer: Customer,
    @OneToOne
    val shippingAddress: ShippingAddress,
    val date_ordered: Date,
    val complete: Boolean,
        ): Serializable