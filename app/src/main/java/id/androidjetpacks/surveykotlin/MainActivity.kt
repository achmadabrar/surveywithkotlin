package id.androidjetpacks.surveykotlin

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.view.inputmethod.InputMethodManager
import id.androidjetpacks.surveykotlin.login.Login

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState == null){
            changeFragment(Login(), false, "login")
        }

    }

    fun changeFragment(f: Fragment, cleanStack: Boolean, tag: String) {
        val ft = supportFragmentManager.beginTransaction()
        if(cleanStack)
            clearBackStack(supportFragmentManager)
        hideKeyboard()
        ft.replace(R.id.act_main, f, tag)
                .addToBackStack(null)
                .commitAllowingStateLoss()
    }

    fun clearBackStack(fm: FragmentManager) {
        if (fm.backStackEntryCount > 0){
            val first = fm.getBackStackEntryAt(0)
            fm.popBackStack(first.id, android.app.FragmentManager.POP_BACK_STACK_INCLUSIVE)
        }
    }

    fun hideKeyboard(){
        val inputManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

        // check if no view has focus:
        val currentFocusedView = getCurrentFocus()
        if (currentFocusedView != null) {
            inputManager.hideSoftInputFromWindow(currentFocusedView!!.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS)
        }
    }
}
