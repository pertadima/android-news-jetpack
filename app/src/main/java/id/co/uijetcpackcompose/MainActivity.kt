package id.co.uijetcpackcompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.ui.core.setContent
import androidx.ui.layout.Column
import androidx.ui.material.MaterialTheme
import id.co.uijetcpackcompose.component.defaultToolbar
import id.co.uijetcpackcompose.ui.home.homeScreenApp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme() {
                Column {
                    defaultToolbar()
                    homeScreenApp()
                }
            }
        }
    }
}


