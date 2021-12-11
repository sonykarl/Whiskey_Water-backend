package com.backend.whiskeywater.customer

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder

data class RegistrationDTO (
    val Name:String,
    val password:String,
    val email:String,
        )
