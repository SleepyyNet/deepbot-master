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
// Generated from file `ai_radio.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.perspicace.gen.radio.slice;

/**
 * 控制电台服务
 **/
public interface _ControlRadioServiceOperationsNC
{
    String operationRadio(String text, String intent, java.util.Map<java.lang.String, java.lang.String> entityMap, String suggest, String smartDeviceId, String groupId)
        throws slice.NotFoundException;
}
