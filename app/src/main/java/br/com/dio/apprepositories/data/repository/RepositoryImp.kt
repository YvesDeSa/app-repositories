package br.com.dio.apprepositories.data.repository

import br.com.dio.apprepositories.data.service.GitHubService
import kotlinx.coroutines.flow.flow

class RepositoryImp(private val service: GitHubService): Repository {
    override suspend fun listRepositories(usuario: String) = flow{
            val seviceGitHub = service.listRepositories( usuario )
            emit(seviceGitHub)
    }
}