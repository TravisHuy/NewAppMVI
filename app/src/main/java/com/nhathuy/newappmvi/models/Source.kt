package com.nhathuy.newappmvi.models

import androidx.room.ColumnInfo
import androidx.room.Ignore

data class Source(

    @ColumnInfo(name = "source_id")
    var id:String?="",
    @ColumnInfo(name = "source_name")
    var name:String?="",
    //@Ignore is a Room-specific annotation, saying that Room should ignore that field or method.
    @Ignore
    var description:String?=null,
    @Ignore
    var url:String?=null,
    @Ignore
    var country:String?=null,
    @Ignore
    var language:String?=null,
    @Ignore
    var category: String?=null
)
