package com.example.laliga
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.list_teams.*
class ListTeams : AppCompatActivity() {
    private val listOfTeams=ArrayList<String>()
    private val shields=ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_teams)
        initializeList()
        var namesandImageAdapterAdapter=
            TeamsImagesAdapter(this,listOfTeams,shields)
        teams_list.adapter=namesandImageAdapterAdapter
        teams_list.setOnItemClickListener{
                parent, view, position, id->onItemClick(position)
        }


    }

    private fun onItemClick(position: Int) {
        intent= Intent(this,TeamInfo::class.java)
        intent.putExtra("position",position)
        startActivity(intent)
    }

    private fun initializeList(){
        listOfTeams.add("Atlético de Madrid")
        listOfTeams.add("Real Madrid")
        listOfTeams.add("FC Barcelona")
        listOfTeams.add("Sevilla FC")
        listOfTeams.add("Real Betis")
        listOfTeams.add("Villarreal")
        listOfTeams.add("Real Sociedad")
        listOfTeams.add("Granada")
        listOfTeams.add("Celta de Vigo")
        listOfTeams.add("Athletic Club de \nBilbao")
        listOfTeams.add("Cadiz")
        listOfTeams.add("Eibar")
        listOfTeams.add("Levante")
        listOfTeams.add("Alavés")
        listOfTeams.add("Elche")
        listOfTeams.add("Valencia")
        listOfTeams.add("Osasuna")
        listOfTeams.add("Huesca")
        listOfTeams.add("Getafe")
        listOfTeams.add("Valladolid")

        shields.add(R.drawable.atletico)
        shields.add(R.drawable.realmadrid)
        shields.add(R.drawable.barcelona)
        shields.add(R.drawable.sevilla)
        shields.add(R.drawable.betis)
        shields.add(R.drawable.villarreal)
        shields.add(R.drawable.realsociedad)
        shields.add(R.drawable.granada)
        shields.add(R.drawable.celta)
        shields.add(R.drawable.bilbao)
        shields.add(R.drawable.cadiz)
        shields.add(R.drawable.eibar)
        shields.add(R.drawable.levante)
        shields.add(R.drawable.alaves)
        shields.add(R.drawable.elche)
        shields.add(R.drawable.valencia)
        shields.add(R.drawable.osasuna)
        shields.add(R.drawable.huesca)
        shields.add(R.drawable.getafe)
        shields.add(R.drawable.valladolid)
    }
}