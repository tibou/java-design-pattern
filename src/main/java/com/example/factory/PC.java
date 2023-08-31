package com.example.factory;

public class PC extends Computer{

    public PC(String ram, String disk, String cpu) {
        this.ram = ram;
        this.disk = disk;
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "PC{" +
                "ram='" + ram + '\'' +
                ", disk='" + disk + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}
