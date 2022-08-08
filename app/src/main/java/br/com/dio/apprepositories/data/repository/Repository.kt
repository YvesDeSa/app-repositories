package br.com.dio.apprepositories.data.repository

import br.com.dio.apprepositories.data.model.Repo
import kotlinx.coroutines.flow.Flow
import retrofit2.Call


interface Repository {
    suspend fun listRepositories(usuario: String): Flow<List<Repo>>
}