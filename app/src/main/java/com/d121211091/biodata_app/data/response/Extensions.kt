package com.d121211091.biodata_app.data.response

import android.content.Context
import android.widget.Toast
import com.d121211091.biodata_app.data.model.Location
import com.d121211091.biodata_app.data.model.Name

fun Context.showToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun Name.getUsername(): String {
    return "${this?.title + " " + (this?.first) + " " + (this?.last)}"
}

fun Location.getUserLocation(): String {
    return "${this?.street?.number.toString() + " " + this?.street?.name + " " + (this?.city) + " " + (this?.state) + " " + (this?.country)}"
}