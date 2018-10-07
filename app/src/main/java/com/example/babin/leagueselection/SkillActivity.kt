package com.example.babin.leagueselection

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.babin.leagueselection.model.Player
import com.example.babin.leagueselection.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

  //  var league = ""
   // var selection = ""
    lateinit var player : Player

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        /*
        we dont need to create a line like Intent intent = getIntent()
        kotlin is smart enogh to detect the things
         */
        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null) {
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

        fun beginnerC(view : View){

        pro.isChecked = false
       // selection = "Beginner"
        player.level = "Beginner"
    }

    fun proC(view : View){

        beginner.isChecked = false
        //selection = "Pro"
        player.level="Pro"
    }

    fun adone(view : View){

        if(player.level != "" ){
            val finalActivity = Intent(this,FinalActivity::class.java)
            finalActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(finalActivity)
        }else{
            Toast.makeText(this,"Select your level",Toast.LENGTH_SHORT).show()
        }
    }
}
