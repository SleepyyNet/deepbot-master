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
// Generated from file `ai_radio_exception.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package slice;

public class NotFoundException extends Ice.UserException
{
    public NotFoundException()
    {
        message = "";
    }

    public NotFoundException(Throwable __cause)
    {
        super(__cause);
        message = "";
    }

    public NotFoundException(String message)
    {
        this.message = message;
    }

    public NotFoundException(String message, Throwable __cause)
    {
        super(__cause);
        this.message = message;
    }

    public String
    ice_name()
    {
        return "slice::NotFoundException";
    }

    public String message;

    protected void
    __writeImpl(IceInternal.BasicStream __os)
    {
        __os.startWriteSlice("::slice::NotFoundException", -1, true);
        __os.writeString(message);
        __os.endWriteSlice();
    }

    protected void
    __readImpl(IceInternal.BasicStream __is)
    {
        __is.startReadSlice();
        message = __is.readString();
        __is.endReadSlice();
    }

    public static final long serialVersionUID = -176089117L;
}