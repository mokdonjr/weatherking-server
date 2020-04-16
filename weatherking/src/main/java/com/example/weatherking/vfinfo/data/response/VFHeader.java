package com.example.weatherking.vfinfo.data.response;

import com.example.weatherking.vfinfo.data.JsonConvertible;

public class VFHeader implements JsonConvertible<VFHeader> {
    private String resultCode;
    private String resultMsg;

    @Override
    public String serializeJson() {
        return null;
    }

    @Override
    public VFHeader deserializeJson(String json) {
        return null;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    @Override
    public String toString() {
        return "VFHeader{" +
                "resultCode='" + resultCode + '\'' +
                ", resultMsg='" + resultMsg + '\'' +
                '}';
    }
}