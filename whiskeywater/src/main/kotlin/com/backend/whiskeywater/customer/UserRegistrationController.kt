package com.backend.whiskeywater.customer

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1/registration")
class UserRegistrationController @Autowired constructor(val registrationService: RegistrationService, val passwordConfig: PasswordConfig){

    @PostMapping
    fun register(@RequestBody body:RegistrationDTO):String{
        val customerDetails = CustomerDetails(email = body.email, passWord = passwordConfig.passwordEncoder().encode(body.password), name = body.name)
        registrationService.signUpUser(customerDetails)
        if (customerDetails != null){
            return "user saved"
        }else{
            return "user not saved"
        }
    }
}