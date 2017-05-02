package org.glassfish.jersey.archetypes.tanbui.service;

import org.glassfish.jersey.archetypes.tanbui.entity.User;
import org.glassfish.jersey.archetypes.tanbui.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class UserService {

    @Autowired
    @Qualifier("userRepository")
    private UserRepository userRepository;

    public User[] getUsers() {
        User[] users = new User[2];
        users[0] = userRepository.getUser(123);
        users[1] = userRepository.getUser(456);
        return users;
    }

    public User createUser(User data) {
        //@todo: call the repository to write user data into DB
        return data;
    }

    public User getUser(long userId) {
        return userRepository.getUser(userId);
    }

    public String getUserName(long userId) {
        return "{\"name\":\" " + userRepository.getUser(userId).getFirstName() + userRepository.getUser(userId).getLastName() + " \"}";
    }

    public String getUserSchema() {
        return "{\"user\": {\"name\": \"String\", \"id\": \"Integer\"}}";
    }

}
