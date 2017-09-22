package com.qiyue.jia.the_assistant.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jia on 2017/9/21.
 * 空气质量
 */

public class Aqi {

    @SerializedName("city")
    public AQICity city;

    public class AQICity {

        @SerializedName("aqi")
        public String aqi;

        @SerializedName("pm25")
        public String pm25;
    }
}
