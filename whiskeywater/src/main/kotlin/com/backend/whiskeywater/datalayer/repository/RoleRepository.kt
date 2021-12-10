package com.backend.whiskeywater.datalayer.repository

import com.backend.whiskeywater.datalayer.models.Role
import org.springframework.data.jpa.repository.JpaRepository

interface RoleRepository:JpaRepository<Role,Long> {
    fun findByRolename(rolename:String): Role
}