package Web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/user")
public class TicketInfoFromUser {
	@Path("/create")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response Tickt(User usrs) {
		try {
			Statement st = jdbcUrils.getConnection();
			System.out.println(usrs);
			
		} catch (Exception e) {
			return Response.status(400).entity("Error").build();
		}
		return Response.status(200).entity("success").build();
	}
}