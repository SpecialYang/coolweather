package com.special.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Special on 2017/10/26.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }

}
