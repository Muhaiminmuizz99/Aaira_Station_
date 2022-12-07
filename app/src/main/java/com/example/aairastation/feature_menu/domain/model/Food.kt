package com.example.aairastation.feature_menu.domain.model

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aairastation.ui.theme.AAIRASTATIONTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AAIRASTATIONTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val menumain = arrayOf<String>("Nasi Lemak","Nasi Goreng","Kueh Tiau")
                    val hargamain = arrayOf<String>("RM 8.00", "RM 6.00", "RM 7.00")
                    val menuside = arrayOf<String>("Satay","Popia","Keropok Lekor")
                    val hargaside = arrayOf<String>("RM 2.00", "RM 1.00", "RM 5.00")

                    MenuMainSide("Main Dish",menumain[0],menumain[1],menumain[2],hargamain[0],hargamain[1],hargamain[2],"Side Dish", menuside[0],menuside[1],menuside[2],hargaside[0],hargaside[1],hargaside[2])

                }
            }
        }
    }
}

@Composable

fun MenuMainSide(massage: String, main1: String, main2: String, main3: String, main4 : String, main5 : String, main6 : String, massage1 :String, side1:String,side2:String,side3:String,side4:String,side5:String,side6:String) {

    val menumain = arrayOf<String>(main1, main2, main3)
    val hargamain = arrayOf<String>(main4, main5, main6)
    val menuside = arrayOf<String>(side1, side2, side3)
    val hargaside = arrayOf<String>(side4, side5, side6)

    Column {

        Text(
            text = massage,
            fontSize = 24.sp,
        )

        for (i in 0..2) {

            Row(
                modifier = Modifier
                    .padding(5.dp)
                    .offset(x = 10.dp),
                horizontalArrangement = Arrangement.Center,
            ) {
                Text(
                    text = menumain[i],
                    fontSize = 18.sp,
                )
                Text(
                    modifier = Modifier
                        .padding(horizontal = 15.dp, vertical = 3.dp)
                        .offset(x = 5.dp).weight(.1f),
                    text = hargamain[i],
                    fontSize = 15.sp,

                )
            }
        }
        println()

        Text(
            text = massage1,
            fontSize = 24.sp,
        )

        for (i in 0..2) {

            Row(
                modifier = Modifier
                    .padding(5.dp)
                    .offset(x = 10.dp),
                horizontalArrangement = Arrangement.Center,
            ) {
                Text(
                    text = menuside[i],
                    fontSize = 18.sp,
                )
                Text(
                    modifier = Modifier
                        .padding(horizontal = 15.dp, vertical = 3.dp)
                        .offset(x = 5.dp).weight(.1f),
                    text = hargaside[i],
                    fontSize = 15.sp,
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AAIRASTATIONTheme {
        val menumain = arrayOf<String>("Nasi Lemak", "Nasi Goreng", "Kueh Tiau")
        val hargamain = arrayOf<String>("RM 8.00", "RM 6.00", "RM 7.00")
        val menuside = arrayOf<String>("Satay", "Popia", "Keropok Lekor")
        val hargaside = arrayOf<String>("RM 2.00", "RM 1.00", "RM 5.00")

        MenuMainSide(
            "Main Dish",
            menumain[0],
            menumain[1],
            menumain[2],
            hargamain[0],
            hargamain[1],
            hargamain[2],
            "Side Dish",
            menuside[0],
            menuside[1],
            menuside[2],
            hargaside[0],
            hargaside[1],
            hargaside[2]
        )    }
}
