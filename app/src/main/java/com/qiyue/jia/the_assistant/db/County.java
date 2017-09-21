package com.qiyue.jia.the_assistant.db;

import org.litepal.crud.DataSupport;

/**
 * Created by jia on 2017/9/21.
 * 区县信息
 */

public class County extends DataSupport {

    private int id;

    //区县名称
    private String countyName;

    //天气
    private String weatherId;

    //城市ID
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }





}
