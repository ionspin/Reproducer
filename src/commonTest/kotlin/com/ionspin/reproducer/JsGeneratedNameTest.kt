package com.ionspin.reproducer

import kotlin.test.Test

/**
 * Created by Ugljesa Jovanovic
 * ugljesa.jovanovic@ionspin.com
 * on 08-Aug-2020
 */
class JsGeneratedNameTest {

    @Test
    fun testWrongJsNameGenerated() {
        IrrelevantClass().methodName()
    }
}
