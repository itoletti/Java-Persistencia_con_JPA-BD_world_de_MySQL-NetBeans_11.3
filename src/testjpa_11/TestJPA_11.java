
package testjpa_11;

import Controladores.CountryJpaService;
import Entidades.Country;
import java.math.BigDecimal;

public class TestJPA_11 {

    public static void main(String[] args) {
        Country pais;
        int nacimiento = 1980;
        pais = new Country("ALC","Alarconlandia","North America","Central America",BigDecimal.valueOf(15.00),(short)nacimiento,1,BigDecimal.valueOf(99.00),BigDecimal.valueOf(3.00),BigDecimal.valueOf(3.00),"Natilandia", "Monarquia","Nataluña",100,"AN");
        CountryJpaService controladorPers = new CountryJpaService();
        controladorPers.crearPais(pais);
        
        pais = controladorPers.buscarPais("TLT");
        System.out.println(pais.toString());
        
        pais = controladorPers.buscarPais("ALC");
        System.out.println(pais.toString());
        
        controladorPers.eliminarPais("ALC");

    }
    
}
