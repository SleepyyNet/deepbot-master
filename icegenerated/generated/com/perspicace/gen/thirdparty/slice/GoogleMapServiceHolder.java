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

public final class GoogleMapServiceHolder extends Ice.ObjectHolderBase<GoogleMapService>
{
    public
    GoogleMapServiceHolder()
    {
    }

    public
    GoogleMapServiceHolder(GoogleMapService value)
    {
        this.value = value;
    }

    public void
    patch(Ice.Object v)
    {
        if(v == null || v instanceof GoogleMapService)
        {
            value = (GoogleMapService)v;
        }
        else
        {
            IceInternal.Ex.throwUOE(type(), v);
        }
    }

    public String
    type()
    {
        return _GoogleMapServiceDisp.ice_staticId();
    }
}
