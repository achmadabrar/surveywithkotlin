package id.androidjetpacks.surveykotlin

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup




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


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_surveys, container, false)
    }


}
