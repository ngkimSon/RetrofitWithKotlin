package com.sean.retrofit.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Item {
    @SerializedName("owner")
    @Expose
    private var owner: Owner? = null
    @SerializedName("is_accepted")
    @Expose
    private var isAccepted: Boolean? = null
    @SerializedName("score")
    @Expose
    private var score: Int? = null
    @SerializedName("last_activity_date")
    @Expose
    private var lastActivityDate: Int? = null
    @SerializedName("creation_date")
    @Expose
    private var creationDate: Int? = null
    @SerializedName("answer_id")
    @Expose
    private var answerId: Int? = null
    @SerializedName("question_id")
    @Expose
    private var questionId: Int? = null
    @SerializedName("last_edit_date")
    @Expose
    private var lastEditDate: Int? = null

    fun getOwner(): Owner? {
        return owner
    }

    fun setOwner(owner: Owner) {
        this.owner = owner
    }

    fun getIsAccepted(): Boolean? {
        return isAccepted
    }

    fun setIsAccepted(isAccepted: Boolean?) {
        this.isAccepted = isAccepted
    }

    fun getScore(): Int? {
        return score
    }

    fun setScore(score: Int?) {
        this.score = score
    }

    fun getLastActivityDate(): Int? {
        return lastActivityDate
    }

    fun setLastActivityDate(lastActivityDate: Int?) {
        this.lastActivityDate = lastActivityDate
    }

    fun getCreationDate(): Int? {
        return creationDate
    }

    fun setCreationDate(creationDate: Int?) {
        this.creationDate = creationDate
    }

    fun getAnswerId(): Int? {
        return answerId
    }

    fun setAnswerId(answerId: Int?) {
        this.answerId = answerId
    }

    fun getQuestionId(): Int? {
        return questionId
    }

    fun setQuestionId(questionId: Int?) {
        this.questionId = questionId
    }

    fun getLastEditDate(): Int? {
        return lastEditDate
    }

    fun setLastEditDate(lastEditDate: Int?) {
        this.lastEditDate = lastEditDate
    }

}