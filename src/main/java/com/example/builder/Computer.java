package com.example.builder;

public class Computer {
    private String ram;
    private String disk;
    private boolean isGraphicsEnabled;
    private boolean isBluetoothEnabled;

    private Computer(){

    }


    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public void setGraphicsEnabled(boolean graphicsEnabled) {
        isGraphicsEnabled = graphicsEnabled;
    }

    public void setBluetoothEnabled(boolean bluetoothEnabled) {
        isBluetoothEnabled = bluetoothEnabled;
    }

    public String getRam() {
        return ram;
    }

    public String getDisk() {
        return disk;
    }

    public boolean isGraphicsEnabled() {
        return isGraphicsEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram='" + ram + '\'' +
                ", disk='" + disk + '\'' +
                ", isGraphicsEnabled=" + isGraphicsEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }

    public static class ComputerBuilder{
        private Computer computer;

        public ComputerBuilder(){
            this.computer = new Computer();
        }

        public ComputerBuilder setDisk(String disk){
            computer.setDisk(disk);
            return  this;
        }

        public ComputerBuilder setRam(String ram){
            computer.setRam(ram);
            return this;
        }

        public ComputerBuilder setGraphicsEnabled(boolean value){
            computer.setGraphicsEnabled(value);
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean value){
            computer.setBluetoothEnabled(value);
            return this;
        }

        public Computer build(){
            return this.computer;
        }
    }
}
