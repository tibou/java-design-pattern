package com.example.builder;

public class TestBuilder {

    public static  void main(String args[]){
        Computer computer = new Computer.ComputerBuilder()
                .setDisk("500 GB")
                .setRam("2 GB")
                .setGraphicsEnabled(Boolean.TRUE)
                .setBluetoothEnabled(Boolean.TRUE)
                .build();

        System.out.println(computer);
    }
}
