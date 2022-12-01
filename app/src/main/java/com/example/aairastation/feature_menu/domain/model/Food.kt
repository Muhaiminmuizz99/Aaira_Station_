package com.example.aairastation.feature_menu.domain.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity
data class Food(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String = "",
    val category: String = "",
    val price: Double = 0.0,
    val available: Boolean = true,
    val description: String = "",
) : Parcelable