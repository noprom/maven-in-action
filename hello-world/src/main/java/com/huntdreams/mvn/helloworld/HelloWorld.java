package com.huntdreams.mvn.helloworld;

/**
 * Author: Noprom <tyee.noprom@qq.com>
 * Date: 6/7/16 10:22 PM.
 */
public class HelloWorld {

    public String sayHello() {
        return "Hello Maven";
    }

    public static void main(String[] args) {
        System.out.print(new HelloWorld().sayHello());
    }
}
