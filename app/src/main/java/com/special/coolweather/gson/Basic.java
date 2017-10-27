package com.special.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Special on 2017/10/26.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
