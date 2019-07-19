package com.example.sierraobryan.ease_poc.data

import java.time.LocalDateTime
import java.util.*

data class DailyPersonalData constructor(
    var mood: Int,
    var journalEntry: String
) {
    var dateTime: Date = Calendar.getInstance().time
}