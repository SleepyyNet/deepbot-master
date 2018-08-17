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
public interface ControlRadioServicePrx extends Ice.ObjectPrx
{
    public String operationRadio(String text, String intent, java.util.Map<java.lang.String, java.lang.String> entityMap, String suggest, String smartDeviceId, String groupId)
        throws slice.NotFoundException;

    public String operationRadio(String text, String intent, java.util.Map<java.lang.String, java.lang.String> entityMap, String suggest, String smartDeviceId, String groupId, java.util.Map<String, String> __ctx)
        throws slice.NotFoundException;

    public Ice.AsyncResult begin_operationRadio(String text, String intent, java.util.Map<java.lang.String, java.lang.String> entityMap, String suggest, String smartDeviceId, String groupId);

    public Ice.AsyncResult begin_operationRadio(String text, String intent, java.util.Map<java.lang.String, java.lang.String> entityMap, String suggest, String smartDeviceId, String groupId, java.util.Map<String, String> __ctx);

    public Ice.AsyncResult begin_operationRadio(String text, String intent, java.util.Map<java.lang.String, java.lang.String> entityMap, String suggest, String smartDeviceId, String groupId, Ice.Callback __cb);

    public Ice.AsyncResult begin_operationRadio(String text, String intent, java.util.Map<java.lang.String, java.lang.String> entityMap, String suggest, String smartDeviceId, String groupId, java.util.Map<String, String> __ctx, Ice.Callback __cb);

    public Ice.AsyncResult begin_operationRadio(String text, String intent, java.util.Map<java.lang.String, java.lang.String> entityMap, String suggest, String smartDeviceId, String groupId, Callback_ControlRadioService_operationRadio __cb);

    public Ice.AsyncResult begin_operationRadio(String text, String intent, java.util.Map<java.lang.String, java.lang.String> entityMap, String suggest, String smartDeviceId, String groupId, java.util.Map<String, String> __ctx, Callback_ControlRadioService_operationRadio __cb);

    public Ice.AsyncResult begin_operationRadio(String text, 
                                                String intent, 
                                                java.util.Map<java.lang.String, java.lang.String> entityMap, 
                                                String suggest, 
                                                String smartDeviceId, 
                                                String groupId, 
                                                IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.UserException> __userExceptionCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_operationRadio(String text, 
                                                String intent, 
                                                java.util.Map<java.lang.String, java.lang.String> entityMap, 
                                                String suggest, 
                                                String smartDeviceId, 
                                                String groupId, 
                                                IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.UserException> __userExceptionCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                IceInternal.Functional_BoolCallback __sentCb);

    public Ice.AsyncResult begin_operationRadio(String text, 
                                                String intent, 
                                                java.util.Map<java.lang.String, java.lang.String> entityMap, 
                                                String suggest, 
                                                String smartDeviceId, 
                                                String groupId, 
                                                java.util.Map<String, String> __ctx, 
                                                IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.UserException> __userExceptionCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb);

    public Ice.AsyncResult begin_operationRadio(String text, 
                                                String intent, 
                                                java.util.Map<java.lang.String, java.lang.String> entityMap, 
                                                String suggest, 
                                                String smartDeviceId, 
                                                String groupId, 
                                                java.util.Map<String, String> __ctx, 
                                                IceInternal.Functional_GenericCallback1<String> __responseCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.UserException> __userExceptionCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                IceInternal.Functional_BoolCallback __sentCb);

    public String end_operationRadio(Ice.AsyncResult __result)
        throws slice.NotFoundException;
}
