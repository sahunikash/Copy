package com.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/test")
public class RestExample {
	
	@GET
	@Path("/get1")
	@Produces(MediaType.TEXT_PLAIN)
	public String getMsg() {
		 
		String output = "hello";
 
		return output;
 
	}

}
