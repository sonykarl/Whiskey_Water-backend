package com.backend.whiskeywater.data

import java.sql.Date
import javax.persistence.*

@Entity
@Table
data class Order (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,
    @OneToMany
    val customer: Customer,
    @OneToMany
    val shippingAddress: ShippingAddress,
    val date_ordered: Date,
    val complete: Boolean,
        )