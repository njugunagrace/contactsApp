package com.gracie.contactsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.gracie.contactsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayContacts()
    }
    fun displayContacts(){
        val contact1=Contacts("sgaef","Grace","0789097774","grace@gmail.com")
        val contact2=Contacts("sfery","Wambui","0789097774","wambui@gmail.com")
        val contact3=Contacts("fvvfd","Njuguna","0789097774","njuguna@gmail.com")
        val contact4=Contacts("dsdvcvv","Jane","0789097774","janee@gmail.com")
        val contact5=Contacts("cccc","Victor","0789097774","victor@gmail.com")
        val contact6=Contacts("sdv ","Joel","0789097774","joel@gmail.com")
        val contact7=Contacts("weqd","Mary","0789097774","mary@gmail.com")
        val contact8=Contacts("ddsss","Anna","0789097774","anna@gmail.com")

        val list= listOf<Contacts>(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        var contactAdapter=ContactsRvAdapter(list)
        binding.rvContacts.adapter=contactAdapter

    }
}