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

public final class ControllerDeviceServiceHolder extends Ice.ObjectHolderBase<ControllerDeviceService>
{
    public
    ControllerDeviceServiceHolder()
    {
    }

    public
    ControllerDeviceServiceHolder(ControllerDeviceService value)
    {
        this.value = value;
    }

    public void
    patch(Ice.Object v)
    {
        if(v == null || v instanceof ControllerDeviceService)
        {
            value = (ControllerDeviceService)v;
        }
        else
        {
            IceInternal.Ex.throwUOE(type(), v);
        }
    }

    public String
    type()
    {
        return _ControllerDeviceServiceDisp.ice_staticId();
    }
}
