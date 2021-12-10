package com.backend.whiskeywater.customer

import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import javax.persistence.*


@Entity
class CustomerDetails(
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    val id: Long,
    @Column
    val name:String,
    @Column
    val email:String,
    @Column
    val passWord:String,
    @Column
    @Enumerated(EnumType.STRING)
    val customerRole:CustomerRole,
    @Column
    val locked:Boolean,
    @Column
    val enabled: Boolean):UserDetails {


    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
        TODO("Not yet implemented")
    }

    override fun getPassword(): String {
        return passWord
    }

    override fun getUsername(): String {
        return email
    }

    override fun isAccountNonExpired(): Boolean {
        return true
    }

    override fun isAccountNonLocked(): Boolean {
        return !locked
    }

    override fun isCredentialsNonExpired(): Boolean {
        return true
    }

    override fun isEnabled(): Boolean {
        return enabled
    }
}