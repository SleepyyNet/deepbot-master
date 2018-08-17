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

public class WeatherIndexData implements java.lang.Cloneable, java.io.Serializable
{
    public WeatherIndexinfo uv;

    public WeatherIndexinfo aqi;

    public WeatherIndexinfo comfort;

    public WeatherIndexinfo clothes;

    public WeatherIndexData()
    {
        uv = new WeatherIndexinfo();
        aqi = new WeatherIndexinfo();
        comfort = new WeatherIndexinfo();
        clothes = new WeatherIndexinfo();
    }

    public WeatherIndexData(WeatherIndexinfo uv, WeatherIndexinfo aqi, WeatherIndexinfo comfort, WeatherIndexinfo clothes)
    {
        this.uv = uv;
        this.aqi = aqi;
        this.comfort = comfort;
        this.clothes = clothes;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        WeatherIndexData _r = null;
        if(rhs instanceof WeatherIndexData)
        {
            _r = (WeatherIndexData)rhs;
        }

        if(_r != null)
        {
            if(uv != _r.uv)
            {
                if(uv == null || _r.uv == null || !uv.equals(_r.uv))
                {
                    return false;
                }
            }
            if(aqi != _r.aqi)
            {
                if(aqi == null || _r.aqi == null || !aqi.equals(_r.aqi))
                {
                    return false;
                }
            }
            if(comfort != _r.comfort)
            {
                if(comfort == null || _r.comfort == null || !comfort.equals(_r.comfort))
                {
                    return false;
                }
            }
            if(clothes != _r.clothes)
            {
                if(clothes == null || _r.clothes == null || !clothes.equals(_r.clothes))
                {
                    return false;
                }
            }

            return true;
        }

        return false;
    }

    public int
    hashCode()
    {
        int __h = 5381;
        __h = IceInternal.HashUtil.hashAdd(__h, "::slice::WeatherIndexData");
        __h = IceInternal.HashUtil.hashAdd(__h, uv);
        __h = IceInternal.HashUtil.hashAdd(__h, aqi);
        __h = IceInternal.HashUtil.hashAdd(__h, comfort);
        __h = IceInternal.HashUtil.hashAdd(__h, clothes);
        return __h;
    }

    public WeatherIndexData
    clone()
    {
        WeatherIndexData c = null;
        try
        {
            c = (WeatherIndexData)super.clone();
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
        WeatherIndexinfo.__write(__os, uv);
        WeatherIndexinfo.__write(__os, aqi);
        WeatherIndexinfo.__write(__os, comfort);
        WeatherIndexinfo.__write(__os, clothes);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        uv = WeatherIndexinfo.__read(__is, uv);
        aqi = WeatherIndexinfo.__read(__is, aqi);
        comfort = WeatherIndexinfo.__read(__is, comfort);
        clothes = WeatherIndexinfo.__read(__is, clothes);
    }

    static public void
    __write(IceInternal.BasicStream __os, WeatherIndexData __v)
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

    static public WeatherIndexData
    __read(IceInternal.BasicStream __is, WeatherIndexData __v)
    {
        if(__v == null)
        {
             __v = new WeatherIndexData();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final WeatherIndexData __nullMarshalValue = new WeatherIndexData();

    public static final long serialVersionUID = 1694779899608391347L;
}
