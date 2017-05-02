package org.glassfish.jersey.archetypes.tanbui;


import org.glassfish.jersey.archetypes.tanbui.entity.Group;
import org.glassfish.jersey.archetypes.tanbui.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/group")
public class GroupResource {
    @Autowired
    @Qualifier ("groupService")
    private GroupService groupService;

    @GET
    @Produces (MediaType.APPLICATION_JSON)
    public List<Group> getGroups(
            @DefaultValue("0") @QueryParam("page") int page,
            @DefaultValue("25") @QueryParam("size") int size
    ){
        return groupService.getGroups(page, size);
    }

    @POST
    @Consumes (MediaType.APPLICATION_JSON)
    @Produces (MediaType.APPLICATION_JSON)
    public Group[] createGroup(){
        return null;
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{groupId}")
    public Group getGroup(@PathParam("groupId") String groupId) {
        return groupService.getGroup(groupId);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{name: \\pL+[\\pL\\pZ\\pP]{0,}$}")
    public List<Group> getGroups(@PathParam("name") String name) {
        return groupService.getGroupsByName(name);
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{groupId}")
    public Group updateGroup(@PathParam("groupId") long groupId) {
        return null;
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{groupId}")
    public String deleteGroup(@PathParam("groupId") long groupId) {
        return null;
    }

}
