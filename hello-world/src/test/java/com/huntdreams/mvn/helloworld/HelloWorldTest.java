package com.huntdreams.mvn.helloworld;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * HelloWorldTest
 * <p/>
 * Author: Noprom <tyee.noprom@qq.com>
 * Date: 6/8/16 11:29 PM.
 */
public class HelloWorldTest {
    @Test
    public void testSayHello() {
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.sayHello();
        assertEquals("Hello Maven", result);
    }
}
