package com.example.hilt

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FirstViewModel @Inject constructor() : ViewModel() {


}