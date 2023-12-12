package com.d121211091.biodata_app.data.repo

import com.d121211091.biodata_app.remote.ApiService
import javax.inject.Inject

class UserRepository @Inject constructor(private var apiService: ApiService) {

    suspend fun getAllUser() = apiService.getAllUsers()
}