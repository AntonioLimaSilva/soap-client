//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.08.27 às 10:06:44 PM BRT 
//


package br.com.luciano.soapclient.xml;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.luciano.soapclient.xml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.luciano.soapclient.xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PersonDetailsRequest }
     * 
     */
    public PersonDetailsRequest createPersonDetailsRequest() {
        return new PersonDetailsRequest();
    }

    /**
     * Create an instance of {@link PersonDetailsResponse }
     * 
     */
    public PersonDetailsResponse createPersonDetailsResponse() {
        return new PersonDetailsResponse();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

}
