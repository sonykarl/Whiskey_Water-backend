package com.backend.whiskeywater.datalayer

import com.backend.whiskeywater.Customer.Role
import org.springframework.data.jpa.repository.JpaRepository

interface RoleRepository:JpaRepository<Role,Long> {
    fun findByRolename(rolename:String):Role
}