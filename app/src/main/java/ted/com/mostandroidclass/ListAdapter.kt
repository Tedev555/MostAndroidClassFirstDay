package ted.com.mostandroidclass

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


class ListAdapter(var context: Context,
                  var imgResList: List<Int>,
                  var titleList: List<String>):
        RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.list_item,
                p0,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return imgResList.size
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.bindItems(imgResList[position], titleList[position])
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bindItems(imgRes: Int, titleStr: String) {
            val coverImg: ImageView = itemView.findViewById(R.id.coverImageView)
            val titleTv: TextView = itemView.findViewById(R.id.titleTextView)

            coverImg.setImageResource(imgRes)
            titleTv.text = titleStr
        }
    }
}