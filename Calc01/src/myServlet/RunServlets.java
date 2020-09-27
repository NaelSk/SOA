package myServlet;


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;

public class RunServlets {
	
public static void main(String[] args) throws Exception{


		
		ServletHandler handler = new ServletHandler();
		handler.addServletWithMapping(Addition.class, "/addition"); //add all servlet to use to the handler, the second argument is the path (e.g. http://localhost:8080/searchPublication)
		
        //Create a new Server, add the handler to it and start
        Server server = new Server(1234);		
		server.setHandler(handler);
		server.start();
		//this dumps a lot of debug output to the console. 
		server.dumpStdErr();
		server.join();
		
		
		
	}

}
