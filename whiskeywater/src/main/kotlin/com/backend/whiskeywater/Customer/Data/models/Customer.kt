package com.backend.whiskeywater.Customer.Data.models

import javax.persistence.*

@Entity
data class Customer (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0,
    @Column(unique = true)
    val email: String,
    @Column
    val firstName: String,
    @Column
    val lastName: String?,
    @Column
    val password: String,
    @Column
    val authority: String
        )