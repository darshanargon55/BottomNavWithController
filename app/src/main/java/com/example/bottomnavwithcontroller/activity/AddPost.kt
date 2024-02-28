package com.example.bottomnavwithcontroller.activity

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bottomnavwithcontroller.R
import com.example.bottomnavwithcontroller.model.Product

val fullFlowerList = listOf(
    Product(
        name = "Allium",
        image = R.drawable.allium
    ),
    Product(
        name = "Astrantia",
        image = R.drawable.astrantia
    ),
    Product(
        name = "Aster",
        image = R.drawable.aster
    ),
    Product(
        name = "Calendula",
        image = R.drawable.calendula
    ),
    Product(
        name = "Clematis",
        image = R.drawable.clematis
    ),
    Product(
        name = "Dianthus",
        image = R.drawable.dianthus
    ),
    Product(
        name = "Astrantia",
        image = R.drawable.astrantia
    ),
    Product(
        name = "Aster",
        image = R.drawable.aster
    ),
    Product(
        name = "Calendula",
        image = R.drawable.calendula
    ),
    Product(
        name = "Clematis",
        image = R.drawable.clematis
    ),
    Product(
        name = "Dianthus",
        image = R.drawable.dianthus
    ),

)

@Composable
fun AddPostScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.teal_700))
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = "Add Post Screen",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 20.sp
        )
    }
}

@Preview
@Composable
fun UserCardGrid() {
    LazyVerticalGrid(columns = GridCells.Fixed(2)
        ){
        items(fullFlowerList){
            FlowerCard(flower = it, modifier = Modifier.padding(8.dp))
        }
    }
}




















