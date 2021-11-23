package com.backend.whiskeywater.Product

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table


@Entity
@Table
data class Product (
    @Id
    val name: String,
    val category: String,
    val description: String,
    val price: Int,
    val image: String
        )