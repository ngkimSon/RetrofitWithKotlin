package com.sean.retrofit.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Category {
    @SerializedName("id")
    @Expose
    private var id: Int? = null
    @SerializedName("count")
    @Expose
    private var count: Int? = null
    @SerializedName("description")
    @Expose
    private var description: String? = null
    @SerializedName("link")
    @Expose
    private var link: String? = null
    @SerializedName("name")
    @Expose
    private var name: String? = null
    @SerializedName("slug")
    @Expose
    private var slug: String? = null
    @SerializedName("taxonomy")
    @Expose
    private var taxonomy: String? = null
    @SerializedName("parent")
    @Expose
    private var parent: Int? = null
    @SerializedName("meta")
    @Expose
    private var meta: List<Any>? = null
    @SerializedName("_links")
    @Expose
    private var links: Links? = null

    fun getId(): Int? {
        return id
    }

    fun setId(id: Int?) {
        this.id = id
    }

    fun getCount(): Int? {
        return count
    }

    fun setCount(count: Int?) {
        this.count = count
    }

    fun getDescription(): String? {
        return description
    }

    fun setDescription(description: String) {
        this.description = description
    }

    fun getLink(): String? {
        return link
    }

    fun setLink(link: String) {
        this.link = link
    }

    fun getName(): String? {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getSlug(): String? {
        return slug
    }

    fun setSlug(slug: String) {
        this.slug = slug
    }

    fun getTaxonomy(): String? {
        return taxonomy
    }

    fun setTaxonomy(taxonomy: String) {
        this.taxonomy = taxonomy
    }

    fun getParent(): Int? {
        return parent
    }

    fun setParent(parent: Int?) {
        this.parent = parent
    }

    fun getMeta(): List<Any>? {
        return meta
    }

    fun setMeta(meta: List<Any>) {
        this.meta = meta
    }

    fun getLinks(): Links? {
        return links
    }

    fun setLinks(links: Links) {
        this.links = links
    }
}