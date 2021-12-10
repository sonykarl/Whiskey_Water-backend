package com.backend.whiskeywater.customer

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1/registration")
class UserRegistrationController @Autowired constructor(registrationService: RegistrationService){
    fun register(@RequestBody body:RegistrationDTO):String{
        return "registered"
    }
}