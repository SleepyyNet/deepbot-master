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
// Generated from file `electricAppliance.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.perspicace.gen.electricappliance.slice;

public final class ElectricApplianceGenJsonServiceHolder extends Ice.ObjectHolderBase<ElectricApplianceGenJsonService>
{
    public
    ElectricApplianceGenJsonServiceHolder()
    {
    }

    public
    ElectricApplianceGenJsonServiceHolder(ElectricApplianceGenJsonService value)
    {
        this.value = value;
    }

    public void
    patch(Ice.Object v)
    {
        if(v == null || v instanceof ElectricApplianceGenJsonService)
        {
            value = (ElectricApplianceGenJsonService)v;
        }
        else
        {
            IceInternal.Ex.throwUOE(type(), v);
        }
    }

    public String
    type()
    {
        return _ElectricApplianceGenJsonServiceDisp.ice_staticId();
    }
}