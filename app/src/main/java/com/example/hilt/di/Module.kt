package com.example.hilt.di

import com.example.hilt.UseCaseOne
import com.example.hilt.UseCaseOneImpl
import com.example.hilt.UseCaseTwo
import com.example.hilt.UseCaseTwoImpl
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@dagger.Module
@InstallIn(ViewModelComponent::class)
class Module {

    @Provides
    fun provideUseCaseTwo(): UseCaseTwo {
        return UseCaseTwoImpl()
    }

    @Provides
    fun provideUseCaseOne(useCaseTwo: UseCaseTwo): UseCaseOne {
        return UseCaseOneImpl(useCaseTwo)
    }
}