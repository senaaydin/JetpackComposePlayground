package com.senaaydin.jetpackcomposeplayground.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.senaaydin.jetpackcomposeplayground.components.card.BasicImageIconCard
import com.senaaydin.jetpackcomposeplayground.components.card.ExpandableCard
import com.senaaydin.jetpackcomposeplayground.components.card.FlipCardScreen

@ExperimentalMaterialApi
@Composable
fun CardsScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        ExpandableCard(
            title = "Expandble Card",
            description = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing. Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
        )

        Row(modifier = Modifier.fillMaxWidth()) {

            BasicImageIconCard(
                modifier = Modifier
                    .padding(top = 20.dp, start = 10.dp, bottom = 10.dp)
                    .weight(0.5f),
                onClickBookmark = {},
                onClickShare = {},
                imageUrl = "https://www.deliveryhero.com/wp-content/uploads/2022/09/Pau-Pau-image-9.jpg",
                onClickFavorite = {},
                text = "Experimental",
            )
        }
        Row(modifier = Modifier.fillMaxHeight()) {
            FlipCardScreen()
        }

    }
}