package com.backend.whiskeywater.authentication.data


data class RegisterDto(
    val id: Long,
    val email: String,
    val firstName: String,
    val lastName: String?,
    val password: String,
    val authority: String
)
