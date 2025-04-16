package model

data class UserResponse(
    val email: String,
    val id: Int,
    val name: String,
    val password: String,
    val username: String
)