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

public abstract class Callback_ThirdPartyService_getWeatherApiData
    extends IceInternal.TwowayCallback implements Ice.TwowayCallbackArg1UE<com.perspicace.gen.thirdparty.slice.WeatherData>
{
    public final void __completed(Ice.AsyncResult __result)
    {
        ThirdPartyServicePrxHelper.__getWeatherApiData_completed(this, __result);
    }
}
