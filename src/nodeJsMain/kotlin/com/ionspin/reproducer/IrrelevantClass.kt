package com.ionspin.reproducer

/**
 * Created by Ugljesa Jovanovic
 * ugljesa.jovanovic@ionspin.com
 * on 08-Aug-2020
 */
var methodName = js("\"\"")

actual class IrrelevantClass {

    fun doSomethingWithMethodNameVariable() {
        methodName = 7
    }
    actual fun methodName() : String {
        doSomethingWithMethodNameVariable()
        return getConcreteClass().methodName()
    }

}
