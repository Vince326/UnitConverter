package com.vhunter.unitconverter

import android.os.Bundle
import android.widget.Toast
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
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vhunter.unitconverter.ui.theme.UnitConverterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UnitConverterTheme {

                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background) {
                    UnitConverter()
                }
            }
        }
    }
}


@Composable
fun UnitConverter() {
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        //Here, all the UI Units will be stacked on top of each other
            Text("Unit Converter")
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = "", onValueChange = {
        /*Here goes what should happen when the value of outlined text field changes*/
        })
        Spacer(modifier = Modifier.height(16.dp))
        Row {
            Box {
                Button(onClick ={/*TODO*/} ) {
                    Text("Select")
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "Arrow Down")
                }

                //Controls the Dropdown Menu and the different Units
                DropdownMenu(expanded = true, onDismissRequest = {/*TODO*/} ) {
                    DropdownMenuItem(
                        text = {Text("Centimeters") },
                        onClick = {/*TODO*/})

                    DropdownMenuItem(
                        text = {Text("Meters") },
                        onClick = {/*TODO*/})

                    DropdownMenuItem(
                        text = {Text("Millimeters") },
                        onClick = {/*TODO*/})

                    DropdownMenuItem(
                        text = {Text("Feet") },
                        onClick = {/*TODO*/})
                }

            }
            Spacer(modifier = Modifier.width(16.dp))
            Box {
                Button(onClick = {/*TODO*/}) {
                    Text("Select")
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "Arrow Down")
                }

                //Controls the Dropdown Menu and the different Units
                DropdownMenu(expanded = true, onDismissRequest = {/*TODO*/} ) {
                    DropdownMenuItem(
                        text = {Text("Centimeters") },
                        onClick = {/*TODO*/})

                    DropdownMenuItem(
                        text = {Text("Meters") },
                        onClick = {/*TODO*/})

                    DropdownMenuItem(
                        text = {Text("Millimeters") },
                        onClick = {/*TODO*/})

                    DropdownMenuItem(
                        text = {Text("Feet") },
                        onClick = {/*TODO*/})
                }
            }

            //Here, all the units will be stacked nex to each other
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text("Result: ")
    }
}


@Preview(showBackground = true)
@Composable
fun UnitConverterPreview() {
    UnitConverter()
}