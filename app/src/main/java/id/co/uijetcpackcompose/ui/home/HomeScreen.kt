package id.co.uijetcpackcompose.ui.home

import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.HorizontalScroller
import androidx.ui.foundation.VerticalScroller
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.material.themeTextStyle
import androidx.ui.tooling.preview.Preview
import id.co.uijetcpackcompose.ui.home.component.newsLineDivider
import id.co.uijetcpackcompose.ui.home.component.newsTopSection
import id.co.uijetcpackcompose.ui.themes.lightThemeColors

/**
 * Created by pertadima on 30,November,2019
 */

@Composable
fun homeScreenApp() {
    VerticalScroller {
        Column {
            homeTopSection()
            Padding(left = 16.dp, right = 16.dp) {
                newsLineDivider()
            }
            HeightSpacer(height = 20.dp)
        }
    }
}

@Composable
fun homeTopSection() {
    Padding(top = 20.dp, left = 16.dp, right = 16.dp) {
        Text(
            text = "Top Stories for You", style = (+themeTextStyle { h6 })
        )
    }
    HorizontalScroller {
        Row(
            crossAxisSize = LayoutSize.Wrap,
            modifier = Spacing(top = 20.dp, right = 16.dp, bottom = 16.dp)
        ) {
            repeat(3) {
                WidthSpacer(16.dp)
                newsTopSection()
            }
        }
    }
}

@Preview
@Composable
fun homeScreenAppPreview() {
    MaterialTheme(colors = lightThemeColors) {
        homeScreenApp()
    }
}
