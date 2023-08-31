package com.example.abstractfactory;

public class Server extends Computer{

    public Server(String ram, String disk, String cpu){
        this.ram = ram;
        this.disk = disk;
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Server{" +
                "ram='" + ram + '\'' +
                ", disk='" + disk + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}
