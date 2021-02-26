package com.mogere.choir.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.mogere.choir.R
import com.mogere.choir.adapters.MemberAdapter
import com.mogere.choir.models.Member
import com.mogere.choir.models.Voice
import kotlinx.android.synthetic.main.fragment_members.*
import java.util.*



class MembersFragment : Fragment() {
    private val member1 = Member(1,"Michael", "Stone", 22)
    private val member2 = Member(2,"Sharon", "Juan", 25)
    private val member3 = Member(3,"Caren", "Sifi", 32)
    private val member4 = Member(4,"Lalle", "Maane", 26)

    private val members = listOf(member1,member2, member3,member4)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val layoutManager = LinearLayoutManager(context)
        layoutManager.orientation = LinearLayoutManager.VERTICAL


        val adapter = MemberAdapter(members)
        memberRecycler.layoutManager = layoutManager
        memberRecycler.adapter = adapter
        memberRecycler.setHasFixedSize(true)



    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_members, container, false)
    }



}