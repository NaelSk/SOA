
package com.soap.ws.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "LibraryWS", targetNamespace = "http://ws")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LibraryWS {


    /**
     * 
     * @param searchString
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "searchPublicationByTopicReturn", targetNamespace = "http://ws")
    @RequestWrapper(localName = "searchPublicationByTopic", targetNamespace = "http://ws", className = "com.soap.ws.client.SearchPublicationByTopic")
    @ResponseWrapper(localName = "searchPublicationByTopicResponse", targetNamespace = "http://ws", className = "com.soap.ws.client.SearchPublicationByTopicResponse")
    public String searchPublicationByTopic(
        @WebParam(name = "searchString", targetNamespace = "http://ws")
        String searchString);

}