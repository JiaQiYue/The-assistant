package com.qiyue.jia.the_assistant.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jia on 2017/9/21.
 * 实时天气
 */

public class Now {

    @SerializedName("tmp")
    public String tmp;

    public Cond cond;

    public class Cond{

        @SerializedName("txt")
        public String weatherInfo;


    }
}
