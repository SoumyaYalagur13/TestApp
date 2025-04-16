package model

data class SignInUserRequest(
    val password: String,
    val username: String
)