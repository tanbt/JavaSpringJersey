package org.glassfish.jersey.archetypes.tanbui.repository;

import org.glassfish.jersey.archetypes.tanbui.entity.User;

/**
 * Created by tan on 4/30/2017.
 */
public interface UserService {
    public User getUser(long userId);
}
