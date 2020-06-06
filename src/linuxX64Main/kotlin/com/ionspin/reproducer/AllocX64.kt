@file:Suppress("EXPERIMENTAL_UNSIGNED_LITERALS")

package com.ionspin.reproducer

import kotlinx.cinterop.*
import mockCLib.MockStruct


/**
 * Created by Ugljesa Jovanovic
 * ugljesa.jovanovic@ionspin.com
 * on 05-Jun-2020
 */


object AllocX64 {

    fun runAllocUnmodifiedFails() {
        println("Size ${MockStruct.size} Align: ${MockStruct.align}")
        val mockStruct: MockStruct = nativeHeap.alloc()
        mockStruct.array[0] = 1U
        println("Mock struct val1: ${mockStruct.array[0]}")
    }

    fun runAllocModifiedWorks() {
        println("Size ${MockStruct.size} Align: ${MockStruct.align + 1}")
        val mockStruct: MockStruct = nativeHeap.alloc(MockStruct.size, MockStruct.align + 1).reinterpret()
        mockStruct.array[0] = 1U
        println("Mock struct val1: ${mockStruct.array[0]}")
    }

}