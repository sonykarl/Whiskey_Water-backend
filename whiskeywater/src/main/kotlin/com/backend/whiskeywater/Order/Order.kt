package com.backend.whiskeywater.Order

import com.backend.whiskeywater.Customer.Customer
import com.backend.whiskeywater.Address.ShippingAddress
import java.sql.Date
import javax.persistence.*

@Entity
@Table (name="order")
data class Order (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,
    @OneToMany(mappedBy="order")
    val customer: Customer,
    @OneToMany
    val shippingAddress: ShippingAddress,
    val date_ordered: Date,
    val complete: Boolean,
        )