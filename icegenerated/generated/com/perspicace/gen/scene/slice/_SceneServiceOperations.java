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
// Generated from file `Scene.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package com.perspicace.gen.scene.slice;

/**
 * 场景服务
 **/
public interface _SceneServiceOperations
{
    /**
     * 运行场景
     * @param __current The Current object for the invocation.
     **/
    boolean runScene(String sceneId, String groupId, Ice.Current __current)
        throws slice.BussinessServiceException;
}