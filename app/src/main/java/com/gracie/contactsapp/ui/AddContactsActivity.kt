package com.gracie.contactsapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gracie.contactsapp.R
import com.gracie.contactsapp.databinding.ActivityAddContactsBinding

class AddContactsActivity : AppCompatActivity() {
    lateinit var binding: ActivityAddContactsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_contacts)
        binding = ActivityAddContactsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume(){
        super.onResume()
    }

}
fun bindingViews(){
//    var firstname=

}