package com.primoz.fizzBuzzRest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("fizz")
public class MyResource {
	
	public  String getFizz(int k) {
    	String y="";
    for (int x=1; x<=100; x++)
	{
		if (x%5==0 && x%k==0)
		
		{y=y+"\n FizzBuzz";} 
		else if (x%5==0 )
	{y=y+"\n Buzz";} else if (x%k==0 )
	{y=y+"\n Fizz";} else {y=y+"\n "+Integer.toString(x);}
	}
   return y;
	}
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Path("{k}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt(@PathParam("k") int k) {
        return getFizz(k);
    }
}
