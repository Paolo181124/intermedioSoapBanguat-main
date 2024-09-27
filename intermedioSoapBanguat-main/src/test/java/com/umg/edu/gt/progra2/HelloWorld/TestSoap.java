/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.edu.gt.progra2.HelloWorld;

import com.umg.edu.gt.progra2.HelloWorld.soapclient.TipoCambioClient;
import com.umg.edu.gt.progra2.HelloWorld.soapclient.generated.TipoCambioDiaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SoapTest implements CommandLineRunner {

    @Autowired
    private TipoCambioClient tipoCambioClient;

    @Override
    public void run(String... args) throws Exception {
        TipoCambioDiaResponse response = tipoCambioClient.getTipoCambioDia();
        System.out.println("Response: " + response);
    }
}
