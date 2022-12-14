package com.senaaydin.jetpackcomposeplayground.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun OutlinedButton(modifier: Modifier = Modifier) {
    androidx.compose.material.OutlinedButton(
        onClick = { },
        modifier = modifier,
        border = BorderStroke(1.dp, Color.Red),
        shape = RoundedCornerShape(50), // = 50% percent
        colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Red)
    ) {
        Text(text = "Outlined Button")
    }
}


@Preview
@Composable
fun OutlinedButtonPreview() {
    OutlinedButton()
}