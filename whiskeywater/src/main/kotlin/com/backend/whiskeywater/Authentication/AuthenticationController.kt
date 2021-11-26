package com.backend.whiskeywater.Authentication

import com.backend.whiskeywater.Customer.Customer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api")
class AuthenticationController @Autowired constructor(private val authenticationService: AuthenticationService){

    @PostMapping("register")
    fun registerCustomer(@RequestBody body: RegisterDTO): ResponseEntity<Customer>{
        val customer = Customer()
        customer.firstName = body.firstName
        customer.lastName = body.lastName
        customer.email = body.email
        customer.password = body.pasword

        return ResponseEntity.ok(authenticationService.RegisterCustomer(customer))

    }

}