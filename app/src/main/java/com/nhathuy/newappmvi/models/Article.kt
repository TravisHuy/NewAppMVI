package com.nhathuy.newappmvi.models

data class Article(
    val title:String?=null,
    val author:String?=null,
    val description:String?=null,
    val url:String?=null,
    val urlToImage:String?=null,
    val publishDate:String?=null,
    val content:String?=null,
    val isFavorite:Boolean= false
){
    override fun equals(other: Any?): Boolean {
        if(this===other) return true
        if(javaClass!=other?.javaClass)return false
        other as Article
        if(url != other.url) return false
        return true
    }
    override fun hashCode(): Int {
        return url.hashCode()
    }
}
