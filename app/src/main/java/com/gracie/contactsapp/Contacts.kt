package com.gracie.contactsapp

import android.provider.ContactsContract.CommonDataKinds.Email

data class Contacts(
    var avatar:String,
    var name:String,
    var contact:String,
    var email: String
)
