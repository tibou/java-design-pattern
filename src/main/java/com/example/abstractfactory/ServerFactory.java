package com.example.abstractfactory;

public class ServerFactory implements ComputerAbstractFactory {
    private String ram;
    private String disk;
    private String cpu;

    public ServerFactory(String ram, String disk, String cpu) {
        this.ram = ram;
        this.disk = disk;
        this.cpu = cpu;
    }

    public Computer createComputer() {
        return new Server(ram, disk, cpu);
    }

}
