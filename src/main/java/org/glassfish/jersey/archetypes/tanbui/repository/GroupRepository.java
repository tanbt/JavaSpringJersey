package org.glassfish.jersey.archetypes.tanbui.repository;

import org.glassfish.jersey.archetypes.tanbui.entity.Group;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends MongoRepository<Group, String> {

}
