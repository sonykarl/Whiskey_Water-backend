package com.backend.whiskeywater.customer

import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import javax.persistence.*


@Entity
class CustomerDetails(
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    val id: Long = 0,
    @Column
    val name:String,
    @Column
    val email:String,
    @Column
    val passWord:String,
    @Column
    val locked:Boolean = true,
    @Column
    val enabled: Boolean = true )