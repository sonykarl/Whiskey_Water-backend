package com.backend.whiskeywater.Shopkeeper

import javax.persistence.*

@Entity
data class Shopkeeper (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id:Int = 0,
    @Column
    val email:String,
    @Column
    val password:String,
    @Column
    val enabled:Boolean = true
        )