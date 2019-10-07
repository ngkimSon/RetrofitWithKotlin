package com.sean.retrofit.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Items {
    @SerializedName("items")
    @Expose
    private var items: List<Item>? = null
    @SerializedName("has_more")
    @Expose
    private var hasMore: Boolean? = null
    @SerializedName("quota_max")
    @Expose
    private var quotaMax: Int? = null
    @SerializedName("quota_remaining")
    @Expose
    private var quotaRemaining: Int? = null

    fun getItems(): List<Item>? {
        return items
    }

    fun setItems(items: List<Item>) {
        this.items = items
    }

    fun getHasMore(): Boolean? {
        return hasMore
    }

    fun setHasMore(hasMore: Boolean?) {
        this.hasMore = hasMore
    }

    fun getQuotaMax(): Int? {
        return quotaMax
    }

    fun setQuotaMax(quotaMax: Int?) {
        this.quotaMax = quotaMax
    }

    fun getQuotaRemaining(): Int? {
        return quotaRemaining
    }

    fun setQuotaRemaining(quotaRemaining: Int?) {
        this.quotaRemaining = quotaRemaining
    }

}