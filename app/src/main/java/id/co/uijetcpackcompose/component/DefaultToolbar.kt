package id.co.uijetcpackcompose.component

import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.layout.FlexColumn
import androidx.ui.material.MaterialTheme
import androidx.ui.material.TopAppBar
import androidx.ui.tooling.preview.Preview

/**
 * Created by pertadima on 26,November,2019
 */


@Composable
fun defaultToolbar() {
    FlexColumn {
        TopAppBar(
            title = {
                Text(text = "Main Activity")
            }
        )
    }
}


@Preview
@Composable
fun showDefaultToolbar() {
    MaterialTheme {
        defaultToolbar()
    }
}