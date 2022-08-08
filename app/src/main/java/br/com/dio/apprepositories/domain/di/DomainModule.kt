package br.com.dio.apprepositories.domain.di

import br.com.dio.apprepositories.domain.ListRepositoryUseCases
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object DomainModule {

    fun load(){
        loadKoinModules(useCaseModule())
    }

    private fun useCaseModule(): Module{
        return module {
                factory {
                    ListRepositoryUseCases(get())
                }
        }
    }

}