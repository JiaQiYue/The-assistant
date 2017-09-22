package com.qiyue.jia.the_assistant.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jia on 2017/9/21.
 * 基础信息
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }


}
