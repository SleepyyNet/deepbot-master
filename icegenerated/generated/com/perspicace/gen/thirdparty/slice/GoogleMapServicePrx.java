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

public interface GoogleMapServicePrx extends Ice.ObjectPrx
{
    /**
     * 获取google地图的距离和时间
     **/
    public GoogleMapEntity getGoogleMaps(String origin, String destination)
        throws slice.BussinessServiceException;

    /**
     * 获取google地图的距离和时间
     * @param __ctx The Context map to send with the invocation.
     **/
    public GoogleMapEntity getGoogleMaps(String origin, String destination, java.util.Map<String, String> __ctx)
        throws slice.BussinessServiceException;

    /**
     * 获取google地图的距离和时间
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getGoogleMaps(String origin, String destination);

    /**
     * 获取google地图的距离和时间
     * @param __ctx The Context map to send with the invocation.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getGoogleMaps(String origin, String destination, java.util.Map<String, String> __ctx);

    /**
     * 获取google地图的距离和时间
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getGoogleMaps(String origin, String destination, Ice.Callback __cb);

    /**
     * 获取google地图的距离和时间
     * @param __ctx The Context map to send with the invocation.
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getGoogleMaps(String origin, String destination, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    /**
     * 获取google地图的距离和时间
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getGoogleMaps(String origin, String destination, Callback_GoogleMapService_getGoogleMaps __cb);

    /**
     * 获取google地图的距离和时间
     * @param __ctx The Context map to send with the invocation.
     * @param __cb The asynchronous callback object.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getGoogleMaps(String origin, String destination, java.util.Map<String, String> __ctx, Callback_GoogleMapService_getGoogleMaps __cb);

    /**
     * 获取google地图的距离和时间
     * @param __responseCb The lambda response callback.
     * @param __userExceptionCb The lambda user exception callback.
     * @param __exceptionCb The lambda exception callback.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getGoogleMaps(String origin, 
                                               String destination, 
                                               IceInternal.Functional_GenericCallback1<GoogleMapEntity> __responseCb, 
                                               IceInternal.Functional_GenericCallback1<Ice.UserException> __userExceptionCb, 
                                               IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    /**
     * 获取google地图的距离和时间
     * @param __responseCb The lambda response callback.
     * @param __userExceptionCb The lambda user exception callback.
     * @param __exceptionCb The lambda exception callback.
     * @param __sentCb The lambda sent callback.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getGoogleMaps(String origin, 
                                               String destination, 
                                               IceInternal.Functional_GenericCallback1<GoogleMapEntity> __responseCb, 
                                               IceInternal.Functional_GenericCallback1<Ice.UserException> __userExceptionCb, 
                                               IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                               IceInternal.Functional_BoolCallback __sentCb);

    /**
     * 获取google地图的距离和时间
     * @param __ctx The Context map to send with the invocation.
     * @param __responseCb The lambda response callback.
     * @param __userExceptionCb The lambda user exception callback.
     * @param __exceptionCb The lambda exception callback.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getGoogleMaps(String origin, 
                                               String destination, 
                                               java.util.Map<String, String> __ctx, 
                                               IceInternal.Functional_GenericCallback1<GoogleMapEntity> __responseCb, 
                                               IceInternal.Functional_GenericCallback1<Ice.UserException> __userExceptionCb, 
                                               IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    /**
     * 获取google地图的距离和时间
     * @param __ctx The Context map to send with the invocation.
     * @param __responseCb The lambda response callback.
     * @param __userExceptionCb The lambda user exception callback.
     * @param __exceptionCb The lambda exception callback.
     * @param __sentCb The lambda sent callback.
     * @return The asynchronous result object.
     **/
    public Ice.AsyncResult begin_getGoogleMaps(String origin, 
                                               String destination, 
                                               java.util.Map<String, String> __ctx, 
                                               IceInternal.Functional_GenericCallback1<GoogleMapEntity> __responseCb, 
                                               IceInternal.Functional_GenericCallback1<Ice.UserException> __userExceptionCb, 
                                               IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                               IceInternal.Functional_BoolCallback __sentCb);

    /**
     * 获取google地图的距离和时间
     * @param __result The asynchronous result object.
     **/
    public GoogleMapEntity end_getGoogleMaps(Ice.AsyncResult __result)
        throws slice.BussinessServiceException;
}