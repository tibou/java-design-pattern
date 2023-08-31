package com.example.adapter;

public class SocketObjectAdapterImpl implements SocketAdapter{
    //Using Composition for adapter pattern
    Socket socket = new Socket();

    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volt() {
        return new Volt(socket.getVolt().getVolt() / 10);
    }

    @Override
    public Volt get3Volt() {
        return new Volt(socket.getVolt().getVolt() / 40);
    }
}
