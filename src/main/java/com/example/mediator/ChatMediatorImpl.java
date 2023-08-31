package com.example.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator{
    private List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, User user) {
        this.users.forEach(
                u -> {
                    //message should not be received by the user sending it
                    if( u != user){
                        u.receive(msg);
                    }
                }
        );
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}
