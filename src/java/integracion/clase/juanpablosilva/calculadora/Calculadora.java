/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integracion.clase.juanpablosilva.calculadora;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author jpsilva
 */
@WebService(serviceName = "Calculadora")
public class Calculadora {

    /**
     * This is a sample web service operation
     * @param operado1
     * @param operado2
     * @return 
     */
    @WebMethod(operationName = "sumar")
    public double sumar(@WebParam(name = "operado1") double operado1, @WebParam(name= "operado2") double operado2) {
        return operado1+operado2;
    }
}
