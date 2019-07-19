package com.example.sierraobryan.ease_poc.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sierraobryan.ease_poc.R
import com.example.sierraobryan.ease_poc.data.FamilyMember
import kotlinx.android.synthetic.main.item_row_family.view.*
import java.util.*

class FamilyCircleAdapter (val items: List<FamilyMember>, val context: Context):
    RecyclerView.Adapter<FamilyCircleAdapter.FamilyViewHolder>() {

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: FamilyViewHolder, position: Int) {
       holder.bindValues(items.get(position))
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FamilyViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_row_family, parent, false)
        return FamilyViewHolder(view)
    }


    class FamilyViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {
        fun bindValues(familyMember: FamilyMember) {
            itemView.role.text = familyMember.role.name.toLowerCase()
        }
    }
}