package com.mogere.choir.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
class Member(
    @PrimaryKey(autoGenerate = true) val id:Int,
    val firstName:String,
    val lastName:String,
    val age:Int
//    val joined: Date,
//    val voicepart: Voice
    )
