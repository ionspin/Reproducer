package com.ionspin.reproducer

/**
 * Created by Ugljesa Jovanovic
 * ugljesa.jovanovic@ionspin.com
 * on 08-Aug-2020
 */
actual class IrrelevantClass {
    actual fun methodName() : String {
        println("JVM platform methodName()")
        return "IrrelevantJvm"
    }

}
