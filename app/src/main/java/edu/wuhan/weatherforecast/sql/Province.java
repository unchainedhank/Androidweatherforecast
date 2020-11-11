package edu.wuhan.weatherforecast.sql;

import org.litepal.crud.LitePalSupport;

public class Province extends LitePalSupport {
    private int id;
    private String provinceName;
    private int provinceAdCode;

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

    public int getProvinceAdCode() {
        return provinceAdCode;
    }

    public void setProvinceAdCode(int provinceAdCode) {
        this.provinceAdCode = provinceAdCode;
    }
}
