package com.mogere.choir.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mogere.choir.R
import com.mogere.choir.models.Member
import kotlinx.android.synthetic.main.member_card.view.*

class MemberAdapter(private val memberlist: List<Member>): RecyclerView.Adapter<MemberAdapter.MemberViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemberViewHolder {
       val itemView = LayoutInflater.from(parent.context)
           .inflate(R.layout.member_card, parent, false)
        return MemberViewHolder(itemView)
    }


    override fun onBindViewHolder(holder: MemberViewHolder, position: Int) {
        val currentItem = memberlist[position]
        holder.firstname.text = currentItem.firstName
        holder.lastname.text = currentItem.lastName
//        holder.voicepart.text = currentItem.voicepart.toString()
    }

    override fun getItemCount()= memberlist.size

    class MemberViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val firstname: TextView = itemView.firstname_tv
        val lastname: TextView = itemView.lastname_tv
        val voicepart: TextView = itemView.voicepart_tv
        
    }
}