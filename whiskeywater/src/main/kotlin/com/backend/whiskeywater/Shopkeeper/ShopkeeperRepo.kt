package com.backend.whiskeywater.Shopkeeper

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository

interface ShopkeeperRepo:JpaRepository<Shopkeeper,Int> {
    fun findByUsername(username:String?):Shopkeeper?
}