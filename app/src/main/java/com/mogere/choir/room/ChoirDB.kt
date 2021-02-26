package com.mogere.choir.room

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.mogere.choir.models.Activity
import com.mogere.choir.models.Member

@Database(version = 1, entities = [Member::class, Activity::class])
abstract class ChoirDB : RoomDatabase() {
    companion object{
        fun get(application:Application):ChoirDB{
            return Room.databaseBuilder(application, ChoirDB::class.java, "choir")
                .build()
        }
    }
}