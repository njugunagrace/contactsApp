package com.gracie.contactsapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.gracie.contactsapp.Contacts
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
        binding.FabContacts.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
    fun displayContacts(){
        val contact1= Contacts(0,"https://media.istockphoto.com/id/1411155612/photo/side-profile-of-a-beautiful-young-black-woman-thinking-and-looking-powerful-standing-against.webp?b=1&s=170667a&w=0&k=20&c=7nGKLQGEmD2SfTwDFqgcgU4GjyYuBkaM2trsKjvgHQQ=","Grace","0789097774","grace@gmail.com")
        val contact2= Contacts(0,"https://media.istockphoto.com/id/1465454175/photo/portrait-of-beautiful-black-millennial-entrepreneur-woman-with-an-afro-hairstyle-and-looking.webp?b=1&s=170667a&w=0&k=20&c=UVUgC-K4ou2z_-ojIBHX4ptnnmswG_yOLwy8HesPUzA=","Wambui","0789097774","wambui@gmail.com")
        val contact3= Contacts(0,"https://media.istockphoto.com/id/1338134336/photo/headshot-portrait-african-30s-man-smile-look-at-camera.webp?b=1&s=170667a&w=0&k=20&c=j-oMdWCMLx5rIx-_W33o3q3aW9CiAWEvv9XrJQ3fTMU=","Njuguna","0789097774","njuguna@gmail.com")
        val contact4= Contacts(0,"https://media.istockphoto.com/id/938709362/photo/portrait-of-a-girl.webp?b=1&s=170667a&w=0&k=20&c=Qq2UW3DlJ6ye19GLHmc66Kxld9Z7D_r1o-KN7FJArKw=","Jane","0789097774","janee@gmail.com")
        val contact5= Contacts(0,"https://media.istockphoto.com/id/1381221247/photo/beautiful-afro-girl-with-curly-hairstyle.webp?b=1&s=170667a&w=0&k=20&c=0x91osZOkL8EfhTEEGNa2EeCGN2gdMTNULOsUFW_0i4=","Victor","0789097774","victor@gmail.com")
        val contact6= Contacts(0,"https://media.istockphoto.com/id/1389361465/photo/profile-portrait-of-smiling-black-man-in-studio.webp?b=1&s=170667a&w=0&k=20&c=cs9LjN17nKN9R5eo25iOzpJuqDN-5rVWqw-cG4t6tuY=","Joel","0789097774","joel@gmail.com")
        val contact7= Contacts(0,"https://media.istockphoto.com/id/1311634222/photo/portrait-of-successful-black-male-modern-day-student-holding-smartphone.webp?b=1&s=170667a&w=0&k=20&c=qdZ9RCZsdzSqmeBrluO_S-sC8Y7lUBre80UvjwTCRxE=","Mary","0789097774","mary@gmail.com")
        val contact8= Contacts(0,"https://media.istockphoto.com/id/1208585275/photo/profile-of-a-serene-young-woman.webp?b=1&s=170667a&w=0&k=20&c=b0YisufDREAYdpfFBhuBHFkohw58QW-CpCIUX4LsGmY=","Anna","0789097774","anna@gmail.com")


        val list = listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8)
        val contactAdapter = ContactsRvAdapter(list)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        binding.rvContacts.adapter = contactAdapter

    }
}