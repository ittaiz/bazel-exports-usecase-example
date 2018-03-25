package com.example;

public class TransitiveFooUser {
    public static String sayHi() {
    	PartOfFoo.sayHi();
        return "Hi!";
    }
}