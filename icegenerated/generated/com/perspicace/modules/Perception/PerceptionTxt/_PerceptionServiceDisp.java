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
// Generated from file `Perception.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.perspicace.modules.Perception.PerceptionTxt;

/**
 * 感知
 **/
public abstract class _PerceptionServiceDisp extends Ice.ObjectImpl implements PerceptionService
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
        "::PerceptionTxt::PerceptionService"
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

    public final void listion(ListionObj listionObj)
    {
        listion(listionObj, null);
    }

    /**
     * 用户端语音控制(询问天气，聊天，控制家电等  Source只有3和4)
     * return 返回ai的回复
     **/
    public final String userClientListion(String text, String userId, String groupId, Source src)
    {
        return userClientListion(text, userId, groupId, src, null);
    }

    public static Ice.DispatchStatus ___listion(PerceptionService __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        ListionObj listionObj = null;
        listionObj = ListionObj.__read(__is, listionObj);
        __inS.endReadParams();
        __obj.listion(listionObj, __current);
        __inS.__writeEmptyParams();
        return Ice.DispatchStatus.DispatchOK;
    }

    public static Ice.DispatchStatus ___userClientListion(PerceptionService __obj, IceInternal.Incoming __inS, Ice.Current __current)
    {
        __checkMode(Ice.OperationMode.Normal, __current.mode);
        IceInternal.BasicStream __is = __inS.startReadParams();
        String text;
        String userId;
        String groupId;
        Source src;
        text = __is.readString();
        userId = __is.readString();
        groupId = __is.readString();
        src = Source.__read(__is);
        __inS.endReadParams();
        String __ret = __obj.userClientListion(text, userId, groupId, src, __current);
        IceInternal.BasicStream __os = __inS.__startWriteParams(Ice.FormatType.DefaultFormat);
        __os.writeString(__ret);
        __inS.__endWriteParams(true);
        return Ice.DispatchStatus.DispatchOK;
    }

    private final static String[] __all =
    {
        "ice_id",
        "ice_ids",
        "ice_isA",
        "ice_ping",
        "listion",
        "userClientListion"
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
                return ___ice_id(this, in, __current);
            }
            case 1:
            {
                return ___ice_ids(this, in, __current);
            }
            case 2:
            {
                return ___ice_isA(this, in, __current);
            }
            case 3:
            {
                return ___ice_ping(this, in, __current);
            }
            case 4:
            {
                return ___listion(this, in, __current);
            }
            case 5:
            {
                return ___userClientListion(this, in, __current);
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
