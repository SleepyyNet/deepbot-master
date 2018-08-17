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

/**
 * Provides type-specific helper functions.
 **/
public final class GoogleMapServicePrxHelper extends Ice.ObjectPrxHelperBase implements GoogleMapServicePrx
{
    private static final String __getGoogleMaps_name = "getGoogleMaps";

    public GoogleMapEntity getGoogleMaps(String origin, String destination)
        throws slice.BussinessServiceException
    {
        return getGoogleMaps(origin, destination, null, false);
    }

    public GoogleMapEntity getGoogleMaps(String origin, String destination, java.util.Map<String, String> __ctx)
        throws slice.BussinessServiceException
    {
        return getGoogleMaps(origin, destination, __ctx, true);
    }

    private GoogleMapEntity getGoogleMaps(String origin, String destination, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws slice.BussinessServiceException
    {
        __checkTwowayOnly(__getGoogleMaps_name);
        return end_getGoogleMaps(begin_getGoogleMaps(origin, destination, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_getGoogleMaps(String origin, String destination)
    {
        return begin_getGoogleMaps(origin, destination, null, false, false, null);
    }

    public Ice.AsyncResult begin_getGoogleMaps(String origin, String destination, java.util.Map<String, String> __ctx)
    {
        return begin_getGoogleMaps(origin, destination, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_getGoogleMaps(String origin, String destination, Ice.Callback __cb)
    {
        return begin_getGoogleMaps(origin, destination, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_getGoogleMaps(String origin, String destination, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_getGoogleMaps(origin, destination, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_getGoogleMaps(String origin, String destination, Callback_GoogleMapService_getGoogleMaps __cb)
    {
        return begin_getGoogleMaps(origin, destination, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_getGoogleMaps(String origin, String destination, java.util.Map<String, String> __ctx, Callback_GoogleMapService_getGoogleMaps __cb)
    {
        return begin_getGoogleMaps(origin, destination, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_getGoogleMaps(String origin, 
                                               String destination, 
                                               IceInternal.Functional_GenericCallback1<GoogleMapEntity> __responseCb, 
                                               IceInternal.Functional_GenericCallback1<Ice.UserException> __userExceptionCb, 
                                               IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_getGoogleMaps(origin, destination, null, false, false, __responseCb, __userExceptionCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_getGoogleMaps(String origin, 
                                               String destination, 
                                               IceInternal.Functional_GenericCallback1<GoogleMapEntity> __responseCb, 
                                               IceInternal.Functional_GenericCallback1<Ice.UserException> __userExceptionCb, 
                                               IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                               IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getGoogleMaps(origin, destination, null, false, false, __responseCb, __userExceptionCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_getGoogleMaps(String origin, 
                                               String destination, 
                                               java.util.Map<String, String> __ctx, 
                                               IceInternal.Functional_GenericCallback1<GoogleMapEntity> __responseCb, 
                                               IceInternal.Functional_GenericCallback1<Ice.UserException> __userExceptionCb, 
                                               IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_getGoogleMaps(origin, destination, __ctx, true, false, __responseCb, __userExceptionCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_getGoogleMaps(String origin, 
                                               String destination, 
                                               java.util.Map<String, String> __ctx, 
                                               IceInternal.Functional_GenericCallback1<GoogleMapEntity> __responseCb, 
                                               IceInternal.Functional_GenericCallback1<Ice.UserException> __userExceptionCb, 
                                               IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                               IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getGoogleMaps(origin, destination, __ctx, true, false, __responseCb, __userExceptionCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_getGoogleMaps(String origin, 
                                                String destination, 
                                                java.util.Map<String, String> __ctx, 
                                                boolean __explicitCtx, 
                                                boolean __synchronous, 
                                                IceInternal.Functional_GenericCallback1<GoogleMapEntity> __responseCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.UserException> __userExceptionCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getGoogleMaps(origin, destination, __ctx, __explicitCtx, __synchronous, 
                                   new IceInternal.Functional_TwowayCallbackArg1UE<com.perspicace.gen.thirdparty.slice.GoogleMapEntity>(__responseCb, __userExceptionCb, __exceptionCb, __sentCb)
                                       {
                                           public final void __completed(Ice.AsyncResult __result)
                                           {
                                               GoogleMapServicePrxHelper.__getGoogleMaps_completed(this, __result);
                                           }
                                       });
    }

    private Ice.AsyncResult begin_getGoogleMaps(String origin, 
                                                String destination, 
                                                java.util.Map<String, String> __ctx, 
                                                boolean __explicitCtx, 
                                                boolean __synchronous, 
                                                IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__getGoogleMaps_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__getGoogleMaps_name, __cb);
        try
        {
            __result.prepare(__getGoogleMaps_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(origin);
            __os.writeString(destination);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public GoogleMapEntity end_getGoogleMaps(Ice.AsyncResult __iresult)
        throws slice.BussinessServiceException
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __getGoogleMaps_name);
        try
        {
            if(!__result.__wait())
            {
                try
                {
                    __result.throwUserException();
                }
                catch(slice.BussinessServiceException __ex)
                {
                    throw __ex;
                }
                catch(Ice.UserException __ex)
                {
                    throw new Ice.UnknownUserException(__ex.ice_name(), __ex);
                }
            }
            IceInternal.BasicStream __is = __result.startReadParams();
            GoogleMapEntity __ret = null;
            __ret = GoogleMapEntity.__read(__is, __ret);
            __result.endReadParams();
            return __ret;
        }
        finally
        {
            if(__result != null)
            {
                __result.cacheMessageBuffers();
            }
        }
    }

    static public void __getGoogleMaps_completed(Ice.TwowayCallbackArg1UE<GoogleMapEntity> __cb, Ice.AsyncResult __result)
    {
        com.perspicace.gen.thirdparty.slice.GoogleMapServicePrx __proxy = (com.perspicace.gen.thirdparty.slice.GoogleMapServicePrx)__result.getProxy();
        GoogleMapEntity __ret = null;
        try
        {
            __ret = __proxy.end_getGoogleMaps(__result);
        }
        catch(Ice.UserException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        catch(Ice.LocalException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        catch(Ice.SystemException __ex)
        {
            __cb.exception(__ex);
            return;
        }
        __cb.response(__ret);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static GoogleMapServicePrx checkedCast(Ice.ObjectPrx __obj)
    {
        return checkedCastImpl(__obj, ice_staticId(), GoogleMapServicePrx.class, GoogleMapServicePrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static GoogleMapServicePrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __ctx, ice_staticId(), GoogleMapServicePrx.class, GoogleMapServicePrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static GoogleMapServicePrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return checkedCastImpl(__obj, __facet, ice_staticId(), GoogleMapServicePrx.class, GoogleMapServicePrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static GoogleMapServicePrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __facet, __ctx, ice_staticId(), GoogleMapServicePrx.class, GoogleMapServicePrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @return A proxy for this type.
     **/
    public static GoogleMapServicePrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        return uncheckedCastImpl(__obj, GoogleMapServicePrx.class, GoogleMapServicePrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    public static GoogleMapServicePrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return uncheckedCastImpl(__obj, __facet, GoogleMapServicePrx.class, GoogleMapServicePrxHelper.class);
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::slice::GoogleMapService"
    };

    /**
     * Provides the Slice type ID of this type.
     * @return The Slice type ID.
     **/
    public static String ice_staticId()
    {
        return __ids[1];
    }

    public static void __write(IceInternal.BasicStream __os, GoogleMapServicePrx v)
    {
        __os.writeProxy(v);
    }

    public static GoogleMapServicePrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            GoogleMapServicePrxHelper result = new GoogleMapServicePrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
