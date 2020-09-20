package ws;

import java.math.BigInteger;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.soap.ws.countryinfo.CountryInfoService;
import com.soap.ws.countryinfo.CountryInfoServiceSoapType;
import com.soap.ws.numberconversion.NumberConversion;
import com.soap.ws.numberconversion.NumberConversionSoapType;

@WebService(targetNamespace = "http://myWSService")
public class Calculator {
	@WebMethod
	public String add(int a, int b, String cur) {

		int sum;
		sum = a + b;
		String sumInWord="";
		sumInWord=convert2word(Integer.toString(sum));
		String currency="Hello";
		currency=convert2name(cur);
		
		return sumInWord+currency; /* Integer.toString(sum);*/
	}


		public String convert2word(String sum) {
			BigInteger input_N = new BigInteger(sum);
			NumberConversion NC_service = new com.soap.ws.numberconversion.NumberConversion(); // created service object
			NumberConversionSoapType NC_serviceSOAP = NC_service.getNumberConversionSoap(); // create SOAP object (a
																							// port of the service)
			String result = NC_serviceSOAP.numberToWords(input_N);
			return result;
		}
	
	public String convert2name(String inputStr) {
		// TODO Auto-generated method stub


		CountryInfoService NC_service = new CountryInfoService(); //created service object
		CountryInfoServiceSoapType NC_serviceSOAP = NC_service.getCountryInfoServiceSoap(); //create SOAP object (a port of the service)
        String result = NC_serviceSOAP.currencyName(inputStr);  
        return result;
		
	}
}