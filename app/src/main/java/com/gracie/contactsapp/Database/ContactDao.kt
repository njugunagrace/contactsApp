package com.gracie.contactsapp.Database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.gracie.contactsapp.Contacts


@Dao
interface ContactDao {
    @Insert(onConflict =OnConflictStrategy.REPLACE)
//    OUR RECORD WILL GET INSERTED WHEN YOU WANT TO REPLACE INFORMATION THAT ALREADY EXISTS
//    ON THE ONCONFLICTSTRATEGY THERE ARE DIFFERENT WAYS OF TACKLING IT
//    THE CONTACTS IS BASICALLY REFERING TO YOUR DATA CLASS
    fun insertContact(contact:Contacts)


}