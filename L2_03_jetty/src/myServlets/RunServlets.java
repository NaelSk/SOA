package myServlets;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;

public class RunServlets {

	public static void main(String[] args) throws Exception{


		
		ServletHandler handler = new ServletHandler();
		handler.addServletWithMapping(SearchPublication.class, "/searchPublication"); //add all servlet to use to the handler, the second argument is the path (e.g. http://localhost:8080/searchPublication)
		handler.addServletWithMapping(UserProfile.class, "/getProfile");
		handler.addServletWithMapping(CreateUserProfile.class, "/createProfile");

        //Create a new Server, add the handler to it and start
        Server server = new Server(1234);		
		server.setHandler(handler);
		server.start();
		//this dumps a lot of debug output to the console. 
		server.dumpStdErr();
		server.join();
		
		
		
	}

}
