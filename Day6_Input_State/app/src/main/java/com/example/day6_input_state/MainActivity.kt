package com.example.day6_input_state

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.day6_input_state.ui.theme.Day6_Input_StateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Day6_Input_StateTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val textInput = remember { mutableStateOf("Okay") }
    val dropDownLeft = remember { mutableStateOf(false) }
    val dropDownRight = remember { mutableStateOf(false) }

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Unit Conveter")
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = textInput.value, onValueChange = {it ->
            textInput.value = it
        })
        Spacer(modifier = Modifier.height(16.dp))
        Row {
            Box {
                Button(onClick = {dropDownLeft.value = true}) {
                    Text(text = "click")
                    Icon(Icons.Default.ArrowDropDown,
                        contentDescription = "Arrow drop"
                    )
                }
                DropdownMenu(expanded = dropDownLeft.value, onDismissRequest = {
                    dropDownLeft.value = false
                }) {
                    DropdownMenuItem(
                        text = { Text("Centimeters") },
                        onClick = {

                        }
                    )
                }
            }

            Box {
                Button(onClick = {dropDownRight.value = true}) {
                    Text(text = "click")
                    Icon(Icons.Default.ArrowDropDown,
                        contentDescription = "Arrow drop"
                    )
                }
                DropdownMenu(expanded = dropDownRight.value, onDismissRequest = {
                    dropDownRight.value = false
                }) {
                    DropdownMenuItem(
                        text = { Text("Centimeters") },
                        onClick = {}
                    )
                }
            }
        }
    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Day6_Input_StateTheme {
        Greeting("Android")
    }
}