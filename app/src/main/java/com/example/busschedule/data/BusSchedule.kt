package com.example.busschedule.data

import androidx.annotation.NonNull
import androidx.room3.ColumnInfo
import androidx.room3.Entity
import androidx.room3.PrimaryKey

@Entity(tableName = "Schedule")
data class BusSchedule(
    @PrimaryKey
    val id: Int,
    @NonNull
    @ColumnInfo(name = "stop_name")
    val stopName: String,
    @NonNull
    @ColumnInfo(name = "arrival_time")
    val arrivalTimeInMillis: Int
)