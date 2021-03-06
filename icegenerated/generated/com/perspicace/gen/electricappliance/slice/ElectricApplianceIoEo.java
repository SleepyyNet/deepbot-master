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

public enum ElectricApplianceIoEo implements java.io.Serializable
{
    
    on(0),
    
    off(1);

    public int
    value()
    {
        return __value;
    }

    public static ElectricApplianceIoEo
    valueOf(int __v)
    {
        switch(__v)
        {
        case 0:
            return on;
        case 1:
            return off;
        }
        return null;
    }

    private
    ElectricApplianceIoEo(int __v)
    {
        __value = __v;
    }

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeEnum(value(), 1);
    }

    public static void
    __write(IceInternal.BasicStream __os, ElectricApplianceIoEo __v)
    {
        if(__v == null)
        {
            __os.writeEnum(com.perspicace.gen.electricappliance.slice.ElectricApplianceIoEo.on.value(), 1);
        }
        else
        {
            __os.writeEnum(__v.value(), 1);
        }
    }

    public static ElectricApplianceIoEo
    __read(IceInternal.BasicStream __is)
    {
        int __v = __is.readEnum(1);
        return __validate(__v);
    }

    private static ElectricApplianceIoEo
    __validate(int __v)
    {
        final ElectricApplianceIoEo __e = valueOf(__v);
        if(__e == null)
        {
            throw new Ice.MarshalException("enumerator value " + __v + " is out of range");
        }
        return __e;
    }

    private final int __value;
}
