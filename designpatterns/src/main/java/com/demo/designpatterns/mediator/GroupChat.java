package com.demo.designpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class GroupChat implements Mediator {

    private final List<User> users;

    public GroupChat() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        users.stream()
                .filter(u -> u != user)
                .forEach(u -> u.receive(message));
    }
}