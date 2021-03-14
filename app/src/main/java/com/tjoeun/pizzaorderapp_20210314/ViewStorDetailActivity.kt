package com.tjoeun.pizzaorderapp_20210314

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.UserData
import com.tjoeun.pizzaorderapp_20210314.datas.Store

class ViewStorDetailActivity : BaseActivity() {

    lateinit var mStoreData: Store

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_stor_detail)
        setupEvents()
        setValues()

    override fun setupEvents() {

    }

    override fun setValues() {

        mStoreData = intent.getSerializableExtra("store") as Store

    }


    }
}