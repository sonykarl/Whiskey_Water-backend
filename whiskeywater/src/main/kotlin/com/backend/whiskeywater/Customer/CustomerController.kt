package com.backend.whiskeywater.Customer

import com.backend.whiskeywater.Authentication.Authentication
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController @Autowired constructor(val repository: CustomerRepository, val authenticaTion:Authentication){

    @GetMapping("/me")
    suspend fun me(@AuthenticationPrincipal principal: Principal): Profile {
        return Profile(principal.name)
    }
}