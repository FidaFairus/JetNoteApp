package com.experion.notetheme.data

import com.experion.notetheme.model.Note

class NotesDataSource{
    fun loadNotes(): List<Note>{
        return listOf(
            Note(title = "a good day", description = "we went on a vacation"),
            Note(title = "a good day", description = "we went on a vacation"),
            Note(title = "a good day", description = "we went on a vacation"),
            Note(title = "a good day", description = "we went on a vacation"),
            Note(title = "a good day", description = "we went on a vacation"),
            Note(title = "a good day", description = "we went on a vacation"),
            Note(title = "a good day", description = "we went on a vacation"),
            Note(title = "a good day", description = "we went on a vacation"),
            Note(title = "a good day", description = "we went on a vacation"),
            Note(title = "a good day", description = "we went on a vacation"),


            )
    }
}