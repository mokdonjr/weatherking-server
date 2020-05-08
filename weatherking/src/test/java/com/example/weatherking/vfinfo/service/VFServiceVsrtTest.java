package com.example.weatherking.vfinfo.service;

import com.example.weatherking.util.DateUtil;
import com.example.weatherking.vfinfo.config.VFConfig;
import com.example.weatherking.vfinfo.data.VFDataType;
import com.example.weatherking.vfinfo.data.VFType;
import com.example.weatherking.vfinfo.data.request.VFRequest;
import com.example.weatherking.vfinfo.data.request.VFRequestParamVsrt;

public class VFServiceVsrtTest extends AbsVFServiceTest {

    @Override
    protected VFType getVFType() {
        return VFType.VF_VSRT;
    }

    @Override
    protected VFRequest getVFRequestDefault() {
        VFRequest vfRequest = new VFRequest();
        vfRequest.setServiceKey(VFConfig.getServiceKey());
        vfRequest.setPageNo(1);
        vfRequest.setNumOfRows(10);
        vfRequest.setDataType(VFDataType.JSON);
        VFRequestParamVsrt vfRequestParamVsrt = new VFRequestParamVsrt();
        vfRequestParamVsrt.setBase_date(DateUtil.dateToStringyyyyMMdd(DateUtil.getDateAfterHours(-1)));
        vfRequestParamVsrt.setBase_time(DateUtil.dateToStringHHmm(DateUtil.getDateAfterHours(-1)));
        vfRequestParamVsrt.setNx(1);
        vfRequestParamVsrt.setNy(1);
        vfRequest.setVfRequestParam(vfRequestParamVsrt);
        return vfRequest;
    }
}
