package com.gracie.contactsapp

import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gracie.contactsapp.databinding.ContactListBinding

class ContactsRvAdapter(var contactlist:List<Contacts>):RecyclerView.Adapter<ContactsViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var binding=ContactListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactsViewHolder(binding)

    }

    override fun getItemCount(): Int {
        return contactlist.size
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var contact=contactlist.get(position)
        holder.binding.tvName.text=contact.name
        holder.binding.tvContact.text=contact.contact
        holder.binding.tvEmail.text=contact.email
    }


}
class ContactsViewHolder(var binding:ContactListBinding):RecyclerView.ViewHolder(binding.root){

}
