package com.tjoeun.pizzaorderapp_20210314.fragments

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.tjoeun.pizzaorderapp_20210314.R
import com.tjoeun.pizzaorderapp_20210314.adapters.MyViewpagerAdapter
import kotlinx.android.synthetic.main.activity_edit_nickname.*
import kotlinx.android.synthetic.main.fregment_my_profile.*

class MyProfileFregment : Fragment() {

    val REQUEST_FOR_NICKNAME = 54321

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fregment_my_profile,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        editNickBtn.setOnClickListener {

            val myIntent = Intent(activity.EditNicknameActivity::class.java)
            startActivityForResult(myIntent, REQUEST_FOR_NICKNAME)

        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQUEST_FOR_NICKNAME) {

            if (requestCode == Activity.RESULT_OK) {

                val newNickname = data?.getStringExtra("nick")

                niclNameTxt.text = newNickname
            }
        }
    }

}