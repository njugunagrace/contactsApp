package com.gracie.contactsapp

import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Contacts")
data class Contacts(
    @PrimaryKey (autoGenerate = true)var contactId:Int,
    var avatar:String,
    var name:String,
    var contact:String,
    var email: String
)
