package com.georges.janjatutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.georges.janjatutorial.ui.theme.JanjaTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JanjaTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppPreview()
                }
            }
        }
    }
}

@Composable
fun AppHeaderImage(){
    val imageHeader = painterResource(R.drawable.headerimg)
    Image(
        painter = imageHeader,
        contentDescription = null,
        contentScale = ContentScale.FillWidth
    )
}

@Composable
fun AppText(title: String, content1: String, content2: String, footer: String, modifier: Modifier = Modifier){
    Column (
        verticalArrangement = Arrangement.SpaceBetween,
    ){
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = modifier.padding(16.dp)
        )
        Text(
            text = content1,
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = content2,
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(16.dp)
        )
        Text(
            text = footer,
            textAlign = TextAlign.Right,
            modifier = modifier.padding(16.dp)
        )
    }
}

@Composable
fun TutorialApp(){
    Column {
        AppHeaderImage()
        AppText(
            title = stringResource(R.string.text_title),
            content1 = stringResource(R.string.content_header),
            content2 = stringResource(R.string.content_text),
            footer = stringResource(R.string.footer_text)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun AppPreview(){
    JanjaTutorialTheme {
        TutorialApp()
    }
}