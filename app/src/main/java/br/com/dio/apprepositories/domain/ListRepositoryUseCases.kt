package br.com.dio.apprepositories.domain

import br.com.dio.apprepositories.core.UseCase
import br.com.dio.apprepositories.data.model.Repo
import br.com.dio.apprepositories.data.repository.Repository
import kotlinx.coroutines.flow.Flow

class ListRepositoryUseCases(private val repository: Repository): UseCase<String, Flow<List<Repo>>>() {
    override suspend fun execute(param: String): Flow<List<Repo>> {
         return repository.listRepositories(param)
    }
}