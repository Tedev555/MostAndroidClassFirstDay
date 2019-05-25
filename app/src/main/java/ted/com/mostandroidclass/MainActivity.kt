package ted.com.mostandroidclass

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgList = ArrayList<Int>()
        val titleList = ArrayList<String>()

        imgList.add(R.drawable.golden_gate)
        imgList.add(R.drawable.golden_gate)
        imgList.add(R.drawable.golden_gate)
        imgList.add(R.drawable.golden_gate)

        titleList.add("Title 1")
        titleList.add("Title 2")
        titleList.add("Title 3")
        titleList.add("Title 4")

        val recyclerView =
                findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager =
                LinearLayoutManager(this,
                        LinearLayout.VERTICAL,
                false)

        val listAdapter = ListAdapter(this, imgList, titleList)

        recyclerView.adapter = listAdapter
    }
}
