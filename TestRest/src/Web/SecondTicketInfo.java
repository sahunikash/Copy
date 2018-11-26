package Web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/st")
public class SecondTicketInfo 
{
	@Path("/insertpath/{ticket}/{date}/{time}/{name}/{location}/{price}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
public String receiveTicktInfo(
		@PathParam("ticket")String ticket,
		@PathParam("date") String date,
		@PathParam("time") String time,
		@PathParam("name") String name,
		@PathParam("location") String loc,
		@PathParam("price") String price
		)
{
		if(ticket!=null && date!=null && time!=null && name!=null && loc!=null && price!=null)
		{
			System.out.println(ticket +"\t"+ date +"\t"+name+"\t"+loc+"\t"+price);
			
			return "Success";
		}
		else {
			return "FAIL";
		}
		
	}
	@Path("/query")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String insertQuery(@QueryParam("ticket")String ticket,
			@QueryParam("date") String date,
			@QueryParam("time") String time,
			@QueryParam("name") String name,
			@QueryParam("location") String loc,
			@QueryParam("price") String price) 
	{
		if(ticket!=null && date!=null && time!=null && name!=null && loc!=null && price!=null)
		{
			System.out.println(ticket +"\t"+ date +"\t"+name+"\t"+loc+"\t"+price);
			
			return ticket +"\t"+ date +"\t"+name+"\t"+loc+"\t"+price;
		}
		else {
			return "Fail";
	}
}
}
