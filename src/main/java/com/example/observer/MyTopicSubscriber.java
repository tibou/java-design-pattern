package com.example.observer;

public class MyTopicSubscriber implements Observer {
    private String name;
    private Subject topic;

    public MyTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String message = (String) this.topic.getUpdate(this);
        if (message == null) {
            System.out.println(this.name + ":: No new message");
        } else {
            System.out.println(this.name + ":: Consuming message::" + message);
        }
    }

    @Override
    public void setSubject(Subject sub) {
        this.topic = sub;
    }
}
