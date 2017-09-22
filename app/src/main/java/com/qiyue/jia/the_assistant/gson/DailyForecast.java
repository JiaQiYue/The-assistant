package com.qiyue.jia.the_assistant.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jia on 2017/9/22.
 * 天气预报
 */

public class DailyForecast {

    @SerializedName("date")
    public String date;

    @SerializedName("tmp")
    public Tmp tmp;

    @SerializedName("cond")
    public Cond cond;

    public class Tmp {

        @SerializedName("max")
        public String maxTmp;

        @SerializedName("min")
        public String minTmp;
    }

    public class Cond {

        @SerializedName("txt_d")
        public String weatherForecast;
    }






}
