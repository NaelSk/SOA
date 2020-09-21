package myServlets;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import ws.Calculator;



@WebServlet("/addition")
public class Addition extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Addition() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String num1 = request.getParameter("num1").toString();
		String num2 = request.getParameter("num2").toString();
		String cur = request.getParameter("cur").toString();
		
		
		Calculator c = new Calculator();
		
		String result = c.add(Integer.parseInt(num1), Integer.parseInt(num2), cur);
		
		Map<String, String> options = new LinkedHashMap<>();
		
    	options.put("result", result);
    	

	    String json = new Gson().toJson(options);
		
		response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    response.getWriter().write(json.toString());
		
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
/*		
		PrintWriter out = response.getWriter();
		out.write("Responce post:searchPublication");  
		out.flush();
	    out.close();
*/		
		
	}


}
