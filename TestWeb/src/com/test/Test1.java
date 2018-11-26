package com.test;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/test2")
public class Test1 {
		@GET
		@Path("/get2")
		@Produces(MediaType.APPLICATION_JSON)
		public List<String>  getMsg() {
			 
			List<String> l=new ArrayList<>();
			l.add("Test1");
			l.add("test2");
	 
			return l;
	 
		}




}
