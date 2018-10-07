# LeagueSelection

#what is covered here ????

1. Switch between Explicit Intent
2. Toggle Button
3. Send data with Intent
4. Introduced with Parcelable
5. Instance Sate 

# what is Instance state
if we rotate our app the recent data is removed and all the variables re create to stop this we use 

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }
    
     override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState != null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

so the data is stored and if rotation happened the data will be parced . 

The App is with basic snippets no beautifull layouts . Just for learning the Functionalities
