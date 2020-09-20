package ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService (targetNamespace="http://myWSService")
public class Calculator {
	@WebMethod
	public String add(int a, int b, String cur ) {
		
		int sum;
		sum= a + b;
		return Integer.toString(sum)+ cur;
	}

}
