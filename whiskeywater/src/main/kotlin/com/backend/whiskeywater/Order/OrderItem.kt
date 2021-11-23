package com.backend.whiskeywater.Order

import com.backend.whiskeywater.Product.Product
import javax.persistence.*

@Entity
@Table(name="orderItem")
data class OrderItem (
    @Id
    @OneToMany
    val product: Product,
    @ManyToOne
    val order: Order,
    val quantity: Int,
        )