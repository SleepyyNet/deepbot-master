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
// Generated from file `Perception.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.perspicace.modules.Perception.PerceptionTxt;

/**
 * 用户端语音控制(询问天气，聊天，控制家电等  Source只有3和4)
 * return 返回ai的回复
 **/

public abstract class Callback_PerceptionService_userClientListion
    extends IceInternal.TwowayCallback implements Ice.TwowayCallbackArg1<String>
{
    public final void __completed(Ice.AsyncResult __result)
    {
        PerceptionServicePrxHelper.__userClientListion_completed(this, __result);
    }
}
