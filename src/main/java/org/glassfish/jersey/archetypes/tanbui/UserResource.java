package org.glassfish.jersey.archetypes.tanbui;

import org.glassfish.jersey.archetypes.tanbui.entity.User;
import org.glassfish.jersey.archetypes.tanbui.entity.UserResponse;
import org.glassfish.jersey.archetypes.tanbui.repository.UserRepository;
import org.glassfish.jersey.archetypes.tanbui.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("user")
public class UserResource {

    @Autowired
    @Qualifier ("userService")
    private UserService userService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public User[] getUser() {
        return userService.getUsers();
    }

    @POST
    @Consumes (MediaType.APPLICATION_JSON)
    @Produces (MediaType.APPLICATION_JSON)
    public UserResponse createUser(User data) {
        UserResponse userResponse = new UserResponse("Success", userService.createUser(data));
        return userResponse;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{userId}")
    public User getUser(@PathParam("userId") long userId) {
        return userService.getUser(userId);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{userId}/name")
    public String getUserName(@PathParam("userId") long userId) {
        return userService.getUserName(userId);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/schema")
    public String getUserSchema() {
        return userService.getUserSchema();
    }



}
