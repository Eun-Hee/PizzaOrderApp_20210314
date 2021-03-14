package com.tjoeun.pizzaorderapp_20210314

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tjoeun.pizzaorderapp_20210314.adapters.MyViewpagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

//    뷰페이저에 프래그먼트를 뿌려주기 위한 어댑터 변수
//    lateinit var 로

    lateinit var mvpa : MyViewpagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

//        ViewPager 에 연결될 어댑터를 실제 객체화 (메모리 등록)
        mvpa = MyViewpagerAdapter(supportFragmentManager)

//        메인화면에 있는 myViewPager의 adpater로, mvpa를 등록
        myViewPager.adapter = mvpa

//        탭레이아웃을 => myViewpage
        myTabLayout.setupWithViewPager(myViewPager)



    }

}