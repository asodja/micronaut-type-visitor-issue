package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/user")
public class TestController {

    @GET
    @Path("/{userId}")
    @Produces({ "application/json" })
    String getUser(@PathParam("userId") String userId){
        return "Pong version " + userId;
    }

}
