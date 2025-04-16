package model

data class SignInUserResponse(
    val id: Int,
    val password: String,
    val username: String
)