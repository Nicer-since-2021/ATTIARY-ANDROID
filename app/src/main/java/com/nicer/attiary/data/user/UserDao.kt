package com.nicer.attiary.data.user

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import java.util.*

@Dao
interface UserDao {
	@Insert(onConflict = REPLACE)
	fun insert(user: User)

	@Query("select * from user where user_id = :userId")
	fun findByUserId(userId: Long): Optional<User>

	@Delete
	fun delete(user: User)

	@Query("select email from User")
	fun getEmail(): List<String>

	@Query("select name from User")
	fun getName(): List<String>

	@Query("select birthday_day from User")
	fun getBdayDay(): List<Int>

	@Query("select birthday_month from User")
	fun getBdayMonth(): List<Int>
}