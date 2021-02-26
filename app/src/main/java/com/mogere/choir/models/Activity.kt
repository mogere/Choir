package com.mogere.choir.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Activity(
    @PrimaryKey (autoGenerate = true) val id:Int,
    val type:String,
    val name:String,
    val member:Member
)