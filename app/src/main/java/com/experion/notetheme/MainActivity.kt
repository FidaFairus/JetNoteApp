package com.experion.notetheme

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.experion.notetheme.data.NotesDataSource
import com.experion.notetheme.model.Note
import com.experion.notetheme.screen.NoteScreen
import com.experion.notetheme.ui.theme.NoteThemeTheme
@ExperimentalComposeUiApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NoteThemeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,

                ) {
                    val notes = remember {
                        mutableListOf<Note>()
                    }
                    NoteScreen(
                        notes = notes ,
                        onRemoveNote = {
                            Log.d("notesValue", "$notes")
                                       notes.remove(it)
                        },
                    onAddNote = {
                        notes.add(it)
                    }
                    )

                }
            }
        }
    }
}




