package com.example.reminder.data

data class Task(
    val id: Long = System.currentTimeMillis(),
    val title: String,
    val startTime: Long,
    val intervalMinutes: Int,
    val isDone: Boolean = false
)