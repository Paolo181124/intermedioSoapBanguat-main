/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.edu.gt.progra2.HelloWorld.soapclient;

/**
 *
 * @author PC
 */

package com.umg.edu.gt.progra2.HelloWorld.soapclient;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.umg.edu.gt.progra2.HelloWorld.soapclient.generated.TipoCambioDia;
import com.umg.edu.gt.progra2.HelloWorld.soapclient.generated.TipoCambioDiaResponse;

public class TipoCambioClient extends WebServiceGatewaySupport {

    private static final String URL = "http://www.banguat.gob.gt/variables/ws/TipoCambio.asmx";

    public TipoCambioDiaResponse getTipoCambioDia() {
        TipoCambioDia request = new TipoCambioDia();

        TipoCambioDiaResponse response = (TipoCambioDiaResponse) getWebServiceTemplate()
                .marshalSendAndReceive(URL, request, new SoapActionCallback("http://www.banguat.gob.gt/variables/ws/TipoCambioDia"));

        return response;
    }
}
