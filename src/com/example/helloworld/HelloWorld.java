package com.example.helloworld;

import java.util.Random;

/**
 * Created by kkalan on 9/22/15.
 */
public class HelloWorld {
    public static void main(String[] args) {
        // write your code here
        Random answer = new Random();
        System.out.println (answer.nextInt(100));
    }
}
