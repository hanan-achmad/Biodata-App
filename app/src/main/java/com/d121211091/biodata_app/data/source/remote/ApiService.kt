package com.d121211091.biodata_app.remote

import com.d121211091.biodata_app.data.model.UserModel
import com.d121211091.biodata_app.data.response.Constants
import retrofit2.http.GET

interface ApiService {

    @GET(Constants.BASE_URL)
    suspend fun getAllUsers(
    ): UserModel

}