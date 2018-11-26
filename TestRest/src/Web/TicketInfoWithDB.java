package Web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/newTest")
public class TicketInfoWithDB 
{
    @Path("/met/{Movie_name}/{time}/{location}/{price}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
	public String Tickt(@PathParam("Movie_name") String name
			            ,@PathParam("time") String time
			            ,@PathParam("location") String loc
			            ,@PathParam("price") String price) throws ClassNotFoundException, SQLException
	{
    	if(name != null && time !=null && loc !=null && price != null)
    	{
    		Statement st=jdbcUrils.getConnection();
    		String sql = "insert into ticket values"+"('name' 'time','loc','price')";
    		//ResultSet rs = st.executeQuery();
    		st.executeUpdate(sql);
    		
    		
    		return "succec";
    	}
    	else {
    		return "fail";
    	}
		
	}
}
