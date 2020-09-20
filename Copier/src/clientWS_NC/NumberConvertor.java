package clientWS_NC;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.dataaccess.webservicesserver.NumberConversion;
import com.dataaccess.webservicesserver.NumberConversionSoapType;
import com.soap.ws.client.CountryInfoService;
import com.soap.ws.client.CountryInfoServiceSoapType;

public class NumberConvertor {
    public NumberConvertor() {}
	
	public String convert2word(String inputStr) {
		BigInteger input_N = new BigInteger(inputStr);
		NumberConversion NC_service = new NumberConversion(); //created service object
        NumberConversionSoapType NC_serviceSOAP = NC_service.getNumberConversionSoap(); //create SOAP object (a port of the service)
        String result = NC_serviceSOAP.numberToWords(input_N);  
        return result;
	}
    
	public String convert2dollars(String inputStr) {
		BigDecimal input_D = new BigDecimal(inputStr);
		NumberConversion NC_service = new NumberConversion(); //created service object
        NumberConversionSoapType NC_serviceSOAP = NC_service.getNumberConversionSoap(); //create SOAP object (a port of the service)
        String result = NC_serviceSOAP.numberToDollars(input_D);  
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