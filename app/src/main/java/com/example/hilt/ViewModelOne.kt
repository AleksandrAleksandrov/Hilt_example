package com.example.hilt

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ViewModelOne @Inject constructor(private val useCaseOne: UseCaseOne) : ViewModel() {

    fun setValue() {
        useCaseOne.performAction()
    }
}