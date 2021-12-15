package com.backend.whiskeywater.Data.models

import javax.persistence.*

@Entity
data class Customer (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,
    @Column(unique = true)
    val email: String,
    @Column
    val firstName: String,
    @Column
    val lastName: String?,
    @Column
    val password: String
        )