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

public abstract class _ElectricApplianceControlServiceDisp extends Ice.ObjectImpl implements ElectricApplianceControlService
{
    protected void
    ice_copyStateFrom(Ice.Object __obj)
        throws java.lang.CloneNotSupportedException
    {
        throw new java.lang.CloneNotSupportedException();
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::slice::ElectricApplianceControlService"
    };

    public boolean ice_isA(String s)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public boolean ice_isA(String s, Ice.Current __current)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public String[] ice_ids()
    {
        return __ids;
    }

    public String[] ice_ids(Ice.Current __current)
    {
        return __ids;
    }

    public String ice_id()
    {
        return __ids[1];
    }

    public String ice_id(Ice.Current __current)
    {
        return __ids[1];
    }

    public static String ice_staticId()
    {
        return __ids[1];
    }

    /**
     * 家电控制
     * @param
     * ElectricApplianceControlParam 家电控制bean
     * @return
     * bool
     **/
    public final ElectricApplianceControlResult[] electricApplianceControl(String groupId, ElectricApplianceControlParam[] electricApplianceControlParamList)
        throws slice.BussinessServiceException
    {
        return electricApplianceControl(groupId, electricApplianceControlParamList, null);
    }

    public static Ice.DispatchStatus ___electricApplianceControl(ElectricApplianceControlService __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        String groupId;
        ElectricApplianceControlParam[] electricApplianceControlParamList;
        groupId = __is.readString();
        electricApplianceControlParamList = ElectricApplianceControlParamListHelper.read(__is);
        __inS.endReadParams();
        try
        {
            ElectricApplianceControlResult[] __ret = __obj.electricApplianceControl(groupId, electricApplianceControlParamList, __current);
            IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
            ElectricApplianceControlResultListHelper.write(__os, __ret);
            __inS.__endWriteParams(true);
            return Ice.DispatchStatus.DispatchOK;
        }
        catch(slice.BussinessServiceException ex)
        {
            __inS.__writeUserException(ex, Ice.FormatType.DefaultFormat);
            return Ice.DispatchStatus.DispatchUserException;
        }
    }

    private final static String[] __all =
    {
        "electricApplianceControl",
        "ice_id",
        "ice_ids",
        "ice_isA",
        "ice_ping"
    };

    public Ice.DispatchStatus __dispatch(IceInternal.Incoming in, Ice.Current __current)
    {
        int pos = java.util.Arrays.binarySearch(__all, __current.operation);
        if(pos < 0)
        {
            throw new Ice.OperationNotExistException(__current.id, __current.facet, __current.operation);
        }

        switch(pos)
        {
            case 0:
            {
                return ___electricApplianceControl(this, in, __current);
            }
            case 1:
            {
                return ___ice_id(this, in, __current);
            }
            case 2:
            {
                return ___ice_ids(this, in, __current);
            }
            case 3:
            {
                return ___ice_isA(this, in, __current);
            }
            case 4:
            {
                return ___ice_ping(this, in, __current);
            }
        }

        assert(false);
        throw new Ice.OperationNotExistException(__current.id, __current.facet, __current.operation);
    }

    protected void __writeImpl(IceInternal.BasicStream __os)
    {
        __os.startWriteSlice(ice_staticId(), -1, true);
        __os.endWriteSlice();
    }

    protected void __readImpl(IceInternal.BasicStream __is)
    {
        __is.startReadSlice();
        __is.endReadSlice();
    }

    public static final long serialVersionUID = 0L;
}
