package com.example.weatherking.vfinfo.common.service;

import com.example.weatherking.vfinfo.common.data.VFType;
import com.example.weatherking.vfinfo.common.data.request.VFRequest;
import com.example.weatherking.vfinfo.common.data.response.VFItem;
import com.example.weatherking.vfinfo.common.data.response.VFResponseDefault;

import java.util.List;

/**
 * 동네예보 서비스
 */
public interface VFService {

    /**
     * 동네예보 타입
     * @return
     */
    VFType getVFType();

    /**
     * 동네예보 요청 URL
     * @return
     */
    default String getRequestUrl() {
        return getVFType().getRequestUrl();
    }

    /**
     * 동네예보 응답 데이터 타입 인스턴스로 가져오기
     * @return
     */
    VFItem getVFResponseItemInstance();

    /**
     * 동네예보 요청 파라미터 가져오기
     * @return
     */
    VFRequest getVFRequestDefault(int page, int num);

    /**
     * 동네예보 요청하기
     * @return
     */
    List<VFResponseDefault> requestDefault();

    /**
     * 동네예보 파라미터로 요청하기
     * @param data
     * @return
     */
    VFResponseDefault request(VFRequest data);
}
