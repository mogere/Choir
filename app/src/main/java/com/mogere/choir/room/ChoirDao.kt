package com.mogere.choir.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.mogere.choir.models.Activity
import com.mogere.choir.models.Member


@Dao
interface ChoirDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMember(list: List<Member>)

    @Query("SELECT * FROM Member where firstName like:member")
    fun getMember(member:String):List<Member>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun incertActivity(activities: List<Activity>)

    @Query("SELECT * from Activity")
    fun getActivities()
}