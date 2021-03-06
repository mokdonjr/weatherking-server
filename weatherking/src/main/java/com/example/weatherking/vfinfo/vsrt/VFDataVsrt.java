package com.example.weatherking.vfinfo.vsrt;

import java.util.Date;

/**
 * VF_VSRT 테이블
 * 초단기예보기록
 */
public class VFDataVsrt {
    private Long noticeTime; // pk
    private Long forecastTime; // pk
    private Integer nx; // pk
    private Integer ny; // pk
    private VFCategoryVsrt category; // pk
    private String value;
    private Date createAt;

    public Long getNoticeTime() {
        return noticeTime;
    }

    public void setNoticeTime(Long noticeTime) {
        this.noticeTime = noticeTime;
    }

    public Long getForecastTime() {
        return forecastTime;
    }

    public void setForecastTime(Long forecastTime) {
        this.forecastTime = forecastTime;
    }

    public Integer getNx() {
        return nx;
    }

    public void setNx(Integer nx) {
        this.nx = nx;
    }

    public Integer getNy() {
        return ny;
    }

    public void setNy(Integer ny) {
        this.ny = ny;
    }

    public VFCategoryVsrt getCategory() {
        return category;
    }

    public void setCategory(VFCategoryVsrt category) {
        this.category = category;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
