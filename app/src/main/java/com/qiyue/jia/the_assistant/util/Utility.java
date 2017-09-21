package com.qiyue.jia.the_assistant.util;

import android.text.TextUtils;

import com.qiyue.jia.the_assistant.db.City;
import com.qiyue.jia.the_assistant.db.County;
import com.qiyue.jia.the_assistant.db.Province;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by jia on 2017/9/21.
 */

public class Utility {

    /**
     * 解析和处理服务器返回的省级数据
     */
    public static boolean handleProvinceResponse(String response) {
        if(!TextUtils.isEmpty(response)) {
            try {
                JSONArray allProvinces = new JSONArray(response);
                for (int i = 0; i < allProvinces.length(); i++) {
                    JSONObject provinceObject = allProvinces.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceName(provinceObject.getString("name"));
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.save();
                }
                return true ;

            }catch (JSONException e) {

                e.printStackTrace();

            }
        }
        return false;
    }

    /**
     * 解析和处理服务器返回的市级数据
     */
    public static boolean handleCityResponse(String response, int provinceId) {
        if (!response.isEmpty()) {
            try {
                JSONArray allCitys = new JSONArray(response);
                for (int i = 0; i < allCitys.length(); i++) {
                    JSONObject cityObject = allCitys.getJSONObject(i);
                    City city = new City();
                    city.setCityName(cityObject.getString("name"));
                    city.setCityCode(cityObject.getInt("id"));
                    city.setProvinceId(provinceId);
                    city.save();

                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
        return false;
    }

    /**
     * 解析和处理服务器返回的县级数据
     */
    public static boolean handleCountyResponse(String response, int cityId) {
        if (!response.isEmpty()) {
            try {
                JSONArray countyArray = new JSONArray(response);
                for(int i = 0; i < countyArray.length(); i++) {
                    JSONObject countyObject = countyArray.getJSONObject(i);
                    County county = new County();
                    county.setCountyName(countyObject.getString("name"));
                    county.setWeatherId(countyObject.getString("wweather_id"));
                    county.setCityId(cityId);
                    county.save();

                }
                return true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
