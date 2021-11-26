package com.backend.whiskeywater

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [SecurityAutoConfiguration::class])
class WhiskeywaterApplication

fun main(args: Array<String>) {
	runApplication<WhiskeywaterApplication>(*args)
}
