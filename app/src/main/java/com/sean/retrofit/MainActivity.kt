package com.sean.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.DialogPreference
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager

import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout

import com.sean.retrofit.ApiClient.service
import com.sean.retrofit.adapter.DataAdapter
import com.sean.retrofit.model.Android
import com.sean.retrofit.model.Category
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList


class MainActivity : AppCompatActivity(), DataAdapter.Listener {

    private val TAG = MainActivity::class.java.simpleName
    //    private val BASE_URL = "https://learn2crack-json.herokuapp.com"
    private var mCompositeDisposable: CompositeDisposable? = null
    private var mAndroidArrayList: ArrayList<Category>? = null
    private var mAdapter: DataAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mCompositeDisposable = CompositeDisposable()


        initRecyclerView()
        getData()
    }

    private fun initRecyclerView() {
        rv_android_list.setHasFixedSize(true)
        val layoutManager: RecyclerView.LayoutManager = GridLayoutManager(this, 2)
        rv_android_list.layoutManager = layoutManager

    }

    private fun getData() {
        mCompositeDisposable?.add(
            service.getCategory()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::handleResponse, this::handleError)

        )


    }

    private fun handleResponse(androidList: List<Category>) {
        mAndroidArrayList = ArrayList(androidList)
        mAdapter = DataAdapter(mAndroidArrayList!!, this)
        rv_android_list.adapter = mAdapter
    }

    private fun handleError(error: Throwable) {
//        Log.d(TAG, error.localizedMessage)
        Toast.makeText(this, "Error ${error.localizedMessage}", Toast.LENGTH_SHORT).show()
    }

    override fun onItemClick(category: Category) {
        Toast.makeText(this, "${category.getName()} <3", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        mCompositeDisposable?.clear()
    }
}
