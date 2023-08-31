package com.example.memento;

/*
     Behavioral pattern

    The memento design pattern is used when we want to save the state of an object so that we can restore it later on. This pattern is used to
    implement this in such a way that the saved state data of the object is not accessible outside of the Object, this protects the integrity of
    saved state data.

    Memento pattern is implemented with two Objects – originator and caretaker. The originator is the Object whose state needs to be saved and
    restored, and it uses an inner class to save the state of Object. The inner class is called “Memento”, and it’s private so that it can’t be
    accessed from other objects.
 */
public class TestMemento {
}
