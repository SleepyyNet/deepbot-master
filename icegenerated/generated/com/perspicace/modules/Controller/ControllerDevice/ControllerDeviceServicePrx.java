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
// Generated from file `controller.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.perspicace.modules.Controller.ControllerDevice;

/**
 * 控制设备
 **/
public interface ControllerDeviceServicePrx extends Ice.ObjectPrx
{
    public ControllerResultObj ControllerDevice(ControllerObj controllerObj);

    public ControllerResultObj ControllerDevice(ControllerObj controllerObj, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_ControllerDevice(ControllerObj controllerObj);

    public Ice.AsyncResult begin_ControllerDevice(ControllerObj controllerObj, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_ControllerDevice(ControllerObj controllerObj, Ice.Callback __cb);

    public Ice.AsyncResult begin_ControllerDevice(ControllerObj controllerObj, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_ControllerDevice(ControllerObj controllerObj, Callback_ControllerDeviceService_ControllerDevice __cb);

    public Ice.AsyncResult begin_ControllerDevice(ControllerObj controllerObj, java.util.Map<String, String> __ctx, Callback_ControllerDeviceService_ControllerDevice __cb);

    public Ice.AsyncResult begin_ControllerDevice(ControllerObj controllerObj, 
                                                  IceInternal.Functional_GenericCallback1<ControllerResultObj> __responseCb, 
                                                  IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_ControllerDevice(ControllerObj controllerObj, 
                                                  IceInternal.Functional_GenericCallback1<ControllerResultObj> __responseCb, 
                                                  IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                  IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_ControllerDevice(ControllerObj controllerObj, 
                                                  java.util.Map<String, String> __ctx, 
                                                  IceInternal.Functional_GenericCallback1<ControllerResultObj> __responseCb, 
                                                  IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_ControllerDevice(ControllerObj controllerObj, 
                                                  java.util.Map<String, String> __ctx, 
                                                  IceInternal.Functional_GenericCallback1<ControllerResultObj> __responseCb, 
                                                  IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                  IceInternal.Functional_BoolCallback __sentCb);

    public ControllerResultObj end_ControllerDevice(Ice.AsyncResult __result);
}
