package com.sean.retrofit.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Cury {

    @SerializedName("name")
    @Expose
    private var name: String? = null
    @SerializedName("href")
    @Expose
    private var href: String? = null
    @SerializedName("templated")
    @Expose
    private var templated: Boolean? = null

    fun getName(): String? {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getHref(): String? {
        return href
    }

    fun setHref(href: String) {
        this.href = href
    }

    fun getTemplated(): Boolean? {
        return templated
    }

    fun setTemplated(templated: Boolean?) {
        this.templated = templated
    }
}