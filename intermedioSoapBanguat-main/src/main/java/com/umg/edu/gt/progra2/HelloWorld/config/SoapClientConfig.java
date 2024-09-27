/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.edu.gt.progra2.HelloWorld.config;

/**
 *
 * @author PC
 */
package com.umg.edu.gt.progra2.HelloWorld.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.umg.edu.gt.progra2.HelloWorld.soapclient.TipoCambioClient;

@Configuration
public class SoapClientConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.umg.edu.gt.progra2.HelloWorld.soapclient.generated");
        return marshaller;
    }

    @Bean
    public TipoCambioClient tipoCambioClient(Jaxb2Marshaller marshaller) {
        TipoCambioClient client = new TipoCambioClient();
        client.setDefaultUri("http://www.banguat.gob.gt/variables/ws/TipoCambio.asmx");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
