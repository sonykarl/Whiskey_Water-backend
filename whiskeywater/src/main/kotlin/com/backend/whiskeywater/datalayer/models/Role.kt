package com.backend.whiskeywater.datalayer.models

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

data class Role(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,
    val rolename:String
)
