package org.glassfish.jersey.archetypes.tanbui.service;

import org.glassfish.jersey.archetypes.tanbui.entity.Group;
import org.glassfish.jersey.archetypes.tanbui.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;


public class GroupService {
    @Autowired
    private GroupRepository groupRepository;

    public List<Group> getGroups(int page, int size) {
        return groupRepository.findAll();
    }
}
