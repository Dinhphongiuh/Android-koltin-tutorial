package com.example.unitconverter

import  androidx.compose.ui.res.stringResource
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.unitconverter.ui.theme.UnitConverterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UnitConverterTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    UnitConverter()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UnitConverter() {
    var textInput = "";
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Column {
            Text(text = "Unit Converter");
            OutlinedTextField(value = textInput, onValueChange = {
                textInput = it;
            });
//        Toasify
//        Row {
//            val content = LocalContext.current
//            Button(onClick = { Toast.makeText(content, "Thanks for clicking!", Toast.LENGTH_LONG).show() }) {
//                Text(text = "Click me!")
//            }
//        }
//        Box, Icons, DropDownMenus
            Row {
                Box {
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = "Select")
                        Icon(Icons.Default.ArrowDropDown, contentDescription = "Arrow Down")
                    }
                }
                Box {
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = "Select")
                        Icon(Icons.Default.ArrowDropDown, contentDescription = "Arrow Down")
                    }
                }
            }
            Text(text = "Result: ", textAlign = TextAlign.Center)
        }

    }
}

@Preview(showBackground = true)
@Composable
fun UnitConverterPreview() {
    UnitConverter();
}