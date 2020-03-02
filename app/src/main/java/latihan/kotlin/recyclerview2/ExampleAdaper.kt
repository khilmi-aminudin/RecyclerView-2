package latihan.kotlin.recyclerview2

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.example_item.view.*

class ExampleAdaper(private val exampleList: List<ExampleItem>): RecyclerView.Adapter<ExampleAdaper.ExampleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        val iteView = LayoutInflater.from(parent.context).inflate(R.layout.example_item,parent,false)
        return ExampleViewHolder(iteView)
    }

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        val currentItem = exampleList[position]

        holder.imageView.setImageResource(currentItem.imageResouce)
        holder.textView1.text = currentItem.text1
        holder.textView2.text = currentItem.text2

        if (position == 0){
            holder.textView1.setTextColor(Color.RED)
        }
    }

    override fun getItemCount() = exampleList.size

    class ExampleViewHolder(itemview: View): RecyclerView.ViewHolder(itemview){
        val imageView: ImageView = itemview.image_view
        val textView1: TextView = itemview.text_view_1
        val textView2: TextView = itemview.text_view_2
    }

}