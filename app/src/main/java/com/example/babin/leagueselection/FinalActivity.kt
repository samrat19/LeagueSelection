package com.example.babin.leagueselection

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.babin.leagueselection.model.Player
import com.example.babin.leagueselection.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_final.*

class FinalActivity : AppCompatActivity() {

  //  var league = ""
  //  var selection =  ""
  lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

  //      league = intent.getStringExtra("league")
     //   selection = intent.getStringExtra("level")

        leaguefinal.text = "looking for ${player.league} league in ${player.level} level"
    }
}
