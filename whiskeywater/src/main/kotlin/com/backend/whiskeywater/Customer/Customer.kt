package com.backend.whiskeywater.Customer

import javax.persistence.*

@Entity
data class Customer(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int,
    val firstname:String,
    val lastName: String,
    val userName: String,
    val email:String,
    val password: String,

    @ManyToMany
    val role: Role
)