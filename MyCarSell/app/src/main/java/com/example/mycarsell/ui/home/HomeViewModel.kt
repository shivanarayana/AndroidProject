package com.example.mycarsell.ui.home

import android.graphics.Color
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is a Car Shopping app"
    }
    val text: LiveData<String> = _text

    private val _headerTitle = MutableLiveData<String>().apply {
        value = "CarSellMax!" // Example header title
    }
    val headerTitle: LiveData<String> = _headerTitle

    private val _headerColor = MutableLiveData<Int>().apply {
        value = Color.RED // Use android.graphics.Color
    }
    val headerColor: LiveData<Int> = _headerColor

    fun updateHeaderText(newTitle: String) {
        _headerTitle.value = newTitle
    }

    fun updateHeaderColor(newColor: Int) {
        _headerColor.value = newColor
    }
}