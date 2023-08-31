package com.example.adapter;

//Using inheritance for adapter pattern
public class SocketClassAdapterImpl extends Socket implements SocketAdapter {
    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        return new Volt(getVolt().getVolt() / 10 );
    }

    @Override
    public Volt get3Volt() {
        return new Volt(getVolt().getVolt() / 40);
    }
}
