import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

/**
 * Created by Keiichi on 25/04/2017.
 */
public class SoapExample {

    public static void main(String[] args) throws SOAPException {
        SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
        SOAPConnection soapConnection = soapConnectionFactory.createConnection();

        //Send SOAP Message to SOAP Server
        String url = "https://cvo-crescendo-slo.smartschool.be/Webservices/V3?wsdl";
        SOAPMessage soapResponse = soapConnection.call(createSoapRequest(), url);
    }


}
