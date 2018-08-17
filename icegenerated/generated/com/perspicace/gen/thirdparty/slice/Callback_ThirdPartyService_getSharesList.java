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
// Generated from file `thirdparty.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.perspicace.gen.thirdparty.slice;

/**
 * 股票数据获取
 * type = 查询类型枚举
 * name = 股票名或代码
 **/

public abstract class Callback_ThirdPartyService_getSharesList
    extends IceInternal.TwowayCallback implements Ice.TwowayCallbackArg1UE<com.perspicace.gen.thirdparty.slice.SharesData[]>
{
    public final void __completed(Ice.AsyncResult __result)
    {
        ThirdPartyServicePrxHelper.__getSharesList_completed(this, __result);
    }
}
