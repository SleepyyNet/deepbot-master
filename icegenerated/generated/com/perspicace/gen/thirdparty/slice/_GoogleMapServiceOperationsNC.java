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

public interface _GoogleMapServiceOperationsNC
{
    /**
     * 获取google地图的距离和时间
     **/
    GoogleMapEntity getGoogleMaps(String origin, String destination)
        throws slice.BussinessServiceException;
}