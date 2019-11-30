package id.co.uijetcpackcompose.ui.home.component

import androidx.compose.Composable
import androidx.compose.ambient
import androidx.compose.unaryPlus
import androidx.ui.core.ContextAmbient
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.foundation.Clickable
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.imageFromResource
import androidx.ui.layout.*
import androidx.ui.material.ripple.Ripple
import androidx.ui.material.surface.Card
import androidx.ui.material.themeTextStyle
import androidx.ui.material.withOpacity
import id.co.uijetcpackcompose.R

/**
 * Created by pertadima on 30,November,2019
 */

@Composable
fun newsTopSection() {
    val context = +ambient(ContextAmbient)
    Card(elevation = 4.dp, shape = RoundedCornerShape(5.dp)) {
        Ripple(bounded = true) {
            Container(width = 250.dp) {
                Clickable(onClick = null) {
                    Padding(bottom = 16.dp) {
                        Column {
                            Container(expanded = true, height = 140.dp) {
                                DrawImage(
                                    image = imageFromResource(
                                        context.resources,
                                        R.drawable.post_2
                                    )
                                )
                            }
                            HeightSpacer(16.dp)
                            Text(
                                text = "Dagger in Kotlin : Gotchas and Optimization",
                                style = (+themeTextStyle { subtitle1 }),
                                modifier = Spacing(left = 16.dp, right = 16.dp)
                            )
                            Text(
                                text = "Manuel Vivo",
                                style = (+themeTextStyle { subtitle2 }).withOpacity(0.8F),
                                modifier = Spacing(left = 16.dp, right = 16.dp)
                            )
                            Text(
                                text = "19 November 2019",
                                style = (+themeTextStyle { overline }).withOpacity(0.65F),
                                modifier = Spacing(left = 16.dp, right = 16.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}