package com.example.bottomnavwithcontroller.activity

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bottomnavwithcontroller.R
import com.example.bottomnavwithcontroller.model.User

val listOFUser = listOf(
    User(
        name = "Meet",
        profile = R.drawable.pr_a
    ),
    User(
        name = "Jigar",
        profile = R.drawable.pr_b
    ),
    User(
        name = "Vivek",
        profile = R.drawable.pr_c
    ),
    User(
        name = "Savan",
        profile = R.drawable.pr_d
    ),
    User(
        name = "Harshil",
        profile = R.drawable.pr_a
    ),
    User(
        name = "Rajan",
        profile = R.drawable.pr_b
    ),
    User(
        name = "Mitesh",
        profile = R.drawable.pr_c
    ),
    User(
        name = "Nirav",
        profile = R.drawable.pr_d
    ),
    User(
        name = "Keval",
        profile = R.drawable.pr_a
    ),
    User(
        name = "Rajan",
        profile = R.drawable.pr_b
    ),
    User(
        name = "Mitesh",
        profile = R.drawable.pr_c
    ),
    User(
        name = "Nirav",
        profile = R.drawable.pr_d
    ),
    User(
        name = "Keval",
        profile = R.drawable.pr_a
    ),
    User(
        name = "Rajan",
        profile = R.drawable.pr_b
    ),
    User(
        name = "Mitesh",
        profile = R.drawable.pr_c
    ),
    User(
        name = "Nirav",
        profile = R.drawable.pr_d
    ),
    User(
        name = "Keval",
        profile = R.drawable.pr_a
    )
)

@Composable
fun NetworkScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.teal_700))
            .wrapContentSize(Alignment.Center)
    ) {
        UserColumn()
    }
}

@Composable
fun UserColumn() {
    LazyColumn() {
        items(listOFUser) { user ->
            ProfileCard(user)
        }
    }
}

@Composable
fun ProfileCard(user: User) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .padding(5.dp)
    ) {
        Row(horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = user.profile),
                contentDescription = "",
                modifier = Modifier
                    .clip(CircleShape)
                    .size(30.dp)
            )
            Text(
                text = user.name,
                fontSize = 20.sp,
                color = MaterialTheme.colorScheme.primary,
                fontWeight = FontWeight.Medium
                )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Preview() {
    UserColumn()
}

