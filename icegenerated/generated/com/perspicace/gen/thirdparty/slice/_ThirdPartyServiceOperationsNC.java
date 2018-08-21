// **********************************************************************
//
// Copyright (c) 2003-2016 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.3
//
// <auto-generated>
//
// Generated from file `thirdparty.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.perspicace.gen.thirdparty.slice;

public interface _ThirdPartyServiceOperationsNC
{
    SimpleWeatherData getWeather(String cityName, String date)
        throws slice.BussinessServiceException;

    WeatherData getWeatherApiData(String cityName)
        throws slice.BussinessServiceException;

    /**
     * 股票数据获取
     * type = 查询类型枚举
     * name = 股票名或代码
     **/
    SharesData[] getSharesList(SharesType type, String name)
        throws slice.BussinessServiceException;

    /**
     * 路况数据获取
     * cityName = 城市名
     * startPlace = 起始地点
     * destination = 目的地
     **/
    DistanceData getDistanceInfo(String cityName, String startPlace, String destination)
        throws slice.BussinessServiceException;
}
