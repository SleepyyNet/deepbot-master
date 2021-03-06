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

public class ElectricApplianceControlResult implements java.lang.Cloneable, java.io.Serializable
{
    public String ElectricApplianceId;

    public boolean result;

    public ElectricApplianceControlResult()
    {
        ElectricApplianceId = "";
    }

    public ElectricApplianceControlResult(String ElectricApplianceId, boolean result)
    {
        this.ElectricApplianceId = ElectricApplianceId;
        this.result = result;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        ElectricApplianceControlResult _r = null;
        if(rhs instanceof ElectricApplianceControlResult)
        {
            _r = (ElectricApplianceControlResult)rhs;
        }

        if(_r != null)
        {
            if(ElectricApplianceId != _r.ElectricApplianceId)
            {
                if(ElectricApplianceId == null || _r.ElectricApplianceId == null || !ElectricApplianceId.equals(_r.ElectricApplianceId))
                {
                    return false;
                }
            }
            if(result != _r.result)
            {
                return false;
            }

            return true;
        }

        return false;
    }

    public int
    hashCode()
    {
        int __h = 5381;
        __h = IceInternal.HashUtil.hashAdd(__h, "::slice::ElectricApplianceControlResult");
        __h = IceInternal.HashUtil.hashAdd(__h, ElectricApplianceId);
        __h = IceInternal.HashUtil.hashAdd(__h, result);
        return __h;
    }

    public ElectricApplianceControlResult
    clone()
    {
        ElectricApplianceControlResult c = null;
        try
        {
            c = (ElectricApplianceControlResult)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeString(ElectricApplianceId);
        __os.writeBool(result);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        ElectricApplianceId = __is.readString();
        result = __is.readBool();
    }

    static public void
    __write(IceInternal.BasicStream __os, ElectricApplianceControlResult __v)
    {
        if(__v == null)
        {
            __nullMarshalValue.__write(__os);
        }
        else
        {
            __v.__write(__os);
        }
    }

    static public ElectricApplianceControlResult
    __read(IceInternal.BasicStream __is, ElectricApplianceControlResult __v)
    {
        if(__v == null)
        {
             __v = new ElectricApplianceControlResult();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final ElectricApplianceControlResult __nullMarshalValue = new ElectricApplianceControlResult();

    public static final long serialVersionUID = -163517743L;
}
