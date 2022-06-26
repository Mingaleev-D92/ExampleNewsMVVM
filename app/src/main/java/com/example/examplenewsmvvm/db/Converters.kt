package com.example.examplenewsmvvm.db

import androidx.room.TypeConverter
import com.example.examplenewsmvvm.pojo.Source

/**
 * @author Mingaleev D. 26.06.2022
 **/
class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String):Source{
        return Source(name,name)
    }
}