package com.eddsato.codelabsroom

import android.app.Application

class WordApplication : Application() {
    val database by lazy { WordRoomDatabase.getDatabase(this) }
    val repository by lazy { WordRepository(database.wordDao()) }
}