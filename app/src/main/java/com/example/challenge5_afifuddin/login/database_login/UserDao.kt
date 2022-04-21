package com.example.challenge5_afifuddin.login.database_login

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import androidx.room.Update


@Dao
interface UserDao {
    @Query("SELECT * FROM User")
    fun getAllUser(): List<User>

    @Insert(onConflict = REPLACE)
    fun insertUser (user: User) :Long

    @Query ("SELECT EXISTS(SELECT*FROM User WHERE email = :email AND password = :password)")
    fun checkUser(email:String,password :String):Boolean

    @Update
    fun updateUser(user: User):Int
    @Query("SELECT * FROM user WHERE username = :username")
    fun getUser(username: String): User
}