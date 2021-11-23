package com.backend.whiskeywater.Product

import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToOne
import javax.persistence.Table


@Entity
@Table
data class Product (
    @Id
    val name: String,
    @OneToOne
    val category: Category,
    val description: String,
    val price: Int,
    val image: String
        ): Serializable