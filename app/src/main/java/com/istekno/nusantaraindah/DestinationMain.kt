package com.istekno.nusantaraindah

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class DestinationMain : AppCompatActivity() {

    private lateinit var rvDestination : RecyclerView
    private var list: ArrayList<Destination> = arrayListOf()

    companion object {
        const val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycler_view_main)
        supportActionBar?.title = "Daftar Wisata"

//        Create list from getter listData from DestinationDataJatim
        rvDestination = findViewById(R.id.rv_main)
        list.addAll(DestinationDataJatim.listData)

//        Initializing Recycle View Layout by findViewById
        rvDestination.setHasFixedSize(true)

//        run List RecyclerView Activity
        showDestinationCard()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun showDestinationList() {
        rvDestination.layoutManager = LinearLayoutManager(this)
        val listDestinationAdapter = DestinationListAdapter(list)
        rvDestination.adapter = listDestinationAdapter

        listDestinationAdapter.setOnItemClickCallback(object : DestinationListAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Destination) {
                showSelectedhero(data)
            }
        })
    }

    private fun showDestinationGrid() {
        rvDestination.layoutManager = GridLayoutManager(this,2)
        val gridDestinationAdapter = DestinationGridAdapter(list)
        rvDestination.adapter = gridDestinationAdapter

        gridDestinationAdapter.setOnItemClickCallback(object : DestinationGridAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Destination) {
                showSelectedhero(data)
            }
        })
    }

    private fun showDestinationCard() {
        rvDestination.layoutManager = LinearLayoutManager(this)
        val cardDestinationAdapter = DestinationCardAdapter(list)
        rvDestination.adapter = cardDestinationAdapter

        cardDestinationAdapter.setOnItemClickCallback(object : DestinationCardAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Destination) {
                showSelectedhero(data)
            }
        })

        cardDestinationAdapter.setOnItemClickCallback2(object : DestinationCardAdapter.OnItemClickCallback2 {
            override fun onItemClicked2(data: Destination) {
                val mUriIntent = Uri.parse("geo:0,0?q=${data.name.toString() + " " + data.location.toString()}")
                val mMapIntent = Intent(Intent.ACTION_VIEW, mUriIntent)
                mMapIntent.setPackage("com.google.android.apps.maps")
                startActivity(mMapIntent)
            }
        })
    }

    private fun setMode(selectMode: Int) {
        when (selectMode) {
            R.id.action_list -> {
                showDestinationList()
            }

            R.id.action_grid -> {
                showDestinationGrid()
            }

            R.id.action_card -> {
                showDestinationCard()
            }
        }
    }

    private fun showSelectedhero(desti: Destination) {
        Toast.makeText(this, "Kamu memilih " + desti.name, Toast.LENGTH_SHORT).show()

        val detailPage = Intent(this@DestinationMain,DetailsPageMain::class.java)
        detailPage.putExtra(INTENT_PARCELABLE,desti)
        startActivity(detailPage)
    }

}
