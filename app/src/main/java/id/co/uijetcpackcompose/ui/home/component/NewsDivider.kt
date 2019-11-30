package id.co.uijetcpackcompose.ui.home.component

import androidx.compose.Composable
import androidx.ui.core.Opacity
import androidx.ui.layout.Container
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Surface
import androidx.ui.tooling.preview.Preview

/**
 * Created by pertadima on 30,November,2019
 */

@Composable
fun newsLineDivider() {
    Opacity(0.08f) {
        Divider()
    }
}

@Preview
@Composable
fun previewLineDevider() {
    MaterialTheme {
        Surface {
            newsLineDivider()
        }
    }
}