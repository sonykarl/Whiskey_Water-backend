package com.backend.whiskeywater.customer

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1/registration")
class UserRegistrationController @Autowired constructor(val registrationService: RegistrationService, val validator: EmailValidator){

    @PostMapping
    fun register(@RequestBody body:RegistrationDTO):String{
        val isValidEmail = validator.test(body.email)
        if (!isValidEmail){
            throw IllegalStateException("email not valid")
        }
        return "registered"
    }
}