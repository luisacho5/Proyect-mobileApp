package com.example.laliga

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.team_list_item.view.*
    class TeamsImagesAdapter: BaseAdapter {
        private var context: Context
        private var teamNames: ArrayList<String>
        private var shields: ArrayList<Int>

        constructor(context: Context, teamNames:ArrayList<String>, shields:ArrayList<Int>) : super() {
            this.context = context
            this.teamNames = teamNames
            this.shields = shields
        }

        override fun getCount(): Int {
            return teamNames.size
        }

        override fun getItem(position: Int): Any {
            return teamNames[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val layoutInflater= context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val itemView=layoutInflater.inflate(R.layout.team_list_item, null,true)
            val teamNameTextView=itemView.team_name as TextView
            val teamImageView=itemView.team_image as ImageView
            teamNameTextView.text=getItem(position).toString()
            teamImageView.setImageResource(shields[position])
            return itemView
        }
}
