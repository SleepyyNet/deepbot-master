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
// Generated from file `Exception.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package slice;

public class BussinessServiceException extends GenericError
{
    public BussinessServiceException()
    {
        super();
    }

    public BussinessServiceException(Throwable __cause)
    {
        super(__cause);
    }

    public BussinessServiceException(String code, String msg)
    {
        super(code, msg);
    }

    public BussinessServiceException(String code, String msg, Throwable __cause)
    {
        super(code, msg, __cause);
    }

    public String
    ice_name()
    {
        return "slice::BussinessServiceException";
    }

    protected void
    __writeImpl(IceInternal.BasicStream __os)
    {
        __os.startWriteSlice("::slice::BussinessServiceException", -1, false);
        __os.endWriteSlice();
        super.__writeImpl(__os);
    }

    protected void
    __readImpl(IceInternal.BasicStream __is)
    {
        __is.startReadSlice();
        __is.endReadSlice();
        super.__readImpl(__is);
    }

    public static final long serialVersionUID = 698258920L;
}