package com.gracie.contactsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.textfield.TextInputLayout
import com.gracie.contactsapp.databinding.ActivityAddContactsBinding
import com.gracie.contactsapp.databinding.ActivityMainBinding

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
    var firstname=

}