package com.warriorsdev.teststratis.remote.data

import com.squareup.moshi.Json

class DataTimeZone {
    
    @field:Json(name="abbreviation")
    val abbreviation:String? = null
    
    @field:Json(name="client_ip")
    val clientIp:String? = null
    
    @field:Json(name="datetime")
    val datetime:String? = null
    
    @field:Json(name="day_of_week")
    val dayOfWeek:String? = null
    
    @field:Json(name="day_of_year")
    val dayOfYear:String? = null
    
    @field:Json(name="String")
    val dst:String? = null
    
    @field:Json(name="dst_from")
    val dstFrom:String? = null
    
    @field:Json(name="dst_offset")
    val dstOffset:String? = null
    
    @field:Json(name="dst_until")
    val dstUntil:String? = null
    
    @field:Json(name="raw_offset")
    val rawOffset:String? = null
    
    @field:Json(name="timezone")
    val timezone:String? = null
    
    @field:Json(name="unixtime")
    val unixTime:String? = null
    
    @field:Json(name="utc_datetime")
    val utcDatetime:String? = null
    
    @field:Json(name="utc_offset")
    val utcOffset:String? = null
    
    @field:Json(name="week_number")
    val weekNumber:String? = null
}