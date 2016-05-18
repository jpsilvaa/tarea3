/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integracion.clase.juanpablosilva.paises;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import net.webservicex.Airport;
import net.webservicex.AirportSoap;
import net.webservicex.GlobalWeather;
import net.webservicex.GlobalWeatherSoap;

/**
 *
 * @author jpsilva
 */
@WebService(serviceName = "Paises")
public class Paises {

    /**
     * This is a sample web service operation
     * @param pais
     * @return 
     */
    @WebMethod(operationName = "obtenerCiudadesYAeropuertos")
    public String[] obtenerCiudadesYAeropuertos(@WebParam(name = "pais") String pais) {
        GlobalWeather gw = new GlobalWeather();
        GlobalWeatherSoap gwSoap = gw.getGlobalWeatherSoap();
        
        Airport airport = new Airport();
        AirportSoap aSoap = airport.getAirportSoap();
        
        String[] values = new String[2];
        String ciudades = gwSoap.getCitiesByCountry(pais);
          
        //values[0] = "";
        values[0] = ciudades;
        values[1] = aSoap.getAirportInformationByCountry(pais);
        return values;
    }
}
