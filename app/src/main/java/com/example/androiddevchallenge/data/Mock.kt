package com.example.androiddevchallenge.data

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate


@RequiresApi(Build.VERSION_CODES.O)
private val curDate: LocalDate = LocalDate.now()


val hourlyWeather = listOf(
    listOf(
        HourlyWeather(5, Weather.Sunny),
        HourlyWeather(6, Weather.Sunny),
        HourlyWeather(6, Weather.Sunnyrain),
        HourlyWeather(7, Weather.Sunnyrain),
        HourlyWeather(9, Weather.Sunnyrain),
        HourlyWeather(10, Weather.Sunny),
        HourlyWeather(10, Weather.Cloud),
        HourlyWeather(11, Weather.Cloud),
        HourlyWeather(12, Weather.Sunnyrain),
        HourlyWeather(14, Weather.Sunnyrain),
        HourlyWeather(15, Weather.Sunny),
        HourlyWeather(16, Weather.Sunny),
        HourlyWeather(18, Weather.Sunny),
        HourlyWeather(17, Weather.Sunny),
        HourlyWeather(15, Weather.Sunnyrain),
        HourlyWeather(13, Weather.Sunnyrain),
        HourlyWeather(10, Weather.Sunnyrain),
        HourlyWeather(8, Weather.Sunny),
        HourlyWeather(7, Weather.Cloud),
        HourlyWeather(6, Weather.Cloud),
        HourlyWeather(5, Weather.Sunnyrain),
        HourlyWeather(4, Weather.Sunnyrain),
        HourlyWeather(4, Weather.Sunny),
        HourlyWeather(3, Weather.Sunny),
    ),
    listOf(
        HourlyWeather(6, Weather.Sunny),
        HourlyWeather(8, Weather.Sunny),
        HourlyWeather(9, Weather.Sunnyrain),
        HourlyWeather(10, Weather.Sunnyrain),
        HourlyWeather(12, Weather.Sunnyrain),
        HourlyWeather(13, Weather.Sunny),
        HourlyWeather(15, Weather.Cloud),
        HourlyWeather(15, Weather.Cloud),
        HourlyWeather(17, Weather.Sunnyrain),
        HourlyWeather(19, Weather.Sunnyrain),
        HourlyWeather(20, Weather.Sunny),
        HourlyWeather(21, Weather.Sunny),
        HourlyWeather(21, Weather.Sunny),
        HourlyWeather(22, Weather.Sunny),
        HourlyWeather(20, Weather.Sunnyrain),
        HourlyWeather(19, Weather.Sunnyrain),
        HourlyWeather(18, Weather.Sunnyrain),
        HourlyWeather(16, Weather.Sunny),
        HourlyWeather(15, Weather.Cloud),
        HourlyWeather(12, Weather.Cloud),
        HourlyWeather(10, Weather.Sunnyrain),
        HourlyWeather(6, Weather.Sunnyrain),
        HourlyWeather(5, Weather.Sunny),
        HourlyWeather(7, Weather.Sunny),
    ),
    listOf(
        HourlyWeather(16, Weather.Cloud),
        HourlyWeather(18, Weather.Cloud),
        HourlyWeather(19, Weather.Sunnyrain),
        HourlyWeather(20, Weather.Sunnyrain),
        HourlyWeather(13, Weather.Sunnyrain),
        HourlyWeather(24, Weather.Sunny),
        HourlyWeather(13, Weather.Cloud),
        HourlyWeather(14, Weather.Cloud),
        HourlyWeather(15, Weather.Sunnyrain),
        HourlyWeather(14, Weather.Sunnyrain),
        HourlyWeather(12, Weather.Sunnyrain),
        HourlyWeather(16, Weather.Sunny),
        HourlyWeather(14, Weather.Sunny),
        HourlyWeather(13, Weather.Sunny),
        HourlyWeather(16, Weather.Sunnyrain),
        HourlyWeather(21, Weather.Sunnyrain),
        HourlyWeather(10, Weather.Sunnyrain),
        HourlyWeather(20, Weather.Sunny),
        HourlyWeather(14, Weather.Cloud),
        HourlyWeather(18, Weather.Cloud),
        HourlyWeather(18, Weather.Sunnyrain),
        HourlyWeather(16, Weather.Sunnyrain),
        HourlyWeather(11, Weather.Sunny),
        HourlyWeather(16, Weather.Sunny),
    ),
    listOf(
        HourlyWeather(12, Weather.Cloud),
        HourlyWeather(12, Weather.Cloud),
        HourlyWeather(14, Weather.Sunnyrain),
        HourlyWeather(16, Weather.Sunnyrain),
        HourlyWeather(19, Weather.Sunnyrain),
        HourlyWeather(20, Weather.Sunny),
        HourlyWeather(23, Weather.Cloud),
        HourlyWeather(24, Weather.Cloud),
        HourlyWeather(25, Weather.Sunnyrain),
        HourlyWeather(28, Weather.Sunnyrain),
        HourlyWeather(32, Weather.Sunnyrain),
        HourlyWeather(29, Weather.Sunny),
        HourlyWeather(18, Weather.Sunny),
        HourlyWeather(17, Weather.Sunny),
        HourlyWeather(16, Weather.Sunnyrain),
        HourlyWeather(16, Weather.Sunnyrain),
        HourlyWeather(14, Weather.Sunnyrain),
        HourlyWeather(10, Weather.Sunny),
        HourlyWeather(9, Weather.Cloud),
        HourlyWeather(9, Weather.Cloud),
        HourlyWeather(8, Weather.Sunnyrain),
        HourlyWeather(6, Weather.Sunnyrain),
        HourlyWeather(6, Weather.Sunny),
        HourlyWeather(5, Weather.Sunny),
    ),
    listOf(
        HourlyWeather(8, Weather.Cloud),
        HourlyWeather(10, Weather.Cloud),
        HourlyWeather(11, Weather.Sunnyrain),
        HourlyWeather(13, Weather.Sunnyrain),
        HourlyWeather(13, Weather.Sunnyrain),
        HourlyWeather(14, Weather.Sunny),
        HourlyWeather(15, Weather.Cloud),
        HourlyWeather(18, Weather.Cloud),
        HourlyWeather(20, Weather.Sunnyrain),
        HourlyWeather(23, Weather.Sunnyrain),
        HourlyWeather(25, Weather.Sunnyrain),
        HourlyWeather(25, Weather.Sunny),
        HourlyWeather(26, Weather.Sunny),
        HourlyWeather(25, Weather.Sunny),
        HourlyWeather(24, Weather.Sunnyrain),
        HourlyWeather(20, Weather.Sunnyrain),
        HourlyWeather(18, Weather.Sunnyrain),
        HourlyWeather(16, Weather.Sunny),
        HourlyWeather(15, Weather.Cloud),
        HourlyWeather(13, Weather.Cloud),
        HourlyWeather(12, Weather.Sunnyrain),
        HourlyWeather(11, Weather.Sunnyrain),
        HourlyWeather(9, Weather.Sunny),
        HourlyWeather(7, Weather.Sunny),
    ),
    listOf(
        HourlyWeather(16, Weather.Cloud),
        HourlyWeather(18, Weather.Cloud),
        HourlyWeather(19, Weather.Sunnyrain),
        HourlyWeather(20, Weather.Sunnyrain),
        HourlyWeather(13, Weather.Sunnyrain),
        HourlyWeather(24, Weather.Sunny),
        HourlyWeather(13, Weather.Cloud),
        HourlyWeather(14, Weather.Cloud),
        HourlyWeather(15, Weather.Sunnyrain),
        HourlyWeather(14, Weather.Sunnyrain),
        HourlyWeather(12, Weather.Sunnyrain),
        HourlyWeather(16, Weather.Sunny),
        HourlyWeather(14, Weather.Sunny),
        HourlyWeather(13, Weather.Sunny),
        HourlyWeather(16, Weather.Sunnyrain),
        HourlyWeather(21, Weather.Sunnyrain),
        HourlyWeather(10, Weather.Sunnyrain),
        HourlyWeather(20, Weather.Sunny),
        HourlyWeather(14, Weather.Cloud),
        HourlyWeather(18, Weather.Cloud),
        HourlyWeather(18, Weather.Sunnyrain),
        HourlyWeather(16, Weather.Sunnyrain),
        HourlyWeather(11, Weather.Sunny),
        HourlyWeather(16, Weather.Sunny),
    ),
    listOf(
        HourlyWeather(8, Weather.Cloud),
        HourlyWeather(10, Weather.Cloud),
        HourlyWeather(12, Weather.Sunnyrain),
        HourlyWeather(14, Weather.Sunnyrain),
        HourlyWeather(16, Weather.Sunnyrain),
        HourlyWeather(19, Weather.Sunny),
        HourlyWeather(21, Weather.Cloud),
        HourlyWeather(24, Weather.Cloud),
        HourlyWeather(27, Weather.Sunnyrain),
        HourlyWeather(30, Weather.Sunnyrain),
        HourlyWeather(32, Weather.Sunnyrain),
        HourlyWeather(29, Weather.Sunny),
        HourlyWeather(29, Weather.Sunny),
        HourlyWeather(27, Weather.Sunny),
        HourlyWeather(26, Weather.Sunnyrain),
        HourlyWeather(25, Weather.Sunnyrain),
        HourlyWeather(22, Weather.Sunnyrain),
        HourlyWeather(20, Weather.Sunny),
        HourlyWeather(18, Weather.Cloud),
        HourlyWeather(16, Weather.Cloud),
        HourlyWeather(14, Weather.Sunnyrain),
        HourlyWeather(12, Weather.Sunnyrain),
        HourlyWeather(11, Weather.Sunny),
        HourlyWeather(8, Weather.Sunny),
    ),
)


@RequiresApi(Build.VERSION_CODES.O)
val dailyWeather =
    (0..6).map {
        DailyWeather(
            curDate.plusDays(it.toLong()),
            hourlyWeather[it],
            when (it) {
                0 -> Weather.Sunny
                1 -> Weather.Sunny
                2 -> Weather.Cloud
                3 -> Weather.Cloud
                4 -> Weather.Cloud
                5 -> Weather.Sunny
                else -> Weather.Sunny
            }
        )
    }.toList()

