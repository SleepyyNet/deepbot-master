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
 * 菜谱
 **/

public abstract class Callback_CookBookService_getCookBook
    extends IceInternal.TwowayCallback implements Ice.TwowayCallbackArg1UE<com.perspicace.gen.thirdparty.slice.CookMateriaEntity>
{
    public final void __completed(Ice.AsyncResult __result)
    {
        CookBookServicePrxHelper.__getCookBook_completed(this, __result);
    }
}
