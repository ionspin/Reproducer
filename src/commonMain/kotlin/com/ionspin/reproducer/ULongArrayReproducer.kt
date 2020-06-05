package com.ionspin.reproducer

/**
 * Created by Ugljesa Jovanovic
 * ugljesa.jovanovic@ionspin.com
 * on 05-Jun-2020
 */


interface BackedByArray<BackingCollectionType> {
    val ONE: BackingCollectionType
}

@ExperimentalUnsignedTypes
object ExampleImplementation : BackedByArray<ULongArray> {
    override val ONE: ULongArray = ulongArrayOf(1u)
}

@ExperimentalUnsignedTypes
object ULongArrayReproducer {
    fun getOne() : ULongArray {
        return ExampleImplementation.ONE
    }
}