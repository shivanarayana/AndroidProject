package com.example.mycarsell.ui.home

import androidx.compose.ui.graphics.Color
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is a Car Shopping app"
    }
    val text: LiveData<String> = _text

    // --- Header Data ---
    private val _headerTitle = MutableLiveData<String>().apply {
        value = "CarSellMax!" // Example header title
    }
    val headerTitle: LiveData<String> = _headerTitle

    private val _headerColor = MutableLiveData<androidx.compose.ui.graphics.Color>().apply {
        value = Color.Red // Set the header color to Red
    }
    val headerColor: LiveData<androidx.compose.ui.graphics.Color> = _headerColor

    // --- Example functions to update header data (optional) ---
    fun updateHeaderText(newTitle: String) {
        _headerTitle.value = newTitle
    }

    fun updateHeaderColor(newColor: androidx.compose.ui.graphics.Color) {
        _headerColor.value = newColor
    }
}