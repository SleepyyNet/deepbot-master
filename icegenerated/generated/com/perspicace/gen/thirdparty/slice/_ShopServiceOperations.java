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

public interface _ShopServiceOperations
{
    /**
     * 商品列表
     * @param __current The Current object for the invocation.
     **/
    ShopProductEntity[] getProductList(String system, String type, String name, Ice.Current __current)
        throws slice.BussinessServiceException;
}
