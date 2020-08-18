package com.ionspin.reproducer

/**
 * Created by Ugljesa Jovanovic
 * ugljesa.jovanovic@ionspin.com
 * on 08-Aug-2020
 */

interface InterfaceWithSameMethodName {
    fun methodName() : String
}

class ConcreteImplementationOfInterfaceWithSameMethodName : InterfaceWithSameMethodName {
    override fun methodName() : String {
        println("JS platform methodName()")
        return "Irrelevant"
    }

}

val concreteClass = ConcreteImplementationOfInterfaceWithSameMethodName()

fun getConcreteClass() : InterfaceWithSameMethodName {
    return concreteClass
}


