package com.example.factory;

public abstract class Computer {
    protected String ram;
    protected String disk;
    protected String cpu;

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram='" + ram + '\'' +
                ", disk='" + disk + '\'' +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}
