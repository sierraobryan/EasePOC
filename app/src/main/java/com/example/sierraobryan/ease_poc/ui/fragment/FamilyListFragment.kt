package com.example.sierraobryan.ease_poc.ui.fragment

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.sierraobryan.ease_poc.R
import com.example.sierraobryan.ease_poc.data.FamilyMember
import com.example.sierraobryan.ease_poc.data.Role
import com.example.sierraobryan.ease_poc.ui.adapter.FamilyCircleAdapter
import kotlinx.android.synthetic.main.fragment_family_list.*

class FamilyListFragment :Fragment() {
    companion object {
        fun newInstance() = FamilyListFragment()
    }

    private lateinit var adapter: FamilyCircleAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_family_list, container, false)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        activity!!.title = activity!!.getString(R.string.title_family)
        setUpAdapter(getFamilyMembers())
    }

    private fun setUpAdapter(familyMembers: List<FamilyMember>) {
        adapter = FamilyCircleAdapter(familyMembers, activity as Context)
        family_options_recyclerview.adapter = adapter
        family_options_recyclerview.layoutManager = GridLayoutManager(activity, 3)
    }

    //dummy data
    private fun getFamilyMembers(): List<FamilyMember> {
        var fam1 = FamilyMember("Name 1", role = Role.MOTHER)
        var fam2 = FamilyMember("Name 2", role = Role.SISTER)
        var fam3 = FamilyMember("Name 3", role = Role.PARTNER)
        var fam4 = FamilyMember("Name 4", role = Role.BROTHER)
        return listOf(fam1, fam2, fam3, fam4)

    }
}