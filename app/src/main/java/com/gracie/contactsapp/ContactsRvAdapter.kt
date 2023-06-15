package com.gracie.contactsapp

import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gracie.contactsapp.databinding.ContactListBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

class ContactsRvAdapter(var contactlist:List<Contacts>):RecyclerView.Adapter<ContactsViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var binding=ContactListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactsViewHolder(binding)

    }

    override fun getItemCount(): Int {
        return contactlist.size
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        val contact=contactlist.get(position)
        var binding=holder.binding
        binding.tvName.text=contact.name
        binding.tvContact.text=contact.contact
        binding.tvEmail.text=contact.email
        Picasso
            .get()
            .load(contact.avatar)
            .resize(80,80)
            .centerCrop()
            .transform(CropCircleTransformation())
            .into(binding.imageView2)
    }


}
class ContactsViewHolder(var binding:ContactListBinding):RecyclerView.ViewHolder(binding.root){

}
