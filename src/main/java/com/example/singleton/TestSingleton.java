package com.example.singleton;

public class TestSingleton {
    public static void main(String[] args){
        Singleton singleton1 = Singleton.getInstance();
        singleton1.increment();
        Singleton singleton2 = Singleton.getInstance();
        singleton2.increment();
        System.out.println(singleton1.getCompteur());
    }
}
