package org.buddy.tests.basic

import org.buddy.greetEveryone
import org.junit.Assert
import org.junit.Test

class BasicTests {
    @Test
    fun testString() {
        Assert.assertEquals("Hello, world!", greetEveryone())
    }
}