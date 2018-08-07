package id.androidjetpacks.surveykotlin.login

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import id.androidjetpacks.surveykotlin.R
import kotlinx.android.synthetic.main.fragment_login.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.debug
import org.jetbrains.anko.support.v4.alert
import org.jetbrains.anko.support.v4.toast

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [Login.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [Login.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class Login : Fragment(), AnkoLogger {
    //implementasi AnkoLogger disini berfungsi untuk melakukan logging


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        btn_Login.setOnClickListener {
            val username = et_Username.text.toString().trim()
            validateUser(username)
        }

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    private fun validateUser(username:String){
        //login dengan Anko
        debug { "username: $username" }

        if (username == "Abrar"){
            toast("Hi $username, welcome!")
        }else{
            alert("Username invalid!", "Login Failed!"){
                positiveButton(buttonText = "OK"){
                    //TODO: Not used
                }
            }.show()
        }
    }


}
