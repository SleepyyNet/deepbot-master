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

/**
 * 路况数据获取
 * cityName = 城市名
 * startPlace = 起始地点
 * destination = 目的地
 **/

public abstract class Callback_ThirdPartyService_getDistanceInfo
    extends IceInternal.TwowayCallback implements Ice.TwowayCallbackArg1UE<com.perspicace.gen.thirdparty.slice.DistanceData>
{
    public final void __completed(Ice.AsyncResult __result)
    {
        ThirdPartyServicePrxHelper.__getDistanceInfo_completed(this, __result);
    }
}
