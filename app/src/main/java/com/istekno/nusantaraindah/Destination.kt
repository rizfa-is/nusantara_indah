package com.istekno.nusantaraindah

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Destination (
    var name: String = "",
    var location: String = "",
    var description: String ="",
    var photo: Int = 0,
    var favorite: Int = 0,
    var circle: Int = 0
) : Parcelable