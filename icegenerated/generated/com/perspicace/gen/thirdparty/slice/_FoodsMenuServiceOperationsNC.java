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

public interface _FoodsMenuServiceOperationsNC
{
    /**
     * 外卖菜单
     **/
    FoodsMenuEntity[] getFoodsMenuByLabelName(String labelName, String name)
        throws slice.BussinessServiceException;
}
