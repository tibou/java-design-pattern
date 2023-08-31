package com.example.adapter;

public class TestAdapter {

    public static void main(String args[]){
        testClassAdapter();
        testObjectAdapter();
    }

    public static void testClassAdapter(){
        SocketAdapter socketAdapter = new SocketClassAdapterImpl();
        System.out.println(socketAdapter.get3Volt());
        System.out.println(socketAdapter.get12Volt());
        System.out.println(socketAdapter.get120Volt());
    }

    public  static void testObjectAdapter(){
        SocketAdapter socketAdapter = new SocketObjectAdapterImpl();
        System.out.println(socketAdapter.get3Volt());
        System.out.println(socketAdapter.get12Volt());
        System.out.println(socketAdapter.get120Volt());
    }
}
