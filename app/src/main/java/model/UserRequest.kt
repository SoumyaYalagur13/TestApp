package model

data class UserRequest(
    val email: String,
    val name: String,
    val password: String,
    val username: String
)