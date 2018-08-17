// **********************************************************************
//
// Copyright (c) 2003-2017 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.4
//
// <auto-generated>
//
// Generated from file `ai_controldevice.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.perspicace.gen.controldevice.slice;

/**
 * 场景服务
 **/
public interface _ControlDeviceServiceOperations
{
    String controlDevice(String text, String intent, java.util.Map<java.lang.String, java.lang.String> entityMap, String suggest, String smartDeviceId, String groupId, Ice.Current __current)
        throws slice.NoAreaException;

    String runScene(String text, String groupId, String sceneMode, String sn, String deviceid, Ice.Current __current);
}
