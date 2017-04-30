package org.glassfish.jersey.archetypes.tanbui;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

public class MyResource extends ResourceConfig {

    public MyResource(){
        register(RequestContextFilter.class);
        register(JerseyResource.class);
        register(SpringSingletonResource.class);
        register(UserResource.class);
    }

}
