package ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService (targetNamespace="http://myWSService")
public class Calculator {
	@WebMethod
	public int add(int a, int b) {
		return a + b;
	}

}
