package com.hdesrosiers.criminalintent02.database

import androidx.room.Dao
import androidx.room.Query
import com.hdesrosiers.criminalintent02.Crime
import java.util.*

@Dao
interface CrimeDao {
    @Query("SELECT * FROM crime")
    fun getCrimes(): List<Crime>

    @Query("SELECT * FROM crime WHERE id=(:id)")
    fun getCrime(id: UUID): Crime?
}