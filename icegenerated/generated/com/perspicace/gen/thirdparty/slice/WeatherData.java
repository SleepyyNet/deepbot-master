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

/**
 * 天气数据
 **/
public class WeatherData implements java.lang.Cloneable, java.io.Serializable
{
    public String jiangshui;

    public String sunBeginEnd;

    public String dayWeatherCode;

    public String dayWeatherName;

    public String time;

    public String dayAirTemperature;

    public String nightAirTemperature;

    public HourWeatherData[] hourWeathers;

    public DayWeatherData[] dayWeathers;

    public NowWeatherData nowWeatherData;

    public WeatherData()
    {
        jiangshui = "";
        sunBeginEnd = "";
        dayWeatherCode = "";
        dayWeatherName = "";
        time = "";
        dayAirTemperature = "";
        nightAirTemperature = "";
        nowWeatherData = new NowWeatherData();
    }

    public WeatherData(String jiangshui, String sunBeginEnd, String dayWeatherCode, String dayWeatherName, String time, String dayAirTemperature, String nightAirTemperature, HourWeatherData[] hourWeathers, DayWeatherData[] dayWeathers, NowWeatherData nowWeatherData)
    {
        this.jiangshui = jiangshui;
        this.sunBeginEnd = sunBeginEnd;
        this.dayWeatherCode = dayWeatherCode;
        this.dayWeatherName = dayWeatherName;
        this.time = time;
        this.dayAirTemperature = dayAirTemperature;
        this.nightAirTemperature = nightAirTemperature;
        this.hourWeathers = hourWeathers;
        this.dayWeathers = dayWeathers;
        this.nowWeatherData = nowWeatherData;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        WeatherData _r = null;
        if(rhs instanceof WeatherData)
        {
            _r = (WeatherData)rhs;
        }

        if(_r != null)
        {
            if(jiangshui != _r.jiangshui)
            {
                if(jiangshui == null || _r.jiangshui == null || !jiangshui.equals(_r.jiangshui))
                {
                    return false;
                }
            }
            if(sunBeginEnd != _r.sunBeginEnd)
            {
                if(sunBeginEnd == null || _r.sunBeginEnd == null || !sunBeginEnd.equals(_r.sunBeginEnd))
                {
                    return false;
                }
            }
            if(dayWeatherCode != _r.dayWeatherCode)
            {
                if(dayWeatherCode == null || _r.dayWeatherCode == null || !dayWeatherCode.equals(_r.dayWeatherCode))
                {
                    return false;
                }
            }
            if(dayWeatherName != _r.dayWeatherName)
            {
                if(dayWeatherName == null || _r.dayWeatherName == null || !dayWeatherName.equals(_r.dayWeatherName))
                {
                    return false;
                }
            }
            if(time != _r.time)
            {
                if(time == null || _r.time == null || !time.equals(_r.time))
                {
                    return false;
                }
            }
            if(dayAirTemperature != _r.dayAirTemperature)
            {
                if(dayAirTemperature == null || _r.dayAirTemperature == null || !dayAirTemperature.equals(_r.dayAirTemperature))
                {
                    return false;
                }
            }
            if(nightAirTemperature != _r.nightAirTemperature)
            {
                if(nightAirTemperature == null || _r.nightAirTemperature == null || !nightAirTemperature.equals(_r.nightAirTemperature))
                {
                    return false;
                }
            }
            if(!java.util.Arrays.equals(hourWeathers, _r.hourWeathers))
            {
                return false;
            }
            if(!java.util.Arrays.equals(dayWeathers, _r.dayWeathers))
            {
                return false;
            }
            if(nowWeatherData != _r.nowWeatherData)
            {
                if(nowWeatherData == null || _r.nowWeatherData == null || !nowWeatherData.equals(_r.nowWeatherData))
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
        __h = IceInternal.HashUtil.hashAdd(__h, "::slice::WeatherData");
        __h = IceInternal.HashUtil.hashAdd(__h, jiangshui);
        __h = IceInternal.HashUtil.hashAdd(__h, sunBeginEnd);
        __h = IceInternal.HashUtil.hashAdd(__h, dayWeatherCode);
        __h = IceInternal.HashUtil.hashAdd(__h, dayWeatherName);
        __h = IceInternal.HashUtil.hashAdd(__h, time);
        __h = IceInternal.HashUtil.hashAdd(__h, dayAirTemperature);
        __h = IceInternal.HashUtil.hashAdd(__h, nightAirTemperature);
        __h = IceInternal.HashUtil.hashAdd(__h, hourWeathers);
        __h = IceInternal.HashUtil.hashAdd(__h, dayWeathers);
        __h = IceInternal.HashUtil.hashAdd(__h, nowWeatherData);
        return __h;
    }

    public WeatherData
    clone()
    {
        WeatherData c = null;
        try
        {
            c = (WeatherData)super.clone();
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
        __os.writeString(jiangshui);
        __os.writeString(sunBeginEnd);
        __os.writeString(dayWeatherCode);
        __os.writeString(dayWeatherName);
        __os.writeString(time);
        __os.writeString(dayAirTemperature);
        __os.writeString(nightAirTemperature);
        hourWeatherSequenceHelper.write(__os, hourWeathers);
        dayWeatherSequenceHelper.write(__os, dayWeathers);
        NowWeatherData.__write(__os, nowWeatherData);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        jiangshui = __is.readString();
        sunBeginEnd = __is.readString();
        dayWeatherCode = __is.readString();
        dayWeatherName = __is.readString();
        time = __is.readString();
        dayAirTemperature = __is.readString();
        nightAirTemperature = __is.readString();
        hourWeathers = hourWeatherSequenceHelper.read(__is);
        dayWeathers = dayWeatherSequenceHelper.read(__is);
        nowWeatherData = NowWeatherData.__read(__is, nowWeatherData);
    }

    static public void
    __write(IceInternal.BasicStream __os, WeatherData __v)
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

    static public WeatherData
    __read(IceInternal.BasicStream __is, WeatherData __v)
    {
        if(__v == null)
        {
             __v = new WeatherData();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final WeatherData __nullMarshalValue = new WeatherData();

    public static final long serialVersionUID = 618926754L;
}
