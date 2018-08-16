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
 * Provides type-specific helper functions.
 **/
public final class ShopServicePrxHelper extends Ice.ObjectPrxHelperBase implements ShopServicePrx
{
    private static final String __getProductList_name = "getProductList";

    public ShopProductEntity[] getProductList(String system, String type, String name)
        throws slice.BussinessServiceException
    {
        return getProductList(system, type, name, null, false);
    }

    public ShopProductEntity[] getProductList(String system, String type, String name, java.util.Map<String, String> __ctx)
        throws slice.BussinessServiceException
    {
        return getProductList(system, type, name, __ctx, true);
    }

    private ShopProductEntity[] getProductList(String system, String type, String name, java.util.Map<String, String> __ctx, boolean __explicitCtx)
        throws slice.BussinessServiceException
    {
        __checkTwowayOnly(__getProductList_name);
        return end_getProductList(begin_getProductList(system, type, name, __ctx, __explicitCtx, true, null));
    }

    public Ice.AsyncResult begin_getProductList(String system, String type, String name)
    {
        return begin_getProductList(system, type, name, null, false, false, null);
    }

    public Ice.AsyncResult begin_getProductList(String system, String type, String name, java.util.Map<String, String> __ctx)
    {
        return begin_getProductList(system, type, name, __ctx, true, false, null);
    }

