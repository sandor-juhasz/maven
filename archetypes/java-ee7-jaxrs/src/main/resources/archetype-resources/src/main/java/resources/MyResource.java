#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import ${package}.domain.MyPojo;

@Path("myresource")
public class MyResource {
 
    @GET
    @Produces("application/json")
    public MyPojo getIt() {
    	return new MyPojo("John Smith", 30);
    }
    
}
