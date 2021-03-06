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

public enum ElectricApplianceFanSpeedEo implements java.io.Serializable
{
    
    low(1),
    
    middle(2),
    
    high(3);

    public int
    value()
    {
        return __value;
    }

    public static ElectricApplianceFanSpeedEo
    valueOf(int __v)
    {
        switch(__v)
        {
        case 1:
            return low;
        case 2:
            return middle;
        case 3:
            return high;
        }
        return null;
    }

    private
    ElectricApplianceFanSpeedEo(int __v)
    {
        __value = __v;
    }

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeEnum(value(), 3);
    }

    public static void
    __write(IceInternal.BasicStream __os, ElectricApplianceFanSpeedEo __v)
    {
        if(__v == null)
        {
            __os.writeEnum(com.perspicace.gen.electricappliance.slice.ElectricApplianceFanSpeedEo.low.value(), 3);
        }
        else
        {
            __os.writeEnum(__v.value(), 3);
        }
    }

    public static ElectricApplianceFanSpeedEo
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readEnum(3);
        return __validate(__v);
    }

    private static ElectricApplianceFanSpeedEo
    __validate(int __v)
    {
        final ElectricApplianceFanSpeedEo __e = valueOf(__v);
        if(__e == null)
        {
            throw new Ice.MarshalException("enumerator value " + __v + " is out of range");
        }
        return __e;
    }

    private final int __value;
}