    public Ice.AsyncResult begin_getProductList(String system, String type, String name, Ice.Callback __cb)
    {
        return begin_getProductList(system, type, name, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_getProductList(String system, String type, String name, java.util.Map<String, String> __ctx, Ice.Callback __cb)
    {
        return begin_getProductList(system, type, name, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_getProductList(String system, String type, String name, Callback_ShopService_getProductList __cb)
    {
        return begin_getProductList(system, type, name, null, false, false, __cb);
    }

    public Ice.AsyncResult begin_getProductList(String system, String type, String name, java.util.Map<String, String> __ctx, Callback_ShopService_getProductList __cb)
    {
        return begin_getProductList(system, type, name, __ctx, true, false, __cb);
    }

    public Ice.AsyncResult begin_getProductList(String system, 
                                                String type, 
                                                String name, 
                                                IceInternal.Functional_GenericCallback1<ShopProductEntity[]> __responseCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.UserException> __userExceptionCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_getProductList(system, type, name, null, false, false, __responseCb, __userExceptionCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_getProductList(String system, 
                                                String type, 
                                                String name, 
                                                IceInternal.Functional_GenericCallback1<ShopProductEntity[]> __responseCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.UserException> __userExceptionCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getProductList(system, type, name, null, false, false, __responseCb, __userExceptionCb, __exceptionCb, __sentCb);
    }

    public Ice.AsyncResult begin_getProductList(String system, 
                                                String type, 
                                                String name, 
                                                java.util.Map<String, String> __ctx, 
                                                IceInternal.Functional_GenericCallback1<ShopProductEntity[]> __responseCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.UserException> __userExceptionCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb)
    {
        return begin_getProductList(system, type, name, __ctx, true, false, __responseCb, __userExceptionCb, __exceptionCb, null);
    }

    public Ice.AsyncResult begin_getProductList(String system, 
                                                String type, 
                                                String name, 
                                                java.util.Map<String, String> __ctx, 
                                                IceInternal.Functional_GenericCallback1<ShopProductEntity[]> __responseCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.UserException> __userExceptionCb, 
                                                IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getProductList(system, type, name, __ctx, true, false, __responseCb, __userExceptionCb, __exceptionCb, __sentCb);
    }

    private Ice.AsyncResult begin_getProductList(String system, 
                                                 String type, 
                                                 String name, 
                                                 java.util.Map<String, String> __ctx, 
                                                 boolean __explicitCtx, 
                                                 boolean __synchronous, 
                                                 IceInternal.Functional_GenericCallback1<ShopProductEntity[]> __responseCb, 
                                                 IceInternal.Functional_GenericCallback1<Ice.UserException> __userExceptionCb, 
                                                 IceInternal.Functional_GenericCallback1<Ice.Exception> __exceptionCb, 
                                                 IceInternal.Functional_BoolCallback __sentCb)
    {
        return begin_getProductList(system, type, name, __ctx, __explicitCtx, __synchronous, 
                                    new IceInternal.Functional_TwowayCallbackArg1UE<com.perspicace.gen.thirdparty.slice.ShopProductEntity[]>(__responseCb, __userExceptionCb, __exceptionCb, __sentCb)
                                        {
                                            public final void __completed(Ice.AsyncResult __result)
                                            {
                                                ShopServicePrxHelper.__getProductList_completed(this, __result);
                                            }
                                        });
    }

    private Ice.AsyncResult begin_getProductList(String system, 
                                                 String type, 
                                                 String name, 
                                                 java.util.Map<String, String> __ctx, 
                                                 boolean __explicitCtx, 
                                                 boolean __synchronous, 
                                                 IceInternal.CallbackBase __cb)
    {
        __checkAsyncTwowayOnly(__getProductList_name);
        IceInternal.OutgoingAsync __result = getOutgoingAsync(__getProductList_name, __cb);
        try
        {
            __result.prepare(__getProductList_name, Ice.OperationMode.Normal, __ctx, __explicitCtx, __synchronous);
            IceInternal.BasicStream __os = __result.startWriteParams(Ice.FormatType.DefaultFormat);
            __os.writeString(system);
            __os.writeString(type);
            __os.writeString(name);
            __result.endWriteParams();
            __result.invoke();
        }
        catch(Ice.Exception __ex)
        {
            __result.abort(__ex);
        }
        return __result;
    }

    public ShopProductEntity[] end_getProductList(Ice.AsyncResult __iresult)
        throws slice.BussinessServiceException
    {
        IceInternal.OutgoingAsync __result = IceInternal.OutgoingAsync.check(__iresult, this, __getProductList_name);
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
            ShopProductEntity[] __ret;
            __ret = shopProductEntitySequenceHelper.read(__is);
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

    static public void __getProductList_completed(Ice.TwowayCallbackArg1UE<ShopProductEntity[]> __cb, Ice.AsyncResult __result)
    {
        com.perspicace.gen.thirdparty.slice.ShopServicePrx __proxy = (com.perspicace.gen.thirdparty.slice.ShopServicePrx)__result.getProxy();
        ShopProductEntity[] __ret = null;
        try
        {
            __ret = __proxy.end_getProductList(__result);
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
    public static ShopServicePrx checkedCast(Ice.ObjectPrx __obj)
    {
        return checkedCastImpl(__obj, ice_staticId(), ShopServicePrx.class, ShopServicePrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static ShopServicePrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __ctx, ice_staticId(), ShopServicePrx.class, ShopServicePrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static ShopServicePrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return checkedCastImpl(__obj, __facet, ice_staticId(), ShopServicePrx.class, ShopServicePrxHelper.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @param __ctx The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    public static ShopServicePrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        return checkedCastImpl(__obj, __facet, __ctx, ice_staticId(), ShopServicePrx.class, ShopServicePrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @return A proxy for this type.
     **/
    public static ShopServicePrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        return uncheckedCastImpl(__obj, ShopServicePrx.class, ShopServicePrxHelper.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param __obj The untyped proxy.
     * @param __facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    public static ShopServicePrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        return uncheckedCastImpl(__obj, __facet, ShopServicePrx.class, ShopServicePrxHelper.class);
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::slice::ShopService"
    };

    /**
     * Provides the Slice type ID of this type.
     * @return The Slice type ID.
     **/
    public static String ice_staticId()
    {
        return __ids[1];
    }

    public static void __write(IceInternal.BasicStream __os, ShopServicePrx v)
    {
        __os.writeProxy(v);
    }

    public static ShopServicePrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            ShopServicePrxHelper result = new ShopServicePrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
