package com.example.giphyassign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.giphyassign.fragments.FavoriteContent
import com.example.giphyassign.fragments.TrendingContent
import com.giphy.sdk.ui.Giphy
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        val API_KEY = "e7NQ1m7Ocgqjl7CuQz1wzzepKW5e9yAy"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomBarStatus()

        Giphy.configure(this, API_KEY, true)
    }

    private fun bottomBarStatus() {
        bottomBar.onItemSelected = { position ->
            when (position) {
                0 -> displayFragment(TrendingContent())
                1 -> displayFragment(FavoriteContent())
            }
        }
        bottomBar.onItemSelected?.invoke(0)
    }

    private fun displayFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainerView, fragment)
        transaction.commit()
    }
}