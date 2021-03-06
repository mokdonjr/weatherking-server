package com.example.weatherking.vfinfo.vsrt;

import com.example.weatherking.vfinfo.common.data.response.VFCategory;

/**
 * 기상청 초단기예보조회 응답 카테고리
 * 'T1H', 'RN1', 'SKY', 'UUU', 'VVV', 'REH', 'PTY', 'LGT', 'VEC', 'WSD'
 */
public enum VFCategoryVsrt implements VFCategory {
    T1H("기온", "℃", 10),
    RN1("1시간 강수량", "mm", 8),
    SKY("하늘상태", "코드값", 4),
    UUU("동서바람성분	", "m/s", 12),
    VVV("남북바람성분", "m/s", 12),
    REH("습도", "%", 8),
    PTY("강수형태", "코드값", 4),
    LGT("낙뢰", "코드값", 4),
    VEC("풍향", "0", 10),
    WSD("풍속", "1", 10),
    ;

    // 항목명
    private String name;
    // 단위
    private String unit;
    // 압축 bit 수
    private int bitNum;

    VFCategoryVsrt(String name, String unit, int bitNum) {
        this.name = name;
        this.unit = unit;
        this.bitNum = bitNum;
    }

    public String getName() {
        return name;
    }

    public String getUnit() {
        return unit;
    }

    public int getBitNum() {
        return bitNum;
    }
}
