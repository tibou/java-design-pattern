package com.example.state;

/*
    Behavioral design pattern

    State design pattern is used when an Object change its behavior based on its internal state.

    If we have to change the behavior of an object based on its state, we can have a state variable in the Object. Then use if-else condition block
    to perform different actions based on the state. State design pattern is used to provide a systematic and loosely coupled way to achieve this
    through Context and State implementations. State Pattern Context is the class that has a State reference to one of the concrete implementations
    of the State. Context forwards the request to the state object for processing. Let’s understand this with a simple example. Suppose we want to
    implement a TV Remote with a simple button to perform action. If the State is ON, it will turn on the TV and if state is OFF, it will turn off
    the TV. We can implement it using if-else condition like below; TVRemoteBasic.java

    State Design Pattern Benefits
    The benefits of using State pattern to implement polymorphic behavior is clearly visible. The chances of error are less and it’s very easy to
    add more states for additional behavior. Thus making our code more robust, easily maintainable and flexible. Also State pattern helped in
    avoiding if-else or switch-case conditional logic in this scenario. State Pattern is very similar to Strategy Pattern, check out Strategy
    Pattern in Java. Thats all for State design pattern in java, I hope you liked it.



 */
public class TestState {
    public static void main(String args[]) {
        TVContext context = new TVContext();
        State tvStartState = new TVStartState();
        State tvStopState = new TVStopState();

        context.setState(tvStartState);
        context.doAction();


        context.setState(tvStopState);
        context.doAction();
    }
}
