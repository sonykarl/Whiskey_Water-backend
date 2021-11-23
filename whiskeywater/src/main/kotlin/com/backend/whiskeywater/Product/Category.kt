package com.backend.whiskeywater.Product

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="category")
data class Category(
    @Id
    val name: String
)