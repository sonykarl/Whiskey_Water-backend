package com.backend.whiskeywater.customer

import org.springframework.stereotype.Service
import java.util.function.Predicate

@Service
class EmailValidator:Predicate<String> {
    override fun test(t: String): Boolean {
        return true
    }

}