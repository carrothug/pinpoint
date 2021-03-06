/*
 * Copyright 2015 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.navercorp.pinpoint.plugin.thrift.interceptor.server.nonblocking;

import java.net.Socket;

import com.navercorp.pinpoint.bootstrap.FieldAccessor;
import com.navercorp.pinpoint.bootstrap.MetadataAccessor;
import com.navercorp.pinpoint.bootstrap.logging.PLogger;
import com.navercorp.pinpoint.bootstrap.logging.PLoggerFactory;
import com.navercorp.pinpoint.bootstrap.plugin.annotation.Name;

/**
 * This interceptor retrieves the socket information from the TTransport field, and attaches it into the frame wrapping the TTransport.
 * <p>
 * Similar to {@link com.navercorp.pinpoint.plugin.thrift.interceptor.server.nonblocking.FrameBufferConstructInterceptor FrameBufferConstructInterceptor},
 * but hooks onto the <tt>getInputTransport()</tt> method for injection.
 * <p>
 * Based on Thrift 0.8.0, 0.9.0 
 * 
 * @author HyunGil Jeong
 * 
 * @see com.navercorp.pinpoint.plugin.thrift.interceptor.server.nonblocking.FrameBufferConstructInterceptor FrameBufferConstructInterceptor
 */
public class FrameBufferGetInputTransportInterceptor extends FrameBufferTransportInjectInterceptor {

    private final PLogger logger = PLoggerFactory.getLogger(this.getClass());
    private final boolean isDebug = logger.isDebugEnabled();
    
    public FrameBufferGetInputTransportInterceptor(
            @Name(METADATA_SOCKET) MetadataAccessor socketAccessor,
            @Name(FIELD_FRAME_BUFFER_IN_TRANSPORT) FieldAccessor transFieldAccessor) {
        super(socketAccessor, transFieldAccessor);
    }

    @Override
    public void before(Object target, Object[] args) {
        // Do nothing
    }

    @Override
    public void after(Object target, Object[] args, Object result, Throwable throwable) {
        if (isDebug) {
            logger.afterInterceptor(target, args, result, throwable);
        }
        Socket rootSocket = getRootSocket(target);
        if (rootSocket != null) {
            injectSocket(result, rootSocket);
        }
    }

}
