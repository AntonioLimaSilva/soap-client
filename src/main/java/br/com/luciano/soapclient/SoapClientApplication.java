package br.com.luciano.soapclient;

import br.com.luciano.soapclient.config.SOAPConnector;
import br.com.luciano.soapclient.xml.PersonDetailsRequest;
import br.com.luciano.soapclient.xml.PersonDetailsResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SoapClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapClientApplication.class, args);
	}

	@Bean
	CommandLineRunner lookup(SOAPConnector soapConnector) {
		return args -> {
			String name = "Gabriel Chaves"; //Default Name
			if(args.length>0){
				name = args[0];
			}

			PersonDetailsRequest request = new PersonDetailsRequest();
			request.setName(name);
			PersonDetailsResponse response = (PersonDetailsResponse) soapConnector.callWebService("http://localhost:8080/service/person-details", request);
			System.out.println("===== Response Web Service ====");
			System.out.println("Name : "+response.getPerson().getName());
			System.out.println("Age : "+response.getPerson().getAge());
			System.out.println("Address : "+response.getPerson().getAddress());
			System.out.println("===== END ====");
		};
	}
}
