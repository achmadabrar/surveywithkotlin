package id.androidjetpacks.surveykotlin.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import id.androidjetpacks.surveykotlin.R.layout.list_question
import id.androidjetpacks.surveykotlin.models.Questions
import kotlinx.android.synthetic.main.list_question.view.*

class QuestionAdapter(private val list: ArrayList<Questions>): RecyclerView.Adapter<QuestionAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(LayoutInflater.from(parent.context).inflate(list_question, parent, false))
    }

    override fun getItemCount(): Int = list?.size


    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.view.tv_question.text = list?.get(position)?.question
    }


    class Holder(val view: View) : RecyclerView.ViewHolder(view)
}