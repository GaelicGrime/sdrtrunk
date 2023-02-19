/*
 * *****************************************************************************
 * Copyright (C) 2014-2023 Dennis Sheirer
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 * ****************************************************************************
 */

// Generated by jextract

package io.github.dsheirer.source.tuner.sdrplay.api.v3_08;

import java.lang.foreign.Addressable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.MemorySession;
public interface sdrplay_api_SelectDevice_t {

    int apply(java.lang.foreign.MemoryAddress device);
    static MemorySegment allocate(sdrplay_api_SelectDevice_t fi, MemorySession session) {
        return RuntimeHelper.upcallStub(sdrplay_api_SelectDevice_t.class, fi, constants$2.sdrplay_api_SelectDevice_t$FUNC, session);
    }
    static sdrplay_api_SelectDevice_t ofAddress(MemoryAddress addr, MemorySession session) {
        MemorySegment symbol = MemorySegment.ofAddress(addr, 0, session);
        return (java.lang.foreign.MemoryAddress _device) -> {
            try {
                return (int)constants$2.sdrplay_api_SelectDevice_t$MH.invokeExact((Addressable)symbol, (java.lang.foreign.Addressable)_device);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


