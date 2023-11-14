package com.example.hybridcomposexml

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.junit.Rule

import androidx.test.ext.junit.rules.activityScenarioRule
import org.junit.Test


class MainActivityTest(){
    @get:Rule
    var activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun findTextInComposeViewFail() {
        onView(withText("FindMeText")).perform(click())
    }
}