package com.tjoeun.pizzaorderapp_20210314.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.tjoeun.pizzaorderapp_20210314.R
import com.tjoeun.pizzaorderapp_20210314.adapters.StoreAdapter
import com.tjoeun.pizzaorderapp_20210314.datas.Store
import kotlinx.android.synthetic.main.fregment_pizza_stores.*

class PizzaStoresFregment : Fragment() {

    val mPizzaStores = ArrayList<Store>()

    lateinit var mPizzaStoreAdapter: StoreAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fregment_pizza_stores,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        mPizzaStores.add(Store("피자헛","1588-1588","https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FnkQca%2FbtqwVT4rrZo%2FymhFqW9uRbzrmZTxUU1QC1%2Fimg.jpg"))
        mPizzaStores.add(Store("파파존스","1577-8080","https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FnkQca%2FbtqwVT4rrZo%2FymhFqW9uRbzrmZTxUU1QC1%2Fimg.jpg"))
        mPizzaStores.add(Store("미스터피자","1577-0077","https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FnkQca%2FbtqwVT4rrZo%2FymhFqW9uRbzrmZTxUU1QC1%2Fimg.jpg"))
        mPizzaStores.add(Store("도미노피자","1577-3082","https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FnkQca%2FbtqwVT4rrZo%2FymhFqW9uRbzrmZTxUU1QC1%2Fimg.jpg"))

        mPizzaStoreAdapter = StoreAdapter(context!!, R.layout.store_list_item,mPizzaStores)

        pizzaStoreListView.adpter = mPizzaStoreAdapter
    }
}