package com.example.abstractfactory;

public class PCFactory implements ComputerAbstractFactory {
    private String ram;
    private String disk;
    private String cpu;

    public PCFactory(String ram, String disk, String cpu) {
        this.ram = ram;
        this.disk = disk;
        this.cpu = cpu;
    }

    public Computer createComputer() {
        return new PC(ram, disk, cpu);
    }

}
