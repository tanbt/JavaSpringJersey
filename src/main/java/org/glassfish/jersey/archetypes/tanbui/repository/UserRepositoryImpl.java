package org.glassfish.jersey.archetypes.tanbui.repository;

import org.glassfish.jersey.archetypes.tanbui.entity.User;
import org.glassfish.jersey.archetypes.tanbui.repository.UserRepository;

public class UserRepositoryImpl implements UserRepository {
    @Override
    public User getUser(long userId) {
        User user = new User();
        user.setUserId(userId);
        user.setFirstName("Tan");
        user.setLastName("Bui");
        user.setEmail("trungtanbui@gmail.com");
        user.setSex("Male");
        return user;
    }
}
