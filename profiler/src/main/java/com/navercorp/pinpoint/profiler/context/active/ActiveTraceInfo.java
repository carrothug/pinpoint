/*
 * Copyright 2014 NAVER Corp.
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

package com.navercorp.pinpoint.profiler.context.active;


/**
 * @author Taejin Koo
 */
public class ActiveTraceInfo {

    private final long id;
    private final long startTime;

    public ActiveTraceInfo(long id, long startTime) {
        this.id = id;
        this.startTime = startTime;
    }

    public long getId() {
        return id;
    }

    public long getStartTime() {
        return startTime;
    }

    @Override
    public String toString() {
        StringBuilder toString = new StringBuilder();
        toString.append("ActiveTraceInfo{");
        toString.append("id=").append(id);
        toString.append(", startTime=").append(startTime);
        toString.append("}");

        return toString.toString();
    }
}
