package com.example.observer;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject{
    private List<Observer> observers;
    private String message;
    private boolean changed;
    private final Object MUTEX = new Object();

    public MyTopic(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        if(obj == null) throw new NullPointerException("Null observer");
        synchronized (MUTEX){
            if(!this.observers.contains(obj)) this.observers.add(obj);
        }
    }

    @Override
    public void unregister(Observer obj) {
        synchronized (MUTEX){
            this.observers.remove(obj);
        }
    }

    @Override
    public void notifyObservers() {
        List<Observer> observersLocal = null;
        //synchronization is used to make sure any observer registered after message is received is not notified
        synchronized (MUTEX){
            if(!changed) return;
            observersLocal = new ArrayList<>(this.observers);
            this.changed = false;
        }
        observersLocal.forEach(
                observer -> observer.update()
        );

    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }

    // method to post message to the topic
    public void postMessage(String message){
        System.out.println("Message posted to the topic: " + message);
        this.message = message;
        this.changed = true;
        notifyObservers();
    }
}
