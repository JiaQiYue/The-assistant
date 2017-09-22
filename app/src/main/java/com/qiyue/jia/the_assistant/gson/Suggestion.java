package com.qiyue.jia.the_assistant.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jia on 2017/9/21.
 * 出行建议
 */

public class Suggestion {

    @SerializedName("comf")
    public Comf comf;

    @SerializedName("air")
    public Air air;

    @SerializedName("uv")
    public Uv uv;

    public class Comf {

        @SerializedName("brf")
        public String comfBrf;

        @SerializedName("txt")
        public String  comfInfo;

    }

    public class Air {

        @SerializedName("brf")
        public String airBrf;

        @SerializedName("txt")
        public String airTxt;
    }

    public class Uv {

        @SerializedName("brf")
        public String uvBrf;

        @SerializedName("txt")
        public String uvTxt;
    }

}
