package com.qiyue.jia.the_assistant.db;

import org.litepal.crud.DataSupport;

/**
 * Created by jia on 2017/9/21.
 * 省份信息
 */

//LitePal中的每个实体类都必须继承自DataSupport类.
public class Province extends DataSupport {

    //省份ID
    private int id;

    //省份名称
    private String provinceName;

    //省份代号
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
