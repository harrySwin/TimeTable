package com.example.timetable

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Numbers(val number1: Int, val number2: Int): Parcelable {
}
