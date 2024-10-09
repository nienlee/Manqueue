package com.example.manqueue

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.manqueue.ui.theme.ManqueueTheme
import androidx.compose.foundation.layout.Column

import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.amplifyframework.core.Amplify
import android.util.Log
import androidx.compose.foundation.layout.height
import com.amplifyframework.api.graphql.model.ModelMutation
import com.amplifyframework.datastore.generated.model.Man

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ManqueueTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    Column{
                        Button(onClick = {

                            val man = Man.builder()
                                .number("AL")
                                .name("My first man")
                                .age("10")
                                .height("173.2F")
                                .hr("80")
                                .sleep("good")
                                .pressure("good")
                                .period("mid")
                                .activity("50 steps")
                                .build()


                            Amplify.API.mutate(
                                ModelMutation.create(man),
                                { Log.i("MyAmplifyApp", "Added Man with id: ${it.data.id}")},
                                { Log.e("MyAmplifyApp", "Create failed", it)},
                            )
                        }) {
                            Text(text = "Create Man")
                        }
                    }






                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ManqueueTheme {
        Greeting("Android")
    }
}