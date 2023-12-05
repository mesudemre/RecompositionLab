package com.mesutemre.recompositionlab

data class UserModel(
    val nameSurname: String,
    val isChecked: Boolean = false,
    val old: Int = 32
)
