package com.backend.whiskeywater.Address

import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table
data class ShippingAddress (
    @Id
    val estate: String,
    val building: String,
    val city_or_town: String,
    val address: String,
        ): Serializable