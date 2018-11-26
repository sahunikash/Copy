package Web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/test")
public class webServ 
{
	@GET
	@Path("/hi")
	@Produces(MediaType.TEXT_PLAIN)
    public String msg()
    {
	return "i have completed my 1st simple restExample";
	}
}
