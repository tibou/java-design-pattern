package com.example.factory;

public class ComputerFactory {

    public static Computer getComputer(ComputerType type, String ram, String disk, String cpu){
        if(type.equals(ComputerType.PC)){
            return new PC(ram, disk, cpu);
        }else if(type.equals(ComputerType.SERVER)){
            return new Server(ram, disk, cpu);
        }
        return null;
    }
}
