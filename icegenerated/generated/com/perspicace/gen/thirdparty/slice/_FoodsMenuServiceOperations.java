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

public interface _FoodsMenuServiceOperations
{
    /**
     * 外卖菜单
     * @param __current The Current object for the invocation.
     **/
    FoodsMenuEntity[] getFoodsMenuByLabelName(String labelName, String name, Ice.Current __current)
        throws slice.BussinessServiceException;
}
