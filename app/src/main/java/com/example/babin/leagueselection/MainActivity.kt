package com.example.babin.leagueselection

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import com.example.babin.leagueselection.model.Player
import com.example.babin.leagueselection.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  //  var selectedLeague = ""

    var player = Player("","")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState != null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    /* here to click an widget we can use the id name of the
    widget as the function name
     */

    fun boysClicked (view : View){

        girls.isChecked = false
        coed.isChecked = false

       // selectedLeague = "Mens"
        player.league = "Mens"
    }

    fun girlsClicked (view : View){

        boys.isChecked = false
        coed.isChecked = false

       // selectedLeague = "Girls"
        player.league = "Girls"
    }

    fun coedClicked (view : View){

        girls.isChecked = false
        boys.isChecked = false

       // selectedLeague = "Coed"
        player.league = "Coed"
    }

    fun buttonClicked (view : View){

        // this is how to switch to an explicit intent in Kotlin

        if(player.league != ""){

            val skillActivity = Intent(this,SkillActivity::class.java)
            // here is how to pass a data through intent
            skillActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this," please select a league",Toast.LENGTH_SHORT).show()
        }

        //it may work also
        //startActivity(Intent(applicationContext,SkillActivity::class.java))
    }
}
