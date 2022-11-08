package com.example.hilt

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ViewModelTwo @Inject constructor(private val useCaseOne: UseCaseOne) : ViewModel() {
}