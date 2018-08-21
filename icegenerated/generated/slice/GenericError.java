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

public class GenericError extends Ice.UserException
{
    public GenericError()
    {
        code = "";
        msg = "";
    }

    public GenericError(Throwable __cause)
    {
        super(__cause);
        code = "";
        msg = "";
    }

    public GenericError(String code, String msg)
    {
        this.code = code;
        this.msg = msg;
    }

    public GenericError(String code, String msg, Throwable __cause)
    {
        super(__cause);
        this.code = code;
        this.msg = msg;
    }

    public String
    ice_name()
    {
        return "slice::GenericError";
    }

    public String code;

    public String msg;

    protected void
    __writeImpl(IceInternal.BasicStream __os)
    {
        __os.startWriteSlice("::slice::GenericError", -1, true);
        __os.writeString(code);
        __os.writeString(msg);
        __os.endWriteSlice();
    }

    protected void
    __readImpl(IceInternal.BasicStream __is)
    {
        __is.startReadSlice();
        code = __is.readString();
        msg = __is.readString();
        __is.endReadSlice();
    }

    public static final long serialVersionUID = 5166662L;
}
