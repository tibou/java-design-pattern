package com.example.observer;

/*
    Behavioral design pattern

    Observer design pattern is useful when you are interested in the state of an object and want to get notified whenever there is any change.
    In observer pattern, the object that watch on the state of another object are called Observer and the object that is being watched is called Subject.

    According to GoF, observer design pattern intent is;
        Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

    Subject contains a list of observers to notify of any change in it’s state, so it should provide methods using which observers can register and
    unregister themselves. Subject also contain a method to notify all the observers of any change and either it can send the update while notifying
    the observer or it can provide another method to get the update. Observer should have a method to set the object to watch and another method that
    will be used by Subject to notify them of any updates. Java provides inbuilt platform for implementing Observer pattern through java.util.Observable
    class and java.util.Observer interface. However it’s not widely used because the implementation is really simple and most of the times we don’t want to
    end up extending a class just for implementing Observer pattern as java doesn’t provide multiple inheritance in classes. Java Message Service (JMS) uses
    Observer design pattern along with Mediator pattern to allow applications to subscribe and publish data to other applications. Model-View-Controller (MVC)
    frameworks also use Observer pattern where Model is the Subject and Views are observers that can register to get notified of any change to the model.

    For our observer pattern java program example, we would implement a simple topic and observers can register to this topic. Whenever any new message will
    be posted to the topic, all the registers observers will be notified and they can consume the message.

    Observer design pattern is also called as publish-subscribe pattern. Some of it’s implementations are;
        java.util.EventListener in Swing
        javax.servlet.http.HttpSessionBindingListener
        javax.servlet.http.HttpSessionAttributeListener

 */
public class TestObserver {

    public static void main(String[] args){
        // create subject
        MyTopic topic =  new MyTopic();

        // create observers
        Observer obj1 = new MyTopicSubscriber("obj1");
        Observer obj2 = new MyTopicSubscriber("obj2");
        Observer obj3 = new MyTopicSubscriber("obj3");

        // register observers to subject
        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);

        // attach observer to subject
        obj1.setSubject(topic);
        obj2.setSubject(topic);
        obj3.setSubject(topic);

        // check if any update is available
        obj1.update();

        // send message to subject
        topic.postMessage("New message");
    }
}
