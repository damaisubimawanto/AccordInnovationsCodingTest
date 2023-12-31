package com.damai.accordinnovations.modules

import com.damai.domain.usecases.GetMovieDetailsUseCase
import com.damai.domain.usecases.GetMovieGenreListUseCase
import com.damai.domain.usecases.GetMovieItemListUseCase
import com.damai.domain.usecases.GetMovieReviewListUseCase
import org.koin.dsl.module

/**
 * Created by damai007 on 18/August/2023
 */

val useCaseModule = module {
    single {
        GetMovieGenreListUseCase(
            homeRepository = get()
        )
    }
    single {
        GetMovieItemListUseCase(
            homeRepository = get()
        )
    }
    single {
        GetMovieDetailsUseCase(
            homeRepository = get()
        )
    }
    single {
        GetMovieReviewListUseCase(
            homeRepository = get()
        )
    }
}