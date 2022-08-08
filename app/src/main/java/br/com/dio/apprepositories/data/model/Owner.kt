package br.com.dio.apprepositories.data.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Owner (
    val login: String,
    @SerializedName("avatar_url")
    val avatarURL: String
): Serializable{

}