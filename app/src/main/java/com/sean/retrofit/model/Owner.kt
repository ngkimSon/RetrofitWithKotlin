package com.sean.retrofit.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Owner {
    @SerializedName("reputation")
    @Expose
    private var reputation: Int? = null
    @SerializedName("user_id")
    @Expose
    private var userId: Int? = null
    @SerializedName("user_type")
    @Expose
    private var userType: String? = null
    @SerializedName("profile_image")
    @Expose
    private var profileImage: String? = null
    @SerializedName("display_name")
    @Expose
    private var displayName: String? = null
    @SerializedName("link")
    @Expose
    private var link: String? = null
    @SerializedName("accept_rate")
    @Expose
    private var acceptRate: Int? = null

    fun getReputation(): Int? {
        return reputation
    }

    fun setReputation(reputation: Int?) {
        this.reputation = reputation
    }

    fun getUserId(): Int? {
        return userId
    }

    fun setUserId(userId: Int?) {
        this.userId = userId
    }

    fun getUserType(): String? {
        return userType
    }

    fun setUserType(userType: String) {
        this.userType = userType
    }

    fun getProfileImage(): String? {
        return profileImage
    }

    fun setProfileImage(profileImage: String) {
        this.profileImage = profileImage
    }

    fun getDisplayName(): String? {
        return displayName
    }

    fun setDisplayName(displayName: String) {
        this.displayName = displayName
    }

    fun getLink(): String? {
        return link
    }

    fun setLink(link: String) {
        this.link = link
    }

    fun getAcceptRate(): Int? {
        return acceptRate
    }

    fun setAcceptRate(acceptRate: Int?) {
        this.acceptRate = acceptRate
    }

}