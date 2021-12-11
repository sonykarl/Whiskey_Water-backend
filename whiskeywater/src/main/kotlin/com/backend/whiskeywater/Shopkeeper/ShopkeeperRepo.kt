package com.backend.whiskeywater.Shopkeeper

import org.springframework.data.repository.CrudRepository

interface ShopkeeperRepo:CrudRepository<Shopkeeper,Int> {
    fun getByUsername(username:String):Shopkeeper
}