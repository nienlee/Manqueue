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
import com.amplifyframework.ui.authenticator.ui.Authenticator
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
                    Authenticator { state ->
                        Column {
                            Text(
                                text = "Hello ${state.user.username}!",
                            )



                            Button(onClick = {

                                val dataTimeString = "1,499,999"
                                val dataTimeArray = dataTimeString.split(',').map { it.toInt() }.toString() // 解析为整数 Array

                                val dataValueString = "12000000,14000000,13000000"
                                val dataValueArray = dataValueString.split(',').map { it.toInt() }.toString() // 解析为整数 Array

                                val gsensorString = "1,1,1"
                                val gsensorArray = gsensorString.split(',').map { it.toInt() }.toString() // 解析为整数 Array

                                val man = Man.builder()
                                    .number("ST")
                                    .hwversion("Ring_V1.0")
                                    .fwversion("V1.0.0")
                                    .mode("Calibration")
                                    .function("BP-PD")
                                    .predvalue("120")
                                    .datatime(dataTimeArray) // 使用解析后的整数列表
                                    .datavalue(dataValueArray) // 使用解析后的整数列表
                                    .build()


                                Amplify.API.mutate(
                                    ModelMutation.create(man),
                                    {
                                        Log.i(
                                            "MyAmplifyApp",
                                            "Added Man with id: ${it.data.id}"
                                        )
                                    },
                                    { Log.e("MyAmplifyApp", "Create failed", it) },
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