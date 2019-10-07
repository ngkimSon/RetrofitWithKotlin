package com.sean.retrofit


import com.sean.retrofit.model.Android
import com.sean.retrofit.model.Category
import io.reactivex.Observable
import retrofit2.http.GET

interface Service {

//    http://asian.dotplays.com
    @GET("/wp-json/wp/v2/categories")
    fun getCategory(): Observable<List<Category>>

    @GET("api/android")
    fun getData(): Observable<List<Android>>
}