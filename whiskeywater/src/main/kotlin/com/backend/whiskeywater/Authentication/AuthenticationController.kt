package com.backend.whiskeywater.Authentication

import com.backend.whiskeywater.Customer.Customer
import io.jsonwebtoken.Jwts
import io.jsonwebtoken.SignatureAlgorithm
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.web.bind.annotation.*
import java.util.*
import javax.servlet.http.Cookie
import javax.servlet.http.HttpServletResponse

@RestController
@RequestMapping("api")
class AuthenticationController @Autowired constructor(private val authenticationService: AuthenticationService){

    @GetMapping("")
    fun homePage(){
        val home = "you are welcome"
        home
    }

    @PostMapping("register")
    fun registerCustomer(@RequestBody body: RegisterDTO): ResponseEntity<Customer>{
        val customer = Customer()
        customer.firstName = body.firstName
        customer.lastName = body.lastName
        customer.email = body.email
        customer.phoneNumber = body.phoneNumber
        customer.password = body.pasword

        return ResponseEntity.ok(authenticationService.saveCustomer(customer))

    }
    @PostMapping("login")
    fun loginCustomer(@RequestBody body:LoginDTO, response: HttpServletResponse): ResponseEntity<Any>{
        val customer = authenticationService.loadUserByUsername(body.email)
        return ResponseEntity.ok(customer)
    }

}