package com.example.workersapplication.Database.User

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey val uid: Int,
    @NonNull @ColumnInfo(name = "firstname") val fname: String,
    @NonNull @ColumnInfo(name = "lastname") val lname: String,
    @NonNull @ColumnInfo(name = "email") val email: String,
    @NonNull @ColumnInfo(name = "locality") val locality: String,
    @NonNull @ColumnInfo(name = "city") val city: String,
    @NonNull @ColumnInfo(name = "time") val time: Int,
    @NonNull @ColumnInfo(name = "expected_salary") val expected_salary: Int,
    @NonNull @ColumnInfo(name = "requirements") val requirements: String,
    @NonNull @ColumnInfo(name = "contact_no_user") val contact_no_user: Int
)
