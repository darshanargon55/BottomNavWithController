package com.example.bottomnavwithcontroller.activity

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bottomnavwithcontroller.R
import com.example.bottomnavwithcontroller.model.Product
import net.engawapg.lib.zoomable.rememberZoomState
import net.engawapg.lib.zoomable.zoomable

val fullList = listOf(
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
)

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.teal_700))
    ) {
        TopRow()
    }
}


@Composable
fun TopRow() {
    LazyRow() {
        items(fullList) { flower ->
            FlowerCard(flower = flower, modifier = Modifier.padding(8.dp))
        }
    }
}

@Composable
fun FlowerCard(flower: Product,modifier: Modifier) {
    val zoomState = rememberZoomState(
        maxScale = 5f
    )
    Card(modifier = modifier) {
        Row(horizontalArrangement = Arrangement.Center) {
            Column(
                modifier = Modifier
                    .size(200.dp)
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = painterResource(id = flower.image),
                    contentDescription = ""  ,
                    modifier = Modifier
                        .clip(CircleShape)
                        .size(100.dp)
                        .zoomable(zoomState),
                    contentScale = ContentScale.Crop
                )
                Text(text = flower.name, fontSize = 15.sp)
            }
        }
    }
}

@Preview
@Composable
fun PreviewVew() {
    TopRow()
}