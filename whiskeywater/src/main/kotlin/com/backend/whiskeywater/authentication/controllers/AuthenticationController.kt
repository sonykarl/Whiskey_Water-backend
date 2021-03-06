package com.backend.whiskeywater.authentication.controllers

import com.backend.whiskeywater.Customer.Data.models.Customer
import com.backend.whiskeywater.authentication.data.LoginDTO
import com.backend.whiskeywater.authentication.data.RegisterDto
import com.backend.whiskeywater.authentication.domain.logic.SaveCustomer
import com.backend.whiskeywater.authentication.domain.services.CustomerDetailsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1/authentication")
class AuthenticationController @Autowired constructor(val passwordEncoder: BCryptPasswordEncoder,val customerDetailsService: CustomerDetailsService, val saveCustomer: SaveCustomer){

    @PostMapping("register")
    fun registerCustomer(@RequestBody body: RegisterDto): String{
        val customer = Customer(email = body.email, firstName = body.firstName,
            lastName = body.lastName, password = passwordEncoder.encode(body.password), authority = body.authority)
        return if (customer != null){
            saveCustomer.saveCustomer(customer)
            "customer saved"
        }else{
            "customer not saved"
        }

    }

    @PostMapping("login")
    fun loginCustomer(@RequestBody body: LoginDTO):String{
         val customerdetails = customerDetailsService.loadUserByUsername(body.email)
        return if (passwordEncoder.matches(body.password,customerdetails.password)){
            return "logged in"
        }else{
            return "details invalid"
        }

    }
}