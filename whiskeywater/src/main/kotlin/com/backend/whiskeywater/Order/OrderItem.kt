package com.backend.whiskeywater.Order

import com.backend.whiskeywater.Product.Product
import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name="orderItem")
data class OrderItem (
    @Id
    @OneToOne
    val product: Product,
    @ManyToOne
    val order: Order,
    val quantity: Int,
        ): Serializable