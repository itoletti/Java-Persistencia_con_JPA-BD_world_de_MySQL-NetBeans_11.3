package Controladores;

import Entidades.Country;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CountryJpaService {
    
    CountryJpaController countryController = new CountryJpaController();
    
    public void crearPais(Country pais){
        try {
            countryController.create(pais);
        } catch (Exception ex) {
            Logger.getLogger(CountryJpaService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarPais(String id){
        try {
            countryController.destroy(id);
        } catch (Exception ex) {
            Logger.getLogger(CountryJpaService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void actualizarPais(Country pais){
        try {
            countryController.edit(pais);
        } catch (Exception ex) {
            Logger.getLogger(CountryJpaService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    public Country buscarPais(String id){
        Country res = null;
        try {
            res = countryController.findCountry(id);
        } catch (Exception ex) {
            Logger.getLogger(CountryJpaService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }            
    
    public List<Country> buscarPais(){
        List<Country> res = null;
        try {
            res = countryController.findCountryEntities();
        } catch (Exception ex) {
            Logger.getLogger(CountryJpaService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }     
}
