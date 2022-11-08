package com.example.hilt

import javax.inject.Inject

class UseCaseOneImpl @Inject constructor(private val useCaseTwo: UseCaseTwo) : UseCaseOne {

    override fun performAction() {
        useCaseTwo.performAction()
    }
}