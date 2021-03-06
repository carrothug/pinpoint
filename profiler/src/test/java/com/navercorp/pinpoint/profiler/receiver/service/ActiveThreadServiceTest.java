/*
 *
 *  * Copyright 2014 NAVER Corp.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 *
 */

package com.navercorp.pinpoint.profiler.receiver.service;

import com.navercorp.pinpoint.profiler.context.active.ActiveTraceRepository;
import com.navercorp.pinpoint.profiler.context.DefaultTrace;
import com.navercorp.pinpoint.profiler.context.DefaultTraceContext;
import com.navercorp.pinpoint.test.TestAgentInformation;
import com.navercorp.pinpoint.thrift.dto.TResult;
import com.navercorp.pinpoint.thrift.dto.command.TActiveThread;
import com.navercorp.pinpoint.thrift.dto.command.TActiveThreadResponse;
import org.apache.thrift.TBase;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author Taejin Koo
 */
public class ActiveThreadServiceTest {

    private final DefaultTraceContext defaultTraceContext = new DefaultTraceContext(new TestAgentInformation());
    private final AtomicInteger idGenerator = new AtomicInteger(0);

    @Test
    public void serviceTest1() {
        ActiveTraceRepository activeTraceRepository = new ActiveTraceRepository();

        ActiveThreadService service = new ActiveThreadService(activeTraceRepository);

        TBase<?, ?> tBase = service.requestCommandService(null);
        if (tBase instanceof TResult) {
            Assert.assertFalse(((TResult) tBase).isSuccess());
        } else {
            Assert.fail();;
        }
    }

    @Test
    public void serviceTest2() throws InterruptedException {
        int normalCount = 5;
        ActiveTraceRepository activeTraceRepository = new ActiveTraceRepository();
        addActiveTrace(activeTraceRepository, normalCount);

        Thread.sleep(1100);
        int fastCount = 3;
        addActiveTrace(activeTraceRepository, fastCount);

        ActiveThreadService service = new ActiveThreadService(activeTraceRepository);
        TBase<?, ?> tBase = service.requestCommandService(new TActiveThread());
        if (tBase instanceof TActiveThreadResponse) {
            List<Integer> activeThreadCount = ((TActiveThreadResponse) tBase).getActiveThreadCount();
            Assert.assertEquals(activeThreadCount.get(0), new Integer(fastCount));
            Assert.assertEquals(activeThreadCount.get(1), new Integer(normalCount));
        } else {
            Assert.fail();
        }
    }

    private void addActiveTrace(ActiveTraceRepository activeTraceRepository, int addCount) {
        for (int i = 0; i < addCount; i++) {
            activeTraceRepository.put((long) idGenerator.incrementAndGet(), createDefaultTrace());
        }
    }

    private DefaultTrace createDefaultTrace() {
        DefaultTraceContext defaultTraceContext = new DefaultTraceContext(new TestAgentInformation());
        DefaultTrace trace = new DefaultTrace(defaultTraceContext, idGenerator.incrementAndGet(), true);
        return trace;
    }

}
