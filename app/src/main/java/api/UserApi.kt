package api

import model.SignInUserRequest
import model.SignInUserResponse
import model.UserRequest
import model.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface UserApi {
    @POST("/users")
    suspend fun signUp(@Body userRequest: UserRequest):Response<UserResponse>
   @POST("/posts")
    suspend fun signIn(@Body signInUserRequest: SignInUserRequest):Response<SignInUserResponse>

}