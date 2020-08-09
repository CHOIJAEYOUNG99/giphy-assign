package com.example.giphyassign.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.giphyassign.R

class TrendingContent:Fragment(R.layout.trending_fragment) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

/*
        gifsGridView.direction = DemoConfig.direction
        gifsGridView.spanCount = DemoConfig.spanCount
        gifsGridView.cellPadding = DemoConfig.cellPadding
        gifsGridView.fixedSizeCells = DemoConfig.fixedSizeCells
        gifsGridView.showCheckeredBackground = DemoConfig.showCheckeredBackground
        setTrendingQuery()

        gifsGridView.callback = object : GPHGridCallback {
            override fun contentDidUpdate(resultCount: Int) {
                Timber.d("contentDidUpdate $resultCount")
            }

            override fun didSelectMedia(media: Media) {
                Timber.d("didSelectMedia ${media.id}")

                Toast.makeText(
                    activity,
                    "media selected: ${media.id}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
        gifsGridView.searchCallback = object : GPHSearchGridCallback {
            override fun didTapUsername(username: String) {
                Timber.d("didTapUsername $username")
            }

            override fun didLongPressCell(cell: GifView) {
                Timber.d("didLongPressCell")
            }

            override fun didScroll(dx: Int, dy: Int) {
                Timber.d("didScroll")
            }
        }
    }
*/
    }

}