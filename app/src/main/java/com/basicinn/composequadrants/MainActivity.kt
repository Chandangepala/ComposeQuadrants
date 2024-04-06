package com.basicinn.composequadrants

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.basicinn.composequadrants.ui.theme.ComposeQuadrantsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    QuadrantApp( modifier = Modifier)
                }
            }
        }
    }
}

@Composable
fun QuadrantApp(modifier: Modifier){
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .weight(1f),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = modifier
                .weight(1f)
                .fillMaxSize()
                .background(Color(0xFFEADDFF)),
                contentAlignment = Alignment.Center) {
                InfoCard(title = "Text composable",
                    desc = "Displays text and follows the recommended Material Design guidelines.",
                    modifier = modifier)
            }

            Box(modifier = modifier
                .weight(1f)
                .fillMaxSize()
                .background(Color(0xFFD0BCFF)),
                contentAlignment = Alignment.Center
            ) {
                InfoCard(title = "Image composable",
                    desc = "Creates a composable that lays out and draws a given Painter class object.",
                    modifier = modifier)
            }
        }

        Row(
            modifier = modifier
                .fillMaxWidth()
                .weight(1f),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = modifier
                .weight(1f)
                .fillMaxSize()
                .background(Color(0xFFB69DF8)),
                contentAlignment = Alignment.Center) {

                    InfoCard(title = "Row composable",
                        desc = "A layout composable that places its children in a horizontal sequence.",
                        modifier = modifier)
            }

            Box(modifier = modifier
                .weight(1f)
                .fillMaxSize()
                .background(Color(0xFFF6EDFF)),
                contentAlignment = Alignment.Center
            ) {
                InfoCard(title = "Column composable",
                    desc = "A layout composable that places its children in a vertical sequence.",
                    modifier = modifier)
            }
        }

    }
}

@Composable
fun InfoCard(title: String, desc: String, modifier: Modifier){
    Column(
        modifier = modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            modifier = modifier.padding(top = 8.dp, bottom = 8.dp),
            textAlign = TextAlign.Center
        )
        Text(
            text = desc,
            modifier = modifier.fillMaxWidth(),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantsTheme {
        QuadrantApp(modifier = Modifier)
    }
}