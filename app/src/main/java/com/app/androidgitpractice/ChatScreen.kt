package com.app.androidgitpractice

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.androidgitpractice.ui.theme.AndroidGitPracticeTheme

@Composable
fun ChatScreen(modifier: Modifier = Modifier) {

    Column(modifier.fillMaxSize().background(Color.Blue), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {

        Image(painter = painterResource(R.drawable.ic_launcher_foreground),contentDescription = null,modifier.size(120.dp))

        Text(text = "Chat Screen",modifier.padding(10.dp).align(Alignment.CenterHorizontally), color = Color.White, fontSize = 15.sp)
    }

}

@Preview
@Composable
private fun Chat() {
    AndroidGitPracticeTheme {
        ChatScreen(modifier = Modifier)
    }

}