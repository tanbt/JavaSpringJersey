package org.glassfish.jersey.archetypes.tanbui;

import org.glassfish.jersey.archetypes.tanbui.entity.User;
import org.glassfish.jersey.archetypes.tanbui.repository.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("user")
public class UserResource {

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public User getUser() {
        return userService.getUser(1234);
    }

}
