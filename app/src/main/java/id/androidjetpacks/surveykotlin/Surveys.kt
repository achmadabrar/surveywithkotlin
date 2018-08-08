package id.androidjetpacks.surveykotlin


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import id.androidjetpacks.surveykotlin.R.id.mRecyclerView
import id.androidjetpacks.surveykotlin.R.layout.fragment_surveys
import id.androidjetpacks.surveykotlin.models.Questions
import id.androidjetpacks.surveykotlin.adapter.*
import kotlinx.android.synthetic.main.fragment_surveys.*
import java.util.ArrayList
import java.util.zip.Inflater


/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [Surveys.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [Surveys.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class Surveys : Fragment() {

    val list = ArrayList<Questions>()
    val listQuestion = arrayOf(
            "Pertanyaan pertama adalah?", "Pertanyaan kedua adalah?", "Pertanyaan ketiga adalah?",
            "Pertanyaan keempat adalah?", "Pertanyaan kelima adalah?", "Pertanyaan keenam adalah?",
            "Pertanyaan ketujuh adalah?", "pertanyaan kedelapan adalah?", "Pertanyaan kesembilan adalah?",
            "Pertanyaan kesepuluh adalah?", "Pertanyaan kesebelas adalah?", "Pertanyaan kedua belas adalah?"
    )

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return super.onCreateView(inflater, container, savedInstanceState)

        return inflater.inflate(fragment_surveys, container, false)

        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.layoutManager = LinearLayoutManager(context)

        for (i in 0 until listQuestion.size){

            list.add(Questions(listQuestion.get(i)))

            if(listQuestion.size - 1 == i){
                // init adapter yang telah dibuat tadi
                val adapter = QuestionAdapter(list)
                adapter.notifyDataSetChanged()

                //tampilkan data dalam recycler view
                mRecyclerView.adapter = adapter
            }

        }
    }






}
