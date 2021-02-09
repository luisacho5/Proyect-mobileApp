package com.example.laliga

import android.annotation.SuppressLint
import android.app.PendingIntent.getActivity
import android.icu.text.Transliterator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.internal.ContextUtils.getActivity
import kotlinx.android.synthetic.main.team_info.*
import java.text.FieldPosition


class TeamInfo : AppCompatActivity() {
    var position=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.team_info)
        position=intent.getIntExtra("position",0)
        showImage_text(position)
    }
    @SuppressLint("SetTextI18n")
    fun showImage_text(position: Int){
        when (position+1){
            1-> {
                image.setImageResource(R.drawable.atletico)
                name.setText("Atlético de Madrid")
                facts.setText(R.string.Atletico_facts)
            }
            2-> {
                image.setImageResource(R.drawable.realmadrid)
                name.setText("Real Madrid")
                facts.setText(R.string.RealMadrid_facts)
            }
            3->{
                image.setImageResource(R.drawable.barcelona)
                name.setText("FC Barcelona")
                facts.setText(R.string.Barcelona_facts)
            }
            4-> {
                image.setImageResource(R.drawable.sevilla)
                name.setText("Sevilla FC")
                facts.setText(R.string.Sevilla_facts)
            }
            5-> {
                image.setImageResource(R.drawable.betis)
                name.setText("Real Betis")
                facts.setText(R.string.RealBetis_facts)
            }
            6-> {
                image.setImageResource(R.drawable.villarreal)
                name.setText("Villarreal")
                facts.setText(R.string.Villarreal_facts)
            }
            7-> {
                image.setImageResource(R.drawable.realsociedad)
                name.setText("Real Sociedad")
                facts.setText(R.string.RealSociedad_facts)
            }
            8-> {
                image.setImageResource(R.drawable.granada)
                name.setText("Granada")
                facts.setText(R.string.Granada_facts)
            }
            9-> {
                image.setImageResource(R.drawable.celta)
                name.setText("Celta")
                facts.setText(R.string.Celta_facts)
            }
            10-> {
                image.setImageResource(R.drawable.bilbao)
                name.setText("Athletic Club de Bilbao")
                facts.setText(R.string.Athletic_facts)
            }
            11-> {
                image.setImageResource(R.drawable.cadiz)
                name.setText("Cadiz")
                facts.setText(R.string.Cadiz_facts)
            }
            12->{
                image.setImageResource(R.drawable.eibar)
                name.setText("Eibar")
                facts.setText(R.string.Eibar_facts)
            }
            13-> {
                image.setImageResource(R.drawable.levante)
                name.setText("Levante")
                facts.setText(R.string.Levante_facts)
            }
            14-> {
                image.setImageResource(R.drawable.alaves)
                name.setText("Alavés")
                facts.setText(R.string.Alaves_facts)
            }
            15-> {
                image.setImageResource(R.drawable.elche)
                name.setText("Elche")
                facts.setText(R.string.Elche_facts)
            }
            16-> {
                image.setImageResource(R.drawable.valencia)
                name.setText("Valencia")
                facts.setText(R.string.Valencia_facts)
            }
            17->{
                image.setImageResource(R.drawable.osasuna)
                name.setText("Osasuna")
                facts.setText(R.string.Osasuna_facts)
            }
            18 -> {
                image.setImageResource(R.drawable.huesca)
                name.setText("Huesca")
                facts.setText(R.string.Huesca_facts)
            }
            19-> {
                image.setImageResource(R.drawable.getafe)
                name.setText("Getafe")
                facts.setText(R.string.Getafe_facts)
            }
            20-> {
                image.setImageResource(R.drawable.valladolid)
                name.setText("Valladolid")
                facts.setText(R.string.Valladolid_facts)
            }


        }
    }
}