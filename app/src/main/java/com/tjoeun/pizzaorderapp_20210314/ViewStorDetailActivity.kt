package com.tjoeun.pizzaorderapp_20210314

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.UserData
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.gun0912.tedpermission.TedPermission
import com.tjoeun.pizzaorderapp_20210314.datas.Store
import kotlinx.android.synthetic.main.activity_view_stor_detail.*
import java.security.Permission
import java.util.jar.Manifest

class ViewStorDetailActivity : BaseActivity() {

    lateinit var mStoreData: Store

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_stor_detail)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

        orderCallBtn.setOnClickListener {
            val pl = object : PermissionGranted() {

                val myUri = Uri.parse("tel:${mStoreData.phoneNum}")
                val myItent = Intent(Intent.ACTION_CALL,myUri)
                startActivity(myIntent)

            }
            TedPermission.with(mContext)
                .setPermissions(pl)
                .setDeniedMessage("[설정] 에서 통화 권한을 허락해주세요")
                .setPermissions(Manifest.permission.call_)
                .check()

           overide fun

        }

    }

    override fun setValues() {

        mStoreData = intent.getSerializableExtra("store") as Store

        nameTxt.text = mStoreData.StoreName
        phoneTxt.text = mStoreData.phoneNum

        Glide.with(mContext).load(mStoreData.logourl).into(logoImg)


    }


}