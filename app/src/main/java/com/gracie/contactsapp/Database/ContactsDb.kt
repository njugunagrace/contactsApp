package com.gracie.contactsapp.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.gracie.contactsapp.Contacts

@Database(entities = arrayOf(Contacts::class), version = 1)
abstract class ContactsDb:RoomDatabase() {
    abstract fun contactData(): ContactDao

    companion object{
        private var database: ContactsDb? = null

        fun getDatabase(context: Context):ContactsDb{
            if(database == null){
                database = Room
                    .databaseBuilder(context,ContactsDb::class.java, "ContactDb")
                    .build()

            }
            return database as ContactsDb
        }
    }
}