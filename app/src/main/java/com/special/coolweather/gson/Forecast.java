package com.special.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Special on 2017/10/26.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;
    }

    public clas More{
        @SerializedName("txt_id")
        public String info;
    }
}
