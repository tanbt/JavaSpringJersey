package org.glassfish.jersey.archetypes.tanbui.service;

import org.glassfish.jersey.archetypes.tanbui.entity.User;
import org.glassfish.jersey.archetypes.tanbui.repository.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User getUser(long userId) {
        User user = new User();
        user.setFirstName("Tan");
        user.setLastName("Bui");
        user.setEmail("trungtanbui@gmail.com");
        user.setSex("Male");
        return user;
    }
}
