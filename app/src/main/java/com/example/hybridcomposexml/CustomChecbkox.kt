package com.example.hybridcomposexml

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun CustomCheckbox(){
    Row(Modifier.background(color = Color.DarkGray)){
        Button(onClick =  {}){
            Text("FindMeText")
        }
        Checkbox(checked = true, onCheckedChange = {})
    }
}

