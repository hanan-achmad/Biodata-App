package com.d121211091.biodata_app.data.response

import com.d121211091.biodata_app.data.model.UserModel

sealed class ApiResult {
    class Success(val userModel: UserModel) : ApiResult()
    object Error : ApiResult()
    object Loading : ApiResult()
}