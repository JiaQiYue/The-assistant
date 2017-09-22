package com.qiyue.jia.the_assistant.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by jia on 2017/9/22.
 */

public class Weather {

    public String status;

    public Basic basic;

    public Aqi aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<DailyForecast> dailyforecast;
}
